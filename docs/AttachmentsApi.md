# AttachmentsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentsIdLogsGet**](AttachmentsApi.md#attachmentsIdLogsGet) | **GET** /attachments/{id}/logs | 
[**attachmentsPost**](AttachmentsApi.md#attachmentsPost) | **POST** /attachments | 


<a name="attachmentsIdLogsGet"></a>
# **attachmentsIdLogsGet**
> Object attachmentsIdLogsGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.attachmentsIdLogsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#attachmentsIdLogsGet");
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

<a name="attachmentsPost"></a>
# **attachmentsPost**
> attachmentsPost(createAttachmentDto)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

AttachmentsApi apiInstance = new AttachmentsApi();
CreateAttachmentDto createAttachmentDto = new CreateAttachmentDto(); // CreateAttachmentDto | 
try {
    apiInstance.attachmentsPost(createAttachmentDto);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#attachmentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAttachmentDto** | [**CreateAttachmentDto**](CreateAttachmentDto.md)|  |

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

