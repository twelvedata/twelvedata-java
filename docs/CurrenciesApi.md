# CurrenciesApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrencyConversion**](CurrenciesApi.md#getCurrencyConversion) | **GET** /currency_conversion | Currency conversion |
| [**getCurrencyConversionWithHttpInfo**](CurrenciesApi.md#getCurrencyConversionWithHttpInfo) | **GET** /currency_conversion | Currency conversion |
| [**getExchangeRate**](CurrenciesApi.md#getExchangeRate) | **GET** /exchange_rate | Exchange rate |
| [**getExchangeRateWithHttpInfo**](CurrenciesApi.md#getExchangeRateWithHttpInfo) | **GET** /exchange_rate | Exchange rate |



## getCurrencyConversion

> GetCurrencyConversion200Response getCurrencyConversion(symbol, amount, date, format, delimiter, dp, timezone)

Currency conversion

The currency conversion endpoint provides real-time exchange rates and calculates the converted amount for specified currency pairs, including both forex and cryptocurrencies. This endpoint is useful for obtaining up-to-date conversion values between two currencies, facilitating tasks such as financial reporting, e-commerce transactions, and travel budgeting.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.CurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
        String symbol = "EUR/USD"; // String | The currency pair you want to request can be either forex or cryptocurrency. Slash(`/`) delimiter is used. E.g. `EUR/USD` or `BTC/ETH` will be correct
        Double amount = 100D; // Double | Amount of base currency to be converted into quote currency. Supports values in the range from `0` and above
        String date = "2006-01-02T15:04:05"; // String | If not null, will use exchange rate from a specific date or time. Format `2006-01-02` or `2006-01-02T15:04:05`. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be `JSON` or `CSV`. Default `JSON`
        String delimiter = ";"; // String | Specify the delimiter used when downloading the `CSV` file. Default semicolon `;`
        Long dp = 5L; // Long | The number of decimal places for the data
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            GetCurrencyConversion200Response result = apiInstance.getCurrencyConversion(symbol, amount, date, format, delimiter, dp, timezone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrenciesApi#getCurrencyConversion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct | |
| **amount** | **Double**| Amount of base currency to be converted into quote currency. Supports values in the range from &#x60;0&#x60; and above | |
| **date** | **String**| If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone | [optional] |
| **format** | [**FormatEnum**](.md)| Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; | [optional] [default to ;] |
| **dp** | **Long**| The number of decimal places for the data | [optional] [default to 5] |
| **timezone** | **String**| Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] |

### Return type

[**GetCurrencyConversion200Response**](GetCurrencyConversion200Response.md)


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

## getCurrencyConversionWithHttpInfo

> ApiResponse<GetCurrencyConversion200Response> getCurrencyConversion getCurrencyConversionWithHttpInfo(symbol, amount, date, format, delimiter, dp, timezone)

Currency conversion

The currency conversion endpoint provides real-time exchange rates and calculates the converted amount for specified currency pairs, including both forex and cryptocurrencies. This endpoint is useful for obtaining up-to-date conversion values between two currencies, facilitating tasks such as financial reporting, e-commerce transactions, and travel budgeting.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.CurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
        String symbol = "EUR/USD"; // String | The currency pair you want to request can be either forex or cryptocurrency. Slash(`/`) delimiter is used. E.g. `EUR/USD` or `BTC/ETH` will be correct
        Double amount = 100D; // Double | Amount of base currency to be converted into quote currency. Supports values in the range from `0` and above
        String date = "2006-01-02T15:04:05"; // String | If not null, will use exchange rate from a specific date or time. Format `2006-01-02` or `2006-01-02T15:04:05`. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be `JSON` or `CSV`. Default `JSON`
        String delimiter = ";"; // String | Specify the delimiter used when downloading the `CSV` file. Default semicolon `;`
        Long dp = 5L; // Long | The number of decimal places for the data
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            ApiResponse<GetCurrencyConversion200Response> response = apiInstance.getCurrencyConversionWithHttpInfo(symbol, amount, date, format, delimiter, dp, timezone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrenciesApi#getCurrencyConversion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct | |
| **amount** | **Double**| Amount of base currency to be converted into quote currency. Supports values in the range from &#x60;0&#x60; and above | |
| **date** | **String**| If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone | [optional] |
| **format** | [**FormatEnum**](.md)| Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; | [optional] [default to ;] |
| **dp** | **Long**| The number of decimal places for the data | [optional] [default to 5] |
| **timezone** | **String**| Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] |

### Return type

ApiResponse<[**GetCurrencyConversion200Response**](GetCurrencyConversion200Response.md)>


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


## getExchangeRate

> GetExchangeRate200Response getExchangeRate(symbol, date, format, delimiter, dp, timezone)

Exchange rate

The exchange rate endpoint provides real-time exchange rates for specified currency pairs, including both forex and cryptocurrency. It returns the current exchange rate value between two currencies, allowing users to quickly access up-to-date conversion rates for financial transactions or market analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.CurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
        String symbol = "EUR/USD"; // String | The currency pair you want to request can be either forex or cryptocurrency. Slash(`/`) delimiter is used. E.g. `EUR/USD` or `BTC/ETH` will be correct
        String date = "2006-01-02T15:04:05"; // String | If not null, will use exchange rate from a specific date or time. Format `2006-01-02` or `2006-01-02T15:04:05`. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be `JSON` or `CSV`. Default `JSON`
        String delimiter = ";"; // String | Specify the delimiter used when downloading the `CSV` file. Default semicolon `;`
        Long dp = 5L; // Long | The number of decimal places for the data
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            GetExchangeRate200Response result = apiInstance.getExchangeRate(symbol, date, format, delimiter, dp, timezone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrenciesApi#getExchangeRate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct | |
| **date** | **String**| If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone | [optional] |
| **format** | [**FormatEnum**](.md)| Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; | [optional] [default to ;] |
| **dp** | **Long**| The number of decimal places for the data | [optional] [default to 5] |
| **timezone** | **String**| Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] |

### Return type

[**GetExchangeRate200Response**](GetExchangeRate200Response.md)


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

## getExchangeRateWithHttpInfo

> ApiResponse<GetExchangeRate200Response> getExchangeRate getExchangeRateWithHttpInfo(symbol, date, format, delimiter, dp, timezone)

Exchange rate

The exchange rate endpoint provides real-time exchange rates for specified currency pairs, including both forex and cryptocurrency. It returns the current exchange rate value between two currencies, allowing users to quickly access up-to-date conversion rates for financial transactions or market analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.CurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
        String symbol = "EUR/USD"; // String | The currency pair you want to request can be either forex or cryptocurrency. Slash(`/`) delimiter is used. E.g. `EUR/USD` or `BTC/ETH` will be correct
        String date = "2006-01-02T15:04:05"; // String | If not null, will use exchange rate from a specific date or time. Format `2006-01-02` or `2006-01-02T15:04:05`. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be `JSON` or `CSV`. Default `JSON`
        String delimiter = ";"; // String | Specify the delimiter used when downloading the `CSV` file. Default semicolon `;`
        Long dp = 5L; // Long | The number of decimal places for the data
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            ApiResponse<GetExchangeRate200Response> response = apiInstance.getExchangeRateWithHttpInfo(symbol, date, format, delimiter, dp, timezone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrenciesApi#getExchangeRate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **symbol** | **String**| The currency pair you want to request can be either forex or cryptocurrency. Slash(&#x60;/&#x60;) delimiter is used. E.g. &#x60;EUR/USD&#x60; or &#x60;BTC/ETH&#x60; will be correct | |
| **date** | **String**| If not null, will use exchange rate from a specific date or time. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;. Is set in the local exchange time zone, use timezone parameter to specify a specific time zone | [optional] |
| **format** | [**FormatEnum**](.md)| Value can be &#x60;JSON&#x60; or &#x60;CSV&#x60;. Default &#x60;JSON&#x60; | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| Specify the delimiter used when downloading the &#x60;CSV&#x60; file. Default semicolon &#x60;;&#x60; | [optional] [default to ;] |
| **dp** | **Long**| The number of decimal places for the data | [optional] [default to 5] |
| **timezone** | **String**| Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] |

### Return type

ApiResponse<[**GetExchangeRate200Response**](GetExchangeRate200Response.md)>


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

