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
import com.twelvedata.client.model.GetBonds200Response;
import com.twelvedata.client.model.GetCommodities200Response;
import com.twelvedata.client.model.GetCountries200Response;
import com.twelvedata.client.model.GetCrossListings200Response;
import com.twelvedata.client.model.GetCryptocurrencies200Response;
import com.twelvedata.client.model.GetCryptocurrencyExchanges200Response;
import com.twelvedata.client.model.GetEarliestTimestamp200Response;
import com.twelvedata.client.model.GetEtf200Response;
import com.twelvedata.client.model.GetExchangeSchedule200Response;
import com.twelvedata.client.model.GetExchanges200Response;
import com.twelvedata.client.model.GetForexPairs200Response;
import com.twelvedata.client.model.GetFunds200Response;
import com.twelvedata.client.model.GetInstrumentType200Response;
import com.twelvedata.client.model.GetIntervals200Response;
import com.twelvedata.client.model.GetStocks200Response;
import com.twelvedata.client.model.GetSymbolSearch200Response;
import com.twelvedata.client.model.GetTechnicalIndicators200Response;
import com.twelvedata.client.model.IntervalEnum;
import com.twelvedata.client.model.MarketStateResponseItem;
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
public class ReferenceDataApi {
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

  public ReferenceDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReferenceDataApi(ApiClient apiClient) {
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
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetBondsRequest}
   * @return GetBonds200Response
   * @throws ApiException if fails to make API call
   */
  public GetBonds200Response getBonds(APIGetBondsRequest apiRequest) throws ApiException {
    return getBonds(apiRequest, null);
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetBondsRequest}
   * @param headers Optional headers to include in the request
   * @return GetBonds200Response
   * @throws ApiException if fails to make API call
   */
  public GetBonds200Response getBonds(APIGetBondsRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean showPlan = apiRequest.showPlan();
    @javax.annotation.Nullable
    Long page = apiRequest.page();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getBonds(symbol, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetBondsRequest}
   * @return ApiResponse&lt;GetBonds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBonds200Response> getBondsWithHttpInfo(APIGetBondsRequest apiRequest) throws ApiException {
    return getBondsWithHttpInfo(apiRequest, null);
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetBondsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetBonds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBonds200Response> getBondsWithHttpInfo(APIGetBondsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String exchange = apiRequest.exchange();
    String country = apiRequest.country();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean showPlan = apiRequest.showPlan();
    Long page = apiRequest.page();
    Long outputsize = apiRequest.outputsize();
    return getBondsWithHttpInfo(symbol, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @return GetBonds200Response
   * @throws ApiException if fails to make API call
   */
  public GetBonds200Response getBonds(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getBonds(symbol, exchange, country, format, delimiter, showPlan, page, outputsize, null);
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @param headers Optional headers to include in the request
   * @return GetBonds200Response
   * @throws ApiException if fails to make API call
   */
  public GetBonds200Response getBonds(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetBonds200Response> localVarResponse = getBondsWithHttpInfo(symbol, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @return ApiResponse&lt;GetBonds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBonds200Response> getBondsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getBondsWithHttpInfo(symbol, exchange, country, format, delimiter, showPlan, page, outputsize, null);
  }

  /**
   * Fixed income
   * The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetBonds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBonds200Response> getBondsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getBondsRequestBuilder(symbol, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
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
          throw getApiException("getBonds", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetBonds200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetBonds200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetBonds200Response>() {});
        

        return new ApiResponse<GetBonds200Response>(
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

  private HttpRequest.Builder getBondsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/bonds";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "show_plan";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("show_plan", showPlan));
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


  public static final class APIGetBondsRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean showPlan; // Adds info on which plan symbol is available (optional, default to false)
    @javax.annotation.Nullable
    private Long page; // Page number of the results to fetch (optional, default to 1)
    @javax.annotation.Nullable
    private Long outputsize; // Determines the number of data points returned in the output (optional, default to 5000)

    private APIGetBondsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.exchange = builder.exchange;
      this.country = builder.country;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.showPlan = builder.showPlan;
      this.page = builder.page;
      this.outputsize = builder.outputsize;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
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
    public Boolean showPlan() {
      return showPlan;
    }
    @javax.annotation.Nullable
    public Long page() {
      return page;
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
      private String exchange;
      private String country;
      private FormatEnum format;
      private String delimiter;
      private Boolean showPlan;
      private Long page;
      private Long outputsize;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
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
      public Builder showPlan(@javax.annotation.Nullable Boolean showPlan) {
        this.showPlan = showPlan;
        return this;
      }
      public Builder page(@javax.annotation.Nullable Long page) {
        this.page = page;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetBondsRequest build() {
        return new APIGetBondsRequest(this);
      }
    }
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param apiRequest {@link APIGetCommoditiesRequest}
   * @return GetCommodities200Response
   * @throws ApiException if fails to make API call
   */
  public GetCommodities200Response getCommodities(APIGetCommoditiesRequest apiRequest) throws ApiException {
    return getCommodities(apiRequest, null);
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param apiRequest {@link APIGetCommoditiesRequest}
   * @param headers Optional headers to include in the request
   * @return GetCommodities200Response
   * @throws ApiException if fails to make API call
   */
  public GetCommodities200Response getCommodities(APIGetCommoditiesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String category = apiRequest.category();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    return getCommodities(symbol, category, format, delimiter, headers);
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param apiRequest {@link APIGetCommoditiesRequest}
   * @return ApiResponse&lt;GetCommodities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCommodities200Response> getCommoditiesWithHttpInfo(APIGetCommoditiesRequest apiRequest) throws ApiException {
    return getCommoditiesWithHttpInfo(apiRequest, null);
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param apiRequest {@link APIGetCommoditiesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCommodities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCommodities200Response> getCommoditiesWithHttpInfo(APIGetCommoditiesRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String category = apiRequest.category();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    return getCommoditiesWithHttpInfo(symbol, category, format, delimiter, headers);
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param category Filter by category of commodity (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @return GetCommodities200Response
   * @throws ApiException if fails to make API call
   */
  public GetCommodities200Response getCommodities(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String category, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getCommodities(symbol, category, format, delimiter, null);
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param category Filter by category of commodity (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return GetCommodities200Response
   * @throws ApiException if fails to make API call
   */
  public GetCommodities200Response getCommodities(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String category, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCommodities200Response> localVarResponse = getCommoditiesWithHttpInfo(symbol, category, format, delimiter, headers);
    return localVarResponse.getData();
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param category Filter by category of commodity (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @return ApiResponse&lt;GetCommodities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCommodities200Response> getCommoditiesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String category, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getCommoditiesWithHttpInfo(symbol, category, format, delimiter, null);
  }

  /**
   * Commodities
   * The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param category Filter by category of commodity (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCommodities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCommodities200Response> getCommoditiesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String category, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCommoditiesRequestBuilder(symbol, category, format, delimiter, headers);
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
          throw getApiException("getCommodities", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCommodities200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCommodities200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCommodities200Response>() {});
        

        return new ApiResponse<GetCommodities200Response>(
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

  private HttpRequest.Builder getCommoditiesRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String category, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/commodities";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "category";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("category", category));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));

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


  public static final class APIGetCommoditiesRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String category; // Filter by category of commodity (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)

    private APIGetCommoditiesRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.category = builder.category;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String category() {
      return category;
    }
    @javax.annotation.Nullable
    public FormatEnum format() {
      return format;
    }
    @javax.annotation.Nullable
    public String delimiter() {
      return delimiter;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String category;
      private FormatEnum format;
      private String delimiter;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder category(@javax.annotation.Nullable String category) {
        this.category = category;
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
      public APIGetCommoditiesRequest build() {
        return new APIGetCommoditiesRequest(this);
      }
    }
  }

  /**
   * Countries
   * The countries endpoint provides a comprehensive list of countries, including their ISO codes, official names, capitals, and currencies. This data is essential for applications requiring accurate country information for tasks such as localization, currency conversion, or geographic analysis.
   * @return GetCountries200Response
   * @throws ApiException if fails to make API call
   */
  public GetCountries200Response getCountries() throws ApiException {
    return getCountries(null);
  }

  /**
   * Countries
   * The countries endpoint provides a comprehensive list of countries, including their ISO codes, official names, capitals, and currencies. This data is essential for applications requiring accurate country information for tasks such as localization, currency conversion, or geographic analysis.
   * @param headers Optional headers to include in the request
   * @return GetCountries200Response
   * @throws ApiException if fails to make API call
   */
  public GetCountries200Response getCountries(Map<String, String> headers) throws ApiException {
    ApiResponse<GetCountries200Response> localVarResponse = getCountriesWithHttpInfo(headers);
    return localVarResponse.getData();
  }

  /**
   * Countries
   * The countries endpoint provides a comprehensive list of countries, including their ISO codes, official names, capitals, and currencies. This data is essential for applications requiring accurate country information for tasks such as localization, currency conversion, or geographic analysis.
   * @return ApiResponse&lt;GetCountries200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCountries200Response> getCountriesWithHttpInfo() throws ApiException {
    return getCountriesWithHttpInfo(null);
  }

  /**
   * Countries
   * The countries endpoint provides a comprehensive list of countries, including their ISO codes, official names, capitals, and currencies. This data is essential for applications requiring accurate country information for tasks such as localization, currency conversion, or geographic analysis.
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCountries200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCountries200Response> getCountriesWithHttpInfo(Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCountriesRequestBuilder(headers);
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
          throw getApiException("getCountries", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCountries200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCountries200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCountries200Response>() {});
        

        return new ApiResponse<GetCountries200Response>(
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

  private HttpRequest.Builder getCountriesRequestBuilder(Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/countries";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param apiRequest {@link APIGetCrossListingsRequest}
   * @return GetCrossListings200Response
   * @throws ApiException if fails to make API call
   */
  public GetCrossListings200Response getCrossListings(APIGetCrossListingsRequest apiRequest) throws ApiException {
    return getCrossListings(apiRequest, null);
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param apiRequest {@link APIGetCrossListingsRequest}
   * @param headers Optional headers to include in the request
   * @return GetCrossListings200Response
   * @throws ApiException if fails to make API call
   */
  public GetCrossListings200Response getCrossListings(APIGetCrossListingsRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    return getCrossListings(symbol, exchange, micCode, country, headers);
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param apiRequest {@link APIGetCrossListingsRequest}
   * @return ApiResponse&lt;GetCrossListings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCrossListings200Response> getCrossListingsWithHttpInfo(APIGetCrossListingsRequest apiRequest) throws ApiException {
    return getCrossListingsWithHttpInfo(apiRequest, null);
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param apiRequest {@link APIGetCrossListingsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCrossListings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCrossListings200Response> getCrossListingsWithHttpInfo(APIGetCrossListingsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    return getCrossListingsWithHttpInfo(symbol, exchange, micCode, country, headers);
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param symbol The ticker symbol of an instrument for which data is requested (required)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Country to which stock exchange belongs to (optional)
   * @return GetCrossListings200Response
   * @throws ApiException if fails to make API call
   */
  public GetCrossListings200Response getCrossListings(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getCrossListings(symbol, exchange, micCode, country, null);
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param symbol The ticker symbol of an instrument for which data is requested (required)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Country to which stock exchange belongs to (optional)
   * @param headers Optional headers to include in the request
   * @return GetCrossListings200Response
   * @throws ApiException if fails to make API call
   */
  public GetCrossListings200Response getCrossListings(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCrossListings200Response> localVarResponse = getCrossListingsWithHttpInfo(symbol, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param symbol The ticker symbol of an instrument for which data is requested (required)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Country to which stock exchange belongs to (optional)
   * @return ApiResponse&lt;GetCrossListings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCrossListings200Response> getCrossListingsWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getCrossListingsWithHttpInfo(symbol, exchange, micCode, country, null);
  }

  /**
   * Cross listings
   * The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.
   * @param symbol The ticker symbol of an instrument for which data is requested (required)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Country to which stock exchange belongs to (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCrossListings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCrossListings200Response> getCrossListingsWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCrossListingsRequestBuilder(symbol, exchange, micCode, country, headers);
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
          throw getApiException("getCrossListings", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCrossListings200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCrossListings200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCrossListings200Response>() {});
        

        return new ApiResponse<GetCrossListings200Response>(
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

  private HttpRequest.Builder getCrossListingsRequestBuilder(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getCrossListings");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cross_listings";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
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


  public static final class APIGetCrossListingsRequest {
    @javax.annotation.Nonnull
    private String symbol; // The ticker symbol of an instrument for which data is requested (required)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Country to which stock exchange belongs to (optional)

    private APIGetCrossListingsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
    }
    @javax.annotation.Nonnull
    public String symbol() {
      return symbol;
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
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String exchange;
      private String micCode;
      private String country;

      public Builder symbol(@javax.annotation.Nonnull String symbol) {
        this.symbol = symbol;
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
      public APIGetCrossListingsRequest build() {
        return new APIGetCrossListingsRequest(this);
      }
    }
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param apiRequest {@link APIGetCryptocurrenciesRequest}
   * @return GetCryptocurrencies200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencies200Response getCryptocurrencies(APIGetCryptocurrenciesRequest apiRequest) throws ApiException {
    return getCryptocurrencies(apiRequest, null);
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param apiRequest {@link APIGetCryptocurrenciesRequest}
   * @param headers Optional headers to include in the request
   * @return GetCryptocurrencies200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencies200Response getCryptocurrencies(APIGetCryptocurrenciesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String currencyBase = apiRequest.currencyBase();
    @javax.annotation.Nullable
    String currencyQuote = apiRequest.currencyQuote();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    return getCryptocurrencies(symbol, exchange, currencyBase, currencyQuote, format, delimiter, headers);
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param apiRequest {@link APIGetCryptocurrenciesRequest}
   * @return ApiResponse&lt;GetCryptocurrencies200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencies200Response> getCryptocurrenciesWithHttpInfo(APIGetCryptocurrenciesRequest apiRequest) throws ApiException {
    return getCryptocurrenciesWithHttpInfo(apiRequest, null);
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param apiRequest {@link APIGetCryptocurrenciesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCryptocurrencies200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencies200Response> getCryptocurrenciesWithHttpInfo(APIGetCryptocurrenciesRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String exchange = apiRequest.exchange();
    String currencyBase = apiRequest.currencyBase();
    String currencyQuote = apiRequest.currencyQuote();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    return getCryptocurrenciesWithHttpInfo(symbol, exchange, currencyBase, currencyQuote, format, delimiter, headers);
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @return GetCryptocurrencies200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencies200Response getCryptocurrencies(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getCryptocurrencies(symbol, exchange, currencyBase, currencyQuote, format, delimiter, null);
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return GetCryptocurrencies200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencies200Response getCryptocurrencies(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCryptocurrencies200Response> localVarResponse = getCryptocurrenciesWithHttpInfo(symbol, exchange, currencyBase, currencyQuote, format, delimiter, headers);
    return localVarResponse.getData();
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @return ApiResponse&lt;GetCryptocurrencies200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencies200Response> getCryptocurrenciesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getCryptocurrenciesWithHttpInfo(symbol, exchange, currencyBase, currencyQuote, format, delimiter, null);
  }

  /**
   * Cryptocurrency pairs
   * The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCryptocurrencies200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencies200Response> getCryptocurrenciesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCryptocurrenciesRequestBuilder(symbol, exchange, currencyBase, currencyQuote, format, delimiter, headers);
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
          throw getApiException("getCryptocurrencies", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCryptocurrencies200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCryptocurrencies200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCryptocurrencies200Response>() {});
        

        return new ApiResponse<GetCryptocurrencies200Response>(
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

  private HttpRequest.Builder getCryptocurrenciesRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cryptocurrencies";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "currency_base";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("currency_base", currencyBase));
    localVarQueryParameterBaseName = "currency_quote";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("currency_quote", currencyQuote));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));

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


  public static final class APIGetCryptocurrenciesRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. (optional)
    @javax.annotation.Nullable
    private String currencyBase; // Filter by currency base (optional)
    @javax.annotation.Nullable
    private String currencyQuote; // Filter by currency quote (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)

    private APIGetCryptocurrenciesRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.exchange = builder.exchange;
      this.currencyBase = builder.currencyBase;
      this.currencyQuote = builder.currencyQuote;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String currencyBase() {
      return currencyBase;
    }
    @javax.annotation.Nullable
    public String currencyQuote() {
      return currencyQuote;
    }
    @javax.annotation.Nullable
    public FormatEnum format() {
      return format;
    }
    @javax.annotation.Nullable
    public String delimiter() {
      return delimiter;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String exchange;
      private String currencyBase;
      private String currencyQuote;
      private FormatEnum format;
      private String delimiter;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder currencyBase(@javax.annotation.Nullable String currencyBase) {
        this.currencyBase = currencyBase;
        return this;
      }
      public Builder currencyQuote(@javax.annotation.Nullable String currencyQuote) {
        this.currencyQuote = currencyQuote;
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
      public APIGetCryptocurrenciesRequest build() {
        return new APIGetCryptocurrenciesRequest(this);
      }
    }
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param apiRequest {@link APIGetCryptocurrencyExchangesRequest}
   * @return GetCryptocurrencyExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencyExchanges200Response getCryptocurrencyExchanges(APIGetCryptocurrencyExchangesRequest apiRequest) throws ApiException {
    return getCryptocurrencyExchanges(apiRequest, null);
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param apiRequest {@link APIGetCryptocurrencyExchangesRequest}
   * @param headers Optional headers to include in the request
   * @return GetCryptocurrencyExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencyExchanges200Response getCryptocurrencyExchanges(APIGetCryptocurrencyExchangesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    return getCryptocurrencyExchanges(format, delimiter, headers);
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param apiRequest {@link APIGetCryptocurrencyExchangesRequest}
   * @return ApiResponse&lt;GetCryptocurrencyExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencyExchanges200Response> getCryptocurrencyExchangesWithHttpInfo(APIGetCryptocurrencyExchangesRequest apiRequest) throws ApiException {
    return getCryptocurrencyExchangesWithHttpInfo(apiRequest, null);
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param apiRequest {@link APIGetCryptocurrencyExchangesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCryptocurrencyExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencyExchanges200Response> getCryptocurrencyExchangesWithHttpInfo(APIGetCryptocurrencyExchangesRequest apiRequest, Map<String, String> headers) throws ApiException {
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    return getCryptocurrencyExchangesWithHttpInfo(format, delimiter, headers);
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @return GetCryptocurrencyExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencyExchanges200Response getCryptocurrencyExchanges(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getCryptocurrencyExchanges(format, delimiter, null);
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return GetCryptocurrencyExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetCryptocurrencyExchanges200Response getCryptocurrencyExchanges(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCryptocurrencyExchanges200Response> localVarResponse = getCryptocurrencyExchangesWithHttpInfo(format, delimiter, headers);
    return localVarResponse.getData();
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @return ApiResponse&lt;GetCryptocurrencyExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencyExchanges200Response> getCryptocurrencyExchangesWithHttpInfo(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getCryptocurrencyExchangesWithHttpInfo(format, delimiter, null);
  }

  /**
   * Cryptocurrency exchanges
   * The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCryptocurrencyExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCryptocurrencyExchanges200Response> getCryptocurrencyExchangesWithHttpInfo(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCryptocurrencyExchangesRequestBuilder(format, delimiter, headers);
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
          throw getApiException("getCryptocurrencyExchanges", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCryptocurrencyExchanges200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCryptocurrencyExchanges200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCryptocurrencyExchanges200Response>() {});
        

        return new ApiResponse<GetCryptocurrencyExchanges200Response>(
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

  private HttpRequest.Builder getCryptocurrencyExchangesRequestBuilder(@javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cryptocurrency_exchanges";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));

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


  public static final class APIGetCryptocurrencyExchangesRequest {
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // Specify the delimiter used when downloading the CSV file (optional, default to ;)

    private APIGetCryptocurrencyExchangesRequest(Builder builder) {
      this.format = builder.format;
      this.delimiter = builder.delimiter;
    }
    @javax.annotation.Nullable
    public FormatEnum format() {
      return format;
    }
    @javax.annotation.Nullable
    public String delimiter() {
      return delimiter;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private FormatEnum format;
      private String delimiter;

      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public APIGetCryptocurrencyExchangesRequest build() {
        return new APIGetCryptocurrencyExchangesRequest(this);
      }
    }
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param apiRequest {@link APIGetEarliestTimestampRequest}
   * @return GetEarliestTimestamp200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarliestTimestamp200Response getEarliestTimestamp(APIGetEarliestTimestampRequest apiRequest) throws ApiException {
    return getEarliestTimestamp(apiRequest, null);
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param apiRequest {@link APIGetEarliestTimestampRequest}
   * @param headers Optional headers to include in the request
   * @return GetEarliestTimestamp200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarliestTimestamp200Response getEarliestTimestamp(APIGetEarliestTimestampRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    IntervalEnum interval = apiRequest.interval();
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
    String timezone = apiRequest.timezone();
    return getEarliestTimestamp(interval, symbol, figi, isin, cusip, exchange, micCode, timezone, headers);
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param apiRequest {@link APIGetEarliestTimestampRequest}
   * @return ApiResponse&lt;GetEarliestTimestamp200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarliestTimestamp200Response> getEarliestTimestampWithHttpInfo(APIGetEarliestTimestampRequest apiRequest) throws ApiException {
    return getEarliestTimestampWithHttpInfo(apiRequest, null);
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param apiRequest {@link APIGetEarliestTimestampRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarliestTimestamp200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarliestTimestamp200Response> getEarliestTimestampWithHttpInfo(APIGetEarliestTimestampRequest apiRequest, Map<String, String> headers) throws ApiException {
    IntervalEnum interval = apiRequest.interval();
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String timezone = apiRequest.timezone();
    return getEarliestTimestampWithHttpInfo(interval, symbol, figi, isin, cusip, exchange, micCode, timezone, headers);
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param interval Interval between two consecutive points in time series. (required)
   * @param symbol Symbol ticker of the instrument. (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded. (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard. (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @return GetEarliestTimestamp200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarliestTimestamp200Response getEarliestTimestamp(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String timezone) throws ApiException {
    return getEarliestTimestamp(interval, symbol, figi, isin, cusip, exchange, micCode, timezone, null);
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param interval Interval between two consecutive points in time series. (required)
   * @param symbol Symbol ticker of the instrument. (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded. (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard. (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param headers Optional headers to include in the request
   * @return GetEarliestTimestamp200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarliestTimestamp200Response getEarliestTimestamp(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEarliestTimestamp200Response> localVarResponse = getEarliestTimestampWithHttpInfo(interval, symbol, figi, isin, cusip, exchange, micCode, timezone, headers);
    return localVarResponse.getData();
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param interval Interval between two consecutive points in time series. (required)
   * @param symbol Symbol ticker of the instrument. (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded. (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard. (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @return ApiResponse&lt;GetEarliestTimestamp200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarliestTimestamp200Response> getEarliestTimestampWithHttpInfo(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String timezone) throws ApiException {
    return getEarliestTimestampWithHttpInfo(interval, symbol, figi, isin, cusip, exchange, micCode, timezone, null);
  }

  /**
   * Earliest timestamp
   * The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.
   * @param interval Interval between two consecutive points in time series. (required)
   * @param symbol Symbol ticker of the instrument. (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded. (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard. (optional)
   * @param timezone Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarliestTimestamp200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarliestTimestamp200Response> getEarliestTimestampWithHttpInfo(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEarliestTimestampRequestBuilder(interval, symbol, figi, isin, cusip, exchange, micCode, timezone, headers);
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
          throw getApiException("getEarliestTimestamp", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEarliestTimestamp200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEarliestTimestamp200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEarliestTimestamp200Response>() {});
        

        return new ApiResponse<GetEarliestTimestamp200Response>(
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

  private HttpRequest.Builder getEarliestTimestampRequestBuilder(@javax.annotation.Nonnull IntervalEnum interval, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String timezone, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'interval' is set
    if (interval == null) {
      throw new ApiException(400, "Missing the required parameter 'interval' when calling getEarliestTimestamp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/earliest_timestamp";

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


  public static final class APIGetEarliestTimestampRequest {
    @javax.annotation.Nonnull
    private IntervalEnum interval; // Interval between two consecutive points in time series. (required)
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of the instrument. (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded. (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard. (optional)
    @javax.annotation.Nullable
    private String timezone; // Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; (optional, default to Exchange)

    private APIGetEarliestTimestampRequest(Builder builder) {
      this.interval = builder.interval;
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.timezone = builder.timezone;
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
    public String timezone() {
      return timezone;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private IntervalEnum interval;
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String exchange;
      private String micCode;
      private String timezone;

      public Builder interval(@javax.annotation.Nonnull IntervalEnum interval) {
        this.interval = interval;
        return this;
      }
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
      public Builder timezone(@javax.annotation.Nullable String timezone) {
        this.timezone = timezone;
        return this;
      }
      public APIGetEarliestTimestampRequest build() {
        return new APIGetEarliestTimestampRequest(this);
      }
    }
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param apiRequest {@link APIGetEtfRequest}
   * @return GetEtf200Response
   * @throws ApiException if fails to make API call
   */
  public GetEtf200Response getEtf(APIGetEtfRequest apiRequest) throws ApiException {
    return getEtf(apiRequest, null);
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param apiRequest {@link APIGetEtfRequest}
   * @param headers Optional headers to include in the request
   * @return GetEtf200Response
   * @throws ApiException if fails to make API call
   */
  public GetEtf200Response getEtf(APIGetEtfRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String cik = apiRequest.cik();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean showPlan = apiRequest.showPlan();
    @javax.annotation.Nullable
    Boolean includeDelisted = apiRequest.includeDelisted();
    return getEtf(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted, headers);
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param apiRequest {@link APIGetEtfRequest}
   * @return ApiResponse&lt;GetEtf200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEtf200Response> getEtfWithHttpInfo(APIGetEtfRequest apiRequest) throws ApiException {
    return getEtfWithHttpInfo(apiRequest, null);
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param apiRequest {@link APIGetEtfRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEtf200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEtf200Response> getEtfWithHttpInfo(APIGetEtfRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String cik = apiRequest.cik();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean showPlan = apiRequest.showPlan();
    Boolean includeDelisted = apiRequest.includeDelisted();
    return getEtfWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted, headers);
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @return GetEtf200Response
   * @throws ApiException if fails to make API call
   */
  public GetEtf200Response getEtf(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted) throws ApiException {
    return getEtf(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted, null);
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return GetEtf200Response
   * @throws ApiException if fails to make API call
   */
  public GetEtf200Response getEtf(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEtf200Response> localVarResponse = getEtfWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted, headers);
    return localVarResponse.getData();
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @return ApiResponse&lt;GetEtf200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEtf200Response> getEtfWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted) throws ApiException {
    return getEtfWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted, null);
  }

  /**
   * ETFs
   * The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEtf200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEtf200Response> getEtfWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEtfRequestBuilder(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted, headers);
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
          throw getApiException("getEtf", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEtf200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEtf200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEtf200Response>() {});
        

        return new ApiResponse<GetEtf200Response>(
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

  private HttpRequest.Builder getEtfRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/etfs";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "show_plan";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("show_plan", showPlan));
    localVarQueryParameterBaseName = "include_delisted";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("include_delisted", includeDelisted));

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


  public static final class APIGetEtfRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cik; // The CIK of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String micCode; // Filter by market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean showPlan; // Adds info on which plan symbol is available (optional, default to false)
    @javax.annotation.Nullable
    private Boolean includeDelisted; // Include delisted identifiers (optional, default to false)

    private APIGetEtfRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.cik = builder.cik;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.showPlan = builder.showPlan;
      this.includeDelisted = builder.includeDelisted;
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
    public String cik() {
      return cik;
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
    public FormatEnum format() {
      return format;
    }
    @javax.annotation.Nullable
    public String delimiter() {
      return delimiter;
    }
    @javax.annotation.Nullable
    public Boolean showPlan() {
      return showPlan;
    }
    @javax.annotation.Nullable
    public Boolean includeDelisted() {
      return includeDelisted;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String cik;
      private String exchange;
      private String micCode;
      private String country;
      private FormatEnum format;
      private String delimiter;
      private Boolean showPlan;
      private Boolean includeDelisted;

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
      public Builder cik(@javax.annotation.Nullable String cik) {
        this.cik = cik;
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
      public Builder format(@javax.annotation.Nullable FormatEnum format) {
        this.format = format;
        return this;
      }
      public Builder delimiter(@javax.annotation.Nullable String delimiter) {
        this.delimiter = delimiter;
        return this;
      }
      public Builder showPlan(@javax.annotation.Nullable Boolean showPlan) {
        this.showPlan = showPlan;
        return this;
      }
      public Builder includeDelisted(@javax.annotation.Nullable Boolean includeDelisted) {
        this.includeDelisted = includeDelisted;
        return this;
      }
      public APIGetEtfRequest build() {
        return new APIGetEtfRequest(this);
      }
    }
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param apiRequest {@link APIGetExchangeScheduleRequest}
   * @return GetExchangeSchedule200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchangeSchedule200Response getExchangeSchedule(APIGetExchangeScheduleRequest apiRequest) throws ApiException {
    return getExchangeSchedule(apiRequest, null);
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param apiRequest {@link APIGetExchangeScheduleRequest}
   * @param headers Optional headers to include in the request
   * @return GetExchangeSchedule200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchangeSchedule200Response getExchangeSchedule(APIGetExchangeScheduleRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String micName = apiRequest.micName();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String date = apiRequest.date();
    return getExchangeSchedule(micName, micCode, country, date, headers);
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param apiRequest {@link APIGetExchangeScheduleRequest}
   * @return ApiResponse&lt;GetExchangeSchedule200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchangeSchedule200Response> getExchangeScheduleWithHttpInfo(APIGetExchangeScheduleRequest apiRequest) throws ApiException {
    return getExchangeScheduleWithHttpInfo(apiRequest, null);
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param apiRequest {@link APIGetExchangeScheduleRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetExchangeSchedule200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchangeSchedule200Response> getExchangeScheduleWithHttpInfo(APIGetExchangeScheduleRequest apiRequest, Map<String, String> headers) throws ApiException {
    String micName = apiRequest.micName();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    String date = apiRequest.date();
    return getExchangeScheduleWithHttpInfo(micName, micCode, country, date, headers);
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param micName Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param date &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; (optional)
   * @return GetExchangeSchedule200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchangeSchedule200Response getExchangeSchedule(@javax.annotation.Nullable String micName, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String date) throws ApiException {
    return getExchangeSchedule(micName, micCode, country, date, null);
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param micName Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param date &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return GetExchangeSchedule200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchangeSchedule200Response getExchangeSchedule(@javax.annotation.Nullable String micName, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String date, Map<String, String> headers) throws ApiException {
    ApiResponse<GetExchangeSchedule200Response> localVarResponse = getExchangeScheduleWithHttpInfo(micName, micCode, country, date, headers);
    return localVarResponse.getData();
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param micName Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param date &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; (optional)
   * @return ApiResponse&lt;GetExchangeSchedule200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchangeSchedule200Response> getExchangeScheduleWithHttpInfo(@javax.annotation.Nullable String micName, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String date) throws ApiException {
    return getExchangeScheduleWithHttpInfo(micName, micCode, country, date, null);
  }

  /**
   * Exchanges schedule
   * The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.
   * @param micName Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param date &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetExchangeSchedule200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchangeSchedule200Response> getExchangeScheduleWithHttpInfo(@javax.annotation.Nullable String micName, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String date, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getExchangeScheduleRequestBuilder(micName, micCode, country, date, headers);
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
          throw getApiException("getExchangeSchedule", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetExchangeSchedule200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetExchangeSchedule200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetExchangeSchedule200Response>() {});
        

        return new ApiResponse<GetExchangeSchedule200Response>(
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

  private HttpRequest.Builder getExchangeScheduleRequestBuilder(@javax.annotation.Nullable String micName, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String date, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/exchange_schedule";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "mic_name";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_name", micName));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("date", date));

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


  public static final class APIGetExchangeScheduleRequest {
    @javax.annotation.Nullable
    private String micName; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String micCode; // Filter by market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String date; // &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; (optional)

    private APIGetExchangeScheduleRequest(Builder builder) {
      this.micName = builder.micName;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.date = builder.date;
    }
    @javax.annotation.Nullable
    public String micName() {
      return micName;
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
    public String date() {
      return date;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String micName;
      private String micCode;
      private String country;
      private String date;

      public Builder micName(@javax.annotation.Nullable String micName) {
        this.micName = micName;
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
      public Builder date(@javax.annotation.Nullable String date) {
        this.date = date;
        return this;
      }
      public APIGetExchangeScheduleRequest build() {
        return new APIGetExchangeScheduleRequest(this);
      }
    }
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param apiRequest {@link APIGetExchangesRequest}
   * @return GetExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchanges200Response getExchanges(APIGetExchangesRequest apiRequest) throws ApiException {
    return getExchanges(apiRequest, null);
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param apiRequest {@link APIGetExchangesRequest}
   * @param headers Optional headers to include in the request
   * @return GetExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchanges200Response getExchanges(APIGetExchangesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    TypeEnum type = apiRequest.type();
    @javax.annotation.Nullable
    String name = apiRequest.name();
    @javax.annotation.Nullable
    String code = apiRequest.code();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean showPlan = apiRequest.showPlan();
    return getExchanges(type, name, code, country, format, delimiter, showPlan, headers);
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param apiRequest {@link APIGetExchangesRequest}
   * @return ApiResponse&lt;GetExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchanges200Response> getExchangesWithHttpInfo(APIGetExchangesRequest apiRequest) throws ApiException {
    return getExchangesWithHttpInfo(apiRequest, null);
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param apiRequest {@link APIGetExchangesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchanges200Response> getExchangesWithHttpInfo(APIGetExchangesRequest apiRequest, Map<String, String> headers) throws ApiException {
    TypeEnum type = apiRequest.type();
    String name = apiRequest.name();
    String code = apiRequest.code();
    String country = apiRequest.country();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean showPlan = apiRequest.showPlan();
    return getExchangesWithHttpInfo(type, name, code, country, format, delimiter, showPlan, headers);
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param type The asset class to which the instrument belongs (optional)
   * @param name Filter by exchange name (optional)
   * @param code Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @return GetExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchanges200Response getExchanges(@javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String name, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan) throws ApiException {
    return getExchanges(type, name, code, country, format, delimiter, showPlan, null);
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param type The asset class to which the instrument belongs (optional)
   * @param name Filter by exchange name (optional)
   * @param code Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return GetExchanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetExchanges200Response getExchanges(@javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String name, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, Map<String, String> headers) throws ApiException {
    ApiResponse<GetExchanges200Response> localVarResponse = getExchangesWithHttpInfo(type, name, code, country, format, delimiter, showPlan, headers);
    return localVarResponse.getData();
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param type The asset class to which the instrument belongs (optional)
   * @param name Filter by exchange name (optional)
   * @param code Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @return ApiResponse&lt;GetExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchanges200Response> getExchangesWithHttpInfo(@javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String name, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan) throws ApiException {
    return getExchangesWithHttpInfo(type, name, code, country, format, delimiter, showPlan, null);
  }

  /**
   * Exchanges
   * The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.
   * @param type The asset class to which the instrument belongs (optional)
   * @param name Filter by exchange name (optional)
   * @param code Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetExchanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetExchanges200Response> getExchangesWithHttpInfo(@javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String name, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getExchangesRequestBuilder(type, name, code, country, format, delimiter, showPlan, headers);
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
          throw getApiException("getExchanges", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetExchanges200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetExchanges200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetExchanges200Response>() {});
        

        return new ApiResponse<GetExchanges200Response>(
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

  private HttpRequest.Builder getExchangesRequestBuilder(@javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable String name, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/exchanges";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParameterBaseName = "name";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("name", name));
    localVarQueryParameterBaseName = "code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("code", code));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "show_plan";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("show_plan", showPlan));

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


  public static final class APIGetExchangesRequest {
    @javax.annotation.Nullable
    private TypeEnum type; // The asset class to which the instrument belongs (optional)
    @javax.annotation.Nullable
    private String name; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String code; // Filter by market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean showPlan; // Adds info on which plan symbol is available (optional, default to false)

    private APIGetExchangesRequest(Builder builder) {
      this.type = builder.type;
      this.name = builder.name;
      this.code = builder.code;
      this.country = builder.country;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.showPlan = builder.showPlan;
    }
    @javax.annotation.Nullable
    public TypeEnum type() {
      return type;
    }
    @javax.annotation.Nullable
    public String name() {
      return name;
    }
    @javax.annotation.Nullable
    public String code() {
      return code;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
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
    public Boolean showPlan() {
      return showPlan;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private TypeEnum type;
      private String name;
      private String code;
      private String country;
      private FormatEnum format;
      private String delimiter;
      private Boolean showPlan;

      public Builder type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
      }
      public Builder name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
      }
      public Builder code(@javax.annotation.Nullable String code) {
        this.code = code;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
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
      public Builder showPlan(@javax.annotation.Nullable Boolean showPlan) {
        this.showPlan = showPlan;
        return this;
      }
      public APIGetExchangesRequest build() {
        return new APIGetExchangesRequest(this);
      }
    }
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param apiRequest {@link APIGetForexPairsRequest}
   * @return GetForexPairs200Response
   * @throws ApiException if fails to make API call
   */
  public GetForexPairs200Response getForexPairs(APIGetForexPairsRequest apiRequest) throws ApiException {
    return getForexPairs(apiRequest, null);
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param apiRequest {@link APIGetForexPairsRequest}
   * @param headers Optional headers to include in the request
   * @return GetForexPairs200Response
   * @throws ApiException if fails to make API call
   */
  public GetForexPairs200Response getForexPairs(APIGetForexPairsRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String currencyBase = apiRequest.currencyBase();
    @javax.annotation.Nullable
    String currencyQuote = apiRequest.currencyQuote();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    return getForexPairs(symbol, currencyBase, currencyQuote, format, delimiter, headers);
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param apiRequest {@link APIGetForexPairsRequest}
   * @return ApiResponse&lt;GetForexPairs200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetForexPairs200Response> getForexPairsWithHttpInfo(APIGetForexPairsRequest apiRequest) throws ApiException {
    return getForexPairsWithHttpInfo(apiRequest, null);
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param apiRequest {@link APIGetForexPairsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetForexPairs200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetForexPairs200Response> getForexPairsWithHttpInfo(APIGetForexPairsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String currencyBase = apiRequest.currencyBase();
    String currencyQuote = apiRequest.currencyQuote();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    return getForexPairsWithHttpInfo(symbol, currencyBase, currencyQuote, format, delimiter, headers);
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @return GetForexPairs200Response
   * @throws ApiException if fails to make API call
   */
  public GetForexPairs200Response getForexPairs(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getForexPairs(symbol, currencyBase, currencyQuote, format, delimiter, null);
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return GetForexPairs200Response
   * @throws ApiException if fails to make API call
   */
  public GetForexPairs200Response getForexPairs(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    ApiResponse<GetForexPairs200Response> localVarResponse = getForexPairsWithHttpInfo(symbol, currencyBase, currencyQuote, format, delimiter, headers);
    return localVarResponse.getData();
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @return ApiResponse&lt;GetForexPairs200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetForexPairs200Response> getForexPairsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter) throws ApiException {
    return getForexPairsWithHttpInfo(symbol, currencyBase, currencyQuote, format, delimiter, null);
  }

  /**
   * Forex pairs
   * The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param currencyBase Filter by currency base (optional)
   * @param currencyQuote Filter by currency quote (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetForexPairs200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetForexPairs200Response> getForexPairsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getForexPairsRequestBuilder(symbol, currencyBase, currencyQuote, format, delimiter, headers);
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
          throw getApiException("getForexPairs", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetForexPairs200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetForexPairs200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetForexPairs200Response>() {});
        

        return new ApiResponse<GetForexPairs200Response>(
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

  private HttpRequest.Builder getForexPairsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String currencyBase, @javax.annotation.Nullable String currencyQuote, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/forex_pairs";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "currency_base";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("currency_base", currencyBase));
    localVarQueryParameterBaseName = "currency_quote";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("currency_quote", currencyQuote));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));

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


  public static final class APIGetForexPairsRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String currencyBase; // Filter by currency base (optional)
    @javax.annotation.Nullable
    private String currencyQuote; // Filter by currency quote (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)

    private APIGetForexPairsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.currencyBase = builder.currencyBase;
      this.currencyQuote = builder.currencyQuote;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
    }
    @javax.annotation.Nullable
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public String currencyBase() {
      return currencyBase;
    }
    @javax.annotation.Nullable
    public String currencyQuote() {
      return currencyQuote;
    }
    @javax.annotation.Nullable
    public FormatEnum format() {
      return format;
    }
    @javax.annotation.Nullable
    public String delimiter() {
      return delimiter;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String currencyBase;
      private String currencyQuote;
      private FormatEnum format;
      private String delimiter;

      public Builder symbol(@javax.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder currencyBase(@javax.annotation.Nullable String currencyBase) {
        this.currencyBase = currencyBase;
        return this;
      }
      public Builder currencyQuote(@javax.annotation.Nullable String currencyQuote) {
        this.currencyQuote = currencyQuote;
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
      public APIGetForexPairsRequest build() {
        return new APIGetForexPairsRequest(this);
      }
    }
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetFundsRequest}
   * @return GetFunds200Response
   * @throws ApiException if fails to make API call
   */
  public GetFunds200Response getFunds(APIGetFundsRequest apiRequest) throws ApiException {
    return getFunds(apiRequest, null);
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetFundsRequest}
   * @param headers Optional headers to include in the request
   * @return GetFunds200Response
   * @throws ApiException if fails to make API call
   */
  public GetFunds200Response getFunds(APIGetFundsRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String cik = apiRequest.cik();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    Boolean showPlan = apiRequest.showPlan();
    @javax.annotation.Nullable
    Long page = apiRequest.page();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getFunds(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetFundsRequest}
   * @return ApiResponse&lt;GetFunds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetFunds200Response> getFundsWithHttpInfo(APIGetFundsRequest apiRequest) throws ApiException {
    return getFundsWithHttpInfo(apiRequest, null);
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param apiRequest {@link APIGetFundsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetFunds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetFunds200Response> getFundsWithHttpInfo(APIGetFundsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String cik = apiRequest.cik();
    String exchange = apiRequest.exchange();
    String country = apiRequest.country();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean showPlan = apiRequest.showPlan();
    Long page = apiRequest.page();
    Long outputsize = apiRequest.outputsize();
    return getFundsWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @return GetFunds200Response
   * @throws ApiException if fails to make API call
   */
  public GetFunds200Response getFunds(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getFunds(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize, null);
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @param headers Optional headers to include in the request
   * @return GetFunds200Response
   * @throws ApiException if fails to make API call
   */
  public GetFunds200Response getFunds(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetFunds200Response> localVarResponse = getFundsWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @return ApiResponse&lt;GetFunds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetFunds200Response> getFundsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getFundsWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize, null);
  }

  /**
   * Funds
   * The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param page Page number of the results to fetch (optional, default to 1)
   * @param outputsize Determines the number of data points returned in the output (optional, default to 5000)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetFunds200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetFunds200Response> getFundsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getFundsRequestBuilder(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize, headers);
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
          throw getApiException("getFunds", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetFunds200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetFunds200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetFunds200Response>() {});
        

        return new ApiResponse<GetFunds200Response>(
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

  private HttpRequest.Builder getFundsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/funds";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "show_plan";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("show_plan", showPlan));
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


  public static final class APIGetFundsRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cik; // The CIK of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean showPlan; // Adds info on which plan symbol is available (optional, default to false)
    @javax.annotation.Nullable
    private Long page; // Page number of the results to fetch (optional, default to 1)
    @javax.annotation.Nullable
    private Long outputsize; // Determines the number of data points returned in the output (optional, default to 5000)

    private APIGetFundsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.cik = builder.cik;
      this.exchange = builder.exchange;
      this.country = builder.country;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.showPlan = builder.showPlan;
      this.page = builder.page;
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
    public String cik() {
      return cik;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
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
    public Boolean showPlan() {
      return showPlan;
    }
    @javax.annotation.Nullable
    public Long page() {
      return page;
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
      private String cik;
      private String exchange;
      private String country;
      private FormatEnum format;
      private String delimiter;
      private Boolean showPlan;
      private Long page;
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
      public Builder cik(@javax.annotation.Nullable String cik) {
        this.cik = cik;
        return this;
      }
      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
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
      public Builder showPlan(@javax.annotation.Nullable Boolean showPlan) {
        this.showPlan = showPlan;
        return this;
      }
      public Builder page(@javax.annotation.Nullable Long page) {
        this.page = page;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetFundsRequest build() {
        return new APIGetFundsRequest(this);
      }
    }
  }

  /**
   * Instrument type
   * The instrument type endpoint lists all available financial instrument types, such as stocks, ETFs, and cryptos. This information is essential for users to identify and categorize different financial instruments when accessing or analyzing market data.
   * @return GetInstrumentType200Response
   * @throws ApiException if fails to make API call
   */
  public GetInstrumentType200Response getInstrumentType() throws ApiException {
    return getInstrumentType(null);
  }

  /**
   * Instrument type
   * The instrument type endpoint lists all available financial instrument types, such as stocks, ETFs, and cryptos. This information is essential for users to identify and categorize different financial instruments when accessing or analyzing market data.
   * @param headers Optional headers to include in the request
   * @return GetInstrumentType200Response
   * @throws ApiException if fails to make API call
   */
  public GetInstrumentType200Response getInstrumentType(Map<String, String> headers) throws ApiException {
    ApiResponse<GetInstrumentType200Response> localVarResponse = getInstrumentTypeWithHttpInfo(headers);
    return localVarResponse.getData();
  }

  /**
   * Instrument type
   * The instrument type endpoint lists all available financial instrument types, such as stocks, ETFs, and cryptos. This information is essential for users to identify and categorize different financial instruments when accessing or analyzing market data.
   * @return ApiResponse&lt;GetInstrumentType200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInstrumentType200Response> getInstrumentTypeWithHttpInfo() throws ApiException {
    return getInstrumentTypeWithHttpInfo(null);
  }

  /**
   * Instrument type
   * The instrument type endpoint lists all available financial instrument types, such as stocks, ETFs, and cryptos. This information is essential for users to identify and categorize different financial instruments when accessing or analyzing market data.
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetInstrumentType200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInstrumentType200Response> getInstrumentTypeWithHttpInfo(Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getInstrumentTypeRequestBuilder(headers);
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
          throw getApiException("getInstrumentType", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetInstrumentType200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetInstrumentType200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetInstrumentType200Response>() {});
        

        return new ApiResponse<GetInstrumentType200Response>(
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

  private HttpRequest.Builder getInstrumentTypeRequestBuilder(Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/instrument_type";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
   * Intervals List
   * The intervals endpoint provides a list of supported time intervals that can be used for querying financial data.
   * @return GetIntervals200Response
   * @throws ApiException if fails to make API call
   */
  public GetIntervals200Response getIntervals() throws ApiException {
    return getIntervals(null);
  }

  /**
   * Intervals List
   * The intervals endpoint provides a list of supported time intervals that can be used for querying financial data.
   * @param headers Optional headers to include in the request
   * @return GetIntervals200Response
   * @throws ApiException if fails to make API call
   */
  public GetIntervals200Response getIntervals(Map<String, String> headers) throws ApiException {
    ApiResponse<GetIntervals200Response> localVarResponse = getIntervalsWithHttpInfo(headers);
    return localVarResponse.getData();
  }

  /**
   * Intervals List
   * The intervals endpoint provides a list of supported time intervals that can be used for querying financial data.
   * @return ApiResponse&lt;GetIntervals200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIntervals200Response> getIntervalsWithHttpInfo() throws ApiException {
    return getIntervalsWithHttpInfo(null);
  }

  /**
   * Intervals List
   * The intervals endpoint provides a list of supported time intervals that can be used for querying financial data.
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetIntervals200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIntervals200Response> getIntervalsWithHttpInfo(Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getIntervalsRequestBuilder(headers);
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
          throw getApiException("getIntervals", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetIntervals200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetIntervals200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetIntervals200Response>() {});
        

        return new ApiResponse<GetIntervals200Response>(
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

  private HttpRequest.Builder getIntervalsRequestBuilder(Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/intervals";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param apiRequest {@link APIGetMarketStateRequest}
   * @return List&lt;MarketStateResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MarketStateResponseItem> getMarketState(APIGetMarketStateRequest apiRequest) throws ApiException {
    return getMarketState(apiRequest, null);
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param apiRequest {@link APIGetMarketStateRequest}
   * @param headers Optional headers to include in the request
   * @return List&lt;MarketStateResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MarketStateResponseItem> getMarketState(APIGetMarketStateRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String code = apiRequest.code();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    return getMarketState(exchange, code, country, headers);
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param apiRequest {@link APIGetMarketStateRequest}
   * @return ApiResponse&lt;List&lt;MarketStateResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<MarketStateResponseItem>> getMarketStateWithHttpInfo(APIGetMarketStateRequest apiRequest) throws ApiException {
    return getMarketStateWithHttpInfo(apiRequest, null);
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param apiRequest {@link APIGetMarketStateRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;List&lt;MarketStateResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<MarketStateResponseItem>> getMarketStateWithHttpInfo(APIGetMarketStateRequest apiRequest, Map<String, String> headers) throws ApiException {
    String exchange = apiRequest.exchange();
    String code = apiRequest.code();
    String country = apiRequest.country();
    return getMarketStateWithHttpInfo(exchange, code, country, headers);
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param exchange The exchange name where the instrument is traded. (optional)
   * @param code The Market Identifier Code (MIC) of the exchange where the instrument is traded. (optional)
   * @param country The country where the exchange is located. Takes country name or alpha code. (optional)
   * @return List&lt;MarketStateResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MarketStateResponseItem> getMarketState(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country) throws ApiException {
    return getMarketState(exchange, code, country, null);
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param exchange The exchange name where the instrument is traded. (optional)
   * @param code The Market Identifier Code (MIC) of the exchange where the instrument is traded. (optional)
   * @param country The country where the exchange is located. Takes country name or alpha code. (optional)
   * @param headers Optional headers to include in the request
   * @return List&lt;MarketStateResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MarketStateResponseItem> getMarketState(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<List<MarketStateResponseItem>> localVarResponse = getMarketStateWithHttpInfo(exchange, code, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param exchange The exchange name where the instrument is traded. (optional)
   * @param code The Market Identifier Code (MIC) of the exchange where the instrument is traded. (optional)
   * @param country The country where the exchange is located. Takes country name or alpha code. (optional)
   * @return ApiResponse&lt;List&lt;MarketStateResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<MarketStateResponseItem>> getMarketStateWithHttpInfo(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country) throws ApiException {
    return getMarketStateWithHttpInfo(exchange, code, country, null);
  }

  /**
   * Market state
   * The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.
   * @param exchange The exchange name where the instrument is traded. (optional)
   * @param code The Market Identifier Code (MIC) of the exchange where the instrument is traded. (optional)
   * @param country The country where the exchange is located. Takes country name or alpha code. (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;List&lt;MarketStateResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<MarketStateResponseItem>> getMarketStateWithHttpInfo(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMarketStateRequestBuilder(exchange, code, country, headers);
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
          throw getApiException("getMarketState", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<List<MarketStateResponseItem>>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        List<MarketStateResponseItem> responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<List<MarketStateResponseItem>>() {});
        

        return new ApiResponse<List<MarketStateResponseItem>>(
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

  private HttpRequest.Builder getMarketStateRequestBuilder(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String code, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/market_state";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("code", code));
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


  public static final class APIGetMarketStateRequest {
    @javax.annotation.Nullable
    private String exchange; // The exchange name where the instrument is traded. (optional)
    @javax.annotation.Nullable
    private String code; // The Market Identifier Code (MIC) of the exchange where the instrument is traded. (optional)
    @javax.annotation.Nullable
    private String country; // The country where the exchange is located. Takes country name or alpha code. (optional)

    private APIGetMarketStateRequest(Builder builder) {
      this.exchange = builder.exchange;
      this.code = builder.code;
      this.country = builder.country;
    }
    @javax.annotation.Nullable
    public String exchange() {
      return exchange;
    }
    @javax.annotation.Nullable
    public String code() {
      return code;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String exchange;
      private String code;
      private String country;

      public Builder exchange(@javax.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
      }
      public Builder code(@javax.annotation.Nullable String code) {
        this.code = code;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public APIGetMarketStateRequest build() {
        return new APIGetMarketStateRequest(this);
      }
    }
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param apiRequest {@link APIGetStocksRequest}
   * @return GetStocks200Response
   * @throws ApiException if fails to make API call
   */
  public GetStocks200Response getStocks(APIGetStocksRequest apiRequest) throws ApiException {
    return getStocks(apiRequest, null);
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param apiRequest {@link APIGetStocksRequest}
   * @param headers Optional headers to include in the request
   * @return GetStocks200Response
   * @throws ApiException if fails to make API call
   */
  public GetStocks200Response getStocks(APIGetStocksRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String figi = apiRequest.figi();
    @javax.annotation.Nullable
    String isin = apiRequest.isin();
    @javax.annotation.Nullable
    String cusip = apiRequest.cusip();
    @javax.annotation.Nullable
    String cik = apiRequest.cik();
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
    Boolean showPlan = apiRequest.showPlan();
    @javax.annotation.Nullable
    Boolean includeDelisted = apiRequest.includeDelisted();
    return getStocks(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted, headers);
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param apiRequest {@link APIGetStocksRequest}
   * @return ApiResponse&lt;GetStocks200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStocks200Response> getStocksWithHttpInfo(APIGetStocksRequest apiRequest) throws ApiException {
    return getStocksWithHttpInfo(apiRequest, null);
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param apiRequest {@link APIGetStocksRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetStocks200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStocks200Response> getStocksWithHttpInfo(APIGetStocksRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String cik = apiRequest.cik();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    TypeEnum type = apiRequest.type();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    Boolean showPlan = apiRequest.showPlan();
    Boolean includeDelisted = apiRequest.includeDelisted();
    return getStocksWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted, headers);
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @return GetStocks200Response
   * @throws ApiException if fails to make API call
   */
  public GetStocks200Response getStocks(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted) throws ApiException {
    return getStocks(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted, null);
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return GetStocks200Response
   * @throws ApiException if fails to make API call
   */
  public GetStocks200Response getStocks(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted, Map<String, String> headers) throws ApiException {
    ApiResponse<GetStocks200Response> localVarResponse = getStocksWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted, headers);
    return localVarResponse.getData();
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @return ApiResponse&lt;GetStocks200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStocks200Response> getStocksWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted) throws ApiException {
    return getStocksWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted, null);
  }

  /**
   * Stocks
   * The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param showPlan Adds info on which plan symbol is available (optional, default to false)
   * @param includeDelisted Include delisted identifiers (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetStocks200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStocks200Response> getStocksWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getStocksRequestBuilder(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted, headers);
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
          throw getApiException("getStocks", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetStocks200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetStocks200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetStocks200Response>() {});
        

        return new ApiResponse<GetStocks200Response>(
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

  private HttpRequest.Builder getStocksRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable Boolean showPlan, @javax.annotation.Nullable Boolean includeDelisted, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/stocks";

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
    localVarQueryParameterBaseName = "show_plan";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("show_plan", showPlan));
    localVarQueryParameterBaseName = "include_delisted";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("include_delisted", includeDelisted));

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


  public static final class APIGetStocksRequest {
    @javax.annotation.Nullable
    private String symbol; // The ticker symbol of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String figi; // Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
    @javax.annotation.Nullable
    private String isin; // Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cusip; // The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
    @javax.annotation.Nullable
    private String cik; // The CIK of an instrument for which data is requested (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String micCode; // Filter by market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private TypeEnum type; // The asset class to which the instrument belongs (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private Boolean showPlan; // Adds info on which plan symbol is available (optional, default to false)
    @javax.annotation.Nullable
    private Boolean includeDelisted; // Include delisted identifiers (optional, default to false)

    private APIGetStocksRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.cik = builder.cik;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.type = builder.type;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.showPlan = builder.showPlan;
      this.includeDelisted = builder.includeDelisted;
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
    public String cik() {
      return cik;
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
    public Boolean showPlan() {
      return showPlan;
    }
    @javax.annotation.Nullable
    public Boolean includeDelisted() {
      return includeDelisted;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private String figi;
      private String isin;
      private String cusip;
      private String cik;
      private String exchange;
      private String micCode;
      private String country;
      private TypeEnum type;
      private FormatEnum format;
      private String delimiter;
      private Boolean showPlan;
      private Boolean includeDelisted;

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
      public Builder cik(@javax.annotation.Nullable String cik) {
        this.cik = cik;
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
      public Builder showPlan(@javax.annotation.Nullable Boolean showPlan) {
        this.showPlan = showPlan;
        return this;
      }
      public Builder includeDelisted(@javax.annotation.Nullable Boolean includeDelisted) {
        this.includeDelisted = includeDelisted;
        return this;
      }
      public APIGetStocksRequest build() {
        return new APIGetStocksRequest(this);
      }
    }
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param apiRequest {@link APIGetSymbolSearchRequest}
   * @return GetSymbolSearch200Response
   * @throws ApiException if fails to make API call
   */
  public GetSymbolSearch200Response getSymbolSearch(APIGetSymbolSearchRequest apiRequest) throws ApiException {
    return getSymbolSearch(apiRequest, null);
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param apiRequest {@link APIGetSymbolSearchRequest}
   * @param headers Optional headers to include in the request
   * @return GetSymbolSearch200Response
   * @throws ApiException if fails to make API call
   */
  public GetSymbolSearch200Response getSymbolSearch(APIGetSymbolSearchRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    Boolean showPlan = apiRequest.showPlan();
    return getSymbolSearch(symbol, outputsize, showPlan, headers);
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param apiRequest {@link APIGetSymbolSearchRequest}
   * @return ApiResponse&lt;GetSymbolSearch200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSymbolSearch200Response> getSymbolSearchWithHttpInfo(APIGetSymbolSearchRequest apiRequest) throws ApiException {
    return getSymbolSearchWithHttpInfo(apiRequest, null);
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param apiRequest {@link APIGetSymbolSearchRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetSymbolSearch200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSymbolSearch200Response> getSymbolSearchWithHttpInfo(APIGetSymbolSearchRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    Long outputsize = apiRequest.outputsize();
    Boolean showPlan = apiRequest.showPlan();
    return getSymbolSearchWithHttpInfo(symbol, outputsize, showPlan, headers);
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param symbol Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; (required)
   * @param outputsize Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; (optional, default to 30)
   * @param showPlan Adds info on which plan symbol is available. (optional, default to false)
   * @return GetSymbolSearch200Response
   * @throws ApiException if fails to make API call
   */
  public GetSymbolSearch200Response getSymbolSearch(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Boolean showPlan) throws ApiException {
    return getSymbolSearch(symbol, outputsize, showPlan, null);
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param symbol Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; (required)
   * @param outputsize Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; (optional, default to 30)
   * @param showPlan Adds info on which plan symbol is available. (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return GetSymbolSearch200Response
   * @throws ApiException if fails to make API call
   */
  public GetSymbolSearch200Response getSymbolSearch(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Boolean showPlan, Map<String, String> headers) throws ApiException {
    ApiResponse<GetSymbolSearch200Response> localVarResponse = getSymbolSearchWithHttpInfo(symbol, outputsize, showPlan, headers);
    return localVarResponse.getData();
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param symbol Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; (required)
   * @param outputsize Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; (optional, default to 30)
   * @param showPlan Adds info on which plan symbol is available. (optional, default to false)
   * @return ApiResponse&lt;GetSymbolSearch200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSymbolSearch200Response> getSymbolSearchWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Boolean showPlan) throws ApiException {
    return getSymbolSearchWithHttpInfo(symbol, outputsize, showPlan, null);
  }

  /**
   * Symbol search
   * The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.
   * @param symbol Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; (required)
   * @param outputsize Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; (optional, default to 30)
   * @param showPlan Adds info on which plan symbol is available. (optional, default to false)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetSymbolSearch200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSymbolSearch200Response> getSymbolSearchWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Boolean showPlan, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSymbolSearchRequestBuilder(symbol, outputsize, showPlan, headers);
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
          throw getApiException("getSymbolSearch", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetSymbolSearch200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetSymbolSearch200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetSymbolSearch200Response>() {});
        

        return new ApiResponse<GetSymbolSearch200Response>(
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

  private HttpRequest.Builder getSymbolSearchRequestBuilder(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Boolean showPlan, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getSymbolSearch");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/symbol_search";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "show_plan";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("show_plan", showPlan));

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


  public static final class APIGetSymbolSearchRequest {
    @javax.annotation.Nonnull
    private String symbol; // Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; (required)
    @javax.annotation.Nullable
    private Long outputsize; // Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; (optional, default to 30)
    @javax.annotation.Nullable
    private Boolean showPlan; // Adds info on which plan symbol is available. (optional, default to false)

    private APIGetSymbolSearchRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.outputsize = builder.outputsize;
      this.showPlan = builder.showPlan;
    }
    @javax.annotation.Nonnull
    public String symbol() {
      return symbol;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
    }
    @javax.annotation.Nullable
    public Boolean showPlan() {
      return showPlan;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String symbol;
      private Long outputsize;
      private Boolean showPlan;

      public Builder symbol(@javax.annotation.Nonnull String symbol) {
        this.symbol = symbol;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public Builder showPlan(@javax.annotation.Nullable Boolean showPlan) {
        this.showPlan = showPlan;
        return this;
      }
      public APIGetSymbolSearchRequest build() {
        return new APIGetSymbolSearchRequest(this);
      }
    }
  }

  /**
   * Technical indicators
   * The technical indicators endpoint provides a comprehensive list of available technical indicators, each represented as an object. This endpoint is useful for developers looking to integrate a variety of technical analysis tools into their applications, allowing for streamlined access to indicator data without needing to manually configure each one.
   * @return GetTechnicalIndicators200Response
   * @throws ApiException if fails to make API call
   */
  public GetTechnicalIndicators200Response getTechnicalIndicators() throws ApiException {
    return getTechnicalIndicators(null);
  }

  /**
   * Technical indicators
   * The technical indicators endpoint provides a comprehensive list of available technical indicators, each represented as an object. This endpoint is useful for developers looking to integrate a variety of technical analysis tools into their applications, allowing for streamlined access to indicator data without needing to manually configure each one.
   * @param headers Optional headers to include in the request
   * @return GetTechnicalIndicators200Response
   * @throws ApiException if fails to make API call
   */
  public GetTechnicalIndicators200Response getTechnicalIndicators(Map<String, String> headers) throws ApiException {
    ApiResponse<GetTechnicalIndicators200Response> localVarResponse = getTechnicalIndicatorsWithHttpInfo(headers);
    return localVarResponse.getData();
  }

  /**
   * Technical indicators
   * The technical indicators endpoint provides a comprehensive list of available technical indicators, each represented as an object. This endpoint is useful for developers looking to integrate a variety of technical analysis tools into their applications, allowing for streamlined access to indicator data without needing to manually configure each one.
   * @return ApiResponse&lt;GetTechnicalIndicators200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTechnicalIndicators200Response> getTechnicalIndicatorsWithHttpInfo() throws ApiException {
    return getTechnicalIndicatorsWithHttpInfo(null);
  }

  /**
   * Technical indicators
   * The technical indicators endpoint provides a comprehensive list of available technical indicators, each represented as an object. This endpoint is useful for developers looking to integrate a variety of technical analysis tools into their applications, allowing for streamlined access to indicator data without needing to manually configure each one.
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetTechnicalIndicators200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTechnicalIndicators200Response> getTechnicalIndicatorsWithHttpInfo(Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getTechnicalIndicatorsRequestBuilder(headers);
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
          throw getApiException("getTechnicalIndicators", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetTechnicalIndicators200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetTechnicalIndicators200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetTechnicalIndicators200Response>() {});
        

        return new ApiResponse<GetTechnicalIndicators200Response>(
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

  private HttpRequest.Builder getTechnicalIndicatorsRequestBuilder(Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/technical_indicators";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
