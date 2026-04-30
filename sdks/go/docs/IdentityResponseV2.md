# IdentityResponseV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdentityId** | **string** | The unique ID of the identity | 
**IdentityType** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | 
**CreatedAt** | **time.Time** | The time at which the identity was created | 
**IdentityState** | [**StateType**](StateType.md) |  | 
**NickName** | Pointer to **string** | The nickname for the identity provided at the time of identity creation | [optional] 
**PiiData** | **map[string]interface{}** | PII data in JSON format | 
**Version** | **int32** | The version number of the identity | 
**UseCaseType** | [**UseCaseType**](UseCaseType.md) |  | 

## Methods

### NewIdentityResponseV2

`func NewIdentityResponseV2(identityId string, identityType IdentityTypeV2, createdAt time.Time, identityState StateType, piiData map[string]interface{}, version int32, useCaseType UseCaseType, ) *IdentityResponseV2`

NewIdentityResponseV2 instantiates a new IdentityResponseV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIdentityResponseV2WithDefaults

`func NewIdentityResponseV2WithDefaults() *IdentityResponseV2`

NewIdentityResponseV2WithDefaults instantiates a new IdentityResponseV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdentityId

`func (o *IdentityResponseV2) GetIdentityId() string`

GetIdentityId returns the IdentityId field if non-nil, zero value otherwise.

### GetIdentityIdOk

`func (o *IdentityResponseV2) GetIdentityIdOk() (*string, bool)`

GetIdentityIdOk returns a tuple with the IdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityId

`func (o *IdentityResponseV2) SetIdentityId(v string)`

SetIdentityId sets IdentityId field to given value.


### GetIdentityType

`func (o *IdentityResponseV2) GetIdentityType() IdentityTypeV2`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *IdentityResponseV2) GetIdentityTypeOk() (*IdentityTypeV2, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *IdentityResponseV2) SetIdentityType(v IdentityTypeV2)`

SetIdentityType sets IdentityType field to given value.


### GetCreatedAt

`func (o *IdentityResponseV2) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *IdentityResponseV2) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *IdentityResponseV2) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetIdentityState

`func (o *IdentityResponseV2) GetIdentityState() StateType`

GetIdentityState returns the IdentityState field if non-nil, zero value otherwise.

### GetIdentityStateOk

`func (o *IdentityResponseV2) GetIdentityStateOk() (*StateType, bool)`

GetIdentityStateOk returns a tuple with the IdentityState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityState

`func (o *IdentityResponseV2) SetIdentityState(v StateType)`

SetIdentityState sets IdentityState field to given value.


### GetNickName

`func (o *IdentityResponseV2) GetNickName() string`

GetNickName returns the NickName field if non-nil, zero value otherwise.

### GetNickNameOk

`func (o *IdentityResponseV2) GetNickNameOk() (*string, bool)`

GetNickNameOk returns a tuple with the NickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNickName

`func (o *IdentityResponseV2) SetNickName(v string)`

SetNickName sets NickName field to given value.

### HasNickName

`func (o *IdentityResponseV2) HasNickName() bool`

HasNickName returns a boolean if a field has been set.

### GetPiiData

`func (o *IdentityResponseV2) GetPiiData() map[string]interface{}`

GetPiiData returns the PiiData field if non-nil, zero value otherwise.

### GetPiiDataOk

`func (o *IdentityResponseV2) GetPiiDataOk() (*map[string]interface{}, bool)`

GetPiiDataOk returns a tuple with the PiiData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPiiData

`func (o *IdentityResponseV2) SetPiiData(v map[string]interface{})`

SetPiiData sets PiiData field to given value.


### GetVersion

`func (o *IdentityResponseV2) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *IdentityResponseV2) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *IdentityResponseV2) SetVersion(v int32)`

SetVersion sets Version field to given value.


### GetUseCaseType

`func (o *IdentityResponseV2) GetUseCaseType() UseCaseType`

GetUseCaseType returns the UseCaseType field if non-nil, zero value otherwise.

### GetUseCaseTypeOk

`func (o *IdentityResponseV2) GetUseCaseTypeOk() (*UseCaseType, bool)`

GetUseCaseTypeOk returns a tuple with the UseCaseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseCaseType

`func (o *IdentityResponseV2) SetUseCaseType(v UseCaseType)`

SetUseCaseType sets UseCaseType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


