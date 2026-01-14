# \IdentitiesV3API

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateFinancialInstrument**](IdentitiesV3API.md#CreateFinancialInstrument) | **Post** /v3/identities/{identity-id}/financial-instruments | Add a financial instrument (v3)
[**CreateIdentity**](IdentitiesV3API.md#CreateIdentity) | **Post** /v3/identities | Create an identity (v3)
[**DeactivateFinancialInstrumentV3**](IdentitiesV3API.md#DeactivateFinancialInstrumentV3) | **Delete** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Deactivate a Financial Instrument (v3)
[**DeactivateIdentityV3**](IdentitiesV3API.md#DeactivateIdentityV3) | **Delete** /v3/identities/{identity-id} | Deactivate an identity (v3)
[**GetFinancialInstrumentById**](IdentitiesV3API.md#GetFinancialInstrumentById) | **Get** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Get a financial instrument by ID (v3)
[**GetFinancialInstruments**](IdentitiesV3API.md#GetFinancialInstruments) | **Get** /v3/identities/{identity-id}/financial-instruments | Get a list of financial instruments of the identity (v3)
[**GetIdentities**](IdentitiesV3API.md#GetIdentities) | **Get** /v3/identities | Get a list of identities (v3)
[**GetIdentityById**](IdentitiesV3API.md#GetIdentityById) | **Get** /v3/identities/{identity-id} | Get an identity by ID (v3)
[**PutFinancialInstrument**](IdentitiesV3API.md#PutFinancialInstrument) | **Put** /v3/identities/{identity-id}/financial-instruments/{financial-instrument-id} | Update a financial instrument (v3)
[**PutIdentity**](IdentitiesV3API.md#PutIdentity) | **Put** /v3/identities/{identity-id} | Update an identity (v3)



## CreateFinancialInstrument

> CreateFinancialInstrumentResponse CreateFinancialInstrument(ctx, identityId).RippleFinancialInstrument(rippleFinancialInstrument).Execute()

Add a financial instrument (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | Unique identifier of the identity that will own the financial instrument.
	rippleFinancialInstrument := *openapiclient.NewRippleFinancialInstrument("MXN", "BR_PIX") // RippleFinancialInstrument | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.CreateFinancialInstrument(context.Background(), identityId).RippleFinancialInstrument(rippleFinancialInstrument).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.CreateFinancialInstrument``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateFinancialInstrument`: CreateFinancialInstrumentResponse
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.CreateFinancialInstrument`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | Unique identifier of the identity that will own the financial instrument. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateFinancialInstrumentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **rippleFinancialInstrument** | [**RippleFinancialInstrument**](RippleFinancialInstrument.md) |  | 

### Return type

[**CreateFinancialInstrumentResponse**](CreateFinancialInstrumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateIdentity

> CreateIdentityResponseV3 CreateIdentity(ctx).CreateIdentityRequestV3(createIdentityRequestV3).Execute()

Create an identity (v3)



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
	createIdentityRequestV3 := *openapiclient.NewCreateIdentityRequestV3("BUSINESS", "BENEFICIARY") // CreateIdentityRequestV3 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.CreateIdentity(context.Background()).CreateIdentityRequestV3(createIdentityRequestV3).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.CreateIdentity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateIdentity`: CreateIdentityResponseV3
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.CreateIdentity`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateIdentityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createIdentityRequestV3** | [**CreateIdentityRequestV3**](CreateIdentityRequestV3.md) |  | 

### Return type

[**CreateIdentityResponseV3**](CreateIdentityResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeactivateFinancialInstrumentV3

> DeactivateFinancialInstrumentV3(ctx, identityId, financialInstrumentId).Execute()

Deactivate a Financial Instrument (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | The unique ID of the identity.
	financialInstrumentId := "c7e2f5b4-d1a2-4c3a-9e1b-4d5c6f7e8a9d" // string | The ID of the financial instrument to deactivate.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.IdentitiesV3API.DeactivateFinancialInstrumentV3(context.Background(), identityId, financialInstrumentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.DeactivateFinancialInstrumentV3``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | The unique ID of the identity. | 
**financialInstrumentId** | **string** | The ID of the financial instrument to deactivate. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeactivateFinancialInstrumentV3Request struct via the builder pattern


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


## DeactivateIdentityV3

> DeactivateIdentityV3(ctx, identityId).Execute()

Deactivate an identity (v3)



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
	identityId := "146f3c51-c313-47ce-b6f2-691c5a238b3e" // string | ID of the identity to deactivate.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.IdentitiesV3API.DeactivateIdentityV3(context.Background(), identityId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.DeactivateIdentityV3``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | ID of the identity to deactivate. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeactivateIdentityV3Request struct via the builder pattern


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


## GetFinancialInstrumentById

> GetFinancialInstrumentResponse GetFinancialInstrumentById(ctx, identityId, financialInstrumentId).Version(version).ExpandIdentity(expandIdentity).Execute()

Get a financial instrument by ID (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | Unique identifier of the identity whose instruments you want to list.
	financialInstrumentId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | The ID of the financial instrument of the identity.
	version := "2" // string | Version of the identity (optional)
	expandIdentity := true // bool | Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.GetFinancialInstrumentById(context.Background(), identityId, financialInstrumentId).Version(version).ExpandIdentity(expandIdentity).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.GetFinancialInstrumentById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFinancialInstrumentById`: GetFinancialInstrumentResponse
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.GetFinancialInstrumentById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | Unique identifier of the identity whose instruments you want to list. | 
**financialInstrumentId** | **string** | The ID of the financial instrument of the identity. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFinancialInstrumentByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **version** | **string** | Version of the identity | 
 **expandIdentity** | **bool** | Optional parameter to expand the financial instrument details. If set to true, the details about the identity will be included in the response.  | 

### Return type

[**GetFinancialInstrumentResponse**](GetFinancialInstrumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetFinancialInstruments

> ListFinancialInstrumentsResponse GetFinancialInstruments(ctx, identityId).Version(version).NextToken(nextToken).Limit(limit).Execute()

Get a list of financial instruments of the identity (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | Unique UUID string that maps to an identity
	version := "2" // string | Version of the identity (optional)
	nextToken := "eyJrZXkxIjoidmFsdWVfMSIsImtleTIiOiJ2YWx1ZTIifQ==" // string | The token to use for the next page of results. If provided, the API will return financial instruments after this token. (optional)
	limit := int32(20) // int32 | The maximum number of financial instruments to return. Default is 10, maximum is 100. (optional) (default to 10)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.GetFinancialInstruments(context.Background(), identityId).Version(version).NextToken(nextToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.GetFinancialInstruments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFinancialInstruments`: ListFinancialInstrumentsResponse
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.GetFinancialInstruments`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | Unique UUID string that maps to an identity | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFinancialInstrumentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **version** | **string** | Version of the identity | 
 **nextToken** | **string** | The token to use for the next page of results. If provided, the API will return financial instruments after this token. | 
 **limit** | **int32** | The maximum number of financial instruments to return. Default is 10, maximum is 100. | [default to 10]

### Return type

[**ListFinancialInstrumentsResponse**](ListFinancialInstrumentsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetIdentities

> ListIdentitiesResponseV3 GetIdentities(ctx).PaymentRole(paymentRole).NickName(nickName).Limit(limit).NextToken(nextToken).Execute()

Get a list of identities (v3)



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
	paymentRole := "BENEFICIARY" // string | Filter by payment role. (optional)
	nickName := "Alice" // string | Filter by nickname. (optional)
	limit := int32(20) // int32 | Maximum number of identities to return. Default value is 10, maximum is 100. (optional) (default to 10)
	nextToken := "eyJrZXkxIjoidmFsdWVfMSIsImtleTIiOiJ2YWx1ZTIifQ==" // string | Opaque token to fetch the next page of results. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.GetIdentities(context.Background()).PaymentRole(paymentRole).NickName(nickName).Limit(limit).NextToken(nextToken).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.GetIdentities``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetIdentities`: ListIdentitiesResponseV3
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.GetIdentities`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetIdentitiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRole** | **string** | Filter by payment role. | 
 **nickName** | **string** | Filter by nickname. | 
 **limit** | **int32** | Maximum number of identities to return. Default value is 10, maximum is 100. | [default to 10]
 **nextToken** | **string** | Opaque token to fetch the next page of results. | 

### Return type

[**ListIdentitiesResponseV3**](ListIdentitiesResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetIdentityById

> GetIdentityResponseV3 GetIdentityById(ctx, identityId).Version(version).Execute()

Get an identity by ID (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | The ID of the identity to retrieve.
	version := "2" // string | Specific version to retrieve. If omitted, returns the latest version. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.GetIdentityById(context.Background(), identityId).Version(version).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.GetIdentityById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetIdentityById`: GetIdentityResponseV3
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.GetIdentityById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | The ID of the identity to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetIdentityByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **version** | **string** | Specific version to retrieve. If omitted, returns the latest version. | 

### Return type

[**GetIdentityResponseV3**](GetIdentityResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PutFinancialInstrument

> UpdateFinancialInstrumentResponse PutFinancialInstrument(ctx, identityId, financialInstrumentId).PutRippleFinancialInstrument(putRippleFinancialInstrument).Execute()

Update a financial instrument (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | The unique ID of the identity.
	financialInstrumentId := "c7e2f5b4-d1a2-4c3a-9e1b-4d5c6f7e8a9d" // string | The ID of the financial instrument to update.
	putRippleFinancialInstrument := *openapiclient.NewPutRippleFinancialInstrument() // PutRippleFinancialInstrument | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.PutFinancialInstrument(context.Background(), identityId, financialInstrumentId).PutRippleFinancialInstrument(putRippleFinancialInstrument).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.PutFinancialInstrument``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutFinancialInstrument`: UpdateFinancialInstrumentResponse
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.PutFinancialInstrument`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | The unique ID of the identity. | 
**financialInstrumentId** | **string** | The ID of the financial instrument to update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPutFinancialInstrumentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **putRippleFinancialInstrument** | [**PutRippleFinancialInstrument**](PutRippleFinancialInstrument.md) |  | 

### Return type

[**UpdateFinancialInstrumentResponse**](UpdateFinancialInstrumentResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PutIdentity

> GetIdentityResponseV3 PutIdentity(ctx, identityId).PutIdentityRequestV3(putIdentityRequestV3).Execute()

Update an identity (v3)



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
	identityId := "2f4ac57f-c5ba-4051-b51f-b3565778717b" // string | The ID of the identity to update.
	putIdentityRequestV3 := *openapiclient.NewPutIdentityRequestV3() // PutIdentityRequestV3 | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IdentitiesV3API.PutIdentity(context.Background(), identityId).PutIdentityRequestV3(putIdentityRequestV3).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IdentitiesV3API.PutIdentity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutIdentity`: GetIdentityResponseV3
	fmt.Fprintf(os.Stdout, "Response from `IdentitiesV3API.PutIdentity`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**identityId** | **string** | The ID of the identity to update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPutIdentityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **putIdentityRequestV3** | [**PutIdentityRequestV3**](PutIdentityRequestV3.md) |  | 

### Return type

[**GetIdentityResponseV3**](GetIdentityResponseV3.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

