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
import com.twelvedata.client.model.FormatEnum;
import com.twelvedata.client.model.GetCurrencyConversion200Response;
import com.twelvedata.client.model.GetExchangeRate200Response;

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
public class CurrenciesApi {
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

  public CurrenciesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CurrenciesApi(ApiClient apiClient) {
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
   * Currency conversion
   * The currency conversion endpoint provides real-time exchange rates and calculates the converted amount for specified currency pairs, including both forex and cryptocurrencies. This endpoint is useful for obtaining up-to-date conversion values between two currencies, facilitating tasks such as financial reporting, e-commerce transactions, and travel budgeting.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param amount Amount of base currency to be converted into quote currency. Supports values in the range from &#x60;0&#x60; and above (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @return GetCurrencyConversion200Response
   * @throws ApiException if fails to make API call
   */
  public GetCurrencyConversion200Response getCurrencyConversion(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull Double amount, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getCurrencyConversion(symbol, amount, date, format, delimiter, dp, timezone, null);
  }

  /**
   * Currency conversion
   * The currency conversion endpoint provides real-time exchange rates and calculates the converted amount for specified currency pairs, including both forex and cryptocurrencies. This endpoint is useful for obtaining up-to-date conversion values between two currencies, facilitating tasks such as financial reporting, e-commerce transactions, and travel budgeting.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param amount Amount of base currency to be converted into quote currency. Supports values in the range from &#x60;0&#x60; and above (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return GetCurrencyConversion200Response
   * @throws ApiException if fails to make API call
   */
  public GetCurrencyConversion200Response getCurrencyConversion(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull Double amount, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCurrencyConversion200Response> localVarResponse = getCurrencyConversionWithHttpInfo(symbol, amount, date, format, delimiter, dp, timezone, headers);
    return localVarResponse.getData();
  }

  /**
   * Currency conversion
   * The currency conversion endpoint provides real-time exchange rates and calculates the converted amount for specified currency pairs, including both forex and cryptocurrencies. This endpoint is useful for obtaining up-to-date conversion values between two currencies, facilitating tasks such as financial reporting, e-commerce transactions, and travel budgeting.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param amount Amount of base currency to be converted into quote currency. Supports values in the range from &#x60;0&#x60; and above (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @return ApiResponse&lt;GetCurrencyConversion200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCurrencyConversion200Response> getCurrencyConversionWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull Double amount, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getCurrencyConversionWithHttpInfo(symbol, amount, date, format, delimiter, dp, timezone, null);
  }

  /**
   * Currency conversion
   * The currency conversion endpoint provides real-time exchange rates and calculates the converted amount for specified currency pairs, including both forex and cryptocurrencies. This endpoint is useful for obtaining up-to-date conversion values between two currencies, facilitating tasks such as financial reporting, e-commerce transactions, and travel budgeting.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param amount Amount of base currency to be converted into quote currency. Supports values in the range from &#x60;0&#x60; and above (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCurrencyConversion200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCurrencyConversion200Response> getCurrencyConversionWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull Double amount, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCurrencyConversionRequestBuilder(symbol, amount, date, format, delimiter, dp, timezone, headers);
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
          throw getApiException("getCurrencyConversion", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCurrencyConversion200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCurrencyConversion200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCurrencyConversion200Response>() {});
        

        return new ApiResponse<GetCurrencyConversion200Response>(
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

  private HttpRequest.Builder getCurrencyConversionRequestBuilder(@javax.annotation.Nonnull String symbol, @javax.annotation.Nonnull Double amount, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getCurrencyConversion");
    }
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling getCurrencyConversion");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/currency_conversion";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "amount";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("amount", amount));
    localVarQueryParameterBaseName = "date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("date", date));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));
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

  /**
   * Exchange rate
   * The exchange rate endpoint provides real-time exchange rates for specified currency pairs, including both forex and cryptocurrency. It returns the current exchange rate value between two currencies, allowing users to quickly access up-to-date conversion rates for financial transactions or market analysis.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @return GetExchangeRate200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchangeRate200Response getExchangeRate(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getExchangeRate(symbol, date, format, delimiter, dp, timezone, null);
  }

  /**
   * Exchange rate
   * The exchange rate endpoint provides real-time exchange rates for specified currency pairs, including both forex and cryptocurrency. It returns the current exchange rate value between two currencies, allowing users to quickly access up-to-date conversion rates for financial transactions or market analysis.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return GetExchangeRate200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchangeRate200Response getExchangeRate(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    ApiResponse<GetExchangeRate200Response> localVarResponse = getExchangeRateWithHttpInfo(symbol, date, format, delimiter, dp, timezone, headers);
    return localVarResponse.getData();
  }

  /**
   * Exchange rate
   * The exchange rate endpoint provides real-time exchange rates for specified currency pairs, including both forex and cryptocurrency. It returns the current exchange rate value between two currencies, allowing users to quickly access up-to-date conversion rates for financial transactions or market analysis.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @return ApiResponse&lt;GetExchangeRate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchangeRate200Response> getExchangeRateWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getExchangeRateWithHttpInfo(symbol, date, format, delimiter, dp, timezone, null);
  }

  /**
   * Exchange rate
   * The exchange rate endpoint provides real-time exchange rates for specified currency pairs, including both forex and cryptocurrency. It returns the current exchange rate value between two currencies, allowing users to quickly access up-to-date conversion rates for financial transactions or market analysis.
   * @param symbol The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct (required)
   * @param date If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone (optional)
   * @param format Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; (optional, default to ;)
   * @param dp The number of decimal places for the data (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetExchangeRate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchangeRate200Response> getExchangeRateWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getExchangeRateRequestBuilder(symbol, date, format, delimiter, dp, timezone, headers);
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
          throw getApiException("getExchangeRate", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetExchangeRate200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetExchangeRate200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetExchangeRate200Response>() {});
        

        return new ApiResponse<GetExchangeRate200Response>(
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

  private HttpRequest.Builder getExchangeRateRequestBuilder(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String date, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getExchangeRate");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/exchange_rate";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("date", date));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));
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

}
