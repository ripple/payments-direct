# DestinationV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BeneficiaryFinancialInstrumentId** | Pointer to **string** | The financial instrument ID, the identity ID of the payment beneficiary is related to. | [optional] 
**DestinationAmount** | Pointer to **float64** | The amount received by the payment beneficiary. This field can hold a value with up to 6 decimal places. | [optional] 
**DestinationCountry** | Pointer to **string** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] 
**DestinationCurrency** | Pointer to **string** | The currency code of the currency in which the beneficiary will receive this payment. | [optional] 
**DestinationBlockchainNetwork** | Pointer to **string** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] 
**BeneficiaryIdentityId** | Pointer to **string** | The unique ID associated with the payment beneficiary&#39;s identity record. | [optional] 
**BeneficiaryIdentityVersion** | Pointer to **int32** | The current version of the beneficiary&#39;s identity record. | [optional] 
**BeneficiaryIdentityNickName** | Pointer to **string** | Nickname associated with the beneficiary&#39;s identity record. | [optional] 
**Payout** | Pointer to **string** | The payout category for this payment. | [optional] 

## Methods

### NewDestinationV2

`func NewDestinationV2() *DestinationV2`

NewDestinationV2 instantiates a new DestinationV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDestinationV2WithDefaults

`func NewDestinationV2WithDefaults() *DestinationV2`

NewDestinationV2WithDefaults instantiates a new DestinationV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeneficiaryFinancialInstrumentId

`func (o *DestinationV2) GetBeneficiaryFinancialInstrumentId() string`

GetBeneficiaryFinancialInstrumentId returns the BeneficiaryFinancialInstrumentId field if non-nil, zero value otherwise.

### GetBeneficiaryFinancialInstrumentIdOk

`func (o *DestinationV2) GetBeneficiaryFinancialInstrumentIdOk() (*string, bool)`

GetBeneficiaryFinancialInstrumentIdOk returns a tuple with the BeneficiaryFinancialInstrumentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryFinancialInstrumentId

`func (o *DestinationV2) SetBeneficiaryFinancialInstrumentId(v string)`

SetBeneficiaryFinancialInstrumentId sets BeneficiaryFinancialInstrumentId field to given value.

### HasBeneficiaryFinancialInstrumentId

`func (o *DestinationV2) HasBeneficiaryFinancialInstrumentId() bool`

HasBeneficiaryFinancialInstrumentId returns a boolean if a field has been set.

### GetDestinationAmount

`func (o *DestinationV2) GetDestinationAmount() float64`

GetDestinationAmount returns the DestinationAmount field if non-nil, zero value otherwise.

### GetDestinationAmountOk

`func (o *DestinationV2) GetDestinationAmountOk() (*float64, bool)`

GetDestinationAmountOk returns a tuple with the DestinationAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationAmount

`func (o *DestinationV2) SetDestinationAmount(v float64)`

SetDestinationAmount sets DestinationAmount field to given value.

### HasDestinationAmount

`func (o *DestinationV2) HasDestinationAmount() bool`

HasDestinationAmount returns a boolean if a field has been set.

### GetDestinationCountry

`func (o *DestinationV2) GetDestinationCountry() string`

GetDestinationCountry returns the DestinationCountry field if non-nil, zero value otherwise.

### GetDestinationCountryOk

`func (o *DestinationV2) GetDestinationCountryOk() (*string, bool)`

GetDestinationCountryOk returns a tuple with the DestinationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCountry

`func (o *DestinationV2) SetDestinationCountry(v string)`

SetDestinationCountry sets DestinationCountry field to given value.

### HasDestinationCountry

`func (o *DestinationV2) HasDestinationCountry() bool`

HasDestinationCountry returns a boolean if a field has been set.

### GetDestinationCurrency

`func (o *DestinationV2) GetDestinationCurrency() string`

GetDestinationCurrency returns the DestinationCurrency field if non-nil, zero value otherwise.

### GetDestinationCurrencyOk

`func (o *DestinationV2) GetDestinationCurrencyOk() (*string, bool)`

GetDestinationCurrencyOk returns a tuple with the DestinationCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrency

