# GetIdentityResponseV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdentityId** | Pointer to **string** | Server-generated unique identifier of the identity. | [optional] 
**IdentityState** | Pointer to **string** | The state of the identity   * ACTIVE   * DEACTIVATED  | [optional] 
**NickName** | Pointer to **string** | Optional human-readable alias set by the client. | [optional] 
**Tags** | Pointer to **[]string** | Optional labels used to categorize or filter identities. | [optional] 
**ValidatePayoutRails** | Pointer to **[]string** | List of payout methods where this identity is considered valid. Use this to indicate which payout methods (for example, US_ACH, EU_SEPA) the identity can be used with in payments. | [optional] 
**Version** | Pointer to **string** | Sequential version number. Each successful PUT creates a higher version. | [optional] 
**SchemaVersion** | Pointer to **string** | Schema version used to validate this identity, for example 1.0.0. | [optional] 
**CreatedAt** | Pointer to **time.Time** | RFC 3339 timestamp when the identity was created. | [optional] 
**UpdatedAt** | Pointer to **time.Time** | RFC 3339 timestamp when the identity was last updated. | [optional] 
**IdentityType** | **string** | The type of the identity | 
**PaymentRole** | **string** | The payment role of the identity | 
**InternalId** | Pointer to **string** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**Business** | Pointer to [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**Individual** | Pointer to [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Methods

### NewGetIdentityResponseV3

`func NewGetIdentityResponseV3(identityType string, paymentRole string, ) *GetIdentityResponseV3`

NewGetIdentityResponseV3 instantiates a new GetIdentityResponseV3 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetIdentityResponseV3WithDefaults

`func NewGetIdentityResponseV3WithDefaults() *GetIdentityResponseV3`

NewGetIdentityResponseV3WithDefaults instantiates a new GetIdentityResponseV3 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdentityId

`func (o *GetIdentityResponseV3) GetIdentityId() string`

GetIdentityId returns the IdentityId field if non-nil, zero value otherwise.

### GetIdentityIdOk

`func (o *GetIdentityResponseV3) GetIdentityIdOk() (*string, bool)`

GetIdentityIdOk returns a tuple with the IdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityId

`func (o *GetIdentityResponseV3) SetIdentityId(v string)`

SetIdentityId sets IdentityId field to given value.

### HasIdentityId

`func (o *GetIdentityResponseV3) HasIdentityId() bool`

HasIdentityId returns a boolean if a field has been set.

### GetIdentityState

`func (o *GetIdentityResponseV3) GetIdentityState() string`

GetIdentityState returns the IdentityState field if non-nil, zero value otherwise.

### GetIdentityStateOk

`func (o *GetIdentityResponseV3) GetIdentityStateOk() (*string, bool)`

GetIdentityStateOk returns a tuple with the IdentityState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityState

`func (o *GetIdentityResponseV3) SetIdentityState(v string)`

SetIdentityState sets IdentityState field to given value.

### HasIdentityState

`func (o *GetIdentityResponseV3) HasIdentityState() bool`

HasIdentityState returns a boolean if a field has been set.

### GetNickName

`func (o *GetIdentityResponseV3) GetNickName() string`

GetNickName returns the NickName field if non-nil, zero value otherwise.

### GetNickNameOk

`func (o *GetIdentityResponseV3) GetNickNameOk() (*string, bool)`

GetNickNameOk returns a tuple with the NickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNickName

`func (o *GetIdentityResponseV3) SetNickName(v string)`

SetNickName sets NickName field to given value.

### HasNickName

`func (o *GetIdentityResponseV3) HasNickName() bool`

HasNickName returns a boolean if a field has been set.

### GetTags

`func (o *GetIdentityResponseV3) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *GetIdentityResponseV3) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *GetIdentityResponseV3) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *GetIdentityResponseV3) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetValidatePayoutRails

`func (o *GetIdentityResponseV3) GetValidatePayoutRails() []string`

GetValidatePayoutRails returns the ValidatePayoutRails field if non-nil, zero value otherwise.

### GetValidatePayoutRailsOk

`func (o *GetIdentityResponseV3) GetValidatePayoutRailsOk() (*[]string, bool)`

GetValidatePayoutRailsOk returns a tuple with the ValidatePayoutRails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidatePayoutRails

`func (o *GetIdentityResponseV3) SetValidatePayoutRails(v []string)`

SetValidatePayoutRails sets ValidatePayoutRails field to given value.

### HasValidatePayoutRails

`func (o *GetIdentityResponseV3) HasValidatePayoutRails() bool`

HasValidatePayoutRails returns a boolean if a field has been set.

### GetVersion

`func (o *GetIdentityResponseV3) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *GetIdentityResponseV3) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *GetIdentityResponseV3) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *GetIdentityResponseV3) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetSchemaVersion

