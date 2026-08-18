# IdentityV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdentityId** | **string** | The unique ID of the identity | 
**NickName** | **string** | The nickname of the identity provided at the time of identity creation. | 
**CreatedAt** | **time.Time** | The time at which the identity was created | 
**IdentityType** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | 
**UseCaseType** | [**UseCaseType**](UseCaseType.md) |  | 

## Methods

### NewIdentityV2

`func NewIdentityV2(identityId string, nickName string, createdAt time.Time, identityType IdentityTypeV2, useCaseType UseCaseType, ) *IdentityV2`

NewIdentityV2 instantiates a new IdentityV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIdentityV2WithDefaults

`func NewIdentityV2WithDefaults() *IdentityV2`

NewIdentityV2WithDefaults instantiates a new IdentityV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdentityId

`func (o *IdentityV2) GetIdentityId() string`

GetIdentityId returns the IdentityId field if non-nil, zero value otherwise.

### GetIdentityIdOk

`func (o *IdentityV2) GetIdentityIdOk() (*string, bool)`

GetIdentityIdOk returns a tuple with the IdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityId

`func (o *IdentityV2) SetIdentityId(v string)`

SetIdentityId sets IdentityId field to given value.


### GetNickName

`func (o *IdentityV2) GetNickName() string`

GetNickName returns the NickName field if non-nil, zero value otherwise.

### GetNickNameOk

`func (o *IdentityV2) GetNickNameOk() (*string, bool)`

GetNickNameOk returns a tuple with the NickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNickName

`func (o *IdentityV2) SetNickName(v string)`

SetNickName sets NickName field to given value.


### GetCreatedAt

`func (o *IdentityV2) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *IdentityV2) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *IdentityV2) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetIdentityType

`func (o *IdentityV2) GetIdentityType() IdentityTypeV2`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *IdentityV2) GetIdentityTypeOk() (*IdentityTypeV2, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *IdentityV2) SetIdentityType(v IdentityTypeV2)`

SetIdentityType sets IdentityType field to given value.


### GetUseCaseType

`func (o *IdentityV2) GetUseCaseType() UseCaseType`

GetUseCaseType returns the UseCaseType field if non-nil, zero value otherwise.

### GetUseCaseTypeOk

`func (o *IdentityV2) GetUseCaseTypeOk() (*UseCaseType, bool)`

GetUseCaseTypeOk returns a tuple with the UseCaseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseCaseType

`func (o *IdentityV2) SetUseCaseType(v UseCaseType)`

SetUseCaseType sets UseCaseType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


