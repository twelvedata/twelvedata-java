# MarketDataApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEod**](MarketDataApi.md#getEod) | **GET** /eod | End of day price |
| [**getEodWithHttpInfo**](MarketDataApi.md#getEodWithHttpInfo) | **GET** /eod | End of day price |
| [**getMarketMovers**](MarketDataApi.md#getMarketMovers) | **GET** /market_movers/{market} | Market movers |
| [**getMarketMoversWithHttpInfo**](MarketDataApi.md#getMarketMoversWithHttpInfo) | **GET** /market_movers/{market} | Market movers |
| [**getPrice**](MarketDataApi.md#getPrice) | **GET** /price | Latest price |
| [**getPriceWithHttpInfo**](MarketDataApi.md#getPriceWithHttpInfo) | **GET** /price | Latest price |
| [**getQuote**](MarketDataApi.md#getQuote) | **GET** /quote | Quote |
| [**getQuoteWithHttpInfo**](MarketDataApi.md#getQuoteWithHttpInfo) | **GET** /quote | Quote |
| [**getTimeSeries**](MarketDataApi.md#getTimeSeries) | **GET** /time_series | Time series |
| [**getTimeSeriesWithHttpInfo**](MarketDataApi.md#getTimeSeriesWithHttpInfo) | **GET** /time_series | Time series |
| [**getTimeSeriesCross**](MarketDataApi.md#getTimeSeriesCross) | **GET** /time_series/cross | Time series cross |
| [**getTimeSeriesCrossWithHttpInfo**](MarketDataApi.md#getTimeSeriesCrossWithHttpInfo) | **GET** /time_series/cross | Time series cross |



## getEod

> GetEod200Response getEod(getEodRequest)

End of day price

The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of the instrument
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        String date = "2006-01-02"; // String | If not null, then return data from a specific date
        Boolean prepost = false; // Boolean | Parameter is optional. Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values Should be in range [0,11] inclusive
        try {
            APIgetEodRequest request = APIgetEodRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .date(date)
                .prepost(prepost)
                .dp(dp)
                .build();
            GetEod200Response result = apiInstance.getEod(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getEod");
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
| getEodRequest | [**APIgetEodRequest**](MarketDataApi.md#APIgetEodRequest)|-|-|

### Return type

[**GetEod200Response**](GetEod200Response.md)


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

## getEodWithHttpInfo

> ApiResponse<GetEod200Response> getEod getEodWithHttpInfo(getEodRequest)

End of day price

The End of Day (EOD) Prices endpoint provides the closing price and other relevant metadata for a financial instrument at the end of a trading day. This endpoint is useful for retrieving daily historical data for stocks, ETFs, or other securities, allowing users to track performance over time and compare daily market movements.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of the instrument
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        String date = "2006-01-02"; // String | If not null, then return data from a specific date
        Boolean prepost = false; // Boolean | Parameter is optional. Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values Should be in range [0,11] inclusive
        try {
            APIgetEodRequest request = APIgetEodRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .date(date)
                .prepost(prepost)
                .dp(dp)
                .build();
            ApiResponse<GetEod200Response> response = apiInstance.getEodWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getEod");
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
| getEodRequest | [**APIgetEodRequest**](MarketDataApi.md#APIgetEodRequest)|-|-|

### Return type

ApiResponse<[**GetEod200Response**](GetEod200Response.md)>


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


<a id="APIgetEodRequest"></a>
## APIgetEodRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of the instrument | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **type** | [**TypeEnum**](.md) | The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **date** | **String** | If not null, then return data from a specific date | [optional] |
| **prepost** | **Boolean** | Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume | [optional] [default to false] |
| **dp** | **Long** | Specifies the number of decimal places for floating values Should be in range [0,11] inclusive | [optional] [default to 5] |



## getMarketMovers

> MarketMoversResponseBody getMarketMovers(getMarketMoversRequest)

Market movers

The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        MarketEnum market = MarketEnum.fromValue("stocks"); // MarketEnum | Maket type
        DirectionEnum direction = DirectionEnum.fromValue("gainers"); // DirectionEnum | Specifies direction of the snapshot gainers or losers
        Long outputsize = 30L; // Long | Specifies the size of the snapshot. Can be in a range from `1` to `50`
        String country = "USA"; // String | Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code
        String priceGreaterThan = "175.5"; // String | Takes values with price grater than specified value
        String dp = "5"; // String | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetMarketMoversRequest request = APIgetMarketMoversRequest.newBuilder()
                .market(market)
                .direction(direction)
                .outputsize(outputsize)
                .country(country)
                .priceGreaterThan(priceGreaterThan)
                .dp(dp)
                .build();
            MarketMoversResponseBody result = apiInstance.getMarketMovers(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getMarketMovers");
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
| getMarketMoversRequest | [**APIgetMarketMoversRequest**](MarketDataApi.md#APIgetMarketMoversRequest)|-|-|

### Return type

[**MarketMoversResponseBody**](MarketMoversResponseBody.md)


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

## getMarketMoversWithHttpInfo

> ApiResponse<MarketMoversResponseBody> getMarketMovers getMarketMoversWithHttpInfo(getMarketMoversRequest)

Market movers

The market movers endpoint provides a ranked list of the top-gaining and losing assets for the current trading day. It returns detailed data on the highest percentage price increases and decreases since the previous day&#39;s close. This endpoint supports international equities, forex, and cryptocurrencies, enabling users to quickly identify significant market movements across various asset classes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        MarketEnum market = MarketEnum.fromValue("stocks"); // MarketEnum | Maket type
        DirectionEnum direction = DirectionEnum.fromValue("gainers"); // DirectionEnum | Specifies direction of the snapshot gainers or losers
        Long outputsize = 30L; // Long | Specifies the size of the snapshot. Can be in a range from `1` to `50`
        String country = "USA"; // String | Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code
        String priceGreaterThan = "175.5"; // String | Takes values with price grater than specified value
        String dp = "5"; // String | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetMarketMoversRequest request = APIgetMarketMoversRequest.newBuilder()
                .market(market)
                .direction(direction)
                .outputsize(outputsize)
                .country(country)
                .priceGreaterThan(priceGreaterThan)
                .dp(dp)
                .build();
            ApiResponse<MarketMoversResponseBody> response = apiInstance.getMarketMoversWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getMarketMovers");
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
| getMarketMoversRequest | [**APIgetMarketMoversRequest**](MarketDataApi.md#APIgetMarketMoversRequest)|-|-|

### Return type

ApiResponse<[**MarketMoversResponseBody**](MarketMoversResponseBody.md)>


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


<a id="APIgetMarketMoversRequest"></a>
## APIgetMarketMoversRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **market** | [**MarketEnum**](.md) | Maket type | [enum: stocks, etf, mutual_funds, forex, crypto] |
| **direction** | [**DirectionEnum**](.md) | Specifies direction of the snapshot gainers or losers | [optional] [default to gainers] [enum: gainers, losers] |
| **outputsize** | **Long** | Specifies the size of the snapshot. Can be in a range from &#x60;1&#x60; to &#x60;50&#x60; | [optional] [default to 30] |
| **country** | **String** | Country of the snapshot, applicable to non-currencies only. Takes country name or alpha code | [optional] [default to USA] |
| **priceGreaterThan** | **String** | Takes values with price grater than specified value | [optional] |
| **dp** | **String** | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive | [optional] [default to 5] |



## getPrice

> GetPrice200Response getPrice(getPriceRequest)

Latest price

The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of the instrument
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be JSON or CSV
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        Boolean prepost = false; // Boolean | Parameter is optional. Only for Pro or Venture, and above plans. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume.
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetPriceRequest request = APIgetPriceRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .format(format)
                .delimiter(delimiter)
                .prepost(prepost)
                .dp(dp)
                .build();
            GetPrice200Response result = apiInstance.getPrice(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getPrice");
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
| getPriceRequest | [**APIgetPriceRequest**](MarketDataApi.md#APIgetPriceRequest)|-|-|

### Return type

[**GetPrice200Response**](GetPrice200Response.md)


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

## getPriceWithHttpInfo

> ApiResponse<GetPrice200Response> getPrice getPriceWithHttpInfo(getPriceRequest)

Latest price

The latest price endpoint provides the latest market price for a specified financial instrument. It returns a single data point representing the current (or the most recently available) trading price.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of the instrument
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be JSON or CSV
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        Boolean prepost = false; // Boolean | Parameter is optional. Only for Pro or Venture, and above plans. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume.
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive
        try {
            APIgetPriceRequest request = APIgetPriceRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .format(format)
                .delimiter(delimiter)
                .prepost(prepost)
                .dp(dp)
                .build();
            ApiResponse<GetPrice200Response> response = apiInstance.getPriceWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getPrice");
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
| getPriceRequest | [**APIgetPriceRequest**](MarketDataApi.md#APIgetPriceRequest)|-|-|

### Return type

ApiResponse<[**GetPrice200Response**](GetPrice200Response.md)>


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


<a id="APIgetPriceRequest"></a>
## APIgetPriceRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of the instrument | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **type** | [**TypeEnum**](.md) | The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **format** | [**FormatEnum**](.md) | Value can be JSON or CSV | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | Specify the delimiter used when downloading the CSV file | [optional] [default to ;] |
| **prepost** | **Boolean** | Parameter is optional. Only for Pro or Venture, and above plans. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. | [optional] [default to false] |
| **dp** | **Long** | Specifies the number of decimal places for floating values. Should be in range [0,11] inclusive | [optional] [default to 5] |



## getQuote

> GetQuote200Response getQuote(getQuoteRequest)

Quote

The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of the instrument
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval of the quote
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        Long volumeTimePeriod = 9L; // Long | Number of periods for Average Volume
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be JSON or CSV Default JSON
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        Boolean prepost = false; // Boolean | Parameter is optional. Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume.
        Boolean eod = false; // Boolean | If true, then return data for closed day
        Long rollingPeriod = 24L; // Long | Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168].
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values Should be in range [0,11] inclusive
        String timezone = "Exchange"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <p>Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.</p> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            APIgetQuoteRequest request = APIgetQuoteRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .interval(interval)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .volumeTimePeriod(volumeTimePeriod)
                .type(type)
                .format(format)
                .delimiter(delimiter)
                .prepost(prepost)
                .eod(eod)
                .rollingPeriod(rollingPeriod)
                .dp(dp)
                .timezone(timezone)
                .build();
            GetQuote200Response result = apiInstance.getQuote(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getQuote");
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
| getQuoteRequest | [**APIgetQuoteRequest**](MarketDataApi.md#APIgetQuoteRequest)|-|-|

### Return type

[**GetQuote200Response**](GetQuote200Response.md)


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

## getQuoteWithHttpInfo

> ApiResponse<GetQuote200Response> getQuote getQuoteWithHttpInfo(getQuoteRequest)

Quote

The quote endpoint provides real-time data for a selected financial instrument, returning essential information such as the latest price, open, high, low, close, volume, and price change. This endpoint is ideal for users needing up-to-date market data to track price movements and trading activity for specific stocks, ETFs, or other securities.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol ticker of the instrument
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval of the quote
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country where instrument is traded, e.g., `United States` or `US`
        Long volumeTimePeriod = 9L; // Long | Number of periods for Average Volume
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Value can be JSON or CSV Default JSON
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        Boolean prepost = false; // Boolean | Parameter is optional. Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume.
        Boolean eod = false; // Boolean | If true, then return data for closed day
        Long rollingPeriod = 24L; // Long | Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168].
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values Should be in range [0,11] inclusive
        String timezone = "Exchange"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <p>Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.</p> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            APIgetQuoteRequest request = APIgetQuoteRequest.newBuilder()
                .symbol(symbol)
                .figi(figi)
                .isin(isin)
                .cusip(cusip)
                .interval(interval)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .volumeTimePeriod(volumeTimePeriod)
                .type(type)
                .format(format)
                .delimiter(delimiter)
                .prepost(prepost)
                .eod(eod)
                .rollingPeriod(rollingPeriod)
                .dp(dp)
                .timezone(timezone)
                .build();
            ApiResponse<GetQuote200Response> response = apiInstance.getQuoteWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getQuote");
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
| getQuoteRequest | [**APIgetQuoteRequest**](MarketDataApi.md#APIgetQuoteRequest)|-|-|

### Return type

ApiResponse<[**GetQuote200Response**](GetQuote200Response.md)>


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


<a id="APIgetQuoteRequest"></a>
## APIgetQuoteRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **symbol** | **String** | Symbol ticker of the instrument | [optional] |
| **figi** | **String** | Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **interval** | [**IntervalEnum**](.md) | Interval of the quote | [optional] [enum: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 8h, 1day, 1week, 1month] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | Country where instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **volumeTimePeriod** | **Long** | Number of periods for Average Volume | [optional] [default to 9] |
| **type** | [**TypeEnum**](.md) | The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **format** | [**FormatEnum**](.md) | Value can be JSON or CSV Default JSON | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | Specify the delimiter used when downloading the CSV file | [optional] [default to ;] |
| **prepost** | **Boolean** | Parameter is optional. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. | [optional] [default to false] |
| **eod** | **Boolean** | If true, then return data for closed day | [optional] [default to false] |
| **rollingPeriod** | **Long** | Number of hours for calculate rolling change at period. By default set to 24, it can be in range [1, 168]. | [optional] [default to 24] |
| **dp** | **Long** | Specifies the number of decimal places for floating values Should be in range [0,11] inclusive | [optional] [default to 5] |
| **timezone** | **String** | Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] [default to Exchange] |



## getTimeSeries

> GetTimeSeries200Response getTimeSeries(getTimeSeriesRequest)

Time series

The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval between two consecutive points in time series
        String symbol = "AAPL"; // String | Symbol ticker of the instrument. E.g. `AAPL`, `EUR/USD`, `ETH/BTC`, ...
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        Long outputsize = 30L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `5000`. Default `30` when no date parameters are set, otherwise set to maximum
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        String timezone = "Exchange"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a></li> </ul> <p>Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.</p> <i>Take note that the IANA Timezone name is case-sensitive</i>
        String startDate = "2024-08-22T15:04:05"; // String | Can be used separately and together with `end_date`. Format `2006-01-02` or `2006-01-02T15:04:05`  Default location: <ul> <li>Forex and Cryptocurrencies - <code>UTC</code></li> <li>Stocks - where exchange is located (e.g. for AAPL it will be <code>America/New_York</code>)</li> </ul> Both parameters take into account if <code>timezone</code> parameter is provided.<br/> If <code>timezone</code> is given then, <code>start_date</code> and <code>end_date</code> will be used in the specified location  Examples: <ul> <li>1. <code>&symbol=AAPL&start_date=2019-08-09T15:50:00&…</code><br/> Returns all records starting from 2019-08-09T15:50:00 New York time up to current date</li> <li>2. <code>&symbol=EUR/USD&timezone=Asia/Singapore&start_date=2019-08-09T15:50:00&…</code><br/> Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date</li> <li>3. <code>&symbol=ETH/BTC&timezone=Europe/Zurich&start_date=2019-08-09T15:50:00&end_date=2019-08-09T15:55:00&...</code><br/> Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00</li> </ul>
        String endDate = "2024-08-22T16:04:05"; // String | The ending date and time for data selection, see `start_date` description for details.
        String date = "2021-10-27"; // String | Specifies the exact date to get the data for. Could be the exact date, e.g. `2021-10-27`, or in human language `today` or `yesterday`
        OrderEnum order = OrderEnum.fromValue("asc"); // OrderEnum | Sorting order of the output
        Boolean prepost = false; // Boolean | Returns quotes that include pre-market and post-market data. Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Long dp = -1L; // Long | Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided
        Boolean previousClose = false; // Boolean | A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object
        AdjustEnum adjust = AdjustEnum.fromValue("all"); // AdjustEnum | Adjusting mode for prices
        try {
            APIgetTimeSeriesRequest request = APIgetTimeSeriesRequest.newBuilder()
                .interval(interval)
                .symbol(symbol)
                .isin(isin)
                .figi(figi)
                .cusip(cusip)
                .outputsize(outputsize)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .timezone(timezone)
                .startDate(startDate)
                .endDate(endDate)
                .date(date)
                .order(order)
                .prepost(prepost)
                .format(format)
                .delimiter(delimiter)
                .dp(dp)
                .previousClose(previousClose)
                .adjust(adjust)
                .build();
            GetTimeSeries200Response result = apiInstance.getTimeSeries(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getTimeSeries");
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
| getTimeSeriesRequest | [**APIgetTimeSeriesRequest**](MarketDataApi.md#APIgetTimeSeriesRequest)|-|-|

### Return type

[**GetTimeSeries200Response**](GetTimeSeries200Response.md)


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

## getTimeSeriesWithHttpInfo

> ApiResponse<GetTimeSeries200Response> getTimeSeries getTimeSeriesWithHttpInfo(getTimeSeriesRequest)

Time series

The time series endpoint provides detailed historical data for a specified financial instrument. It returns two main components: metadata, which includes essential information about the instrument, and a time series dataset. The time series consists of chronological entries with Open, High, Low, and Close prices, and for applicable instruments, it also includes trading volume. This endpoint is ideal for retrieving comprehensive historical price data for analysis or visualization purposes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval between two consecutive points in time series
        String symbol = "AAPL"; // String | Symbol ticker of the instrument. E.g. `AAPL`, `EUR/USD`, `ETH/BTC`, ...
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String figi = "BBG000B9Y5X2"; // String | The FIGI of an instrument for which data is requested. This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        Long outputsize = 30L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `5000`. Default `30` when no date parameters are set, otherwise set to maximum
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard
        String country = "United States"; // String | The country where the instrument is traded, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        String timezone = "Exchange"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a></li> </ul> <p>Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.</p> <i>Take note that the IANA Timezone name is case-sensitive</i>
        String startDate = "2024-08-22T15:04:05"; // String | Can be used separately and together with `end_date`. Format `2006-01-02` or `2006-01-02T15:04:05`  Default location: <ul> <li>Forex and Cryptocurrencies - <code>UTC</code></li> <li>Stocks - where exchange is located (e.g. for AAPL it will be <code>America/New_York</code>)</li> </ul> Both parameters take into account if <code>timezone</code> parameter is provided.<br/> If <code>timezone</code> is given then, <code>start_date</code> and <code>end_date</code> will be used in the specified location  Examples: <ul> <li>1. <code>&symbol=AAPL&start_date=2019-08-09T15:50:00&…</code><br/> Returns all records starting from 2019-08-09T15:50:00 New York time up to current date</li> <li>2. <code>&symbol=EUR/USD&timezone=Asia/Singapore&start_date=2019-08-09T15:50:00&…</code><br/> Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date</li> <li>3. <code>&symbol=ETH/BTC&timezone=Europe/Zurich&start_date=2019-08-09T15:50:00&end_date=2019-08-09T15:55:00&...</code><br/> Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00</li> </ul>
        String endDate = "2024-08-22T16:04:05"; // String | The ending date and time for data selection, see `start_date` description for details.
        String date = "2021-10-27"; // String | Specifies the exact date to get the data for. Could be the exact date, e.g. `2021-10-27`, or in human language `today` or `yesterday`
        OrderEnum order = OrderEnum.fromValue("asc"); // OrderEnum | Sorting order of the output
        Boolean prepost = false; // Boolean | Returns quotes that include pre-market and post-market data. Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Long dp = -1L; // Long | Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided
        Boolean previousClose = false; // Boolean | A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object
        AdjustEnum adjust = AdjustEnum.fromValue("all"); // AdjustEnum | Adjusting mode for prices
        try {
            APIgetTimeSeriesRequest request = APIgetTimeSeriesRequest.newBuilder()
                .interval(interval)
                .symbol(symbol)
                .isin(isin)
                .figi(figi)
                .cusip(cusip)
                .outputsize(outputsize)
                .exchange(exchange)
                .micCode(micCode)
                .country(country)
                .type(type)
                .timezone(timezone)
                .startDate(startDate)
                .endDate(endDate)
                .date(date)
                .order(order)
                .prepost(prepost)
                .format(format)
                .delimiter(delimiter)
                .dp(dp)
                .previousClose(previousClose)
                .adjust(adjust)
                .build();
            ApiResponse<GetTimeSeries200Response> response = apiInstance.getTimeSeriesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getTimeSeries");
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
| getTimeSeriesRequest | [**APIgetTimeSeriesRequest**](MarketDataApi.md#APIgetTimeSeriesRequest)|-|-|

### Return type

ApiResponse<[**GetTimeSeries200Response**](GetTimeSeries200Response.md)>


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


<a id="APIgetTimeSeriesRequest"></a>
## APIgetTimeSeriesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **interval** | [**IntervalEnum**](.md) | Interval between two consecutive points in time series | [enum: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 8h, 1day, 1week, 1month] |
| **symbol** | **String** | Symbol ticker of the instrument. E.g. &#x60;AAPL&#x60;, &#x60;EUR/USD&#x60;, &#x60;ETH/BTC&#x60;, ... | [optional] |
| **isin** | **String** | Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **figi** | **String** | The FIGI of an instrument for which data is requested. This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **cusip** | **String** | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **outputsize** | **Long** | Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum | [optional] [default to 30] |
| **exchange** | **String** | Exchange where instrument is traded | [optional] |
| **micCode** | **String** | Market Identifier Code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String** | The country where the instrument is traded, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **type** | [**TypeEnum**](.md) | The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **timezone** | **String** | Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] [default to Exchange] |
| **startDate** | **String** | Can be used separately and together with &#x60;end_date&#x60;. Format &#x60;2006-01-02&#x60; or &#x60;2006-01-02T15:04:05&#x60;  Default location: &lt;ul&gt; &lt;li&gt;Forex and Cryptocurrencies - &lt;code&gt;UTC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;Stocks - where exchange is located (e.g. for AAPL it will be &lt;code&gt;America/New_York&lt;/code&gt;)&lt;/li&gt; &lt;/ul&gt; Both parameters take into account if &lt;code&gt;timezone&lt;/code&gt; parameter is provided.&lt;br/&gt; If &lt;code&gt;timezone&lt;/code&gt; is given then, &lt;code&gt;start_date&lt;/code&gt; and &lt;code&gt;end_date&lt;/code&gt; will be used in the specified location  Examples: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;&amp;symbol&#x3D;AAPL&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 New York time up to current date&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;&amp;symbol&#x3D;EUR/USD&amp;timezone&#x3D;Asia/Singapore&amp;start_date&#x3D;2019-08-09T15:50:00&amp;…&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Singapore time up to current date&lt;/li&gt; &lt;li&gt;3. &lt;code&gt;&amp;symbol&#x3D;ETH/BTC&amp;timezone&#x3D;Europe/Zurich&amp;start_date&#x3D;2019-08-09T15:50:00&amp;end_date&#x3D;2019-08-09T15:55:00&amp;...&lt;/code&gt;&lt;br/&gt; Returns all records starting from 2019-08-09T15:50:00 Zurich time up to 2019-08-09T15:55:00&lt;/li&gt; &lt;/ul&gt; | [optional] |
| **endDate** | **String** | The ending date and time for data selection, see &#x60;start_date&#x60; description for details. | [optional] |
| **date** | **String** | Specifies the exact date to get the data for. Could be the exact date, e.g. &#x60;2021-10-27&#x60;, or in human language &#x60;today&#x60; or &#x60;yesterday&#x60; | [optional] |
| **order** | [**OrderEnum**](.md) | Sorting order of the output | [optional] [default to desc] [enum: asc, desc] |
| **prepost** | **Boolean** | Returns quotes that include pre-market and post-market data. Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume | [optional] [default to false] |
| **format** | [**FormatEnum**](.md) | The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | The separator used in the CSV response data | [optional] [default to ;] |
| **dp** | **Long** | Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. By default, the number of decimal places is automatically determined based on the values provided | [optional] [default to -1] |
| **previousClose** | **Boolean** | A boolean parameter to include the previous closing price in the time_series data. If true, adds previous bar close price value to the current object | [optional] [default to false] |
| **adjust** | [**AdjustEnum**](.md) | Adjusting mode for prices | [optional] [default to splits] [enum: all, splits, dividends, none] |



## getTimeSeriesCross

> GetTimeSeriesCross200Response getTimeSeriesCross(getTimeSeriesCrossRequest)

Time series cross

The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String base = "JPY"; // String | Base currency symbol
        String quote = "BTC"; // String | Quote currency symbol
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval between two consecutive points in time series
        String baseType = "Physical Currency"; // String | Base instrument type according to the `/instrument_type` endpoint
        String baseExchange = "Binance"; // String | Base exchange
        String baseMicCode = "XNGS"; // String | Base MIC code
        String quoteType = "Digital Currency"; // String | Quote instrument type according to the `/instrument_type` endpoint
        String quoteExchange = "Coinbase"; // String | Quote exchange
        String quoteMicCode = "XNYS"; // String | Quote MIC code
        Long outputsize = 30L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `5000`. Default `30` when no date parameters are set, otherwise set to maximum
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Format of the response data
        String delimiter = ";"; // String | Delimiter used in CSV file
        Boolean prepost = false; // Boolean | Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume.
        String startDate = "2025-01-01"; // String | Start date for the time series data
        String endDate = "2025-01-31"; // String | End date for the time series data
        Boolean adjust = true; // Boolean | Specifies if there should be an adjustment
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive.
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            APIgetTimeSeriesCrossRequest request = APIgetTimeSeriesCrossRequest.newBuilder()
                .base(base)
                .quote(quote)
                .interval(interval)
                .baseType(baseType)
                .baseExchange(baseExchange)
                .baseMicCode(baseMicCode)
                .quoteType(quoteType)
                .quoteExchange(quoteExchange)
                .quoteMicCode(quoteMicCode)
                .outputsize(outputsize)
                .format(format)
                .delimiter(delimiter)
                .prepost(prepost)
                .startDate(startDate)
                .endDate(endDate)
                .adjust(adjust)
                .dp(dp)
                .timezone(timezone)
                .build();
            GetTimeSeriesCross200Response result = apiInstance.getTimeSeriesCross(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getTimeSeriesCross");
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
| getTimeSeriesCrossRequest | [**APIgetTimeSeriesCrossRequest**](MarketDataApi.md#APIgetTimeSeriesCrossRequest)|-|-|

### Return type

[**GetTimeSeriesCross200Response**](GetTimeSeriesCross200Response.md)


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

## getTimeSeriesCrossWithHttpInfo

> ApiResponse<GetTimeSeriesCross200Response> getTimeSeriesCross getTimeSeriesCrossWithHttpInfo(getTimeSeriesCrossRequest)

Time series cross

The Time Series Cross endpoint calculates and returns historical cross-rate data for exotic forex pairs, cryptocurrencies, or stocks (e.g., Apple Inc. price in Indian Rupees) on the fly. It provides metadata about the requested symbol and a time series array with Open, High, Low, and Close prices, sorted descending by time, enabling analysis of price history and market trends.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        MarketDataApi apiInstance = new MarketDataApi(defaultClient);
        String base = "JPY"; // String | Base currency symbol
        String quote = "BTC"; // String | Quote currency symbol
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval between two consecutive points in time series
        String baseType = "Physical Currency"; // String | Base instrument type according to the `/instrument_type` endpoint
        String baseExchange = "Binance"; // String | Base exchange
        String baseMicCode = "XNGS"; // String | Base MIC code
        String quoteType = "Digital Currency"; // String | Quote instrument type according to the `/instrument_type` endpoint
        String quoteExchange = "Coinbase"; // String | Quote exchange
        String quoteMicCode = "XNYS"; // String | Quote MIC code
        Long outputsize = 30L; // Long | Number of data points to retrieve. Supports values in the range from `1` to `5000`. Default `30` when no date parameters are set, otherwise set to maximum
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Format of the response data
        String delimiter = ";"; // String | Delimiter used in CSV file
        Boolean prepost = false; // Boolean | Only for the `Pro` plan (individual) and `Venture` plan (business) and above. Available at the `1min`, `5min`, `15min`, and `30min` intervals for US equities. Open, high, low, close values are supplied without volume.
        String startDate = "2025-01-01"; // String | Start date for the time series data
        String endDate = "2025-01-31"; // String | End date for the time series data
        Boolean adjust = true; // Boolean | Specifies if there should be an adjustment
        Long dp = 5L; // Long | Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive.
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            APIgetTimeSeriesCrossRequest request = APIgetTimeSeriesCrossRequest.newBuilder()
                .base(base)
                .quote(quote)
                .interval(interval)
                .baseType(baseType)
                .baseExchange(baseExchange)
                .baseMicCode(baseMicCode)
                .quoteType(quoteType)
                .quoteExchange(quoteExchange)
                .quoteMicCode(quoteMicCode)
                .outputsize(outputsize)
                .format(format)
                .delimiter(delimiter)
                .prepost(prepost)
                .startDate(startDate)
                .endDate(endDate)
                .adjust(adjust)
                .dp(dp)
                .timezone(timezone)
                .build();
            ApiResponse<GetTimeSeriesCross200Response> response = apiInstance.getTimeSeriesCrossWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataApi#getTimeSeriesCross");
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
| getTimeSeriesCrossRequest | [**APIgetTimeSeriesCrossRequest**](MarketDataApi.md#APIgetTimeSeriesCrossRequest)|-|-|

### Return type

ApiResponse<[**GetTimeSeriesCross200Response**](GetTimeSeriesCross200Response.md)>


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


<a id="APIgetTimeSeriesCrossRequest"></a>
## APIgetTimeSeriesCrossRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **base** | **String** | Base currency symbol | |
| **quote** | **String** | Quote currency symbol | |
| **interval** | [**IntervalEnum**](.md) | Interval between two consecutive points in time series | [enum: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 8h, 1day, 1week, 1month] |
| **baseType** | **String** | Base instrument type according to the &#x60;/instrument_type&#x60; endpoint | [optional] |
| **baseExchange** | **String** | Base exchange | [optional] |
| **baseMicCode** | **String** | Base MIC code | [optional] |
| **quoteType** | **String** | Quote instrument type according to the &#x60;/instrument_type&#x60; endpoint | [optional] |
| **quoteExchange** | **String** | Quote exchange | [optional] |
| **quoteMicCode** | **String** | Quote MIC code | [optional] |
| **outputsize** | **Long** | Number of data points to retrieve. Supports values in the range from &#x60;1&#x60; to &#x60;5000&#x60;. Default &#x60;30&#x60; when no date parameters are set, otherwise set to maximum | [optional] |
| **format** | [**FormatEnum**](.md) | Format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | Delimiter used in CSV file | [optional] [default to ;] |
| **prepost** | **Boolean** | Only for the &#x60;Pro&#x60; plan (individual) and &#x60;Venture&#x60; plan (business) and above. Available at the &#x60;1min&#x60;, &#x60;5min&#x60;, &#x60;15min&#x60;, and &#x60;30min&#x60; intervals for US equities. Open, high, low, close values are supplied without volume. | [optional] [default to false] |
| **startDate** | **String** | Start date for the time series data | [optional] |
| **endDate** | **String** | End date for the time series data | [optional] |
| **adjust** | **Boolean** | Specifies if there should be an adjustment | [optional] [default to true] |
| **dp** | **Long** | Specifies the number of decimal places for floating values. Should be in range [0, 11] inclusive. | [optional] [default to 5] |
| **timezone** | **String** | Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] |


