# AuthenticationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientId** | **string** | The client ID associated with a specific set of API credentials. | 
**ClientSecret** | **string** | The client secret associated with a specific set of API credentials. | 
**Audience** | **string** | The value of the &#x60;audience&#x60; field is based on [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) syntax.  **Format**: &#x60;urn:ripplexcurrent-{ENVIRONMENT_STRING}:{YOUR_TENANT_ID}&#x60;  * The first component is &#x60;urn:ripplenetxcurrent-&#x60;. * The second component refers to the environment you want to access. * The third component is your tenant ID. Ripple integration engineers provide this component during training.  | Environment | Environment string | Description | | --- | --- | --- | | Test | &#x60;test&#x60; | Test environment with simulated partners and simulated currency. | | Production | &#x60;prod&#x60; | Production environment for Ripple&#39;s internal services. |  **Example**: &#x60;urn:ripplexcurrent-test:{YOUR_TENANT_ID}&#x60;  | 
**GrantType** | **string** | Set the grant-type for this client credentials request. This must be set to &#x60;client_credentials&#x60;. | 

## Methods

### NewAuthenticationRequest

`func NewAuthenticationRequest(clientId string, clientSecret string, audience string, grantType string, ) *AuthenticationRequest`

NewAuthenticationRequest instantiates a new AuthenticationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthenticationRequestWithDefaults

`func NewAuthenticationRequestWithDefaults() *AuthenticationRequest`

NewAuthenticationRequestWithDefaults instantiates a new AuthenticationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientId

`func (o *AuthenticationRequest) GetClientId() string`

GetClientId returns the ClientId field if non-nil, zero value otherwise.

### GetClientIdOk

`func (o *AuthenticationRequest) GetClientIdOk() (*string, bool)`

GetClientIdOk returns a tuple with the ClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientId

`func (o *AuthenticationRequest) SetClientId(v string)`

SetClientId sets ClientId field to given value.


### GetClientSecret

`func (o *AuthenticationRequest) GetClientSecret() string`

GetClientSecret returns the ClientSecret field if non-nil, zero value otherwise.

### GetClientSecretOk

`func (o *AuthenticationRequest) GetClientSecretOk() (*string, bool)`

GetClientSecretOk returns a tuple with the ClientSecret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientSecret

`func (o *AuthenticationRequest) SetClientSecret(v string)`

SetClientSecret sets ClientSecret field to given value.


### GetAudience

`func (o *AuthenticationRequest) GetAudience() string`

GetAudience returns the Audience field if non-nil, zero value otherwise.

### GetAudienceOk

`func (o *AuthenticationRequest) GetAudienceOk() (*string, bool)`

GetAudienceOk returns a tuple with the Audience field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudience

`func (o *AuthenticationRequest) SetAudience(v string)`

SetAudience sets Audience field to given value.


### GetGrantType

`func (o *AuthenticationRequest) GetGrantType() string`

GetGrantType returns the GrantType field if non-nil, zero value otherwise.

### GetGrantTypeOk

`func (o *AuthenticationRequest) GetGrantTypeOk() (*string, bool)`

GetGrantTypeOk returns a tuple with the GrantType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrantType

`func (o *AuthenticationRequest) SetGrantType(v string)`

SetGrantType sets GrantType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


