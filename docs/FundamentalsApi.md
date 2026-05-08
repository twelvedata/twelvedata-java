# FundamentalsApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalanceSheet**](FundamentalsApi.md#getBalanceSheet) | **GET** /balance_sheet | Balance sheet |
| [**getBalanceSheetWithHttpInfo**](FundamentalsApi.md#getBalanceSheetWithHttpInfo) | **GET** /balance_sheet | Balance sheet |
| [**getBalanceSheetConsolidated**](FundamentalsApi.md#getBalanceSheetConsolidated) | **GET** /balance_sheet/consolidated | Balance sheet consolidated |
| [**getBalanceSheetConsolidatedWithHttpInfo**](FundamentalsApi.md#getBalanceSheetConsolidatedWithHttpInfo) | **GET** /balance_sheet/consolidated | Balance sheet consolidated |
| [**getCashFlow**](FundamentalsApi.md#getCashFlow) | **GET** /cash_flow | Cash flow |
| [**getCashFlowWithHttpInfo**](FundamentalsApi.md#getCashFlowWithHttpInfo) | **GET** /cash_flow | Cash flow |
| [**getCashFlowConsolidated**](FundamentalsApi.md#getCashFlowConsolidated) | **GET** /cash_flow/consolidated | Cash flow consolidated |
| [**getCashFlowConsolidatedWithHttpInfo**](FundamentalsApi.md#getCashFlowConsolidatedWithHttpInfo) | **GET** /cash_flow/consolidated | Cash flow consolidated |
| [**getDividends**](FundamentalsApi.md#getDividends) | **GET** /dividends | Dividends |
| [**getDividendsWithHttpInfo**](FundamentalsApi.md#getDividendsWithHttpInfo) | **GET** /dividends | Dividends |
| [**getDividendsCalendar**](FundamentalsApi.md#getDividendsCalendar) | **GET** /dividends_calendar | Dividends calendar |
| [**getDividendsCalendarWithHttpInfo**](FundamentalsApi.md#getDividendsCalendarWithHttpInfo) | **GET** /dividends_calendar | Dividends calendar |
| [**getEarnings**](FundamentalsApi.md#getEarnings) | **GET** /earnings | Earnings |
| [**getEarningsWithHttpInfo**](FundamentalsApi.md#getEarningsWithHttpInfo) | **GET** /earnings | Earnings |
| [**getEarningsCalendar**](FundamentalsApi.md#getEarningsCalendar) | **GET** /earnings_calendar | Earnings calendar |
| [**getEarningsCalendarWithHttpInfo**](FundamentalsApi.md#getEarningsCalendarWithHttpInfo) | **GET** /earnings_calendar | Earnings calendar |
| [**getIncomeStatement**](FundamentalsApi.md#getIncomeStatement) | **GET** /income_statement | Income statement |
| [**getIncomeStatementWithHttpInfo**](FundamentalsApi.md#getIncomeStatementWithHttpInfo) | **GET** /income_statement | Income statement |
| [**getIncomeStatementConsolidated**](FundamentalsApi.md#getIncomeStatementConsolidated) | **GET** /income_statement/consolidated | Income statement consolidated |
| [**getIncomeStatementConsolidatedWithHttpInfo**](FundamentalsApi.md#getIncomeStatementConsolidatedWithHttpInfo) | **GET** /income_statement/consolidated | Income statement consolidated |
| [**getIpoCalendar**](FundamentalsApi.md#getIpoCalendar) | **GET** /ipo_calendar | IPO calendar |
| [**getIpoCalendarWithHttpInfo**](FundamentalsApi.md#getIpoCalendarWithHttpInfo) | **GET** /ipo_calendar | IPO calendar |
| [**getKeyExecutives**](FundamentalsApi.md#getKeyExecutives) | **GET** /key_executives | Key executives |
| [**getKeyExecutivesWithHttpInfo**](FundamentalsApi.md#getKeyExecutivesWithHttpInfo) | **GET** /key_executives | Key executives |
| [**getLastChanges**](FundamentalsApi.md#getLastChanges) | **GET** /last_change/{endpoint} | Last changes |
| [**getLastChangesWithHttpInfo**](FundamentalsApi.md#getLastChangesWithHttpInfo) | **GET** /last_change/{endpoint} | Last changes |
| [**getLogo**](FundamentalsApi.md#getLogo) | **GET** /logo | Logo |
| [**getLogoWithHttpInfo**](FundamentalsApi.md#getLogoWithHttpInfo) | **GET** /logo | Logo |
| [**getMarketCap**](FundamentalsApi.md#getMarketCap) | **GET** /market_cap | Market capitalization |
| [**getMarketCapWithHttpInfo**](FundamentalsApi.md#getMarketCapWithHttpInfo) | **GET** /market_cap | Market capitalization |
| [**getProfile**](FundamentalsApi.md#getProfile) | **GET** /profile | Profile |
| [**getProfileWithHttpInfo**](FundamentalsApi.md#getProfileWithHttpInfo) | **GET** /profile | Profile |
| [**getSplits**](FundamentalsApi.md#getSplits) | **GET** /splits | Splits |
| [**getSplitsWithHttpInfo**](FundamentalsApi.md#getSplitsWithHttpInfo) | **GET** /splits | Splits |
| [**getSplitsCalendar**](FundamentalsApi.md#getSplitsCalendar) | **GET** /splits_calendar | Splits calendar |
| [**getSplitsCalendarWithHttpInfo**](FundamentalsApi.md#getSplitsCalendarWithHttpInfo) | **GET** /splits_calendar | Splits calendar |
| [**getStatistics**](FundamentalsApi.md#getStatistics) | **GET** /statistics | Statistics |
| [**getStatisticsWithHttpInfo**](FundamentalsApi.md#getStatisticsWithHttpInfo) | **GET** /statistics | Statistics |
| [**pressReleasesListParameters**](FundamentalsApi.md#pressReleasesListParameters) | **GET** /press_releases | Press releases |
| [**pressReleasesListParametersWithHttpInfo**](FundamentalsApi.md#pressReleasesListParametersWithHttpInfo) | **GET** /press_releases | Press releases |



## getBalanceSheet

> GetBalanceSheet200Response getBalanceSheet(getBalanceSheetRequest)

Balance sheet

The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the balane sheet data
        String startDate = "2024-01-01"; // String | Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "2024-05-01"; // String | End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetBalanceSheetRequest request = APIgetBalanceSheetRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            GetBalanceSheet200Response result = apiInstance.getBalanceSheet(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getBalanceSheet");
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
| getBalanceSheetRequest | [**APIgetBalanceSheetRequest**](FundamentalsApi.md#APIgetBalanceSheetRequest)|-|-|

### Return type

[**GetBalanceSheet200Response**](GetBalanceSheet200Response.md)


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

## getBalanceSheetWithHttpInfo

> ApiResponse<GetBalanceSheet200Response> getBalanceSheet getBalanceSheetWithHttpInfo(getBalanceSheetRequest)

Balance sheet

The balance sheet endpoint provides a detailed financial statement for a company, outlining its assets, liabilities, and shareholders&#39; equity. This endpoint returns structured data that includes current and non-current assets, total liabilities, and equity figures, enabling users to assess a company&#39;s financial health and stability.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the balane sheet data
        String startDate = "2024-01-01"; // String | Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "2024-05-01"; // String | End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetBalanceSheetRequest request = APIgetBalanceSheetRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetBalanceSheet200Response> response = apiInstance.getBalanceSheetWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getBalanceSheet");
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
| getBalanceSheetRequest | [**APIgetBalanceSheetRequest**](FundamentalsApi.md#APIgetBalanceSheetRequest)|-|-|

### Return type

ApiResponse<[**GetBalanceSheet200Response**](GetBalanceSheet200Response.md)>


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


<a id="APIgetBalanceSheetRequest"></a>
## APIgetBalanceSheetRequest
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
| **period** | [**PeriodEnum**](.md) | The reporting period for the balane sheet data | [optional] [default to annual] [enum: annual, quarterly] |
| **startDate** | **String** | Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 6] |



## getBalanceSheetConsolidated

> GetBalanceSheetConsolidated200Response getBalanceSheetConsolidated(getBalanceSheetConsolidatedRequest)

Balance sheet consolidated

The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the balance sheet data.
        String startDate = "startDate_example"; // String | Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "endDate_example"; // String | End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetBalanceSheetConsolidatedRequest request = APIgetBalanceSheetConsolidatedRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            GetBalanceSheetConsolidated200Response result = apiInstance.getBalanceSheetConsolidated(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getBalanceSheetConsolidated");
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
| getBalanceSheetConsolidatedRequest | [**APIgetBalanceSheetConsolidatedRequest**](FundamentalsApi.md#APIgetBalanceSheetConsolidatedRequest)|-|-|

### Return type

[**GetBalanceSheetConsolidated200Response**](GetBalanceSheetConsolidated200Response.md)


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

## getBalanceSheetConsolidatedWithHttpInfo

> ApiResponse<GetBalanceSheetConsolidated200Response> getBalanceSheetConsolidated getBalanceSheetConsolidatedWithHttpInfo(getBalanceSheetConsolidatedRequest)

Balance sheet consolidated

The balance sheet consolidated endpoint provides a detailed overview of a company&#39;s raw balance sheet, including a comprehensive summary of its assets, liabilities, and shareholders&#39; equity. This endpoint is useful for retrieving financial data that reflects the overall financial position of a company, allowing users to access critical information about its financial health and structure.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the balance sheet data.
        String startDate = "startDate_example"; // String | Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "endDate_example"; // String | End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetBalanceSheetConsolidatedRequest request = APIgetBalanceSheetConsolidatedRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetBalanceSheetConsolidated200Response> response = apiInstance.getBalanceSheetConsolidatedWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getBalanceSheetConsolidated");
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
| getBalanceSheetConsolidatedRequest | [**APIgetBalanceSheetConsolidatedRequest**](FundamentalsApi.md#APIgetBalanceSheetConsolidatedRequest)|-|-|

### Return type

ApiResponse<[**GetBalanceSheetConsolidated200Response**](GetBalanceSheetConsolidated200Response.md)>


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


<a id="APIgetBalanceSheetConsolidatedRequest"></a>
## APIgetBalanceSheetConsolidatedRequest
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
| **period** | [**PeriodEnum**](.md) | The reporting period for the balance sheet data. | [optional] [default to annual] [enum: annual, quarterly] |
| **startDate** | **String** | Begin date for filtering items by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for filtering items by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 6] |



## getCashFlow

> GetCashFlow200Response getCashFlow(getCashFlowRequest)

Cash flow

The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the cash flow statements
        String startDate = "2024-01-01"; // String | Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetCashFlowRequest request = APIgetCashFlowRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            GetCashFlow200Response result = apiInstance.getCashFlow(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCashFlow");
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
| getCashFlowRequest | [**APIgetCashFlowRequest**](FundamentalsApi.md#APIgetCashFlowRequest)|-|-|

### Return type

[**GetCashFlow200Response**](GetCashFlow200Response.md)


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

## getCashFlowWithHttpInfo

> ApiResponse<GetCashFlow200Response> getCashFlow getCashFlowWithHttpInfo(getCashFlowRequest)

Cash flow

The cash flow endpoint provides detailed information on a company&#39;s cash flow activities, including the net cash and cash equivalents moving in and out of the business. This data includes operating, investing, and financing cash flows, offering a comprehensive view of the company&#39;s liquidity and financial health.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the cash flow statements
        String startDate = "2024-01-01"; // String | Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetCashFlowRequest request = APIgetCashFlowRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetCashFlow200Response> response = apiInstance.getCashFlowWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCashFlow");
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
| getCashFlowRequest | [**APIgetCashFlowRequest**](FundamentalsApi.md#APIgetCashFlowRequest)|-|-|

### Return type

ApiResponse<[**GetCashFlow200Response**](GetCashFlow200Response.md)>


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


<a id="APIgetCashFlowRequest"></a>
## APIgetCashFlowRequest
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
| **period** | [**PeriodEnum**](.md) | The reporting period for the cash flow statements | [optional] [default to annual] [enum: annual, quarterly] |
| **startDate** | **String** | Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 6] |



## getCashFlowConsolidated

> GetCashFlowConsolidated200Response getCashFlowConsolidated(getCashFlowConsolidatedRequest)

Cash flow consolidated

The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the cash flow statements
        String startDate = "2024-01-01"; // String | Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetCashFlowConsolidatedRequest request = APIgetCashFlowConsolidatedRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            GetCashFlowConsolidated200Response result = apiInstance.getCashFlowConsolidated(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCashFlowConsolidated");
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
| getCashFlowConsolidatedRequest | [**APIgetCashFlowConsolidatedRequest**](FundamentalsApi.md#APIgetCashFlowConsolidatedRequest)|-|-|

### Return type

[**GetCashFlowConsolidated200Response**](GetCashFlowConsolidated200Response.md)


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

## getCashFlowConsolidatedWithHttpInfo

> ApiResponse<GetCashFlowConsolidated200Response> getCashFlowConsolidated getCashFlowConsolidatedWithHttpInfo(getCashFlowConsolidatedRequest)

Cash flow consolidated

The cash flow consolidated endpoint provides raw data on a company&#39;s consolidated cash flow, including the net cash and cash equivalents moving in and out of the business. It returns information on operating, investing, and financing activities, helping users track liquidity and financial health over a specified period.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the cash flow statements
        String startDate = "2024-01-01"; // String | Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetCashFlowConsolidatedRequest request = APIgetCashFlowConsolidatedRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetCashFlowConsolidated200Response> response = apiInstance.getCashFlowConsolidatedWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCashFlowConsolidated");
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
| getCashFlowConsolidatedRequest | [**APIgetCashFlowConsolidatedRequest**](FundamentalsApi.md#APIgetCashFlowConsolidatedRequest)|-|-|

### Return type

ApiResponse<[**GetCashFlowConsolidated200Response**](GetCashFlowConsolidated200Response.md)>


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


<a id="APIgetCashFlowConsolidatedRequest"></a>
## APIgetCashFlowConsolidatedRequest
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
| **period** | [**PeriodEnum**](.md) | The reporting period for the cash flow statements | [optional] [default to annual] [enum: annual, quarterly] |
| **startDate** | **String** | Start date for filtering cash flow statements. Only cash flow statements with fiscal dates on or after this date will be included. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for filtering cash flow statements. Only cash flow statements with fiscal dates on or before this date will be included. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 6] |



## getDividends

> GetDividends200Response getDividends(getDividendsRequest)

Dividends

The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "US"; // String | Country where instrument is traded, e.g., `United States` or `US`
        RangeEnum range = RangeEnum.fromValue("last"); // RangeEnum | Specifies the time range for which to retrieve dividend data. Accepts values such as `last` (most recent dividend), `next` (upcoming dividend), `1m` - `5y` for respective periods, or `full` for all available data. If provided together with `start_date` and/or `end_date`, this parameter takes precedence.
        String startDate = "2024-01-01"; // String | Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format `2006-01-02`. If provided together with `range` parameter, `range` will take precedence.
        String endDate = "2024-12-31"; // String | End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format `2006-01-02`. If provided together with `range` parameter, `range` will take precedence.
        Boolean adjust = true; // Boolean | Specifies if there should be an adjustment
        try {
            APIgetDividendsRequest request = APIgetDividendsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .range(range)
                .startDate(startDate)
                .endDate(endDate)
                .adjust(adjust)
                .build();
            GetDividends200Response result = apiInstance.getDividends(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getDividends");
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
| getDividendsRequest | [**APIgetDividendsRequest**](FundamentalsApi.md#APIgetDividendsRequest)|-|-|

### Return type

[**GetDividends200Response**](GetDividends200Response.md)


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

## getDividendsWithHttpInfo

> ApiResponse<GetDividends200Response> getDividends getDividendsWithHttpInfo(getDividendsRequest)

Dividends

The dividends endpoint provides historical dividend data for a specified stock, in many cases covering over a decade. It returns information on dividend payouts, including the ex-date, amount, and frequency. This endpoint is ideal for users tracking dividend histories or evaluating the income potential of stocks.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "US"; // String | Country where instrument is traded, e.g., `United States` or `US`
        RangeEnum range = RangeEnum.fromValue("last"); // RangeEnum | Specifies the time range for which to retrieve dividend data. Accepts values such as `last` (most recent dividend), `next` (upcoming dividend), `1m` - `5y` for respective periods, or `full` for all available data. If provided together with `start_date` and/or `end_date`, this parameter takes precedence.
        String startDate = "2024-01-01"; // String | Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format `2006-01-02`. If provided together with `range` parameter, `range` will take precedence.
        String endDate = "2024-12-31"; // String | End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format `2006-01-02`. If provided together with `range` parameter, `range` will take precedence.
        Boolean adjust = true; // Boolean | Specifies if there should be an adjustment
        try {
            APIgetDividendsRequest request = APIgetDividendsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .range(range)
                .startDate(startDate)
                .endDate(endDate)
                .adjust(adjust)
                .build();
            ApiResponse<GetDividends200Response> response = apiInstance.getDividendsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getDividends");
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
| getDividendsRequest | [**APIgetDividendsRequest**](FundamentalsApi.md#APIgetDividendsRequest)|-|-|

### Return type

ApiResponse<[**GetDividends200Response**](GetDividends200Response.md)>


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


<a id="APIgetDividendsRequest"></a>
## APIgetDividendsRequest
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
| **range** | [**RangeEnum**](.md) | Specifies the time range for which to retrieve dividend data. Accepts values such as &#x60;last&#x60; (most recent dividend), &#x60;next&#x60; (upcoming dividend), &#x60;1m&#x60; - &#x60;5y&#x60; for respective periods, or &#x60;full&#x60; for all available data. If provided together with &#x60;start_date&#x60; and/or &#x60;end_date&#x60;, this parameter takes precedence. | [optional] [default to last] [enum: last, next, 1m, 3m, 6m, ytd, 1y, 2y, 5y, full] |
| **startDate** | **String** | Start date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. | [optional] |
| **endDate** | **String** | End date for the dividend data query. Only dividends with dates on or after this date will be returned. Format &#x60;2006-01-02&#x60;. If provided together with &#x60;range&#x60; parameter, &#x60;range&#x60; will take precedence. | [optional] |
| **adjust** | **Boolean** | Specifies if there should be an adjustment | [optional] [default to true] |



## getDividendsCalendar

> List<DividendsCalendarItem> getDividendsCalendar(getDividendsCalendarRequest)

Dividends calendar

The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "US"; // String | Country where instrument is traded, e.g., `United States` or `US`
        String startDate = "2024-01-01"; // String | Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format `2006-01-02`
        Long outputsize = 100L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `500`. Default `100` when no date parameters are set, otherwise set to maximum
        Long page = 1L; // Long | Page number
        try {
            APIgetDividendsCalendarRequest request = APIgetDividendsCalendarRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .page(page)
                .build();
            List<DividendsCalendarItem> result = apiInstance.getDividendsCalendar(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getDividendsCalendar");
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
| getDividendsCalendarRequest | [**APIgetDividendsCalendarRequest**](FundamentalsApi.md#APIgetDividendsCalendarRequest)|-|-|

### Return type

[**List&lt;DividendsCalendarItem&gt;**](DividendsCalendarItem.md)


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

## getDividendsCalendarWithHttpInfo

> ApiResponse<List<DividendsCalendarItem>> getDividendsCalendar getDividendsCalendarWithHttpInfo(getDividendsCalendarRequest)

Dividends calendar

The dividends calendar endpoint provides a detailed schedule of upcoming and past dividend events for specified date ranges. By using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of companies issuing dividends, including the ex-dividend date and dividend amount. This endpoint is ideal for tracking dividend payouts and planning investment strategies based on dividend schedules.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "US"; // String | Country where instrument is traded, e.g., `United States` or `US`
        String startDate = "2024-01-01"; // String | Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format `2006-01-02`
        Long outputsize = 100L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `500`. Default `100` when no date parameters are set, otherwise set to maximum
        Long page = 1L; // Long | Page number
        try {
            APIgetDividendsCalendarRequest request = APIgetDividendsCalendarRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .page(page)
                .build();
            ApiResponse<List<DividendsCalendarItem>> response = apiInstance.getDividendsCalendarWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getDividendsCalendar");
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
| getDividendsCalendarRequest | [**APIgetDividendsCalendarRequest**](FundamentalsApi.md#APIgetDividendsCalendarRequest)|-|-|

### Return type

ApiResponse<[**List&lt;DividendsCalendarItem&gt;**](DividendsCalendarItem.md)>


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


<a id="APIgetDividendsCalendarRequest"></a>
## APIgetDividendsCalendarRequest
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
| **startDate** | **String** | Start date for the dividends calendar query. Only dividends with ex-dates on or after this date will be returned. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for the dividends calendar query. Only dividends with ex-dates on or before this date will be returned. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum | [optional] [default to 100] |
| **page** | **Long** | Page number | [optional] [default to 1] |



## getEarnings

> GetEarnings200Response getEarnings(getEarningsRequest)

Earnings

The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        PeriodEarningsEnum period = PeriodEarningsEnum.fromValue("latest"); // PeriodEarningsEnum | Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored
        Long outputsize = 10L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `1000`. Default `10` when no date parameters are set, otherwise set to maximum
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        String startDate = "2024-04-01"; // String | The date from which the data is requested. The date format is `YYYY-MM-DD`.
        String endDate = "2024-04-30"; // String | The date to which the data is requested. The date format is `YYYY-MM-DD`.
        Long dp = 2L; // Long | The number of decimal places in the response data. Should be in range [0,11] inclusive
        try {
            APIgetEarningsRequest request = APIgetEarningsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .period(period)
                .outputsize(outputsize)
                .format(format)
                .delimiter(delimiter)
                .startDate(startDate)
                .endDate(endDate)
                .dp(dp)
                .build();
            GetEarnings200Response result = apiInstance.getEarnings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getEarnings");
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
| getEarningsRequest | [**APIgetEarningsRequest**](FundamentalsApi.md#APIgetEarningsRequest)|-|-|

### Return type

[**GetEarnings200Response**](GetEarnings200Response.md)


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

## getEarningsWithHttpInfo

> ApiResponse<GetEarnings200Response> getEarnings getEarningsWithHttpInfo(getEarningsRequest)

Earnings

The earnings endpoint provides comprehensive earnings data for a specified company, including both the estimated and actual Earnings Per Share (EPS) figures. This endpoint delivers historical earnings information, allowing users to track a company&#39;s financial performance over time.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        PeriodEarningsEnum period = PeriodEarningsEnum.fromValue("latest"); // PeriodEarningsEnum | Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored
        Long outputsize = 10L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `1000`. Default `10` when no date parameters are set, otherwise set to maximum
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        String startDate = "2024-04-01"; // String | The date from which the data is requested. The date format is `YYYY-MM-DD`.
        String endDate = "2024-04-30"; // String | The date to which the data is requested. The date format is `YYYY-MM-DD`.
        Long dp = 2L; // Long | The number of decimal places in the response data. Should be in range [0,11] inclusive
        try {
            APIgetEarningsRequest request = APIgetEarningsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .period(period)
                .outputsize(outputsize)
                .format(format)
                .delimiter(delimiter)
                .startDate(startDate)
                .endDate(endDate)
                .dp(dp)
                .build();
            ApiResponse<GetEarnings200Response> response = apiInstance.getEarningsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getEarnings");
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
| getEarningsRequest | [**APIgetEarningsRequest**](FundamentalsApi.md#APIgetEarningsRequest)|-|-|

### Return type

ApiResponse<[**GetEarnings200Response**](GetEarnings200Response.md)>


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


<a id="APIgetEarningsRequest"></a>
## APIgetEarningsRequest
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
| **type** | [**TypeEnum**](.md) | The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **period** | [**PeriodEarningsEnum**](.md) | Type of earning, returns only 1 record. When is not empty, dates and outputsize parameters are ignored | [optional] [enum: latest, next] |
| **outputsize** | **Long** | Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;1000&#x60;. Default &#x60;10&#x60; when no date parameters are set, otherwise set to maximum | [optional] [default to 10] |
| **format** | [**FormatEnum**](.md) | The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | The separator used in the CSV response data | [optional] [default to ;] |
| **startDate** | **String** | The date from which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. | [optional] |
| **endDate** | **String** | The date to which the data is requested. The date format is &#x60;YYYY-MM-DD&#x60;. | [optional] |
| **dp** | **Long** | The number of decimal places in the response data. Should be in range [0,11] inclusive | [optional] [default to 2] |



## getEarningsCalendar

> GetEarningsCalendar200Response getEarningsCalendar(getEarningsCalendarRequest)

Earnings calendar

The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be JSON or CSV
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        String startDate = "2024-04-01"; // String | Can be used separately and together with end_date. Format `2006-01-02` or `2006-01-02T15:04:05`
        String endDate = "2024-04-30"; // String | Can be used separately and together with start_date. Format `2006-01-02` or `2006-01-02T15:04:05`
        Long dp = 2L; // Long | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetEarningsCalendarRequest request = APIgetEarningsCalendarRequest.newBuilder()
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .format(format)
                .delimiter(delimiter)
                .startDate(startDate)
                .endDate(endDate)
                .dp(dp)
                .build();
            GetEarningsCalendar200Response result = apiInstance.getEarningsCalendar(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getEarningsCalendar");
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
| getEarningsCalendarRequest | [**APIgetEarningsCalendarRequest**](FundamentalsApi.md#APIgetEarningsCalendarRequest)|-|-|

### Return type

[**GetEarningsCalendar200Response**](GetEarningsCalendar200Response.md)


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

## getEarningsCalendarWithHttpInfo

> ApiResponse<GetEarningsCalendar200Response> getEarningsCalendar getEarningsCalendarWithHttpInfo(getEarningsCalendarRequest)

Earnings calendar

The earnings calendar endpoint provides a schedule of company earnings announcements for a specified date range. By default, it returns earnings data for the current day. Users can customize the date range using the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to retrieve earnings information for specific periods. This endpoint is useful for tracking upcoming earnings reports and planning around key financial announcements.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be JSON or CSV
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        String startDate = "2024-04-01"; // String | Can be used separately and together with end_date. Format `2006-01-02` or `2006-01-02T15:04:05`
        String endDate = "2024-04-30"; // String | Can be used separately and together with start_date. Format `2006-01-02` or `2006-01-02T15:04:05`
        Long dp = 2L; // Long | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetEarningsCalendarRequest request = APIgetEarningsCalendarRequest.newBuilder()
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .format(format)
                .delimiter(delimiter)
                .startDate(startDate)
                .endDate(endDate)
                .dp(dp)
                .build();
            ApiResponse<GetEarningsCalendar200Response> response = apiInstance.getEarningsCalendarWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getEarningsCalendar");
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
| getEarningsCalendarRequest | [**APIgetEarningsCalendarRequest**](FundamentalsApi.md#APIgetEarningsCalendarRequest)|-|-|

### Return type

ApiResponse<[**GetEarningsCalendar200Response**](GetEarningsCalendar200Response.md)>


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


<a id="APIgetEarningsCalendarRequest"></a>
## APIgetEarningsCalendarRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md) | Value can be JSON or CSV | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | Specify the delimiter used when downloading the CSV file | [optional] [default to ;] |
| **startDate** | **String** | Can be used separately and together with end_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; | [optional] |
| **endDate** | **String** | Can be used separately and together with start_date. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60; | [optional] |
| **dp** | **Long** | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive | [optional] [default to 2] |



## getIncomeStatement

> GetIncomeStatement200Response getIncomeStatement(getIncomeStatementRequest)

Income statement

The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the income statement data
        String startDate = "2024-01-01"; // String | Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetIncomeStatementRequest request = APIgetIncomeStatementRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            GetIncomeStatement200Response result = apiInstance.getIncomeStatement(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIncomeStatement");
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
| getIncomeStatementRequest | [**APIgetIncomeStatementRequest**](FundamentalsApi.md#APIgetIncomeStatementRequest)|-|-|

### Return type

[**GetIncomeStatement200Response**](GetIncomeStatement200Response.md)


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

## getIncomeStatementWithHttpInfo

> ApiResponse<GetIncomeStatement200Response> getIncomeStatement getIncomeStatementWithHttpInfo(getIncomeStatementRequest)

Income statement

The income statement endpoint provides detailed financial data on a company&#39;s income statement, including revenues, expenses, and net income for specified periods, either annually or quarterly. This endpoint is essential for retrieving comprehensive financial performance metrics of a company, allowing users to access historical and current financial results.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the income statement data
        String startDate = "2024-01-01"; // String | Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetIncomeStatementRequest request = APIgetIncomeStatementRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetIncomeStatement200Response> response = apiInstance.getIncomeStatementWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIncomeStatement");
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
| getIncomeStatementRequest | [**APIgetIncomeStatementRequest**](FundamentalsApi.md#APIgetIncomeStatementRequest)|-|-|

### Return type

ApiResponse<[**GetIncomeStatement200Response**](GetIncomeStatement200Response.md)>


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


<a id="APIgetIncomeStatementRequest"></a>
## APIgetIncomeStatementRequest
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
| **period** | [**PeriodEnum**](.md) | The reporting period for the income statement data | [optional] [default to annual] [enum: annual, quarterly] |
| **startDate** | **String** | Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 6] |



## getIncomeStatementConsolidated

> GetIncomeStatementConsolidated200Response getIncomeStatementConsolidated(getIncomeStatementConsolidatedRequest)

Income statement consolidated

The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the income statement data
        String startDate = "2024-01-01"; // String | Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetIncomeStatementConsolidatedRequest request = APIgetIncomeStatementConsolidatedRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            GetIncomeStatementConsolidated200Response result = apiInstance.getIncomeStatementConsolidated(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIncomeStatementConsolidated");
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
| getIncomeStatementConsolidatedRequest | [**APIgetIncomeStatementConsolidatedRequest**](FundamentalsApi.md#APIgetIncomeStatementConsolidatedRequest)|-|-|

### Return type

[**GetIncomeStatementConsolidated200Response**](GetIncomeStatementConsolidated200Response.md)


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

## getIncomeStatementConsolidatedWithHttpInfo

> ApiResponse<GetIncomeStatementConsolidated200Response> getIncomeStatementConsolidated getIncomeStatementConsolidatedWithHttpInfo(getIncomeStatementConsolidatedRequest)

Income statement consolidated

The income statement consolidated endpoint provides a company&#39;s raw income statement, detailing revenue, expenses, and net income for specified periods, either annually or quarterly. This data is essential for evaluating a company&#39;s financial performance over time, allowing users to access comprehensive financial results in a structured format.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        PeriodEnum period = PeriodEnum.fromValue("annual"); // PeriodEnum | The reporting period for the income statement data
        String startDate = "2024-01-01"; // String | Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format `2006-01-02`
        Long outputsize = 6L; // Long | Number of records in response
        try {
            APIgetIncomeStatementConsolidatedRequest request = APIgetIncomeStatementConsolidatedRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .period(period)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetIncomeStatementConsolidated200Response> response = apiInstance.getIncomeStatementConsolidatedWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIncomeStatementConsolidated");
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
| getIncomeStatementConsolidatedRequest | [**APIgetIncomeStatementConsolidatedRequest**](FundamentalsApi.md#APIgetIncomeStatementConsolidatedRequest)|-|-|

### Return type

ApiResponse<[**GetIncomeStatementConsolidated200Response**](GetIncomeStatementConsolidated200Response.md)>


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


<a id="APIgetIncomeStatementConsolidatedRequest"></a>
## APIgetIncomeStatementConsolidatedRequest
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
| **period** | [**PeriodEnum**](.md) | The reporting period for the income statement data | [optional] [default to annual] [enum: annual, quarterly] |
| **startDate** | **String** | Begin date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or after this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for filtering income statements by fiscal date. Returns income statements with fiscal dates on or before this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 6] |



## getIpoCalendar

> Map<String, List<GetIpoCalendar200ResponseValueInner>> getIpoCalendar(getIpoCalendarRequest)

IPO calendar

The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        String startDate = "2021-01-01"; // String | The earliest IPO date to include in the results. Format: `2006-01-02`
        String endDate = "2021-12-31"; // String | The latest IPO date to include in the results. Format: `2006-01-02`
        try {
            APIgetIpoCalendarRequest request = APIgetIpoCalendarRequest.newBuilder()
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .build();
            Map<String, List<GetIpoCalendar200ResponseValueInner>> result = apiInstance.getIpoCalendar(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIpoCalendar");
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
| getIpoCalendarRequest | [**APIgetIpoCalendarRequest**](FundamentalsApi.md#APIgetIpoCalendarRequest)|-|-|

### Return type

[**Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;**](List.md)


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

## getIpoCalendarWithHttpInfo

> ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> getIpoCalendar getIpoCalendarWithHttpInfo(getIpoCalendarRequest)

IPO calendar

The IPO Calendar endpoint provides detailed information on initial public offerings (IPOs), including those that have occurred in the past, are happening today, or are scheduled for the future. Users can access data such as company names, IPO dates, and offering details, allowing them to track and monitor IPO activity efficiently.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        String startDate = "2021-01-01"; // String | The earliest IPO date to include in the results. Format: `2006-01-02`
        String endDate = "2021-12-31"; // String | The latest IPO date to include in the results. Format: `2006-01-02`
        try {
            APIgetIpoCalendarRequest request = APIgetIpoCalendarRequest.newBuilder()
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .build();
            ApiResponse<Map<String, List<GetIpoCalendar200ResponseValueInner>>> response = apiInstance.getIpoCalendarWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIpoCalendar");
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
| getIpoCalendarRequest | [**APIgetIpoCalendarRequest**](FundamentalsApi.md#APIgetIpoCalendarRequest)|-|-|

### Return type

ApiResponse<[**Map&lt;String, List&lt;GetIpoCalendar200ResponseValueInner&gt;&gt;**](List.md)>


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


<a id="APIgetIpoCalendarRequest"></a>
## APIgetIpoCalendarRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **startDate** | **String** | The earliest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | The latest IPO date to include in the results. Format: &#x60;2006-01-02&#x60; | [optional] |



## getKeyExecutives

> GetKeyExecutives200Response getKeyExecutives(getKeyExecutivesRequest)

Key executives

The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetKeyExecutivesRequest request = APIgetKeyExecutivesRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetKeyExecutives200Response result = apiInstance.getKeyExecutives(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getKeyExecutives");
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
| getKeyExecutivesRequest | [**APIgetKeyExecutivesRequest**](FundamentalsApi.md#APIgetKeyExecutivesRequest)|-|-|

### Return type

[**GetKeyExecutives200Response**](GetKeyExecutives200Response.md)


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

## getKeyExecutivesWithHttpInfo

> ApiResponse<GetKeyExecutives200Response> getKeyExecutives getKeyExecutivesWithHttpInfo(getKeyExecutivesRequest)

Key executives

The key executives endpoint provides detailed information about a company&#39;s key executives identified by a specific stock symbol. It returns data such as names, titles, and roles of the executives, which can be useful for understanding the leadership structure of the company.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetKeyExecutivesRequest request = APIgetKeyExecutivesRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetKeyExecutives200Response> response = apiInstance.getKeyExecutivesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getKeyExecutives");
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
| getKeyExecutivesRequest | [**APIgetKeyExecutivesRequest**](FundamentalsApi.md#APIgetKeyExecutivesRequest)|-|-|

### Return type

ApiResponse<[**GetKeyExecutives200Response**](GetKeyExecutives200Response.md)>


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


<a id="APIgetKeyExecutivesRequest"></a>
## APIgetKeyExecutivesRequest
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



## getLastChanges

> GetLastChanges200Response getLastChanges(getLastChangesRequest)

Last changes

The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        EndpointEnum endpoint = EndpointEnum.fromValue("price_target"); // EndpointEnum | Endpoint name
        String startDate = "2023-10-14T00:00:00"; // String | The starting date and time for data selection, in `2006-01-02T15:04:05` format
        String symbol = "AAPL"; // String | Filter by symbol
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNAS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long page = 1L; // Long | Page number
        Long outputsize = 30L; // Long | Number of records in response
        try {
            APIgetLastChangesRequest request = APIgetLastChangesRequest.newBuilder()
                .endpoint(endpoint)
                .startDate(startDate)
                .symbol(symbol)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .page(page)
                .outputsize(outputsize)
                .build();
            GetLastChanges200Response result = apiInstance.getLastChanges(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getLastChanges");
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
| getLastChangesRequest | [**APIgetLastChangesRequest**](FundamentalsApi.md#APIgetLastChangesRequest)|-|-|

### Return type

[**GetLastChanges200Response**](GetLastChanges200Response.md)


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

## getLastChangesWithHttpInfo

> ApiResponse<GetLastChanges200Response> getLastChanges getLastChangesWithHttpInfo(getLastChangesRequest)

Last changes

The last change endpoint provides the most recent updates to fundamental data for a specified dataset. It returns a timestamp indicating when the data was last modified, allowing users to efficiently manage API requests by only fetching new data when changes occur. This helps optimize data retrieval and reduce unnecessary API credit usage.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        EndpointEnum endpoint = EndpointEnum.fromValue("price_target"); // EndpointEnum | Endpoint name
        String startDate = "2023-10-14T00:00:00"; // String | The starting date and time for data selection, in `2006-01-02T15:04:05` format
        String symbol = "AAPL"; // String | Filter by symbol
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNAS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        Long page = 1L; // Long | Page number
        Long outputsize = 30L; // Long | Number of records in response
        try {
            APIgetLastChangesRequest request = APIgetLastChangesRequest.newBuilder()
                .endpoint(endpoint)
                .startDate(startDate)
                .symbol(symbol)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .page(page)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetLastChanges200Response> response = apiInstance.getLastChangesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getLastChanges");
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
| getLastChangesRequest | [**APIgetLastChangesRequest**](FundamentalsApi.md#APIgetLastChangesRequest)|-|-|

### Return type

ApiResponse<[**GetLastChanges200Response**](GetLastChanges200Response.md)>


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


<a id="APIgetLastChangesRequest"></a>
## APIgetLastChangesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **endpoint** | [**EndpointEnum**](.md) | Endpoint name | [enum: price_target, recommendations, statistics, insider_transactions, profile, mutual_funds_world_summary, mutual_funds_world, institutional_holders, analyst_rating, income_statement, income_statement_quarterly, cash_flow, cash_flow_quarterly, balance_sheet, balance_sheet_quarterly, mutual_funds_list, mutual_funds_world_sustainability, mutual_funds_world_summary, mutual_funds_world_risk, mutual_funds_world_purchase_info, mutual_funds_world_composition, mutual_funds_world_performance, mutual_funds_world, etfs_list, etfs_world, etfs_world_summary, etfs_world_performance, etfs_world_risk, etfs_world_composition, dividends, splits] |
| **startDate** | **String** | The starting date and time for data selection, in &#x60;2006-01-02T15:04:05&#x60; format | [optional] |
| **symbol** | **String** | Filter by symbol | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |
| **micCode** | **String** | Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **page** | **Long** | Page number | [optional] [default to 1] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 30] |



## getLogo

> GetLogo200Response getLogo(getLogoRequest)

Logo

The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "BTC/USD"; // String | The ticker symbol of an instrument for which data is requested, e.g., `AAPL`, `BTC/USD`, `EUR/USD`.
        String exchange = "NASDAQ"; // String | The exchange name where the instrument is traded, e.g., `NASDAQ`, `NSE`
        String micCode = "XNAS"; // String | The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., `XNAS`, `XLON`
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        try {
            APIgetLogoRequest request = APIgetLogoRequest.newBuilder()
                .symbol(symbol)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetLogo200Response result = apiInstance.getLogo(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getLogo");
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
| getLogoRequest | [**APIgetLogoRequest**](FundamentalsApi.md#APIgetLogoRequest)|-|-|

### Return type

[**GetLogo200Response**](GetLogo200Response.md)


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

## getLogoWithHttpInfo

> ApiResponse<GetLogo200Response> getLogo getLogoWithHttpInfo(getLogoRequest)

Logo

The logo endpoint provides the official logo image for a specified company, cryptocurrency, or forex pair. This endpoint is useful for integrating visual branding elements into financial applications, websites, or reports, ensuring that users can easily identify and associate the correct logo with the respective financial asset.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "BTC/USD"; // String | The ticker symbol of an instrument for which data is requested, e.g., `AAPL`, `BTC/USD`, `EUR/USD`.
        String exchange = "NASDAQ"; // String | The exchange name where the instrument is traded, e.g., `NASDAQ`, `NSE`
        String micCode = "XNAS"; // String | The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., `XNAS`, `XLON`
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        try {
            APIgetLogoRequest request = APIgetLogoRequest.newBuilder()
                .symbol(symbol)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetLogo200Response> response = apiInstance.getLogoWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getLogo");
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
| getLogoRequest | [**APIgetLogoRequest**](FundamentalsApi.md#APIgetLogoRequest)|-|-|

### Return type

ApiResponse<[**GetLogo200Response**](GetLogo200Response.md)>


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


<a id="APIgetLogoRequest"></a>
## APIgetLogoRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | The ticker symbol of an instrument for which data is requested, e.g., &#x60;AAPL&#x60;, &#x60;BTC/USD&#x60;, &#x60;EUR/USD&#x60;. | |
| **exchange** | **String** | The exchange name where the instrument is traded, e.g., &#x60;NASDAQ&#x60;, &#x60;NSE&#x60; | [optional] |
| **micCode** | **String** | The Market Identifier Code (MIC) of the exchange where the instrument is traded, e.g., &#x60;XNAS&#x60;, &#x60;XLON&#x60; | [optional] |
| **country** | **String** | The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |



## getMarketCap

> GetMarketCap200Response getMarketCap(getMarketCapRequest)

Market capitalization

The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNAS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String startDate = "2023-01-01"; // String | Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format `2006-01-02`
        String endDate = "2023-12-31"; // String | End date for market capitalization data retrieval. Data will be returned up to and including this date. Format `2006-01-02`
        Long page = 1L; // Long | Page number
        Long outputsize = 10L; // Long | Number of records in response
        try {
            APIgetMarketCapRequest request = APIgetMarketCapRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .page(page)
                .outputsize(outputsize)
                .build();
            GetMarketCap200Response result = apiInstance.getMarketCap(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getMarketCap");
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
| getMarketCapRequest | [**APIgetMarketCapRequest**](FundamentalsApi.md#APIgetMarketCapRequest)|-|-|

### Return type

[**GetMarketCap200Response**](GetMarketCap200Response.md)


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

## getMarketCapWithHttpInfo

> ApiResponse<GetMarketCap200Response> getMarketCap getMarketCapWithHttpInfo(getMarketCapRequest)

Market capitalization

The Market Capitalization History endpoint provides historical data on a company&#39;s market capitalization over a specified time period. It returns a time series of market cap values, allowing users to track changes in a company&#39;s market value.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Filter by symbol
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNAS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String startDate = "2023-01-01"; // String | Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format `2006-01-02`
        String endDate = "2023-12-31"; // String | End date for market capitalization data retrieval. Data will be returned up to and including this date. Format `2006-01-02`
        Long page = 1L; // Long | Page number
        Long outputsize = 10L; // Long | Number of records in response
        try {
            APIgetMarketCapRequest request = APIgetMarketCapRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .page(page)
                .outputsize(outputsize)
                .build();
            ApiResponse<GetMarketCap200Response> response = apiInstance.getMarketCapWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getMarketCap");
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
| getMarketCapRequest | [**APIgetMarketCapRequest**](FundamentalsApi.md#APIgetMarketCapRequest)|-|-|

### Return type

ApiResponse<[**GetMarketCap200Response**](GetMarketCap200Response.md)>


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


<a id="APIgetMarketCapRequest"></a>
## APIgetMarketCapRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Filter by symbol | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Filter by exchange name | [optional] |
| **micCode** | **String** | Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **startDate** | **String** | Start date for market capitalization data retrieval. Data will be returned from this date onwards. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | End date for market capitalization data retrieval. Data will be returned up to and including this date. Format &#x60;2006-01-02&#x60; | [optional] |
| **page** | **Long** | Page number | [optional] [default to 1] |
| **outputsize** | **Long** | Number of records in response | [optional] [default to 10] |



## getProfile

> GetProfile200Response getProfile(getProfileRequest)

Profile

The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetProfileRequest request = APIgetProfileRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetProfile200Response result = apiInstance.getProfile(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getProfile");
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
| getProfileRequest | [**APIgetProfileRequest**](FundamentalsApi.md#APIgetProfileRequest)|-|-|

### Return type

[**GetProfile200Response**](GetProfile200Response.md)


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

## getProfileWithHttpInfo

> ApiResponse<GetProfile200Response> getProfile getProfileWithHttpInfo(getProfileRequest)

Profile

The profile endpoint provides detailed company information, including the company&#39;s name, industry, sector, CEO, headquarters location, and market capitalization. This data is useful for obtaining a comprehensive overview of a company&#39;s business and financial standing.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetProfileRequest request = APIgetProfileRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetProfile200Response> response = apiInstance.getProfileWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getProfile");
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
| getProfileRequest | [**APIgetProfileRequest**](FundamentalsApi.md#APIgetProfileRequest)|-|-|

### Return type

ApiResponse<[**GetProfile200Response**](GetProfile200Response.md)>


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


<a id="APIgetProfileRequest"></a>
## APIgetProfileRequest
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



## getSplits

> GetSplits200Response getSplits(getSplitsRequest)

Splits

The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        RangeSplitsEnum range = RangeSplitsEnum.fromValue("last"); // RangeSplitsEnum | Range of data to be returned
        String startDate = "2020-01-01"; // String | The starting date for data selection. Format `2006-01-02`
        String endDate = "2020-12-31"; // String | The ending date for data selection. Format `2006-01-02`
        try {
            APIgetSplitsRequest request = APIgetSplitsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .range(range)
                .startDate(startDate)
                .endDate(endDate)
                .build();
            GetSplits200Response result = apiInstance.getSplits(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getSplits");
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
| getSplitsRequest | [**APIgetSplitsRequest**](FundamentalsApi.md#APIgetSplitsRequest)|-|-|

### Return type

[**GetSplits200Response**](GetSplits200Response.md)


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

## getSplitsWithHttpInfo

> ApiResponse<GetSplits200Response> getSplits getSplitsWithHttpInfo(getSplitsRequest)

Splits

The splits endpoint provides historical data on stock split events for a specified company. It returns details including the date of each split and the corresponding split factor.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        RangeSplitsEnum range = RangeSplitsEnum.fromValue("last"); // RangeSplitsEnum | Range of data to be returned
        String startDate = "2020-01-01"; // String | The starting date for data selection. Format `2006-01-02`
        String endDate = "2020-12-31"; // String | The ending date for data selection. Format `2006-01-02`
        try {
            APIgetSplitsRequest request = APIgetSplitsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .range(range)
                .startDate(startDate)
                .endDate(endDate)
                .build();
            ApiResponse<GetSplits200Response> response = apiInstance.getSplitsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getSplits");
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
| getSplitsRequest | [**APIgetSplitsRequest**](FundamentalsApi.md#APIgetSplitsRequest)|-|-|

### Return type

ApiResponse<[**GetSplits200Response**](GetSplits200Response.md)>


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


<a id="APIgetSplitsRequest"></a>
## APIgetSplitsRequest
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
| **range** | [**RangeSplitsEnum**](.md) | Range of data to be returned | [optional] [default to last] [enum: last, 1m, 3m, 6m, ytd, 1y, 2y, 5y, full] |
| **startDate** | **String** | The starting date for data selection. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | The ending date for data selection. Format &#x60;2006-01-02&#x60; | [optional] |



## getSplitsCalendar

> List<SplitsCalendarResponseItem> getSplitsCalendar(getSplitsCalendarRequest)

Splits calendar

The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        String startDate = "2024-01-01"; // String | The starting date (inclusive) for filtering split events in the calendar. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | The ending date (inclusive) for filtering split events in the calendar. Format `2006-01-02`
        Long outputsize = 100L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `500`. Default `100` when no date parameters are set, otherwise set to maximum
        String page = "1"; // String | Page number
        try {
            APIgetSplitsCalendarRequest request = APIgetSplitsCalendarRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .page(page)
                .build();
            List<SplitsCalendarResponseItem> result = apiInstance.getSplitsCalendar(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getSplitsCalendar");
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
| getSplitsCalendarRequest | [**APIgetSplitsCalendarRequest**](FundamentalsApi.md#APIgetSplitsCalendarRequest)|-|-|

### Return type

[**List&lt;SplitsCalendarResponseItem&gt;**](SplitsCalendarResponseItem.md)


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

## getSplitsCalendarWithHttpInfo

> ApiResponse<List<SplitsCalendarResponseItem>> getSplitsCalendar getSplitsCalendarWithHttpInfo(getSplitsCalendarRequest)

Splits calendar

The splits calendar endpoint provides a detailed calendar of stock split events within a specified date range. By setting the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters, users can retrieve a list of upcoming or past stock splits, including the company name, split ratio, and effective date. This endpoint is useful for tracking changes in stock structure and planning investment strategies around these events.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        String startDate = "2024-01-01"; // String | The starting date (inclusive) for filtering split events in the calendar. Format `2006-01-02`
        String endDate = "2024-12-31"; // String | The ending date (inclusive) for filtering split events in the calendar. Format `2006-01-02`
        Long outputsize = 100L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `500`. Default `100` when no date parameters are set, otherwise set to maximum
        String page = "1"; // String | Page number
        try {
            APIgetSplitsCalendarRequest request = APIgetSplitsCalendarRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .startDate(startDate)
                .endDate(endDate)
                .outputsize(outputsize)
                .page(page)
                .build();
            ApiResponse<List<SplitsCalendarResponseItem>> response = apiInstance.getSplitsCalendarWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getSplitsCalendar");
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
| getSplitsCalendarRequest | [**APIgetSplitsCalendarRequest**](FundamentalsApi.md#APIgetSplitsCalendarRequest)|-|-|

### Return type

ApiResponse<[**List&lt;SplitsCalendarResponseItem&gt;**](SplitsCalendarResponseItem.md)>


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


<a id="APIgetSplitsCalendarRequest"></a>
## APIgetSplitsCalendarRequest
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
| **startDate** | **String** | The starting date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; | [optional] |
| **endDate** | **String** | The ending date (inclusive) for filtering split events in the calendar. Format &#x60;2006-01-02&#x60; | [optional] |
| **outputsize** | **Long** | Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;500&#x60;. Default &#x60;100&#x60; when no date parameters are set, otherwise set to maximum | [optional] [default to 100] |
| **page** | **String** | Page number | [optional] [default to 1] |



## getStatistics

> GetStatistics200Response getStatistics(getStatisticsRequest)

Statistics

The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetStatisticsRequest request = APIgetStatisticsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            GetStatistics200Response result = apiInstance.getStatistics(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getStatistics");
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
| getStatisticsRequest | [**APIgetStatisticsRequest**](FundamentalsApi.md#APIgetStatisticsRequest)|-|-|

### Return type

[**GetStatistics200Response**](GetStatistics200Response.md)


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

## getStatisticsWithHttpInfo

> ApiResponse<GetStatistics200Response> getStatistics getStatisticsWithHttpInfo(getStatisticsRequest)

Statistics

The statistics endpoint provides a comprehensive snapshot of a company&#39;s key financial statistics, including valuation metrics, revenue figures, profit margins, and other essential financial data. This endpoint is ideal for users seeking detailed insights into a company&#39;s financial health and performance metrics.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        try {
            APIgetStatisticsRequest request = APIgetStatisticsRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .build();
            ApiResponse<GetStatistics200Response> response = apiInstance.getStatisticsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getStatistics");
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
| getStatisticsRequest | [**APIgetStatisticsRequest**](FundamentalsApi.md#APIgetStatisticsRequest)|-|-|

### Return type

ApiResponse<[**GetStatistics200Response**](GetStatistics200Response.md)>


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


<a id="APIgetStatisticsRequest"></a>
## APIgetStatisticsRequest
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



## pressReleasesListParameters

> PressReleasesListParameters200Response pressReleasesListParameters(pressReleasesListParametersRequest)

Press releases

The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String startDate = "2025-12-01T00:00:00"; // String | Begin date for filtering items. Returns press releases with release date on or after this date. Format `2025-12-24T02:07:00`
        String endDate = "2025-12-31T23:59:00"; // String | End date for filtering items. Returns press releases with release date on or before this date. Format `2025-12-24T02:07:00`
        String timezone = "America/New_York"; // String | Time zone for date filtering. Default is the identifier time zone.
        String language = "en,en-US"; // String | Comma-separated list of languages to filter press releases by language.
        Long outputsize = 2L; // Long | Number of latest press releases returned. Only used if no data range is specified. Maximum value is `10`.  type: number
        try {
            APIpressReleasesListParametersRequest request = APIpressReleasesListParametersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .startDate(startDate)
                .endDate(endDate)
                .timezone(timezone)
                .language(language)
                .outputsize(outputsize)
                .build();
            PressReleasesListParameters200Response result = apiInstance.pressReleasesListParameters(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#pressReleasesListParameters");
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
| pressReleasesListParametersRequest | [**APIpressReleasesListParametersRequest**](FundamentalsApi.md#APIpressReleasesListParametersRequest)|-|-|

### Return type

[**PressReleasesListParameters200Response**](PressReleasesListParameters200Response.md)


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

## pressReleasesListParametersWithHttpInfo

> ApiResponse<PressReleasesListParameters200Response> pressReleasesListParameters pressReleasesListParametersWithHttpInfo(pressReleasesListParametersRequest)

Press releases

The press releases endpoint offers structured, real-time access to official company press releases and corporate announcements from public entities across global markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        FundamentalsApi apiInstance = new FundamentalsApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. `BRK.A` or `BRK.B` will be correct
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String startDate = "2025-12-01T00:00:00"; // String | Begin date for filtering items. Returns press releases with release date on or after this date. Format `2025-12-24T02:07:00`
        String endDate = "2025-12-31T23:59:00"; // String | End date for filtering items. Returns press releases with release date on or before this date. Format `2025-12-24T02:07:00`
        String timezone = "America/New_York"; // String | Time zone for date filtering. Default is the identifier time zone.
        String language = "en,en-US"; // String | Comma-separated list of languages to filter press releases by language.
        Long outputsize = 2L; // Long | Number of latest press releases returned. Only used if no data range is specified. Maximum value is `10`.  type: number
        try {
            APIpressReleasesListParametersRequest request = APIpressReleasesListParametersRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .startDate(startDate)
                .endDate(endDate)
                .timezone(timezone)
                .language(language)
                .outputsize(outputsize)
                .build();
            ApiResponse<PressReleasesListParameters200Response> response = apiInstance.pressReleasesListParametersWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#pressReleasesListParameters");
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
| pressReleasesListParametersRequest | [**APIpressReleasesListParametersRequest**](FundamentalsApi.md#APIpressReleasesListParametersRequest)|-|-|

### Return type

ApiResponse<[**PressReleasesListParameters200Response**](PressReleasesListParameters200Response.md)>


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


<a id="APIpressReleasesListParametersRequest"></a>
## APIpressReleasesListParametersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of instrument. For preffered stocks use dot(.) delimiter. E.g. &#x60;BRK.A&#x60; or &#x60;BRK.B&#x60; will be correct | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **startDate** | **String** | Begin date for filtering items. Returns press releases with release date on or after this date. Format &#x60;2025-12-24T02:07:00&#x60; | [optional] |
| **endDate** | **String** | End date for filtering items. Returns press releases with release date on or before this date. Format &#x60;2025-12-24T02:07:00&#x60; | [optional] |
| **timezone** | **String** | Time zone for date filtering. Default is the identifier time zone. | [optional] |
| **language** | **String** | Comma-separated list of languages to filter press releases by language. | [optional] |
| **outputsize** | **Long** | Number of latest press releases returned. Only used if no data range is specified. Maximum value is &#x60;10&#x60;.  type: number | [optional] [default to 2] |


