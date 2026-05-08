# EtfsApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getETFsFamily**](EtfsApi.md#getETFsFamily) | **GET** /etfs/family | ETFs families |
| [**getETFsFamilyWithHttpInfo**](EtfsApi.md#getETFsFamilyWithHttpInfo) | **GET** /etfs/family | ETFs families |
| [**getETFsList**](EtfsApi.md#getETFsList) | **GET** /etfs/list | ETFs directory |
| [**getETFsListWithHttpInfo**](EtfsApi.md#getETFsListWithHttpInfo) | **GET** /etfs/list | ETFs directory |
| [**getETFsType**](EtfsApi.md#getETFsType) | **GET** /etfs/type | ETFs types |
| [**getETFsTypeWithHttpInfo**](EtfsApi.md#getETFsTypeWithHttpInfo) | **GET** /etfs/type | ETFs types |
| [**getETFsWorld**](EtfsApi.md#getETFsWorld) | **GET** /etfs/world | ETF full data |
| [**getETFsWorldWithHttpInfo**](EtfsApi.md#getETFsWorldWithHttpInfo) | **GET** /etfs/world | ETF full data |
| [**getETFsWorldComposition**](EtfsApi.md#getETFsWorldComposition) | **GET** /etfs/world/composition | Composition |
| [**getETFsWorldCompositionWithHttpInfo**](EtfsApi.md#getETFsWorldCompositionWithHttpInfo) | **GET** /etfs/world/composition | Composition |
| [**getETFsWorldPerformance**](EtfsApi.md#getETFsWorldPerformance) | **GET** /etfs/world/performance | Performance |
| [**getETFsWorldPerformanceWithHttpInfo**](EtfsApi.md#getETFsWorldPerformanceWithHttpInfo) | **GET** /etfs/world/performance | Performance |
| [**getETFsWorldRisk**](EtfsApi.md#getETFsWorldRisk) | **GET** /etfs/world/risk | Risk |
| [**getETFsWorldRiskWithHttpInfo**](EtfsApi.md#getETFsWorldRiskWithHttpInfo) | **GET** /etfs/world/risk | Risk |
| [**getETFsWorldSummary**](EtfsApi.md#getETFsWorldSummary) | **GET** /etfs/world/summary | Summary |
| [**getETFsWorldSummaryWithHttpInfo**](EtfsApi.md#getETFsWorldSummaryWithHttpInfo) | **GET** /etfs/world/summary | Summary |



## getETFsFamily

> GetETFsFamily200Response getETFsFamily(getETFsFamilyRequest)

ETFs families

Retrieve a comprehensive list of exchange-traded fund (ETF) families, providing users with detailed information on various ETF groups available in the market. This endpoint is ideal for users looking to explore different ETF categories, compare offerings, or integrate ETF family data into their financial applications.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundFamily = "iShares"; // String | Filter by investment company that manages the fund
        try {
            APIgetETFsFamilyRequest request = APIgetETFsFamilyRequest.newBuilder()
                .country(country)
                .fundFamily(fundFamily)
                .build();
            GetETFsFamily200Response result = apiInstance.getETFsFamily(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsFamily");
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
| getETFsFamilyRequest | [**APIgetETFsFamilyRequest**](EtfsApi.md#APIgetETFsFamilyRequest)|-|-|

### Return type

[**GetETFsFamily200Response**](GetETFsFamily200Response.md)


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

## getETFsFamilyWithHttpInfo

> ApiResponse<GetETFsFamily200Response> getETFsFamily getETFsFamilyWithHttpInfo(getETFsFamilyRequest)

ETFs families

Retrieve a comprehensive list of exchange-traded fund (ETF) families, providing users with detailed information on various ETF groups available in the market. This endpoint is ideal for users looking to explore different ETF categories, compare offerings, or integrate ETF family data into their financial applications.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundFamily = "iShares"; // String | Filter by investment company that manages the fund
        try {
            APIgetETFsFamilyRequest request = APIgetETFsFamilyRequest.newBuilder()
                .country(country)
                .fundFamily(fundFamily)
                .build();
            ApiResponse<GetETFsFamily200Response> response = apiInstance.getETFsFamilyWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsFamily");
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
| getETFsFamilyRequest | [**APIgetETFsFamilyRequest**](EtfsApi.md#APIgetETFsFamilyRequest)|-|-|

### Return type

ApiResponse<[**GetETFsFamily200Response**](GetETFsFamily200Response.md)>


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


<a id="APIgetETFsFamilyRequest"></a>
## APIgetETFsFamilyRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **fundFamily** | **String** | Filter by investment company that manages the fund | [optional] |



## getETFsList

> GetETFsList200Response getETFsList(getETFsListRequest)

ETFs directory

The ETFs directory endpoint provides a daily updated list of exchange-traded funds, sorted by total assets in descending order. This endpoint is useful for retrieving comprehensive ETF data, including fund names and asset values, to assist users in quickly identifying the ETFs available.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Filter by symbol
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundFamily = "iShares"; // String | Filter by investment company that manages the fund
        String fundType = "Large Blend"; // String | Filter by the type of fund
        Long page = 1L; // Long | Page number
        Long outputsize = 50L; // Long | Number of records in response
        try {
            APIgetETFsListRequest request = APIgetETFsListRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .cik(cik)
                .country(country)
                .fundFamily(fundFamily)
                .fundType(fundType)
                .page(page)
                .outputsize(outputsize)
                .build();
            GetETFsList200Response result = apiInstance.getETFsList(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsList");
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
| getETFsListRequest | [**APIgetETFsListRequest**](EtfsApi.md#APIgetETFsListRequest)|-|-|

### Return type

[**GetETFsList200Response**](GetETFsList200Response.md)


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

## getETFsListWithHttpInfo

> ApiResponse<GetETFsList200Response> getETFsList getETFsListWithHttpInfo(getETFsListRequest)

ETFs directory

The ETFs directory endpoint provides a daily updated list of exchange-traded funds, sorted by total assets in descending order. This endpoint is useful for retrieving comprehensive ETF data, including fund names and asset values, to assist users in quickly identifying the ETFs available.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Filter by symbol
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundFamily = "iShares"; // String | Filter by investment company that manages the fund
        String fundType = "Large Blend"; // String | Filter by the type of fund
        Long page = 1L; // Long | Page number
        Long outputsize = 50L; // Long | Number of records in response
        try {
            APIgetETFsListRequest request = APIgetETFsListRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .cik(cik)
                .country(country)
                .fundFamily(fundFamily)
                .fundType(fundType)
                .page(page)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetETFsList200Response> response = apiInstance.getETFsListWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsList");
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
| getETFsListRequest | [**APIgetETFsListRequest**](EtfsApi.md#APIgetETFsListRequest)|-|-|

### Return type

ApiResponse<[**GetETFsList200Response**](GetETFsList200Response.md)>


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


<a id="APIgetETFsListRequest"></a>
## APIgetETFsListRequest
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
| **page** | **Long** | Page number | [optional] [default to 1] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 50] |



## getETFsType

> GetETFsType200Response getETFsType(getETFsTypeRequest)

ETFs types

The ETFs Types endpoint provides a concise list of ETF categories by market (e.g., Singapore, United States), including types like \&quot;Equity Precious Metals\&quot; and \&quot;Large Blend.\&quot; It supports targeted investment research and portfolio diversification.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundType = "Large Blend"; // String | Filter by the type of fund
        try {
            APIgetETFsTypeRequest request = APIgetETFsTypeRequest.newBuilder()
                .country(country)
                .fundType(fundType)
                .build();
            GetETFsType200Response result = apiInstance.getETFsType(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsType");
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
| getETFsTypeRequest | [**APIgetETFsTypeRequest**](EtfsApi.md#APIgetETFsTypeRequest)|-|-|

### Return type

[**GetETFsType200Response**](GetETFsType200Response.md)


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

## getETFsTypeWithHttpInfo

> ApiResponse<GetETFsType200Response> getETFsType getETFsTypeWithHttpInfo(getETFsTypeRequest)

ETFs types

The ETFs Types endpoint provides a concise list of ETF categories by market (e.g., Singapore, United States), including types like \&quot;Equity Precious Metals\&quot; and \&quot;Large Blend.\&quot; It supports targeted investment research and portfolio diversification.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String fundType = "Large Blend"; // String | Filter by the type of fund
        try {
            APIgetETFsTypeRequest request = APIgetETFsTypeRequest.newBuilder()
                .country(country)
                .fundType(fundType)
                .build();
            ApiResponse<GetETFsType200Response> response = apiInstance.getETFsTypeWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsType");
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
| getETFsTypeRequest | [**APIgetETFsTypeRequest**](EtfsApi.md#APIgetETFsTypeRequest)|-|-|

### Return type

ApiResponse<[**GetETFsType200Response**](GetETFsType200Response.md)>


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


<a id="APIgetETFsTypeRequest"></a>
## APIgetETFsTypeRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **fundType** | **String** | Filter by the type of fund | [optional] |



## getETFsWorld

> GetETFsWorld200Response getETFsWorld(getETFsWorldRequest)

ETF full data

The ETF full data endpoint provides detailed information about global Exchange-Traded Funds. It returns comprehensive data, including a summary, performance metrics, risk assessment, and composition details. This endpoint is ideal for users seeking an in-depth analysis of worldwide ETFs, enabling them to access key financial metrics and portfolio breakdowns.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldRequest request = APIgetETFsWorldRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetETFsWorld200Response result = apiInstance.getETFsWorld(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorld");
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
| getETFsWorldRequest | [**APIgetETFsWorldRequest**](EtfsApi.md#APIgetETFsWorldRequest)|-|-|

### Return type

[**GetETFsWorld200Response**](GetETFsWorld200Response.md)


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

## getETFsWorldWithHttpInfo

> ApiResponse<GetETFsWorld200Response> getETFsWorld getETFsWorldWithHttpInfo(getETFsWorldRequest)

ETF full data

The ETF full data endpoint provides detailed information about global Exchange-Traded Funds. It returns comprehensive data, including a summary, performance metrics, risk assessment, and composition details. This endpoint is ideal for users seeking an in-depth analysis of worldwide ETFs, enabling them to access key financial metrics and portfolio breakdowns.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldRequest request = APIgetETFsWorldRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetETFsWorld200Response> response = apiInstance.getETFsWorldWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorld");
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
| getETFsWorldRequest | [**APIgetETFsWorldRequest**](EtfsApi.md#APIgetETFsWorldRequest)|-|-|

### Return type

ApiResponse<[**GetETFsWorld200Response**](GetETFsWorld200Response.md)>


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


<a id="APIgetETFsWorldRequest"></a>
## APIgetETFsWorldRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of etf | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getETFsWorldComposition

> GetETFsWorldComposition200Response getETFsWorldComposition(getETFsWorldCompositionRequest)

Composition

The ETFs composition endpoint provides detailed information about the composition of global Exchange-Traded Funds. It returns data on the sectors included in the ETF, specific holding details, and the weighted exposure of each component. This endpoint is useful for users who need to understand the specific makeup and sector distribution of an ETF portfolio.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldCompositionRequest request = APIgetETFsWorldCompositionRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetETFsWorldComposition200Response result = apiInstance.getETFsWorldComposition(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldComposition");
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
| getETFsWorldCompositionRequest | [**APIgetETFsWorldCompositionRequest**](EtfsApi.md#APIgetETFsWorldCompositionRequest)|-|-|

### Return type

[**GetETFsWorldComposition200Response**](GetETFsWorldComposition200Response.md)


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

## getETFsWorldCompositionWithHttpInfo

> ApiResponse<GetETFsWorldComposition200Response> getETFsWorldComposition getETFsWorldCompositionWithHttpInfo(getETFsWorldCompositionRequest)

Composition

The ETFs composition endpoint provides detailed information about the composition of global Exchange-Traded Funds. It returns data on the sectors included in the ETF, specific holding details, and the weighted exposure of each component. This endpoint is useful for users who need to understand the specific makeup and sector distribution of an ETF portfolio.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldCompositionRequest request = APIgetETFsWorldCompositionRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetETFsWorldComposition200Response> response = apiInstance.getETFsWorldCompositionWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldComposition");
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
| getETFsWorldCompositionRequest | [**APIgetETFsWorldCompositionRequest**](EtfsApi.md#APIgetETFsWorldCompositionRequest)|-|-|

### Return type

ApiResponse<[**GetETFsWorldComposition200Response**](GetETFsWorldComposition200Response.md)>


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


<a id="APIgetETFsWorldCompositionRequest"></a>
## APIgetETFsWorldCompositionRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of etf | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getETFsWorldPerformance

> GetETFsWorldPerformance200Response getETFsWorldPerformance(getETFsWorldPerformanceRequest)

Performance

The ETFs performance endpoint provides comprehensive performance data for exchange-traded funds globally. It returns detailed metrics such as trailing returns and annual returns, enabling users to evaluate the historical performance of various ETFs. This endpoint is ideal for users looking to compare ETF performance over different time periods and assess their investment potential.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldPerformanceRequest request = APIgetETFsWorldPerformanceRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetETFsWorldPerformance200Response result = apiInstance.getETFsWorldPerformance(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldPerformance");
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
| getETFsWorldPerformanceRequest | [**APIgetETFsWorldPerformanceRequest**](EtfsApi.md#APIgetETFsWorldPerformanceRequest)|-|-|

### Return type

[**GetETFsWorldPerformance200Response**](GetETFsWorldPerformance200Response.md)


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

## getETFsWorldPerformanceWithHttpInfo

> ApiResponse<GetETFsWorldPerformance200Response> getETFsWorldPerformance getETFsWorldPerformanceWithHttpInfo(getETFsWorldPerformanceRequest)

Performance

The ETFs performance endpoint provides comprehensive performance data for exchange-traded funds globally. It returns detailed metrics such as trailing returns and annual returns, enabling users to evaluate the historical performance of various ETFs. This endpoint is ideal for users looking to compare ETF performance over different time periods and assess their investment potential.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldPerformanceRequest request = APIgetETFsWorldPerformanceRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetETFsWorldPerformance200Response> response = apiInstance.getETFsWorldPerformanceWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldPerformance");
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
| getETFsWorldPerformanceRequest | [**APIgetETFsWorldPerformanceRequest**](EtfsApi.md#APIgetETFsWorldPerformanceRequest)|-|-|

### Return type

ApiResponse<[**GetETFsWorldPerformance200Response**](GetETFsWorldPerformance200Response.md)>


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


<a id="APIgetETFsWorldPerformanceRequest"></a>
## APIgetETFsWorldPerformanceRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of etf | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getETFsWorldRisk

> GetETFsWorldRisk200Response getETFsWorldRisk(getETFsWorldRiskRequest)

Risk

The ETFs risk endpoint provides essential risk metrics for global Exchange Traded Funds. It returns data such as volatility, beta, and other risk-related indicators, enabling users to assess the potential risk associated with investing in various ETFs worldwide.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldRiskRequest request = APIgetETFsWorldRiskRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetETFsWorldRisk200Response result = apiInstance.getETFsWorldRisk(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldRisk");
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
| getETFsWorldRiskRequest | [**APIgetETFsWorldRiskRequest**](EtfsApi.md#APIgetETFsWorldRiskRequest)|-|-|

### Return type

[**GetETFsWorldRisk200Response**](GetETFsWorldRisk200Response.md)


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

## getETFsWorldRiskWithHttpInfo

> ApiResponse<GetETFsWorldRisk200Response> getETFsWorldRisk getETFsWorldRiskWithHttpInfo(getETFsWorldRiskRequest)

Risk

The ETFs risk endpoint provides essential risk metrics for global Exchange Traded Funds. It returns data such as volatility, beta, and other risk-related indicators, enabling users to assess the potential risk associated with investing in various ETFs worldwide.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldRiskRequest request = APIgetETFsWorldRiskRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetETFsWorldRisk200Response> response = apiInstance.getETFsWorldRiskWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldRisk");
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
| getETFsWorldRiskRequest | [**APIgetETFsWorldRiskRequest**](EtfsApi.md#APIgetETFsWorldRiskRequest)|-|-|

### Return type

ApiResponse<[**GetETFsWorldRisk200Response**](GetETFsWorldRisk200Response.md)>


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


<a id="APIgetETFsWorldRiskRequest"></a>
## APIgetETFsWorldRiskRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of etf | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |



## getETFsWorldSummary

> GetETFsWorldSummary200Response getETFsWorldSummary(getETFsWorldSummaryRequest)

Summary

The ETFs summary endpoint provides a concise overview of global Exchange-Traded Funds. It returns key data points such as ETF names, symbols, and current market values, enabling users to quickly assess the performance and status of various international ETFs. This summary is ideal for users who need a snapshot of the global ETF landscape without delving into detailed analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldSummaryRequest request = APIgetETFsWorldSummaryRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            GetETFsWorldSummary200Response result = apiInstance.getETFsWorldSummary(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldSummary");
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
| getETFsWorldSummaryRequest | [**APIgetETFsWorldSummaryRequest**](EtfsApi.md#APIgetETFsWorldSummaryRequest)|-|-|

### Return type

[**GetETFsWorldSummary200Response**](GetETFsWorldSummary200Response.md)


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

## getETFsWorldSummaryWithHttpInfo

> ApiResponse<GetETFsWorldSummary200Response> getETFsWorldSummary getETFsWorldSummaryWithHttpInfo(getETFsWorldSummaryRequest)

Summary

The ETFs summary endpoint provides a concise overview of global Exchange-Traded Funds. It returns key data points such as ETF names, symbols, and current market values, enabling users to quickly assess the performance and status of various international ETFs. This summary is ideal for users who need a snapshot of the global ETF landscape without delving into detailed analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        EtfsApi apiInstance = new EtfsApi(defaultClient);
        String symbol = "IVV"; // String | Symbol ticker of etf
        String figi = "BBG000BVZ697"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US4642872000"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "464287200"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long dp = 5L; // Long | Number of decimal places for floating values. Accepts value in range [0,11]
        try {
            APIgetETFsWorldSummaryRequest request = APIgetETFsWorldSummaryRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .country(country)
                .dp(dp)
                .build();
            ApiResponse<GetETFsWorldSummary200Response> response = apiInstance.getETFsWorldSummaryWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EtfsApi#getETFsWorldSummary");
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
| getETFsWorldSummaryRequest | [**APIgetETFsWorldSummaryRequest**](EtfsApi.md#APIgetETFsWorldSummaryRequest)|-|-|

### Return type

ApiResponse<[**GetETFsWorldSummary200Response**](GetETFsWorldSummary200Response.md)>


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


<a id="APIgetETFsWorldSummaryRequest"></a>
## APIgetETFsWorldSummaryRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of etf | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **dp** | **Long** | Number of decimal places for floating values. Accepts value in range [0,11] | [optional] [default to 5] |


