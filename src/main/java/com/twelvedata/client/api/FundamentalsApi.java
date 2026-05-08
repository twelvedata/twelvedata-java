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
import com.twelvedata.client.model.DividendsCalendarItem;
import com.twelvedata.client.model.EndpointEnum;
import com.twelvedata.client.model.FormatEnum;
import com.twelvedata.client.model.GetBalanceSheet200Response;
import com.twelvedata.client.model.GetBalanceSheetConsolidated200Response;
import com.twelvedata.client.model.GetCashFlow200Response;
import com.twelvedata.client.model.GetCashFlowConsolidated200Response;
import com.twelvedata.client.model.GetDividends200Response;
import com.twelvedata.client.model.GetEarnings200Response;
import com.twelvedata.client.model.GetEarningsCalendar200Response;
import com.twelvedata.client.model.GetIncomeStatement200Response;
import com.twelvedata.client.model.GetIncomeStatementConsolidated200Response;
import com.twelvedata.client.model.GetIpoCalendar200ResponseValueInner;
import com.twelvedata.client.model.GetKeyExecutives200Response;
import com.twelvedata.client.model.GetLastChanges200Response;
import com.twelvedata.client.model.GetLogo200Response;
import com.twelvedata.client.model.GetMarketCap200Response;
import com.twelvedata.client.model.GetProfile200Response;
import com.twelvedata.client.model.GetSplits200Response;
import com.twelvedata.client.model.GetStatistics200Response;
import com.twelvedata.client.model.PeriodEarningsEnum;
import com.twelvedata.client.model.PeriodEnum;
import com.twelvedata.client.model.PressReleasesListParameters200Response;
import com.twelvedata.client.model.RangeEnum;
import com.twelvedata.client.model.RangeSplitsEnum;
import com.twelvedata.client.model.SplitsCalendarResponseItem;
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
public class FundamentalsApi {
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

