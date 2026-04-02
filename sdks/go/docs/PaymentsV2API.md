# \PaymentsV2API

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreatePaymentV2**](PaymentsV2API.md#CreatePaymentV2) | **Post** /v3/payments | Create payment V2
[**GetPaymentByIdV2**](PaymentsV2API.md#GetPaymentByIdV2) | **Get** /v3/payments/{paymentId} | Get a payment by ID V2
[**GetPaymentStateTransitionsByIdV2**](PaymentsV2API.md#GetPaymentStateTransitionsByIdV2) | **Get** /v3/payments/{paymentId}/states | Get state transitions by payment ID
[**SearchPaymentsV2**](PaymentsV2API.md#SearchPaymentsV2) | **Post** /v3/payments/filter | Search payments V2
[**UpdatePaymentLabelsV2**](PaymentsV2API.md#UpdatePaymentLabelsV2) | **Patch** /v3/payments/{paymentId}/labels | Update payment labels



## CreatePaymentV2

> PaymentV2 CreatePaymentV2(ctx).PaymentRequestV2(paymentRequestV2).Execute()

Create payment V2



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
	paymentRequestV2 := *openapiclient.NewPaymentRequestV2("7ea3399c-1234-5678-8d8f-d320ea406630", "7ea3399c-1234-5678-8d8f-d320ea406630", "7ea3399c-1234-5678-8d8f-d320ea406630") // PaymentRequestV2 | create payment request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsV2API.CreatePaymentV2(context.Background()).PaymentRequestV2(paymentRequestV2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsV2API.CreatePaymentV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreatePaymentV2`: PaymentV2
	fmt.Fprintf(os.Stdout, "Response from `PaymentsV2API.CreatePaymentV2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreatePaymentV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequestV2** | [**PaymentRequestV2**](PaymentRequestV2.md) | create payment request | 

### Return type

[**PaymentV2**](PaymentV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPaymentByIdV2

> PaymentWithDetailsV2 GetPaymentByIdV2(ctx, paymentId).Execute()

Get a payment by ID V2



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
	paymentId := "7ea3399c-1234-5678-8d8f-d320ea406630" // string | Unique identifier of the payment to get.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsV2API.GetPaymentByIdV2(context.Background(), paymentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsV2API.GetPaymentByIdV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPaymentByIdV2`: PaymentWithDetailsV2
	fmt.Fprintf(os.Stdout, "Response from `PaymentsV2API.GetPaymentByIdV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**paymentId** | **string** | Unique identifier of the payment to get. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPaymentByIdV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**PaymentWithDetailsV2**](PaymentWithDetailsV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPaymentStateTransitionsByIdV2

> StateTransitionsResponseV2 GetPaymentStateTransitionsByIdV2(ctx, paymentId).Execute()

Get state transitions by payment ID



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
	paymentId := "7ea3399c-1234-5678-8d8f-d320ea406630" // string | Unique identifier of the payment for which you want to get state transition information.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsV2API.GetPaymentStateTransitionsByIdV2(context.Background(), paymentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsV2API.GetPaymentStateTransitionsByIdV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPaymentStateTransitionsByIdV2`: StateTransitionsResponseV2
	fmt.Fprintf(os.Stdout, "Response from `PaymentsV2API.GetPaymentStateTransitionsByIdV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**paymentId** | **string** | Unique identifier of the payment for which you want to get state transition information. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPaymentStateTransitionsByIdV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StateTransitionsResponseV2**](StateTransitionsResponseV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchPaymentsV2

> PaymentsResponseV2 SearchPaymentsV2(ctx).SearchPaymentsRequestV2(searchPaymentsRequestV2).Execute()

Search payments V2



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
	searchPaymentsRequestV2 := *openapiclient.NewSearchPaymentsRequestV2() // SearchPaymentsRequestV2 | Search payments request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsV2API.SearchPaymentsV2(context.Background()).SearchPaymentsRequestV2(searchPaymentsRequestV2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsV2API.SearchPaymentsV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchPaymentsV2`: PaymentsResponseV2
	fmt.Fprintf(os.Stdout, "Response from `PaymentsV2API.SearchPaymentsV2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchPaymentsV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchPaymentsRequestV2** | [**SearchPaymentsRequestV2**](SearchPaymentsRequestV2.md) | Search payments request | 

### Return type

[**PaymentsResponseV2**](PaymentsResponseV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdatePaymentLabelsV2

> UpdatePaymentLabelsResponse UpdatePaymentLabelsV2(ctx, paymentId).UpdatePaymentLabelsRequest(updatePaymentLabelsRequest).Execute()

Update payment labels



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
	paymentId := "7ea3399c-1234-5678-8d8f-d320ea406630" // string | The unique ID that identifies the payment for which you want to update labels.
	updatePaymentLabelsRequest := *openapiclient.NewUpdatePaymentLabelsRequest() // UpdatePaymentLabelsRequest | Labels to add to or remove from the payment.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsV2API.UpdatePaymentLabelsV2(context.Background(), paymentId).UpdatePaymentLabelsRequest(updatePaymentLabelsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsV2API.UpdatePaymentLabelsV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdatePaymentLabelsV2`: UpdatePaymentLabelsResponse
	fmt.Fprintf(os.Stdout, "Response from `PaymentsV2API.UpdatePaymentLabelsV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**paymentId** | **string** | The unique ID that identifies the payment for which you want to update labels. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdatePaymentLabelsV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updatePaymentLabelsRequest** | [**UpdatePaymentLabelsRequest**](UpdatePaymentLabelsRequest.md) | Labels to add to or remove from the payment. | 

### Return type

[**UpdatePaymentLabelsResponse**](UpdatePaymentLabelsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

