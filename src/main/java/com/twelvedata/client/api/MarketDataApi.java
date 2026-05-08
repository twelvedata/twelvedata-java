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

import com.twelvedata.client.model.AdjustEnum;
import com.twelvedata.client.model.ApiBadRequestErrorResponseBody;
import com.twelvedata.client.model.ApiForbiddenErrorResponseBody;
import com.twelvedata.client.model.ApiInternalServerErrorResponseBody;
import com.twelvedata.client.model.ApiNotFoundErrorResponseBody;
import com.twelvedata.client.model.ApiParameterTooLongErrorResponseBody;
import com.twelvedata.client.model.ApiTooManyRequestsErrorResponseBody;
import com.twelvedata.client.model.ApiUnauthorizedErrorResponseBody;
import com.twelvedata.client.model.DirectionEnum;
import com.twelvedata.client.model.FormatEnum;
import com.twelvedata.client.model.GetEod200Response;
import com.twelvedata.client.model.GetPrice200Response;
import com.twelvedata.client.model.GetQuote200Response;
import com.twelvedata.client.model.GetTimeSeries200Response;
import com.twelvedata.client.model.GetTimeSeriesCross200Response;
import com.twelvedata.client.model.IntervalEnum;
import com.twelvedata.client.model.MarketEnum;
import com.twelvedata.client.model.MarketMoversResponseBody;
import com.twelvedata.client.model.OrderEnum;
import com.twelvedata.client.model.TypeEnum;

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
public class MarketDataApi {
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

