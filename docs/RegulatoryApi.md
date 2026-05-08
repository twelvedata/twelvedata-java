# RegulatoryApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDirectHolders**](RegulatoryApi.md#getDirectHolders) | **GET** /direct_holders | Direct holders |
| [**getDirectHoldersWithHttpInfo**](RegulatoryApi.md#getDirectHoldersWithHttpInfo) | **GET** /direct_holders | Direct holders |
| [**getEdgarFilingsArchive**](RegulatoryApi.md#getEdgarFilingsArchive) | **GET** /edgar_filings/archive | EDGAR fillings |
| [**getEdgarFilingsArchiveWithHttpInfo**](RegulatoryApi.md#getEdgarFilingsArchiveWithHttpInfo) | **GET** /edgar_filings/archive | EDGAR fillings |
| [**getFundHolders**](RegulatoryApi.md#getFundHolders) | **GET** /fund_holders | Fund holders |
| [**getFundHoldersWithHttpInfo**](RegulatoryApi.md#getFundHoldersWithHttpInfo) | **GET** /fund_holders | Fund holders |
| [**getInsiderTransactions**](RegulatoryApi.md#getInsiderTransactions) | **GET** /insider_transactions | Insider transaction |
| [**getInsiderTransactionsWithHttpInfo**](RegulatoryApi.md#getInsiderTransactionsWithHttpInfo) | **GET** /insider_transactions | Insider transaction |
| [**getInstitutionalHolders**](RegulatoryApi.md#getInstitutionalHolders) | **GET** /institutional_holders | Institutional holders |
| [**getInstitutionalHoldersWithHttpInfo**](RegulatoryApi.md#getInstitutionalHoldersWithHttpInfo) | **GET** /institutional_holders | Institutional holders |
| [**getSourceSanctionedEntities**](RegulatoryApi.md#getSourceSanctionedEntities) | **GET** /sanctions/{source} | Sanctioned entities |
| [**getSourceSanctionedEntitiesWithHttpInfo**](RegulatoryApi.md#getSourceSanctionedEntitiesWithHttpInfo) | **GET** /sanctions/{source} | Sanctioned entities |
| [**getTaxInfo**](RegulatoryApi.md#getTaxInfo) | **GET** /tax_info | Tax information |
| [**getTaxInfoWithHttpInfo**](RegulatoryApi.md#getTaxInfoWithHttpInfo) | **GET** /tax_info | Tax information |



## getDirectHolders

> GetDirectHolders200Response getDirectHolders(getDirectHoldersRequest)

Direct holders

The direct holders endpoint provides detailed information about the number of shares directly held by individuals or entities as recorded in a company&#39;s official share registry. This data is essential for understanding the distribution of stock ownership within a company, helping users identify major shareholders and assess shareholder concentration.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "7203"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetDirectHoldersRequest request = APIgetDirectHoldersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetDirectHolders200Response result = apiInstance.getDirectHolders(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getDirectHolders");
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
| getDirectHoldersRequest | [**APIgetDirectHoldersRequest**](RegulatoryApi.md#APIgetDirectHoldersRequest)|-|-|

### Return type

[**GetDirectHolders200Response**](GetDirectHolders200Response.md)


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

## getDirectHoldersWithHttpInfo

> ApiResponse<GetDirectHolders200Response> getDirectHolders getDirectHoldersWithHttpInfo(getDirectHoldersRequest)

Direct holders

The direct holders endpoint provides detailed information about the number of shares directly held by individuals or entities as recorded in a company&#39;s official share registry. This data is essential for understanding the distribution of stock ownership within a company, helping users identify major shareholders and assess shareholder concentration.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "7203"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetDirectHoldersRequest request = APIgetDirectHoldersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetDirectHolders200Response> response = apiInstance.getDirectHoldersWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getDirectHolders");
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
| getDirectHoldersRequest | [**APIgetDirectHoldersRequest**](RegulatoryApi.md#APIgetDirectHoldersRequest)|-|-|

### Return type

ApiResponse<[**GetDirectHolders200Response**](GetDirectHolders200Response.md)>


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


<a id="APIgetDirectHoldersRequest"></a>
## APIgetDirectHoldersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getEdgarFilingsArchive

> GetEdgarFilingsArchive200Response getEdgarFilingsArchive(getEdgarFilingsArchiveRequest)

EDGAR fillings

The EDGAR fillings endpoint provides access to a comprehensive collection of financial documents submitted to the SEC, including real-time and historical forms, filings, and exhibits. Users can retrieve detailed information about company disclosures, financial statements, and regulatory submissions, enabling them to access essential compliance and financial data directly from the SEC&#39;s EDGAR system.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNGS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String formType = "8-K"; // String | Filter by form types, example `8-K`, `EX-1.1`
        String filledFrom = "2024-01-01"; // String | Filter by filled time from
        String filledTo = "2024-01-01"; // String | Filter by filled time to
        Long page = 1L; // Long | Page number
        Long pageSize = 10L; // Long | Number of records in response
        try {
            APIgetEdgarFilingsArchiveRequest request = APIgetEdgarFilingsArchiveRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .formType(formType)
                .filledFrom(filledFrom)
                .filledTo(filledTo)
                .page(page)
                .pageSize(pageSize)
                .build();
            GetEdgarFilingsArchive200Response result = apiInstance.getEdgarFilingsArchive(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getEdgarFilingsArchive");
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
| getEdgarFilingsArchiveRequest | [**APIgetEdgarFilingsArchiveRequest**](RegulatoryApi.md#APIgetEdgarFilingsArchiveRequest)|-|-|

### Return type

[**GetEdgarFilingsArchive200Response**](GetEdgarFilingsArchive200Response.md)


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

## getEdgarFilingsArchiveWithHttpInfo

> ApiResponse<GetEdgarFilingsArchive200Response> getEdgarFilingsArchive getEdgarFilingsArchiveWithHttpInfo(getEdgarFilingsArchiveRequest)

EDGAR fillings

The EDGAR fillings endpoint provides access to a comprehensive collection of financial documents submitted to the SEC, including real-time and historical forms, filings, and exhibits. Users can retrieve detailed information about company disclosures, financial statements, and regulatory submissions, enabling them to access essential compliance and financial data directly from the SEC&#39;s EDGAR system.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNGS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String formType = "8-K"; // String | Filter by form types, example `8-K`, `EX-1.1`
        String filledFrom = "2024-01-01"; // String | Filter by filled time from
        String filledTo = "2024-01-01"; // String | Filter by filled time to
        Long page = 1L; // Long | Page number
        Long pageSize = 10L; // Long | Number of records in response
        try {
            APIgetEdgarFilingsArchiveRequest request = APIgetEdgarFilingsArchiveRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .formType(formType)
                .filledFrom(filledFrom)
                .filledTo(filledTo)
                .page(page)
                .pageSize(pageSize)
                .build();
            ApiResponse<GetEdgarFilingsArchive200Response> response = apiInstance.getEdgarFilingsArchiveWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getEdgarFilingsArchive");
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
| getEdgarFilingsArchiveRequest | [**APIgetEdgarFilingsArchiveRequest**](RegulatoryApi.md#APIgetEdgarFilingsArchiveRequest)|-|-|

### Return type

ApiResponse<[**GetEdgarFilingsArchive200Response**](GetEdgarFilingsArchive200Response.md)>


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


<a id="APIgetEdgarFilingsArchiveRequest"></a>
## APIgetEdgarFilingsArchiveRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |
| **micCode** | **String** | Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **formType** | **String** | Filter by form types, example &#x60;8-K&#x60;, &#x60;EX-1.1&#x60; | [optional] |
| **filledFrom** | **String** | Filter by filled time from | [optional] |
| **filledTo** | **String** | Filter by filled time to | [optional] |
| **page** | **Long** | Page number | [optional] [default to 1] |
| **pageSize** | **Long** | Number of records in response | [optional] [default to 10] |



## getFundHolders

> GetFundHolders200Response getFundHolders(getFundHoldersRequest)

Fund holders

The fund holders endpoint provides detailed information about the proportion of a company&#39;s stock that is owned by mutual fund holders. It returns data on the number of shares held, the percentage of total shares outstanding, and the names of the mutual funds involved. This endpoint is useful for users looking to understand mutual fund investment in a specific company.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetFundHoldersRequest request = APIgetFundHoldersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetFundHolders200Response result = apiInstance.getFundHolders(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getFundHolders");
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
| getFundHoldersRequest | [**APIgetFundHoldersRequest**](RegulatoryApi.md#APIgetFundHoldersRequest)|-|-|

### Return type

[**GetFundHolders200Response**](GetFundHolders200Response.md)


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

## getFundHoldersWithHttpInfo

> ApiResponse<GetFundHolders200Response> getFundHolders getFundHoldersWithHttpInfo(getFundHoldersRequest)

Fund holders

The fund holders endpoint provides detailed information about the proportion of a company&#39;s stock that is owned by mutual fund holders. It returns data on the number of shares held, the percentage of total shares outstanding, and the names of the mutual funds involved. This endpoint is useful for users looking to understand mutual fund investment in a specific company.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetFundHoldersRequest request = APIgetFundHoldersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetFundHolders200Response> response = apiInstance.getFundHoldersWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getFundHolders");
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
| getFundHoldersRequest | [**APIgetFundHoldersRequest**](RegulatoryApi.md#APIgetFundHoldersRequest)|-|-|

### Return type

ApiResponse<[**GetFundHolders200Response**](GetFundHolders200Response.md)>


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


<a id="APIgetFundHoldersRequest"></a>
## APIgetFundHoldersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getInsiderTransactions

> GetInsiderTransactions200Response getInsiderTransactions(getInsiderTransactionsRequest)

Insider transaction

The insider transaction endpoint provides detailed data on trades executed by company insiders, such as executives and directors. It returns information including the insider&#39;s name, their role, the transaction type, the number of shares, the transaction date, and the price per share. This endpoint is useful for tracking insider activity and understanding potential insider sentiment towards a company&#39;s stock.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested, e.g., `AAPL`, `TSLA`. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded, e.g., `Nasdaq`, `NSE`
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., United States or US.
        try {
            APIgetInsiderTransactionsRequest request = APIgetInsiderTransactionsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetInsiderTransactions200Response result = apiInstance.getInsiderTransactions(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getInsiderTransactions");
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
| getInsiderTransactionsRequest | [**APIgetInsiderTransactionsRequest**](RegulatoryApi.md#APIgetInsiderTransactionsRequest)|-|-|

### Return type

[**GetInsiderTransactions200Response**](GetInsiderTransactions200Response.md)


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

## getInsiderTransactionsWithHttpInfo

> ApiResponse<GetInsiderTransactions200Response> getInsiderTransactions getInsiderTransactionsWithHttpInfo(getInsiderTransactionsRequest)

Insider transaction

The insider transaction endpoint provides detailed data on trades executed by company insiders, such as executives and directors. It returns information including the insider&#39;s name, their role, the transaction type, the number of shares, the transaction date, and the price per share. This endpoint is useful for tracking insider activity and understanding potential insider sentiment towards a company&#39;s stock.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested, e.g., `AAPL`, `TSLA`. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded, e.g., `Nasdaq`, `NSE`
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., United States or US.
        try {
            APIgetInsiderTransactionsRequest request = APIgetInsiderTransactionsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetInsiderTransactions200Response> response = apiInstance.getInsiderTransactionsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getInsiderTransactions");
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
| getInsiderTransactionsRequest | [**APIgetInsiderTransactionsRequest**](RegulatoryApi.md#APIgetInsiderTransactionsRequest)|-|-|

### Return type

ApiResponse<[**GetInsiderTransactions200Response**](GetInsiderTransactions200Response.md)>


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


<a id="APIgetInsiderTransactionsRequest"></a>
## APIgetInsiderTransactionsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;NSE&#x60; | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., United States or US. | [optional] |



## getInstitutionalHolders

> GetInstitutionalHolders200Response getInstitutionalHolders(getInstitutionalHoldersRequest)

Institutional holders

The institutional holders endpoint provides detailed information on the percentage and amount of a company&#39;s stock owned by institutional investors, such as pension funds, insurance companies, and investment firms. This data is essential for understanding the influence and involvement of large entities in a company&#39;s ownership structure.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetInstitutionalHoldersRequest request = APIgetInstitutionalHoldersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetInstitutionalHolders200Response result = apiInstance.getInstitutionalHolders(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getInstitutionalHolders");
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
| getInstitutionalHoldersRequest | [**APIgetInstitutionalHoldersRequest**](RegulatoryApi.md#APIgetInstitutionalHoldersRequest)|-|-|

### Return type

[**GetInstitutionalHolders200Response**](GetInstitutionalHolders200Response.md)


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

## getInstitutionalHoldersWithHttpInfo

> ApiResponse<GetInstitutionalHolders200Response> getInstitutionalHolders getInstitutionalHoldersWithHttpInfo(getInstitutionalHoldersRequest)

Institutional holders

The institutional holders endpoint provides detailed information on the percentage and amount of a company&#39;s stock owned by institutional investors, such as pension funds, insurance companies, and investment firms. This data is essential for understanding the influence and involvement of large entities in a company&#39;s ownership structure.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetInstitutionalHoldersRequest request = APIgetInstitutionalHoldersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetInstitutionalHolders200Response> response = apiInstance.getInstitutionalHoldersWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getInstitutionalHolders");
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
| getInstitutionalHoldersRequest | [**APIgetInstitutionalHoldersRequest**](RegulatoryApi.md#APIgetInstitutionalHoldersRequest)|-|-|

### Return type

ApiResponse<[**GetInstitutionalHolders200Response**](GetInstitutionalHolders200Response.md)>


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


<a id="APIgetInstitutionalHoldersRequest"></a>
## APIgetInstitutionalHoldersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getSourceSanctionedEntities

> GetSourceSanctionedEntities200Response getSourceSanctionedEntities(getSourceSanctionedEntitiesRequest)

Sanctioned entities

The sanctions entities endpoint provides a comprehensive list of entities sanctioned by a specified authority, such as OFAC, UK, EU, or AU. Users can retrieve detailed information about individuals, organizations, and other entities subject to sanctions from the chosen source, facilitating compliance and risk management processes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        SourceEnum source = SourceEnum.fromValue("ofac"); // SourceEnum | Sanctions source
        try {
            APIgetSourceSanctionedEntitiesRequest request = APIgetSourceSanctionedEntitiesRequest.newBuilder()
                .source(source)
                .build();
            GetSourceSanctionedEntities200Response result = apiInstance.getSourceSanctionedEntities(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getSourceSanctionedEntities");
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
| getSourceSanctionedEntitiesRequest | [**APIgetSourceSanctionedEntitiesRequest**](RegulatoryApi.md#APIgetSourceSanctionedEntitiesRequest)|-|-|

### Return type

[**GetSourceSanctionedEntities200Response**](GetSourceSanctionedEntities200Response.md)


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

## getSourceSanctionedEntitiesWithHttpInfo

> ApiResponse<GetSourceSanctionedEntities200Response> getSourceSanctionedEntities getSourceSanctionedEntitiesWithHttpInfo(getSourceSanctionedEntitiesRequest)

Sanctioned entities

The sanctions entities endpoint provides a comprehensive list of entities sanctioned by a specified authority, such as OFAC, UK, EU, or AU. Users can retrieve detailed information about individuals, organizations, and other entities subject to sanctions from the chosen source, facilitating compliance and risk management processes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        SourceEnum source = SourceEnum.fromValue("ofac"); // SourceEnum | Sanctions source
        try {
            APIgetSourceSanctionedEntitiesRequest request = APIgetSourceSanctionedEntitiesRequest.newBuilder()
                .source(source)
                .build();
            ApiResponse<GetSourceSanctionedEntities200Response> response = apiInstance.getSourceSanctionedEntitiesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getSourceSanctionedEntities");
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
| getSourceSanctionedEntitiesRequest | [**APIgetSourceSanctionedEntitiesRequest**](RegulatoryApi.md#APIgetSourceSanctionedEntitiesRequest)|-|-|

### Return type

ApiResponse<[**GetSourceSanctionedEntities200Response**](GetSourceSanctionedEntities200Response.md)>


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


<a id="APIgetSourceSanctionedEntitiesRequest"></a>
## APIgetSourceSanctionedEntitiesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **source** | [**SourceEnum**](.md) | Sanctions source | [enum: ofac, uk, eu, au] |



## getTaxInfo

> GetTaxInfo200Response getTaxInfo(getTaxInfoRequest)

Tax information

The tax information endpoint provides detailed tax-related data for a specified financial instrument, including applicable tax rates and relevant tax codes. This information is essential for users needing to understand the tax implications associated with trading or investing in specific instruments.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "SKYQ"; // String | The ticker symbol of an instrument for which data is requested, e.g., `SKYQ`, `AIRE`, `ALM:BME`, `HSI:HKEX`.
        String isin = "US5949181045"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String figi = "BBG019XJT9D6"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "Nasdaq"; // String | The exchange name where the instrument is traded, e.g., `Nasdaq`, `Euronext`
        String micCode = "XNAS"; // String | The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., `XNAS`, `XLON`
        try {
            APIgetTaxInfoRequest request = APIgetTaxInfoRequest.newBuilder()
                .symbol(symbol)
                .isin(isin)
                .figi(figi)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .build();
            GetTaxInfo200Response result = apiInstance.getTaxInfo(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getTaxInfo");
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
| getTaxInfoRequest | [**APIgetTaxInfoRequest**](RegulatoryApi.md#APIgetTaxInfoRequest)|-|-|

### Return type

[**GetTaxInfo200Response**](GetTaxInfo200Response.md)


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

## getTaxInfoWithHttpInfo

> ApiResponse<GetTaxInfo200Response> getTaxInfo getTaxInfoWithHttpInfo(getTaxInfoRequest)

Tax information

The tax information endpoint provides detailed tax-related data for a specified financial instrument, including applicable tax rates and relevant tax codes. This information is essential for users needing to understand the tax implications associated with trading or investing in specific instruments.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        RegulatoryApi apiInstance = new RegulatoryApi(defaultClient);
        String symbol = "SKYQ"; // String | The ticker symbol of an instrument for which data is requested, e.g., `SKYQ`, `AIRE`, `ALM:BME`, `HSI:HKEX`.
        String isin = "US5949181045"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String figi = "BBG019XJT9D6"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "Nasdaq"; // String | The exchange name where the instrument is traded, e.g., `Nasdaq`, `Euronext`
        String micCode = "XNAS"; // String | The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., `XNAS`, `XLON`
        try {
            APIgetTaxInfoRequest request = APIgetTaxInfoRequest.newBuilder()
                .symbol(symbol)
                .isin(isin)
                .figi(figi)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .build();
            ApiResponse<GetTaxInfo200Response> response = apiInstance.getTaxInfoWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryApi#getTaxInfo");
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
| getTaxInfoRequest | [**APIgetTaxInfoRequest**](RegulatoryApi.md#APIgetTaxInfoRequest)|-|-|

### Return type

ApiResponse<[**GetTaxInfo200Response**](GetTaxInfo200Response.md)>


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


<a id="APIgetTaxInfoRequest"></a>
## APIgetTaxInfoRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | The ticker symbol of an instrument for which data is requested, e.g., &#x60;SKYQ&#x60;, &#x60;AIRE&#x60;, &#x60;ALM:BME&#x60;, &#x60;HSI:HKEX&#x60;. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **figi** | **String** | The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | The exchange name where the instrument is traded, e.g., &#x60;Nasdaq&#x60;, &#x60;Euronext&#x60; | [optional] |
| **micCode** | **String** | The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; | [optional] |


