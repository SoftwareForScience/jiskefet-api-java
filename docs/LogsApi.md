# LogsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logsGet**](LogsApi.md#logsGet) | **GET** /logs | 
[**logsIdGet**](LogsApi.md#logsIdGet) | **GET** /logs/{id} | 
[**logsIdRunsPatch**](LogsApi.md#logsIdRunsPatch) | **PATCH** /logs/{id}/runs | 
[**logsPost**](LogsApi.md#logsPost) | **POST** /logs | 


<a name="logsGet"></a>
# **logsGet**
> Object logsGet(orderBy, orderDirection, pageSize, pageNumber, logId, searchterm, subtype, origin, startCreationTime, endCreationTime)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
String orderBy = "orderBy_example"; // String | On which field to order on.
String orderDirection = "orderDirection_example"; // String | The order direction, either ascending or descending.
String pageSize = "25"; // String | The maximum amount of logs in each result.
String pageNumber = "1"; // String | The current page, i.e. the offset in the result set based on pageSize.
String logId = "logId_example"; // String | The id of the log.
String searchterm = "searchterm_example"; // String | Search for a term that exists in the title field of a log.
String subtype = "subtype_example"; // String | The subtype of the log.
String origin = "origin_example"; // String | The origin/creator of the log.
String startCreationTime = "startCreationTime_example"; // String | The lower bound of the creation time filter range.
String endCreationTime = "endCreationTime_example"; // String | The upper bound of the creation time filter range.
try {
    Object result = apiInstance.logsGet(orderBy, orderDirection, pageSize, pageNumber, logId, searchterm, subtype, origin, startCreationTime, endCreationTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#logsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderBy** | **String**| On which field to order on. | [optional]
 **orderDirection** | **String**| The order direction, either ascending or descending. | [optional] [enum: ASC, DESC]
 **pageSize** | **String**| The maximum amount of logs in each result. | [optional] [default to 25]
 **pageNumber** | **String**| The current page, i.e. the offset in the result set based on pageSize. | [optional] [default to 1]
 **logId** | **String**| The id of the log. | [optional]
 **searchterm** | **String**| Search for a term that exists in the title field of a log. | [optional]
 **subtype** | **String**| The subtype of the log. | [optional] [enum: run, subsystem, announcement, intervention, comment]
 **origin** | **String**| The origin/creator of the log. | [optional] [enum: human, process]
 **startCreationTime** | **String**| The lower bound of the creation time filter range. | [optional]
 **endCreationTime** | **String**| The upper bound of the creation time filter range. | [optional]

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logsIdGet"></a>
# **logsIdGet**
> Object logsIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.logsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#logsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logsIdRunsPatch"></a>
# **logsIdRunsPatch**
> Object logsIdRunsPatch(linkRunToLogDto, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
LinkRunToLogDto linkRunToLogDto = new LinkRunToLogDto(); // LinkRunToLogDto | 
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.logsIdRunsPatch(linkRunToLogDto, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#logsIdRunsPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkRunToLogDto** | [**LinkRunToLogDto**](LinkRunToLogDto.md)|  |
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logsPost"></a>
# **logsPost**
> Object logsPost(createLogDto)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
CreateLogDto createLogDto = new CreateLogDto(); // CreateLogDto | 
try {
    Object result = apiInstance.logsPost(createLogDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#logsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createLogDto** | [**CreateLogDto**](CreateLogDto.md)|  |

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

