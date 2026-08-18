# \PaymentsAPI

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreatePayment**](PaymentsAPI.md#CreatePayment) | **Post** /v2/payments | Create payment
[**GetPaymentById**](PaymentsAPI.md#GetPaymentById) | **Get** /v2/payments/{paymentId} | Get a payment by ID
[**GetPaymentStateTransitionsById**](PaymentsAPI.md#GetPaymentStateTransitionsById) | **Get** /v2/payments/{paymentId}/states | Get state transitions by payment ID
[**SearchPayments**](PaymentsAPI.md#SearchPayments) | **Post** /v2/payments/filter | Search payments
[**UpdatePaymentLabels**](PaymentsAPI.md#UpdatePaymentLabels) | **Patch** /v2/payments/{paymentId}/labels | Update payment labels



## CreatePayment

> Payment CreatePayment(ctx).PaymentRequest(paymentRequest).Execute()

Create payment



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
	paymentRequest := *openapiclient.NewPaymentRequest("7ea3399c-1234-5678-8d8f-d320ea406630", "7ea3399c-1234-5678-8d8f-d320ea406630") // PaymentRequest | create payment request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsAPI.CreatePayment(context.Background()).PaymentRequest(paymentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.CreatePayment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreatePayment`: Payment
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.CreatePayment`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreatePaymentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequest** | [**PaymentRequest**](PaymentRequest.md) | create payment request | 

### Return type

[**Payment**](Payment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPaymentById

> PaymentWithDetails GetPaymentById(ctx, paymentId).Execute()

Get a payment by ID



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
	resp, r, err := apiClient.PaymentsAPI.GetPaymentById(context.Background(), paymentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.GetPaymentById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPaymentById`: PaymentWithDetails
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.GetPaymentById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**paymentId** | **string** | Unique identifier of the payment to get. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPaymentByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**PaymentWithDetails**](PaymentWithDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPaymentStateTransitionsById

> StateTransitionsResponse GetPaymentStateTransitionsById(ctx, paymentId).Execute()

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
	resp, r, err := apiClient.PaymentsAPI.GetPaymentStateTransitionsById(context.Background(), paymentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.GetPaymentStateTransitionsById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPaymentStateTransitionsById`: StateTransitionsResponse
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.GetPaymentStateTransitionsById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**paymentId** | **string** | Unique identifier of the payment for which you want to get state transition information. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPaymentStateTransitionsByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StateTransitionsResponse**](StateTransitionsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchPayments

> PaymentsResponse SearchPayments(ctx).SearchPaymentsRequest(searchPaymentsRequest).Execute()

Search payments



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
	searchPaymentsRequest := *openapiclient.NewSearchPaymentsRequest() // SearchPaymentsRequest | Search payments request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsAPI.SearchPayments(context.Background()).SearchPaymentsRequest(searchPaymentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.SearchPayments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchPayments`: PaymentsResponse
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.SearchPayments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchPaymentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchPaymentsRequest** | [**SearchPaymentsRequest**](SearchPaymentsRequest.md) | Search payments request | 

### Return type

[**PaymentsResponse**](PaymentsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdatePaymentLabels

> UpdatePaymentLabelsResponse UpdatePaymentLabels(ctx, paymentId).UpdatePaymentLabelsRequest(updatePaymentLabelsRequest).Execute()

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
	resp, r, err := apiClient.PaymentsAPI.UpdatePaymentLabels(context.Background(), paymentId).UpdatePaymentLabelsRequest(updatePaymentLabelsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.UpdatePaymentLabels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdatePaymentLabels`: UpdatePaymentLabelsResponse
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.UpdatePaymentLabels`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**paymentId** | **string** | The unique ID that identifies the payment for which you want to update labels. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdatePaymentLabelsRequest struct via the builder pattern


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

