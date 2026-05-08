/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */

package com.twelvedata.client.api;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.Pair;

import com.twelvedata.client.model.Advanced200Response;
import com.twelvedata.client.model.AdvancedRequestValue;
import com.twelvedata.client.model.ApiBadRequestErrorResponseBody;
import com.twelvedata.client.model.ApiForbiddenErrorResponseBody;
import com.twelvedata.client.model.ApiInternalServerErrorResponseBody;
import com.twelvedata.client.model.ApiNotFoundErrorResponseBody;
import com.twelvedata.client.model.ApiParameterTooLongErrorResponseBody;
import com.twelvedata.client.model.ApiTooManyRequestsErrorResponseBody;
import com.twelvedata.client.model.ApiUnauthorizedErrorResponseBody;
import com.twelvedata.client.model.FormatEnum;
import com.twelvedata.client.model.GetApiUsage200Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AdvancedApi {
  /**
   * Utility class for extending HttpRequest.Builder functionality.
   */
  private static class HttpRequestBuilderExtensions {
    /**
     * Adds additional headers to the provided HttpRequest.Builder. Useful for adding method/endpoint specific headers.
     *
     * @param builder the HttpRequest.Builder to which headers will be added
     * @param headers a map of header names and values to add; may be null
     * @return the same HttpRequest.Builder instance with the additional headers set
     */
    static HttpRequest.Builder withAdditionalHeaders(HttpRequest.Builder builder, Map<String, String> headers) {
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.header(entry.getKey(), entry.getValue());
            }
        }
        return builder;
    }
  }
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<InputStream>> memberVarAsyncResponseInterceptor;

  public AdvancedApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdvancedApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }


  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    InputStream responseBody = ApiClient.getResponseBody(response);
    String body = null;
    try {
      body = responseBody == null ? null : new String(responseBody.readAllBytes());
    } finally {
      if (responseBody != null) {
        responseBody.close();
      }
    }
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Download file from the given response.
   *
   * @param response Response
   * @return File
   * @throws ApiException If fail to read file content from response and write to disk
   */
  public File downloadFileFromResponse(HttpResponse<InputStream> response, InputStream responseBody) throws ApiException {
    if (responseBody == null) {
      throw new ApiException(new IOException("Response body is empty"));
    }
    try {
      File file = prepareDownloadFile(response);
      java.nio.file.Files.copy(responseBody, file.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  /**
   * <p>Prepare the file for download from the response.</p>
   *
   * @param response a {@link java.net.http.HttpResponse} object.
   * @return a {@link java.io.File} object.
   * @throws java.io.IOException if any.
   */
  private File prepareDownloadFile(HttpResponse<InputStream> response) throws IOException {
    String filename = null;
    java.util.Optional<String> contentDisposition = response.headers().firstValue("Content-Disposition");
    if (contentDisposition.isPresent() && !"".equals(contentDisposition.get())) {
      // Get filename from the Content-Disposition header.
      java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      java.util.regex.Matcher matcher = pattern.matcher(contentDisposition.get());
      if (matcher.find())
        filename = matcher.group(1);
    }
    File file = null;
    if (filename != null) {
      java.nio.file.Path tempDir = java.nio.file.Files.createTempDirectory("swagger-gen-native");
      java.nio.file.Path filePath = java.nio.file.Files.createFile(tempDir.resolve(filename));
      file = filePath.toFile();
      tempDir.toFile().deleteOnExit();   // best effort cleanup
      file.deleteOnExit(); // best effort cleanup
    } else {
      file = java.nio.file.Files.createTempFile("download-", "").toFile();
      file.deleteOnExit(); // best effort cleanup
    }
    return file;
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param apiRequest {@link APIAdvancedRequest}
   * @return Advanced200Response
   * @throws ApiException if fails to make API call
   */
  public Advanced200Response advanced(APIAdvancedRequest apiRequest) throws ApiException {
    return advanced(apiRequest, null);
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param apiRequest {@link APIAdvancedRequest}
   * @param headers Optional headers to include in the request
   * @return Advanced200Response
   * @throws ApiException if fails to make API call
   */
  public Advanced200Response advanced(APIAdvancedRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    Map<String, AdvancedRequestValue> key = apiRequest.key();
    return advanced(key, headers);
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param apiRequest {@link APIAdvancedRequest}
   * @return ApiResponse&lt;Advanced200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Advanced200Response> advancedWithHttpInfo(APIAdvancedRequest apiRequest) throws ApiException {
    return advancedWithHttpInfo(apiRequest, null);
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param apiRequest {@link APIAdvancedRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;Advanced200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Advanced200Response> advancedWithHttpInfo(APIAdvancedRequest apiRequest, Map<String, String> headers) throws ApiException {
    Map<String, AdvancedRequestValue> key = apiRequest.key();
    return advancedWithHttpInfo(key, headers);
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param key Map of requests (optional)
   * @return Advanced200Response
   * @throws ApiException if fails to make API call
   */
  public Advanced200Response advanced(@javax.annotation.Nullable Map<String, AdvancedRequestValue> key) throws ApiException {
    return advanced(key, null);
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param key Map of requests (optional)
   * @param headers Optional headers to include in the request
   * @return Advanced200Response
   * @throws ApiException if fails to make API call
   */
  public Advanced200Response advanced(@javax.annotation.Nullable Map<String, AdvancedRequestValue> key, Map<String, String> headers) throws ApiException {
    ApiResponse<Advanced200Response> localVarResponse = advancedWithHttpInfo(key, headers);
    return localVarResponse.getData();
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param key Map of requests (optional)
   * @return ApiResponse&lt;Advanced200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Advanced200Response> advancedWithHttpInfo(@javax.annotation.Nullable Map<String, AdvancedRequestValue> key) throws ApiException {
    return advancedWithHttpInfo(key, null);
  }

  /**
   * Batches
   * The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;
   * @param key Map of requests (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;Advanced200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Advanced200Response> advancedWithHttpInfo(@javax.annotation.Nullable Map<String, AdvancedRequestValue> key, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = advancedRequestBuilder(key, headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("advanced", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<Advanced200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        Advanced200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<Advanced200Response>() {});
        

        return new ApiResponse<Advanced200Response>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder advancedRequestBuilder(@javax.annotation.Nullable Map<String, AdvancedRequestValue> key, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/batch";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(key);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    // Add custom headers if provided
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }


  public static final class APIAdvancedRequest {
    @javax.annotation.Nullable
    private Map<String, AdvancedRequestValue> key; // Map of requests (optional)

    private APIAdvancedRequest(Builder builder) {
      this.key = builder.key;
    }
    @javax.annotation.Nullable
    public Map<String, AdvancedRequestValue> key() {
      return key;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, AdvancedRequestValue> key;

      public Builder key(@javax.annotation.Nullable Map<String, AdvancedRequestValue> key) {
        this.key = key;
        return this;
      }
      public APIAdvancedRequest build() {
        return new APIAdvancedRequest(this);
      }
    }
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param apiRequest {@link APIGetApiUsageRequest}
   * @return GetApiUsage200Response
   * @throws ApiException if fails to make API call
   */
  public GetApiUsage200Response getApiUsage(APIGetApiUsageRequest apiRequest) throws ApiException {
    return getApiUsage(apiRequest, null);
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param apiRequest {@link APIGetApiUsageRequest}
   * @param headers Optional headers to include in the request
   * @return GetApiUsage200Response
   * @throws ApiException if fails to make API call
   */
  public GetApiUsage200Response getApiUsage(APIGetApiUsageRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    String timezone = apiRequest.timezone();
    return getApiUsage(format, delimiter, timezone, headers);
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param apiRequest {@link APIGetApiUsageRequest}
   * @return ApiResponse&lt;GetApiUsage200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetApiUsage200Response> getApiUsageWithHttpInfo(APIGetApiUsageRequest apiRequest) throws ApiException {
    return getApiUsageWithHttpInfo(apiRequest, null);
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param apiRequest {@link APIGetApiUsageRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetApiUsage200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetApiUsage200Response> getApiUsageWithHttpInfo(APIGetApiUsageRequest apiRequest, Map<String, String> headers) throws ApiException {
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    String timezone = apiRequest.timezone();
    return getApiUsageWithHttpInfo(format, delimiter, timezone, headers);
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param format Output format (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;2. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to UTC)
   * @return GetApiUsage200Response
   * @throws ApiException if fails to make API call
   */
  public GetApiUsage200Response getApiUsage(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String timezone) throws ApiException {
    return getApiUsage(format, delimiter, timezone, null);
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param format Output format (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;2. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to UTC)
   * @param headers Optional headers to include in the request
   * @return GetApiUsage200Response
   * @throws ApiException if fails to make API call
   */
  public GetApiUsage200Response getApiUsage(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    ApiResponse<GetApiUsage200Response> localVarResponse = getApiUsageWithHttpInfo(format, delimiter, timezone, headers);
    return localVarResponse.getData();
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param format Output format (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;2. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to UTC)
   * @return ApiResponse&lt;GetApiUsage200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetApiUsage200Response> getApiUsageWithHttpInfo(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String timezone) throws ApiException {
    return getApiUsageWithHttpInfo(format, delimiter, timezone, null);
  }

  /**
   * API usage
   * The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.
   * @param format Output format (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;2. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to UTC)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetApiUsage200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetApiUsage200Response> getApiUsageWithHttpInfo(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getApiUsageRequestBuilder(format, delimiter, timezone, headers);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      InputStream localVarResponseBody = null;
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getApiUsage", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetApiUsage200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetApiUsage200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetApiUsage200Response>() {});
        

        return new ApiResponse<GetApiUsage200Response>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseValue
        );
      } finally {
        if (localVarResponseBody != null) {
          localVarResponseBody.close();
        }
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getApiUsageRequestBuilder(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api_usage";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "timezone";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timezone", timezone));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    // Add custom headers if provided
    localVarRequestBuilder = HttpRequestBuilderExtensions.withAdditionalHeaders(localVarRequestBuilder, headers);
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }


  public static final class APIGetApiUsageRequest {
    @javax.annotation.Nullable
    private FormatEnum format; // Output format (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // Specify the delimiter used when downloading the CSV file (optional, default to ;)
    @javax.annotation.Nullable
    private String timezone; // Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;2. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to UTC)

    private APIGetApiUsageRequest(Builder builder) {
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.timezone = builder.timezone;
    }
    @javax.annotation.Nullable
    public FormatEnum format() {
      return format;
    }
    @javax.annotation.Nullable
    public String delimiter() {
      return delimiter;
    }
    @javax.annotation.Nullable
    public String timezone() {
      return timezone;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private FormatEnum format;
      private String delimiter;
      private String timezone;

      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public Builder timezone(@javax.annotation.Nullable String timezone) {
        this.timezone = timezone;
        return this;
      }
      public APIGetApiUsageRequest build() {
        return new APIGetApiUsageRequest(this);
      }
    }
  }

}
