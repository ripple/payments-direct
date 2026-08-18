# CreateIdentityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdentityId** | **string** | The unique ID of the identity | 
**Version** | **int32** | The version number of the identity | 

## Methods

### NewCreateIdentityResponse

`func NewCreateIdentityResponse(identityId string, version int32, ) *CreateIdentityResponse`

NewCreateIdentityResponse instantiates a new CreateIdentityResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateIdentityResponseWithDefaults

`func NewCreateIdentityResponseWithDefaults() *CreateIdentityResponse`

NewCreateIdentityResponseWithDefaults instantiates a new CreateIdentityResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdentityId

`func (o *CreateIdentityResponse) GetIdentityId() string`

GetIdentityId returns the IdentityId field if non-nil, zero value otherwise.

### GetIdentityIdOk

`func (o *CreateIdentityResponse) GetIdentityIdOk() (*string, bool)`

GetIdentityIdOk returns a tuple with the IdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityId

`func (o *CreateIdentityResponse) SetIdentityId(v string)`

SetIdentityId sets IdentityId field to given value.


### GetVersion

`func (o *CreateIdentityResponse) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *CreateIdentityResponse) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *CreateIdentityResponse) SetVersion(v int32)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


