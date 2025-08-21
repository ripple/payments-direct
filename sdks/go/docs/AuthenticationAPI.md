# \AuthenticationAPI

All URIs are relative to *https://api.test.ripple.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Authenticate**](AuthenticationAPI.md#Authenticate) | **Post** /v2/oauth/token | Request an access token
[**TestAuthToken**](AuthenticationAPI.md#TestAuthToken) | **Get** /v2/oauth/token/test | Test access token



## Authenticate

> AuthenticationResponse Authenticate(ctx).AuthenticationRequest(authenticationRequest).Authorization(authorization).Execute()

Request an access token



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
	authenticationRequest := *openapiclient.NewAuthenticationRequest("{YOUR_CLIENT_ID}", "{YOUR_CLIENT_SECRET}", "urn:ripplexcurrent-test:{YOUR_TENANT_ID}", "client_credentials") // AuthenticationRequest | 
	authorization := "Basic ZGVtbzpwQDU1dzByZA==" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthenticationAPI.Authenticate(context.Background()).AuthenticationRequest(authenticationRequest).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationAPI.Authenticate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `Authenticate`: AuthenticationResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthenticationAPI.Authenticate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthenticateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md) |  | 
 **authorization** | **string** |  | 

### Return type

[**AuthenticationResponse**](AuthenticationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TestAuthToken

> []ValidateTokenResponse TestAuthToken(ctx).Execute()

Test access token



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthenticationAPI.TestAuthToken(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationAPI.TestAuthToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TestAuthToken`: []ValidateTokenResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthenticationAPI.TestAuthToken`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiTestAuthTokenRequest struct via the builder pattern


### Return type

[**[]ValidateTokenResponse**](ValidateTokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

