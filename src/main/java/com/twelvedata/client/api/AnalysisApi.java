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
import com.twelvedata.client.model.GetAnalystRatingsLight200Response;
import com.twelvedata.client.model.GetAnalystRatingsUsEquities200Response;
import com.twelvedata.client.model.GetEarningsEstimate200Response;
import com.twelvedata.client.model.GetEpsRevisions200Response;
import com.twelvedata.client.model.GetEpsTrend200Response;
import com.twelvedata.client.model.GetGrowthEstimates200Response;
import com.twelvedata.client.model.GetPriceTarget200Response;
import com.twelvedata.client.model.GetRecommendations200Response;
import com.twelvedata.client.model.GetRevenueEstimate200Response;
import com.twelvedata.client.model.RatingChangeEnum;

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
public class AnalysisApi {
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

  public AnalysisApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalysisApi(ApiClient apiClient) {
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
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param apiRequest {@link APIGetAnalystRatingsLightRequest}
   * @return GetAnalystRatingsLight200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsLight200Response getAnalystRatingsLight(APIGetAnalystRatingsLightRequest apiRequest) throws ApiException {
    return getAnalystRatingsLight(apiRequest, null);
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param apiRequest {@link APIGetAnalystRatingsLightRequest}
   * @param headers Optional headers to include in the request
   * @return GetAnalystRatingsLight200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsLight200Response getAnalystRatingsLight(APIGetAnalystRatingsLightRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    RatingChangeEnum ratingChange = apiRequest.ratingChange();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    return getAnalystRatingsLight(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, country, headers);
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param apiRequest {@link APIGetAnalystRatingsLightRequest}
   * @return ApiResponse&lt;GetAnalystRatingsLight200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsLight200Response> getAnalystRatingsLightWithHttpInfo(APIGetAnalystRatingsLightRequest apiRequest) throws ApiException {
    return getAnalystRatingsLightWithHttpInfo(apiRequest, null);
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param apiRequest {@link APIGetAnalystRatingsLightRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetAnalystRatingsLight200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsLight200Response> getAnalystRatingsLightWithHttpInfo(APIGetAnalystRatingsLightRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    RatingChangeEnum ratingChange = apiRequest.ratingChange();
    Long outputsize = apiRequest.outputsize();
    String country = apiRequest.country();
    return getAnalystRatingsLightWithHttpInfo(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, country, headers);
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetAnalystRatingsLight200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsLight200Response getAnalystRatingsLight(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country) throws ApiException {
    return getAnalystRatingsLight(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, country, null);
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetAnalystRatingsLight200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsLight200Response getAnalystRatingsLight(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetAnalystRatingsLight200Response> localVarResponse = getAnalystRatingsLightWithHttpInfo(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetAnalystRatingsLight200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsLight200Response> getAnalystRatingsLightWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country) throws ApiException {
    return getAnalystRatingsLightWithHttpInfo(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, country, null);
  }

  /**
   * Analyst ratings snapshot
   * The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetAnalystRatingsLight200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsLight200Response> getAnalystRatingsLightWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAnalystRatingsLightRequestBuilder(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, country, headers);
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
          throw getApiException("getAnalystRatingsLight", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetAnalystRatingsLight200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetAnalystRatingsLight200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetAnalystRatingsLight200Response>() {});
        

        return new ApiResponse<GetAnalystRatingsLight200Response>(
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

  private HttpRequest.Builder getAnalystRatingsLightRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/analyst_ratings/light";

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
    localVarQueryParameterBaseName = "rating_change";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("rating_change", ratingChange));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));

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


  public static final class APIGetAnalystRatingsLightRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private RatingChangeEnum ratingChange; // Filter by rating change action (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 30)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)

    private APIGetAnalystRatingsLightRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.ratingChange = builder.ratingChange;
      this.outputsize = builder.outputsize;
      this.country = builder.country;
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
    public RatingChangeEnum ratingChange() {
      return ratingChange;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
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
      private RatingChangeEnum ratingChange;
      private Long outputsize;
      private String country;

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
      public Builder ratingChange(@javax.annotation.Nullable RatingChangeEnum ratingChange) {
        this.ratingChange = ratingChange;
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
      public APIGetAnalystRatingsLightRequest build() {
        return new APIGetAnalystRatingsLightRequest(this);
      }
    }
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param apiRequest {@link APIGetAnalystRatingsUsEquitiesRequest}
   * @return GetAnalystRatingsUsEquities200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsUsEquities200Response getAnalystRatingsUsEquities(APIGetAnalystRatingsUsEquitiesRequest apiRequest) throws ApiException {
    return getAnalystRatingsUsEquities(apiRequest, null);
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param apiRequest {@link APIGetAnalystRatingsUsEquitiesRequest}
   * @param headers Optional headers to include in the request
   * @return GetAnalystRatingsUsEquities200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsUsEquities200Response getAnalystRatingsUsEquities(APIGetAnalystRatingsUsEquitiesRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    RatingChangeEnum ratingChange = apiRequest.ratingChange();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getAnalystRatingsUsEquities(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, headers);
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param apiRequest {@link APIGetAnalystRatingsUsEquitiesRequest}
   * @return ApiResponse&lt;GetAnalystRatingsUsEquities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsUsEquities200Response> getAnalystRatingsUsEquitiesWithHttpInfo(APIGetAnalystRatingsUsEquitiesRequest apiRequest) throws ApiException {
    return getAnalystRatingsUsEquitiesWithHttpInfo(apiRequest, null);
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param apiRequest {@link APIGetAnalystRatingsUsEquitiesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetAnalystRatingsUsEquities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsUsEquities200Response> getAnalystRatingsUsEquitiesWithHttpInfo(APIGetAnalystRatingsUsEquitiesRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    RatingChangeEnum ratingChange = apiRequest.ratingChange();
    Long outputsize = apiRequest.outputsize();
    return getAnalystRatingsUsEquitiesWithHttpInfo(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, headers);
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @return GetAnalystRatingsUsEquities200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsUsEquities200Response getAnalystRatingsUsEquities(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getAnalystRatingsUsEquities(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, null);
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param headers Optional headers to include in the request
   * @return GetAnalystRatingsUsEquities200Response
   * @throws ApiException if fails to make API call
   */
  public GetAnalystRatingsUsEquities200Response getAnalystRatingsUsEquities(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetAnalystRatingsUsEquities200Response> localVarResponse = getAnalystRatingsUsEquitiesWithHttpInfo(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @return ApiResponse&lt;GetAnalystRatingsUsEquities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsUsEquities200Response> getAnalystRatingsUsEquitiesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getAnalystRatingsUsEquitiesWithHttpInfo(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, null);
  }

  /**
   * Analyst ratings US equities
   * The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param ratingChange Filter by rating change action (optional)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetAnalystRatingsUsEquities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAnalystRatingsUsEquities200Response> getAnalystRatingsUsEquitiesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAnalystRatingsUsEquitiesRequestBuilder(symbol, figi, isin, cusip, exchange, ratingChange, outputsize, headers);
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
          throw getApiException("getAnalystRatingsUsEquities", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetAnalystRatingsUsEquities200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetAnalystRatingsUsEquities200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetAnalystRatingsUsEquities200Response>() {});
        

        return new ApiResponse<GetAnalystRatingsUsEquities200Response>(
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

  private HttpRequest.Builder getAnalystRatingsUsEquitiesRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable RatingChangeEnum ratingChange, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/analyst_ratings/us_equities";

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
    localVarQueryParameterBaseName = "rating_change";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("rating_change", ratingChange));
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


  public static final class APIGetAnalystRatingsUsEquitiesRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private RatingChangeEnum ratingChange; // Filter by rating change action (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 30)

    private APIGetAnalystRatingsUsEquitiesRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.ratingChange = builder.ratingChange;
      this.outputsize = builder.outputsize;
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
    public RatingChangeEnum ratingChange() {
      return ratingChange;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
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
      private RatingChangeEnum ratingChange;
      private Long outputsize;

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
      public Builder ratingChange(@javax.annotation.Nullable RatingChangeEnum ratingChange) {
        this.ratingChange = ratingChange;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetAnalystRatingsUsEquitiesRequest build() {
        return new APIGetAnalystRatingsUsEquitiesRequest(this);
      }
    }
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param apiRequest {@link APIGetEarningsEstimateRequest}
   * @return GetEarningsEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsEstimate200Response getEarningsEstimate(APIGetEarningsEstimateRequest apiRequest) throws ApiException {
    return getEarningsEstimate(apiRequest, null);
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param apiRequest {@link APIGetEarningsEstimateRequest}
   * @param headers Optional headers to include in the request
   * @return GetEarningsEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsEstimate200Response getEarningsEstimate(APIGetEarningsEstimateRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    return getEarningsEstimate(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param apiRequest {@link APIGetEarningsEstimateRequest}
   * @return ApiResponse&lt;GetEarningsEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsEstimate200Response> getEarningsEstimateWithHttpInfo(APIGetEarningsEstimateRequest apiRequest) throws ApiException {
    return getEarningsEstimateWithHttpInfo(apiRequest, null);
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param apiRequest {@link APIGetEarningsEstimateRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarningsEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsEstimate200Response> getEarningsEstimateWithHttpInfo(APIGetEarningsEstimateRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    return getEarningsEstimateWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @return GetEarningsEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsEstimate200Response getEarningsEstimate(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getEarningsEstimate(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param headers Optional headers to include in the request
   * @return GetEarningsEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsEstimate200Response getEarningsEstimate(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEarningsEstimate200Response> localVarResponse = getEarningsEstimateWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
    return localVarResponse.getData();
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @return ApiResponse&lt;GetEarningsEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsEstimate200Response> getEarningsEstimateWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getEarningsEstimateWithHttpInfo(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Earnings estimate
   * The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarningsEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsEstimate200Response> getEarningsEstimateWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEarningsEstimateRequestBuilder(symbol, figi, isin, cusip, country, exchange, headers);
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
          throw getApiException("getEarningsEstimate", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEarningsEstimate200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEarningsEstimate200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEarningsEstimate200Response>() {});
        

        return new ApiResponse<GetEarningsEstimate200Response>(
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

  private HttpRequest.Builder getEarningsEstimateRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/earnings_estimate";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));

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


  public static final class APIGetEarningsEstimateRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)

    private APIGetEarningsEstimateRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String country;
      private String exchange;

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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public APIGetEarningsEstimateRequest build() {
        return new APIGetEarningsEstimateRequest(this);
      }
    }
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param apiRequest {@link APIGetEpsRevisionsRequest}
   * @return GetEpsRevisions200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsRevisions200Response getEpsRevisions(APIGetEpsRevisionsRequest apiRequest) throws ApiException {
    return getEpsRevisions(apiRequest, null);
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param apiRequest {@link APIGetEpsRevisionsRequest}
   * @param headers Optional headers to include in the request
   * @return GetEpsRevisions200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsRevisions200Response getEpsRevisions(APIGetEpsRevisionsRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    return getEpsRevisions(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param apiRequest {@link APIGetEpsRevisionsRequest}
   * @return ApiResponse&lt;GetEpsRevisions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsRevisions200Response> getEpsRevisionsWithHttpInfo(APIGetEpsRevisionsRequest apiRequest) throws ApiException {
    return getEpsRevisionsWithHttpInfo(apiRequest, null);
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param apiRequest {@link APIGetEpsRevisionsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEpsRevisions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsRevisions200Response> getEpsRevisionsWithHttpInfo(APIGetEpsRevisionsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    return getEpsRevisionsWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @return GetEpsRevisions200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsRevisions200Response getEpsRevisions(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getEpsRevisions(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param headers Optional headers to include in the request
   * @return GetEpsRevisions200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsRevisions200Response getEpsRevisions(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEpsRevisions200Response> localVarResponse = getEpsRevisionsWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
    return localVarResponse.getData();
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @return ApiResponse&lt;GetEpsRevisions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsRevisions200Response> getEpsRevisionsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getEpsRevisionsWithHttpInfo(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * EPS revisions
   * The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEpsRevisions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsRevisions200Response> getEpsRevisionsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEpsRevisionsRequestBuilder(symbol, figi, isin, cusip, country, exchange, headers);
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
          throw getApiException("getEpsRevisions", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEpsRevisions200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEpsRevisions200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEpsRevisions200Response>() {});
        

        return new ApiResponse<GetEpsRevisions200Response>(
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

  private HttpRequest.Builder getEpsRevisionsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/eps_revisions";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));

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


  public static final class APIGetEpsRevisionsRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)

    private APIGetEpsRevisionsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String country;
      private String exchange;

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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public APIGetEpsRevisionsRequest build() {
        return new APIGetEpsRevisionsRequest(this);
      }
    }
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param apiRequest {@link APIGetEpsTrendRequest}
   * @return GetEpsTrend200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsTrend200Response getEpsTrend(APIGetEpsTrendRequest apiRequest) throws ApiException {
    return getEpsTrend(apiRequest, null);
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param apiRequest {@link APIGetEpsTrendRequest}
   * @param headers Optional headers to include in the request
   * @return GetEpsTrend200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsTrend200Response getEpsTrend(APIGetEpsTrendRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    return getEpsTrend(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param apiRequest {@link APIGetEpsTrendRequest}
   * @return ApiResponse&lt;GetEpsTrend200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsTrend200Response> getEpsTrendWithHttpInfo(APIGetEpsTrendRequest apiRequest) throws ApiException {
    return getEpsTrendWithHttpInfo(apiRequest, null);
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param apiRequest {@link APIGetEpsTrendRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEpsTrend200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsTrend200Response> getEpsTrendWithHttpInfo(APIGetEpsTrendRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    return getEpsTrendWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @return GetEpsTrend200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsTrend200Response getEpsTrend(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getEpsTrend(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param headers Optional headers to include in the request
   * @return GetEpsTrend200Response
   * @throws ApiException if fails to make API call
   */
  public GetEpsTrend200Response getEpsTrend(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEpsTrend200Response> localVarResponse = getEpsTrendWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
    return localVarResponse.getData();
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @return ApiResponse&lt;GetEpsTrend200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsTrend200Response> getEpsTrendWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getEpsTrendWithHttpInfo(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * EPS trend
   * The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEpsTrend200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEpsTrend200Response> getEpsTrendWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEpsTrendRequestBuilder(symbol, figi, isin, cusip, country, exchange, headers);
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
          throw getApiException("getEpsTrend", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEpsTrend200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEpsTrend200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEpsTrend200Response>() {});
        

        return new ApiResponse<GetEpsTrend200Response>(
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

  private HttpRequest.Builder getEpsTrendRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/eps_trend";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));

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


  public static final class APIGetEpsTrendRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)

    private APIGetEpsTrendRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String country;
      private String exchange;

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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public APIGetEpsTrendRequest build() {
        return new APIGetEpsTrendRequest(this);
      }
    }
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param apiRequest {@link APIGetGrowthEstimatesRequest}
   * @return GetGrowthEstimates200Response
   * @throws ApiException if fails to make API call
   */
  public GetGrowthEstimates200Response getGrowthEstimates(APIGetGrowthEstimatesRequest apiRequest) throws ApiException {
    return getGrowthEstimates(apiRequest, null);
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param apiRequest {@link APIGetGrowthEstimatesRequest}
   * @param headers Optional headers to include in the request
   * @return GetGrowthEstimates200Response
   * @throws ApiException if fails to make API call
   */
  public GetGrowthEstimates200Response getGrowthEstimates(APIGetGrowthEstimatesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    return getGrowthEstimates(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param apiRequest {@link APIGetGrowthEstimatesRequest}
   * @return ApiResponse&lt;GetGrowthEstimates200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetGrowthEstimates200Response> getGrowthEstimatesWithHttpInfo(APIGetGrowthEstimatesRequest apiRequest) throws ApiException {
    return getGrowthEstimatesWithHttpInfo(apiRequest, null);
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param apiRequest {@link APIGetGrowthEstimatesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetGrowthEstimates200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetGrowthEstimates200Response> getGrowthEstimatesWithHttpInfo(APIGetGrowthEstimatesRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    return getGrowthEstimatesWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @return GetGrowthEstimates200Response
   * @throws ApiException if fails to make API call
   */
  public GetGrowthEstimates200Response getGrowthEstimates(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getGrowthEstimates(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param headers Optional headers to include in the request
   * @return GetGrowthEstimates200Response
   * @throws ApiException if fails to make API call
   */
  public GetGrowthEstimates200Response getGrowthEstimates(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    ApiResponse<GetGrowthEstimates200Response> localVarResponse = getGrowthEstimatesWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
    return localVarResponse.getData();
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @return ApiResponse&lt;GetGrowthEstimates200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetGrowthEstimates200Response> getGrowthEstimatesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getGrowthEstimatesWithHttpInfo(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Growth estimates
   * The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetGrowthEstimates200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetGrowthEstimates200Response> getGrowthEstimatesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getGrowthEstimatesRequestBuilder(symbol, figi, isin, cusip, country, exchange, headers);
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
          throw getApiException("getGrowthEstimates", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetGrowthEstimates200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetGrowthEstimates200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetGrowthEstimates200Response>() {});
        

        return new ApiResponse<GetGrowthEstimates200Response>(
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

  private HttpRequest.Builder getGrowthEstimatesRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/growth_estimates";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));

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


  public static final class APIGetGrowthEstimatesRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)

    private APIGetGrowthEstimatesRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String country;
      private String exchange;

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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public APIGetGrowthEstimatesRequest build() {
        return new APIGetGrowthEstimatesRequest(this);
      }
    }
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param apiRequest {@link APIGetPriceTargetRequest}
   * @return GetPriceTarget200Response
   * @throws ApiException if fails to make API call
   */
  public GetPriceTarget200Response getPriceTarget(APIGetPriceTargetRequest apiRequest) throws ApiException {
    return getPriceTarget(apiRequest, null);
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param apiRequest {@link APIGetPriceTargetRequest}
   * @param headers Optional headers to include in the request
   * @return GetPriceTarget200Response
   * @throws ApiException if fails to make API call
   */
  public GetPriceTarget200Response getPriceTarget(APIGetPriceTargetRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    return getPriceTarget(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param apiRequest {@link APIGetPriceTargetRequest}
   * @return ApiResponse&lt;GetPriceTarget200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPriceTarget200Response> getPriceTargetWithHttpInfo(APIGetPriceTargetRequest apiRequest) throws ApiException {
    return getPriceTargetWithHttpInfo(apiRequest, null);
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param apiRequest {@link APIGetPriceTargetRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetPriceTarget200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPriceTarget200Response> getPriceTargetWithHttpInfo(APIGetPriceTargetRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    return getPriceTargetWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @return GetPriceTarget200Response
   * @throws ApiException if fails to make API call
   */
  public GetPriceTarget200Response getPriceTarget(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getPriceTarget(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param headers Optional headers to include in the request
   * @return GetPriceTarget200Response
   * @throws ApiException if fails to make API call
   */
  public GetPriceTarget200Response getPriceTarget(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    ApiResponse<GetPriceTarget200Response> localVarResponse = getPriceTargetWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
    return localVarResponse.getData();
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @return ApiResponse&lt;GetPriceTarget200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPriceTarget200Response> getPriceTargetWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getPriceTargetWithHttpInfo(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Price target
   * The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetPriceTarget200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPriceTarget200Response> getPriceTargetWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getPriceTargetRequestBuilder(symbol, figi, isin, cusip, country, exchange, headers);
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
          throw getApiException("getPriceTarget", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetPriceTarget200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetPriceTarget200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetPriceTarget200Response>() {});
        

        return new ApiResponse<GetPriceTarget200Response>(
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

  private HttpRequest.Builder getPriceTargetRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/price_target";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));

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


  public static final class APIGetPriceTargetRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)

    private APIGetPriceTargetRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String country;
      private String exchange;

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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public APIGetPriceTargetRequest build() {
        return new APIGetPriceTargetRequest(this);
      }
    }
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param apiRequest {@link APIGetRecommendationsRequest}
   * @return GetRecommendations200Response
   * @throws ApiException if fails to make API call
   */
  public GetRecommendations200Response getRecommendations(APIGetRecommendationsRequest apiRequest) throws ApiException {
    return getRecommendations(apiRequest, null);
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param apiRequest {@link APIGetRecommendationsRequest}
   * @param headers Optional headers to include in the request
   * @return GetRecommendations200Response
   * @throws ApiException if fails to make API call
   */
  public GetRecommendations200Response getRecommendations(APIGetRecommendationsRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    return getRecommendations(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param apiRequest {@link APIGetRecommendationsRequest}
   * @return ApiResponse&lt;GetRecommendations200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRecommendations200Response> getRecommendationsWithHttpInfo(APIGetRecommendationsRequest apiRequest) throws ApiException {
    return getRecommendationsWithHttpInfo(apiRequest, null);
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param apiRequest {@link APIGetRecommendationsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetRecommendations200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRecommendations200Response> getRecommendationsWithHttpInfo(APIGetRecommendationsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    return getRecommendationsWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60;. (optional)
   * @return GetRecommendations200Response
   * @throws ApiException if fails to make API call
   */
  public GetRecommendations200Response getRecommendations(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getRecommendations(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60;. (optional)
   * @param headers Optional headers to include in the request
   * @return GetRecommendations200Response
   * @throws ApiException if fails to make API call
   */
  public GetRecommendations200Response getRecommendations(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    ApiResponse<GetRecommendations200Response> localVarResponse = getRecommendationsWithHttpInfo(symbol, figi, isin, cusip, country, exchange, headers);
    return localVarResponse.getData();
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60;. (optional)
   * @return ApiResponse&lt;GetRecommendations200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRecommendations200Response> getRecommendationsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange) throws ApiException {
    return getRecommendationsWithHttpInfo(symbol, figi, isin, cusip, country, exchange, null);
  }

  /**
   * Recommendations
   * The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.
   * @param symbol Filter by symbol (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60;. (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetRecommendations200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRecommendations200Response> getRecommendationsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getRecommendationsRequestBuilder(symbol, figi, isin, cusip, country, exchange, headers);
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
          throw getApiException("getRecommendations", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetRecommendations200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetRecommendations200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetRecommendations200Response>() {});
        

        return new ApiResponse<GetRecommendations200Response>(
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

  private HttpRequest.Builder getRecommendationsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/recommendations";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));

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


  public static final class APIGetRecommendationsRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60;. (optional)

    private APIGetRecommendationsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String country;
      private String exchange;

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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public APIGetRecommendationsRequest build() {
        return new APIGetRecommendationsRequest(this);
      }
    }
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param apiRequest {@link APIGetRevenueEstimateRequest}
   * @return GetRevenueEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetRevenueEstimate200Response getRevenueEstimate(APIGetRevenueEstimateRequest apiRequest) throws ApiException {
    return getRevenueEstimate(apiRequest, null);
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param apiRequest {@link APIGetRevenueEstimateRequest}
   * @param headers Optional headers to include in the request
   * @return GetRevenueEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetRevenueEstimate200Response getRevenueEstimate(APIGetRevenueEstimateRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    return getRevenueEstimate(symbol, figi, isin, cusip, country, exchange, dp, headers);
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param apiRequest {@link APIGetRevenueEstimateRequest}
   * @return ApiResponse&lt;GetRevenueEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRevenueEstimate200Response> getRevenueEstimateWithHttpInfo(APIGetRevenueEstimateRequest apiRequest) throws ApiException {
    return getRevenueEstimateWithHttpInfo(apiRequest, null);
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param apiRequest {@link APIGetRevenueEstimateRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetRevenueEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRevenueEstimate200Response> getRevenueEstimateWithHttpInfo(APIGetRevenueEstimateRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String country = apiRequest.country();
    String exchange = apiRequest.exchange();
    Long dp = apiRequest.dp();
    return getRevenueEstimateWithHttpInfo(symbol, figi, isin, cusip, country, exchange, dp, headers);
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param dp Number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @return GetRevenueEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetRevenueEstimate200Response getRevenueEstimate(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable Long dp) throws ApiException {
    return getRevenueEstimate(symbol, figi, isin, cusip, country, exchange, dp, null);
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param dp Number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetRevenueEstimate200Response
   * @throws ApiException if fails to make API call
   */
  public GetRevenueEstimate200Response getRevenueEstimate(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetRevenueEstimate200Response> localVarResponse = getRevenueEstimateWithHttpInfo(symbol, figi, isin, cusip, country, exchange, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param dp Number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @return ApiResponse&lt;GetRevenueEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRevenueEstimate200Response> getRevenueEstimateWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable Long dp) throws ApiException {
    return getRevenueEstimateWithHttpInfo(symbol, figi, isin, cusip, country, exchange, dp, null);
  }

  /**
   * Revenue estimate
   * The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param exchange Filter by exchange name (optional)
   * @param dp Number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetRevenueEstimate200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetRevenueEstimate200Response> getRevenueEstimateWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getRevenueEstimateRequestBuilder(symbol, figi, isin, cusip, country, exchange, dp, headers);
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
          throw getApiException("getRevenueEstimate", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetRevenueEstimate200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetRevenueEstimate200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetRevenueEstimate200Response>() {});
        

        return new ApiResponse<GetRevenueEstimate200Response>(
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

  private HttpRequest.Builder getRevenueEstimateRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/revenue_estimate";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
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


  public static final class APIGetRevenueEstimateRequest {
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private Long dp; // Number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 5)

    private APIGetRevenueEstimateRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.country = builder.country;
      this.exchange = builder.exchange;
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
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
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
      private String country;
      private String exchange;
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
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public APIGetRevenueEstimateRequest build() {
        return new APIGetRevenueEstimateRequest(this);
      }
    }
  }

}
