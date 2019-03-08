# RunsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runsGet**](RunsApi.md#runsGet) | **GET** /runs | 
[**runsIdGet**](RunsApi.md#runsIdGet) | **GET** /runs/{id} | 
[**runsIdLogsPatch**](RunsApi.md#runsIdLogsPatch) | **PATCH** /runs/{id}/logs | 
[**runsPost**](RunsApi.md#runsPost) | **POST** /runs | 


<a name="runsGet"></a>
# **runsGet**
> Object runsGet(orderBy, orderDirection, pageSize, pageNumber, runNumber, startTimeO2Start, endTimeO2Start, startTimeTrgStart, endTimeTrgStart, startTimeTrgEnd, endTimeTrgEnd, startTimeO2End, endTimeO2End, activityId, runType, runQuality)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RunsApi apiInstance = new RunsApi();
String orderBy = "orderBy_example"; // String | On which field to order on.
String orderDirection = "orderDirection_example"; // String | The order direction, either ascending or descending.
String pageSize = "25"; // String | The maximum amount of logs in each result.
String pageNumber = "1"; // String | The current page, i.e. the offset in the result set based on pageSize.
String runNumber = "runNumber_example"; // String | The id of the log.
OffsetDateTime startTimeO2Start = OffsetDateTime.now(); // OffsetDateTime | The lower bound of the timeO2Start filter range.
OffsetDateTime endTimeO2Start = OffsetDateTime.now(); // OffsetDateTime | The upper bound of the timeO2Start filter range.
OffsetDateTime startTimeTrgStart = OffsetDateTime.now(); // OffsetDateTime | The lower bound of the timeTrgStart filter range.
OffsetDateTime endTimeTrgStart = OffsetDateTime.now(); // OffsetDateTime | The upper bound of the timeTrgStart filter range.
OffsetDateTime startTimeTrgEnd = OffsetDateTime.now(); // OffsetDateTime | The lower bound of the timeTrgEnd filter range.
OffsetDateTime endTimeTrgEnd = OffsetDateTime.now(); // OffsetDateTime | The upper bound of the timeTrgEnd filter range.
OffsetDateTime startTimeO2End = OffsetDateTime.now(); // OffsetDateTime | The lower bound of the timeO2End filter range.
OffsetDateTime endTimeO2End = OffsetDateTime.now(); // OffsetDateTime | The upper bound of the timeO2End filter range.
String activityId = "activityId_example"; // String | The id of the activity.
Integer runType = 56; // Integer | The type of the run.
Integer runQuality = 56; // Integer | The quality of the run.
try {
    Object result = apiInstance.runsGet(orderBy, orderDirection, pageSize, pageNumber, runNumber, startTimeO2Start, endTimeO2Start, startTimeTrgStart, endTimeTrgStart, startTimeTrgEnd, endTimeTrgEnd, startTimeO2End, endTimeO2End, activityId, runType, runQuality);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsGet");
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
 **runNumber** | **String**| The id of the log. | [optional]
 **startTimeO2Start** | **OffsetDateTime**| The lower bound of the timeO2Start filter range. | [optional]
 **endTimeO2Start** | **OffsetDateTime**| The upper bound of the timeO2Start filter range. | [optional]
 **startTimeTrgStart** | **OffsetDateTime**| The lower bound of the timeTrgStart filter range. | [optional]
 **endTimeTrgStart** | **OffsetDateTime**| The upper bound of the timeTrgStart filter range. | [optional]
 **startTimeTrgEnd** | **OffsetDateTime**| The lower bound of the timeTrgEnd filter range. | [optional]
 **endTimeTrgEnd** | **OffsetDateTime**| The upper bound of the timeTrgEnd filter range. | [optional]
 **startTimeO2End** | **OffsetDateTime**| The lower bound of the timeO2End filter range. | [optional]
 **endTimeO2End** | **OffsetDateTime**| The upper bound of the timeO2End filter range. | [optional]
 **activityId** | **String**| The id of the activity. | [optional]
 **runType** | **Integer**| The type of the run. | [optional]
 **runQuality** | **Integer**| The quality of the run. | [optional]

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runsIdGet"></a>
# **runsIdGet**
> Object runsIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RunsApi apiInstance = new RunsApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.runsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsIdGet");
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

<a name="runsIdLogsPatch"></a>
# **runsIdLogsPatch**
> Object runsIdLogsPatch(linkLogToRunDto, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RunsApi apiInstance = new RunsApi();
LinkLogToRunDto linkLogToRunDto = new LinkLogToRunDto(); // LinkLogToRunDto | 
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.runsIdLogsPatch(linkLogToRunDto, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsIdLogsPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkLogToRunDto** | [**LinkLogToRunDto**](LinkLogToRunDto.md)|  |
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runsPost"></a>
# **runsPost**
> Object runsPost(createRunDto)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RunsApi apiInstance = new RunsApi();
CreateRunDto createRunDto = new CreateRunDto(); // CreateRunDto | 
try {
    Object result = apiInstance.runsPost(createRunDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRunDto** | [**CreateRunDto**](CreateRunDto.md)|  |

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

