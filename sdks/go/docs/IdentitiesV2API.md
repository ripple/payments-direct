# \IdentitiesV2API

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIdentityV2**](IdentitiesV2API.md#CreateIdentityV2) | **Post** /v2/identities | Create a new identity
[**DeactivateIdentityV2**](IdentitiesV2API.md#DeactivateIdentityV2) | **Delete** /v2/identities/{identity-id} | Delete an identity
[**GetIdentitiesV2**](IdentitiesV2API.md#GetIdentitiesV2) | **Get** /v2/identities | Get a list of identities
[**GetIdentityByIdV2**](IdentitiesV2API.md#GetIdentityByIdV2) | **Get** /v2/identities/{identity-id} | Get an identity by ID



## CreateIdentityV2

> CreateIdentityResponse CreateIdentityV2(ctx).CreateIdentityRequestV2(createIdentityRequestV2).Execute()

Create a new identity



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID/paymentsdirect"
)

func main() {
	createIdentityRequestV2 := *openapiclient.NewCreateIdentityRequestV2(map[string]interface{}{"key": interface{}(123)}, openapiclient.identity-type-v2("SENDER"), openapiclient.useCaseType("INDIVIDUAL")) // CreateIdentityRequestV2 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV2API.CreateIdentityV2(context.Background()).CreateIdentityRequestV2(createIdentityRequestV2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV2API.CreateIdentityV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateIdentityV2`: CreateIdentityResponse
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV2API.CreateIdentityV2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateIdentityV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createIdentityRequestV2** | [**CreateIdentityRequestV2**](CreateIdentityRequestV2.md) |  | 

### Return type

[**CreateIdentityResponse**](CreateIdentityResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeactivateIdentityV2

> DeactivateIdentityV2(ctx, identityId).Execute()

Delete an identity



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID/paymentsdirect"
)

func main() {
	identityId := "146f3c51-c313-47ce-b6f2-691c5a238b3e" // string | Unique UUID string that maps to the identity to be deleted.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.IdentitiesV2API.DeactivateIdentityV2(context.Background(), identityId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV2API.DeactivateIdentityV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | Unique UUID string that maps to the identity to be deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeactivateIdentityV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetIdentitiesV2

> ListIdentitiesResponseV2 GetIdentitiesV2(ctx).IdentityType(identityType).NickName(nickName).Execute()

Get a list of identities



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID/paymentsdirect"
)

func main() {
	identityType := openapiclient.identity-type-v2("SENDER") // IdentityTypeV2 | The type of identities you want to retrieve (optional)
	nickName := "Successful Beneficiary" // string | The nickname for the identity provided at the time of identity creation (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV2API.GetIdentitiesV2(context.Background()).IdentityType(identityType).NickName(nickName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV2API.GetIdentitiesV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetIdentitiesV2`: ListIdentitiesResponseV2
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV2API.GetIdentitiesV2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetIdentitiesV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityType** | [**IdentityTypeV2**](IdentityTypeV2.md) | The type of identities you want to retrieve | 
 **nickName** | **string** | The nickname for the identity provided at the time of identity creation | 

### Return type

[**ListIdentitiesResponseV2**](ListIdentitiesResponseV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetIdentityByIdV2

> IdentityResponseV2 GetIdentityByIdV2(ctx, identityId).Version(version).Execute()

Get an identity by ID



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID/paymentsdirect"
)

func main() {
	identityId := "146f3c51-c313-47ce-b6f2-691c5a238b3e" // string | The ID of the identity to get.
	version := int32(2) // int32 | Version of the identity you want to retrieve.  **Note**: If you don't specify a version, the latest version of the identity is returned.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV2API.GetIdentityByIdV2(context.Background(), identityId).Version(version).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV2API.GetIdentityByIdV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetIdentityByIdV2`: IdentityResponseV2
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV2API.GetIdentityByIdV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | The ID of the identity to get. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetIdentityByIdV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **version** | **int32** | Version of the identity you want to retrieve.  **Note**: If you don&#39;t specify a version, the latest version of the identity is returned.  | 

### Return type

[**IdentityResponseV2**](IdentityResponseV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

