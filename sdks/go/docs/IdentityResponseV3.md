# IdentityResponseV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdentityId** | **string** | The unique ID of the identity | 
**IdentityType** | **string** | The type of the identity | 
**PaymentRole** | **string** | The payment role of the identity | 
**CreatedAt** | **time.Time** | The time at which the identity was created | 
**UpdatedAt** | **time.Time** | The time at which the identity was last updated | 
**IdentityState** | **string** | The state of the identity   * ACTIVE   * DEACTIVATED  | 
**NickName** | Pointer to **string** | The nickname for the identity provided at the time of identity creation | [optional] 
**InternalId** | Pointer to **string** | The internal ID of the identity used for internal processing | [optional] 
**Tags** | Pointer to **[]string** | Tags are used to categorize the identity.  | [optional] 
**Version** | **int32** | The version number of the identity | 
**SchemaVersion** | **string** | The version of the schema | 

## Methods

### NewIdentityResponseV3

`func NewIdentityResponseV3(identityId string, identityType string, paymentRole string, createdAt time.Time, updatedAt time.Time, identityState string, version int32, schemaVersion string, ) *IdentityResponseV3`

NewIdentityResponseV3 instantiates a new IdentityResponseV3 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIdentityResponseV3WithDefaults

`func NewIdentityResponseV3WithDefaults() *IdentityResponseV3`

NewIdentityResponseV3WithDefaults instantiates a new IdentityResponseV3 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdentityId

`func (o *IdentityResponseV3) GetIdentityId() string`

GetIdentityId returns the IdentityId field if non-nil, zero value otherwise.

### GetIdentityIdOk

`func (o *IdentityResponseV3) GetIdentityIdOk() (*string, bool)`

GetIdentityIdOk returns a tuple with the IdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityId

`func (o *IdentityResponseV3) SetIdentityId(v string)`

SetIdentityId sets IdentityId field to given value.


### GetIdentityType

`func (o *IdentityResponseV3) GetIdentityType() string`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *IdentityResponseV3) GetIdentityTypeOk() (*string, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *IdentityResponseV3) SetIdentityType(v string)`

SetIdentityType sets IdentityType field to given value.


### GetPaymentRole

`func (o *IdentityResponseV3) GetPaymentRole() string`

GetPaymentRole returns the PaymentRole field if non-nil, zero value otherwise.

### GetPaymentRoleOk

`func (o *IdentityResponseV3) GetPaymentRoleOk() (*string, bool)`

GetPaymentRoleOk returns a tuple with the PaymentRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRole

`func (o *IdentityResponseV3) SetPaymentRole(v string)`

SetPaymentRole sets PaymentRole field to given value.


### GetCreatedAt

`func (o *IdentityResponseV3) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *IdentityResponseV3) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *IdentityResponseV3) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetUpdatedAt

`func (o *IdentityResponseV3) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *IdentityResponseV3) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *IdentityResponseV3) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetIdentityState

`func (o *IdentityResponseV3) GetIdentityState() string`

GetIdentityState returns the IdentityState field if non-nil, zero value otherwise.

### GetIdentityStateOk

`func (o *IdentityResponseV3) GetIdentityStateOk() (*string, bool)`

GetIdentityStateOk returns a tuple with the IdentityState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityState

`func (o *IdentityResponseV3) SetIdentityState(v string)`

SetIdentityState sets IdentityState field to given value.


### GetNickName

`func (o *IdentityResponseV3) GetNickName() string`

GetNickName returns the NickName field if non-nil, zero value otherwise.

### GetNickNameOk

`func (o *IdentityResponseV3) GetNickNameOk() (*string, bool)`

GetNickNameOk returns a tuple with the NickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNickName

`func (o *IdentityResponseV3) SetNickName(v string)`

SetNickName sets NickName field to given value.

### HasNickName

`func (o *IdentityResponseV3) HasNickName() bool`

HasNickName returns a boolean if a field has been set.

### GetInternalId

`func (o *IdentityResponseV3) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *IdentityResponseV3) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *IdentityResponseV3) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *IdentityResponseV3) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetTags

`func (o *IdentityResponseV3) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *IdentityResponseV3) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *IdentityResponseV3) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *IdentityResponseV3) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetVersion

`func (o *IdentityResponseV3) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *IdentityResponseV3) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *IdentityResponseV3) SetVersion(v int32)`

SetVersion sets Version field to given value.


### GetSchemaVersion

`func (o *IdentityResponseV3) GetSchemaVersion() string`

GetSchemaVersion returns the SchemaVersion field if non-nil, zero value otherwise.

### GetSchemaVersionOk

`func (o *IdentityResponseV3) GetSchemaVersionOk() (*string, bool)`

GetSchemaVersionOk returns a tuple with the SchemaVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchemaVersion

`func (o *IdentityResponseV3) SetSchemaVersion(v string)`

SetSchemaVersion sets SchemaVersion field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