`func (o *DestinationV2) SetDestinationCurrency(v string)`

SetDestinationCurrency sets DestinationCurrency field to given value.

### HasDestinationCurrency

`func (o *DestinationV2) HasDestinationCurrency() bool`

HasDestinationCurrency returns a boolean if a field has been set.

### GetDestinationBlockchainNetwork

`func (o *DestinationV2) GetDestinationBlockchainNetwork() string`

GetDestinationBlockchainNetwork returns the DestinationBlockchainNetwork field if non-nil, zero value otherwise.

### GetDestinationBlockchainNetworkOk

`func (o *DestinationV2) GetDestinationBlockchainNetworkOk() (*string, bool)`

GetDestinationBlockchainNetworkOk returns a tuple with the DestinationBlockchainNetwork field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationBlockchainNetwork

`func (o *DestinationV2) SetDestinationBlockchainNetwork(v string)`

SetDestinationBlockchainNetwork sets DestinationBlockchainNetwork field to given value.

### HasDestinationBlockchainNetwork

`func (o *DestinationV2) HasDestinationBlockchainNetwork() bool`

HasDestinationBlockchainNetwork returns a boolean if a field has been set.

### GetBeneficiaryIdentityId

`func (o *DestinationV2) GetBeneficiaryIdentityId() string`

GetBeneficiaryIdentityId returns the BeneficiaryIdentityId field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityIdOk

`func (o *DestinationV2) GetBeneficiaryIdentityIdOk() (*string, bool)`

GetBeneficiaryIdentityIdOk returns a tuple with the BeneficiaryIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityId

`func (o *DestinationV2) SetBeneficiaryIdentityId(v string)`

SetBeneficiaryIdentityId sets BeneficiaryIdentityId field to given value.

### HasBeneficiaryIdentityId

`func (o *DestinationV2) HasBeneficiaryIdentityId() bool`

HasBeneficiaryIdentityId returns a boolean if a field has been set.

### GetBeneficiaryIdentityVersion

`func (o *DestinationV2) GetBeneficiaryIdentityVersion() int32`

GetBeneficiaryIdentityVersion returns the BeneficiaryIdentityVersion field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityVersionOk

`func (o *DestinationV2) GetBeneficiaryIdentityVersionOk() (*int32, bool)`

GetBeneficiaryIdentityVersionOk returns a tuple with the BeneficiaryIdentityVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityVersion

`func (o *DestinationV2) SetBeneficiaryIdentityVersion(v int32)`

SetBeneficiaryIdentityVersion sets BeneficiaryIdentityVersion field to given value.

### HasBeneficiaryIdentityVersion

`func (o *DestinationV2) HasBeneficiaryIdentityVersion() bool`

HasBeneficiaryIdentityVersion returns a boolean if a field has been set.

### GetBeneficiaryIdentityNickName

`func (o *DestinationV2) GetBeneficiaryIdentityNickName() string`

GetBeneficiaryIdentityNickName returns the BeneficiaryIdentityNickName field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityNickNameOk

`func (o *DestinationV2) GetBeneficiaryIdentityNickNameOk() (*string, bool)`

GetBeneficiaryIdentityNickNameOk returns a tuple with the BeneficiaryIdentityNickName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityNickName

`func (o *DestinationV2) SetBeneficiaryIdentityNickName(v string)`

SetBeneficiaryIdentityNickName sets BeneficiaryIdentityNickName field to given value.

### HasBeneficiaryIdentityNickName

`func (o *DestinationV2) HasBeneficiaryIdentityNickName() bool`

HasBeneficiaryIdentityNickName returns a boolean if a field has been set.

### GetPayout

`func (o *DestinationV2) GetPayout() string`

GetPayout returns the Payout field if non-nil, zero value otherwise.

### GetPayoutOk

`func (o *DestinationV2) GetPayoutOk() (*string, bool)`

GetPayoutOk returns a tuple with the Payout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayout

`func (o *DestinationV2) SetPayout(v string)`

SetPayout sets Payout field to given value.

### HasPayout

`func (o *DestinationV2) HasPayout() bool`

HasPayout returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


