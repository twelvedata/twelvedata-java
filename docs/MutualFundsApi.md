# MutualFundsApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMutualFundsFamily**](MutualFundsApi.md#getMutualFundsFamily) | **GET** /mutual_funds/family | MFs families |
| [**getMutualFundsFamilyWithHttpInfo**](MutualFundsApi.md#getMutualFundsFamilyWithHttpInfo) | **GET** /mutual_funds/family | MFs families |
| [**getMutualFundsList**](MutualFundsApi.md#getMutualFundsList) | **GET** /mutual_funds/list | MFs directory |
| [**getMutualFundsListWithHttpInfo**](MutualFundsApi.md#getMutualFundsListWithHttpInfo) | **GET** /mutual_funds/list | MFs directory |
| [**getMutualFundsType**](MutualFundsApi.md#getMutualFundsType) | **GET** /mutual_funds/type | MFs types |
| [**getMutualFundsTypeWithHttpInfo**](MutualFundsApi.md#getMutualFundsTypeWithHttpInfo) | **GET** /mutual_funds/type | MFs types |
| [**getMutualFundsWorld**](MutualFundsApi.md#getMutualFundsWorld) | **GET** /mutual_funds/world | MF full data |
| [**getMutualFundsWorldWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldWithHttpInfo) | **GET** /mutual_funds/world | MF full data |
| [**getMutualFundsWorldComposition**](MutualFundsApi.md#getMutualFundsWorldComposition) | **GET** /mutual_funds/world/composition | Composition |
| [**getMutualFundsWorldCompositionWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldCompositionWithHttpInfo) | **GET** /mutual_funds/world/composition | Composition |
| [**getMutualFundsWorldPerformance**](MutualFundsApi.md#getMutualFundsWorldPerformance) | **GET** /mutual_funds/world/performance | Performance |
| [**getMutualFundsWorldPerformanceWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldPerformanceWithHttpInfo) | **GET** /mutual_funds/world/performance | Performance |
| [**getMutualFundsWorldPurchaseInfo**](MutualFundsApi.md#getMutualFundsWorldPurchaseInfo) | **GET** /mutual_funds/world/purchase_info | Purchase info |
| [**getMutualFundsWorldPurchaseInfoWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldPurchaseInfoWithHttpInfo) | **GET** /mutual_funds/world/purchase_info | Purchase info |
| [**getMutualFundsWorldRatings**](MutualFundsApi.md#getMutualFundsWorldRatings) | **GET** /mutual_funds/world/ratings | Ratings |
| [**getMutualFundsWorldRatingsWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldRatingsWithHttpInfo) | **GET** /mutual_funds/world/ratings | Ratings |
| [**getMutualFundsWorldRisk**](MutualFundsApi.md#getMutualFundsWorldRisk) | **GET** /mutual_funds/world/risk | Risk |
| [**getMutualFundsWorldRiskWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldRiskWithHttpInfo) | **GET** /mutual_funds/world/risk | Risk |
| [**getMutualFundsWorldSummary**](MutualFundsApi.md#getMutualFundsWorldSummary) | **GET** /mutual_funds/world/summary | Summary |
| [**getMutualFundsWorldSummaryWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldSummaryWithHttpInfo) | **GET** /mutual_funds/world/summary | Summary |
| [**getMutualFundsWorldSustainability**](MutualFundsApi.md#getMutualFundsWorldSustainability) | **GET** /mutual_funds/world/sustainability | Sustainability |
| [**getMutualFundsWorldSustainabilityWithHttpInfo**](MutualFundsApi.md#getMutualFundsWorldSustainabilityWithHttpInfo) | **GET** /mutual_funds/world/sustainability | Sustainability |



## getMutualFundsFamily

> GetMutualFundsFamily200Response getMutualFundsFamily(getMutualFundsFamilyRequest)

MFs families

The mutual funds family endpoint provides a comprehensive list of MF families, which are groups of mutual funds managed by the same investment company. This data is useful for users looking to explore or compare different fund families, understand the range of investment options offered by each, and identify potential investment opportunities within specific fund families.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String fundFamily = "Jackson National"; // String | Filter by investment company that manages the fund
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        try {
            APIgetMutualFundsFamilyRequest request = APIgetMutualFundsFamilyRequest.newBuilder()
                .fundFamily(fundFamily)
                .country(country)
                .build();
            GetMutualFundsFamily200Response result = apiInstance.getMutualFundsFamily(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsFamily");
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
| getMutualFundsFamilyRequest | [**APIgetMutualFundsFamilyRequest**](MutualFundsApi.md#APIgetMutualFundsFamilyRequest)|-|-|

### Return type

[**GetMutualFundsFamily200Response**](GetMutualFundsFamily200Response.md)


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

## getMutualFundsFamilyWithHttpInfo

> ApiResponse<GetMutualFundsFamily200Response> getMutualFundsFamily getMutualFundsFamilyWithHttpInfo(getMutualFundsFamilyRequest)

MFs families

The mutual funds family endpoint provides a comprehensive list of MF families, which are groups of mutual funds managed by the same investment company. This data is useful for users looking to explore or compare different fund families, understand the range of investment options offered by each, and identify potential investment opportunities within specific fund families.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String fundFamily = "Jackson National"; // String | Filter by investment company that manages the fund
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        try {
            APIgetMutualFundsFamilyRequest request = APIgetMutualFundsFamilyRequest.newBuilder()
                .fundFamily(fundFamily)
                .country(country)
                .build();
            ApiResponse<GetMutualFundsFamily200Response> response = apiInstance.getMutualFundsFamilyWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsFamily");
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
| getMutualFundsFamilyRequest | [**APIgetMutualFundsFamilyRequest**](MutualFundsApi.md#APIgetMutualFundsFamilyRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsFamily200Response**](GetMutualFundsFamily200Response.md)>


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


<a id="APIgetMutualFundsFamilyRequest"></a>
## APIgetMutualFundsFamilyRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **fundFamily** | **String** | Filter by investment company that manages the fund | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getMutualFundsList

> GetMutualFundsList200Response getMutualFundsList(getMutualFundsListRequest)

MFs directory

The mutual funds directory endpoint provides a daily updated list of mutual funds, sorted in descending order by their total assets value. This endpoint is useful for retrieving an organized overview of available mutual funds.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Filter by symbol
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundFamily = "Jackson National"; // String | Filter by investment company that manages the fund
        String fundType = "Small Blend"; // String | Filter by the type of fund
        Long performanceRating = 4L; // Long | Filter by performance rating from `0` to `5`
        Long riskRating = 4L; // Long | Filter by risk rating from `0` to `5`
        Long page = 1L; // Long | Page number
        Long outputsize = 100L; // Long | Number of records in response
        try {
            APIgetMutualFundsListRequest request = APIgetMutualFundsListRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .cik(cik)
                .country(country)
                .fundFamily(fundFamily)
                .fundType(fundType)
                .performanceRating(performanceRating)
                .riskRating(riskRating)
                .page(page)
                .outputsize(outputsize)
                .build();
            GetMutualFundsList200Response result = apiInstance.getMutualFundsList(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsList");
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
| getMutualFundsListRequest | [**APIgetMutualFundsListRequest**](MutualFundsApi.md#APIgetMutualFundsListRequest)|-|-|

### Return type

[**GetMutualFundsList200Response**](GetMutualFundsList200Response.md)


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

## getMutualFundsListWithHttpInfo

> ApiResponse<GetMutualFundsList200Response> getMutualFundsList getMutualFundsListWithHttpInfo(getMutualFundsListRequest)

MFs directory

The mutual funds directory endpoint provides a daily updated list of mutual funds, sorted in descending order by their total assets value. This endpoint is useful for retrieving an organized overview of available mutual funds.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Filter by symbol
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundFamily = "Jackson National"; // String | Filter by investment company that manages the fund
        String fundType = "Small Blend"; // String | Filter by the type of fund
        Long performanceRating = 4L; // Long | Filter by performance rating from `0` to `5`
        Long riskRating = 4L; // Long | Filter by risk rating from `0` to `5`
        Long page = 1L; // Long | Page number
        Long outputsize = 100L; // Long | Number of records in response
        try {
            APIgetMutualFundsListRequest request = APIgetMutualFundsListRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .cik(cik)
                .country(country)
                .fundFamily(fundFamily)
                .fundType(fundType)
                .performanceRating(performanceRating)
                .riskRating(riskRating)
                .page(page)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetMutualFundsList200Response> response = apiInstance.getMutualFundsListWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsList");
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
| getMutualFundsListRequest | [**APIgetMutualFundsListRequest**](MutualFundsApi.md#APIgetMutualFundsListRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsList200Response**](GetMutualFundsList200Response.md)>


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


<a id="APIgetMutualFundsListRequest"></a>
## APIgetMutualFundsListRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String** | The CIK of an instrument for which data is requested | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **fundFamily** | **String** | Filter by investment company that manages the fund | [optional] |
| **fundType** | **String** | Filter by the type of fund | [optional] |
| **performanceRating** | **Long** | Filter by performance rating from &#x60;0&#x60; to &#x60;5&#x60; | [optional] |
| **riskRating** | **Long** | Filter by risk rating from &#x60;0&#x60; to &#x60;5&#x60; | [optional] |
| **page** | **Long** | Page number | [optional] [default to 1] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 100] |



## getMutualFundsType

> GetMutualFundsType200Response getMutualFundsType(getMutualFundsTypeRequest)

MFs types

This endpoint provides detailed information on various types of mutual funds, such as equity, bond, and balanced funds, allowing users to understand the different investment options available.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String fundType = "Jackson National"; // String | Filter by the type of fund
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        try {
            APIgetMutualFundsTypeRequest request = APIgetMutualFundsTypeRequest.newBuilder()
                .fundType(fundType)
                .country(country)
                .build();
            GetMutualFundsType200Response result = apiInstance.getMutualFundsType(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsType");
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
| getMutualFundsTypeRequest | [**APIgetMutualFundsTypeRequest**](MutualFundsApi.md#APIgetMutualFundsTypeRequest)|-|-|

### Return type

[**GetMutualFundsType200Response**](GetMutualFundsType200Response.md)


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

## getMutualFundsTypeWithHttpInfo

> ApiResponse<GetMutualFundsType200Response> getMutualFundsType getMutualFundsTypeWithHttpInfo(getMutualFundsTypeRequest)

MFs types

This endpoint provides detailed information on various types of mutual funds, such as equity, bond, and balanced funds, allowing users to understand the different investment options available.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String fundType = "Jackson National"; // String | Filter by the type of fund
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        try {
            APIgetMutualFundsTypeRequest request = APIgetMutualFundsTypeRequest.newBuilder()
                .fundType(fundType)
                .country(country)
                .build();
            ApiResponse<GetMutualFundsType200Response> response = apiInstance.getMutualFundsTypeWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsType");
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
| getMutualFundsTypeRequest | [**APIgetMutualFundsTypeRequest**](MutualFundsApi.md#APIgetMutualFundsTypeRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsType200Response**](GetMutualFundsType200Response.md)>


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


<a id="APIgetMutualFundsTypeRequest"></a>
## APIgetMutualFundsTypeRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **fundType** | **String** | Filter by the type of fund | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getMutualFundsWorld

> GetMutualFundsWorld200Response getMutualFundsWorld(getMutualFundsWorldRequest)

MF full data

The mutual full data endpoint provides detailed information about global mutual funds. It returns a comprehensive dataset that includes a summary of the fund, its performance metrics, risk assessment, ratings, asset composition, purchase details, and sustainability factors. This endpoint is essential for users seeking in-depth insights into mutual funds on a global scale, allowing them to evaluate various aspects such as investment performance, risk levels, and environmental impact.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldRequest request = APIgetMutualFundsWorldRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorld200Response result = apiInstance.getMutualFundsWorld(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorld");
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
| getMutualFundsWorldRequest | [**APIgetMutualFundsWorldRequest**](MutualFundsApi.md#APIgetMutualFundsWorldRequest)|-|-|

### Return type

[**GetMutualFundsWorld200Response**](GetMutualFundsWorld200Response.md)


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

## getMutualFundsWorldWithHttpInfo

> ApiResponse<GetMutualFundsWorld200Response> getMutualFundsWorld getMutualFundsWorldWithHttpInfo(getMutualFundsWorldRequest)

MF full data

The mutual full data endpoint provides detailed information about global mutual funds. It returns a comprehensive dataset that includes a summary of the fund, its performance metrics, risk assessment, ratings, asset composition, purchase details, and sustainability factors. This endpoint is essential for users seeking in-depth insights into mutual funds on a global scale, allowing them to evaluate various aspects such as investment performance, risk levels, and environmental impact.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldRequest request = APIgetMutualFundsWorldRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorld200Response> response = apiInstance.getMutualFundsWorldWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorld");
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
| getMutualFundsWorldRequest | [**APIgetMutualFundsWorldRequest**](MutualFundsApi.md#APIgetMutualFundsWorldRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorld200Response**](GetMutualFundsWorld200Response.md)>


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


<a id="APIgetMutualFundsWorldRequest"></a>
## APIgetMutualFundsWorldRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldComposition

> GetMutualFundsWorldComposition200Response getMutualFundsWorldComposition(getMutualFundsWorldCompositionRequest)

Composition

The mutual funds compositions endpoint provides detailed information about the portfolio composition of a specified mutual fund. It returns data on sector allocations, individual holdings, and their respective weighted exposures. This endpoint is useful for users seeking to understand the investment distribution and risk profile of a mutual fund.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldCompositionRequest request = APIgetMutualFundsWorldCompositionRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldComposition200Response result = apiInstance.getMutualFundsWorldComposition(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldComposition");
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
| getMutualFundsWorldCompositionRequest | [**APIgetMutualFundsWorldCompositionRequest**](MutualFundsApi.md#APIgetMutualFundsWorldCompositionRequest)|-|-|

### Return type

[**GetMutualFundsWorldComposition200Response**](GetMutualFundsWorldComposition200Response.md)


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

## getMutualFundsWorldCompositionWithHttpInfo

> ApiResponse<GetMutualFundsWorldComposition200Response> getMutualFundsWorldComposition getMutualFundsWorldCompositionWithHttpInfo(getMutualFundsWorldCompositionRequest)

Composition

The mutual funds compositions endpoint provides detailed information about the portfolio composition of a specified mutual fund. It returns data on sector allocations, individual holdings, and their respective weighted exposures. This endpoint is useful for users seeking to understand the investment distribution and risk profile of a mutual fund.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldCompositionRequest request = APIgetMutualFundsWorldCompositionRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldComposition200Response> response = apiInstance.getMutualFundsWorldCompositionWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldComposition");
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
| getMutualFundsWorldCompositionRequest | [**APIgetMutualFundsWorldCompositionRequest**](MutualFundsApi.md#APIgetMutualFundsWorldCompositionRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldComposition200Response**](GetMutualFundsWorldComposition200Response.md)>


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


<a id="APIgetMutualFundsWorldCompositionRequest"></a>
## APIgetMutualFundsWorldCompositionRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldPerformance

> GetMutualFundsWorldPerformance200Response getMutualFundsWorldPerformance(getMutualFundsWorldPerformanceRequest)

Performance

The mutual funds performances endpoint provides comprehensive performance data for mutual funds globally. It returns metrics such as trailing returns, annual returns, quarterly returns, and load-adjusted returns.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldPerformanceRequest request = APIgetMutualFundsWorldPerformanceRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldPerformance200Response result = apiInstance.getMutualFundsWorldPerformance(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldPerformance");
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
| getMutualFundsWorldPerformanceRequest | [**APIgetMutualFundsWorldPerformanceRequest**](MutualFundsApi.md#APIgetMutualFundsWorldPerformanceRequest)|-|-|

### Return type

[**GetMutualFundsWorldPerformance200Response**](GetMutualFundsWorldPerformance200Response.md)


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

## getMutualFundsWorldPerformanceWithHttpInfo

> ApiResponse<GetMutualFundsWorldPerformance200Response> getMutualFundsWorldPerformance getMutualFundsWorldPerformanceWithHttpInfo(getMutualFundsWorldPerformanceRequest)

Performance

The mutual funds performances endpoint provides comprehensive performance data for mutual funds globally. It returns metrics such as trailing returns, annual returns, quarterly returns, and load-adjusted returns.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldPerformanceRequest request = APIgetMutualFundsWorldPerformanceRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldPerformance200Response> response = apiInstance.getMutualFundsWorldPerformanceWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldPerformance");
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
| getMutualFundsWorldPerformanceRequest | [**APIgetMutualFundsWorldPerformanceRequest**](MutualFundsApi.md#APIgetMutualFundsWorldPerformanceRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldPerformance200Response**](GetMutualFundsWorldPerformance200Response.md)>


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


<a id="APIgetMutualFundsWorldPerformanceRequest"></a>
## APIgetMutualFundsWorldPerformanceRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldPurchaseInfo

> GetMutualFundsWorldPurchaseInfo200Response getMutualFundsWorldPurchaseInfo(getMutualFundsWorldPurchaseInfoRequest)

Purchase info

The mutual funds purchase information endpoint provides detailed purchasing details for global mutual funds. It returns data on minimum investment requirements, current pricing, and a list of brokerages where the mutual fund can be purchased. This endpoint is useful for users looking to understand the entry requirements and options available for investing in specific mutual funds.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldPurchaseInfoRequest request = APIgetMutualFundsWorldPurchaseInfoRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldPurchaseInfo200Response result = apiInstance.getMutualFundsWorldPurchaseInfo(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldPurchaseInfo");
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
| getMutualFundsWorldPurchaseInfoRequest | [**APIgetMutualFundsWorldPurchaseInfoRequest**](MutualFundsApi.md#APIgetMutualFundsWorldPurchaseInfoRequest)|-|-|

### Return type

[**GetMutualFundsWorldPurchaseInfo200Response**](GetMutualFundsWorldPurchaseInfo200Response.md)


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

## getMutualFundsWorldPurchaseInfoWithHttpInfo

> ApiResponse<GetMutualFundsWorldPurchaseInfo200Response> getMutualFundsWorldPurchaseInfo getMutualFundsWorldPurchaseInfoWithHttpInfo(getMutualFundsWorldPurchaseInfoRequest)

Purchase info

The mutual funds purchase information endpoint provides detailed purchasing details for global mutual funds. It returns data on minimum investment requirements, current pricing, and a list of brokerages where the mutual fund can be purchased. This endpoint is useful for users looking to understand the entry requirements and options available for investing in specific mutual funds.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldPurchaseInfoRequest request = APIgetMutualFundsWorldPurchaseInfoRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldPurchaseInfo200Response> response = apiInstance.getMutualFundsWorldPurchaseInfoWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldPurchaseInfo");
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
| getMutualFundsWorldPurchaseInfoRequest | [**APIgetMutualFundsWorldPurchaseInfoRequest**](MutualFundsApi.md#APIgetMutualFundsWorldPurchaseInfoRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldPurchaseInfo200Response**](GetMutualFundsWorldPurchaseInfo200Response.md)>


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


<a id="APIgetMutualFundsWorldPurchaseInfoRequest"></a>
## APIgetMutualFundsWorldPurchaseInfoRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldRatings

> GetMutualFundsWorldRatings200Response getMutualFundsWorldRatings(getMutualFundsWorldRatingsRequest)

Ratings

The mutual funds ratings endpoint provides detailed ratings for mutual funds across global markets. It returns data on the performance and quality of mutual funds, including ratings calculated in-house by Twelve Data and from various financial institutions.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldRatingsRequest request = APIgetMutualFundsWorldRatingsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldRatings200Response result = apiInstance.getMutualFundsWorldRatings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldRatings");
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
| getMutualFundsWorldRatingsRequest | [**APIgetMutualFundsWorldRatingsRequest**](MutualFundsApi.md#APIgetMutualFundsWorldRatingsRequest)|-|-|

### Return type

[**GetMutualFundsWorldRatings200Response**](GetMutualFundsWorldRatings200Response.md)


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

## getMutualFundsWorldRatingsWithHttpInfo

> ApiResponse<GetMutualFundsWorldRatings200Response> getMutualFundsWorldRatings getMutualFundsWorldRatingsWithHttpInfo(getMutualFundsWorldRatingsRequest)

Ratings

The mutual funds ratings endpoint provides detailed ratings for mutual funds across global markets. It returns data on the performance and quality of mutual funds, including ratings calculated in-house by Twelve Data and from various financial institutions.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldRatingsRequest request = APIgetMutualFundsWorldRatingsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldRatings200Response> response = apiInstance.getMutualFundsWorldRatingsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldRatings");
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
| getMutualFundsWorldRatingsRequest | [**APIgetMutualFundsWorldRatingsRequest**](MutualFundsApi.md#APIgetMutualFundsWorldRatingsRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldRatings200Response**](GetMutualFundsWorldRatings200Response.md)>


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


<a id="APIgetMutualFundsWorldRatingsRequest"></a>
## APIgetMutualFundsWorldRatingsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldRisk

> GetMutualFundsWorldRisk200Response getMutualFundsWorldRisk(getMutualFundsWorldRiskRequest)

Risk

The mutual funds risk endpoint provides detailed risk metrics for global mutual funds. It returns data such as standard deviation, beta, and Sharpe ratio, which help assess the volatility and risk profile of mutual funds across different markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldRiskRequest request = APIgetMutualFundsWorldRiskRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldRisk200Response result = apiInstance.getMutualFundsWorldRisk(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldRisk");
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
| getMutualFundsWorldRiskRequest | [**APIgetMutualFundsWorldRiskRequest**](MutualFundsApi.md#APIgetMutualFundsWorldRiskRequest)|-|-|

### Return type

[**GetMutualFundsWorldRisk200Response**](GetMutualFundsWorldRisk200Response.md)


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

## getMutualFundsWorldRiskWithHttpInfo

> ApiResponse<GetMutualFundsWorldRisk200Response> getMutualFundsWorldRisk getMutualFundsWorldRiskWithHttpInfo(getMutualFundsWorldRiskRequest)

Risk

The mutual funds risk endpoint provides detailed risk metrics for global mutual funds. It returns data such as standard deviation, beta, and Sharpe ratio, which help assess the volatility and risk profile of mutual funds across different markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldRiskRequest request = APIgetMutualFundsWorldRiskRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldRisk200Response> response = apiInstance.getMutualFundsWorldRiskWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldRisk");
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
| getMutualFundsWorldRiskRequest | [**APIgetMutualFundsWorldRiskRequest**](MutualFundsApi.md#APIgetMutualFundsWorldRiskRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldRisk200Response**](GetMutualFundsWorldRisk200Response.md)>


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


<a id="APIgetMutualFundsWorldRiskRequest"></a>
## APIgetMutualFundsWorldRiskRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldSummary

> GetMutualFundsWorldSummary200Response getMutualFundsWorldSummary(getMutualFundsWorldSummaryRequest)

Summary

The mutual funds summary endpoint provides a concise overview of global mutual funds, including key details such as fund name, symbol, asset class, and region. This endpoint is useful for quickly obtaining essential information about various mutual funds worldwide, aiding in the comparison and selection of funds for investment portfolios.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldSummaryRequest request = APIgetMutualFundsWorldSummaryRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldSummary200Response result = apiInstance.getMutualFundsWorldSummary(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldSummary");
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
| getMutualFundsWorldSummaryRequest | [**APIgetMutualFundsWorldSummaryRequest**](MutualFundsApi.md#APIgetMutualFundsWorldSummaryRequest)|-|-|

### Return type

[**GetMutualFundsWorldSummary200Response**](GetMutualFundsWorldSummary200Response.md)


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

## getMutualFundsWorldSummaryWithHttpInfo

> ApiResponse<GetMutualFundsWorldSummary200Response> getMutualFundsWorldSummary getMutualFundsWorldSummaryWithHttpInfo(getMutualFundsWorldSummaryRequest)

Summary

The mutual funds summary endpoint provides a concise overview of global mutual funds, including key details such as fund name, symbol, asset class, and region. This endpoint is useful for quickly obtaining essential information about various mutual funds worldwide, aiding in the comparison and selection of funds for investment portfolios.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldSummaryRequest request = APIgetMutualFundsWorldSummaryRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldSummary200Response> response = apiInstance.getMutualFundsWorldSummaryWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldSummary");
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
| getMutualFundsWorldSummaryRequest | [**APIgetMutualFundsWorldSummaryRequest**](MutualFundsApi.md#APIgetMutualFundsWorldSummaryRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldSummary200Response**](GetMutualFundsWorldSummary200Response.md)>


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


<a id="APIgetMutualFundsWorldSummaryRequest"></a>
## APIgetMutualFundsWorldSummaryRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getMutualFundsWorldSustainability

> GetMutualFundsWorldSustainability200Response getMutualFundsWorldSustainability(getMutualFundsWorldSustainabilityRequest)

Sustainability

The mutual funds sustainability endpoint provides detailed information on the sustainability and Environmental, Social, and Governance (ESG) ratings of global mutual funds. It returns data such as ESG scores, sustainability metrics, and fund identifiers.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldSustainabilityRequest request = APIgetMutualFundsWorldSustainabilityRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetMutualFundsWorldSustainability200Response result = apiInstance.getMutualFundsWorldSustainability(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldSustainability");
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
| getMutualFundsWorldSustainabilityRequest | [**APIgetMutualFundsWorldSustainabilityRequest**](MutualFundsApi.md#APIgetMutualFundsWorldSustainabilityRequest)|-|-|

### Return type

[**GetMutualFundsWorldSustainability200Response**](GetMutualFundsWorldSustainability200Response.md)


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

## getMutualFundsWorldSustainabilityWithHttpInfo

> ApiResponse<GetMutualFundsWorldSustainability200Response> getMutualFundsWorldSustainability getMutualFundsWorldSustainabilityWithHttpInfo(getMutualFundsWorldSustainabilityRequest)

Sustainability

The mutual funds sustainability endpoint provides detailed information on the sustainability and Environmental, Social, and Governance (ESG) ratings of global mutual funds. It returns data such as ESG scores, sustainability metrics, and fund identifiers.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MutualFundsApi apiInstance = new MutualFundsApi(defaultClient);
        String symbol = "1535462D"; // String | Symbol ticker of mutual fund
        String figi = "BBG00HMMLCH1"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "LU1206782309"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "120678230"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetMutualFundsWorldSustainabilityRequest request = APIgetMutualFundsWorldSustainabilityRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetMutualFundsWorldSustainability200Response> response = apiInstance.getMutualFundsWorldSustainabilityWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundsApi#getMutualFundsWorldSustainability");
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
| getMutualFundsWorldSustainabilityRequest | [**APIgetMutualFundsWorldSustainabilityRequest**](MutualFundsApi.md#APIgetMutualFundsWorldSustainabilityRequest)|-|-|

### Return type

ApiResponse<[**GetMutualFundsWorldSustainability200Response**](GetMutualFundsWorldSustainability200Response.md)>


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


<a id="APIgetMutualFundsWorldSustainabilityRequest"></a>
## APIgetMutualFundsWorldSustainabilityRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of mutual fund | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |


