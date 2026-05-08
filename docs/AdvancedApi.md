# AdvancedApi

All URIs are relative to *https://api.twelvedata.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advanced**](AdvancedApi.md#advanced) | **POST** /batch | Batches |
| [**advancedWithHttpInfo**](AdvancedApi.md#advancedWithHttpInfo) | **POST** /batch | Batches |
| [**getApiUsage**](AdvancedApi.md#getApiUsage) | **GET** /api_usage | API usage |
| [**getApiUsageWithHttpInfo**](AdvancedApi.md#getApiUsageWithHttpInfo) | **GET** /api_usage | API usage |



## advanced

> Advanced200Response advanced(advancedRequest)

Batches

The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AdvancedApi;
import com.twelvedata.client.api.AdvancedApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AdvancedApi apiInstance = new AdvancedApi(defaultClient);
        Map<String, AdvancedRequestValue> key = new HashMap(); // Map<String, AdvancedRequestValue> | Map of requests
        try {
            APIadvancedRequest request = APIadvancedRequest.newBuilder()
                .key(key)
                .build();
            Advanced200Response result = apiInstance.advanced(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedApi#advanced");
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
| advancedRequest | [**APIadvancedRequest**](AdvancedApi.md#APIadvancedRequest)|-|-|

### Return type

[**Advanced200Response**](Advanced200Response.md)


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: application/json, application/xml
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

## advancedWithHttpInfo

> ApiResponse<Advanced200Response> advanced advancedWithHttpInfo(advancedRequest)

Batches

The batch request endpoint allows users to request data for multiple financial instruments, time intervals, and data types simultaneously. This endpoint is useful for efficiently gathering diverse financial data in a single operation, reducing the need for multiple individual requests. Errors in specific requests do not affect the processing of others, and each error is reported separately, enabling easy troubleshooting.  ### Request body Only JSON &#x60;POST&#x60; requests are supported. The request content structure consists of key-value items. The key is a unique request ID. The value is requested url.  ### Response The response contains key-value data. The key is a unique request ID. The value is returned data.  ### API credits &lt;ul&gt; &lt;li&gt;The number of concurrent requests is limited by your subscription plan.&lt;/li&gt; &lt;li&gt;Credits are consumed per requested endpoint, with the total usage equal to the sum of individual requests in the batch.&lt;/li&gt; &lt;li&gt;If the requested data exceeds your available credits, only partial data will be returned asynchronously until your quota is exhausted.&lt;/li&gt; &lt;li&gt;If one or more requests in the batch contain errors (e.g., invalid symbols or unsupported intervals), it will not affect the successful processing of other requests. Errors are reported individually within the response, allowing you to identify and correct specific issues without impacting the entire batch.&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AdvancedApi;
import com.twelvedata.client.api.AdvancedApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AdvancedApi apiInstance = new AdvancedApi(defaultClient);
        Map<String, AdvancedRequestValue> key = new HashMap(); // Map<String, AdvancedRequestValue> | Map of requests
        try {
            APIadvancedRequest request = APIadvancedRequest.newBuilder()
                .key(key)
                .build();
            ApiResponse<Advanced200Response> response = apiInstance.advancedWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedApi#advanced");
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
| advancedRequest | [**APIadvancedRequest**](AdvancedApi.md#APIadvancedRequest)|-|-|

### Return type

ApiResponse<[**Advanced200Response**](Advanced200Response.md)>


### Authorization

[authorizationHeader](../README.md#authorizationHeader)

### HTTP request headers

- **Content-Type**: application/json, application/xml
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


<a id="APIadvancedRequest"></a>
## APIadvancedRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **key** | [**Map&lt;String, AdvancedRequestValue&gt;**](AdvancedRequestValue.md) | Map of requests | [optional] |



## getApiUsage

> GetApiUsage200Response getApiUsage(getApiUsageRequest)

API usage

The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AdvancedApi;
import com.twelvedata.client.api.AdvancedApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AdvancedApi apiInstance = new AdvancedApi(defaultClient);
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Output format
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>UTC</code> for datetime at universal UTC standard</li> <li>2. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            APIgetApiUsageRequest request = APIgetApiUsageRequest.newBuilder()
                .format(format)
                .delimiter(delimiter)
                .timezone(timezone)
                .build();
            GetApiUsage200Response result = apiInstance.getApiUsage(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedApi#getApiUsage");
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
| getApiUsageRequest | [**APIgetApiUsageRequest**](AdvancedApi.md#APIgetApiUsageRequest)|-|-|

### Return type

[**GetApiUsage200Response**](GetApiUsage200Response.md)


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

## getApiUsageWithHttpInfo

> ApiResponse<GetApiUsage200Response> getApiUsage getApiUsageWithHttpInfo(getApiUsageRequest)

API usage

The API Usage endpoint provides detailed information on your current API usage statistics. It returns data such as the number of requests made, remaining requests, and the reset time for your usage limits. This endpoint is essential for monitoring and managing your API consumption to ensure you stay within your allocated limits.

### Example

```java
// Import classes:
import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;
import com.twelvedata.client.ApiResponse;
import com.twelvedata.client.Configuration;
import com.twelvedata.client.auth.*;
import com.twelvedata.client.models.*;
import com.twelvedata.client.api.AdvancedApi;
import com.twelvedata.client.api.AdvancedApi.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.twelvedata.com");
        
        // Configure API key authorization: authorizationHeader
        ApiKeyAuth authorizationHeader = (ApiKeyAuth) defaultClient.getAuthentication("authorizationHeader");
        authorizationHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //authorizationHeader.setApiKeyPrefix("Token");

        AdvancedApi apiInstance = new AdvancedApi(defaultClient);
        FormatEnum format = FormatEnum.fromValue("JSON"); // FormatEnum | Output format
        String delimiter = ";"; // String | Specify the delimiter used when downloading the CSV file
        String timezone = "UTC"; // String | Timezone at which output datetime will be displayed. Supports: <ul> <li>1. <code>UTC</code> for datetime at universal UTC standard</li> <li>2. Timezone name according to the IANA Time Zone Database. E.g. <code>America/New_York</code>, <code>Asia/Singapore</code>. Full list of timezones can be found <a href=\"https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\" target=\"blank\">here</a>.</li> </ul> <i>Take note that the IANA Timezone name is case-sensitive</i>
        try {
            APIgetApiUsageRequest request = APIgetApiUsageRequest.newBuilder()
                .format(format)
                .delimiter(delimiter)
                .timezone(timezone)
                .build();
            ApiResponse<GetApiUsage200Response> response = apiInstance.getApiUsageWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedApi#getApiUsage");
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
| getApiUsageRequest | [**APIgetApiUsageRequest**](AdvancedApi.md#APIgetApiUsageRequest)|-|-|

### Return type

ApiResponse<[**GetApiUsage200Response**](GetApiUsage200Response.md)>


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


<a id="APIgetApiUsageRequest"></a>
## APIgetApiUsageRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **format** | [**FormatEnum**](.md) | Output format | [optional] [default to JSON] [enum: JSON, CSV] |
| **delimiter** | **String** | Specify the delimiter used when downloading the CSV file | [optional] [default to ;] |
| **timezone** | **String** | Timezone at which output datetime will be displayed. Supports: &lt;ul&gt; &lt;li&gt;1. &lt;code&gt;UTC&lt;/code&gt; for datetime at universal UTC standard&lt;/li&gt; &lt;li&gt;2. Timezone name according to the IANA Time Zone Database. E.g. &lt;code&gt;America/New_York&lt;/code&gt;, &lt;code&gt;Asia/Singapore&lt;/code&gt;. Full list of timezones can be found &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot; target&#x3D;\&quot;blank\&quot;&gt;here&lt;/a&gt;.&lt;/li&gt; &lt;/ul&gt; &lt;i&gt;Take note that the IANA Timezone name is case-sensitive&lt;/i&gt; | [optional] [default to UTC] |


