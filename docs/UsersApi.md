# UsersApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersIdGet**](UsersApi.md#usersIdGet) | **GET** /users/{id} | 
[**usersIdTokensGet**](UsersApi.md#usersIdTokensGet) | **GET** /users/{id}/tokens | 
[**usersIdTokensNewPost**](UsersApi.md#usersIdTokensNewPost) | **POST** /users/{id}/tokens/new | 


<a name="usersIdGet"></a>
# **usersIdGet**
> Object usersIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.usersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersIdGet");
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

<a name="usersIdTokensGet"></a>
# **usersIdTokensGet**
> Object usersIdTokensGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.usersIdTokensGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersIdTokensGet");
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

<a name="usersIdTokensNewPost"></a>
# **usersIdTokensNewPost**
> usersIdTokensNewPost(id, createSubSystemPermissionDto)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | 
CreateSubSystemPermissionDto createSubSystemPermissionDto = new CreateSubSystemPermissionDto(); // CreateSubSystemPermissionDto | 
try {
    apiInstance.usersIdTokensNewPost(id, createSubSystemPermissionDto);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersIdTokensNewPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **createSubSystemPermissionDto** | [**CreateSubSystemPermissionDto**](CreateSubSystemPermissionDto.md)|  |

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

