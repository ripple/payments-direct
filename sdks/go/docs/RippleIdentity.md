# RippleIdentity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdentityType** | **string** | The type of the identity | 
**PaymentRole** | **string** | The payment role of the identity | 
**InternalId** | Pointer to **string** | Optional client-provided unique identifier for idempotency and deduplication.  Must be unique across all active identities within your tenant. Duplicate values will result in a 409 Conflict error.  | [optional] 
**Business** | Pointer to [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**Individual** | Pointer to [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Methods

### NewRippleIdentity

`func NewRippleIdentity(identityType string, paymentRole string, ) *RippleIdentity`

NewRippleIdentity instantiates a new RippleIdentity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRippleIdentityWithDefaults

`func NewRippleIdentityWithDefaults() *RippleIdentity`

NewRippleIdentityWithDefaults instantiates a new RippleIdentity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdentityType

`func (o *RippleIdentity) GetIdentityType() string`

GetIdentityType returns the IdentityType field if non-nil, zero value otherwise.

### GetIdentityTypeOk

`func (o *RippleIdentity) GetIdentityTypeOk() (*string, bool)`

GetIdentityTypeOk returns a tuple with the IdentityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityType

`func (o *RippleIdentity) SetIdentityType(v string)`

SetIdentityType sets IdentityType field to given value.


### GetPaymentRole

`func (o *RippleIdentity) GetPaymentRole() string`

GetPaymentRole returns the PaymentRole field if non-nil, zero value otherwise.

### GetPaymentRoleOk

`func (o *RippleIdentity) GetPaymentRoleOk() (*string, bool)`

GetPaymentRoleOk returns a tuple with the PaymentRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRole

`func (o *RippleIdentity) SetPaymentRole(v string)`

SetPaymentRole sets PaymentRole field to given value.


### GetInternalId

`func (o *RippleIdentity) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *RippleIdentity) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *RippleIdentity) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *RippleIdentity) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetBusiness

`func (o *RippleIdentity) GetBusiness() BusinessIdentity`

GetBusiness returns the Business field if non-nil, zero value otherwise.

### GetBusinessOk

`func (o *RippleIdentity) GetBusinessOk() (*BusinessIdentity, bool)`

GetBusinessOk returns a tuple with the Business field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusiness

`func (o *RippleIdentity) SetBusiness(v BusinessIdentity)`

SetBusiness sets Business field to given value.

### HasBusiness

`func (o *RippleIdentity) HasBusiness() bool`

HasBusiness returns a boolean if a field has been set.

### GetIndividual

`func (o *RippleIdentity) GetIndividual() IndividualIdentity`

GetIndividual returns the Individual field if non-nil, zero value otherwise.

### GetIndividualOk

`func (o *RippleIdentity) GetIndividualOk() (*IndividualIdentity, bool)`

GetIndividualOk returns a tuple with the Individual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndividual

`func (o *RippleIdentity) SetIndividual(v IndividualIdentity)`

SetIndividual sets Individual field to given value.

### HasIndividual

`func (o *RippleIdentity) HasIndividual() bool`

HasIndividual returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


