# OverviewApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**overviewGet**](OverviewApi.md#overviewGet) | **GET** /overview | 


<a name="overviewGet"></a>
# **overviewGet**
> Object overviewGet(timeRange)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OverviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

OverviewApi apiInstance = new OverviewApi();
String timeRange = "timeRange_example"; // String | In which time range the logs of eachsubsystem should be posted
try {
    Object result = apiInstance.overviewGet(timeRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OverviewApi#overviewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeRange** | **String**| In which time range the logs of eachsubsystem should be posted | [optional]

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

