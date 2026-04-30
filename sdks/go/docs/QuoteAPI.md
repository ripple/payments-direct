# \QuoteAPI

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateQuoteCollectionV2**](QuoteAPI.md#CreateQuoteCollectionV2) | **Post** /v3/quotes/quote-collection | Create quote collection
[**GetQuoteCollectionV2**](QuoteAPI.md#GetQuoteCollectionV2) | **Get** /v3/quotes/quote-collection/{quote-collection-id} | Get quote collection
[**GetQuoteV2**](QuoteAPI.md#GetQuoteV2) | **Get** /v3/quotes/{quote-id} | Get a quote



## CreateQuoteCollectionV2

> QuoteCollectionV2 CreateQuoteCollectionV2(ctx).QuoteCollectionRequestV2(quoteCollectionRequestV2).Execute()

Create quote collection



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
	quoteCollectionRequestV2 := *openapiclient.NewQuoteCollectionRequestV2(float64(123.45), openapiclient.QuoteAmountType("SOURCE_AMOUNT"), "USD", "MXN", "PRE_FUNDING") // QuoteCollectionRequestV2 | Create quote collection request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QuoteAPI.CreateQuoteCollectionV2(context.Background()).QuoteCollectionRequestV2(quoteCollectionRequestV2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuoteAPI.CreateQuoteCollectionV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateQuoteCollectionV2`: QuoteCollectionV2
	fmt.Fprintf(os.Stdout, "Response from `QuoteAPI.CreateQuoteCollectionV2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateQuoteCollectionV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteCollectionRequestV2** | [**QuoteCollectionRequestV2**](QuoteCollectionRequestV2.md) | Create quote collection request | 

### Return type

[**QuoteCollectionV2**](QuoteCollectionV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetQuoteCollectionV2

> QuoteCollectionV2 GetQuoteCollectionV2(ctx, quoteCollectionId).Execute()

Get quote collection



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
	quoteCollectionId := "11111111-aaaa-2222-bbbb-222222222222" // string | The unique identifier of the quote collection you want to retrieve

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QuoteAPI.GetQuoteCollectionV2(context.Background(), quoteCollectionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuoteAPI.GetQuoteCollectionV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQuoteCollectionV2`: QuoteCollectionV2
	fmt.Fprintf(os.Stdout, "Response from `QuoteAPI.GetQuoteCollectionV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**quoteCollectionId** | **string** | The unique identifier of the quote collection you want to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetQuoteCollectionV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**QuoteCollectionV2**](QuoteCollectionV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetQuoteV2

> QuoteV2 GetQuoteV2(ctx, quoteId).Execute()

Get a quote



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
	quoteId := "22222222-aaaa-2222-bbbb-222222222222" // string | The unique identifier of the quote to retrieve

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QuoteAPI.GetQuoteV2(context.Background(), quoteId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuoteAPI.GetQuoteV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQuoteV2`: QuoteV2
	fmt.Fprintf(os.Stdout, "Response from `QuoteAPI.GetQuoteV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**quoteId** | **string** | The unique identifier of the quote to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetQuoteV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**QuoteV2**](QuoteV2.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

