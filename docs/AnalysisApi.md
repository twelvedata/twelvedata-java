# AnalysisApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalystRatingsLight**](AnalysisApi.md#getAnalystRatingsLight) | **GET** /analyst_ratings/light | Analyst ratings snapshot |
| [**getAnalystRatingsLightWithHttpInfo**](AnalysisApi.md#getAnalystRatingsLightWithHttpInfo) | **GET** /analyst_ratings/light | Analyst ratings snapshot |
| [**getAnalystRatingsUsEquities**](AnalysisApi.md#getAnalystRatingsUsEquities) | **GET** /analyst_ratings/us_equities | Analyst ratings US equities |
| [**getAnalystRatingsUsEquitiesWithHttpInfo**](AnalysisApi.md#getAnalystRatingsUsEquitiesWithHttpInfo) | **GET** /analyst_ratings/us_equities | Analyst ratings US equities |
| [**getEarningsEstimate**](AnalysisApi.md#getEarningsEstimate) | **GET** /earnings_estimate | Earnings estimate |
| [**getEarningsEstimateWithHttpInfo**](AnalysisApi.md#getEarningsEstimateWithHttpInfo) | **GET** /earnings_estimate | Earnings estimate |
| [**getEpsRevisions**](AnalysisApi.md#getEpsRevisions) | **GET** /eps_revisions | EPS revisions |
| [**getEpsRevisionsWithHttpInfo**](AnalysisApi.md#getEpsRevisionsWithHttpInfo) | **GET** /eps_revisions | EPS revisions |
| [**getEpsTrend**](AnalysisApi.md#getEpsTrend) | **GET** /eps_trend | EPS trend |
| [**getEpsTrendWithHttpInfo**](AnalysisApi.md#getEpsTrendWithHttpInfo) | **GET** /eps_trend | EPS trend |
| [**getGrowthEstimates**](AnalysisApi.md#getGrowthEstimates) | **GET** /growth_estimates | Growth estimates |
| [**getGrowthEstimatesWithHttpInfo**](AnalysisApi.md#getGrowthEstimatesWithHttpInfo) | **GET** /growth_estimates | Growth estimates |
| [**getPriceTarget**](AnalysisApi.md#getPriceTarget) | **GET** /price_target | Price target |
| [**getPriceTargetWithHttpInfo**](AnalysisApi.md#getPriceTargetWithHttpInfo) | **GET** /price_target | Price target |
| [**getRecommendations**](AnalysisApi.md#getRecommendations) | **GET** /recommendations | Recommendations |
| [**getRecommendationsWithHttpInfo**](AnalysisApi.md#getRecommendationsWithHttpInfo) | **GET** /recommendations | Recommendations |
| [**getRevenueEstimate**](AnalysisApi.md#getRevenueEstimate) | **GET** /revenue_estimate | Revenue estimate |
| [**getRevenueEstimateWithHttpInfo**](AnalysisApi.md#getRevenueEstimateWithHttpInfo) | **GET** /revenue_estimate | Revenue estimate |



## getAnalystRatingsLight

> GetAnalystRatingsLight200Response getAnalystRatingsLight(getAnalystRatingsLightRequest)

Analyst ratings snapshot

The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        RatingChangeEnum ratingChange = RatingChangeEnum.fromValue("Maintains"); // RatingChangeEnum | Filter by rating change action
        Long outputsize = 30L; // Long | Number of records in response
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        try {
            APIgetAnalystRatingsLightRequest request = APIgetAnalystRatingsLightRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .ratingChange(ratingChange)
                .outputsize(outputsize)
                .country(country)
                .build();
            GetAnalystRatingsLight200Response result = apiInstance.getAnalystRatingsLight(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getAnalystRatingsLight");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getAnalystRatingsLightRequest | [**APIgetAnalystRatingsLightRequest**](AnalysisApi.md#APIgetAnalystRatingsLightRequest)|-|-|

### Return type

[**GetAnalystRatingsLight200Response**](GetAnalystRatingsLight200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getAnalystRatingsLightWithHttpInfo

> ApiResponse<GetAnalystRatingsLight200Response> getAnalystRatingsLight getAnalystRatingsLightWithHttpInfo(getAnalystRatingsLightRequest)

Analyst ratings snapshot

The analyst ratings snapshot endpoint provides a streamlined summary of ratings from analyst firms for both US and international markets. It delivers essential data on analyst recommendations, including buy, hold, and sell ratings, allowing users to quickly assess the general sentiment of analysts towards a particular stock.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        RatingChangeEnum ratingChange = RatingChangeEnum.fromValue("Maintains"); // RatingChangeEnum | Filter by rating change action
        Long outputsize = 30L; // Long | Number of records in response
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        try {
            APIgetAnalystRatingsLightRequest request = APIgetAnalystRatingsLightRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .ratingChange(ratingChange)
                .outputsize(outputsize)
                .country(country)
                .build();
            ApiResponse<GetAnalystRatingsLight200Response> response = apiInstance.getAnalystRatingsLightWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getAnalystRatingsLight");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getAnalystRatingsLightRequest | [**APIgetAnalystRatingsLightRequest**](AnalysisApi.md#APIgetAnalystRatingsLightRequest)|-|-|

### Return type

ApiResponse<[**GetAnalystRatingsLight200Response**](GetAnalystRatingsLight200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetAnalystRatingsLightRequest"></a>
## APIgetAnalystRatingsLightRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |
| **ratingChange** | [**RatingChangeEnum**](.md) | Filter by rating change action | [optional] [enum: Maintains, Upgrade, Downgrade, Initiates, Reiterates] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 30] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getAnalystRatingsUsEquities

> GetAnalystRatingsUsEquities200Response getAnalystRatingsUsEquities(getAnalystRatingsUsEquitiesRequest)

Analyst ratings US equities

The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        RatingChangeEnum ratingChange = RatingChangeEnum.fromValue("Maintains"); // RatingChangeEnum | Filter by rating change action
        Long outputsize = 30L; // Long | Number of records in response
        try {
            APIgetAnalystRatingsUsEquitiesRequest request = APIgetAnalystRatingsUsEquitiesRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .ratingChange(ratingChange)
                .outputsize(outputsize)
                .build();
            GetAnalystRatingsUsEquities200Response result = apiInstance.getAnalystRatingsUsEquities(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getAnalystRatingsUsEquities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getAnalystRatingsUsEquitiesRequest | [**APIgetAnalystRatingsUsEquitiesRequest**](AnalysisApi.md#APIgetAnalystRatingsUsEquitiesRequest)|-|-|

### Return type

[**GetAnalystRatingsUsEquities200Response**](GetAnalystRatingsUsEquities200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getAnalystRatingsUsEquitiesWithHttpInfo

> ApiResponse<GetAnalystRatingsUsEquities200Response> getAnalystRatingsUsEquities getAnalystRatingsUsEquitiesWithHttpInfo(getAnalystRatingsUsEquitiesRequest)

Analyst ratings US equities

The analyst ratings US equities endpoint provides detailed information on analyst ratings for U.S. stocks. It returns data on the latest ratings issued by various analyst firms, including the rating itself, the firm issuing the rating, and any changes in the rating. This endpoint is useful for users tracking analyst opinions on U.S. equities, allowing them to see how professional analysts view the potential performance of specific stocks.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        RatingChangeEnum ratingChange = RatingChangeEnum.fromValue("Maintains"); // RatingChangeEnum | Filter by rating change action
        Long outputsize = 30L; // Long | Number of records in response
        try {
            APIgetAnalystRatingsUsEquitiesRequest request = APIgetAnalystRatingsUsEquitiesRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .ratingChange(ratingChange)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetAnalystRatingsUsEquities200Response> response = apiInstance.getAnalystRatingsUsEquitiesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getAnalystRatingsUsEquities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getAnalystRatingsUsEquitiesRequest | [**APIgetAnalystRatingsUsEquitiesRequest**](AnalysisApi.md#APIgetAnalystRatingsUsEquitiesRequest)|-|-|

### Return type

ApiResponse<[**GetAnalystRatingsUsEquities200Response**](GetAnalystRatingsUsEquities200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetAnalystRatingsUsEquitiesRequest"></a>
## APIgetAnalystRatingsUsEquitiesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |
| **ratingChange** | [**RatingChangeEnum**](.md) | Filter by rating change action | [optional] [enum: Maintains, Upgrade, Downgrade, Initiates, Reiterates] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 30] |



## getEarningsEstimate

> GetEarningsEstimate200Response getEarningsEstimate(getEarningsEstimateRequest)

Earnings estimate

The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        try {
            APIgetEarningsEstimateRequest request = APIgetEarningsEstimateRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            GetEarningsEstimate200Response result = apiInstance.getEarningsEstimate(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getEarningsEstimate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getEarningsEstimateRequest | [**APIgetEarningsEstimateRequest**](AnalysisApi.md#APIgetEarningsEstimateRequest)|-|-|

### Return type

[**GetEarningsEstimate200Response**](GetEarningsEstimate200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getEarningsEstimateWithHttpInfo

> ApiResponse<GetEarningsEstimate200Response> getEarningsEstimate getEarningsEstimateWithHttpInfo(getEarningsEstimateRequest)

Earnings estimate

The earnings estimate endpoint provides access to analysts&#39; projected earnings per share (EPS) for a specific company, covering both upcoming quarterly and annual periods. This data is crucial for users who need to track and compare expected financial performance across different timeframes, aiding in the evaluation of a company&#39;s future profitability.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        try {
            APIgetEarningsEstimateRequest request = APIgetEarningsEstimateRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            ApiResponse<GetEarningsEstimate200Response> response = apiInstance.getEarningsEstimateWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getEarningsEstimate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getEarningsEstimateRequest | [**APIgetEarningsEstimateRequest**](AnalysisApi.md#APIgetEarningsEstimateRequest)|-|-|

### Return type

ApiResponse<[**GetEarningsEstimate200Response**](GetEarningsEstimate200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetEarningsEstimateRequest"></a>
## APIgetEarningsEstimateRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |



## getEpsRevisions

> GetEpsRevisions200Response getEpsRevisions(getEpsRevisionsRequest)

EPS revisions

The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        try {
            APIgetEpsRevisionsRequest request = APIgetEpsRevisionsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            GetEpsRevisions200Response result = apiInstance.getEpsRevisions(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getEpsRevisions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getEpsRevisionsRequest | [**APIgetEpsRevisionsRequest**](AnalysisApi.md#APIgetEpsRevisionsRequest)|-|-|

### Return type

[**GetEpsRevisions200Response**](GetEpsRevisions200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getEpsRevisionsWithHttpInfo

> ApiResponse<GetEpsRevisions200Response> getEpsRevisions getEpsRevisionsWithHttpInfo(getEpsRevisionsRequest)

EPS revisions

The EPS revisions endpoint provides updated analyst forecasts for a company&#39;s earnings per share (EPS) on both a quarterly and annual basis. It delivers data on how these EPS predictions have changed over the past week and month, allowing users to track recent adjustments in analyst expectations. This endpoint is useful for monitoring shifts in market sentiment regarding a company&#39;s financial performance.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        try {
            APIgetEpsRevisionsRequest request = APIgetEpsRevisionsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            ApiResponse<GetEpsRevisions200Response> response = apiInstance.getEpsRevisionsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getEpsRevisions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getEpsRevisionsRequest | [**APIgetEpsRevisionsRequest**](AnalysisApi.md#APIgetEpsRevisionsRequest)|-|-|

### Return type

ApiResponse<[**GetEpsRevisions200Response**](GetEpsRevisions200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetEpsRevisionsRequest"></a>
## APIgetEpsRevisionsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |



## getEpsTrend

> GetEpsTrend200Response getEpsTrend(getEpsTrendRequest)

EPS trend

The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        try {
            APIgetEpsTrendRequest request = APIgetEpsTrendRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            GetEpsTrend200Response result = apiInstance.getEpsTrend(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getEpsTrend");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getEpsTrendRequest | [**APIgetEpsTrendRequest**](AnalysisApi.md#APIgetEpsTrendRequest)|-|-|

### Return type

[**GetEpsTrend200Response**](GetEpsTrend200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getEpsTrendWithHttpInfo

> ApiResponse<GetEpsTrend200Response> getEpsTrend getEpsTrendWithHttpInfo(getEpsTrendRequest)

EPS trend

The EPS trend endpoint provides detailed historical data on Earnings Per Share (EPS) trends over specified periods. It returns a comprehensive breakdown of estimated EPS changes, allowing users to track and analyze the progression of a company&#39;s earnings performance over time. This endpoint is ideal for users seeking to understand historical EPS fluctuations and assess financial growth patterns.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        try {
            APIgetEpsTrendRequest request = APIgetEpsTrendRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            ApiResponse<GetEpsTrend200Response> response = apiInstance.getEpsTrendWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getEpsTrend");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getEpsTrendRequest | [**APIgetEpsTrendRequest**](AnalysisApi.md#APIgetEpsTrendRequest)|-|-|

### Return type

ApiResponse<[**GetEpsTrend200Response**](GetEpsTrend200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetEpsTrendRequest"></a>
## APIgetEpsTrendRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |



## getGrowthEstimates

> GetGrowthEstimates200Response getGrowthEstimates(getGrowthEstimatesRequest)

Growth estimates

The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        try {
            APIgetGrowthEstimatesRequest request = APIgetGrowthEstimatesRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            GetGrowthEstimates200Response result = apiInstance.getGrowthEstimates(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getGrowthEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getGrowthEstimatesRequest | [**APIgetGrowthEstimatesRequest**](AnalysisApi.md#APIgetGrowthEstimatesRequest)|-|-|

### Return type

[**GetGrowthEstimates200Response**](GetGrowthEstimates200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getGrowthEstimatesWithHttpInfo

> ApiResponse<GetGrowthEstimates200Response> getGrowthEstimates getGrowthEstimatesWithHttpInfo(getGrowthEstimatesRequest)

Growth estimates

The growth estimates endpoint provides consensus analyst projections on a company&#39;s growth rates over various timeframes. It aggregates and averages estimates from multiple analysts, focusing on key financial metrics such as earnings per share and revenue. This endpoint is useful for obtaining a comprehensive view of expected company performance based on expert analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        try {
            APIgetGrowthEstimatesRequest request = APIgetGrowthEstimatesRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            ApiResponse<GetGrowthEstimates200Response> response = apiInstance.getGrowthEstimatesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getGrowthEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getGrowthEstimatesRequest | [**APIgetGrowthEstimatesRequest**](AnalysisApi.md#APIgetGrowthEstimatesRequest)|-|-|

### Return type

ApiResponse<[**GetGrowthEstimates200Response**](GetGrowthEstimates200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetGrowthEstimatesRequest"></a>
## APIgetGrowthEstimatesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |



## getPriceTarget

> GetPriceTarget200Response getPriceTarget(getPriceTargetRequest)

Price target

The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        try {
            APIgetPriceTargetRequest request = APIgetPriceTargetRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            GetPriceTarget200Response result = apiInstance.getPriceTarget(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getPriceTarget");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getPriceTargetRequest | [**APIgetPriceTargetRequest**](AnalysisApi.md#APIgetPriceTargetRequest)|-|-|

### Return type

[**GetPriceTarget200Response**](GetPriceTarget200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getPriceTargetWithHttpInfo

> ApiResponse<GetPriceTarget200Response> getPriceTarget getPriceTargetWithHttpInfo(getPriceTargetRequest)

Price target

The price target endpoint provides detailed projections of a security&#39;s future price as estimated by financial analysts. It returns data including the high, low, and average price targets. This endpoint is useful for users seeking to understand potential future valuations of specific securities based on expert analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        try {
            APIgetPriceTargetRequest request = APIgetPriceTargetRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            ApiResponse<GetPriceTarget200Response> response = apiInstance.getPriceTargetWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getPriceTarget");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getPriceTargetRequest | [**APIgetPriceTargetRequest**](AnalysisApi.md#APIgetPriceTargetRequest)|-|-|

### Return type

ApiResponse<[**GetPriceTarget200Response**](GetPriceTarget200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetPriceTargetRequest"></a>
## APIgetPriceTargetRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |



## getRecommendations

> GetRecommendations200Response getRecommendations(getRecommendationsRequest)

Recommendations

The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | The exchange name where the instrument is traded, e.g., `Nasdaq`, `NSE`.
        try {
            APIgetRecommendationsRequest request = APIgetRecommendationsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            GetRecommendations200Response result = apiInstance.getRecommendations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getRecommendations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getRecommendationsRequest | [**APIgetRecommendationsRequest**](AnalysisApi.md#APIgetRecommendationsRequest)|-|-|

### Return type

[**GetRecommendations200Response**](GetRecommendations200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getRecommendationsWithHttpInfo

> ApiResponse<GetRecommendations200Response> getRecommendations getRecommendationsWithHttpInfo(getRecommendationsRequest)

Recommendations

The recommendations endpoint provides a summary of analyst opinions for a specific stock, delivering an average recommendation categorized as Strong Buy, Buy, Hold, or Sell. It also includes a numerical recommendation score, offering a quick overview of market sentiment based on expert analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | The exchange name where the instrument is traded, e.g., `Nasdaq`, `NSE`.
        try {
            APIgetRecommendationsRequest request = APIgetRecommendationsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .build();
            ApiResponse<GetRecommendations200Response> response = apiInstance.getRecommendationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getRecommendations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getRecommendationsRequest | [**APIgetRecommendationsRequest**](AnalysisApi.md#APIgetRecommendationsRequest)|-|-|

### Return type

ApiResponse<[**GetRecommendations200Response**](GetRecommendations200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetRecommendationsRequest"></a>
## APIgetRecommendationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60;. | [optional] |



## getRevenueEstimate

> GetRevenueEstimate200Response getRevenueEstimate(getRevenueEstimateRequest)

Revenue estimate

The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        Long dp = 5L; // Long | Number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetRevenueEstimateRequest request = APIgetRevenueEstimateRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .dp(dp)
                .build();
            GetRevenueEstimate200Response result = apiInstance.getRevenueEstimate(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getRevenueEstimate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getRevenueEstimateRequest | [**APIgetRevenueEstimateRequest**](AnalysisApi.md#APIgetRevenueEstimateRequest)|-|-|

### Return type

[**GetRevenueEstimate200Response**](GetRevenueEstimate200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |

## getRevenueEstimateWithHttpInfo

> ApiResponse<GetRevenueEstimate200Response> getRevenueEstimate getRevenueEstimateWithHttpInfo(getRevenueEstimateRequest)

Revenue estimate

The revenue estimate endpoint provides a company&#39;s projected quarterly and annual revenue figures based on analysts&#39; estimates. This data is useful for users seeking insights into expected company performance, allowing them to compare forecasted sales with historical data or other companies&#39; estimates.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AnalysisApi apiInstance = new AnalysisApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String exchange = "NASDAQ"; // String | Filter by exchange name
        Long dp = 5L; // Long | Number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetRevenueEstimateRequest request = APIgetRevenueEstimateRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .exchange(exchange)
                .dp(dp)
                .build();
            ApiResponse<GetRevenueEstimate200Response> response = apiInstance.getRevenueEstimateWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysisApi#getRevenueEstimate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| getRevenueEstimateRequest | [**APIgetRevenueEstimateRequest**](AnalysisApi.md#APIgetRevenueEstimateRequest)|-|-|

### Return type

ApiResponse<[**GetRevenueEstimate200Response**](GetRevenueEstimate200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **414** |  |  -  |
| **429** |  |  -  |
| **500** |  |  -  |


<a id="APIgetRevenueEstimateRequest"></a>
## APIgetRevenueEstimateRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Should be in range [0,11] inclusive | [optional] [default to 5] |


