# CreateIdentityRequestV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NickName** | Pointer to **string** | The nickname for the identity | [optional] 
**ValidatePayoutRails** | Pointer to **[]string** | The payout rails to validate the identity against | [optional] 
**Tags** | Pointer to **[]string** | Tags are used to categorize the identity.  | [optional] 
**IdentityType** | **string** | The type of the identity | 
**PaymentRole** | **string** | The payment role of the identity | 
**InternalId** | Pointer to **string** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**Business** | Pointer to [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**Individual** | Pointer to [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Methods

### NewCreateIdentityRequestV3

`func NewCreateIdentityRequestV3(identityType string, paymentRole string, ) *CreateIdentityRequestV3`

NewCreateIdentityRequestV3 instantiates a new CreateIdentityRequestV3 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateIdentityRequestV3WithDefaults

`func NewCreateIdentityRequestV3WithDefaults() *CreateIdentityRequestV3`

NewCreateIdentityRequestV3WithDefaults instantiates a new CreateIdentityRequestV3 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNickName

`func (o *CreateIdentityRequestV3) GetNickName() string`

GetNickName returns the NickName field if non-nil, zero value otherwise.

### GetNickNameOk

`func (o *CreateIdentityRequestV3) GetNickNameOk() (*string, bool)`

GetNickNameOk returns a tuple with the NickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNickName

`func (o *CreateIdentityRequestV3) SetNickName(v string)`

SetNickName sets NickName field to given value.

### HasNickName

`func (o *CreateIdentityRequestV3) HasNickName() bool`

HasNickName returns a boolean if a field has been set.

### GetValidatePayoutRails

`func (o *CreateIdentityRequestV3) GetValidatePayoutRails() []string`

GetValidatePayoutRails returns the ValidatePayoutRails field if non-nil, zero value otherwise.

### GetValidatePayoutRailsOk

`func (o *CreateIdentityRequestV3) GetValidatePayoutRailsOk() (*[]string, bool)`

GetValidatePayoutRailsOk returns a tuple with the ValidatePayoutRails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidatePayoutRails

`func (o *CreateIdentityRequestV3) SetValidatePayoutRails(v []string)`

SetValidatePayoutRails sets ValidatePayoutRails field to given value.

### HasValidatePayoutRails

`func (o *CreateIdentityRequestV3) HasValidatePayoutRails() bool`

HasValidatePayoutRails returns a boolean if a field has been set.

### GetTags

`func (o *CreateIdentityRequestV3) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *CreateIdentityRequestV3) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *CreateIdentityRequestV3) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *CreateIdentityRequestV3) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetIdentityType

`func (o *CreateIdentityRequestV3) GetIdentityType() string`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *CreateIdentityRequestV3) GetIdentityTypeOk() (*string, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *CreateIdentityRequestV3) SetIdentityType(v string)`

SetIdentityType sets IdentityType field to given value.


### GetPaymentRole

`func (o *CreateIdentityRequestV3) GetPaymentRole() string`

GetPaymentRole returns the PaymentRole field if non-nil, zero value otherwise.

### GetPaymentRoleOk

`func (o *CreateIdentityRequestV3) GetPaymentRoleOk() (*string, bool)`

GetPaymentRoleOk returns a tuple with the PaymentRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRole

`func (o *CreateIdentityRequestV3) SetPaymentRole(v string)`

SetPaymentRole sets PaymentRole field to given value.


### GetInternalId

`func (o *CreateIdentityRequestV3) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *CreateIdentityRequestV3) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *CreateIdentityRequestV3) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *CreateIdentityRequestV3) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetBusiness

`func (o *CreateIdentityRequestV3) GetBusiness() BusinessIdentity`

GetBusiness returns the Business field if non-nil, zero value otherwise.

### GetBusinessOk

`func (o *CreateIdentityRequestV3) GetBusinessOk() (*BusinessIdentity, bool)`

GetBusinessOk returns a tuple with the Business field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusiness

`func (o *CreateIdentityRequestV3) SetBusiness(v BusinessIdentity)`

SetBusiness sets Business field to given value.

### HasBusiness

`func (o *CreateIdentityRequestV3) HasBusiness() bool`

HasBusiness returns a boolean if a field has been set.

### GetIndividual

`func (o *CreateIdentityRequestV3) GetIndividual() IndividualIdentity`

GetIndividual returns the Individual field if non-nil, zero value otherwise.

### GetIndividualOk

`func (o *CreateIdentityRequestV3) GetIndividualOk() (*IndividualIdentity, bool)`

GetIndividualOk returns a tuple with the Individual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndividual

`func (o *CreateIdentityRequestV3) SetIndividual(v IndividualIdentity)`

SetIndividual sets Individual field to given value.

### HasIndividual

`func (o *CreateIdentityRequestV3) HasIndividual() bool`

HasIndividual returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