`func (o *GetIdentityResponseV3) GetSchemaVersion() string`

GetSchemaVersion returns the SchemaVersion field if non-nil, zero value otherwise.

### GetSchemaVersionOk

`func (o *GetIdentityResponseV3) GetSchemaVersionOk() (*string, bool)`

GetSchemaVersionOk returns a tuple with the SchemaVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchemaVersion

`func (o *GetIdentityResponseV3) SetSchemaVersion(v string)`

SetSchemaVersion sets SchemaVersion field to given value.

### HasSchemaVersion

`func (o *GetIdentityResponseV3) HasSchemaVersion() bool`

HasSchemaVersion returns a boolean if a field has been set.

### GetCreatedAt

`func (o *GetIdentityResponseV3) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *GetIdentityResponseV3) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *GetIdentityResponseV3) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *GetIdentityResponseV3) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *GetIdentityResponseV3) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *GetIdentityResponseV3) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *GetIdentityResponseV3) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *GetIdentityResponseV3) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetIdentityType

`func (o *GetIdentityResponseV3) GetIdentityType() string`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *GetIdentityResponseV3) GetIdentityTypeOk() (*string, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *GetIdentityResponseV3) SetIdentityType(v string)`

SetIdentityType sets IdentityType field to given value.


### GetPaymentRole

`func (o *GetIdentityResponseV3) GetPaymentRole() string`

GetPaymentRole returns the PaymentRole field if non-nil, zero value otherwise.

### GetPaymentRoleOk

`func (o *GetIdentityResponseV3) GetPaymentRoleOk() (*string, bool)`

GetPaymentRoleOk returns a tuple with the PaymentRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRole

`func (o *GetIdentityResponseV3) SetPaymentRole(v string)`

SetPaymentRole sets PaymentRole field to given value.


### GetInternalId

`func (o *GetIdentityResponseV3) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *GetIdentityResponseV3) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *GetIdentityResponseV3) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *GetIdentityResponseV3) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetBusiness

`func (o *GetIdentityResponseV3) GetBusiness() BusinessIdentity`

GetBusiness returns the Business field if non-nil, zero value otherwise.

### GetBusinessOk

`func (o *GetIdentityResponseV3) GetBusinessOk() (*BusinessIdentity, bool)`

GetBusinessOk returns a tuple with the Business field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusiness

`func (o *GetIdentityResponseV3) SetBusiness(v BusinessIdentity)`

SetBusiness sets Business field to given value.

### HasBusiness

`func (o *GetIdentityResponseV3) HasBusiness() bool`

HasBusiness returns a boolean if a field has been set.

### GetIndividual

`func (o *GetIdentityResponseV3) GetIndividual() IndividualIdentity`

GetIndividual returns the Individual field if non-nil, zero value otherwise.

### GetIndividualOk

`func (o *GetIdentityResponseV3) GetIndividualOk() (*IndividualIdentity, bool)`

GetIndividualOk returns a tuple with the Individual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndividual

`func (o *GetIdentityResponseV3) SetIndividual(v IndividualIdentity)`

SetIndividual sets Individual field to given value.

### HasIndividual

`func (o *GetIdentityResponseV3) HasIndividual() bool`

HasIndividual returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


