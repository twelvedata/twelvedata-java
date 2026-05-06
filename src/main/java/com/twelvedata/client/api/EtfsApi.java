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

import com.twelvedata.client.model.ApiBadRequestErrorResponseBody;
import com.twelvedata.client.model.ApiForbiddenErrorResponseBody;
import com.twelvedata.client.model.ApiInternalServerErrorResponseBody;
import com.twelvedata.client.model.ApiNotFoundErrorResponseBody;
import com.twelvedata.client.model.ApiParameterTooLongErrorResponseBody;
import com.twelvedata.client.model.ApiTooManyRequestsErrorResponseBody;
import com.twelvedata.client.model.ApiUnauthorizedErrorResponseBody;
import com.twelvedata.client.model.GetETFsFamily200Response;
import com.twelvedata.client.model.GetETFsList200Response;
import com.twelvedata.client.model.GetETFsType200Response;
import com.twelvedata.client.model.GetETFsWorld200Response;
import com.twelvedata.client.model.GetETFsWorldComposition200Response;
import com.twelvedata.client.model.GetETFsWorldPerformance200Response;
import com.twelvedata.client.model.GetETFsWorldRisk200Response;
import com.twelvedata.client.model.GetETFsWorldSummary200Response;

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
public class EtfsApi {
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

