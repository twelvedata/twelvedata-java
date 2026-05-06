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
import com.twelvedata.client.model.GetDirectHolders200Response;
import com.twelvedata.client.model.GetEdgarFilingsArchive200Response;
import com.twelvedata.client.model.GetFundHolders200Response;
import com.twelvedata.client.model.GetInsiderTransactions200Response;
import com.twelvedata.client.model.GetInstitutionalHolders200Response;
import com.twelvedata.client.model.GetSourceSanctionedEntities200Response;
import com.twelvedata.client.model.GetTaxInfo200Response;
import com.twelvedata.client.model.SourceEnum;

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
public class RegulatoryApi {
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

  public RegulatoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegulatoryApi(ApiClient apiClient) {
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
   * Direct holders
   * The direct holders endpoint provides detailed information about the number of shares directly held by individuals or entities as recorded in a company&#39;s official share registry. This data is essential for understanding the distribution of stock ownership within a company, helping users identify major shareholders and assess shareholder concentration.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetDirectHolders200Response
   * @throws ApiException if fails to make API call
   */
  public GetDirectHolders200Response getDirectHolders(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getDirectHolders(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Direct holders
   * The direct holders endpoint provides detailed information about the number of shares directly held by individuals or entities as recorded in a company&#39;s official share registry. This data is essential for understanding the distribution of stock ownership within a company, helping users identify major shareholders and assess shareholder concentration.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetDirectHolders200Response
   * @throws ApiException if fails to make API call
   */
  public GetDirectHolders200Response getDirectHolders(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetDirectHolders200Response> localVarResponse = getDirectHoldersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Direct holders
   * The direct holders endpoint provides detailed information about the number of shares directly held by individuals or entities as recorded in a company&#39;s official share registry. This data is essential for understanding the distribution of stock ownership within a company, helping users identify major shareholders and assess shareholder concentration.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetDirectHolders200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDirectHolders200Response> getDirectHoldersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getDirectHoldersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Direct holders
   * The direct holders endpoint provides detailed information about the number of shares directly held by individuals or entities as recorded in a company&#39;s official share registry. This data is essential for understanding the distribution of stock ownership within a company, helping users identify major shareholders and assess shareholder concentration.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetDirectHolders200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDirectHolders200Response> getDirectHoldersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDirectHoldersRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getDirectHolders", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetDirectHolders200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetDirectHolders200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetDirectHolders200Response>() {});
        

        return new ApiResponse<GetDirectHolders200Response>(
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

  private HttpRequest.Builder getDirectHoldersRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/direct_holders";

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

  /**
   * EDGAR fillings
   * The EDGAR fillings endpoint provides access to a comprehensive collection of financial documents submitted to the SEC, including real-time and historical forms, filings, and exhibits. Users can retrieve detailed information about company disclosures, financial statements, and regulatory submissions, enabling them to access essential compliance and financial data directly from the SEC&#39;s EDGAR system.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param formType Filter by form types, example &#x60;8-K&#x60;, &#x60;EX-1.1&#x60; (optional)
   * @param filledFrom Filter by filled time from (optional)
   * @param filledTo Filter by filled time to (optional)
   * @param page Page number (optional, default to 1)
   * @param pageSize Number of records in response (optional, default to 10)
   * @return GetEdgarFilingsArchive200Response
   * @throws ApiException if fails to make API call
   */
  public GetEdgarFilingsArchive200Response getEdgarFilingsArchive(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String formType, @javax.annotation.Nullable String filledFrom, @javax.annotation.Nullable String filledTo, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long pageSize) throws ApiException {
    return getEdgarFilingsArchive(symbol, figi, isin, cusip, exchange, micCode, country, formType, filledFrom, filledTo, page, pageSize, null);
  }

  /**
   * EDGAR fillings
   * The EDGAR fillings endpoint provides access to a comprehensive collection of financial documents submitted to the SEC, including real-time and historical forms, filings, and exhibits. Users can retrieve detailed information about company disclosures, financial statements, and regulatory submissions, enabling them to access essential compliance and financial data directly from the SEC&#39;s EDGAR system.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param formType Filter by form types, example &#x60;8-K&#x60;, &#x60;EX-1.1&#x60; (optional)
   * @param filledFrom Filter by filled time from (optional)
   * @param filledTo Filter by filled time to (optional)
   * @param page Page number (optional, default to 1)
   * @param pageSize Number of records in response (optional, default to 10)
   * @param headers Optional headers to include in the request
   * @return GetEdgarFilingsArchive200Response
   * @throws ApiException if fails to make API call
   */
  public GetEdgarFilingsArchive200Response getEdgarFilingsArchive(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String formType, @javax.annotation.Nullable String filledFrom, @javax.annotation.Nullable String filledTo, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long pageSize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetEdgarFilingsArchive200Response> localVarResponse = getEdgarFilingsArchiveWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, formType, filledFrom, filledTo, page, pageSize, headers);
    return localVarResponse.getData();
  }

  /**
   * EDGAR fillings
   * The EDGAR fillings endpoint provides access to a comprehensive collection of financial documents submitted to the SEC, including real-time and historical forms, filings, and exhibits. Users can retrieve detailed information about company disclosures, financial statements, and regulatory submissions, enabling them to access essential compliance and financial data directly from the SEC&#39;s EDGAR system.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param formType Filter by form types, example &#x60;8-K&#x60;, &#x60;EX-1.1&#x60; (optional)
   * @param filledFrom Filter by filled time from (optional)
   * @param filledTo Filter by filled time to (optional)
   * @param page Page number (optional, default to 1)
   * @param pageSize Number of records in response (optional, default to 10)
   * @return ApiResponse&lt;GetEdgarFilingsArchive200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEdgarFilingsArchive200Response> getEdgarFilingsArchiveWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String formType, @javax.annotation.Nullable String filledFrom, @javax.annotation.Nullable String filledTo, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long pageSize) throws ApiException {
    return getEdgarFilingsArchiveWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, formType, filledFrom, filledTo, page, pageSize, null);
  }

  /**
   * EDGAR fillings
   * The EDGAR fillings endpoint provides access to a comprehensive collection of financial documents submitted to the SEC, including real-time and historical forms, filings, and exhibits. Users can retrieve detailed information about company disclosures, financial statements, and regulatory submissions, enabling them to access essential compliance and financial data directly from the SEC&#39;s EDGAR system.
   * @param symbol The ticker symbol of an instrument for which data is requested (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Filter by exchange name (optional)
   * @param micCode Filter by market identifier code (MIC) under ISO 10383 standard (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param formType Filter by form types, example &#x60;8-K&#x60;, &#x60;EX-1.1&#x60; (optional)
   * @param filledFrom Filter by filled time from (optional)
   * @param filledTo Filter by filled time to (optional)
   * @param page Page number (optional, default to 1)
   * @param pageSize Number of records in response (optional, default to 10)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetEdgarFilingsArchive200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEdgarFilingsArchive200Response> getEdgarFilingsArchiveWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String formType, @javax.annotation.Nullable String filledFrom, @javax.annotation.Nullable String filledTo, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long pageSize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getEdgarFilingsArchiveRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, formType, filledFrom, filledTo, page, pageSize, headers);
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
          throw getApiException("getEdgarFilingsArchive", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetEdgarFilingsArchive200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetEdgarFilingsArchive200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetEdgarFilingsArchive200Response>() {});
        

        return new ApiResponse<GetEdgarFilingsArchive200Response>(
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

  private HttpRequest.Builder getEdgarFilingsArchiveRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, @javax.annotation.Nullable String formType, @javax.annotation.Nullable String filledFrom, @javax.annotation.Nullable String filledTo, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long pageSize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/edgar_filings/archive";

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
    localVarQueryParameterBaseName = "form_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("form_type", formType));
    localVarQueryParameterBaseName = "filled_from";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filled_from", filledFrom));
    localVarQueryParameterBaseName = "filled_to";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filled_to", filledTo));
    localVarQueryParameterBaseName = "page";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page", page));
    localVarQueryParameterBaseName = "page_size";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("page_size", pageSize));

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
   * Fund holders
   * The fund holders endpoint provides detailed information about the proportion of a company&#39;s stock that is owned by mutual fund holders. It returns data on the number of shares held, the percentage of total shares outstanding, and the names of the mutual funds involved. This endpoint is useful for users looking to understand mutual fund investment in a specific company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetFundHolders200Response
   * @throws ApiException if fails to make API call
   */
  public GetFundHolders200Response getFundHolders(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getFundHolders(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Fund holders
   * The fund holders endpoint provides detailed information about the proportion of a company&#39;s stock that is owned by mutual fund holders. It returns data on the number of shares held, the percentage of total shares outstanding, and the names of the mutual funds involved. This endpoint is useful for users looking to understand mutual fund investment in a specific company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetFundHolders200Response
   * @throws ApiException if fails to make API call
   */
  public GetFundHolders200Response getFundHolders(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetFundHolders200Response> localVarResponse = getFundHoldersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Fund holders
   * The fund holders endpoint provides detailed information about the proportion of a company&#39;s stock that is owned by mutual fund holders. It returns data on the number of shares held, the percentage of total shares outstanding, and the names of the mutual funds involved. This endpoint is useful for users looking to understand mutual fund investment in a specific company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetFundHolders200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetFundHolders200Response> getFundHoldersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getFundHoldersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Fund holders
   * The fund holders endpoint provides detailed information about the proportion of a company&#39;s stock that is owned by mutual fund holders. It returns data on the number of shares held, the percentage of total shares outstanding, and the names of the mutual funds involved. This endpoint is useful for users looking to understand mutual fund investment in a specific company.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetFundHolders200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetFundHolders200Response> getFundHoldersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getFundHoldersRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getFundHolders", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetFundHolders200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetFundHolders200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetFundHolders200Response>() {});
        

        return new ApiResponse<GetFundHolders200Response>(
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

  private HttpRequest.Builder getFundHoldersRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fund_holders";

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

  /**
   * Insider transaction
   * The insider transaction endpoint provides detailed data on trades executed by company insiders, such as executives and directors. It returns information including the insider&#39;s name, their role, the transaction type, the number of shares, the transaction date, and the price per share. This endpoint is useful for tracking insider activity and understanding potential insider sentiment towards a company&#39;s stock.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., United States or US. (optional)
   * @return GetInsiderTransactions200Response
   * @throws ApiException if fails to make API call
   */
  public GetInsiderTransactions200Response getInsiderTransactions(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getInsiderTransactions(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Insider transaction
   * The insider transaction endpoint provides detailed data on trades executed by company insiders, such as executives and directors. It returns information including the insider&#39;s name, their role, the transaction type, the number of shares, the transaction date, and the price per share. This endpoint is useful for tracking insider activity and understanding potential insider sentiment towards a company&#39;s stock.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., United States or US. (optional)
   * @param headers Optional headers to include in the request
   * @return GetInsiderTransactions200Response
   * @throws ApiException if fails to make API call
   */
  public GetInsiderTransactions200Response getInsiderTransactions(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetInsiderTransactions200Response> localVarResponse = getInsiderTransactionsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Insider transaction
   * The insider transaction endpoint provides detailed data on trades executed by company insiders, such as executives and directors. It returns information including the insider&#39;s name, their role, the transaction type, the number of shares, the transaction date, and the price per share. This endpoint is useful for tracking insider activity and understanding potential insider sentiment towards a company&#39;s stock.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., United States or US. (optional)
   * @return ApiResponse&lt;GetInsiderTransactions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInsiderTransactions200Response> getInsiderTransactionsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getInsiderTransactionsWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Insider transaction
   * The insider transaction endpoint provides detailed data on trades executed by company insiders, such as executives and directors. It returns information including the insider&#39;s name, their role, the transaction type, the number of shares, the transaction date, and the price per share. This endpoint is useful for tracking insider activity and understanding potential insider sentiment towards a company&#39;s stock.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60; (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., United States or US. (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetInsiderTransactions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInsiderTransactions200Response> getInsiderTransactionsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getInsiderTransactionsRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getInsiderTransactions", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetInsiderTransactions200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetInsiderTransactions200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetInsiderTransactions200Response>() {});
        

        return new ApiResponse<GetInsiderTransactions200Response>(
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

  private HttpRequest.Builder getInsiderTransactionsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/insider_transactions";

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

  /**
   * Institutional holders
   * The institutional holders endpoint provides detailed information on the percentage and amount of a company&#39;s stock owned by institutional investors, such as pension funds, insurance companies, and investment firms. This data is essential for understanding the influence and involvement of large entities in a company&#39;s ownership structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetInstitutionalHolders200Response
   * @throws ApiException if fails to make API call
   */
  public GetInstitutionalHolders200Response getInstitutionalHolders(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getInstitutionalHolders(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Institutional holders
   * The institutional holders endpoint provides detailed information on the percentage and amount of a company&#39;s stock owned by institutional investors, such as pension funds, insurance companies, and investment firms. This data is essential for understanding the influence and involvement of large entities in a company&#39;s ownership structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetInstitutionalHolders200Response
   * @throws ApiException if fails to make API call
   */
  public GetInstitutionalHolders200Response getInstitutionalHolders(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetInstitutionalHolders200Response> localVarResponse = getInstitutionalHoldersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, headers);
    return localVarResponse.getData();
  }

  /**
   * Institutional holders
   * The institutional holders endpoint provides detailed information on the percentage and amount of a company&#39;s stock owned by institutional investors, such as pension funds, insurance companies, and investment firms. This data is essential for understanding the influence and involvement of large entities in a company&#39;s ownership structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetInstitutionalHolders200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInstitutionalHolders200Response> getInstitutionalHoldersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country) throws ApiException {
    return getInstitutionalHoldersWithHttpInfo(symbol, figi, isin, cusip, exchange, micCode, country, null);
  }

  /**
   * Institutional holders
   * The institutional holders endpoint provides detailed information on the percentage and amount of a company&#39;s stock owned by institutional investors, such as pension funds, insurance companies, and investment firms. This data is essential for understanding the influence and involvement of large entities in a company&#39;s ownership structure.
   * @param symbol Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange Exchange where instrument is traded (optional)
   * @param micCode Market Identifier Code (MIC) under ISO 10383 standard (optional)
   * @param country Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetInstitutionalHolders200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetInstitutionalHolders200Response> getInstitutionalHoldersWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getInstitutionalHoldersRequestBuilder(symbol, figi, isin, cusip, exchange, micCode, country, headers);
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
          throw getApiException("getInstitutionalHolders", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetInstitutionalHolders200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetInstitutionalHolders200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetInstitutionalHolders200Response>() {});
        

        return new ApiResponse<GetInstitutionalHolders200Response>(
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

  private HttpRequest.Builder getInstitutionalHoldersRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/institutional_holders";

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

  /**
   * Sanctioned entities
   * The sanctions entities endpoint provides a comprehensive list of entities sanctioned by a specified authority, such as OFAC, UK, EU, or AU. Users can retrieve detailed information about individuals, organizations, and other entities subject to sanctions from the chosen source, facilitating compliance and risk management processes.
   * @param source Sanctions source (required)
   * @return GetSourceSanctionedEntities200Response
   * @throws ApiException if fails to make API call
   */
  public GetSourceSanctionedEntities200Response getSourceSanctionedEntities(@javax.annotation.Nonnull SourceEnum source) throws ApiException {
    return getSourceSanctionedEntities(source, null);
  }

  /**
   * Sanctioned entities
   * The sanctions entities endpoint provides a comprehensive list of entities sanctioned by a specified authority, such as OFAC, UK, EU, or AU. Users can retrieve detailed information about individuals, organizations, and other entities subject to sanctions from the chosen source, facilitating compliance and risk management processes.
   * @param source Sanctions source (required)
   * @param headers Optional headers to include in the request
   * @return GetSourceSanctionedEntities200Response
   * @throws ApiException if fails to make API call
   */
  public GetSourceSanctionedEntities200Response getSourceSanctionedEntities(@javax.annotation.Nonnull SourceEnum source, Map<String, String> headers) throws ApiException {
    ApiResponse<GetSourceSanctionedEntities200Response> localVarResponse = getSourceSanctionedEntitiesWithHttpInfo(source, headers);
    return localVarResponse.getData();
  }

  /**
   * Sanctioned entities
   * The sanctions entities endpoint provides a comprehensive list of entities sanctioned by a specified authority, such as OFAC, UK, EU, or AU. Users can retrieve detailed information about individuals, organizations, and other entities subject to sanctions from the chosen source, facilitating compliance and risk management processes.
   * @param source Sanctions source (required)
   * @return ApiResponse&lt;GetSourceSanctionedEntities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSourceSanctionedEntities200Response> getSourceSanctionedEntitiesWithHttpInfo(@javax.annotation.Nonnull SourceEnum source) throws ApiException {
    return getSourceSanctionedEntitiesWithHttpInfo(source, null);
  }

  /**
   * Sanctioned entities
   * The sanctions entities endpoint provides a comprehensive list of entities sanctioned by a specified authority, such as OFAC, UK, EU, or AU. Users can retrieve detailed information about individuals, organizations, and other entities subject to sanctions from the chosen source, facilitating compliance and risk management processes.
   * @param source Sanctions source (required)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetSourceSanctionedEntities200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSourceSanctionedEntities200Response> getSourceSanctionedEntitiesWithHttpInfo(@javax.annotation.Nonnull SourceEnum source, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSourceSanctionedEntitiesRequestBuilder(source, headers);
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
          throw getApiException("getSourceSanctionedEntities", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetSourceSanctionedEntities200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetSourceSanctionedEntities200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetSourceSanctionedEntities200Response>() {});
        

        return new ApiResponse<GetSourceSanctionedEntities200Response>(
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

  private HttpRequest.Builder getSourceSanctionedEntitiesRequestBuilder(@javax.annotation.Nonnull SourceEnum source, Map<String, String> headers) throws ApiException {
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling getSourceSanctionedEntities");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/sanctions/{source}"
        .replace("{source}", ApiClient.urlEncode(source.toString()));

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
   * Tax information
   * The tax information endpoint provides detailed tax-related data for a specified financial instrument, including applicable tax rates and relevant tax codes. This information is essential for users needing to understand the tax implications associated with trading or investing in specific instruments.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;SKYQ&#x60;, &#x60;AIRE&#x60;, &#x60;ALM:BME&#x60;, &#x60;HSI:HKEX&#x60;. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;Euronext&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @return GetTaxInfo200Response
   * @throws ApiException if fails to make API call
   */
  public GetTaxInfo200Response getTaxInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode) throws ApiException {
    return getTaxInfo(symbol, isin, figi, cusip, exchange, micCode, null);
  }

  /**
   * Tax information
   * The tax information endpoint provides detailed tax-related data for a specified financial instrument, including applicable tax rates and relevant tax codes. This information is essential for users needing to understand the tax implications associated with trading or investing in specific instruments.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;SKYQ&#x60;, &#x60;AIRE&#x60;, &#x60;ALM:BME&#x60;, &#x60;HSI:HKEX&#x60;. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;Euronext&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetTaxInfo200Response
   * @throws ApiException if fails to make API call
   */
  public GetTaxInfo200Response getTaxInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, Map<String, String> headers) throws ApiException {
    ApiResponse<GetTaxInfo200Response> localVarResponse = getTaxInfoWithHttpInfo(symbol, isin, figi, cusip, exchange, micCode, headers);
    return localVarResponse.getData();
  }

  /**
   * Tax information
   * The tax information endpoint provides detailed tax-related data for a specified financial instrument, including applicable tax rates and relevant tax codes. This information is essential for users needing to understand the tax implications associated with trading or investing in specific instruments.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;SKYQ&#x60;, &#x60;AIRE&#x60;, &#x60;ALM:BME&#x60;, &#x60;HSI:HKEX&#x60;. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;Euronext&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @return ApiResponse&lt;GetTaxInfo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTaxInfo200Response> getTaxInfoWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode) throws ApiException {
    return getTaxInfoWithHttpInfo(symbol, isin, figi, cusip, exchange, micCode, null);
  }

  /**
   * Tax information
   * The tax information endpoint provides detailed tax-related data for a specified financial instrument, including applicable tax rates and relevant tax codes. This information is essential for users needing to understand the tax implications associated with trading or investing in specific instruments.
   * @param symbol The ticker symbol of an instrument for which data is requested, e.g., &#x60;SKYQ&#x60;, &#x60;AIRE&#x60;, &#x60;ALM:BME&#x60;, &#x60;HSI:HKEX&#x60;. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param figi The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param exchange The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;Euronext&#x60; (optional)
   * @param micCode The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetTaxInfo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetTaxInfo200Response> getTaxInfoWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getTaxInfoRequestBuilder(symbol, isin, figi, cusip, exchange, micCode, headers);
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
          throw getApiException("getTaxInfo", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetTaxInfo200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetTaxInfo200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetTaxInfo200Response>() {});
        

        return new ApiResponse<GetTaxInfo200Response>(
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

  private HttpRequest.Builder getTaxInfoRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String exchange, @javax.annotation.Nullable String micCode, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tax_info";

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
    localVarQueryParameterBaseName = "exchange";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("exchange", exchange));
    localVarQueryParameterBaseName = "mic_code";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mic_code", micCode));

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
