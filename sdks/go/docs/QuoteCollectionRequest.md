# QuoteCollectionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteAmount** | **float64** | The amount for which you wish to receive a collection of quotes. | 
**QuoteAmountType** | [**QuoteAmountType**](QuoteAmountType.md) |  | [default to QUOTEAMOUNTTYPE_SOURCE_AMOUNT]
**SourceCurrency** | **string** | The currency code of the currency that you are sending. | 
**DestinationCurrency** | **string** | The currency code of the currency in which your beneficiary will receive this payment. | 
**SourceCountry** | Pointer to **string** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. | [optional] 
**DestinationCountry** | Pointer to **string** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] 
**PayoutCategory** | **string** | The name of the payout category. | 
**PayinCategory** | **string** | The name of the pay in category indicating how this payment will be funded. | 
**DestinationBlockchainNetwork** | Pointer to **string** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] 

## Methods

### NewQuoteCollectionRequest

`func NewQuoteCollectionRequest(quoteAmount float64, quoteAmountType QuoteAmountType, sourceCurrency string, destinationCurrency string, payoutCategory string, payinCategory string, ) *QuoteCollectionRequest`

NewQuoteCollectionRequest instantiates a new QuoteCollectionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteCollectionRequestWithDefaults

`func NewQuoteCollectionRequestWithDefaults() *QuoteCollectionRequest`

NewQuoteCollectionRequestWithDefaults instantiates a new QuoteCollectionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteAmount

`func (o *QuoteCollectionRequest) GetQuoteAmount() float64`

GetQuoteAmount returns the QuoteAmount field if non-nil, zero value otherwise.

### GetQuoteAmountOk

`func (o *QuoteCollectionRequest) GetQuoteAmountOk() (*float64, bool)`

GetQuoteAmountOk returns a tuple with the QuoteAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmount

`func (o *QuoteCollectionRequest) SetQuoteAmount(v float64)`

SetQuoteAmount sets QuoteAmount field to given value.


### GetQuoteAmountType

`func (o *QuoteCollectionRequest) GetQuoteAmountType() QuoteAmountType`

GetQuoteAmountType returns the QuoteAmountType field if non-nil, zero value otherwise.

### GetQuoteAmountTypeOk

`func (o *QuoteCollectionRequest) GetQuoteAmountTypeOk() (*QuoteAmountType, bool)`

GetQuoteAmountTypeOk returns a tuple with the QuoteAmountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmountType

`func (o *QuoteCollectionRequest) SetQuoteAmountType(v QuoteAmountType)`

SetQuoteAmountType sets QuoteAmountType field to given value.


### GetSourceCurrency

`func (o *QuoteCollectionRequest) GetSourceCurrency() string`

GetSourceCurrency returns the SourceCurrency field if non-nil, zero value otherwise.

### GetSourceCurrencyOk

`func (o *QuoteCollectionRequest) GetSourceCurrencyOk() (*string, bool)`

GetSourceCurrencyOk returns a tuple with the SourceCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCurrency

`func (o *QuoteCollectionRequest) SetSourceCurrency(v string)`

SetSourceCurrency sets SourceCurrency field to given value.


### GetDestinationCurrency

`func (o *QuoteCollectionRequest) GetDestinationCurrency() string`

GetDestinationCurrency returns the DestinationCurrency field if non-nil, zero value otherwise.

### GetDestinationCurrencyOk

`func (o *QuoteCollectionRequest) GetDestinationCurrencyOk() (*string, bool)`

GetDestinationCurrencyOk returns a tuple with the DestinationCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrency

`func (o *QuoteCollectionRequest) SetDestinationCurrency(v string)`

SetDestinationCurrency sets DestinationCurrency field to given value.


### GetSourceCountry

`func (o *QuoteCollectionRequest) GetSourceCountry() string`

GetSourceCountry returns the SourceCountry field if non-nil, zero value otherwise.

### GetSourceCountryOk

`func (o *QuoteCollectionRequest) GetSourceCountryOk() (*string, bool)`

GetSourceCountryOk returns a tuple with the SourceCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCountry

`func (o *QuoteCollectionRequest) SetSourceCountry(v string)`

SetSourceCountry sets SourceCountry field to given value.

### HasSourceCountry

`func (o *QuoteCollectionRequest) HasSourceCountry() bool`

HasSourceCountry returns a boolean if a field has been set.

### GetDestinationCountry

`func (o *QuoteCollectionRequest) GetDestinationCountry() string`

GetDestinationCountry returns the DestinationCountry field if non-nil, zero value otherwise.

### GetDestinationCountryOk

`func (o *QuoteCollectionRequest) GetDestinationCountryOk() (*string, bool)`

GetDestinationCountryOk returns a tuple with the DestinationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCountry

`func (o *QuoteCollectionRequest) SetDestinationCountry(v string)`

SetDestinationCountry sets DestinationCountry field to given value.

### HasDestinationCountry

`func (o *QuoteCollectionRequest) HasDestinationCountry() bool`

HasDestinationCountry returns a boolean if a field has been set.

### GetPayoutCategory

`func (o *QuoteCollectionRequest) GetPayoutCategory() string`

GetPayoutCategory returns the PayoutCategory field if non-nil, zero value otherwise.

### GetPayoutCategoryOk

`func (o *QuoteCollectionRequest) GetPayoutCategoryOk() (*string, bool)`

GetPayoutCategoryOk returns a tuple with the PayoutCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutCategory

`func (o *QuoteCollectionRequest) SetPayoutCategory(v string)`

SetPayoutCategory sets PayoutCategory field to given value.


### GetPayinCategory

`func (o *QuoteCollectionRequest) GetPayinCategory() string`

GetPayinCategory returns the PayinCategory field if non-nil, zero value otherwise.

### GetPayinCategoryOk

`func (o *QuoteCollectionRequest) GetPayinCategoryOk() (*string, bool)`

GetPayinCategoryOk returns a tuple with the PayinCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayinCategory

`func (o *QuoteCollectionRequest) SetPayinCategory(v string)`

SetPayinCategory sets PayinCategory field to given value.


### GetDestinationBlockchainNetwork

`func (o *QuoteCollectionRequest) GetDestinationBlockchainNetwork() string`

GetDestinationBlockchainNetwork returns the DestinationBlockchainNetwork field if non-nil, zero value otherwise.

### GetDestinationBlockchainNetworkOk

`func (o *QuoteCollectionRequest) GetDestinationBlockchainNetworkOk() (*string, bool)`

GetDestinationBlockchainNetworkOk returns a tuple with the DestinationBlockchainNetwork field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationBlockchainNetwork

`func (o *QuoteCollectionRequest) SetDestinationBlockchainNetwork(v string)`

SetDestinationBlockchainNetwork sets DestinationBlockchainNetwork field to given value.

### HasDestinationBlockchainNetwork

`func (o *QuoteCollectionRequest) HasDestinationBlockchainNetwork() bool`

HasDestinationBlockchainNetwork returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


