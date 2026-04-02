# OriginatorV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OriginatorIdentityId** | Pointer to **string** | The unique ID associated with the payment originator&#39;s identity record. | [optional] 
**OriginatorIdentityIdVersion** | Pointer to **int32** | The current version of the originator&#39;s identity record. | [optional] 
**OriginatorIdentityNickName** | Pointer to **string** | Nickname associated with the originator&#39;s identity record. | [optional] 
**InternalId** | Pointer to **string** | An ID associated with this payment, if provided by the customer during payment initiation. | [optional] 
**SourceCurrency** | Pointer to **string** | originator&#39;s currency | [optional] 
**SourceAmount** | Pointer to **float64** | The amount sent by the originator in this payment. This field can hold a value with up to 6 decimal places. | [optional] 
**Payin** | Pointer to **string** | Details about how this payment is funded. | [optional] 

## Methods

### NewOriginatorV2

`func NewOriginatorV2() *OriginatorV2`

NewOriginatorV2 instantiates a new OriginatorV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOriginatorV2WithDefaults

`func NewOriginatorV2WithDefaults() *OriginatorV2`

NewOriginatorV2WithDefaults instantiates a new OriginatorV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOriginatorIdentityId

`func (o *OriginatorV2) GetOriginatorIdentityId() string`

GetOriginatorIdentityId returns the OriginatorIdentityId field if non-nil, zero value otherwise.

### GetOriginatorIdentityIdOk

`func (o *OriginatorV2) GetOriginatorIdentityIdOk() (*string, bool)`

GetOriginatorIdentityIdOk returns a tuple with the OriginatorIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityId

`func (o *OriginatorV2) SetOriginatorIdentityId(v string)`

SetOriginatorIdentityId sets OriginatorIdentityId field to given value.

### HasOriginatorIdentityId

`func (o *OriginatorV2) HasOriginatorIdentityId() bool`

HasOriginatorIdentityId returns a boolean if a field has been set.

### GetOriginatorIdentityIdVersion

`func (o *OriginatorV2) GetOriginatorIdentityIdVersion() int32`

GetOriginatorIdentityIdVersion returns the OriginatorIdentityIdVersion field if non-nil, zero value otherwise.

### GetOriginatorIdentityIdVersionOk

`func (o *OriginatorV2) GetOriginatorIdentityIdVersionOk() (*int32, bool)`

GetOriginatorIdentityIdVersionOk returns a tuple with the OriginatorIdentityIdVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityIdVersion

`func (o *OriginatorV2) SetOriginatorIdentityIdVersion(v int32)`

SetOriginatorIdentityIdVersion sets OriginatorIdentityIdVersion field to given value.

### HasOriginatorIdentityIdVersion

`func (o *OriginatorV2) HasOriginatorIdentityIdVersion() bool`

HasOriginatorIdentityIdVersion returns a boolean if a field has been set.

### GetOriginatorIdentityNickName

`func (o *OriginatorV2) GetOriginatorIdentityNickName() string`

GetOriginatorIdentityNickName returns the OriginatorIdentityNickName field if non-nil, zero value otherwise.

### GetOriginatorIdentityNickNameOk

`func (o *OriginatorV2) GetOriginatorIdentityNickNameOk() (*string, bool)`

GetOriginatorIdentityNickNameOk returns a tuple with the OriginatorIdentityNickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityNickName

`func (o *OriginatorV2) SetOriginatorIdentityNickName(v string)`

SetOriginatorIdentityNickName sets OriginatorIdentityNickName field to given value.

### HasOriginatorIdentityNickName

`func (o *OriginatorV2) HasOriginatorIdentityNickName() bool`

HasOriginatorIdentityNickName returns a boolean if a field has been set.

### GetInternalId

`func (o *OriginatorV2) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *OriginatorV2) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *OriginatorV2) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *OriginatorV2) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetSourceCurrency

`func (o *OriginatorV2) GetSourceCurrency() string`

GetSourceCurrency returns the SourceCurrency field if non-nil, zero value otherwise.

### GetSourceCurrencyOk

`func (o *OriginatorV2) GetSourceCurrencyOk() (*string, bool)`

GetSourceCurrencyOk returns a tuple with the SourceCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCurrency

`func (o *OriginatorV2) SetSourceCurrency(v string)`

SetSourceCurrency sets SourceCurrency field to given value.

### HasSourceCurrency

`func (o *OriginatorV2) HasSourceCurrency() bool`

HasSourceCurrency returns a boolean if a field has been set.

### GetSourceAmount

`func (o *OriginatorV2) GetSourceAmount() float64`

GetSourceAmount returns the SourceAmount field if non-nil, zero value otherwise.

### GetSourceAmountOk

`func (o *OriginatorV2) GetSourceAmountOk() (*float64, bool)`

GetSourceAmountOk returns a tuple with the SourceAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceAmount

`func (o *OriginatorV2) SetSourceAmount(v float64)`

SetSourceAmount sets SourceAmount field to given value.

### HasSourceAmount

`func (o *OriginatorV2) HasSourceAmount() bool`

HasSourceAmount returns a boolean if a field has been set.

### GetPayin

`func (o *OriginatorV2) GetPayin() string`

GetPayin returns the Payin field if non-nil, zero value otherwise.

### GetPayinOk

`func (o *OriginatorV2) GetPayinOk() (*string, bool)`

GetPayinOk returns a tuple with the Payin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayin

`func (o *OriginatorV2) SetPayin(v string)`

SetPayin sets Payin field to given value.

### HasPayin

`func (o *OriginatorV2) HasPayin() bool`

HasPayin returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


