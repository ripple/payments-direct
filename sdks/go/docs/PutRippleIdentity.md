# PutRippleIdentity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InternalId** | Pointer to **string** | Client-provided unique identifier for idempotency and deduplication. Required for ORIGINATOR identities; optional for BENEFICIARY identities. Must be unique across all active identities in your organization. Duplicate values will result in a 409 Conflict error.  This is your own reference key, not the originator&#39;s account number. Use &#x60;originatorAccountNumber&#x60; for that.  | [optional] 
**OriginatorAccountNumber** | Pointer to **string** | The originator&#39;s account number, or your customer identifier for the originator. Optional on every currently available corridor. Only sent to payout partners for ORIGINATOR identities.  Must be unique across all active identities in your organization, including BENEFICIARY identities. Duplicate values return a 409 Conflict error.  Payout partners apply their own length and character limits to this value, but they are not enforced on this field.  | [optional] 
**Business** | Pointer to [**BusinessIdentity**](BusinessIdentity.md) |  | [optional] 
**Individual** | Pointer to [**IndividualIdentity**](IndividualIdentity.md) |  | [optional] 

## Methods

### NewPutRippleIdentity

`func NewPutRippleIdentity() *PutRippleIdentity`

NewPutRippleIdentity instantiates a new PutRippleIdentity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPutRippleIdentityWithDefaults

`func NewPutRippleIdentityWithDefaults() *PutRippleIdentity`

NewPutRippleIdentityWithDefaults instantiates a new PutRippleIdentity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInternalId

`func (o *PutRippleIdentity) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *PutRippleIdentity) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *PutRippleIdentity) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *PutRippleIdentity) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetOriginatorAccountNumber

`func (o *PutRippleIdentity) GetOriginatorAccountNumber() string`

GetOriginatorAccountNumber returns the OriginatorAccountNumber field if non-nil, zero value otherwise.

### GetOriginatorAccountNumberOk

`func (o *PutRippleIdentity) GetOriginatorAccountNumberOk() (*string, bool)`

GetOriginatorAccountNumberOk returns a tuple with the OriginatorAccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorAccountNumber

`func (o *PutRippleIdentity) SetOriginatorAccountNumber(v string)`

SetOriginatorAccountNumber sets OriginatorAccountNumber field to given value.

### HasOriginatorAccountNumber

`func (o *PutRippleIdentity) HasOriginatorAccountNumber() bool`

HasOriginatorAccountNumber returns a boolean if a field has been set.

### GetBusiness

`func (o *PutRippleIdentity) GetBusiness() BusinessIdentity`

GetBusiness returns the Business field if non-nil, zero value otherwise.

### GetBusinessOk

`func (o *PutRippleIdentity) GetBusinessOk() (*BusinessIdentity, bool)`

GetBusinessOk returns a tuple with the Business field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusiness

`func (o *PutRippleIdentity) SetBusiness(v BusinessIdentity)`

SetBusiness sets Business field to given value.

### HasBusiness

`func (o *PutRippleIdentity) HasBusiness() bool`

HasBusiness returns a boolean if a field has been set.

### GetIndividual

`func (o *PutRippleIdentity) GetIndividual() IndividualIdentity`

GetIndividual returns the Individual field if non-nil, zero value otherwise.

### GetIndividualOk

`func (o *PutRippleIdentity) GetIndividualOk() (*IndividualIdentity, bool)`

GetIndividualOk returns a tuple with the Individual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndividual

`func (o *PutRippleIdentity) SetIndividual(v IndividualIdentity)`

SetIndividual sets Individual field to given value.

### HasIndividual

`func (o *PutRippleIdentity) HasIndividual() bool`

HasIndividual returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


