# ReferenceDataApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBonds**](ReferenceDataApi.md#getBonds) | **GET** /bonds | Fixed income |
| [**getBondsWithHttpInfo**](ReferenceDataApi.md#getBondsWithHttpInfo) | **GET** /bonds | Fixed income |
| [**getCommodities**](ReferenceDataApi.md#getCommodities) | **GET** /commodities | Commodities |
| [**getCommoditiesWithHttpInfo**](ReferenceDataApi.md#getCommoditiesWithHttpInfo) | **GET** /commodities | Commodities |
| [**getCountries**](ReferenceDataApi.md#getCountries) | **GET** /countries | Countries |
| [**getCountriesWithHttpInfo**](ReferenceDataApi.md#getCountriesWithHttpInfo) | **GET** /countries | Countries |
| [**getCrossListings**](ReferenceDataApi.md#getCrossListings) | **GET** /cross_listings | Cross listings |
| [**getCrossListingsWithHttpInfo**](ReferenceDataApi.md#getCrossListingsWithHttpInfo) | **GET** /cross_listings | Cross listings |
| [**getCryptocurrencies**](ReferenceDataApi.md#getCryptocurrencies) | **GET** /cryptocurrencies | Cryptocurrency pairs |
| [**getCryptocurrenciesWithHttpInfo**](ReferenceDataApi.md#getCryptocurrenciesWithHttpInfo) | **GET** /cryptocurrencies | Cryptocurrency pairs |
| [**getCryptocurrencyExchanges**](ReferenceDataApi.md#getCryptocurrencyExchanges) | **GET** /cryptocurrency_exchanges | Cryptocurrency exchanges |
| [**getCryptocurrencyExchangesWithHttpInfo**](ReferenceDataApi.md#getCryptocurrencyExchangesWithHttpInfo) | **GET** /cryptocurrency_exchanges | Cryptocurrency exchanges |
| [**getEarliestTimestamp**](ReferenceDataApi.md#getEarliestTimestamp) | **GET** /earliest_timestamp | Earliest timestamp |
| [**getEarliestTimestampWithHttpInfo**](ReferenceDataApi.md#getEarliestTimestampWithHttpInfo) | **GET** /earliest_timestamp | Earliest timestamp |
| [**getEtf**](ReferenceDataApi.md#getEtf) | **GET** /etfs | ETFs |
| [**getEtfWithHttpInfo**](ReferenceDataApi.md#getEtfWithHttpInfo) | **GET** /etfs | ETFs |
| [**getExchangeSchedule**](ReferenceDataApi.md#getExchangeSchedule) | **GET** /exchange_schedule | Exchanges schedule |
| [**getExchangeScheduleWithHttpInfo**](ReferenceDataApi.md#getExchangeScheduleWithHttpInfo) | **GET** /exchange_schedule | Exchanges schedule |
| [**getExchanges**](ReferenceDataApi.md#getExchanges) | **GET** /exchanges | Exchanges |
| [**getExchangesWithHttpInfo**](ReferenceDataApi.md#getExchangesWithHttpInfo) | **GET** /exchanges | Exchanges |
| [**getForexPairs**](ReferenceDataApi.md#getForexPairs) | **GET** /forex_pairs | Forex pairs |
| [**getForexPairsWithHttpInfo**](ReferenceDataApi.md#getForexPairsWithHttpInfo) | **GET** /forex_pairs | Forex pairs |
| [**getFunds**](ReferenceDataApi.md#getFunds) | **GET** /funds | Funds |
| [**getFundsWithHttpInfo**](ReferenceDataApi.md#getFundsWithHttpInfo) | **GET** /funds | Funds |
| [**getInstrumentType**](ReferenceDataApi.md#getInstrumentType) | **GET** /instrument_type | Instrument type |
| [**getInstrumentTypeWithHttpInfo**](ReferenceDataApi.md#getInstrumentTypeWithHttpInfo) | **GET** /instrument_type | Instrument type |
| [**getIntervals**](ReferenceDataApi.md#getIntervals) | **GET** /intervals | Intervals List |
| [**getIntervalsWithHttpInfo**](ReferenceDataApi.md#getIntervalsWithHttpInfo) | **GET** /intervals | Intervals List |
| [**getMarketState**](ReferenceDataApi.md#getMarketState) | **GET** /market_state | Market state |
| [**getMarketStateWithHttpInfo**](ReferenceDataApi.md#getMarketStateWithHttpInfo) | **GET** /market_state | Market state |
| [**getStocks**](ReferenceDataApi.md#getStocks) | **GET** /stocks | Stocks |
| [**getStocksWithHttpInfo**](ReferenceDataApi.md#getStocksWithHttpInfo) | **GET** /stocks | Stocks |
| [**getSymbolSearch**](ReferenceDataApi.md#getSymbolSearch) | **GET** /symbol_search | Symbol search |
| [**getSymbolSearchWithHttpInfo**](ReferenceDataApi.md#getSymbolSearchWithHttpInfo) | **GET** /symbol_search | Symbol search |
| [**getTechnicalIndicators**](ReferenceDataApi.md#getTechnicalIndicators) | **GET** /technical_indicators | Technical indicators |
| [**getTechnicalIndicatorsWithHttpInfo**](ReferenceDataApi.md#getTechnicalIndicatorsWithHttpInfo) | **GET** /technical_indicators | Technical indicators |



## getBonds

> GetBonds200Response getBonds(symbol, exchange, country, format, delimiter, showPlan, page, outputsize)

Fixed income

The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "US2Y"; // String | The ticker symbol of an instrument for which data is requested
        String exchange = "NYSE"; // String | Filter by exchange name
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Long page = 1L; // Long | Page number of the results to fetch
        Long outputsize = 5000L; // Long | Determines the number of data points returned in the output
        try {
            GetBonds200Response result = apiInstance.getBonds(symbol, exchange, country, format, delimiter, showPlan, page, outputsize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getBonds");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **page** | **Long**| Page number of the results to fetch | [optional] [default to 1] |
| **outputsize** | **Long**| Determines the number of data points returned in the output | [optional] [default to 5000] |

### Return type

[**GetBonds200Response**](GetBonds200Response.md)


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

## getBondsWithHttpInfo

> ApiResponse<GetBonds200Response> getBonds getBondsWithHttpInfo(symbol, exchange, country, format, delimiter, showPlan, page, outputsize)

Fixed income

The fixed income endpoint provides a daily updated list of available bonds. It returns an array containing detailed information about each bond, including identifiers, names, and other relevant attributes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "US2Y"; // String | The ticker symbol of an instrument for which data is requested
        String exchange = "NYSE"; // String | Filter by exchange name
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Long page = 1L; // Long | Page number of the results to fetch
        Long outputsize = 5000L; // Long | Determines the number of data points returned in the output
        try {
            ApiResponse<GetBonds200Response> response = apiInstance.getBondsWithHttpInfo(symbol, exchange, country, format, delimiter, showPlan, page, outputsize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getBonds");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **page** | **Long**| Page number of the results to fetch | [optional] [default to 1] |
| **outputsize** | **Long**| Determines the number of data points returned in the output | [optional] [default to 5000] |

### Return type

ApiResponse<[**GetBonds200Response**](GetBonds200Response.md)>


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


## getCommodities

> GetCommodities200Response getCommodities(symbol, category, format, delimiter)

Commodities

The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "XAU/USD"; // String | The ticker symbol of an instrument for which data is requested
        String category = "Precious Metal"; // String | Filter by category of commodity
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        try {
            GetCommodities200Response result = apiInstance.getCommodities(symbol, category, format, delimiter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCommodities");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **category** | **String**| Filter by category of commodity | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |

### Return type

[**GetCommodities200Response**](GetCommodities200Response.md)


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

## getCommoditiesWithHttpInfo

> ApiResponse<GetCommodities200Response> getCommodities getCommoditiesWithHttpInfo(symbol, category, format, delimiter)

Commodities

The commodities endpoint provides a daily updated list of available commodity pairs, across precious metals, livestock, softs, grains, etc.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "XAU/USD"; // String | The ticker symbol of an instrument for which data is requested
        String category = "Precious Metal"; // String | Filter by category of commodity
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        try {
            ApiResponse<GetCommodities200Response> response = apiInstance.getCommoditiesWithHttpInfo(symbol, category, format, delimiter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCommodities");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **category** | **String**| Filter by category of commodity | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |

### Return type

ApiResponse<[**GetCommodities200Response**](GetCommodities200Response.md)>


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


## getCountries

> GetCountries200Response getCountries()

Countries

The countries endpoint provides a comprehensive list of countries, including their ISO codes, official names, capitals, and currencies. This data is essential for applications requiring accurate country information for tasks such as localization, currency conversion, or geographic analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            GetCountries200Response result = apiInstance.getCountries();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCountries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetCountries200Response**](GetCountries200Response.md)


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

## getCountriesWithHttpInfo

> ApiResponse<GetCountries200Response> getCountries getCountriesWithHttpInfo()

Countries

The countries endpoint provides a comprehensive list of countries, including their ISO codes, official names, capitals, and currencies. This data is essential for applications requiring accurate country information for tasks such as localization, currency conversion, or geographic analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            ApiResponse<GetCountries200Response> response = apiInstance.getCountriesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCountries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetCountries200Response**](GetCountries200Response.md)>


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


## getCrossListings

> GetCrossListings200Response getCrossListings(symbol, exchange, micCode, country)

Cross listings

The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNGS"; // String | Market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country to which stock exchange belongs to
        try {
            GetCrossListings200Response result = apiInstance.getCrossListings(symbol, exchange, micCode, country);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCrossListings");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | |
| **exchange** | **String**| Exchange where instrument is traded | [optional] |
| **micCode** | **String**| Market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Country to which stock exchange belongs to | [optional] |

### Return type

[**GetCrossListings200Response**](GetCrossListings200Response.md)


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

## getCrossListingsWithHttpInfo

> ApiResponse<GetCrossListings200Response> getCrossListings getCrossListingsWithHttpInfo(symbol, exchange, micCode, country)

Cross listings

The cross_listings endpoint provides a daily updated list of cross-listed symbols for a specified financial instrument. Cross-listed symbols represent the same security available on multiple exchanges. This endpoint is useful for identifying all the exchanges where a particular security is traded, allowing users to access comprehensive trading information across different markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested
        String exchange = "NASDAQ"; // String | Exchange where instrument is traded
        String micCode = "XNGS"; // String | Market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Country to which stock exchange belongs to
        try {
            ApiResponse<GetCrossListings200Response> response = apiInstance.getCrossListingsWithHttpInfo(symbol, exchange, micCode, country);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCrossListings");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | |
| **exchange** | **String**| Exchange where instrument is traded | [optional] |
| **micCode** | **String**| Market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Country to which stock exchange belongs to | [optional] |

### Return type

ApiResponse<[**GetCrossListings200Response**](GetCrossListings200Response.md)>


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


## getCryptocurrencies

> GetCryptocurrencies200Response getCryptocurrencies(symbol, exchange, currencyBase, currencyQuote, format, delimiter)

Cryptocurrency pairs

The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "BTC/USD"; // String | The ticker symbol of an instrument for which data is requested
        String exchange = "Binance"; // String | Filter by exchange name. E.g. `Binance`, `Coinbase`, etc.
        String currencyBase = "BTC"; // String | Filter by currency base
        String currencyQuote = "USD"; // String | Filter by currency quote
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        try {
            GetCryptocurrencies200Response result = apiInstance.getCryptocurrencies(symbol, exchange, currencyBase, currencyQuote, format, delimiter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCryptocurrencies");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. | [optional] |
| **currencyBase** | **String**| Filter by currency base | [optional] |
| **currencyQuote** | **String**| Filter by currency quote | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |

### Return type

[**GetCryptocurrencies200Response**](GetCryptocurrencies200Response.md)


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

## getCryptocurrenciesWithHttpInfo

> ApiResponse<GetCryptocurrencies200Response> getCryptocurrencies getCryptocurrenciesWithHttpInfo(symbol, exchange, currencyBase, currencyQuote, format, delimiter)

Cryptocurrency pairs

The cryptocurrencies endpoint provides a daily updated list of all available cryptos. It returns an array containing detailed information about each cryptocurrency, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of cryptocurrencies for applications that require up-to-date market listings or need to display available crypto assets to users.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "BTC/USD"; // String | The ticker symbol of an instrument for which data is requested
        String exchange = "Binance"; // String | Filter by exchange name. E.g. `Binance`, `Coinbase`, etc.
        String currencyBase = "BTC"; // String | Filter by currency base
        String currencyQuote = "USD"; // String | Filter by currency quote
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        try {
            ApiResponse<GetCryptocurrencies200Response> response = apiInstance.getCryptocurrenciesWithHttpInfo(symbol, exchange, currencyBase, currencyQuote, format, delimiter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCryptocurrencies");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name. E.g. &#x60;Binance&#x60;, &#x60;Coinbase&#x60;, etc. | [optional] |
| **currencyBase** | **String**| Filter by currency base | [optional] |
| **currencyQuote** | **String**| Filter by currency quote | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |

### Return type

ApiResponse<[**GetCryptocurrencies200Response**](GetCryptocurrencies200Response.md)>


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


## getCryptocurrencyExchanges

> GetCryptocurrencyExchanges200Response getCryptocurrencyExchanges(format, delimiter)

Cryptocurrency exchanges

The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        try {
            GetCryptocurrencyExchanges200Response result = apiInstance.getCryptocurrencyExchanges(format, delimiter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCryptocurrencyExchanges");
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
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| Specify the delimiter used when downloading the CSV file | [optional] [default to ;] |

### Return type

[**GetCryptocurrencyExchanges200Response**](GetCryptocurrencyExchanges200Response.md)


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

## getCryptocurrencyExchangesWithHttpInfo

> ApiResponse<GetCryptocurrencyExchanges200Response> getCryptocurrencyExchanges getCryptocurrencyExchangesWithHttpInfo(format, delimiter)

Cryptocurrency exchanges

The cryptocurrency exchanges endpoint provides a daily updated list of available cryptocurrency exchanges. It returns an array containing details about each exchange, such as exchange names and identifiers.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        try {
            ApiResponse<GetCryptocurrencyExchanges200Response> response = apiInstance.getCryptocurrencyExchangesWithHttpInfo(format, delimiter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getCryptocurrencyExchanges");
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
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| Specify the delimiter used when downloading the CSV file | [optional] [default to ;] |

### Return type

ApiResponse<[**GetCryptocurrencyExchanges200Response**](GetCryptocurrencyExchanges200Response.md)>


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


## getEarliestTimestamp

> GetEarliestTimestamp200Response getEarliestTimestamp(interval, symbol, figi, isin, cusip, exchange, micCode, timezone)

Earliest timestamp

The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval between two consecutive points in time series.
        String symbol = "AAPL"; // String | Symbol ticker of the instrument.
        String figi = "BBG000B9XRY4"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "Nasdaq"; // String | Exchange where instrument is traded.
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard.
        String timezone = "Exchange"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <p>Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.</p> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            GetEarliestTimestamp200Response result = apiInstance.getEarliestTimestamp(interval, symbol, figi, isin, cusip, exchange, micCode, timezone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getEarliestTimestamp");
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
| **interval** | [**IntervalEnum**](.md)| Interval between two consecutive points in time series. | [enum: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 8h, 1day, 1week, 1month] |
| **symbol** | **String**| Symbol ticker of the instrument. | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String**| Exchange where instrument is traded. | [optional] |
| **micCode** | **String**| Market Identifier Code (MIC) under ISO 10383 standard. | [optional] |
| **timezone** | **String**| Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] [default to Exchange] |

### Return type

[**GetEarliestTimestamp200Response**](GetEarliestTimestamp200Response.md)


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

## getEarliestTimestampWithHttpInfo

> ApiResponse<GetEarliestTimestamp200Response> getEarliestTimestamp getEarliestTimestampWithHttpInfo(interval, symbol, figi, isin, cusip, exchange, micCode, timezone)

Earliest timestamp

The earliest_timestamp endpoint provides the earliest available date and time for a specified financial instrument at a given data interval. This endpoint is useful for determining the starting point of historical data availability for various assets, such as stocks or currencies, allowing users to understand the time range covered by the data.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        IntervalEnum interval = IntervalEnum.fromValue("1min"); // IntervalEnum | Interval between two consecutive points in time series.
        String symbol = "AAPL"; // String | Symbol ticker of the instrument.
        String figi = "BBG000B9XRY4"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String exchange = "Nasdaq"; // String | Exchange where instrument is traded.
        String micCode = "XNAS"; // String | Market Identifier Code (MIC) under ISO 10383 standard.
        String timezone = "Exchange"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>Exchange</code> for local exchange time</li> <li>2. <code>UTC</code> for datetime at universal UTC standard</li> <li>3. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <p>Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.</p> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            ApiResponse<GetEarliestTimestamp200Response> response = apiInstance.getEarliestTimestampWithHttpInfo(interval, symbol, figi, isin, cusip, exchange, micCode, timezone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getEarliestTimestamp");
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
| **interval** | [**IntervalEnum**](.md)| Interval between two consecutive points in time series. | [enum: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 8h, 1day, 1week, 1month] |
| **symbol** | **String**| Symbol ticker of the instrument. | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **exchange** | **String**| Exchange where instrument is traded. | [optional] |
| **micCode** | **String**| Market Identifier Code (MIC) under ISO 10383 standard. | [optional] |
| **timezone** | **String**| Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;Exchange&lt;/code&gt; for local exchange time&lt;/li&gt; &lt;li&gt;2. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;3. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Interval Limitation: The timezone parameter is only applicable for intraday intervals (less than 1 day). For intervals of 1day, 1week, or 1month, the timezone parameter is ignored, and data is strictly returned in the Exchange local time.&lt;/p&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] [default to Exchange] |

### Return type

ApiResponse<[**GetEarliestTimestamp200Response**](GetEarliestTimestamp200Response.md)>


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


## getEtf

> GetEtf200Response getEtf(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted)

ETFs

The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "SPY"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000BDTF76"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String exchange = "NYSE"; // String | Filter by exchange name
        String micCode = "XNYS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Boolean includeDelisted = false; // Boolean | Include delisted identifiers
        try {
            GetEtf200Response result = apiInstance.getEtf(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getEtf");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String**| The CIK of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **micCode** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **includeDelisted** | **Boolean**| Include delisted identifiers | [optional] [default to false] |

### Return type

[**GetEtf200Response**](GetEtf200Response.md)


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

## getEtfWithHttpInfo

> ApiResponse<GetEtf200Response> getEtf getEtfWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted)

ETFs

The ETFs endpoint provides a daily updated list of all available Exchange-Traded Funds. It returns an array containing detailed information about each ETF, including its symbol, name, and other relevant identifiers. This endpoint is useful for retrieving a comprehensive catalog of ETFs for portfolio management, investment tracking, or financial analysis.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "SPY"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000BDTF76"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String exchange = "NYSE"; // String | Filter by exchange name
        String micCode = "XNYS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Boolean includeDelisted = false; // Boolean | Include delisted identifiers
        try {
            ApiResponse<GetEtf200Response> response = apiInstance.getEtfWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, format, delimiter, showPlan, includeDelisted);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getEtf");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String**| The CIK of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **micCode** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **includeDelisted** | **Boolean**| Include delisted identifiers | [optional] [default to false] |

### Return type

ApiResponse<[**GetEtf200Response**](GetEtf200Response.md)>


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


## getExchangeSchedule

> GetExchangeSchedule200Response getExchangeSchedule(micName, micCode, country, date)

Exchanges schedule

The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String micName = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNGS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String date = "2021-10-27"; // String | <p> If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. </p> The date can be specified in one of the following formats: <ul> <li>An exact date (e.g., <code>2021-10-27</code>)</li> <li>A human-readable keyword: <code>today</code> or <code>yesterday</code></li> <li>A full datetime string in UTC (e.g., <code>2025-04-11T20:00:00</code>) to retrieve the schedule corresponding to the day in the specified time.</li> </ul> When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, <code>2025-04-11T20:00:00 UTC</code> corresponds to: <ul> <li><code>2025-04-11</code> in the <code>America/New_York</code> timezone</li> <li><code>2025-04-12</code> in the <code>Australia/Sydney</code> timezone</li> </ul>
        try {
            GetExchangeSchedule200Response result = apiInstance.getExchangeSchedule(micName, micCode, country, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getExchangeSchedule");
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
| **micName** | **String**| Filter by exchange name | [optional] |
| **micCode** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **date** | **String**| &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; | [optional] |

### Return type

[**GetExchangeSchedule200Response**](GetExchangeSchedule200Response.md)


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

## getExchangeScheduleWithHttpInfo

> ApiResponse<GetExchangeSchedule200Response> getExchangeSchedule getExchangeScheduleWithHttpInfo(micName, micCode, country, date)

Exchanges schedule

The exchanges schedule endpoint provides detailed information about various stock exchanges, including their trading hours and operational days. This data is essential for users who need to know when specific exchanges are open for trading, allowing them to plan their activities around the availability of these markets.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String micName = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNGS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        String date = "2021-10-27"; // String | <p> If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. </p> The date can be specified in one of the following formats: <ul> <li>An exact date (e.g., <code>2021-10-27</code>)</li> <li>A human-readable keyword: <code>today</code> or <code>yesterday</code></li> <li>A full datetime string in UTC (e.g., <code>2025-04-11T20:00:00</code>) to retrieve the schedule corresponding to the day in the specified time.</li> </ul> When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, <code>2025-04-11T20:00:00 UTC</code> corresponds to: <ul> <li><code>2025-04-11</code> in the <code>America/New_York</code> timezone</li> <li><code>2025-04-12</code> in the <code>Australia/Sydney</code> timezone</li> </ul>
        try {
            ApiResponse<GetExchangeSchedule200Response> response = apiInstance.getExchangeScheduleWithHttpInfo(micName, micCode, country, date);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getExchangeSchedule");
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
| **micName** | **String**| Filter by exchange name | [optional] |
| **micCode** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **date** | **String**| &lt;p&gt; If a date is provided, the API returns the schedule for the specified date; otherwise, it returns the default (common) schedule. &lt;/p&gt; The date can be specified in one of the following formats: &lt;ul&gt; &lt;li&gt;An exact date (e.g., &lt;code&gt;2021-10-27&lt;/code&gt;)&lt;/li&gt; &lt;li&gt;A human-readable keyword: &lt;code&gt;today&lt;/code&gt; or &lt;code&gt;yesterday&lt;/code&gt;&lt;/li&gt; &lt;li&gt;A full datetime string in UTC (e.g., &lt;code&gt;2025-04-11T20:00:00&lt;/code&gt;) to retrieve the schedule corresponding to the day in the specified time.&lt;/li&gt; &lt;/ul&gt; When using a datetime value, the resulting schedule will correspond to the local calendar day at the specified time. For example, &lt;code&gt;2025-04-11T20:00:00 UTC&lt;/code&gt; corresponds to: &lt;ul&gt; &lt;li&gt;&lt;code&gt;2025-04-11&lt;/code&gt; in the &lt;code&gt;America/New_York&lt;/code&gt; timezone&lt;/li&gt; &lt;li&gt;&lt;code&gt;2025-04-12&lt;/code&gt; in the &lt;code&gt;Australia/Sydney&lt;/code&gt; timezone&lt;/li&gt; &lt;/ul&gt; | [optional] |

### Return type

ApiResponse<[**GetExchangeSchedule200Response**](GetExchangeSchedule200Response.md)>


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


## getExchanges

> GetExchanges200Response getExchanges(type, name, code, country, format, delimiter, showPlan)

Exchanges

The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        String name = "NASDAQ"; // String | Filter by exchange name
        String code = "XBUE"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        try {
            GetExchanges200Response result = apiInstance.getExchanges(type, name, code, country, format, delimiter, showPlan);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getExchanges");
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
| **type** | [**TypeEnum**](.md)| The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **name** | **String**| Filter by exchange name | [optional] |
| **code** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |

### Return type

[**GetExchanges200Response**](GetExchanges200Response.md)


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

## getExchangesWithHttpInfo

> ApiResponse<GetExchanges200Response> getExchanges getExchangesWithHttpInfo(type, name, code, country, format, delimiter, showPlan)

Exchanges

The exchanges endpoint provides a comprehensive list of all available equity exchanges. It returns an array containing detailed information about each exchange, such as exchange code, name, country, and timezone. This data is updated daily.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        String name = "NASDAQ"; // String | Filter by exchange name
        String code = "XBUE"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        try {
            ApiResponse<GetExchanges200Response> response = apiInstance.getExchangesWithHttpInfo(type, name, code, country, format, delimiter, showPlan);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getExchanges");
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
| **type** | [**TypeEnum**](.md)| The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **name** | **String**| Filter by exchange name | [optional] |
| **code** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |

### Return type

ApiResponse<[**GetExchanges200Response**](GetExchanges200Response.md)>


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


## getForexPairs

> GetForexPairs200Response getForexPairs(symbol, currencyBase, currencyQuote, format, delimiter)

Forex pairs

The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "EUR/USD"; // String | The ticker symbol of an instrument for which data is requested
        String currencyBase = "EUR"; // String | Filter by currency base
        String currencyQuote = "USD"; // String | Filter by currency quote
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        try {
            GetForexPairs200Response result = apiInstance.getForexPairs(symbol, currencyBase, currencyQuote, format, delimiter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getForexPairs");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **currencyBase** | **String**| Filter by currency base | [optional] |
| **currencyQuote** | **String**| Filter by currency quote | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |

### Return type

[**GetForexPairs200Response**](GetForexPairs200Response.md)


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

## getForexPairsWithHttpInfo

> ApiResponse<GetForexPairs200Response> getForexPairs getForexPairsWithHttpInfo(symbol, currencyBase, currencyQuote, format, delimiter)

Forex pairs

The forex pairs endpoint provides a comprehensive list of all available foreign exchange currency pairs. It returns an array of forex pairs, which is updated daily.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "EUR/USD"; // String | The ticker symbol of an instrument for which data is requested
        String currencyBase = "EUR"; // String | Filter by currency base
        String currencyQuote = "USD"; // String | Filter by currency quote
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        try {
            ApiResponse<GetForexPairs200Response> response = apiInstance.getForexPairsWithHttpInfo(symbol, currencyBase, currencyQuote, format, delimiter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getForexPairs");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **currencyBase** | **String**| Filter by currency base | [optional] |
| **currencyQuote** | **String**| Filter by currency quote | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |

### Return type

ApiResponse<[**GetForexPairs200Response**](GetForexPairs200Response.md)>


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


## getFunds

> GetFunds200Response getFunds(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize)

Funds

The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "FXAIX"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String exchange = "Nasdaq"; // String | Filter by exchange name
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Long page = 1L; // Long | Page number of the results to fetch
        Long outputsize = 5000L; // Long | Determines the number of data points returned in the output
        try {
            GetFunds200Response result = apiInstance.getFunds(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getFunds");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String**| The CIK of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **page** | **Long**| Page number of the results to fetch | [optional] [default to 1] |
| **outputsize** | **Long**| Determines the number of data points returned in the output | [optional] [default to 5000] |

### Return type

[**GetFunds200Response**](GetFunds200Response.md)


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

## getFundsWithHttpInfo

> ApiResponse<GetFunds200Response> getFunds getFundsWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize)

Funds

The funds endpoint provides a daily updated list of available investment funds. It returns an array containing detailed information about each fund, including identifiers, names, and other relevant attributes.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "FXAIX"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000BHTMY7"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String exchange = "Nasdaq"; // String | Filter by exchange name
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Long page = 1L; // Long | Page number of the results to fetch
        Long outputsize = 5000L; // Long | Determines the number of data points returned in the output
        try {
            ApiResponse<GetFunds200Response> response = apiInstance.getFundsWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, country, format, delimiter, showPlan, page, outputsize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getFunds");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String**| The CIK of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **page** | **Long**| Page number of the results to fetch | [optional] [default to 1] |
| **outputsize** | **Long**| Determines the number of data points returned in the output | [optional] [default to 5000] |

### Return type

ApiResponse<[**GetFunds200Response**](GetFunds200Response.md)>


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


## getInstrumentType

> GetInstrumentType200Response getInstrumentType()

Instrument type

The instrument type endpoint lists all available financial instrument types, such as stocks, ETFs, and cryptos. This information is essential for users to identify and categorize different financial instruments when accessing or analyzing market data.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            GetInstrumentType200Response result = apiInstance.getInstrumentType();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getInstrumentType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetInstrumentType200Response**](GetInstrumentType200Response.md)


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

## getInstrumentTypeWithHttpInfo

> ApiResponse<GetInstrumentType200Response> getInstrumentType getInstrumentTypeWithHttpInfo()

Instrument type

The instrument type endpoint lists all available financial instrument types, such as stocks, ETFs, and cryptos. This information is essential for users to identify and categorize different financial instruments when accessing or analyzing market data.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            ApiResponse<GetInstrumentType200Response> response = apiInstance.getInstrumentTypeWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getInstrumentType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetInstrumentType200Response**](GetInstrumentType200Response.md)>


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


## getIntervals

> GetIntervals200Response getIntervals()

Intervals List

The intervals endpoint provides a list of supported time intervals that can be used for querying financial data.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            GetIntervals200Response result = apiInstance.getIntervals();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getIntervals");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetIntervals200Response**](GetIntervals200Response.md)


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

## getIntervalsWithHttpInfo

> ApiResponse<GetIntervals200Response> getIntervals getIntervalsWithHttpInfo()

Intervals List

The intervals endpoint provides a list of supported time intervals that can be used for querying financial data.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            ApiResponse<GetIntervals200Response> response = apiInstance.getIntervalsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getIntervals");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetIntervals200Response**](GetIntervals200Response.md)>


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


## getMarketState

> List<MarketStateResponseItem> getMarketState(exchange, code, country)

Market state

The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String exchange = "NYSE"; // String | The exchange name where the instrument is traded.
        String code = "XNYS"; // String | The Market Identifier Code (MIC) of the exchange where the instrument is traded.
        String country = "United States"; // String | The country where the exchange is located. Takes country name or alpha code.
        try {
            List<MarketStateResponseItem> result = apiInstance.getMarketState(exchange, code, country);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getMarketState");
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
| **exchange** | **String**| The exchange name where the instrument is traded. | [optional] |
| **code** | **String**| The Market Identifier Code (MIC) of the exchange where the instrument is traded. | [optional] |
| **country** | **String**| The country where the exchange is located. Takes country name or alpha code. | [optional] |

### Return type

[**List&lt;MarketStateResponseItem&gt;**](MarketStateResponseItem.md)


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

## getMarketStateWithHttpInfo

> ApiResponse<List<MarketStateResponseItem>> getMarketState getMarketStateWithHttpInfo(exchange, code, country)

Market state

The market state endpoint provides real-time information on the operational status of all available stock exchanges. It returns data on whether each exchange is currently open or closed, along with the time remaining until the next opening or closing. This endpoint is useful for users who need to monitor exchange hours and plan their trading activities accordingly.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String exchange = "NYSE"; // String | The exchange name where the instrument is traded.
        String code = "XNYS"; // String | The Market Identifier Code (MIC) of the exchange where the instrument is traded.
        String country = "United States"; // String | The country where the exchange is located. Takes country name or alpha code.
        try {
            ApiResponse<List<MarketStateResponseItem>> response = apiInstance.getMarketStateWithHttpInfo(exchange, code, country);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getMarketState");
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
| **exchange** | **String**| The exchange name where the instrument is traded. | [optional] |
| **code** | **String**| The Market Identifier Code (MIC) of the exchange where the instrument is traded. | [optional] |
| **country** | **String**| The country where the exchange is located. Takes country name or alpha code. | [optional] |

### Return type

ApiResponse<[**List&lt;MarketStateResponseItem&gt;**](MarketStateResponseItem.md)>


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


## getStocks

> GetStocks200Response getStocks(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted)

Stocks

The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNGS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Boolean includeDelisted = false; // Boolean | Include delisted identifiers
        try {
            GetStocks200Response result = apiInstance.getStocks(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getStocks");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String**| The CIK of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **micCode** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **type** | [**TypeEnum**](.md)| The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **includeDelisted** | **Boolean**| Include delisted identifiers | [optional] [default to false] |

### Return type

[**GetStocks200Response**](GetStocks200Response.md)


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

## getStocksWithHttpInfo

> ApiResponse<GetStocks200Response> getStocks getStocksWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted)

Stocks

The stocks endpoint provides a daily updated list of all available stock symbols. It returns an array containing the symbols, which can be used to identify and access specific stock data across various services. This endpoint is essential for users needing to retrieve the latest stock symbol information for further data requests or integration into financial applications.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "AAPL"; // String | The ticker symbol of an instrument for which data is requested
        String figi = "BBG000B9Y5X2"; // String | Filter by financial instrument global identifier (FIGI). This parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and the <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.
        String isin = "US0378331005"; // String | Filter by international securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cusip = "594918104"; // String | The CUSIP of an instrument for which data is requested. CUSIP access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section
        String cik = "95953"; // String | The CIK of an instrument for which data is requested
        String exchange = "NASDAQ"; // String | Filter by exchange name
        String micCode = "XNGS"; // String | Filter by market identifier code (MIC) under ISO 10383 standard
        String country = "United States"; // String | Filter by country name or alpha code, e.g., `United States` or `US`
        TypeEnum type = TypeEnum.fromValue("American Depositary Receipt"); // TypeEnum | The asset class to which the instrument belongs
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | The format of the response data
        String delimiter = ";"; // String | The separator used in the CSV response data
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available
        Boolean includeDelisted = false; // Boolean | Include delisted identifiers
        try {
            ApiResponse<GetStocks200Response> response = apiInstance.getStocksWithHttpInfo(symbol, figi, isin, cusip, cik, exchange, micCode, country, type, format, delimiter, showPlan, includeDelisted);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getStocks");
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
| **symbol** | **String**| The ticker symbol of an instrument for which data is requested | [optional] |
| **figi** | **String**| Filter by financial instrument global identifier (FIGI). This parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above. | [optional] |
| **isin** | **String**| Filter by international securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cusip** | **String**| The CUSIP of an instrument for which data is requested. CUSIP access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section | [optional] |
| **cik** | **String**| The CIK of an instrument for which data is requested | [optional] |
| **exchange** | **String**| Filter by exchange name | [optional] |
| **micCode** | **String**| Filter by market identifier code (MIC) under ISO 10383 standard | [optional] |
| **country** | **String**| Filter by country name or alpha code, e.g., &#x60;United States&#x60; or &#x60;US&#x60; | [optional] |
| **type** | [**TypeEnum**](.md)| The asset class to which the instrument belongs | [optional] [enum: American Depositary Receipt, Bond, Bond Fund, Closed-end Fund, Common Stock, Depositary Receipt, Digital Currency, ETF, Exchange-Traded Note, Global Depositary Receipt, Limited Partnership, Mutual Fund, Physical Currency, Preferred Stock, REIT, Right, Structured Product, Trust, Unit, Warrant] |
| **format** | [**FormatEnum**](.md)| The format of the response data | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String**| The separator used in the CSV response data | [optional] [default to ;] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available | [optional] [default to false] |
| **includeDelisted** | **Boolean**| Include delisted identifiers | [optional] [default to false] |

### Return type

ApiResponse<[**GetStocks200Response**](GetStocks200Response.md)>


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


## getSymbolSearch

> GetSymbolSearch200Response getSymbolSearch(symbol, outputsize, showPlan)

Symbol search

The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol to search. Supports: <ul> <li>Ticker symbol of instrument.</li> <li>International securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section</li> <li>The FIGI (Financial Instrument Global Identifier) parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.</li> <li>Composite FIGI parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.</li> <li>Share Class FIGI parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.</li> </ul>
        Long outputsize = 30L; // Long | Number of matches in response. Max <code>120</code>
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available.
        try {
            GetSymbolSearch200Response result = apiInstance.getSymbolSearch(symbol, outputsize, showPlan);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getSymbolSearch");
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
| **symbol** | **String**| Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; | |
| **outputsize** | **Long**| Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; | [optional] [default to 30] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available. | [optional] [default to false] |

### Return type

[**GetSymbolSearch200Response**](GetSymbolSearch200Response.md)


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

## getSymbolSearchWithHttpInfo

> ApiResponse<GetSymbolSearch200Response> getSymbolSearch getSymbolSearchWithHttpInfo(symbol, outputsize, showPlan)

Symbol search

The symbol search endpoint allows users to find financial instruments by name or symbol. It returns a list of matching symbols, ordered by relevance, with the most relevant instrument first. This is useful for quickly locating specific stocks, ETFs, or other financial instruments when only partial information is available.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol to search. Supports: <ul> <li>Ticker symbol of instrument.</li> <li>International securities identification number (ISIN). ISIN access is activating in the <a href=\"https://twelvedata.com/account/add-ons\">Data add-ons</a> section</li> <li>The FIGI (Financial Instrument Global Identifier) parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.</li> <li>Composite FIGI parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.</li> <li>Share Class FIGI parameter is available on the <a href=\"https://twelvedata.com/pricing\">Ultra</a> plan (individual) and <a href=\"https://twelvedata.com/pricing-business\">Enterprise</a> plan (business) and above.</li> </ul>
        Long outputsize = 30L; // Long | Number of matches in response. Max <code>120</code>
        Boolean showPlan = false; // Boolean | Adds info on which plan symbol is available.
        try {
            ApiResponse<GetSymbolSearch200Response> response = apiInstance.getSymbolSearchWithHttpInfo(symbol, outputsize, showPlan);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getSymbolSearch");
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
| **symbol** | **String**| Symbol to search. Supports: &lt;ul&gt; &lt;li&gt;Ticker symbol of instrument.&lt;/li&gt; &lt;li&gt;International securities identification number (ISIN). ISIN access is activating in the &lt;a href&#x3D;\&quot;https://twelvedata.com/account/add-ons\&quot;&gt;Data add-ons&lt;/a&gt; section&lt;/li&gt; &lt;li&gt;The FIGI (Financial Instrument Global Identifier) parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Composite FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;li&gt;Share Class FIGI parameter is available on the &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing\&quot;&gt;Ultra&lt;/a&gt; plan (individual) and &lt;a href&#x3D;\&quot;https://twelvedata.com/pricing-business\&quot;&gt;Enterprise&lt;/a&gt; plan (business) and above.&lt;/li&gt; &lt;/ul&gt; | |
| **outputsize** | **Long**| Number of matches in response. Max &lt;code&gt;120&lt;/code&gt; | [optional] [default to 30] |
| **showPlan** | **Boolean**| Adds info on which plan symbol is available. | [optional] [default to false] |

### Return type

ApiResponse<[**GetSymbolSearch200Response**](GetSymbolSearch200Response.md)>


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


## getTechnicalIndicators

> GetTechnicalIndicators200Response getTechnicalIndicators()

Technical indicators

The technical indicators endpoint provides a comprehensive list of available technical indicators, each represented as an object. This endpoint is useful for developers looking to integrate a variety of technical analysis tools into their applications, allowing for streamlined access to indicator data without needing to manually configure each one.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            GetTechnicalIndicators200Response result = apiInstance.getTechnicalIndicators();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getTechnicalIndicators");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetTechnicalIndicators200Response**](GetTechnicalIndicators200Response.md)


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

## getTechnicalIndicatorsWithHttpInfo

> ApiResponse<GetTechnicalIndicators200Response> getTechnicalIndicators getTechnicalIndicatorsWithHttpInfo()

Technical indicators

The technical indicators endpoint provides a comprehensive list of available technical indicators, each represented as an object. This endpoint is useful for developers looking to integrate a variety of technical analysis tools into their applications, allowing for streamlined access to indicator data without needing to manually configure each one.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.ReferenceDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
        try {
            ApiResponse<GetTechnicalIndicators200Response> response = apiInstance.getTechnicalIndicatorsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceDataApi#getTechnicalIndicators");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetTechnicalIndicators200Response**](GetTechnicalIndicators200Response.md)>


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

