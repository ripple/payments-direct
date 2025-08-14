# Originator

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OriginatorIdentityId** | Pointer to **string** | The unique ID associated with the payment originator&#39;s identity record. | [optional] 
**OriginatorIdentityIdVersion** | Pointer to **int32** | The current version of the originator&#39;s identity record. | [optional] 
**OriginatorIdentityNickName** | Pointer to **string** | Nickname associated with the originator&#39;s identity record. | [optional] 
**InternalId** | Pointer to **string** | An ID associated with this payment, if provided by the customer during payment initiation. | [optional] 
**SourceCountry** | Pointer to **string** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. | [optional] 
**SourceCurrency** | Pointer to **string** | originator&#39;s currency | [optional] 
**SourceAmount** | Pointer to **float64** | The amount sent by the originator in this payment. This field can hold a value with up to 6 decimal places. | [optional] 
**Payin** | Pointer to **string** | Details about how this payment is funded. | [optional] 

## Methods

### NewOriginator

`func NewOriginator() *Originator`

NewOriginator instantiates a new Originator object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOriginatorWithDefaults

`func NewOriginatorWithDefaults() *Originator`

NewOriginatorWithDefaults instantiates a new Originator object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOriginatorIdentityId

`func (o *Originator) GetOriginatorIdentityId() string`

GetOriginatorIdentityId returns the OriginatorIdentityId field if non-nil, zero value otherwise.

### GetOriginatorIdentityIdOk

`func (o *Originator) GetOriginatorIdentityIdOk() (*string, bool)`

GetOriginatorIdentityIdOk returns a tuple with the OriginatorIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityId

`func (o *Originator) SetOriginatorIdentityId(v string)`

SetOriginatorIdentityId sets OriginatorIdentityId field to given value.

### HasOriginatorIdentityId

`func (o *Originator) HasOriginatorIdentityId() bool`

HasOriginatorIdentityId returns a boolean if a field has been set.

### GetOriginatorIdentityIdVersion

`func (o *Originator) GetOriginatorIdentityIdVersion() int32`

GetOriginatorIdentityIdVersion returns the OriginatorIdentityIdVersion field if non-nil, zero value otherwise.

### GetOriginatorIdentityIdVersionOk

`func (o *Originator) GetOriginatorIdentityIdVersionOk() (*int32, bool)`

GetOriginatorIdentityIdVersionOk returns a tuple with the OriginatorIdentityIdVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityIdVersion

`func (o *Originator) SetOriginatorIdentityIdVersion(v int32)`

SetOriginatorIdentityIdVersion sets OriginatorIdentityIdVersion field to given value.

### HasOriginatorIdentityIdVersion

`func (o *Originator) HasOriginatorIdentityIdVersion() bool`

HasOriginatorIdentityIdVersion returns a boolean if a field has been set.

### GetOriginatorIdentityNickName

`func (o *Originator) GetOriginatorIdentityNickName() string`

GetOriginatorIdentityNickName returns the OriginatorIdentityNickName field if non-nil, zero value otherwise.

### GetOriginatorIdentityNickNameOk

`func (o *Originator) GetOriginatorIdentityNickNameOk() (*string, bool)`

GetOriginatorIdentityNickNameOk returns a tuple with the OriginatorIdentityNickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityNickName

`func (o *Originator) SetOriginatorIdentityNickName(v string)`

SetOriginatorIdentityNickName sets OriginatorIdentityNickName field to given value.

### HasOriginatorIdentityNickName

`func (o *Originator) HasOriginatorIdentityNickName() bool`

HasOriginatorIdentityNickName returns a boolean if a field has been set.

### GetInternalId

`func (o *Originator) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *Originator) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *Originator) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *Originator) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetSourceCountry

`func (o *Originator) GetSourceCountry() string`

GetSourceCountry returns the SourceCountry field if non-nil, zero value otherwise.

### GetSourceCountryOk

`func (o *Originator) GetSourceCountryOk() (*string, bool)`

GetSourceCountryOk returns a tuple with the SourceCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCountry

`func (o *Originator) SetSourceCountry(v string)`

SetSourceCountry sets SourceCountry field to given value.

### HasSourceCountry

`func (o *Originator) HasSourceCountry() bool`

HasSourceCountry returns a boolean if a field has been set.

### GetSourceCurrency

`func (o *Originator) GetSourceCurrency() string`

GetSourceCurrency returns the SourceCurrency field if non-nil, zero value otherwise.

### GetSourceCurrencyOk

`func (o *Originator) GetSourceCurrencyOk() (*string, bool)`

GetSourceCurrencyOk returns a tuple with the SourceCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCurrency

`func (o *Originator) SetSourceCurrency(v string)`

SetSourceCurrency sets SourceCurrency field to given value.

### HasSourceCurrency

`func (o *Originator) HasSourceCurrency() bool`

HasSourceCurrency returns a boolean if a field has been set.

### GetSourceAmount

`func (o *Originator) GetSourceAmount() float64`

GetSourceAmount returns the SourceAmount field if non-nil, zero value otherwise.

### GetSourceAmountOk

`func (o *Originator) GetSourceAmountOk() (*float64, bool)`

GetSourceAmountOk returns a tuple with the SourceAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceAmount

`func (o *Originator) SetSourceAmount(v float64)`

SetSourceAmount sets SourceAmount field to given value.

### HasSourceAmount

`func (o *Originator) HasSourceAmount() bool`

HasSourceAmount returns a boolean if a field has been set.

### GetPayin

`func (o *Originator) GetPayin() string`

GetPayin returns the Payin field if non-nil, zero value otherwise.

### GetPayinOk

`func (o *Originator) GetPayinOk() (*string, bool)`

GetPayinOk returns a tuple with the Payin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayin

`func (o *Originator) SetPayin(v string)`

SetPayin sets Payin field to given value.

### HasPayin

`func (o *Originator) HasPayin() bool`

HasPayin returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


