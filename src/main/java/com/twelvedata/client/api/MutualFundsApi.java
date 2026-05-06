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
import com.twelvedata.client.model.GetMutualFundsFamily200Response;
import com.twelvedata.client.model.GetMutualFundsList200Response;
import com.twelvedata.client.model.GetMutualFundsType200Response;
import com.twelvedata.client.model.GetMutualFundsWorld200Response;
import com.twelvedata.client.model.GetMutualFundsWorldComposition200Response;
import com.twelvedata.client.model.GetMutualFundsWorldPerformance200Response;
import com.twelvedata.client.model.GetMutualFundsWorldPurchaseInfo200Response;
import com.twelvedata.client.model.GetMutualFundsWorldRatings200Response;
import com.twelvedata.client.model.GetMutualFundsWorldRisk200Response;
import com.twelvedata.client.model.GetMutualFundsWorldSummary200Response;
import com.twelvedata.client.model.GetMutualFundsWorldSustainability200Response;

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
public class MutualFundsApi {
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

  public MutualFundsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MutualFundsApi(ApiClient apiClient) {
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
   * MFs families
   * The mutual funds family endpoint provides a comprehensive list of MF families, which are groups of mutual funds managed by the same investment company. This data is useful for users looking to explore or compare different fund families, understand the range of investment options offered by each, and identify potential investment opportunities within specific fund families.
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetMutualFundsFamily200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsFamily200Response getMutualFundsFamily(@javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String country) throws ApiException {
    return getMutualFundsFamily(fundFamily, country, null);
  }

  /**
   * MFs families
   * The mutual funds family endpoint provides a comprehensive list of MF families, which are groups of mutual funds managed by the same investment company. This data is useful for users looking to explore or compare different fund families, understand the range of investment options offered by each, and identify potential investment opportunities within specific fund families.
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsFamily200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsFamily200Response getMutualFundsFamily(@javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsFamily200Response> localVarResponse = getMutualFundsFamilyWithHttpInfo(fundFamily, country, headers);
    return localVarResponse.getData();
  }

  /**
   * MFs families
   * The mutual funds family endpoint provides a comprehensive list of MF families, which are groups of mutual funds managed by the same investment company. This data is useful for users looking to explore or compare different fund families, understand the range of investment options offered by each, and identify potential investment opportunities within specific fund families.
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetMutualFundsFamily200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsFamily200Response> getMutualFundsFamilyWithHttpInfo(@javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String country) throws ApiException {
    return getMutualFundsFamilyWithHttpInfo(fundFamily, country, null);
  }

  /**
   * MFs families
   * The mutual funds family endpoint provides a comprehensive list of MF families, which are groups of mutual funds managed by the same investment company. This data is useful for users looking to explore or compare different fund families, understand the range of investment options offered by each, and identify potential investment opportunities within specific fund families.
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsFamily200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsFamily200Response> getMutualFundsFamilyWithHttpInfo(@javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsFamilyRequestBuilder(fundFamily, country, headers);
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
          throw getApiException("getMutualFundsFamily", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsFamily200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsFamily200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsFamily200Response>() {});
        

        return new ApiResponse<GetMutualFundsFamily200Response>(
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

  private HttpRequest.Builder getMutualFundsFamilyRequestBuilder(@javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/family";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "fund_family";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fund_family", fundFamily));
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
   * MFs directory
   * The mutual funds directory endpoint provides a daily updated list of mutual funds, sorted in descending order by their total assets value. This endpoint is useful for retrieving an organized overview of available mutual funds.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param performanceRating Filter by performance rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param riskRating Filter by risk rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 100)
   * @return GetMutualFundsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsList200Response getMutualFundsList(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long performanceRating, @javax.annotation.Nullable Long riskRating, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getMutualFundsList(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, performanceRating, riskRating, page, outputsize, null);
  }

  /**
   * MFs directory
   * The mutual funds directory endpoint provides a daily updated list of mutual funds, sorted in descending order by their total assets value. This endpoint is useful for retrieving an organized overview of available mutual funds.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param performanceRating Filter by performance rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param riskRating Filter by risk rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 100)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsList200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsList200Response getMutualFundsList(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long performanceRating, @javax.annotation.Nullable Long riskRating, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsList200Response> localVarResponse = getMutualFundsListWithHttpInfo(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, performanceRating, riskRating, page, outputsize, headers);
    return localVarResponse.getData();
  }

  /**
   * MFs directory
   * The mutual funds directory endpoint provides a daily updated list of mutual funds, sorted in descending order by their total assets value. This endpoint is useful for retrieving an organized overview of available mutual funds.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param performanceRating Filter by performance rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param riskRating Filter by risk rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 100)
   * @return ApiResponse&lt;GetMutualFundsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsList200Response> getMutualFundsListWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long performanceRating, @javax.annotation.Nullable Long riskRating, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize) throws ApiException {
    return getMutualFundsListWithHttpInfo(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, performanceRating, riskRating, page, outputsize, null);
  }

  /**
   * MFs directory
   * The mutual funds directory endpoint provides a daily updated list of mutual funds, sorted in descending order by their total assets value. This endpoint is useful for retrieving an organized overview of available mutual funds.
   * @param symbol Filter by symbol (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cik The CIK of an instrument for which data is requested (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param fundFamily Filter by investment company that manages the fund (optional)
   * @param fundType Filter by the type of fund (optional)
   * @param performanceRating Filter by performance rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param riskRating Filter by risk rating from &#x60;0&#x60; to &#x60;5&#x60; (optional)
   * @param page Page number (optional, default to 1)
   * @param outputsize Number of records in response (optional, default to 100)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsList200Response> getMutualFundsListWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long performanceRating, @javax.annotation.Nullable Long riskRating, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsListRequestBuilder(symbol, figi, isin, cusip, cik, country, fundFamily, fundType, performanceRating, riskRating, page, outputsize, headers);
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
          throw getApiException("getMutualFundsList", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsList200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsList200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsList200Response>() {});
        

        return new ApiResponse<GetMutualFundsList200Response>(
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

  private HttpRequest.Builder getMutualFundsListRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String cik, @javax.annotation.Nullable String country, @javax.annotation.Nullable String fundFamily, @javax.annotation.Nullable String fundType, @javax.annotation.Nullable Long performanceRating, @javax.annotation.Nullable Long riskRating, @javax.annotation.Nullable Long page, @javax.annotation.Nullable Long outputsize, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/list";

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
    localVarQueryParameterBaseName = "performance_rating";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("performance_rating", performanceRating));
    localVarQueryParameterBaseName = "risk_rating";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("risk_rating", riskRating));
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
   * MFs types
   * This endpoint provides detailed information on various types of mutual funds, such as equity, bond, and balanced funds, allowing users to understand the different investment options available.
   * @param fundType Filter by the type of fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return GetMutualFundsType200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsType200Response getMutualFundsType(@javax.annotation.Nullable String fundType, @javax.annotation.Nullable String country) throws ApiException {
    return getMutualFundsType(fundType, country, null);
  }

  /**
   * MFs types
   * This endpoint provides detailed information on various types of mutual funds, such as equity, bond, and balanced funds, allowing users to understand the different investment options available.
   * @param fundType Filter by the type of fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsType200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsType200Response getMutualFundsType(@javax.annotation.Nullable String fundType, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsType200Response> localVarResponse = getMutualFundsTypeWithHttpInfo(fundType, country, headers);
    return localVarResponse.getData();
  }

  /**
   * MFs types
   * This endpoint provides detailed information on various types of mutual funds, such as equity, bond, and balanced funds, allowing users to understand the different investment options available.
   * @param fundType Filter by the type of fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @return ApiResponse&lt;GetMutualFundsType200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsType200Response> getMutualFundsTypeWithHttpInfo(@javax.annotation.Nullable String fundType, @javax.annotation.Nullable String country) throws ApiException {
    return getMutualFundsTypeWithHttpInfo(fundType, country, null);
  }

  /**
   * MFs types
   * This endpoint provides detailed information on various types of mutual funds, such as equity, bond, and balanced funds, allowing users to understand the different investment options available.
   * @param fundType Filter by the type of fund (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsType200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsType200Response> getMutualFundsTypeWithHttpInfo(@javax.annotation.Nullable String fundType, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsTypeRequestBuilder(fundType, country, headers);
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
          throw getApiException("getMutualFundsType", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsType200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsType200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsType200Response>() {});
        

        return new ApiResponse<GetMutualFundsType200Response>(
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

  private HttpRequest.Builder getMutualFundsTypeRequestBuilder(@javax.annotation.Nullable String fundType, @javax.annotation.Nullable String country, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/type";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "fund_type";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fund_type", fundType));
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
   * MF full data
   * The mutual full data endpoint provides detailed information about global mutual funds. It returns a comprehensive dataset that includes a summary of the fund, its performance metrics, risk assessment, ratings, asset composition, purchase details, and sustainability factors. This endpoint is essential for users seeking in-depth insights into mutual funds on a global scale, allowing them to evaluate various aspects such as investment performance, risk levels, and environmental impact.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorld200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorld200Response getMutualFundsWorld(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorld(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * MF full data
   * The mutual full data endpoint provides detailed information about global mutual funds. It returns a comprehensive dataset that includes a summary of the fund, its performance metrics, risk assessment, ratings, asset composition, purchase details, and sustainability factors. This endpoint is essential for users seeking in-depth insights into mutual funds on a global scale, allowing them to evaluate various aspects such as investment performance, risk levels, and environmental impact.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorld200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorld200Response getMutualFundsWorld(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorld200Response> localVarResponse = getMutualFundsWorldWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * MF full data
   * The mutual full data endpoint provides detailed information about global mutual funds. It returns a comprehensive dataset that includes a summary of the fund, its performance metrics, risk assessment, ratings, asset composition, purchase details, and sustainability factors. This endpoint is essential for users seeking in-depth insights into mutual funds on a global scale, allowing them to evaluate various aspects such as investment performance, risk levels, and environmental impact.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorld200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorld200Response> getMutualFundsWorldWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * MF full data
   * The mutual full data endpoint provides detailed information about global mutual funds. It returns a comprehensive dataset that includes a summary of the fund, its performance metrics, risk assessment, ratings, asset composition, purchase details, and sustainability factors. This endpoint is essential for users seeking in-depth insights into mutual funds on a global scale, allowing them to evaluate various aspects such as investment performance, risk levels, and environmental impact.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorld200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorld200Response> getMutualFundsWorldWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorld", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorld200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorld200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorld200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorld200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world";

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
   * The mutual funds compositions endpoint provides detailed information about the portfolio composition of a specified mutual fund. It returns data on sector allocations, individual holdings, and their respective weighted exposures. This endpoint is useful for users seeking to understand the investment distribution and risk profile of a mutual fund.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldComposition200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldComposition200Response getMutualFundsWorldComposition(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldComposition(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Composition
   * The mutual funds compositions endpoint provides detailed information about the portfolio composition of a specified mutual fund. It returns data on sector allocations, individual holdings, and their respective weighted exposures. This endpoint is useful for users seeking to understand the investment distribution and risk profile of a mutual fund.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldComposition200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldComposition200Response getMutualFundsWorldComposition(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldComposition200Response> localVarResponse = getMutualFundsWorldCompositionWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Composition
   * The mutual funds compositions endpoint provides detailed information about the portfolio composition of a specified mutual fund. It returns data on sector allocations, individual holdings, and their respective weighted exposures. This endpoint is useful for users seeking to understand the investment distribution and risk profile of a mutual fund.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldComposition200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldComposition200Response> getMutualFundsWorldCompositionWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldCompositionWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Composition
   * The mutual funds compositions endpoint provides detailed information about the portfolio composition of a specified mutual fund. It returns data on sector allocations, individual holdings, and their respective weighted exposures. This endpoint is useful for users seeking to understand the investment distribution and risk profile of a mutual fund.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldComposition200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldComposition200Response> getMutualFundsWorldCompositionWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldCompositionRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldComposition", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldComposition200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldComposition200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldComposition200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldComposition200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldCompositionRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/composition";

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
   * The mutual funds performances endpoint provides comprehensive performance data for mutual funds globally. It returns metrics such as trailing returns, annual returns, quarterly returns, and load-adjusted returns.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldPerformance200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldPerformance200Response getMutualFundsWorldPerformance(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldPerformance(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Performance
   * The mutual funds performances endpoint provides comprehensive performance data for mutual funds globally. It returns metrics such as trailing returns, annual returns, quarterly returns, and load-adjusted returns.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldPerformance200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldPerformance200Response getMutualFundsWorldPerformance(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldPerformance200Response> localVarResponse = getMutualFundsWorldPerformanceWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Performance
   * The mutual funds performances endpoint provides comprehensive performance data for mutual funds globally. It returns metrics such as trailing returns, annual returns, quarterly returns, and load-adjusted returns.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldPerformance200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldPerformance200Response> getMutualFundsWorldPerformanceWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldPerformanceWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Performance
   * The mutual funds performances endpoint provides comprehensive performance data for mutual funds globally. It returns metrics such as trailing returns, annual returns, quarterly returns, and load-adjusted returns.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldPerformance200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldPerformance200Response> getMutualFundsWorldPerformanceWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldPerformanceRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldPerformance", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldPerformance200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldPerformance200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldPerformance200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldPerformance200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldPerformanceRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/performance";

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
   * Purchase info
   * The mutual funds purchase information endpoint provides detailed purchasing details for global mutual funds. It returns data on minimum investment requirements, current pricing, and a list of brokerages where the mutual fund can be purchased. This endpoint is useful for users looking to understand the entry requirements and options available for investing in specific mutual funds.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldPurchaseInfo200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldPurchaseInfo200Response getMutualFundsWorldPurchaseInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldPurchaseInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Purchase info
   * The mutual funds purchase information endpoint provides detailed purchasing details for global mutual funds. It returns data on minimum investment requirements, current pricing, and a list of brokerages where the mutual fund can be purchased. This endpoint is useful for users looking to understand the entry requirements and options available for investing in specific mutual funds.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldPurchaseInfo200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldPurchaseInfo200Response getMutualFundsWorldPurchaseInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldPurchaseInfo200Response> localVarResponse = getMutualFundsWorldPurchaseInfoWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Purchase info
   * The mutual funds purchase information endpoint provides detailed purchasing details for global mutual funds. It returns data on minimum investment requirements, current pricing, and a list of brokerages where the mutual fund can be purchased. This endpoint is useful for users looking to understand the entry requirements and options available for investing in specific mutual funds.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldPurchaseInfo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldPurchaseInfo200Response> getMutualFundsWorldPurchaseInfoWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldPurchaseInfoWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Purchase info
   * The mutual funds purchase information endpoint provides detailed purchasing details for global mutual funds. It returns data on minimum investment requirements, current pricing, and a list of brokerages where the mutual fund can be purchased. This endpoint is useful for users looking to understand the entry requirements and options available for investing in specific mutual funds.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldPurchaseInfo200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldPurchaseInfo200Response> getMutualFundsWorldPurchaseInfoWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldPurchaseInfoRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldPurchaseInfo", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldPurchaseInfo200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldPurchaseInfo200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldPurchaseInfo200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldPurchaseInfo200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldPurchaseInfoRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/purchase_info";

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
   * Ratings
   * The mutual funds ratings endpoint provides detailed ratings for mutual funds across global markets. It returns data on the performance and quality of mutual funds, including ratings calculated in-house by Twelve Data and from various financial institutions.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldRatings200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldRatings200Response getMutualFundsWorldRatings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldRatings(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Ratings
   * The mutual funds ratings endpoint provides detailed ratings for mutual funds across global markets. It returns data on the performance and quality of mutual funds, including ratings calculated in-house by Twelve Data and from various financial institutions.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldRatings200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldRatings200Response getMutualFundsWorldRatings(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldRatings200Response> localVarResponse = getMutualFundsWorldRatingsWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Ratings
   * The mutual funds ratings endpoint provides detailed ratings for mutual funds across global markets. It returns data on the performance and quality of mutual funds, including ratings calculated in-house by Twelve Data and from various financial institutions.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldRatings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldRatings200Response> getMutualFundsWorldRatingsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldRatingsWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Ratings
   * The mutual funds ratings endpoint provides detailed ratings for mutual funds across global markets. It returns data on the performance and quality of mutual funds, including ratings calculated in-house by Twelve Data and from various financial institutions.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldRatings200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldRatings200Response> getMutualFundsWorldRatingsWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldRatingsRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldRatings", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldRatings200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldRatings200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldRatings200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldRatings200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldRatingsRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/ratings";

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
   * The mutual funds risk endpoint provides detailed risk metrics for global mutual funds. It returns data such as standard deviation, beta, and Sharpe ratio, which help assess the volatility and risk profile of mutual funds across different markets.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldRisk200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldRisk200Response getMutualFundsWorldRisk(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldRisk(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Risk
   * The mutual funds risk endpoint provides detailed risk metrics for global mutual funds. It returns data such as standard deviation, beta, and Sharpe ratio, which help assess the volatility and risk profile of mutual funds across different markets.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldRisk200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldRisk200Response getMutualFundsWorldRisk(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldRisk200Response> localVarResponse = getMutualFundsWorldRiskWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Risk
   * The mutual funds risk endpoint provides detailed risk metrics for global mutual funds. It returns data such as standard deviation, beta, and Sharpe ratio, which help assess the volatility and risk profile of mutual funds across different markets.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldRisk200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldRisk200Response> getMutualFundsWorldRiskWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldRiskWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Risk
   * The mutual funds risk endpoint provides detailed risk metrics for global mutual funds. It returns data such as standard deviation, beta, and Sharpe ratio, which help assess the volatility and risk profile of mutual funds across different markets.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldRisk200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldRisk200Response> getMutualFundsWorldRiskWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldRiskRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldRisk", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldRisk200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldRisk200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldRisk200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldRisk200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldRiskRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/risk";

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
   * The mutual funds summary endpoint provides a concise overview of global mutual funds, including key details such as fund name, symbol, asset class, and region. This endpoint is useful for quickly obtaining essential information about various mutual funds worldwide, aiding in the comparison and selection of funds for investment portfolios.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldSummary200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldSummary200Response getMutualFundsWorldSummary(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldSummary(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Summary
   * The mutual funds summary endpoint provides a concise overview of global mutual funds, including key details such as fund name, symbol, asset class, and region. This endpoint is useful for quickly obtaining essential information about various mutual funds worldwide, aiding in the comparison and selection of funds for investment portfolios.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldSummary200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldSummary200Response getMutualFundsWorldSummary(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldSummary200Response> localVarResponse = getMutualFundsWorldSummaryWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Summary
   * The mutual funds summary endpoint provides a concise overview of global mutual funds, including key details such as fund name, symbol, asset class, and region. This endpoint is useful for quickly obtaining essential information about various mutual funds worldwide, aiding in the comparison and selection of funds for investment portfolios.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldSummary200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldSummary200Response> getMutualFundsWorldSummaryWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldSummaryWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Summary
   * The mutual funds summary endpoint provides a concise overview of global mutual funds, including key details such as fund name, symbol, asset class, and region. This endpoint is useful for quickly obtaining essential information about various mutual funds worldwide, aiding in the comparison and selection of funds for investment portfolios.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldSummary200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldSummary200Response> getMutualFundsWorldSummaryWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldSummaryRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldSummary", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldSummary200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldSummary200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldSummary200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldSummary200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldSummaryRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/summary";

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
   * Sustainability
   * The mutual funds sustainability endpoint provides detailed information on the sustainability and Environmental, Social, and Governance (ESG) ratings of global mutual funds. It returns data such as ESG scores, sustainability metrics, and fund identifiers.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return GetMutualFundsWorldSustainability200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldSustainability200Response getMutualFundsWorldSustainability(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldSustainability(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Sustainability
   * The mutual funds sustainability endpoint provides detailed information on the sustainability and Environmental, Social, and Governance (ESG) ratings of global mutual funds. It returns data such as ESG scores, sustainability metrics, and fund identifiers.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return GetMutualFundsWorldSustainability200Response
   * @throws ApiException if fails to make API call
   */
  public GetMutualFundsWorldSustainability200Response getMutualFundsWorldSustainability(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    ApiResponse<GetMutualFundsWorldSustainability200Response> localVarResponse = getMutualFundsWorldSustainabilityWithHttpInfo(symbol, figi, isin, cusip, country, dp, headers);
    return localVarResponse.getData();
  }

  /**
   * Sustainability
   * The mutual funds sustainability endpoint provides detailed information on the sustainability and Environmental, Social, and Governance (ESG) ratings of global mutual funds. It returns data such as ESG scores, sustainability metrics, and fund identifiers.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @return ApiResponse&lt;GetMutualFundsWorldSustainability200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldSustainability200Response> getMutualFundsWorldSustainabilityWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp) throws ApiException {
    return getMutualFundsWorldSustainabilityWithHttpInfo(symbol, figi, isin, cusip, country, dp, null);
  }

  /**
   * Sustainability
   * The mutual funds sustainability endpoint provides detailed information on the sustainability and Environmental, Social, and Governance (ESG) ratings of global mutual funds. It returns data such as ESG scores, sustainability metrics, and fund identifiers.
   * @param symbol Symbol ticker of mutual fund (optional)
   * @param figi Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. (optional)
   * @param isin Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param cusip The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section (optional)
   * @param country Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; (optional)
   * @param dp Number of decimal places for floating values. Accepts value in range [0,11] (optional, default to 5)
   * @param headers Optional headers to include in the request
   * @return ApiResponse&lt;GetMutualFundsWorldSustainability200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMutualFundsWorldSustainability200Response> getMutualFundsWorldSustainabilityWithHttpInfo(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMutualFundsWorldSustainabilityRequestBuilder(symbol, figi, isin, cusip, country, dp, headers);
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
          throw getApiException("getMutualFundsWorldSustainability", localVarResponse);
        }
        localVarResponseBody = ApiClient.getResponseBody(localVarResponse);
        if (localVarResponseBody == null) {
          return new ApiResponse<GetMutualFundsWorldSustainability200Response>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        
        
        String responseBody = new String(localVarResponseBody.readAllBytes());
        GetMutualFundsWorldSustainability200Response responseValue = responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetMutualFundsWorldSustainability200Response>() {});
        

        return new ApiResponse<GetMutualFundsWorldSustainability200Response>(
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

  private HttpRequest.Builder getMutualFundsWorldSustainabilityRequestBuilder(@javax.annotation.Nullable String symbol, @javax.annotation.Nullable String figi, @javax.annotation.Nullable String isin, @javax.annotation.Nullable String cusip, @javax.annotation.Nullable String country, @javax.annotation.Nullable Long dp, Map<String, String> headers) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/mutual_funds/world/sustainability";

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
