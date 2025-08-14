# \QuoteAPI

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateQuoteCollection**](QuoteAPI.md#CreateQuoteCollection) | **Post** /v2/quotes/quote-collection | Create quote collection
[**GetQuote**](QuoteAPI.md#GetQuote) | **Get** /v2/quotes/{quote-id} | Get quote
[**GetQuoteCollection**](QuoteAPI.md#GetQuoteCollection) | **Get** /v2/quotes/quote-collection/{quote-collection-id} | Get quote collection



## CreateQuoteCollection

> QuoteCollection CreateQuoteCollection(ctx).QuoteCollectionRequest(quoteCollectionRequest).Execute()

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
	quoteCollectionRequest := *openapiclient.NewQuoteCollectionRequest(float64(123.45), openapiclient.QuoteAmountType("SOURCE_AMOUNT"), "USD", "MXN", "BANK", "FUNDED") // QuoteCollectionRequest | Create quote collection request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QuoteAPI.CreateQuoteCollection(context.Background()).QuoteCollectionRequest(quoteCollectionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuoteAPI.CreateQuoteCollection``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateQuoteCollection`: QuoteCollection
	fmt.Fprintf(os.Stdout, "Response from `QuoteAPI.CreateQuoteCollection`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateQuoteCollectionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteCollectionRequest** | [**QuoteCollectionRequest**](QuoteCollectionRequest.md) | Create quote collection request | 

### Return type

[**QuoteCollection**](QuoteCollection.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetQuote

> Quote GetQuote(ctx, quoteId).Execute()

Get quote

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
	resp, r, err := apiClient.QuoteAPI.GetQuote(context.Background(), quoteId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuoteAPI.GetQuote``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQuote`: Quote
	fmt.Fprintf(os.Stdout, "Response from `QuoteAPI.GetQuote`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**quoteId** | **string** | The unique identifier of the quote to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetQuoteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Quote**](Quote.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetQuoteCollection

> QuoteCollection GetQuoteCollection(ctx, quoteCollectionId).Execute()

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
	resp, r, err := apiClient.QuoteAPI.GetQuoteCollection(context.Background(), quoteCollectionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QuoteAPI.GetQuoteCollection``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQuoteCollection`: QuoteCollection
	fmt.Fprintf(os.Stdout, "Response from `QuoteAPI.GetQuoteCollection`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**quoteCollectionId** | **string** | The unique identifier of the quote collection you want to retrieve | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetQuoteCollectionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**QuoteCollection**](QuoteCollection.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

