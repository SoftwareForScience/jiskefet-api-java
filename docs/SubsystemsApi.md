# SubsystemsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subsystemsGet**](SubsystemsApi.md#subsystemsGet) | **GET** /subsystems | 
[**subsystemsIdGet**](SubsystemsApi.md#subsystemsIdGet) | **GET** /subsystems/{id} | 


<a name="subsystemsGet"></a>
# **subsystemsGet**
> Object subsystemsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubsystemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

SubsystemsApi apiInstance = new SubsystemsApi();
try {
    Object result = apiInstance.subsystemsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsystemsApi#subsystemsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subsystemsIdGet"></a>
# **subsystemsIdGet**
> Object subsystemsIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubsystemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

SubsystemsApi apiInstance = new SubsystemsApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.subsystemsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsystemsApi#subsystemsIdGet");
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

