# AuthenticationApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authGet**](AuthenticationApi.md#authGet) | **GET** /auth | Authenticate a user by giving an Authorization Grant.
[**profileGet**](AuthenticationApi.md#profileGet) | **GET** /profile | Returns the user&#39;s profile


<a name="authGet"></a>
# **authGet**
> Object authGet(grant)

Authenticate a user by giving an Authorization Grant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String grant = "grant_example"; // String | 
try {
    Object result = apiInstance.authGet(grant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profileGet"></a>
# **profileGet**
> Object profileGet()

Returns the user&#39;s profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Object result = apiInstance.profileGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#profileGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