  public FundamentalsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FundamentalsApi(ApiClient apiClient) {
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
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param apiRequest {@link APIGetBalanceSheetRequest}
   * @return GetBalanceSheet200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheet200Response getBalanceSheet(APIGetBalanceSheetRequest apiRequest) throws ApiException {
    return getBalanceSheet(apiRequest, null);
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param apiRequest {@link APIGetBalanceSheetRequest}
   * @param headers Optional headers to include in the request
   * @return GetBalanceSheet200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheet200Response getBalanceSheet(APIGetBalanceSheetRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEnum period = apiRequest.period();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getBalanceSheet(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param apiRequest {@link APIGetBalanceSheetRequest}
   * @return ApiResponse&lt;GetBalanceSheet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheet200Response> getBalanceSheetWithHttpInfo(APIGetBalanceSheetRequest apiRequest) throws ApiException {
    return getBalanceSheetWithHttpInfo(apiRequest, null);
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param apiRequest {@link APIGetBalanceSheetRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetBalanceSheet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheet200Response> getBalanceSheetWithHttpInfo(APIGetBalanceSheetRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    PeriodEnum period = apiRequest.period();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    return getBalanceSheetWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balane sheet data (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return GetBalanceSheet200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheet200Response getBalanceSheet(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getBalanceSheet(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balane sheet data (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return GetBalanceSheet200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheet200Response getBalanceSheet(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetBalanceSheet200Response> localVarResponse = getBalanceSheetWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balane sheet data (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return ApiResponse&lt;GetBalanceSheet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheet200Response> getBalanceSheetWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getBalanceSheetWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Balance sheet
   * The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balane sheet data (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetBalanceSheet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheet200Response> getBalanceSheetWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getBalanceSheetRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
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
          throw getApiException("getBalanceSheet", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetBalanceSheet200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetBalanceSheet200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetBalanceSheet200Response>() {});
        

        return new ApiResponse<GetBalanceSheet200Response>(
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

  private HttpRequest.Builder getBalanceSheetRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/balance_sheet";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetBalanceSheetRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEnum period; // The reporting period for the balane sheet data (optional, default to annual)
    @javax.annotation.Nullable
    private String startDate; // Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 6)

    private APIGetBalanceSheetRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.period = builder.period;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public PeriodEnum period() {
      return period;
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
      private String micCode;
      private String country;
      private PeriodEnum period;
      private String startDate;
      private String endDate;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder period(@javax.annotation.Nullable PeriodEnum period) {
        this.period = period;
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
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetBalanceSheetRequest build() {
        return new APIGetBalanceSheetRequest(this);
      }
    }
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param apiRequest {@link APIGetBalanceSheetConsolidatedRequest}
   * @return GetBalanceSheetConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheetConsolidated200Response getBalanceSheetConsolidated(APIGetBalanceSheetConsolidatedRequest apiRequest) throws ApiException {
    return getBalanceSheetConsolidated(apiRequest, null);
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param apiRequest {@link APIGetBalanceSheetConsolidatedRequest}
   * @param headers Optional headers to include in the request
   * @return GetBalanceSheetConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheetConsolidated200Response getBalanceSheetConsolidated(APIGetBalanceSheetConsolidatedRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEnum period = apiRequest.period();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getBalanceSheetConsolidated(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param apiRequest {@link APIGetBalanceSheetConsolidatedRequest}
   * @return ApiResponse&lt;GetBalanceSheetConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheetConsolidated200Response> getBalanceSheetConsolidatedWithHttpInfo(APIGetBalanceSheetConsolidatedRequest apiRequest) throws ApiException {
    return getBalanceSheetConsolidatedWithHttpInfo(apiRequest, null);
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param apiRequest {@link APIGetBalanceSheetConsolidatedRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetBalanceSheetConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheetConsolidated200Response> getBalanceSheetConsolidatedWithHttpInfo(APIGetBalanceSheetConsolidatedRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    PeriodEnum period = apiRequest.period();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    return getBalanceSheetConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balance sheet data. (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return GetBalanceSheetConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheetConsolidated200Response getBalanceSheetConsolidated(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getBalanceSheetConsolidated(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balance sheet data. (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return GetBalanceSheetConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetBalanceSheetConsolidated200Response getBalanceSheetConsolidated(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetBalanceSheetConsolidated200Response> localVarResponse = getBalanceSheetConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balance sheet data. (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return ApiResponse&lt;GetBalanceSheetConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheetConsolidated200Response> getBalanceSheetConsolidatedWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getBalanceSheetConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Balance sheet consolidated
   * The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the balance sheet data. (optional, default to annual)
   * @param startDate Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetBalanceSheetConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetBalanceSheetConsolidated200Response> getBalanceSheetConsolidatedWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getBalanceSheetConsolidatedRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
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
          throw getApiException("getBalanceSheetConsolidated", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetBalanceSheetConsolidated200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetBalanceSheetConsolidated200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetBalanceSheetConsolidated200Response>() {});
        

        return new ApiResponse<GetBalanceSheetConsolidated200Response>(
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

  private HttpRequest.Builder getBalanceSheetConsolidatedRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/balance_sheet/consolidated";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetBalanceSheetConsolidatedRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEnum period; // The reporting period for the balance sheet data. (optional, default to annual)
    @javax.annotation.Nullable
    private String startDate; // Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 6)

    private APIGetBalanceSheetConsolidatedRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.period = builder.period;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public PeriodEnum period() {
      return period;
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
      private String micCode;
      private String country;
      private PeriodEnum period;
      private String startDate;
      private String endDate;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder period(@javax.annotation.Nullable PeriodEnum period) {
        this.period = period;
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
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetBalanceSheetConsolidatedRequest build() {
        return new APIGetBalanceSheetConsolidatedRequest(this);
      }
    }
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param apiRequest {@link APIGetCashFlowRequest}
   * @return GetCashFlow200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlow200Response getCashFlow(APIGetCashFlowRequest apiRequest) throws ApiException {
    return getCashFlow(apiRequest, null);
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param apiRequest {@link APIGetCashFlowRequest}
   * @param headers Optional headers to include in the request
   * @return GetCashFlow200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlow200Response getCashFlow(APIGetCashFlowRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEnum period = apiRequest.period();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getCashFlow(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param apiRequest {@link APIGetCashFlowRequest}
   * @return ApiResponse&lt;GetCashFlow200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlow200Response> getCashFlowWithHttpInfo(APIGetCashFlowRequest apiRequest) throws ApiException {
    return getCashFlowWithHttpInfo(apiRequest, null);
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param apiRequest {@link APIGetCashFlowRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCashFlow200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlow200Response> getCashFlowWithHttpInfo(APIGetCashFlowRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    PeriodEnum period = apiRequest.period();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    return getCashFlowWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return GetCashFlow200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlow200Response getCashFlow(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getCashFlow(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return GetCashFlow200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlow200Response getCashFlow(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCashFlow200Response> localVarResponse = getCashFlowWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return ApiResponse&lt;GetCashFlow200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlow200Response> getCashFlowWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getCashFlowWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Cash flow
   * The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCashFlow200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlow200Response> getCashFlowWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCashFlowRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
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
          throw getApiException("getCashFlow", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCashFlow200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCashFlow200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCashFlow200Response>() {});
        

        return new ApiResponse<GetCashFlow200Response>(
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

  private HttpRequest.Builder getCashFlowRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cash_flow";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetCashFlowRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEnum period; // The reporting period for the cash flow statements (optional, default to annual)
    @javax.annotation.Nullable
    private String startDate; // Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 6)

    private APIGetCashFlowRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.period = builder.period;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public PeriodEnum period() {
      return period;
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
      private String micCode;
      private String country;
      private PeriodEnum period;
      private String startDate;
      private String endDate;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder period(@javax.annotation.Nullable PeriodEnum period) {
        this.period = period;
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
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetCashFlowRequest build() {
        return new APIGetCashFlowRequest(this);
      }
    }
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param apiRequest {@link APIGetCashFlowConsolidatedRequest}
   * @return GetCashFlowConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlowConsolidated200Response getCashFlowConsolidated(APIGetCashFlowConsolidatedRequest apiRequest) throws ApiException {
    return getCashFlowConsolidated(apiRequest, null);
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param apiRequest {@link APIGetCashFlowConsolidatedRequest}
   * @param headers Optional headers to include in the request
   * @return GetCashFlowConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlowConsolidated200Response getCashFlowConsolidated(APIGetCashFlowConsolidatedRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEnum period = apiRequest.period();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getCashFlowConsolidated(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param apiRequest {@link APIGetCashFlowConsolidatedRequest}
   * @return ApiResponse&lt;GetCashFlowConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlowConsolidated200Response> getCashFlowConsolidatedWithHttpInfo(APIGetCashFlowConsolidatedRequest apiRequest) throws ApiException {
    return getCashFlowConsolidatedWithHttpInfo(apiRequest, null);
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param apiRequest {@link APIGetCashFlowConsolidatedRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCashFlowConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlowConsolidated200Response> getCashFlowConsolidatedWithHttpInfo(APIGetCashFlowConsolidatedRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    PeriodEnum period = apiRequest.period();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    return getCashFlowConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return GetCashFlowConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlowConsolidated200Response getCashFlowConsolidated(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getCashFlowConsolidated(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return GetCashFlowConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetCashFlowConsolidated200Response getCashFlowConsolidated(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetCashFlowConsolidated200Response> localVarResponse = getCashFlowConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return ApiResponse&lt;GetCashFlowConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlowConsolidated200Response> getCashFlowConsolidatedWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getCashFlowConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Cash flow consolidated
   * The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the cash flow statements (optional, default to annual)
   * @param startDate Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetCashFlowConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetCashFlowConsolidated200Response> getCashFlowConsolidatedWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCashFlowConsolidatedRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
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
          throw getApiException("getCashFlowConsolidated", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetCashFlowConsolidated200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetCashFlowConsolidated200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetCashFlowConsolidated200Response>() {});
        

        return new ApiResponse<GetCashFlowConsolidated200Response>(
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

  private HttpRequest.Builder getCashFlowConsolidatedRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cash_flow/consolidated";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetCashFlowConsolidatedRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEnum period; // The reporting period for the cash flow statements (optional, default to annual)
    @javax.annotation.Nullable
    private String startDate; // Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 6)

    private APIGetCashFlowConsolidatedRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.period = builder.period;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public PeriodEnum period() {
      return period;
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
      private String micCode;
      private String country;
      private PeriodEnum period;
      private String startDate;
      private String endDate;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder period(@javax.annotation.Nullable PeriodEnum period) {
        this.period = period;
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
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetCashFlowConsolidatedRequest build() {
        return new APIGetCashFlowConsolidatedRequest(this);
      }
    }
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param apiRequest {@link APIGetDividendsRequest}
   * @return GetDividends200Response
   * @throws ApiException if fails to make API call
   */
  public GetDividends200Response getDividends(APIGetDividendsRequest apiRequest) throws ApiException {
    return getDividends(apiRequest, null);
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param apiRequest {@link APIGetDividendsRequest}
   * @param headers Optional headers to include in the request
   * @return GetDividends200Response
   * @throws ApiException if fails to make API call
   */
  public GetDividends200Response getDividends(APIGetDividendsRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    RangeEnum range = apiRequest.range();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Boolean adjust = apiRequest.adjust();
    return getDividends(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, adjust, headers);
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param apiRequest {@link APIGetDividendsRequest}
   * @return ApiResponse&lt;GetDividends200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDividends200Response> getDividendsWithHttpInfo(APIGetDividendsRequest apiRequest) throws ApiException {
    return getDividendsWithHttpInfo(apiRequest, null);
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param apiRequest {@link APIGetDividendsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetDividends200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDividends200Response> getDividendsWithHttpInfo(APIGetDividendsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    RangeEnum range = apiRequest.range();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Boolean adjust = apiRequest.adjust();
    return getDividendsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, adjust, headers);
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Specifies the time range for which to retrieve dividend data. Accepts values such as &#x60;last&#x60; (most recent dividend), &#x60;next&#x60; (upcoming dividend), &#x60;1m&#x60; - &#x60;5y&#x60; for respective periods, or &#x60;full&#x60; for all available data. If provided together with &#x60;start_date&#x60; and/or &#x60;end_date&#x60;, this parameter takes precedence. (optional, default to last)
   * @param startDate Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param endDate End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @return GetDividends200Response
   * @throws ApiException if fails to make API call
   */
  public GetDividends200Response getDividends(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust) throws ApiException {
    return getDividends(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, adjust, null);
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Specifies the time range for which to retrieve dividend data. Accepts values such as &#x60;last&#x60; (most recent dividend), &#x60;next&#x60; (upcoming dividend), &#x60;1m&#x60; - &#x60;5y&#x60; for respective periods, or &#x60;full&#x60; for all available data. If provided together with &#x60;start_date&#x60; and/or &#x60;end_date&#x60;, this parameter takes precedence. (optional, default to last)
   * @param startDate Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param endDate End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @param headers Optional headers to include in the request
   * @return GetDividends200Response
   * @throws ApiException if fails to make API call
   */
  public GetDividends200Response getDividends(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, Map<String, String> headers) throws ApiException {
    ApiResponse<GetDividends200Response> localVarResponse = getDividendsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, adjust, headers);
    return localVarResponse.getData();
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Specifies the time range for which to retrieve dividend data. Accepts values such as &#x60;last&#x60; (most recent dividend), &#x60;next&#x60; (upcoming dividend), &#x60;1m&#x60; - &#x60;5y&#x60; for respective periods, or &#x60;full&#x60; for all available data. If provided together with &#x60;start_date&#x60; and/or &#x60;end_date&#x60;, this parameter takes precedence. (optional, default to last)
   * @param startDate Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param endDate End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @return ApiResponse&lt;GetDividends200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDividends200Response> getDividendsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust) throws ApiException {
    return getDividendsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, adjust, null);
  }

  /**
   * Dividends
   * The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Specifies the time range for which to retrieve dividend data. Accepts values such as &#x60;last&#x60; (most recent dividend), &#x60;next&#x60; (upcoming dividend), &#x60;1m&#x60; - &#x60;5y&#x60; for respective periods, or &#x60;full&#x60; for all available data. If provided together with &#x60;start_date&#x60; and/or &#x60;end_date&#x60;, this parameter takes precedence. (optional, default to last)
   * @param startDate Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param endDate End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
   * @param adjust Specifies if there should be an adjustment (optional, default to true)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetDividends200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDividends200Response> getDividendsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDividendsRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, adjust, headers);
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
          throw getApiException("getDividends", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetDividends200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetDividends200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetDividends200Response>() {});
        

        return new ApiResponse<GetDividends200Response>(
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

  private HttpRequest.Builder getDividendsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Boolean adjust, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dividends";

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
    localVarQueryParameterBaseName = "range";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("range", range));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetDividendsRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private RangeEnum range; // Specifies the time range for which to retrieve dividend data. Accepts values such as &#x60;last&#x60; (most recent dividend), &#x60;next&#x60; (upcoming dividend), &#x60;1m&#x60; - &#x60;5y&#x60; for respective periods, or &#x60;full&#x60; for all available data. If provided together with &#x60;start_date&#x60; and/or &#x60;end_date&#x60;, this parameter takes precedence. (optional, default to last)
    @javax.annotation.Nullable
    private String startDate; // Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. (optional)
    @javax.annotation.Nullable
    private Boolean adjust; // Specifies if there should be an adjustment (optional, default to true)

    private APIGetDividendsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.range = builder.range;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.adjust = builder.adjust;
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
    public RangeEnum range() {
      return range;
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
      private RangeEnum range;
      private String startDate;
      private String endDate;
      private Boolean adjust;

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
      public Builder range(@javax.annotation.Nullable RangeEnum range) {
        this.range = range;
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
      public APIGetDividendsRequest build() {
        return new APIGetDividendsRequest(this);
      }
    }
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param apiRequest {@link APIGetDividendsCalendarRequest}
   * @return List&lt;DividendsCalendarItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<DividendsCalendarItem> getDividendsCalendar(APIGetDividendsCalendarRequest apiRequest) throws ApiException {
    return getDividendsCalendar(apiRequest, null);
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param apiRequest {@link APIGetDividendsCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return List&lt;DividendsCalendarItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<DividendsCalendarItem> getDividendsCalendar(APIGetDividendsCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    Long page = apiRequest.page();
    return getDividendsCalendar(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param apiRequest {@link APIGetDividendsCalendarRequest}
   * @return ApiResponse&lt;List&lt;DividendsCalendarItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<DividendsCalendarItem>> getDividendsCalendarWithHttpInfo(APIGetDividendsCalendarRequest apiRequest) throws ApiException {
    return getDividendsCalendarWithHttpInfo(apiRequest, null);
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param apiRequest {@link APIGetDividendsCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;List&lt;DividendsCalendarItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<DividendsCalendarItem>> getDividendsCalendarWithHttpInfo(APIGetDividendsCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    Long page = apiRequest.page();
    return getDividendsCalendarWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @return List&lt;DividendsCalendarItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<DividendsCalendarItem> getDividendsCalendar(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Long page) throws ApiException {
    return getDividendsCalendar(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, null);
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @param headers Optional headers to include in the request
   * @return List&lt;DividendsCalendarItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<DividendsCalendarItem> getDividendsCalendar(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Long page, Map<String, String> headers) throws ApiException {
    ApiResponse<List<DividendsCalendarItem>> localVarResponse = getDividendsCalendarWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
    return localVarResponse.getData();
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @return ApiResponse&lt;List&lt;DividendsCalendarItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<DividendsCalendarItem>> getDividendsCalendarWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Long page) throws ApiException {
    return getDividendsCalendarWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, null);
  }

  /**
   * Dividends calendar
   * The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;List&lt;DividendsCalendarItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<DividendsCalendarItem>> getDividendsCalendarWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Long page, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDividendsCalendarRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
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
          throw getApiException("getDividendsCalendar", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<List<DividendsCalendarItem>>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        List<DividendsCalendarItem> responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<List<DividendsCalendarItem>>() {});
        

        return new ApiResponse<List<DividendsCalendarItem>>(
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

  private HttpRequest.Builder getDividendsCalendarRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable Long page, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dividends_calendar";

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
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "page";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page", page));

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


  public static final class APIGetDividendsCalendarRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private String startDate; // Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
    @javax.annotation.Nullable
    private Long page; // Page number (optional, default to 1)

    private APIGetDividendsCalendarRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.outputsize = builder.outputsize;
      this.page = builder.page;
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
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
    }
    @javax.annotation.Nullable
    public Long page() {
      return page;
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
      private String startDate;
      private String endDate;
      private Long outputsize;
      private Long page;

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
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public Builder page(@javax.annotation.Nullable Long page) {
        this.page = page;
        return this;
      }
      public APIGetDividendsCalendarRequest build() {
        return new APIGetDividendsCalendarRequest(this);
      }
    }
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param apiRequest {@link APIGetEarningsRequest}
   * @return GetEarnings200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarnings200Response getEarnings(APIGetEarningsRequest apiRequest) throws ApiException {
    return getEarnings(apiRequest, null);
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param apiRequest {@link APIGetEarningsRequest}
   * @param headers Optional headers to include in the request
   * @return GetEarnings200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarnings200Response getEarnings(APIGetEarningsRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEarningsEnum period = apiRequest.period();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    FormatEnum format = apiRequest.format();
    @javax.annotation.Nullable
    String delimiter = apiRequest.delimiter();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    return getEarnings(symbol, figi, isin, cusip, exchange, micCode, country, type, period, outputsize, format, delimiter, startDate, endDate, dp, headers);
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param apiRequest {@link APIGetEarningsRequest}
   * @return ApiResponse&lt;GetEarnings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarnings200Response> getEarningsWithHttpInfo(APIGetEarningsRequest apiRequest) throws ApiException {
    return getEarningsWithHttpInfo(apiRequest, null);
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param apiRequest {@link APIGetEarningsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarnings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarnings200Response> getEarningsWithHttpInfo(APIGetEarningsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    TypeEnum type = apiRequest.type();
    PeriodEarningsEnum period = apiRequest.period();
    Long outputsize = apiRequest.outputsize();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long dp = apiRequest.dp();
    return getEarningsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, period, outputsize, format, delimiter, startDate, endDate, dp, headers);
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param period Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;1000&#x60;. Default &#x60;10&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 10)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param startDate The date from which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param endDate The date to which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param dp The number of decimal places in the response data. Should be in range [0,11] inclusive (optional, default to 2)
   * @return GetEarnings200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarnings200Response getEarnings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable PeriodEarningsEnum period, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp) throws ApiException {
    return getEarnings(symbol, figi, isin, cusip, exchange, micCode, country, type, period, outputsize, format, delimiter, startDate, endDate, dp, null);
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param period Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;1000&#x60;. Default &#x60;10&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 10)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param startDate The date from which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param endDate The date to which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param dp The number of decimal places in the response data. Should be in range [0,11] inclusive (optional, default to 2)
   * @param headers Optional headers to include in the request
   * @return GetEarnings200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarnings200Response getEarnings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable PeriodEarningsEnum period, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEarnings200Response> localVarResponse = getEarningsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, period, outputsize, format, delimiter, startDate, endDate, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param period Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;1000&#x60;. Default &#x60;10&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 10)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param startDate The date from which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param endDate The date to which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param dp The number of decimal places in the response data. Should be in range [0,11] inclusive (optional, default to 2)
   * @return ApiResponse&lt;GetEarnings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarnings200Response> getEarningsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable PeriodEarningsEnum period, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp) throws ApiException {
    return getEarningsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, type, period, outputsize, format, delimiter, startDate, endDate, dp, null);
  }

  /**
   * Earnings
   * The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param type The asset class to which the instrument belongs (optional)
   * @param period Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;1000&#x60;. Default &#x60;10&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 10)
   * @param format The format of the response data (optional, default to JSON)
   * @param delimiter The separator used in the CSV response data (optional, default to ;)
   * @param startDate The date from which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param endDate The date to which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
   * @param dp The number of decimal places in the response data. Should be in range [0,11] inclusive (optional, default to 2)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarnings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarnings200Response> getEarningsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable PeriodEarningsEnum period, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEarningsRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, type, period, outputsize, format, delimiter, startDate, endDate, dp, headers);
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
          throw getApiException("getEarnings", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEarnings200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEarnings200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEarnings200Response>() {});
        

        return new ApiResponse<GetEarnings200Response>(
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

  private HttpRequest.Builder getEarningsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable TypeEnum type, @javax.annotation.Nullable PeriodEarningsEnum period, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/earnings";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "format";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("format", format));
    localVarQueryParameterBaseName = "delimiter";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("delimiter", delimiter));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetEarningsRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEarningsEnum period; // Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;1000&#x60;. Default &#x60;10&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 10)
    @javax.annotation.Nullable
    private FormatEnum format; // The format of the response data (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // The separator used in the CSV response data (optional, default to ;)
    @javax.annotation.Nullable
    private String startDate; // The date from which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
    @javax.annotation.Nullable
    private String endDate; // The date to which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. (optional)
    @javax.annotation.Nullable
    private Long dp; // The number of decimal places in the response data. Should be in range [0,11] inclusive (optional, default to 2)

    private APIGetEarningsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.type = builder.type;
      this.period = builder.period;
      this.outputsize = builder.outputsize;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public PeriodEarningsEnum period() {
      return period;
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
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
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
      private PeriodEarningsEnum period;
      private Long outputsize;
      private FormatEnum format;
      private String delimiter;
      private String startDate;
      private String endDate;
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
      public Builder period(@javax.annotation.Nullable PeriodEarningsEnum period) {
        this.period = period;
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
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public APIGetEarningsRequest build() {
        return new APIGetEarningsRequest(this);
      }
    }
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param apiRequest {@link APIGetEarningsCalendarRequest}
   * @return GetEarningsCalendar200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsCalendar200Response getEarningsCalendar(APIGetEarningsCalendarRequest apiRequest) throws ApiException {
    return getEarningsCalendar(apiRequest, null);
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param apiRequest {@link APIGetEarningsCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return GetEarningsCalendar200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsCalendar200Response getEarningsCalendar(APIGetEarningsCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long dp = apiRequest.dp();
    return getEarningsCalendar(exchange, micCode, country, format, delimiter, startDate, endDate, dp, headers);
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param apiRequest {@link APIGetEarningsCalendarRequest}
   * @return ApiResponse&lt;GetEarningsCalendar200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsCalendar200Response> getEarningsCalendarWithHttpInfo(APIGetEarningsCalendarRequest apiRequest) throws ApiException {
    return getEarningsCalendarWithHttpInfo(apiRequest, null);
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param apiRequest {@link APIGetEarningsCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarningsCalendar200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsCalendar200Response> getEarningsCalendarWithHttpInfo(APIGetEarningsCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    FormatEnum format = apiRequest.format();
    String delimiter = apiRequest.delimiter();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long dp = apiRequest.dp();
    return getEarningsCalendarWithHttpInfo(exchange, micCode, country, format, delimiter, startDate, endDate, dp, headers);
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param startDate Can be used separately and together with end_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param endDate Can be used separately and together with start_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 2)
   * @return GetEarningsCalendar200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsCalendar200Response getEarningsCalendar(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp) throws ApiException {
    return getEarningsCalendar(exchange, micCode, country, format, delimiter, startDate, endDate, dp, null);
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param startDate Can be used separately and together with end_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param endDate Can be used separately and together with start_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 2)
   * @param headers Optional headers to include in the request
   * @return GetEarningsCalendar200Response
   * @throws ApiException if fails to make API call
   */
  public GetEarningsCalendar200Response getEarningsCalendar(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEarningsCalendar200Response> localVarResponse = getEarningsCalendarWithHttpInfo(exchange, micCode, country, format, delimiter, startDate, endDate, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param startDate Can be used separately and together with end_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param endDate Can be used separately and together with start_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 2)
   * @return ApiResponse&lt;GetEarningsCalendar200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsCalendar200Response> getEarningsCalendarWithHttpInfo(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp) throws ApiException {
    return getEarningsCalendarWithHttpInfo(exchange, micCode, country, format, delimiter, startDate, endDate, dp, null);
  }

  /**
   * Earnings calendar
   * The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param format Value can be JSON or CSV (optional, default to JSON)
   * @param delimiter Specify the delimiter used when downloading the CSV file (optional, default to ;)
   * @param startDate Can be used separately and together with end_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param endDate Can be used separately and together with start_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
   * @param dp Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 2)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEarningsCalendar200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEarningsCalendar200Response> getEarningsCalendarWithHttpInfo(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEarningsCalendarRequestBuilder(exchange, micCode, country, format, delimiter, startDate, endDate, dp, headers);
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
          throw getApiException("getEarningsCalendar", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEarningsCalendar200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEarningsCalendar200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEarningsCalendar200Response>() {});
        

        return new ApiResponse<GetEarningsCalendar200Response>(
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

  private HttpRequest.Builder getEarningsCalendarRequestBuilder(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable FormatEnum format, @javax.annotation.Nullable String delimiter, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/earnings_calendar";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
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
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetEarningsCalendarRequest {
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private FormatEnum format; // Value can be JSON or CSV (optional, default to JSON)
    @javax.annotation.Nullable
    private String delimiter; // Specify the delimiter used when downloading the CSV file (optional, default to ;)
    @javax.annotation.Nullable
    private String startDate; // Can be used separately and together with end_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // Can be used separately and together with start_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; (optional)
    @javax.annotation.Nullable
    private Long dp; // Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive (optional, default to 2)

    private APIGetEarningsCalendarRequest(Builder builder) {
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.format = builder.format;
      this.delimiter = builder.delimiter;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.dp = builder.dp;
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
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
    }
    @javax.annotation.Nullable
    public Long dp() {
      return dp;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String exchange;
      private String micCode;
      private String country;
      private FormatEnum format;
      private String delimiter;
      private String startDate;
      private String endDate;
      private Long dp;

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
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public Builder dp(@javax.annotation.Nullable Long dp) {
        this.dp = dp;
        return this;
      }
      public APIGetEarningsCalendarRequest build() {
        return new APIGetEarningsCalendarRequest(this);
      }
    }
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param apiRequest {@link APIGetIncomeStatementRequest}
   * @return GetIncomeStatement200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatement200Response getIncomeStatement(APIGetIncomeStatementRequest apiRequest) throws ApiException {
    return getIncomeStatement(apiRequest, null);
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param apiRequest {@link APIGetIncomeStatementRequest}
   * @param headers Optional headers to include in the request
   * @return GetIncomeStatement200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatement200Response getIncomeStatement(APIGetIncomeStatementRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEnum period = apiRequest.period();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getIncomeStatement(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param apiRequest {@link APIGetIncomeStatementRequest}
   * @return ApiResponse&lt;GetIncomeStatement200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatement200Response> getIncomeStatementWithHttpInfo(APIGetIncomeStatementRequest apiRequest) throws ApiException {
    return getIncomeStatementWithHttpInfo(apiRequest, null);
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param apiRequest {@link APIGetIncomeStatementRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetIncomeStatement200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatement200Response> getIncomeStatementWithHttpInfo(APIGetIncomeStatementRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    PeriodEnum period = apiRequest.period();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    return getIncomeStatementWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return GetIncomeStatement200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatement200Response getIncomeStatement(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getIncomeStatement(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return GetIncomeStatement200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatement200Response getIncomeStatement(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetIncomeStatement200Response> localVarResponse = getIncomeStatementWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return ApiResponse&lt;GetIncomeStatement200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatement200Response> getIncomeStatementWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getIncomeStatementWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Income statement
   * The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetIncomeStatement200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatement200Response> getIncomeStatementWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getIncomeStatementRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
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
          throw getApiException("getIncomeStatement", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetIncomeStatement200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetIncomeStatement200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetIncomeStatement200Response>() {});
        

        return new ApiResponse<GetIncomeStatement200Response>(
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

  private HttpRequest.Builder getIncomeStatementRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/income_statement";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetIncomeStatementRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEnum period; // The reporting period for the income statement data (optional, default to annual)
    @javax.annotation.Nullable
    private String startDate; // Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 6)

    private APIGetIncomeStatementRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.period = builder.period;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public PeriodEnum period() {
      return period;
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
      private String micCode;
      private String country;
      private PeriodEnum period;
      private String startDate;
      private String endDate;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder period(@javax.annotation.Nullable PeriodEnum period) {
        this.period = period;
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
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetIncomeStatementRequest build() {
        return new APIGetIncomeStatementRequest(this);
      }
    }
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param apiRequest {@link APIGetIncomeStatementConsolidatedRequest}
   * @return GetIncomeStatementConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatementConsolidated200Response getIncomeStatementConsolidated(APIGetIncomeStatementConsolidatedRequest apiRequest) throws ApiException {
    return getIncomeStatementConsolidated(apiRequest, null);
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param apiRequest {@link APIGetIncomeStatementConsolidatedRequest}
   * @param headers Optional headers to include in the request
   * @return GetIncomeStatementConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatementConsolidated200Response getIncomeStatementConsolidated(APIGetIncomeStatementConsolidatedRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    PeriodEnum period = apiRequest.period();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getIncomeStatementConsolidated(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param apiRequest {@link APIGetIncomeStatementConsolidatedRequest}
   * @return ApiResponse&lt;GetIncomeStatementConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatementConsolidated200Response> getIncomeStatementConsolidatedWithHttpInfo(APIGetIncomeStatementConsolidatedRequest apiRequest) throws ApiException {
    return getIncomeStatementConsolidatedWithHttpInfo(apiRequest, null);
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param apiRequest {@link APIGetIncomeStatementConsolidatedRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetIncomeStatementConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatementConsolidated200Response> getIncomeStatementConsolidatedWithHttpInfo(APIGetIncomeStatementConsolidatedRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    PeriodEnum period = apiRequest.period();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    return getIncomeStatementConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return GetIncomeStatementConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatementConsolidated200Response getIncomeStatementConsolidated(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getIncomeStatementConsolidated(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return GetIncomeStatementConsolidated200Response
   * @throws ApiException if fails to make API call
   */
  public GetIncomeStatementConsolidated200Response getIncomeStatementConsolidated(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetIncomeStatementConsolidated200Response> localVarResponse = getIncomeStatementConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @return ApiResponse&lt;GetIncomeStatementConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatementConsolidated200Response> getIncomeStatementConsolidatedWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getIncomeStatementConsolidatedWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, null);
  }

  /**
   * Income statement consolidated
   * The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param period The reporting period for the income statement data (optional, default to annual)
   * @param startDate Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of records in response (optional, default to 6)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetIncomeStatementConsolidated200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetIncomeStatementConsolidated200Response> getIncomeStatementConsolidatedWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getIncomeStatementConsolidatedRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, period, startDate, endDate, outputsize, headers);
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
          throw getApiException("getIncomeStatementConsolidated", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetIncomeStatementConsolidated200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetIncomeStatementConsolidated200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetIncomeStatementConsolidated200Response>() {});
        

        return new ApiResponse<GetIncomeStatementConsolidated200Response>(
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

  private HttpRequest.Builder getIncomeStatementConsolidatedRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable PeriodEnum period, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/income_statement/consolidated";

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
    localVarQueryParameterBaseName = "period";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("period", period));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetIncomeStatementConsolidatedRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private PeriodEnum period; // The reporting period for the income statement data (optional, default to annual)
    @javax.annotation.Nullable
    private String startDate; // Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 6)

    private APIGetIncomeStatementConsolidatedRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.period = builder.period;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
    }
    @javax.annotation.Nullable
    public PeriodEnum period() {
      return period;
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
      private String micCode;
      private String country;
      private PeriodEnum period;
      private String startDate;
      private String endDate;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public Builder period(@javax.annotation.Nullable PeriodEnum period) {
        this.period = period;
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
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetIncomeStatementConsolidatedRequest build() {
        return new APIGetIncomeStatementConsolidatedRequest(this);
      }
    }
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param apiRequest {@link APIGetIpoCalendarRequest}
   * @return Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<GetIpoCalendar200ResponseValueInner>> getIpoCalendar(APIGetIpoCalendarRequest apiRequest) throws ApiException {
    return getIpoCalendar(apiRequest, null);
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param apiRequest {@link APIGetIpoCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<GetIpoCalendar200ResponseValueInner>> getIpoCalendar(APIGetIpoCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    return getIpoCalendar(exchange, micCode, country, startDate, endDate, headers);
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param apiRequest {@link APIGetIpoCalendarRequest}
   * @return ApiResponse&lt;Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> getIpoCalendarWithHttpInfo(APIGetIpoCalendarRequest apiRequest) throws ApiException {
    return getIpoCalendarWithHttpInfo(apiRequest, null);
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param apiRequest {@link APIGetIpoCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> getIpoCalendarWithHttpInfo(APIGetIpoCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    return getIpoCalendarWithHttpInfo(exchange, micCode, country, startDate, endDate, headers);
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The earliest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @param endDate The latest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @return Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<GetIpoCalendar200ResponseValueInner>> getIpoCalendar(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate) throws ApiException {
    return getIpoCalendar(exchange, micCode, country, startDate, endDate, null);
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The earliest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @param endDate The latest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<GetIpoCalendar200ResponseValueInner>> getIpoCalendar(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, Map<String, String> headers) throws ApiException {
    ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> localVarResponse = getIpoCalendarWithHttpInfo(exchange, micCode, country, startDate, endDate, headers);
    return localVarResponse.getData();
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The earliest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @param endDate The latest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @return ApiResponse&lt;Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> getIpoCalendarWithHttpInfo(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate) throws ApiException {
    return getIpoCalendarWithHttpInfo(exchange, micCode, country, startDate, endDate, null);
  }

  /**
   * IPO calendar
   * The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The earliest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @param endDate The latest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> getIpoCalendarWithHttpInfo(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getIpoCalendarRequestBuilder(exchange, micCode, country, startDate, endDate, headers);
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
          throw getApiException("getIpoCalendar", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        Map<String, List<GetIpoCalendar200ResponseValueInner>> responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<Map<String, List<GetIpoCalendar200ResponseValueInner>>>() {});
        

        return new ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>>(
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

  private HttpRequest.Builder getIpoCalendarRequestBuilder(@javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/ipo_calendar";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));

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


  public static final class APIGetIpoCalendarRequest {
    @javax.annotation.Nullable
    private String exchange; // Exchange where instrument is traded (optional)
    @javax.annotation.Nullable
    private String micCode; // Market Identifier Code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String startDate; // The earliest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // The latest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; (optional)

    private APIGetIpoCalendarRequest(Builder builder) {
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
    }
    public static Builder newBuilder() {
      return new Builder();
    }

    public static class Builder {
      private String exchange;
      private String micCode;
      private String country;
      private String startDate;
      private String endDate;

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
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public APIGetIpoCalendarRequest build() {
        return new APIGetIpoCalendarRequest(this);
      }
    }
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param apiRequest {@link APIGetKeyExecutivesRequest}
   * @return GetKeyExecutives200Response
   * @throws ApiException if fails to make API call
   */
  public GetKeyExecutives200Response getKeyExecutives(APIGetKeyExecutivesRequest apiRequest) throws ApiException {
    return getKeyExecutives(apiRequest, null);
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param apiRequest {@link APIGetKeyExecutivesRequest}
   * @param headers Optional headers to include in the request
   * @return GetKeyExecutives200Response
   * @throws ApiException if fails to make API call
   */
  public GetKeyExecutives200Response getKeyExecutives(APIGetKeyExecutivesRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    return getKeyExecutives(symbol, figi, isin, cusip, exchange, micCode, country, headers);
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param apiRequest {@link APIGetKeyExecutivesRequest}
   * @return ApiResponse&lt;GetKeyExecutives200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetKeyExecutives200Response> getKeyExecutivesWithHttpInfo(APIGetKeyExecutivesRequest apiRequest) throws ApiException {
    return getKeyExecutivesWithHttpInfo(apiRequest, null);
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param apiRequest {@link APIGetKeyExecutivesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetKeyExecutives200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetKeyExecutives200Response> getKeyExecutivesWithHttpInfo(APIGetKeyExecutivesRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    return getKeyExecutivesWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetKeyExecutives200Response
   * @throws ApiException if fails to make API call
   */
  public GetKeyExecutives200Response getKeyExecutives(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getKeyExecutives(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetKeyExecutives200Response
   * @throws ApiException if fails to make API call
   */
  public GetKeyExecutives200Response getKeyExecutives(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetKeyExecutives200Response> localVarResponse = getKeyExecutivesWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetKeyExecutives200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetKeyExecutives200Response> getKeyExecutivesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getKeyExecutivesWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Key executives
   * The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetKeyExecutives200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetKeyExecutives200Response> getKeyExecutivesWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getKeyExecutivesRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getKeyExecutives", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetKeyExecutives200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetKeyExecutives200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetKeyExecutives200Response>() {});
        

        return new ApiResponse<GetKeyExecutives200Response>(
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

  private HttpRequest.Builder getKeyExecutivesRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/key_executives";

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


  public static final class APIGetKeyExecutivesRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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

    private APIGetKeyExecutivesRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
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
      private String figi;
      private String isin;
      private String cusip;
      private String exchange;
      private String micCode;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public APIGetKeyExecutivesRequest build() {
        return new APIGetKeyExecutivesRequest(this);
      }
    }
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param apiRequest {@link APIGetLastChangesRequest}
   * @return GetLastChanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetLastChanges200Response getLastChanges(APIGetLastChangesRequest apiRequest) throws ApiException {
    return getLastChanges(apiRequest, null);
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param apiRequest {@link APIGetLastChangesRequest}
   * @param headers Optional headers to include in the request
   * @return GetLastChanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetLastChanges200Response getLastChanges(APIGetLastChangesRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    EndpointEnum endpoint = apiRequest.endpoint();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    @javax.annotation.Nullable
    Long page = apiRequest.page();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getLastChanges(endpoint, startDate, symbol, exchange, micCode, country, page, outputsize, headers);
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param apiRequest {@link APIGetLastChangesRequest}
   * @return ApiResponse&lt;GetLastChanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLastChanges200Response> getLastChangesWithHttpInfo(APIGetLastChangesRequest apiRequest) throws ApiException {
    return getLastChangesWithHttpInfo(apiRequest, null);
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param apiRequest {@link APIGetLastChangesRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetLastChanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLastChanges200Response> getLastChangesWithHttpInfo(APIGetLastChangesRequest apiRequest, Map<String, String> headers) throws ApiException {
    EndpointEnum endpoint = apiRequest.endpoint();
    String startDate = apiRequest.startDate();
    String symbol = apiRequest.symbol();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    Long page = apiRequest.page();
    Long outputsize = apiRequest.outputsize();
    return getLastChangesWithHttpInfo(endpoint, startDate, symbol, exchange, micCode, country, page, outputsize, headers);
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param endpoint Endpoint name (required)
   * @param startDate The starting date and time for data selection, in &#x60;2006-01-02T15:04:05&#x60; format (optional)
   * @param symbol Filter by symbol (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 30)
   * @return GetLastChanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetLastChanges200Response getLastChanges(@javax.annotation.Nonnull EndpointEnum endpoint, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getLastChanges(endpoint, startDate, symbol, exchange, micCode, country, page, outputsize, null);
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param endpoint Endpoint name (required)
   * @param startDate The starting date and time for data selection, in &#x60;2006-01-02T15:04:05&#x60; format (optional)
   * @param symbol Filter by symbol (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param headers Optional headers to include in the request
   * @return GetLastChanges200Response
   * @throws ApiException if fails to make API call
   */
  public GetLastChanges200Response getLastChanges(@javax.annotation.Nonnull EndpointEnum endpoint, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetLastChanges200Response> localVarResponse = getLastChangesWithHttpInfo(endpoint, startDate, symbol, exchange, micCode, country, page, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param endpoint Endpoint name (required)
   * @param startDate The starting date and time for data selection, in &#x60;2006-01-02T15:04:05&#x60; format (optional)
   * @param symbol Filter by symbol (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 30)
   * @return ApiResponse&lt;GetLastChanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLastChanges200Response> getLastChangesWithHttpInfo(@javax.annotation.Nonnull EndpointEnum endpoint, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getLastChangesWithHttpInfo(endpoint, startDate, symbol, exchange, micCode, country, page, outputsize, null);
  }

  /**
   * Last changes
   * The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.
   * @param endpoint Endpoint name (required)
   * @param startDate The starting date and time for data selection, in &#x60;2006-01-02T15:04:05&#x60; format (optional)
   * @param symbol Filter by symbol (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 30)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetLastChanges200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLastChanges200Response> getLastChangesWithHttpInfo(@javax.annotation.Nonnull EndpointEnum endpoint, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLastChangesRequestBuilder(endpoint, startDate, symbol, exchange, micCode, country, page, outputsize, headers);
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
          throw getApiException("getLastChanges", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetLastChanges200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetLastChanges200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetLastChanges200Response>() {});
        

        return new ApiResponse<GetLastChanges200Response>(
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

  private HttpRequest.Builder getLastChangesRequestBuilder(@javax.annotation.Nonnull EndpointEnum endpoint, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'endpoint' is set
    if (endpoint == null) {
      throw new ApiException(400, "Missing the required parameter 'endpoint' when calling getLastChanges");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/last_change/{endpoint}"
        .replace("{endpoint}", ApiClient.urlEncode(endpoint.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "symbol";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("symbol", symbol));
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));
    localVarQueryParameterBaseName = "country";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("country", country));
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


  public static final class APIGetLastChangesRequest {
    @javax.annotation.Nonnull
    private EndpointEnum endpoint; // Endpoint name (required)
    @javax.annotation.Nullable
    private String startDate; // The starting date and time for data selection, in &#x60;2006-01-02T15:04:05&#x60; format (optional)
    @javax.annotation.Nullable
    private String symbol; // Filter by symbol (optional)
    @javax.annotation.Nullable
    private String exchange; // Filter by exchange name (optional)
    @javax.annotation.Nullable
    private String micCode; // Filter by market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private Long page; // Page number (optional, default to 1)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 30)

    private APIGetLastChangesRequest(Builder builder) {
      this.endpoint = builder.endpoint;
      this.startDate = builder.startDate;
      this.symbol = builder.symbol;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.page = builder.page;
      this.outputsize = builder.outputsize;
    }
    @javax.annotation.Nonnull
    public EndpointEnum endpoint() {
      return endpoint;
    }
    @javax.annotation.Nullable
    public String startDate() {
      return startDate;
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
    public String micCode() {
      return micCode;
    }
    @javax.annotation.Nullable
    public String country() {
      return country;
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
      private EndpointEnum endpoint;
      private String startDate;
      private String symbol;
      private String exchange;
      private String micCode;
      private String country;
      private Long page;
      private Long outputsize;

      public Builder endpoint(@javax.annotation.Nonnull EndpointEnum endpoint) {
        this.endpoint = endpoint;
        return this;
      }
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder symbol(@javax.annotation.Nullable String symbol) {
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
      public Builder page(@javax.annotation.Nullable Long page) {
        this.page = page;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIGetLastChangesRequest build() {
        return new APIGetLastChangesRequest(this);
      }
    }
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param apiRequest {@link APIGetLogoRequest}
   * @return GetLogo200Response
   * @throws ApiException if fails to make API call
   */
  public GetLogo200Response getLogo(APIGetLogoRequest apiRequest) throws ApiException {
    return getLogo(apiRequest, null);
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param apiRequest {@link APIGetLogoRequest}
   * @param headers Optional headers to include in the request
   * @return GetLogo200Response
   * @throws ApiException if fails to make API call
   */
  public GetLogo200Response getLogo(APIGetLogoRequest apiRequest, Map<String, String> headers) throws ApiException {
    @javax.annotation.Nonnull
    String symbol = apiRequest.symbol();
    @javax.annotation.Nullable
    String exchange = apiRequest.exchange();
    @javax.annotation.Nullable
    String micCode = apiRequest.micCode();
    @javax.annotation.Nullable
    String country = apiRequest.country();
    return getLogo(symbol, exchange, micCode, country, headers);
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param apiRequest {@link APIGetLogoRequest}
   * @return ApiResponse&lt;GetLogo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLogo200Response> getLogoWithHttpInfo(APIGetLogoRequest apiRequest) throws ApiException {
    return getLogoWithHttpInfo(apiRequest, null);
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param apiRequest {@link APIGetLogoRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetLogo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLogo200Response> getLogoWithHttpInfo(APIGetLogoRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    return getLogoWithHttpInfo(symbol, exchange, micCode, country, headers);
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;BTC/USD&#x60;, &#x60;EUR/USD&#x60;. (required)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;NASDAQ&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetLogo200Response
   * @throws ApiException if fails to make API call
   */
  public GetLogo200Response getLogo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getLogo(symbol, exchange, micCode, country, null);
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;BTC/USD&#x60;, &#x60;EUR/USD&#x60;. (required)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;NASDAQ&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetLogo200Response
   * @throws ApiException if fails to make API call
   */
  public GetLogo200Response getLogo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetLogo200Response> localVarResponse = getLogoWithHttpInfo(symbol, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;BTC/USD&#x60;, &#x60;EUR/USD&#x60;. (required)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;NASDAQ&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetLogo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLogo200Response> getLogoWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getLogoWithHttpInfo(symbol, exchange, micCode, country, null);
  }

  /**
   * Logo
   * The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;BTC/USD&#x60;, &#x60;EUR/USD&#x60;. (required)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;NASDAQ&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @param country The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetLogo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLogo200Response> getLogoWithHttpInfo(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLogoRequestBuilder(symbol, exchange, micCode, country, headers);
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
          throw getApiException("getLogo", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetLogo200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetLogo200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetLogo200Response>() {});
        

        return new ApiResponse<GetLogo200Response>(
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

  private HttpRequest.Builder getLogoRequestBuilder(@javax.annotation.Nonnull String symbol, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling getLogo");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/logo";

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


  public static final class APIGetLogoRequest {
    @javax.annotation.Nonnull
    private String symbol; // The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;BTC/USD&#x60;, &#x60;EUR/USD&#x60;. (required)
    @javax.annotation.Nullable
    private String exchange; // The exchange name where the instrument is traded, e.g., &#x60;NASDAQ&#x60;, &#x60;NSE&#x60; (optional)
    @javax.annotation.Nullable
    private String micCode; // The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
    @javax.annotation.Nullable
    private String country; // The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)

    private APIGetLogoRequest(Builder builder) {
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
      public APIGetLogoRequest build() {
        return new APIGetLogoRequest(this);
      }
    }
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param apiRequest {@link APIGetMarketCapRequest}
   * @return GetMarketCap200Response
   * @throws ApiException if fails to make API call
   */
  public GetMarketCap200Response getMarketCap(APIGetMarketCapRequest apiRequest) throws ApiException {
    return getMarketCap(apiRequest, null);
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param apiRequest {@link APIGetMarketCapRequest}
   * @param headers Optional headers to include in the request
   * @return GetMarketCap200Response
   * @throws ApiException if fails to make API call
   */
  public GetMarketCap200Response getMarketCap(APIGetMarketCapRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long page = apiRequest.page();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return getMarketCap(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, page, outputsize, headers);
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param apiRequest {@link APIGetMarketCapRequest}
   * @return ApiResponse&lt;GetMarketCap200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMarketCap200Response> getMarketCapWithHttpInfo(APIGetMarketCapRequest apiRequest) throws ApiException {
    return getMarketCapWithHttpInfo(apiRequest, null);
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param apiRequest {@link APIGetMarketCapRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMarketCap200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMarketCap200Response> getMarketCapWithHttpInfo(APIGetMarketCapRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long page = apiRequest.page();
    Long outputsize = apiRequest.outputsize();
    return getMarketCapWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, page, outputsize, headers);
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for market capitalization data retrieval. Data will be returned up to and including this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 10)
   * @return GetMarketCap200Response
   * @throws ApiException if fails to make API call
   */
  public GetMarketCap200Response getMarketCap(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getMarketCap(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, page, outputsize, null);
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for market capitalization data retrieval. Data will be returned up to and including this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 10)
   * @param headers Optional headers to include in the request
   * @return GetMarketCap200Response
   * @throws ApiException if fails to make API call
   */
  public GetMarketCap200Response getMarketCap(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMarketCap200Response> localVarResponse = getMarketCapWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, page, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for market capitalization data retrieval. Data will be returned up to and including this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 10)
   * @return ApiResponse&lt;GetMarketCap200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMarketCap200Response> getMarketCapWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getMarketCapWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, page, outputsize, null);
  }

  /**
   * Market capitalization
   * The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate End date for market capitalization data retrieval. Data will be returned up to and including this date. Format &#x60;2006-01-02&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 10)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMarketCap200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMarketCap200Response> getMarketCapWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMarketCapRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, page, outputsize, headers);
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
          throw getApiException("getMarketCap", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMarketCap200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMarketCap200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMarketCap200Response>() {});
        

        return new ApiResponse<GetMarketCap200Response>(
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

  private HttpRequest.Builder getMarketCapRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/market_cap";

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
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
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


  public static final class APIGetMarketCapRequest {
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
    private String micCode; // Filter by market identifier code (MIC) under ISO 10383 standard (optional)
    @javax.annotation.Nullable
    private String country; // Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
    @javax.annotation.Nullable
    private String startDate; // Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for market capitalization data retrieval. Data will be returned up to and including this date. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long page; // Page number (optional, default to 1)
    @javax.annotation.Nullable
    private Long outputsize; // Number of records in response (optional, default to 10)

    private APIGetMarketCapRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
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
      private String exchange;
      private String micCode;
      private String country;
      private String startDate;
      private String endDate;
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
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
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
      public APIGetMarketCapRequest build() {
        return new APIGetMarketCapRequest(this);
      }
    }
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param apiRequest {@link APIGetProfileRequest}
   * @return GetProfile200Response
   * @throws ApiException if fails to make API call
   */
  public GetProfile200Response getProfile(APIGetProfileRequest apiRequest) throws ApiException {
    return getProfile(apiRequest, null);
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param apiRequest {@link APIGetProfileRequest}
   * @param headers Optional headers to include in the request
   * @return GetProfile200Response
   * @throws ApiException if fails to make API call
   */
  public GetProfile200Response getProfile(APIGetProfileRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    return getProfile(symbol, figi, isin, cusip, exchange, micCode, country, headers);
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param apiRequest {@link APIGetProfileRequest}
   * @return ApiResponse&lt;GetProfile200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetProfile200Response> getProfileWithHttpInfo(APIGetProfileRequest apiRequest) throws ApiException {
    return getProfileWithHttpInfo(apiRequest, null);
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param apiRequest {@link APIGetProfileRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetProfile200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetProfile200Response> getProfileWithHttpInfo(APIGetProfileRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    return getProfileWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetProfile200Response
   * @throws ApiException if fails to make API call
   */
  public GetProfile200Response getProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getProfile(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetProfile200Response
   * @throws ApiException if fails to make API call
   */
  public GetProfile200Response getProfile(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetProfile200Response> localVarResponse = getProfileWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetProfile200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetProfile200Response> getProfileWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getProfileWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Profile
   * The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetProfile200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetProfile200Response> getProfileWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getProfileRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getProfile", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetProfile200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetProfile200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetProfile200Response>() {});
        

        return new ApiResponse<GetProfile200Response>(
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

  private HttpRequest.Builder getProfileRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/profile";

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


  public static final class APIGetProfileRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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

    private APIGetProfileRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
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
      private String figi;
      private String isin;
      private String cusip;
      private String exchange;
      private String micCode;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public APIGetProfileRequest build() {
        return new APIGetProfileRequest(this);
      }
    }
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param apiRequest {@link APIGetSplitsRequest}
   * @return GetSplits200Response
   * @throws ApiException if fails to make API call
   */
  public GetSplits200Response getSplits(APIGetSplitsRequest apiRequest) throws ApiException {
    return getSplits(apiRequest, null);
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param apiRequest {@link APIGetSplitsRequest}
   * @param headers Optional headers to include in the request
   * @return GetSplits200Response
   * @throws ApiException if fails to make API call
   */
  public GetSplits200Response getSplits(APIGetSplitsRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    RangeSplitsEnum range = apiRequest.range();
    @javax.annotation.Nullable
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    return getSplits(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, headers);
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param apiRequest {@link APIGetSplitsRequest}
   * @return ApiResponse&lt;GetSplits200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSplits200Response> getSplitsWithHttpInfo(APIGetSplitsRequest apiRequest) throws ApiException {
    return getSplitsWithHttpInfo(apiRequest, null);
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param apiRequest {@link APIGetSplitsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetSplits200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSplits200Response> getSplitsWithHttpInfo(APIGetSplitsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    RangeSplitsEnum range = apiRequest.range();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    return getSplitsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, headers);
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Range of data to be returned (optional, default to last)
   * @param startDate The starting date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @return GetSplits200Response
   * @throws ApiException if fails to make API call
   */
  public GetSplits200Response getSplits(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeSplitsEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate) throws ApiException {
    return getSplits(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, null);
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Range of data to be returned (optional, default to last)
   * @param startDate The starting date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetSplits200Response
   * @throws ApiException if fails to make API call
   */
  public GetSplits200Response getSplits(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeSplitsEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, Map<String, String> headers) throws ApiException {
    ApiResponse<GetSplits200Response> localVarResponse = getSplitsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, headers);
    return localVarResponse.getData();
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Range of data to be returned (optional, default to last)
   * @param startDate The starting date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @return ApiResponse&lt;GetSplits200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSplits200Response> getSplitsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeSplitsEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate) throws ApiException {
    return getSplitsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, null);
  }

  /**
   * Splits
   * The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param range Range of data to be returned (optional, default to last)
   * @param startDate The starting date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date for data selection. Format &#x60;2006-01-02&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetSplits200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSplits200Response> getSplitsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeSplitsEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSplitsRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, range, startDate, endDate, headers);
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
          throw getApiException("getSplits", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetSplits200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetSplits200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetSplits200Response>() {});
        

        return new ApiResponse<GetSplits200Response>(
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

  private HttpRequest.Builder getSplitsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable RangeSplitsEnum range, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/splits";

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
    localVarQueryParameterBaseName = "range";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("range", range));
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));

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


  public static final class APIGetSplitsRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private RangeSplitsEnum range; // Range of data to be returned (optional, default to last)
    @javax.annotation.Nullable
    private String startDate; // The starting date for data selection. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // The ending date for data selection. Format &#x60;2006-01-02&#x60; (optional)

    private APIGetSplitsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.range = builder.range;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
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
    public RangeSplitsEnum range() {
      return range;
    }
    @javax.annotation.Nullable
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
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
      private RangeSplitsEnum range;
      private String startDate;
      private String endDate;

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
      public Builder range(@javax.annotation.Nullable RangeSplitsEnum range) {
        this.range = range;
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
      public APIGetSplitsRequest build() {
        return new APIGetSplitsRequest(this);
      }
    }
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param apiRequest {@link APIGetSplitsCalendarRequest}
   * @return List&lt;SplitsCalendarResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SplitsCalendarResponseItem> getSplitsCalendar(APIGetSplitsCalendarRequest apiRequest) throws ApiException {
    return getSplitsCalendar(apiRequest, null);
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param apiRequest {@link APIGetSplitsCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return List&lt;SplitsCalendarResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SplitsCalendarResponseItem> getSplitsCalendar(APIGetSplitsCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    @javax.annotation.Nullable
    String page = apiRequest.page();
    return getSplitsCalendar(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param apiRequest {@link APIGetSplitsCalendarRequest}
   * @return ApiResponse&lt;List&lt;SplitsCalendarResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SplitsCalendarResponseItem>> getSplitsCalendarWithHttpInfo(APIGetSplitsCalendarRequest apiRequest) throws ApiException {
    return getSplitsCalendarWithHttpInfo(apiRequest, null);
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param apiRequest {@link APIGetSplitsCalendarRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;List&lt;SplitsCalendarResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SplitsCalendarResponseItem>> getSplitsCalendarWithHttpInfo(APIGetSplitsCalendarRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    Long outputsize = apiRequest.outputsize();
    String page = apiRequest.page();
    return getSplitsCalendarWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The starting date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @return List&lt;SplitsCalendarResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SplitsCalendarResponseItem> getSplitsCalendar(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String page) throws ApiException {
    return getSplitsCalendar(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, null);
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The starting date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @param headers Optional headers to include in the request
   * @return List&lt;SplitsCalendarResponseItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SplitsCalendarResponseItem> getSplitsCalendar(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String page, Map<String, String> headers) throws ApiException {
    ApiResponse<List<SplitsCalendarResponseItem>> localVarResponse = getSplitsCalendarWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
    return localVarResponse.getData();
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The starting date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @return ApiResponse&lt;List&lt;SplitsCalendarResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SplitsCalendarResponseItem>> getSplitsCalendarWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String page) throws ApiException {
    return getSplitsCalendarWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, null);
  }

  /**
   * Splits calendar
   * The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param startDate The starting date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param endDate The ending date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
   * @param outputsize Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
   * @param page Page number (optional, default to 1)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;List&lt;SplitsCalendarResponseItem&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SplitsCalendarResponseItem>> getSplitsCalendarWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String page, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSplitsCalendarRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, startDate, endDate, outputsize, page, headers);
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
          throw getApiException("getSplitsCalendar", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<List<SplitsCalendarResponseItem>>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        List<SplitsCalendarResponseItem> responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<List<SplitsCalendarResponseItem>>() {});
        

        return new ApiResponse<List<SplitsCalendarResponseItem>>(
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

  private HttpRequest.Builder getSplitsCalendarRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable Long outputsize, @javax.annotation.Nullable String page, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/splits_calendar";

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
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
    localVarQueryParameterBaseName = "outputsize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("outputsize", outputsize));
    localVarQueryParameterBaseName = "page";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page", page));

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


  public static final class APIGetSplitsCalendarRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private String startDate; // The starting date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // The ending date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum (optional, default to 100)
    @javax.annotation.Nullable
    private String page; // Page number (optional, default to 1)

    private APIGetSplitsCalendarRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.country = builder.country;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.outputsize = builder.outputsize;
      this.page = builder.page;
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
    public String startDate() {
      return startDate;
    }
    @javax.annotation.Nullable
    public String endDate() {
      return endDate;
    }
    @javax.annotation.Nullable
    public Long outputsize() {
      return outputsize;
    }
    @javax.annotation.Nullable
    public String page() {
      return page;
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
      private String startDate;
      private String endDate;
      private Long outputsize;
      private String page;

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
      public Builder startDate(@javax.annotation.Nullable String startDate) {
        this.startDate = startDate;
        return this;
      }
      public Builder endDate(@javax.annotation.Nullable String endDate) {
        this.endDate = endDate;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public Builder page(@javax.annotation.Nullable String page) {
        this.page = page;
        return this;
      }
      public APIGetSplitsCalendarRequest build() {
        return new APIGetSplitsCalendarRequest(this);
      }
    }
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param apiRequest {@link APIGetStatisticsRequest}
   * @return GetStatistics200Response
   * @throws ApiException if fails to make API call
   */
  public GetStatistics200Response getStatistics(APIGetStatisticsRequest apiRequest) throws ApiException {
    return getStatistics(apiRequest, null);
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param apiRequest {@link APIGetStatisticsRequest}
   * @param headers Optional headers to include in the request
   * @return GetStatistics200Response
   * @throws ApiException if fails to make API call
   */
  public GetStatistics200Response getStatistics(APIGetStatisticsRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    return getStatistics(symbol, figi, isin, cusip, exchange, micCode, country, headers);
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param apiRequest {@link APIGetStatisticsRequest}
   * @return ApiResponse&lt;GetStatistics200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStatistics200Response> getStatisticsWithHttpInfo(APIGetStatisticsRequest apiRequest) throws ApiException {
    return getStatisticsWithHttpInfo(apiRequest, null);
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param apiRequest {@link APIGetStatisticsRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetStatistics200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStatistics200Response> getStatisticsWithHttpInfo(APIGetStatisticsRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String country = apiRequest.country();
    return getStatisticsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetStatistics200Response
   * @throws ApiException if fails to make API call
   */
  public GetStatistics200Response getStatistics(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getStatistics(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetStatistics200Response
   * @throws ApiException if fails to make API call
   */
  public GetStatistics200Response getStatistics(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetStatistics200Response> localVarResponse = getStatisticsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetStatistics200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStatistics200Response> getStatisticsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getStatisticsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Statistics
   * The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetStatistics200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStatistics200Response> getStatisticsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getStatisticsRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getStatistics", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetStatistics200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetStatistics200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetStatistics200Response>() {});
        

        return new ApiResponse<GetStatistics200Response>(
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

  private HttpRequest.Builder getStatisticsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/statistics";

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


  public static final class APIGetStatisticsRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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

    private APIGetStatisticsRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
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
      private String figi;
      private String isin;
      private String cusip;
      private String exchange;
      private String micCode;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
        return this;
      }
      public Builder country(@javax.annotation.Nullable String country) {
        this.country = country;
        return this;
      }
      public APIGetStatisticsRequest build() {
        return new APIGetStatisticsRequest(this);
      }
    }
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param apiRequest {@link APIPressReleasesListParametersRequest}
   * @return PressReleasesListParameters200Response
   * @throws ApiException if fails to make API call
   */
  public PressReleasesListParameters200Response pressReleasesListParameters(APIPressReleasesListParametersRequest apiRequest) throws ApiException {
    return pressReleasesListParameters(apiRequest, null);
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param apiRequest {@link APIPressReleasesListParametersRequest}
   * @param headers Optional headers to include in the request
   * @return PressReleasesListParameters200Response
   * @throws ApiException if fails to make API call
   */
  public PressReleasesListParameters200Response pressReleasesListParameters(APIPressReleasesListParametersRequest apiRequest, Map<String, String> headers) throws ApiException {
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
    String startDate = apiRequest.startDate();
    @javax.annotation.Nullable
    String endDate = apiRequest.endDate();
    @javax.annotation.Nullable
    String timezone = apiRequest.timezone();
    @javax.annotation.Nullable
    String language = apiRequest.language();
    @javax.annotation.Nullable
    Long outputsize = apiRequest.outputsize();
    return pressReleasesListParameters(symbol, figi, isin, cusip, exchange, micCode, startDate, endDate, timezone, language, outputsize, headers);
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param apiRequest {@link APIPressReleasesListParametersRequest}
   * @return ApiResponse&lt;PressReleasesListParameters200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PressReleasesListParameters200Response> pressReleasesListParametersWithHttpInfo(APIPressReleasesListParametersRequest apiRequest) throws ApiException {
    return pressReleasesListParametersWithHttpInfo(apiRequest, null);
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param apiRequest {@link APIPressReleasesListParametersRequest}
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;PressReleasesListParameters200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PressReleasesListParameters200Response> pressReleasesListParametersWithHttpInfo(APIPressReleasesListParametersRequest apiRequest, Map<String, String> headers) throws ApiException {
    String symbol = apiRequest.symbol();
    String figi = apiRequest.figi();
    String isin = apiRequest.isin();
    String cusip = apiRequest.cusip();
    String exchange = apiRequest.exchange();
    String micCode = apiRequest.micCode();
    String startDate = apiRequest.startDate();
    String endDate = apiRequest.endDate();
    String timezone = apiRequest.timezone();
    String language = apiRequest.language();
    Long outputsize = apiRequest.outputsize();
    return pressReleasesListParametersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, startDate, endDate, timezone, language, outputsize, headers);
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param startDate Begin date for filtering items. Returns press releases with release date on or after this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param endDate End date for filtering items. Returns press releases with release date on or before this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param timezone Time zone for date filtering. Default is the identifier time zone. (optional)
   * @param language Comma-separated list of languages to filter press releases by language. (optional)
   * @param outputsize Number of latest press releases returned. Only used if no data range is specified. Maximum value is &#x60;10&#x60;.  type: number (optional, default to 2)
   * @return PressReleasesListParameters200Response
   * @throws ApiException if fails to make API call
   */
  public PressReleasesListParameters200Response pressReleasesListParameters(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String language, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return pressReleasesListParameters(symbol, figi, isin, cusip, exchange, micCode, startDate, endDate, timezone, language, outputsize, null);
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param startDate Begin date for filtering items. Returns press releases with release date on or after this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param endDate End date for filtering items. Returns press releases with release date on or before this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param timezone Time zone for date filtering. Default is the identifier time zone. (optional)
   * @param language Comma-separated list of languages to filter press releases by language. (optional)
   * @param outputsize Number of latest press releases returned. Only used if no data range is specified. Maximum value is &#x60;10&#x60;.  type: number (optional, default to 2)
   * @param headers Optional headers to include in the request
   * @return PressReleasesListParameters200Response
   * @throws ApiException if fails to make API call
   */
  public PressReleasesListParameters200Response pressReleasesListParameters(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String language, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<PressReleasesListParameters200Response> localVarResponse = pressReleasesListParametersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, startDate, endDate, timezone, language, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param startDate Begin date for filtering items. Returns press releases with release date on or after this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param endDate End date for filtering items. Returns press releases with release date on or before this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param timezone Time zone for date filtering. Default is the identifier time zone. (optional)
   * @param language Comma-separated list of languages to filter press releases by language. (optional)
   * @param outputsize Number of latest press releases returned. Only used if no data range is specified. Maximum value is &#x60;10&#x60;.  type: number (optional, default to 2)
   * @return ApiResponse&lt;PressReleasesListParameters200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PressReleasesListParameters200Response> pressReleasesListParametersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String language, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return pressReleasesListParametersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, startDate, endDate, timezone, language, outputsize, null);
  }

  /**
   * Press releases
   * The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param startDate Begin date for filtering items. Returns press releases with release date on or after this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param endDate End date for filtering items. Returns press releases with release date on or before this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
   * @param timezone Time zone for date filtering. Default is the identifier time zone. (optional)
   * @param language Comma-separated list of languages to filter press releases by language. (optional)
   * @param outputsize Number of latest press releases returned. Only used if no data range is specified. Maximum value is &#x60;10&#x60;.  type: number (optional, default to 2)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;PressReleasesListParameters200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PressReleasesListParameters200Response> pressReleasesListParametersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String language, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = pressReleasesListParametersRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, startDate, endDate, timezone, language, outputsize, headers);
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
          throw getApiException("pressReleasesListParameters", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<PressReleasesListParameters200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        PressReleasesListParameters200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<PressReleasesListParameters200Response>() {});
        

        return new ApiResponse<PressReleasesListParameters200Response>(
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

  private HttpRequest.Builder pressReleasesListParametersRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String startDate, @javax.annotation.Nullable String endDate, @javax.annotation.Nullable String timezone, @javax.annotation.Nullable String language, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/press_releases";

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
    localVarQueryParameterBaseName = "start_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("start_date", startDate));
    localVarQueryParameterBaseName = "end_date";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("end_date", endDate));
    localVarQueryParameterBaseName = "timezone";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timezone", timezone));
    localVarQueryParameterBaseName = "language";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("language", language));
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


  public static final class APIPressReleasesListParametersRequest {
    @javax.annotation.Nullable
    private String symbol; // Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
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
    private String startDate; // Begin date for filtering items. Returns press releases with release date on or after this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
    @javax.annotation.Nullable
    private String endDate; // End date for filtering items. Returns press releases with release date on or before this date. Format &#x60;2025-12-24T02:07:00&#x60; (optional)
    @javax.annotation.Nullable
    private String timezone; // Time zone for date filtering. Default is the identifier time zone. (optional)
    @javax.annotation.Nullable
    private String language; // Comma-separated list of languages to filter press releases by language. (optional)
    @javax.annotation.Nullable
    private Long outputsize; // Number of latest press releases returned. Only used if no data range is specified. Maximum value is &#x60;10&#x60;.  type: number (optional, default to 2)

    private APIPressReleasesListParametersRequest(Builder builder) {
      this.symbol = builder.symbol;
      this.figi = builder.figi;
      this.isin = builder.isin;
      this.cusip = builder.cusip;
      this.exchange = builder.exchange;
      this.micCode = builder.micCode;
      this.startDate = builder.startDate;
      this.endDate = builder.endDate;
      this.timezone = builder.timezone;
      this.language = builder.language;
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
    public String micCode() {
      return micCode;
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
    public String timezone() {
      return timezone;
    }
    @javax.annotation.Nullable
    public String language() {
      return language;
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
      private String micCode;
      private String startDate;
      private String endDate;
      private String timezone;
      private String language;
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
      public Builder micCode(@javax.annotation.Nullable String micCode) {
        this.micCode = micCode;
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
      public Builder timezone(@javax.annotation.Nullable String timezone) {
        this.timezone = timezone;
        return this;
      }
      public Builder language(@javax.annotation.Nullable String language) {
        this.language = language;
        return this;
      }
      public Builder outputsize(@javax.annotation.Nullable Long outputsize) {
        this.outputsize = outputsize;
        return this;
      }
      public APIPressReleasesListParametersRequest build() {
        return new APIPressReleasesListParametersRequest(this);
      }
    }
  }

}
