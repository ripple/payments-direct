# \LedgerPublicAPI

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBalances**](LedgerPublicAPI.md#GetBalances) | **Get** /v2/balances | Get available balances



## GetBalances

> GetBalances200Response GetBalances(ctx).Currency(currency).Execute()

Get available balances

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
	currency := "currency_example" // string | The currency for which you want to get the balance. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LedgerPublicAPI.GetBalances(context.Background()).Currency(currency).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LedgerPublicAPI.GetBalances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBalances`: GetBalances200Response
	fmt.Fprintf(os.Stdout, "Response from `LedgerPublicAPI.GetBalances`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBalancesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string** | The currency for which you want to get the balance. | 

### Return type

[**GetBalances200Response**](GetBalances200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