  public EtfsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EtfsApi(ApiClient apiClient) {
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
   * ETFs families
   * Retrieve a comprehensive list of exchange-traded fund (ETF) families, providing users with detailed information on various ETF groups available in the market. This endpoint is ideal for users looking to explore different ETF categories, compare offerings, or integrate ETF family data into their financial applications.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @return GetETFsFamily200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsFamily200Response getETFsFamily(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily) throws ApiException {
    return getETFsFamily(country, fundFamily, null);
  }

  /**
   * ETFs families
   * Retrieve a comprehensive list of exchange-traded fund (ETF) families, providing users with detailed information on various ETF groups available in the market. This endpoint is ideal for users looking to explore different ETF categories, compare offerings, or integrate ETF family data into their financial applications.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param headers Optional headers to include in the request
   * @return GetETFsFamily200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsFamily200Response getETFsFamily(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsFamily200Response> localVarResponse = getETFsFamilyWithHttpInfo(country, fundFamily, headers);
    return localVarResponse.getData();
  }

  /**
   * ETFs families
   * Retrieve a comprehensive list of exchange-traded fund (ETF) families, providing users with detailed information on various ETF groups available in the market. This endpoint is ideal for users looking to explore different ETF categories, compare offerings, or integrate ETF family data into their financial applications.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @return ApiResponse&lt;GetETFsFamily200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsFamily200Response> getETFsFamilyWithHttpInfo(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily) throws ApiException {
    return getETFsFamilyWithHttpInfo(country, fundFamily, null);
  }

  /**
   * ETFs families
   * Retrieve a comprehensive list of exchange-traded fund (ETF) families, providing users with detailed information on various ETF groups available in the market. This endpoint is ideal for users looking to explore different ETF categories, compare offerings, or integrate ETF family data into their financial applications.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsFamily200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsFamily200Response> getETFsFamilyWithHttpInfo(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsFamilyRequestBuilder(country, fundFamily, headers);
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
          throw getApiException("getETFsFamily", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsFamily200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsFamily200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsFamily200Response>() {});
        

        return new ApiResponse<GetETFsFamily200Response>(
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

  private HttpRequest.Builder getETFsFamilyRequestBuilder(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/family";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "fund_family";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fund_family", fundFamily));

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

  /**
   * ETFs directory
   * The ETFs directory endpoint provides a daily updated list of exchange-traded funds, sorted by total assets in descending order. This endpoint is useful for retrieving comprehensive ETF data, including fund names and asset values, to assist users in quickly identifying the ETFs available.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 50)
   * @return GetETFsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsList200Response getETFsList(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getETFsList(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, page, outputsize, null);
  }

  /**
   * ETFs directory
   * The ETFs directory endpoint provides a daily updated list of exchange-traded funds, sorted by total assets in descending order. This endpoint is useful for retrieving comprehensive ETF data, including fund names and asset values, to assist users in quickly identifying the ETFs available.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 50)
   * @param headers Optional headers to include in the request
   * @return GetETFsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsList200Response getETFsList(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsList200Response> localVarResponse = getETFsListWithHttpInfo(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, page, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * ETFs directory
   * The ETFs directory endpoint provides a daily updated list of exchange-traded funds, sorted by total assets in descending order. This endpoint is useful for retrieving comprehensive ETF data, including fund names and asset values, to assist users in quickly identifying the ETFs available.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 50)
   * @return ApiResponse&lt;GetETFsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsList200Response> getETFsListWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getETFsListWithHttpInfo(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, page, outputsize, null);
  }

  /**
   * ETFs directory
   * The ETFs directory endpoint provides a daily updated list of exchange-traded funds, sorted by total assets in descending order. This endpoint is useful for retrieving comprehensive ETF data, including fund names and asset values, to assist users in quickly identifying the ETFs available.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 50)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsList200Response> getETFsListWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsListRequestBuilder(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, page, outputsize, headers);
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
          throw getApiException("getETFsList", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsList200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsList200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsList200Response>() {});
        

        return new ApiResponse<GetETFsList200Response>(
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

  private HttpRequest.Builder getETFsListRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/list";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "cik";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cik", cik));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "fund_family";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fund_family", fundFamily));
    localVarQueryParameterBaseName = "fund_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fund_type", fundType));
    localVarQueryParameterBaseName = "page";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page", page));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));

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

  /**
   * ETFs types
   * The ETFs Types endpoint provides a concise list of ETF categories by market (e.g., Singapore, United States), including types like \&quot;Equity Precious Metals\&quot; and \&quot;Large Blend.\&quot; It supports targeted investment research and portfolio diversification.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundType Filter by the type of fund (optional)
   * @return GetETFsType200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsType200Response getETFsType(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundType) throws ApiException {
    return getETFsType(country, fundType, null);
  }

  /**
   * ETFs types
   * The ETFs Types endpoint provides a concise list of ETF categories by market (e.g., Singapore, United States), including types like \&quot;Equity Precious Metals\&quot; and \&quot;Large Blend.\&quot; It supports targeted investment research and portfolio diversification.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param headers Optional headers to include in the request
   * @return GetETFsType200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsType200Response getETFsType(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundType, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsType200Response> localVarResponse = getETFsTypeWithHttpInfo(country, fundType, headers);
    return localVarResponse.getData();
  }

  /**
   * ETFs types
   * The ETFs Types endpoint provides a concise list of ETF categories by market (e.g., Singapore, United States), including types like \&quot;Equity Precious Metals\&quot; and \&quot;Large Blend.\&quot; It supports targeted investment research and portfolio diversification.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundType Filter by the type of fund (optional)
   * @return ApiResponse&lt;GetETFsType200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsType200Response> getETFsTypeWithHttpInfo(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundType) throws ApiException {
    return getETFsTypeWithHttpInfo(country, fundType, null);
  }

  /**
   * ETFs types
   * The ETFs Types endpoint provides a concise list of ETF categories by market (e.g., Singapore, United States), including types like \&quot;Equity Precious Metals\&quot; and \&quot;Large Blend.\&quot; It supports targeted investment research and portfolio diversification.
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsType200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsType200Response> getETFsTypeWithHttpInfo(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundType, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsTypeRequestBuilder(country, fundType, headers);
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
          throw getApiException("getETFsType", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsType200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsType200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsType200Response>() {});
        

        return new ApiResponse<GetETFsType200Response>(
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

  private HttpRequest.Builder getETFsTypeRequestBuilder(@javax.annotation.Nullable String country, @javax.annotation.Nullable String fundType, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/type";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "fund_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fund_type", fundType));

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

  /**
   * ETF full data
   * The ETF full data endpoint provides detailed information about global Exchange-Traded Funds. It returns comprehensive data, including a summary, performance metrics, risk assessment, and composition details. This endpoint is ideal for users seeking an in-depth analysis of worldwide ETFs, enabling them to access key financial metrics and portfolio breakdowns.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetETFsWorld200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorld200Response getETFsWorld(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorld(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * ETF full data
   * The ETF full data endpoint provides detailed information about global Exchange-Traded Funds. It returns comprehensive data, including a summary, performance metrics, risk assessment, and composition details. This endpoint is ideal for users seeking an in-depth analysis of worldwide ETFs, enabling them to access key financial metrics and portfolio breakdowns.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetETFsWorld200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorld200Response getETFsWorld(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsWorld200Response> localVarResponse = getETFsWorldWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * ETF full data
   * The ETF full data endpoint provides detailed information about global Exchange-Traded Funds. It returns comprehensive data, including a summary, performance metrics, risk assessment, and composition details. This endpoint is ideal for users seeking an in-depth analysis of worldwide ETFs, enabling them to access key financial metrics and portfolio breakdowns.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetETFsWorld200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorld200Response> getETFsWorldWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * ETF full data
   * The ETF full data endpoint provides detailed information about global Exchange-Traded Funds. It returns comprehensive data, including a summary, performance metrics, risk assessment, and composition details. This endpoint is ideal for users seeking an in-depth analysis of worldwide ETFs, enabling them to access key financial metrics and portfolio breakdowns.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsWorld200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorld200Response> getETFsWorldWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsWorldRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getETFsWorld", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsWorld200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsWorld200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsWorld200Response>() {});
        

        return new ApiResponse<GetETFsWorld200Response>(
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

  private HttpRequest.Builder getETFsWorldRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/world";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));

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

  /**
   * Composition
   * The ETFs composition endpoint provides detailed information about the composition of global Exchange-Traded Funds. It returns data on the sectors included in the ETF, specific holding details, and the weighted exposure of each component. This endpoint is useful for users who need to understand the specific makeup and sector distribution of an ETF portfolio.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetETFsWorldComposition200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldComposition200Response getETFsWorldComposition(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldComposition(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Composition
   * The ETFs composition endpoint provides detailed information about the composition of global Exchange-Traded Funds. It returns data on the sectors included in the ETF, specific holding details, and the weighted exposure of each component. This endpoint is useful for users who need to understand the specific makeup and sector distribution of an ETF portfolio.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetETFsWorldComposition200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldComposition200Response getETFsWorldComposition(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsWorldComposition200Response> localVarResponse = getETFsWorldCompositionWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Composition
   * The ETFs composition endpoint provides detailed information about the composition of global Exchange-Traded Funds. It returns data on the sectors included in the ETF, specific holding details, and the weighted exposure of each component. This endpoint is useful for users who need to understand the specific makeup and sector distribution of an ETF portfolio.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetETFsWorldComposition200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldComposition200Response> getETFsWorldCompositionWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldCompositionWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Composition
   * The ETFs composition endpoint provides detailed information about the composition of global Exchange-Traded Funds. It returns data on the sectors included in the ETF, specific holding details, and the weighted exposure of each component. This endpoint is useful for users who need to understand the specific makeup and sector distribution of an ETF portfolio.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsWorldComposition200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldComposition200Response> getETFsWorldCompositionWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsWorldCompositionRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getETFsWorldComposition", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsWorldComposition200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsWorldComposition200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsWorldComposition200Response>() {});
        

        return new ApiResponse<GetETFsWorldComposition200Response>(
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

  private HttpRequest.Builder getETFsWorldCompositionRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/world/composition";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));

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

  /**
   * Performance
   * The ETFs performance endpoint provides comprehensive performance data for exchange-traded funds globally. It returns detailed metrics such as trailing returns and annual returns, enabling users to evaluate the historical performance of various ETFs. This endpoint is ideal for users looking to compare ETF performance over different time periods and assess their investment potential.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetETFsWorldPerformance200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldPerformance200Response getETFsWorldPerformance(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldPerformance(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Performance
   * The ETFs performance endpoint provides comprehensive performance data for exchange-traded funds globally. It returns detailed metrics such as trailing returns and annual returns, enabling users to evaluate the historical performance of various ETFs. This endpoint is ideal for users looking to compare ETF performance over different time periods and assess their investment potential.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetETFsWorldPerformance200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldPerformance200Response getETFsWorldPerformance(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsWorldPerformance200Response> localVarResponse = getETFsWorldPerformanceWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Performance
   * The ETFs performance endpoint provides comprehensive performance data for exchange-traded funds globally. It returns detailed metrics such as trailing returns and annual returns, enabling users to evaluate the historical performance of various ETFs. This endpoint is ideal for users looking to compare ETF performance over different time periods and assess their investment potential.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetETFsWorldPerformance200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldPerformance200Response> getETFsWorldPerformanceWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldPerformanceWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Performance
   * The ETFs performance endpoint provides comprehensive performance data for exchange-traded funds globally. It returns detailed metrics such as trailing returns and annual returns, enabling users to evaluate the historical performance of various ETFs. This endpoint is ideal for users looking to compare ETF performance over different time periods and assess their investment potential.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsWorldPerformance200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldPerformance200Response> getETFsWorldPerformanceWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsWorldPerformanceRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getETFsWorldPerformance", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsWorldPerformance200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsWorldPerformance200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsWorldPerformance200Response>() {});
        

        return new ApiResponse<GetETFsWorldPerformance200Response>(
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

  private HttpRequest.Builder getETFsWorldPerformanceRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/world/performance";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));

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

  /**
   * Risk
   * The ETFs risk endpoint provides essential risk metrics for global Exchange Traded Funds. It returns data such as volatility, beta, and other risk-related indicators, enabling users to assess the potential risk associated with investing in various ETFs worldwide.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetETFsWorldRisk200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldRisk200Response getETFsWorldRisk(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldRisk(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Risk
   * The ETFs risk endpoint provides essential risk metrics for global Exchange Traded Funds. It returns data such as volatility, beta, and other risk-related indicators, enabling users to assess the potential risk associated with investing in various ETFs worldwide.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetETFsWorldRisk200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldRisk200Response getETFsWorldRisk(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsWorldRisk200Response> localVarResponse = getETFsWorldRiskWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Risk
   * The ETFs risk endpoint provides essential risk metrics for global Exchange Traded Funds. It returns data such as volatility, beta, and other risk-related indicators, enabling users to assess the potential risk associated with investing in various ETFs worldwide.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetETFsWorldRisk200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldRisk200Response> getETFsWorldRiskWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldRiskWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Risk
   * The ETFs risk endpoint provides essential risk metrics for global Exchange Traded Funds. It returns data such as volatility, beta, and other risk-related indicators, enabling users to assess the potential risk associated with investing in various ETFs worldwide.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsWorldRisk200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldRisk200Response> getETFsWorldRiskWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsWorldRiskRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getETFsWorldRisk", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsWorldRisk200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsWorldRisk200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsWorldRisk200Response>() {});
        

        return new ApiResponse<GetETFsWorldRisk200Response>(
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

  private HttpRequest.Builder getETFsWorldRiskRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/world/risk";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));

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

  /**
   * Summary
   * The ETFs summary endpoint provides a concise overview of global Exchange-Traded Funds. It returns key data points such as ETF names, symbols, and current market values, enabling users to quickly assess the performance and status of various international ETFs. This summary is ideal for users who need a snapshot of the global ETF landscape without delving into detailed analysis.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetETFsWorldSummary200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldSummary200Response getETFsWorldSummary(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldSummary(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Summary
   * The ETFs summary endpoint provides a concise overview of global Exchange-Traded Funds. It returns key data points such as ETF names, symbols, and current market values, enabling users to quickly assess the performance and status of various international ETFs. This summary is ideal for users who need a snapshot of the global ETF landscape without delving into detailed analysis.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetETFsWorldSummary200Response
   * @throws ApiException if fails to make API call
   */
  public GetETFsWorldSummary200Response getETFsWorldSummary(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetETFsWorldSummary200Response> localVarResponse = getETFsWorldSummaryWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Summary
   * The ETFs summary endpoint provides a concise overview of global Exchange-Traded Funds. It returns key data points such as ETF names, symbols, and current market values, enabling users to quickly assess the performance and status of various international ETFs. This summary is ideal for users who need a snapshot of the global ETF landscape without delving into detailed analysis.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetETFsWorldSummary200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldSummary200Response> getETFsWorldSummaryWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getETFsWorldSummaryWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Summary
   * The ETFs summary endpoint provides a concise overview of global Exchange-Traded Funds. It returns key data points such as ETF names, symbols, and current market values, enabling users to quickly assess the performance and status of various international ETFs. This summary is ideal for users who need a snapshot of the global ETF landscape without delving into detailed analysis.
   * @param symbol Symbol ticker of etf (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetETFsWorldSummary200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetETFsWorldSummary200Response> getETFsWorldSummaryWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getETFsWorldSummaryRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getETFsWorldSummary", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetETFsWorldSummary200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetETFsWorldSummary200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetETFsWorldSummary200Response>() {});
        

        return new ApiResponse<GetETFsWorldSummary200Response>(
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

  private HttpRequest.Builder getETFsWorldSummaryRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs/world/summary";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));

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

}