  public MarketDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketDataApi(ApiClient apiClient) {
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
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param apiRequest {@link APIGetEodRequest}
   * @return GetEod200Response
   * @throws ApiException if fails to make API call
   */
  public GetEod200Response getEod(APIGetEodRequest apiRequest) throws ApiException {
    return getEod(apiRequest, null);
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param apiRequest {@link APIGetEodRequest}
   * @param headers Optional headers to include in the request
   * @return GetEod200Response
   * @throws ApiException if fails to make API call
   */
  public GetEod200Response getEod(APIGetEodRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    TypeEnum type = apiRequest.type();
    @javax.annotation.Nullable
    String date = apiRequest.date();
    @javax.annotation.Nullable
    Boolean prepost = apiRequest.prepost();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    return getEod(symbol, figi, isin, cusip, exchange, micCode, country, type, date, prepost, dp, headers);
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param apiRequest {@link APIGetEodRequest}
   * @return ApiResponse&lt;GetEod200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEod200Response> getEodWithHttpInfo(APIGetEodRequest apiRequest) throws ApiException {
    return getEodWithHttpInfo(apiRequest, null);
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param apiRequest {@link APIGetEodRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEod200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEod200Response> getEodWithHttpInfo(APIGetEodRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    TypeEnum type = apiRequest.type();
    String date = apiRequest.date();
    Boolean prepost = apiRequest.prepost();
    Long dp = apiRequest.dp();
    return getEodWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, date, prepost, dp, headers);
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param date If not null, then return data from a specific date (optional)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @return GetEod200Response
   * @throws ApiException if fails to make API call
   */
  public GetEod200Response getEod(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String date, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp) throws ApiException {
    return getEod(symbol, figi, isin, cusip, exchange, micCode, country, type, date, prepost, dp, null);
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param date If not null, then return data from a specific date (optional)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetEod200Response
   * @throws ApiException if fails to make API call
   */
  public GetEod200Response getEod(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String date, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEod200Response> localVarResponse = getEodWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, date, prepost, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param date If not null, then return data from a specific date (optional)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @return ApiResponse&lt;GetEod200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEod200Response> getEodWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String date, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp) throws ApiException {
    return getEodWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, date, prepost, dp, null);
  }

  /**
   * End of day price
   * The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param date If not null, then return data from a specific date (optional)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEod200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEod200Response> getEodWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String date, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEodRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, type, date, prepost, dp, headers);
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
          throw getApiException("getEod", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEod200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEod200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEod200Response>() {});
        

        return new ApiResponse<GetEod200Response>(
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

  private HttpRequest.Builder getEodRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String date, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/eod";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParameterBaseName = "date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("date", date));
    localVarQueryParameterBaseName = "prepost";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("prepost", prepost));
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


  public static final class APIGetEodRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of the instrument (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private TypeEnum type; // The asset class to which the instrument belongs (optional)
    @javax.annotation.Nullable
    private String date; // If not null, then return data from a specific date (optional)
    @javax.annotation.Nullable
    private Boolean prepost; // Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
    @javax.annotation.Nullable
    private Long dp; // Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)

    private APIGetEodRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.type = builder.type;
      this.date = builder.date;
      this.prepost = builder.prepost;
      this.dp = builder.dp;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String figi() {
      return figi;
    }
    @javax.annotation.Nullable
    public String isin() {
      return isin;
    }
    @javax.annotation.Nullable
    public String cusip() {
      return cusip;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public TypeEnum type() {
      return type;
    }
    @javax.annotation.Nullable
    public String date() {
      return date;
    }
    @javax.annotation.Nullable
    public Boolean prepost() {
      return prepost;
    }
    @javax.annotation.Nullable
    public Long dp() {
      return dp;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String exchange;
      private String micCode;
      private String country;
      private TypeEnum type;
      private String date;
      private Boolean prepost;
      private Long dp;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder figi(@javax.annotation.Nullable String figi) {
        this.figi = figi;
        return this;
      }
      public Builder isin(@javax.annotation.Nullable String isin) {
        this.isin = isin;
        return this;
      }
      public Builder cusip(@javax.annotation.Nullable String cusip) {
        this.cusip = cusip;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
      }
      public Builder date(@javax.annotation.Nullable String date) {
        this.date = date;
        return this;
      }
      public Builder prepost(@javax.annotation.Nullable Boolean prepost) {
        this.prepost = prepost;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public APIGetEodRequest build() {
        return new APIGetEodRequest(this);
      }
    }
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param apiRequest {@link APIGetMarketMoversRequest}
   * @return MarketMoversResponseBody
   * @throws ApiException if fails to make API call
   */
  public MarketMoversResponseBody getMarketMovers(APIGetMarketMoversRequest apiRequest) throws ApiException {
    return getMarketMovers(apiRequest, null);
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param apiRequest {@link APIGetMarketMoversRequest}
   * @param headers Optional headers to include in the request
   * @return MarketMoversResponseBody
   * @throws ApiException if fails to make API call
   */
  public MarketMoversResponseBody getMarketMovers(APIGetMarketMoversRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    MarketEnum market = apiRequest.market();
    @javax.annotation.Nullable
    DirectionEnum direction = apiRequest.direction();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String priceGreaterThan = apiRequest.priceGreaterThan();
    @javax.annotation.Nullable
    String dp = apiRequest.dp();
    return getMarketMovers(market, direction, outputsize, country, priceGreaterThan, dp, headers);
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param apiRequest {@link APIGetMarketMoversRequest}
   * @return ApiResponse&lt;MarketMoversResponseBody&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MarketMoversResponseBody> getMarketMoversWithHttpInfo(APIGetMarketMoversRequest apiRequest) throws ApiException {
    return getMarketMoversWithHttpInfo(apiRequest, null);
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param apiRequest {@link APIGetMarketMoversRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;MarketMoversResponseBody&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MarketMoversResponseBody> getMarketMoversWithHttpInfo(APIGetMarketMoversRequest apiRequest, Map<String, String> headers) throws ApiException {
    MarketEnum market = apiRequest.market();
    DirectionEnum direction = apiRequest.direction();
    Long outputsize = apiRequest.outputsize();
    String country = apiRequest.country();
    String priceGreaterThan = apiRequest.priceGreaterThan();
    String dp = apiRequest.dp();
    return getMarketMoversWithHttpInfo(market, direction, outputsize, country, priceGreaterThan, dp, headers);
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param market Maket type (required)
   * @param direction Specifies direction of the snapshot gainers or losers (optional, default to gainers)
   * @param outputsize Specifies the size of the snapshot. Can be in a range from &#x60;1&#x60; to &#x60;50&#x60; (optional, default to 30)
   * @param country Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code (optional, default to USA)
   * @param priceGreaterThan Takes values with price grater than specified value (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @return MarketMoversResponseBody
   * @throws ApiException if fails to make API call
   */
  public MarketMoversResponseBody getMarketMovers(@javax.annotation.Nonnull MarketEnum market, @javax.annotation.Nullable DirectionEnum direction, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, @javax.annotation.Nullable String priceGreaterThan, @javax.annotation.Nullable String dp) throws ApiException {
    return getMarketMovers(market, direction, outputsize, country, priceGreaterThan, dp, null);
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param market Maket type (required)
   * @param direction Specifies direction of the snapshot gainers or losers (optional, default to gainers)
   * @param outputsize Specifies the size of the snapshot. Can be in a range from &#x60;1&#x60; to &#x60;50&#x60; (optional, default to 30)
   * @param country Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code (optional, default to USA)
   * @param priceGreaterThan Takes values with price grater than specified value (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return MarketMoversResponseBody
   * @throws ApiException if fails to make API call
   */
  public MarketMoversResponseBody getMarketMovers(@javax.annotation.Nonnull MarketEnum market, @javax.annotation.Nullable DirectionEnum direction, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, @javax.annotation.Nullable String priceGreaterThan, @javax.annotation.Nullable String dp, Map<String, String> headers) throws ApiException {
    ApiResponse<MarketMoversResponseBody> localVarResponse = getMarketMoversWithHttpInfo(market, direction, outputsize, country, priceGreaterThan, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param market Maket type (required)
   * @param direction Specifies direction of the snapshot gainers or losers (optional, default to gainers)
   * @param outputsize Specifies the size of the snapshot. Can be in a range from &#x60;1&#x60; to &#x60;50&#x60; (optional, default to 30)
   * @param country Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code (optional, default to USA)
   * @param priceGreaterThan Takes values with price grater than specified value (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @return ApiResponse&lt;MarketMoversResponseBody&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MarketMoversResponseBody> getMarketMoversWithHttpInfo(@javax.annotation.Nonnull MarketEnum market, @javax.annotation.Nullable DirectionEnum direction, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, @javax.annotation.Nullable String priceGreaterThan, @javax.annotation.Nullable String dp) throws ApiException {
    return getMarketMoversWithHttpInfo(market, direction, outputsize, country, priceGreaterThan, dp, null);
  }

  /**
   * Market movers
   * The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.
   * @param market Maket type (required)
   * @param direction Specifies direction of the snapshot gainers or losers (optional, default to gainers)
   * @param outputsize Specifies the size of the snapshot. Can be in a range from &#x60;1&#x60; to &#x60;50&#x60; (optional, default to 30)
   * @param country Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code (optional, default to USA)
   * @param priceGreaterThan Takes values with price grater than specified value (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;MarketMoversResponseBody&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MarketMoversResponseBody> getMarketMoversWithHttpInfo(@javax.annotation.Nonnull MarketEnum market, @javax.annotation.Nullable DirectionEnum direction, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, @javax.annotation.Nullable String priceGreaterThan, @javax.annotation.Nullable String dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMarketMoversRequestBuilder(market, direction, outputsize, country, priceGreaterThan, dp, headers);
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
          throw getApiException("getMarketMovers", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<MarketMoversResponseBody>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        MarketMoversResponseBody responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<MarketMoversResponseBody>() {});
        

        return new ApiResponse<MarketMoversResponseBody>(
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

  private HttpRequest.Builder getMarketMoversRequestBuilder(@javax.annotation.Nonnull MarketEnum market, @javax.annotation.Nullable DirectionEnum direction, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, @javax.annotation.Nullable String priceGreaterThan, @javax.annotation.Nullable String dp, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'market' is set
    if (market == null) {
      throw new ApiException(400, "Missing the required parameter 'market' when calling getMarketMovers");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/market_movers/{market}"
        .replace("{market}", ApiClient.urlEncode(market.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "direction";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("direction", direction));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "price_greater_than";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("price_greater_than", priceGreaterThan));
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


  public static final class APIGetMarketMoversRequest {
    @javax.annotation.Nonnull
    private MarketEnum market; // Maket type (required)
    @javax.annotation.Nullable
    private DirectionEnum direction; // Specifies direction of the snapshot gainers or losers (optional, default to gainers)
    @javax.annotation.Nullable
    private Long outputsize; // Specifies the size of the snapshot. Can be in a range from &#x60;1&#x60; to &#x60;50&#x60; (optional, default to 30)
    @javax.annotation.Nullable
    private String country; // Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code (optional, default to USA)
    @javax.annotation.Nullable
    private String priceGreaterThan; // Takes values with price grater than specified value (optional)
    @javax.annotation.Nullable
    private String dp; // Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)

    private APIGetMarketMoversRequest(Builder builder) {
      this.market = builder.market;
      this.direction = builder.direction;
      this.outputsize = builder.outputsize;
      this.country = builder.country;
      this.priceGreaterThan = builder.priceGreaterThan;
      this.dp = builder.dp;
    }
    @javax.annotation.Nonnull
    public MarketEnum market() {
      return market;
    }
    @javax.annotation.Nullable
    public DirectionEnum direction() {
      return direction;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String priceGreaterThan() {
      return priceGreaterThan;
    }
    @javax.annotation.Nullable
    public String dp() {
      return dp;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private MarketEnum market;
      private DirectionEnum direction;
      private Long outputsize;
      private String country;
      private String priceGreaterThan;
      private String dp;

      public Builder market(@javax.annotation.Nonnull MarketEnum market) {
        this.market = market;
        return this;
      }
      public Builder direction(@javax.annotation.Nullable DirectionEnum direction) {
        this.direction = direction;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder priceGreaterThan(@javax.annotation.Nullable String priceGreaterThan) {
        this.priceGreaterThan = priceGreaterThan;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable String dp) {
        this.dp = dp;
        return this;
      }
      public APIGetMarketMoversRequest build() {
        return new APIGetMarketMoversRequest(this);
      }
    }
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param apiRequest {@link APIGetPriceRequest}
   * @return GetPrice200Response
   * @throws ApiException if fails to make API call
   */
  public GetPrice200Response getPrice(APIGetPriceRequest apiRequest) throws ApiException {
    return getPrice(apiRequest, null);
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param apiRequest {@link APIGetPriceRequest}
   * @param headers Optional headers to include in the request
   * @return GetPrice200Response
   * @throws ApiException if fails to make API call
   */
  public GetPrice200Response getPrice(APIGetPriceRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    TypeEnum type = apiRequest.type();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean prepost = apiRequest.prepost();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    return getPrice(symbol, figi, isin, cusip, exchange, micCode, country, type, format, delimiter, prepost, dp, headers);
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param apiRequest {@link APIGetPriceRequest}
   * @return ApiResponse&lt;GetPrice200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPrice200Response> getPriceWithHttpInfo(APIGetPriceRequest apiRequest) throws ApiException {
    return getPriceWithHttpInfo(apiRequest, null);
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param apiRequest {@link APIGetPriceRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetPrice200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPrice200Response> getPriceWithHttpInfo(APIGetPriceRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    TypeEnum type = apiRequest.type();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean prepost = apiRequest.prepost();
    Long dp = apiRequest.dp();
    return getPriceWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, format, delimiter, prepost, dp, headers);
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for Pro or Venture, and above plans. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @return GetPrice200Response
   * @throws ApiException if fails to make API call
   */
  public GetPrice200Response getPrice(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp) throws ApiException {
    return getPrice(symbol, figi, isin, cusip, exchange, micCode, country, type, format, delimiter, prepost, dp, null);
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for Pro or Venture, and above plans. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetPrice200Response
   * @throws ApiException if fails to make API call
   */
  public GetPrice200Response getPrice(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetPrice200Response> localVarResponse = getPriceWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, format, delimiter, prepost, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for Pro or Venture, and above plans. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @return ApiResponse&lt;GetPrice200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPrice200Response> getPriceWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp) throws ApiException {
    return getPriceWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, format, delimiter, prepost, dp, null);
  }

  /**
   * Latest price
   * The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for Pro or Venture, and above plans. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetPrice200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPrice200Response> getPriceWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getPriceRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, type, format, delimiter, prepost, dp, headers);
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
          throw getApiException("getPrice", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetPrice200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetPrice200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetPrice200Response>() {});
        

        return new ApiResponse<GetPrice200Response>(
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

  private HttpRequest.Builder getPriceRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/price";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "prepost";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("prepost", prepost));
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


  public static final class APIGetPriceRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of the instrument (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private TypeEnum type; // The asset class to which the instrument belongs (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // Value can be JSON or CSV (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // Specify the delimiter used when downloading the CSV file (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean prepost; // Parameter is optional. Only for Pro or Venture, and above plans. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
    @javax.annotation.Nullable
    private Long dp; // Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)

    private APIGetPriceRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.type = builder.type;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.prepost = builder.prepost;
      this.dp = builder.dp;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String figi() {
      return figi;
    }
    @javax.annotation.Nullable
    public String isin() {
      return isin;
    }
    @javax.annotation.Nullable
    public String cusip() {
      return cusip;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public TypeEnum type() {
      return type;
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
    public Boolean prepost() {
      return prepost;
    }
    @javax.annotation.Nullable
    public Long dp() {
      return dp;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String exchange;
      private String micCode;
      private String country;
      private TypeEnum type;
      private FormatEnum format;
      private String delimiter;
      private Boolean prepost;
      private Long dp;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder figi(@javax.annotation.Nullable String figi) {
        this.figi = figi;
        return this;
      }
      public Builder isin(@javax.annotation.Nullable String isin) {
        this.isin = isin;
        return this;
      }
      public Builder cusip(@javax.annotation.Nullable String cusip) {
        this.cusip = cusip;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
      }
      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public Builder prepost(@javax.annotation.Nullable Boolean prepost) {
        this.prepost = prepost;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public APIGetPriceRequest build() {
        return new APIGetPriceRequest(this);
      }
    }
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param apiRequest {@link APIGetQuoteRequest}
   * @return GetQuote200Response
   * @throws ApiException if fails to make API call
   */
  public GetQuote200Response getQuote(APIGetQuoteRequest apiRequest) throws ApiException {
    return getQuote(apiRequest, null);
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param apiRequest {@link APIGetQuoteRequest}
   * @param headers Optional headers to include in the request
   * @return GetQuote200Response
   * @throws ApiException if fails to make API call
   */
  public GetQuote200Response getQuote(APIGetQuoteRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    IntervalEnum interval = apiRequest.interval();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    Long volumeTimePeriod = apiRequest.volumeTimePeriod();
    @javax.annotation.Nullable
    TypeEnum type = apiRequest.type();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean prepost = apiRequest.prepost();
    @javax.annotation.Nullable
    Boolean eod = apiRequest.eod();
    @javax.annotation.Nullable
    Long rollingPeriod = apiRequest.rollingPeriod();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    @javax.annotation.Nullable
    String timezone = apiRequest.timezone();
    return getQuote(symbol, figi, isin, cusip, interval, exchange, micCode, country, volumeTimePeriod, type, format, delimiter, prepost, eod, rollingPeriod, dp, timezone, headers);
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param apiRequest {@link APIGetQuoteRequest}
   * @return ApiResponse&lt;GetQuote200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetQuote200Response> getQuoteWithHttpInfo(APIGetQuoteRequest apiRequest) throws ApiException {
    return getQuoteWithHttpInfo(apiRequest, null);
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param apiRequest {@link APIGetQuoteRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetQuote200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetQuote200Response> getQuoteWithHttpInfo(APIGetQuoteRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    IntervalEnum interval = apiRequest.interval();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    Long volumeTimePeriod = apiRequest.volumeTimePeriod();
    TypeEnum type = apiRequest.type();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean prepost = apiRequest.prepost();
    Boolean eod = apiRequest.eod();
    Long rollingPeriod = apiRequest.rollingPeriod();
    Long dp = apiRequest.dp();
    String timezone = apiRequest.timezone();
    return getQuoteWithHttpInfo(symbol, figi, isin, cusip, interval, exchange, micCode, country, volumeTimePeriod, type, format, delimiter, prepost, eod, rollingPeriod, dp, timezone, headers);
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param interval Interval of the quote (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param volumeTimePeriod Number of periods for Average Volume (optional, default to 9)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV Default JSON (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param eod If true, then return data for closed day (optional, default to false)
   * @param rollingPeriod Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168]. (optional, default to 24)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @return GetQuote200Response
   * @throws ApiException if fails to make API call
   */
  public GetQuote200Response getQuote(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable IntervalEnum interval, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long volumeTimePeriod, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Boolean eod, @javax.annotation.Nullable Long rollingPeriod, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getQuote(symbol, figi, isin, cusip, interval, exchange, micCode, country, volumeTimePeriod, type, format, delimiter, prepost, eod, rollingPeriod, dp, timezone, null);
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param interval Interval of the quote (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param volumeTimePeriod Number of periods for Average Volume (optional, default to 9)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV Default JSON (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param eod If true, then return data for closed day (optional, default to false)
   * @param rollingPeriod Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168]. (optional, default to 24)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param headers Optional headers to include in the request
   * @return GetQuote200Response
   * @throws ApiException if fails to make API call
   */
  public GetQuote200Response getQuote(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable IntervalEnum interval, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long volumeTimePeriod, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Boolean eod, @javax.annotation.Nullable Long rollingPeriod, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    ApiResponse<GetQuote200Response> localVarResponse = getQuoteWithHttpInfo(symbol, figi, isin, cusip, interval, exchange, micCode, country, volumeTimePeriod, type, format, delimiter, prepost, eod, rollingPeriod, dp, timezone, headers);
    return localVarResponse.getData();
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param interval Interval of the quote (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param volumeTimePeriod Number of periods for Average Volume (optional, default to 9)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV Default JSON (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param eod If true, then return data for closed day (optional, default to false)
   * @param rollingPeriod Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168]. (optional, default to 24)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @return ApiResponse&lt;GetQuote200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetQuote200Response> getQuoteWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable IntervalEnum interval, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long volumeTimePeriod, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Boolean eod, @javax.annotation.Nullable Long rollingPeriod, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getQuoteWithHttpInfo(symbol, figi, isin, cusip, interval, exchange, micCode, country, volumeTimePeriod, type, format, delimiter, prepost, eod, rollingPeriod, dp, timezone, null);
  }

  /**
   * Quote
   * The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.
   * @param symbol Symbol ticker of the instrument (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param interval Interval of the quote (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param volumeTimePeriod Number of periods for Average Volume (optional, default to 9)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format Value can be JSON or CSV Default JSON (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param prepost Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param eod If true, then return data for closed day (optional, default to false)
   * @param rollingPeriod Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168]. (optional, default to 24)
   * @param dp Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetQuote200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetQuote200Response> getQuoteWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable IntervalEnum interval, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long volumeTimePeriod, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Boolean eod, @javax.annotation.Nullable Long rollingPeriod, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getQuoteRequestBuilder(symbol, figi, isin, cusip, interval, exchange, micCode, country, volumeTimePeriod, type, format, delimiter, prepost, eod, rollingPeriod, dp, timezone, headers);
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
          throw getApiException("getQuote", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetQuote200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetQuote200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetQuote200Response>() {});
        

        return new ApiResponse<GetQuote200Response>(
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

  private HttpRequest.Builder getQuoteRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable IntervalEnum interval, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long volumeTimePeriod, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable Boolean eod, @javax.annotation.Nullable Long rollingPeriod, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/quote";

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
    localVarQueryParameterBaseName = "interval";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("interval", interval));
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "volume_time_period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("volume_time_period", volumeTimePeriod));
    localVarQueryParameterBaseName = "type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "prepost";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("prepost", prepost));
    localVarQueryParameterBaseName = "eod";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("eod", eod));
    localVarQueryParameterBaseName = "rolling_period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("rolling_period", rollingPeriod));
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


  public static final class APIGetQuoteRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of the instrument (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private IntervalEnum interval; // Interval of the quote (optional)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private Long volumeTimePeriod; // Number of periods for Average Volume (optional, default to 9)
    @javax.annotation.Nullable
    private TypeEnum type; // The asset class to which the instrument belongs (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // Value can be JSON or CSV Default JSON (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // Specify the delimiter used when downloading the CSV file (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean prepost; // Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
    @javax.annotation.Nullable
    private Boolean eod; // If true, then return data for closed day (optional, default to false)
    @javax.annotation.Nullable
    private Long rollingPeriod; // Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168]. (optional, default to 24)
    @javax.annotation.Nullable
    private Long dp; // Specifies the number of decimal places for floating values Should be in range [0,11] inclusive (optional, default to 5)
    @javax.annotation.Nullable
    private String timezone; // Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)

    private APIGetQuoteRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.interval = builder.interval;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.volumeTimePeriod = builder.volumeTimePeriod;
      this.type = builder.type;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.prepost = builder.prepost;
      this.eod = builder.eod;
      this.rollingPeriod = builder.rollingPeriod;
      this.dp = builder.dp;
      this.timezone = builder.timezone;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String figi() {
      return figi;
    }
    @javax.annotation.Nullable
    public String isin() {
      return isin;
    }
    @javax.annotation.Nullable
    public String cusip() {
      return cusip;
    }
    @javax.annotation.Nullable
    public IntervalEnum interval() {
      return interval;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public Long volumeTimePeriod() {
      return volumeTimePeriod;
    }
    @javax.annotation.Nullable
    public TypeEnum type() {
      return type;
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
    public Boolean prepost() {
      return prepost;
    }
    @javax.annotation.Nullable
    public Boolean eod() {
      return eod;
    }
    @javax.annotation.Nullable
    public Long rollingPeriod() {
      return rollingPeriod;
    }
    @javax.annotation.Nullable
    public Long dp() {
      return dp;
    }
    @javax.annotation.Nullable
    public String timezone() {
      return timezone;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private IntervalEnum interval;
      private String exchange;
      private String micCode;
      private String country;
      private Long volumeTimePeriod;
      private TypeEnum type;
      private FormatEnum format;
      private String delimiter;
      private Boolean prepost;
      private Boolean eod;
      private Long rollingPeriod;
      private Long dp;
      private String timezone;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder figi(@javax.annotation.Nullable String figi) {
        this.figi = figi;
        return this;
      }
      public Builder isin(@javax.annotation.Nullable String isin) {
        this.isin = isin;
        return this;
      }
      public Builder cusip(@javax.annotation.Nullable String cusip) {
        this.cusip = cusip;
        return this;
      }
      public Builder interval(@javax.annotation.Nullable IntervalEnum interval) {
        this.interval = interval;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder volumeTimePeriod(@javax.annotation.Nullable Long volumeTimePeriod) {
        this.volumeTimePeriod = volumeTimePeriod;
        return this;
      }
      public Builder type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
      }
      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public Builder prepost(@javax.annotation.Nullable Boolean prepost) {
        this.prepost = prepost;
        return this;
      }
      public Builder eod(@javax.annotation.Nullable Boolean eod) {
        this.eod = eod;
        return this;
      }
      public Builder rollingPeriod(@javax.annotation.Nullable Long rollingPeriod) {
        this.rollingPeriod = rollingPeriod;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public Builder timezone(@javax.annotation.Nullable String timezone) {
        this.timezone = timezone;
        return this;
      }
      public APIGetQuoteRequest build() {
        return new APIGetQuoteRequest(this);
      }
    }
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param apiRequest {@link APIGetTimeSeriesRequest}
   * @return GetTimeSeries200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeries200Response getTimeSeries(APIGetTimeSeriesRequest apiRequest) throws ApiException {
    return getTimeSeries(apiRequest, null);
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param apiRequest {@link APIGetTimeSeriesRequest}
   * @param headers Optional headers to include in the request
   * @return GetTimeSeries200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeries200Response getTimeSeries(APIGetTimeSeriesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    IntervalEnum interval = apiRequest.interval();
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    TypeEnum type = apiRequest.type();
    @javax.annotation.Nullable
    String timezone = apiRequest.timezone();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    String date = apiRequest.date();
    @javax.annotation.Nullable
    OrderEnum order = apiRequest.order();
    @javax.annotation.Nullable
    Boolean prepost = apiRequest.prepost();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    @javax.annotation.Nullable
    Boolean previousClose = apiRequest.previousClose();
    @javax.annotation.Nullable
    AdjustEnum adjust = apiRequest.adjust();
    return getTimeSeries(interval, symbol, isin, figi, cusip, outputsize, exchange, micCode, country, type, timezone, startDate, endDate, date, order, prepost, format, delimiter, dp, previousClose, adjust, headers);
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param apiRequest {@link APIGetTimeSeriesRequest}
   * @return ApiResponse&lt;GetTimeSeries200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeries200Response> getTimeSeriesWithHttpInfo(APIGetTimeSeriesRequest apiRequest) throws ApiException {
    return getTimeSeriesWithHttpInfo(apiRequest, null);
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param apiRequest {@link APIGetTimeSeriesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetTimeSeries200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeries200Response> getTimeSeriesWithHttpInfo(APIGetTimeSeriesRequest apiRequest, Map<String, String> headers) throws ApiException {
    IntervalEnum interval = apiRequest.interval();
    String symbol = apiRequest.symbol();
    String isin = apiRequest.isin();
    String figi = apiRequest.figi();
    String cusip = apiRequest.cusip();
    Long outputsize = apiRequest.outputsize();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    TypeEnum type = apiRequest.type();
    String timezone = apiRequest.timezone();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    String date = apiRequest.date();
    OrderEnum order = apiRequest.order();
    Boolean prepost = apiRequest.prepost();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Long dp = apiRequest.dp();
    Boolean previousClose = apiRequest.previousClose();
    AdjustEnum adjust = apiRequest.adjust();
    return getTimeSeriesWithHttpInfo(interval, symbol, isin, figi, cusip, outputsize, exchange, micCode, country, type, timezone, startDate, endDate, date, order, prepost, format, delimiter, dp, previousClose, adjust, headers);
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param interval Interval between two consecutive points in time series (required)
   * @param symbol Symbol ticker of the instrument. E.g. &#x60;AAPL&#x60;, &#x60;EUR/USD&#x60;, &#x60;ETH/BTC&#x60;, ... (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 30)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param startDate Can be used separately and together with &#x60;end_date&#x60;. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;  Default location: &lt;ul&gt; &lt;li&gt;Forex and Cryptocurrencies - &lt;code&gt;UTC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;Stocks - where exchange is located (e.g. for AAPL it will be &lt;code&gt;America/New_York&lt;/code&gt;)&lt;/li&gt; &lt;/ul&gt; Both parameters take into account if &lt;code&gt;timezone&lt;/code&gt; parameter is provided.&lt;br/&gt; If &lt;code&gt;timezone&lt;/code&gt; is given then, &lt;code&gt;start_date&lt;/code&gt; and &lt;code&gt;end_date&lt;/code&gt; will be used in the specified location  Examples: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;&amp;symbol&#x3D;AAPL&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 New York time up to current date&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;&amp;symbol&#x3D;EUR/USD&amp;timezone&#x3D;Asia/Singapore&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date&lt;/li&gt; &lt;li&gt;3. &lt;code&gt;&amp;symbol&#x3D;ETH/BTC&amp;timezone&#x3D;Europe/Zurich&amp;start_date&#x3D;2019-08-09T15:50:00&amp;end_date&#x3D;2019-08-09T15:55:00&amp;...&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00&lt;/li&gt; &lt;/ul&gt; (optional)
   * @param endDate The ending date and time for data selection, see &#x60;start_date&#x60; description for details. (optional)
   * @param date Specifies the exact date to get the data for. Could be the exact date, e.g. &#x60;2021-10-27&#x60;, or in human language &#x60;today&#x60; or &#x60;yesterday&#x60; (optional)
   * @param order Sorting order of the output (optional, default to desc)
   * @param prepost Returns quotes that include pre-market and post-market data. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided (optional, default to -1)
   * @param previousClose A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object (optional, default to false)
   * @param adjust Adjusting mode for prices (optional, default to splits)
   * @return GetTimeSeries200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeries200Response getTimeSeries(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String date, @javax.annotation.Nullable OrderEnum order, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable Boolean previousClose, @javax.annotation.Nullable AdjustEnum adjust) throws ApiException {
    return getTimeSeries(interval, symbol, isin, figi, cusip, outputsize, exchange, micCode, country, type, timezone, startDate, endDate, date, order, prepost, format, delimiter, dp, previousClose, adjust, null);
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param interval Interval between two consecutive points in time series (required)
   * @param symbol Symbol ticker of the instrument. E.g. &#x60;AAPL&#x60;, &#x60;EUR/USD&#x60;, &#x60;ETH/BTC&#x60;, ... (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 30)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param startDate Can be used separately and together with &#x60;end_date&#x60;. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;  Default location: &lt;ul&gt; &lt;li&gt;Forex and Cryptocurrencies - &lt;code&gt;UTC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;Stocks - where exchange is located (e.g. for AAPL it will be &lt;code&gt;America/New_York&lt;/code&gt;)&lt;/li&gt; &lt;/ul&gt; Both parameters take into account if &lt;code&gt;timezone&lt;/code&gt; parameter is provided.&lt;br/&gt; If &lt;code&gt;timezone&lt;/code&gt; is given then, &lt;code&gt;start_date&lt;/code&gt; and &lt;code&gt;end_date&lt;/code&gt; will be used in the specified location  Examples: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;&amp;symbol&#x3D;AAPL&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 New York time up to current date&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;&amp;symbol&#x3D;EUR/USD&amp;timezone&#x3D;Asia/Singapore&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date&lt;/li&gt; &lt;li&gt;3. &lt;code&gt;&amp;symbol&#x3D;ETH/BTC&amp;timezone&#x3D;Europe/Zurich&amp;start_date&#x3D;2019-08-09T15:50:00&amp;end_date&#x3D;2019-08-09T15:55:00&amp;...&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00&lt;/li&gt; &lt;/ul&gt; (optional)
   * @param endDate The ending date and time for data selection, see &#x60;start_date&#x60; description for details. (optional)
   * @param date Specifies the exact date to get the data for. Could be the exact date, e.g. &#x60;2021-10-27&#x60;, or in human language &#x60;today&#x60; or &#x60;yesterday&#x60; (optional)
   * @param order Sorting order of the output (optional, default to desc)
   * @param prepost Returns quotes that include pre-market and post-market data. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided (optional, default to -1)
   * @param previousClose A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object (optional, default to false)
   * @param adjust Adjusting mode for prices (optional, default to splits)
   * @param headers Optional headers to include in the request
   * @return GetTimeSeries200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeries200Response getTimeSeries(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String date, @javax.annotation.Nullable OrderEnum order, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable Boolean previousClose, @javax.annotation.Nullable AdjustEnum adjust, Map<String, String> headers) throws ApiException {
    ApiResponse<GetTimeSeries200Response> localVarResponse = getTimeSeriesWithHttpInfo(interval, symbol, isin, figi, cusip, outputsize, exchange, micCode, country, type, timezone, startDate, endDate, date, order, prepost, format, delimiter, dp, previousClose, adjust, headers);
    return localVarResponse.getData();
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param interval Interval between two consecutive points in time series (required)
   * @param symbol Symbol ticker of the instrument. E.g. &#x60;AAPL&#x60;, &#x60;EUR/USD&#x60;, &#x60;ETH/BTC&#x60;, ... (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 30)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param startDate Can be used separately and together with &#x60;end_date&#x60;. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;  Default location: &lt;ul&gt; &lt;li&gt;Forex and Cryptocurrencies - &lt;code&gt;UTC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;Stocks - where exchange is located (e.g. for AAPL it will be &lt;code&gt;America/New_York&lt;/code&gt;)&lt;/li&gt; &lt;/ul&gt; Both parameters take into account if &lt;code&gt;timezone&lt;/code&gt; parameter is provided.&lt;br/&gt; If &lt;code&gt;timezone&lt;/code&gt; is given then, &lt;code&gt;start_date&lt;/code&gt; and &lt;code&gt;end_date&lt;/code&gt; will be used in the specified location  Examples: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;&amp;symbol&#x3D;AAPL&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 New York time up to current date&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;&amp;symbol&#x3D;EUR/USD&amp;timezone&#x3D;Asia/Singapore&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date&lt;/li&gt; &lt;li&gt;3. &lt;code&gt;&amp;symbol&#x3D;ETH/BTC&amp;timezone&#x3D;Europe/Zurich&amp;start_date&#x3D;2019-08-09T15:50:00&amp;end_date&#x3D;2019-08-09T15:55:00&amp;...&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00&lt;/li&gt; &lt;/ul&gt; (optional)
   * @param endDate The ending date and time for data selection, see &#x60;start_date&#x60; description for details. (optional)
   * @param date Specifies the exact date to get the data for. Could be the exact date, e.g. &#x60;2021-10-27&#x60;, or in human language &#x60;today&#x60; or &#x60;yesterday&#x60; (optional)
   * @param order Sorting order of the output (optional, default to desc)
   * @param prepost Returns quotes that include pre-market and post-market data. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided (optional, default to -1)
   * @param previousClose A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object (optional, default to false)
   * @param adjust Adjusting mode for prices (optional, default to splits)
   * @return ApiResponse&lt;GetTimeSeries200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeries200Response> getTimeSeriesWithHttpInfo(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String date, @javax.annotation.Nullable OrderEnum order, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable Boolean previousClose, @javax.annotation.Nullable AdjustEnum adjust) throws ApiException {
    return getTimeSeriesWithHttpInfo(interval, symbol, isin, figi, cusip, outputsize, exchange, micCode, country, type, timezone, startDate, endDate, date, order, prepost, format, delimiter, dp, previousClose, adjust, null);
  }

  /**
   * Time series
   * The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.
   * @param interval Interval between two consecutive points in time series (required)
   * @param symbol Symbol ticker of the instrument. E.g. &#x60;AAPL&#x60;, &#x60;EUR/USD&#x60;, &#x60;ETH/BTC&#x60;, ... (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 30)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param startDate Can be used separately and together with &#x60;end_date&#x60;. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;  Default location: &lt;ul&gt; &lt;li&gt;Forex and Cryptocurrencies - &lt;code&gt;UTC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;Stocks - where exchange is located (e.g. for AAPL it will be &lt;code&gt;America/New_York&lt;/code&gt;)&lt;/li&gt; &lt;/ul&gt; Both parameters take into account if &lt;code&gt;timezone&lt;/code&gt; parameter is provided.&lt;br/&gt; If &lt;code&gt;timezone&lt;/code&gt; is given then, &lt;code&gt;start_date&lt;/code&gt; and &lt;code&gt;end_date&lt;/code&gt; will be used in the specified location  Examples: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;&amp;symbol&#x3D;AAPL&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 New York time up to current date&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;&amp;symbol&#x3D;EUR/USD&amp;timezone&#x3D;Asia/Singapore&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date&lt;/li&gt; &lt;li&gt;3. &lt;code&gt;&amp;symbol&#x3D;ETH/BTC&amp;timezone&#x3D;Europe/Zurich&amp;start_date&#x3D;2019-08-09T15:50:00&amp;end_date&#x3D;2019-08-09T15:55:00&amp;...&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00&lt;/li&gt; &lt;/ul&gt; (optional)
   * @param endDate The ending date and time for data selection, see &#x60;start_date&#x60; description for details. (optional)
   * @param date Specifies the exact date to get the data for. Could be the exact date, e.g. &#x60;2021-10-27&#x60;, or in human language &#x60;today&#x60; or &#x60;yesterday&#x60; (optional)
   * @param order Sorting order of the output (optional, default to desc)
   * @param prepost Returns quotes that include pre-market and post-market data. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided (optional, default to -1)
   * @param previousClose A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object (optional, default to false)
   * @param adjust Adjusting mode for prices (optional, default to splits)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetTimeSeries200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeries200Response> getTimeSeriesWithHttpInfo(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String date, @javax.annotation.Nullable OrderEnum order, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable Boolean previousClose, @javax.annotation.Nullable AdjustEnum adjust, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getTimeSeriesRequestBuilder(interval, symbol, isin, figi, cusip, outputsize, exchange, micCode, country, type, timezone, startDate, endDate, date, order, prepost, format, delimiter, dp, previousClose, adjust, headers);
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
          throw getApiException("getTimeSeries", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetTimeSeries200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetTimeSeries200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetTimeSeries200Response>() {});
        

        return new ApiResponse<GetTimeSeries200Response>(
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

  private HttpRequest.Builder getTimeSeriesRequestBuilder(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String date, @javax.annotation.Nullable OrderEnum order, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable Boolean previousClose, @javax.annotation.Nullable AdjustEnum adjust, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'interval' is set
    if (interval == null) {
      throw new ApiException(400, "Missing the required parameter 'interval' when calling getTimeSeries");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/time_series";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "isin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("isin", isin));
    localVarQueryParameterBaseName = "figi";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("figi", figi));
    localVarQueryParameterBaseName = "cusip";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cusip", cusip));
    localVarQueryParameterBaseName = "interval";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("interval", interval));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParameterBaseName = "timezone";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timezone", timezone));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
    localVarQueryParameterBaseName = "date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("date", date));
    localVarQueryParameterBaseName = "order";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("order", order));
    localVarQueryParameterBaseName = "prepost";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("prepost", prepost));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "dp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dp", dp));
    localVarQueryParameterBaseName = "previous_close";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("previous_close", previousClose));
    localVarQueryParameterBaseName = "adjust";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("adjust", adjust));

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


  public static final class APIGetTimeSeriesRequest {
    @javax.annotation.Nonnull
    private IntervalEnum interval; // Interval between two consecutive points in time series (required)
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of the instrument. E.g. &#x60;AAPL&#x60;, &#x60;EUR/USD&#x60;, &#x60;ETH/BTC&#x60;, ... (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String figi; // The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 30)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private TypeEnum type; // The asset class to which the instrument belongs (optional)
    @javax.annotation.Nullable
    private String timezone; // Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
    @javax.annotation.Nullable
    private String startDate; // Can be used separately and together with &#x60;end_date&#x60;. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;  Default location: &lt;ul&gt; &lt;li&gt;Forex and Cryptocurrencies - &lt;code&gt;UTC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;Stocks - where exchange is located (e.g. for AAPL it will be &lt;code&gt;America/New_York&lt;/code&gt;)&lt;/li&gt; &lt;/ul&gt; Both parameters take into account if &lt;code&gt;timezone&lt;/code&gt; parameter is provided.&lt;br/&gt; If &lt;code&gt;timezone&lt;/code&gt; is given then, &lt;code&gt;start_date&lt;/code&gt; and &lt;code&gt;end_date&lt;/code&gt; will be used in the specified location  Examples: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;&amp;symbol&#x3D;AAPL&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 New York time up to current date&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;&amp;symbol&#x3D;EUR/USD&amp;timezone&#x3D;Asia/Singapore&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date&lt;/li&gt; &lt;li&gt;3. &lt;code&gt;&amp;symbol&#x3D;ETH/BTC&amp;timezone&#x3D;Europe/Zurich&amp;start_date&#x3D;2019-08-09T15:50:00&amp;end_date&#x3D;2019-08-09T15:55:00&amp;...&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00&lt;/li&gt; &lt;/ul&gt; (optional)
    @javax.annotation.Nullable
    private String endDate; // The ending date and time for data selection, see &#x60;start_date&#x60; description for details. (optional)
    @javax.annotation.Nullable
    private String date; // Specifies the exact date to get the data for. Could be the exact date, e.g. &#x60;2021-10-27&#x60;, or in human language &#x60;today&#x60; or &#x60;yesterday&#x60; (optional)
    @javax.annotation.Nullable
    private OrderEnum order; // Sorting order of the output (optional, default to desc)
    @javax.annotation.Nullable
    private Boolean prepost; // Returns quotes that include pre-market and post-market data. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume (optional, default to false)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private Long dp; // Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided (optional, default to -1)
    @javax.annotation.Nullable
    private Boolean previousClose; // A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object (optional, default to false)
    @javax.annotation.Nullable
    private AdjustEnum adjust; // Adjusting mode for prices (optional, default to splits)

    private APIGetTimeSeriesRequest(Builder builder) {
      this.interval = builder.interval;
      this.symbol = builder.symbol;
      this.isin = builder.isin;
      this.figi = builder.figi;
      this.cusip = builder.cusip;
      this.outputsize = builder.outputsize;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.type = builder.type;
      this.timezone = builder.timezone;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.date = builder.date;
      this.order = builder.order;
      this.prepost = builder.prepost;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.dp = builder.dp;
      this.previousClose = builder.previousClose;
      this.adjust = builder.adjust;
    }
    @javax.annotation.Nonnull
    public IntervalEnum interval() {
      return interval;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String isin() {
      return isin;
    }
    @javax.annotation.Nullable
    public String figi() {
      return figi;
    }
    @javax.annotation.Nullable
    public String cusip() {
      return cusip;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public TypeEnum type() {
      return type;
    }
    @javax.annotation.Nullable
    public String timezone() {
      return timezone;
    }
    @javax.annotation.Nullable
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
    }
    @javax.annotation.Nullable
    public String date() {
      return date;
    }
    @javax.annotation.Nullable
    public OrderEnum order() {
      return order;
    }
    @javax.annotation.Nullable
    public Boolean prepost() {
      return prepost;
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
    public Long dp() {
      return dp;
    }
    @javax.annotation.Nullable
    public Boolean previousClose() {
      return previousClose;
    }
    @javax.annotation.Nullable
    public AdjustEnum adjust() {
      return adjust;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private IntervalEnum interval;
      private String symbol;
      private String isin;
      private String figi;
      private String cusip;
      private Long outputsize;
      private String exchange;
      private String micCode;
      private String country;
      private TypeEnum type;
      private String timezone;
      private String startDate;
      private String endDate;
      private String date;
      private OrderEnum order;
      private Boolean prepost;
      private FormatEnum format;
      private String delimiter;
      private Long dp;
      private Boolean previousClose;
      private AdjustEnum adjust;

      public Builder interval(@javax.annotation.Nonnull IntervalEnum interval) {
        this.interval = interval;
        return this;
      }
      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder isin(@javax.annotation.Nullable String isin) {
        this.isin = isin;
        return this;
      }
      public Builder figi(@javax.annotation.Nullable String figi) {
        this.figi = figi;
        return this;
      }
      public Builder cusip(@javax.annotation.Nullable String cusip) {
        this.cusip = cusip;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
      }
      public Builder timezone(@javax.annotation.Nullable String timezone) {
        this.timezone = timezone;
        return this;
      }
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public Builder date(@javax.annotation.Nullable String date) {
        this.date = date;
        return this;
      }
      public Builder order(@javax.annotation.Nullable OrderEnum order) {
        this.order = order;
        return this;
      }
      public Builder prepost(@javax.annotation.Nullable Boolean prepost) {
        this.prepost = prepost;
        return this;
      }
      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public Builder previousClose(@javax.annotation.Nullable Boolean previousClose) {
        this.previousClose = previousClose;
        return this;
      }
      public Builder adjust(@javax.annotation.Nullable AdjustEnum adjust) {
        this.adjust = adjust;
        return this;
      }
      public APIGetTimeSeriesRequest build() {
        return new APIGetTimeSeriesRequest(this);
      }
    }
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param apiRequest {@link APIGetTimeSeriesCrossRequest}
   * @return GetTimeSeriesCross200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeriesCross200Response getTimeSeriesCross(APIGetTimeSeriesCrossRequest apiRequest) throws ApiException {
    return getTimeSeriesCross(apiRequest, null);
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param apiRequest {@link APIGetTimeSeriesCrossRequest}
   * @param headers Optional headers to include in the request
   * @return GetTimeSeriesCross200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeriesCross200Response getTimeSeriesCross(APIGetTimeSeriesCrossRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    String base = apiRequest.base();
    @javax.annotation.Nonnull
    String quote = apiRequest.quote();
    @javax.annotation.Nonnull
    IntervalEnum interval = apiRequest.interval();
    @javax.annotation.Nullable
    String baseType = apiRequest.baseType();
    @javax.annotation.Nullable
    String baseExchange = apiRequest.baseExchange();
    @javax.annotation.Nullable
    String baseMicCode = apiRequest.baseMicCode();
    @javax.annotation.Nullable
    String quoteType = apiRequest.quoteType();
    @javax.annotation.Nullable
    String quoteExchange = apiRequest.quoteExchange();
    @javax.annotation.Nullable
    String quoteMicCode = apiRequest.quoteMicCode();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean prepost = apiRequest.prepost();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Boolean adjust = apiRequest.adjust();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    @javax.annotation.Nullable
    String timezone = apiRequest.timezone();
    return getTimeSeriesCross(base, quote, interval, baseType, baseExchange, baseMicCode, quoteType, quoteExchange, quoteMicCode, outputsize, format, delimiter, prepost, startDate, endDate, adjust, dp, timezone, headers);
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param apiRequest {@link APIGetTimeSeriesCrossRequest}
   * @return ApiResponse&lt;GetTimeSeriesCross200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeriesCross200Response> getTimeSeriesCrossWithHttpInfo(APIGetTimeSeriesCrossRequest apiRequest) throws ApiException {
    return getTimeSeriesCrossWithHttpInfo(apiRequest, null);
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param apiRequest {@link APIGetTimeSeriesCrossRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetTimeSeriesCross200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeriesCross200Response> getTimeSeriesCrossWithHttpInfo(APIGetTimeSeriesCrossRequest apiRequest, Map<String, String> headers) throws ApiException {
    String base = apiRequest.base();
    String quote = apiRequest.quote();
    IntervalEnum interval = apiRequest.interval();
    String baseType = apiRequest.baseType();
    String baseExchange = apiRequest.baseExchange();
    String baseMicCode = apiRequest.baseMicCode();
    String quoteType = apiRequest.quoteType();
    String quoteExchange = apiRequest.quoteExchange();
    String quoteMicCode = apiRequest.quoteMicCode();
    Long outputsize = apiRequest.outputsize();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean prepost = apiRequest.prepost();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Boolean adjust = apiRequest.adjust();
    Long dp = apiRequest.dp();
    String timezone = apiRequest.timezone();
    return getTimeSeriesCrossWithHttpInfo(base, quote, interval, baseType, baseExchange, baseMicCode, quoteType, quoteExchange, quoteMicCode, outputsize, format, delimiter, prepost, startDate, endDate, adjust, dp, timezone, headers);
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param base Base currency symbol (required)
   * @param quote Quote currency symbol (required)
   * @param interval Interval between two consecutive points in time series (required)
   * @param baseType Base instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param baseExchange Base exchange (optional)
   * @param baseMicCode Base MIC code (optional)
   * @param quoteType Quote instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param quoteExchange Quote exchange (optional)
   * @param quoteMicCode Quote MIC code (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional)
   * @param format Format of the response data (optional, default to JSON)
   * @param delimiter Delimiter used in CSV file (optional, default to ;)
   * @param prepost Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param startDate Start date for the time series data (optional)
   * @param endDate End date for the time series data (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @return GetTimeSeriesCross200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeriesCross200Response getTimeSeriesCross(@javax.annotation.Nonnull String base, @javax.annotation.Nonnull String quote, @javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String baseType, @javax.annotation.Nullable String baseExchange, @javax.annotation.Nullable String baseMicCode, @javax.annotation.Nullable String quoteType, @javax.annotation.Nullable String quoteExchange, @javax.annotation.Nullable String quoteMicCode, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getTimeSeriesCross(base, quote, interval, baseType, baseExchange, baseMicCode, quoteType, quoteExchange, quoteMicCode, outputsize, format, delimiter, prepost, startDate, endDate, adjust, dp, timezone, null);
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param base Base currency symbol (required)
   * @param quote Quote currency symbol (required)
   * @param interval Interval between two consecutive points in time series (required)
   * @param baseType Base instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param baseExchange Base exchange (optional)
   * @param baseMicCode Base MIC code (optional)
   * @param quoteType Quote instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param quoteExchange Quote exchange (optional)
   * @param quoteMicCode Quote MIC code (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional)
   * @param format Format of the response data (optional, default to JSON)
   * @param delimiter Delimiter used in CSV file (optional, default to ;)
   * @param prepost Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param startDate Start date for the time series data (optional)
   * @param endDate End date for the time series data (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return GetTimeSeriesCross200Response
   * @throws ApiException if fails to make API call
   */
  public GetTimeSeriesCross200Response getTimeSeriesCross(@javax.annotation.Nonnull String base, @javax.annotation.Nonnull String quote, @javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String baseType, @javax.annotation.Nullable String baseExchange, @javax.annotation.Nullable String baseMicCode, @javax.annotation.Nullable String quoteType, @javax.annotation.Nullable String quoteExchange, @javax.annotation.Nullable String quoteMicCode, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    ApiResponse<GetTimeSeriesCross200Response> localVarResponse = getTimeSeriesCrossWithHttpInfo(base, quote, interval, baseType, baseExchange, baseMicCode, quoteType, quoteExchange, quoteMicCode, outputsize, format, delimiter, prepost, startDate, endDate, adjust, dp, timezone, headers);
    return localVarResponse.getData();
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param base Base currency symbol (required)
   * @param quote Quote currency symbol (required)
   * @param interval Interval between two consecutive points in time series (required)
   * @param baseType Base instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param baseExchange Base exchange (optional)
   * @param baseMicCode Base MIC code (optional)
   * @param quoteType Quote instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param quoteExchange Quote exchange (optional)
   * @param quoteMicCode Quote MIC code (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional)
   * @param format Format of the response data (optional, default to JSON)
   * @param delimiter Delimiter used in CSV file (optional, default to ;)
   * @param prepost Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param startDate Start date for the time series data (optional)
   * @param endDate End date for the time series data (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @return ApiResponse&lt;GetTimeSeriesCross200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeriesCross200Response> getTimeSeriesCrossWithHttpInfo(@javax.annotation.Nonnull String base, @javax.annotation.Nonnull String quote, @javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String baseType, @javax.annotation.Nullable String baseExchange, @javax.annotation.Nullable String baseMicCode, @javax.annotation.Nullable String quoteType, @javax.annotation.Nullable String quoteExchange, @javax.annotation.Nullable String quoteMicCode, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone) throws ApiException {
    return getTimeSeriesCrossWithHttpInfo(base, quote, interval, baseType, baseExchange, baseMicCode, quoteType, quoteExchange, quoteMicCode, outputsize, format, delimiter, prepost, startDate, endDate, adjust, dp, timezone, null);
  }

  /**
   * Time series cross
   * The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.
   * @param base Base currency symbol (required)
   * @param quote Quote currency symbol (required)
   * @param interval Interval between two consecutive points in time series (required)
   * @param baseType Base instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param baseExchange Base exchange (optional)
   * @param baseMicCode Base MIC code (optional)
   * @param quoteType Quote instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
   * @param quoteExchange Quote exchange (optional)
   * @param quoteMicCode Quote MIC code (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional)
   * @param format Format of the response data (optional, default to JSON)
   * @param delimiter Delimiter used in CSV file (optional, default to ;)
   * @param prepost Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
   * @param startDate Start date for the time series data (optional)
   * @param endDate End date for the time series data (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. (optional, default to 5)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetTimeSeriesCross200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTimeSeriesCross200Response> getTimeSeriesCrossWithHttpInfo(@javax.annotation.Nonnull String base, @javax.annotation.Nonnull String quote, @javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String baseType, @javax.annotation.Nullable String baseExchange, @javax.annotation.Nullable String baseMicCode, @javax.annotation.Nullable String quoteType, @javax.annotation.Nullable String quoteExchange, @javax.annotation.Nullable String quoteMicCode, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getTimeSeriesCrossRequestBuilder(base, quote, interval, baseType, baseExchange, baseMicCode, quoteType, quoteExchange, quoteMicCode, outputsize, format, delimiter, prepost, startDate, endDate, adjust, dp, timezone, headers);
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
          throw getApiException("getTimeSeriesCross", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetTimeSeriesCross200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetTimeSeriesCross200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetTimeSeriesCross200Response>() {});
        

        return new ApiResponse<GetTimeSeriesCross200Response>(
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

  private HttpRequest.Builder getTimeSeriesCrossRequestBuilder(@javax.annotation.Nonnull String base, @javax.annotation.Nonnull String quote, @javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String baseType, @javax.annotation.Nullable String baseExchange, @javax.annotation.Nullable String baseMicCode, @javax.annotation.Nullable String quoteType, @javax.annotation.Nullable String quoteExchange, @javax.annotation.Nullable String quoteMicCode, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean prepost, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, @javax.annotation.Nullable Long dp, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'base' is set
    if (base == null) {
      throw new ApiException(400, "Missing the required parameter 'base' when calling getTimeSeriesCross");
    }
    // verify the required parameter 'quote' is set
    if (quote == null) {
      throw new ApiException(400, "Missing the required parameter 'quote' when calling getTimeSeriesCross");
    }
    // verify the required parameter 'interval' is set
    if (interval == null) {
      throw new ApiException(400, "Missing the required parameter 'interval' when calling getTimeSeriesCross");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/time_series/cross";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "base";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("base", base));
    localVarQueryParameterBaseName = "base_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("base_type", baseType));
    localVarQueryParameterBaseName = "base_exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("base_exchange", baseExchange));
    localVarQueryParameterBaseName = "base_mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("base_mic_code", baseMicCode));
    localVarQueryParameterBaseName = "quote";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("quote", quote));
    localVarQueryParameterBaseName = "quote_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("quote_type", quoteType));
    localVarQueryParameterBaseName = "quote_exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("quote_exchange", quoteExchange));
    localVarQueryParameterBaseName = "quote_mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("quote_mic_code", quoteMicCode));
    localVarQueryParameterBaseName = "interval";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("interval", interval));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "prepost";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("prepost", prepost));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
    localVarQueryParameterBaseName = "adjust";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("adjust", adjust));
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


  public static final class APIGetTimeSeriesCrossRequest {
    @javax.annotation.Nonnull
    private String base; // Base currency symbol (required)
    @javax.annotation.Nonnull
    private String quote; // Quote currency symbol (required)
    @javax.annotation.Nonnull
    private IntervalEnum interval; // Interval between two consecutive points in time series (required)
    @javax.annotation.Nullable
    private String baseType; // Base instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
    @javax.annotation.Nullable
    private String baseExchange; // Base exchange (optional)
    @javax.annotation.Nullable
    private String baseMicCode; // Base MIC code (optional)
    @javax.annotation.Nullable
    private String quoteType; // Quote instrument type according to the &#x60;/instrument_type&#x60; endpoint (optional)
    @javax.annotation.Nullable
    private String quoteExchange; // Quote exchange (optional)
    @javax.annotation.Nullable
    private String quoteMicCode; // Quote MIC code (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // Format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // Delimiter used in CSV file (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean prepost; // Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. (optional, default to false)
    @javax.annotation.Nullable
    private String startDate; // Start date for the time series data (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for the time series data (optional)
    @javax.annotation.Nullable
    private Boolean adjust; // Specifies if there should be an adjustment (optional, default to true)
    @javax.annotation.Nullable
    private Long dp; // Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. (optional, default to 5)
    @javax.annotation.Nullable
    private String timezone; // Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional)

    private APIGetTimeSeriesCrossRequest(Builder builder) {
      this.base = builder.base;
      this.quote = builder.quote;
      this.interval = builder.interval;
      this.baseType = builder.baseType;
      this.baseExchange = builder.baseExchange;
      this.baseMicCode = builder.baseMicCode;
      this.quoteType = builder.quoteType;
      this.quoteExchange = builder.quoteExchange;
      this.quoteMicCode = builder.quoteMicCode;
      this.outputsize = builder.outputsize;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.prepost = builder.prepost;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.adjust = builder.adjust;
      this.dp = builder.dp;
      this.timezone = builder.timezone;
    }
    @javax.annotation.Nonnull
    public String base() {
      return base;
    }
    @javax.annotation.Nonnull
    public String quote() {
      return quote;
    }
    @javax.annotation.Nonnull
    public IntervalEnum interval() {
      return interval;
    }
    @javax.annotation.Nullable
    public String baseType() {
      return baseType;
    }
    @javax.annotation.Nullable
    public String baseExchange() {
      return baseExchange;
    }
    @javax.annotation.Nullable
    public String baseMicCode() {
      return baseMicCode;
    }
    @javax.annotation.Nullable
    public String quoteType() {
      return quoteType;
    }
    @javax.annotation.Nullable
    public String quoteExchange() {
      return quoteExchange;
    }
    @javax.annotation.Nullable
    public String quoteMicCode() {
      return quoteMicCode;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
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
    public Boolean prepost() {
      return prepost;
    }
    @javax.annotation.Nullable
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
    }
    @javax.annotation.Nullable
    public Boolean adjust() {
      return adjust;
    }
    @javax.annotation.Nullable
    public Long dp() {
      return dp;
    }
    @javax.annotation.Nullable
    public String timezone() {
      return timezone;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String base;
      private String quote;
      private IntervalEnum interval;
      private String baseType;
      private String baseExchange;
      private String baseMicCode;
      private String quoteType;
      private String quoteExchange;
      private String quoteMicCode;
      private Long outputsize;
      private FormatEnum format;
      private String delimiter;
      private Boolean prepost;
      private String startDate;
      private String endDate;
      private Boolean adjust;
      private Long dp;
      private String timezone;

      public Builder base(@javax.annotation.Nonnull String base) {
        this.base = base;
        return this;
      }
      public Builder quote(@javax.annotation.Nonnull String quote) {
        this.quote = quote;
        return this;
      }
      public Builder interval(@javax.annotation.Nonnull IntervalEnum interval) {
        this.interval = interval;
        return this;
      }
      public Builder baseType(@javax.annotation.Nullable String baseType) {
        this.baseType = baseType;
        return this;
      }
      public Builder baseExchange(@javax.annotation.Nullable String baseExchange) {
        this.baseExchange = baseExchange;
        return this;
      }
      public Builder baseMicCode(@javax.annotation.Nullable String baseMicCode) {
        this.baseMicCode = baseMicCode;
        return this;
      }
      public Builder quoteType(@javax.annotation.Nullable String quoteType) {
        this.quoteType = quoteType;
        return this;
      }
      public Builder quoteExchange(@javax.annotation.Nullable String quoteExchange) {
        this.quoteExchange = quoteExchange;
        return this;
      }
      public Builder quoteMicCode(@javax.annotation.Nullable String quoteMicCode) {
        this.quoteMicCode = quoteMicCode;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public Builder prepost(@javax.annotation.Nullable Boolean prepost) {
        this.prepost = prepost;
        return this;
      }
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public Builder adjust(@javax.annotation.Nullable Boolean adjust) {
        this.adjust = adjust;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public Builder timezone(@javax.annotation.Nullable String timezone) {
        this.timezone = timezone;
        return this;
      }
      public APIGetTimeSeriesCrossRequest build() {
        return new APIGetTimeSeriesCrossRequest(this);
      }
    }
  }

}
