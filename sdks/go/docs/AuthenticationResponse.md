# AuthenticationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | Pointer to **string** | The bearer token you use when authenticating with a Ripple API. | [optional] 
**Scope** | Pointer to **string** | List of scopes applied to your &#x60;access_token&#x60;. | [optional] 
**ExpiresIn** | Pointer to **int64** | How long your &#x60;access_token&#x60; is valid. You need to request a new token when it expires. | [optional] 
**TokenType** | Pointer to **string** | The type of token. Ripple APIs use &#x60;Bearer&#x60; auth tokens. | [optional] 

## Methods

### NewAuthenticationResponse

`func NewAuthenticationResponse() *AuthenticationResponse`

NewAuthenticationResponse instantiates a new AuthenticationResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthenticationResponseWithDefaults

`func NewAuthenticationResponseWithDefaults() *AuthenticationResponse`

NewAuthenticationResponseWithDefaults instantiates a new AuthenticationResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessToken

`func (o *AuthenticationResponse) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *AuthenticationResponse) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *AuthenticationResponse) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.

### HasAccessToken

`func (o *AuthenticationResponse) HasAccessToken() bool`

HasAccessToken returns a boolean if a field has been set.

### GetScope

`func (o *AuthenticationResponse) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *AuthenticationResponse) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *AuthenticationResponse) SetScope(v string)`

SetScope sets Scope field to given value.

### HasScope

`func (o *AuthenticationResponse) HasScope() bool`

HasScope returns a boolean if a field has been set.

### GetExpiresIn

`func (o *AuthenticationResponse) GetExpiresIn() int64`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *AuthenticationResponse) GetExpiresInOk() (*int64, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *AuthenticationResponse) SetExpiresIn(v int64)`

SetExpiresIn sets ExpiresIn field to given value.

### HasExpiresIn

`func (o *AuthenticationResponse) HasExpiresIn() bool`

HasExpiresIn returns a boolean if a field has been set.

### GetTokenType

`func (o *AuthenticationResponse) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *AuthenticationResponse) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *AuthenticationResponse) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.

### HasTokenType

`func (o *AuthenticationResponse) HasTokenType() bool`

HasTokenType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


