# Quote

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteId** | **string** | Unique ID that represents this quote. | 
**QuoteStatus** | [**QuoteStatus**](QuoteStatus.md) |  | 
**QuoteAmountType** | Pointer to [**QuoteAmountType**](QuoteAmountType.md) |  | [optional] [default to QUOTEAMOUNTTYPE_SOURCE_AMOUNT]
**SourceAmount** | Pointer to **float64** | Amount to be sent by the originator. | [optional] 
**DestinationAmount** | Pointer to **float64** | Amount to be received by destination | [optional] 
**SourceCurrency** | **string** | The currency code of the currency that you are sending. | 
**DestinationCurrency** | **string** | The currency code of the currency in which your beneficiary will receive this payment. | 
**SourceCountry** | Pointer to **string** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. | [optional] 
**DestinationCountry** | Pointer to **string** | The country code to which you wish to send the funds. It follows ISO 3166-1 alpha-2 code | [optional] 
**PayoutCategory** | **string** | Name of the payout category specified in the quote request. | 
**PayinCategory** | **string** | The name of payin category specified in the quote request. | 
**AdjustedExchangeRate** | Pointer to [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**Fees** | Pointer to [**[]FeeSummary**](FeeSummary.md) | A summary of fees included in this quote. | [optional] 
**CreatedAt** | Pointer to **time.Time** | The time when this quote was created, specified in UTC. | [optional] 
**ExpiresAt** | Pointer to **time.Time** | The time when this quote expires, specified in UTC. | [optional] 
**DestinationBlockchainNetwork** | Pointer to **string** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] 

## Methods

### NewQuote

`func NewQuote(quoteId string, quoteStatus QuoteStatus, sourceCurrency string, destinationCurrency string, payoutCategory string, payinCategory string, ) *Quote`

NewQuote instantiates a new Quote object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteWithDefaults

`func NewQuoteWithDefaults() *Quote`

NewQuoteWithDefaults instantiates a new Quote object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteId

`func (o *Quote) GetQuoteId() string`

GetQuoteId returns the QuoteId field if non-nil, zero value otherwise.

### GetQuoteIdOk

`func (o *Quote) GetQuoteIdOk() (*string, bool)`

GetQuoteIdOk returns a tuple with the QuoteId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteId

`func (o *Quote) SetQuoteId(v string)`

SetQuoteId sets QuoteId field to given value.


### GetQuoteStatus

`func (o *Quote) GetQuoteStatus() QuoteStatus`

GetQuoteStatus returns the QuoteStatus field if non-nil, zero value otherwise.

### GetQuoteStatusOk

`func (o *Quote) GetQuoteStatusOk() (*QuoteStatus, bool)`

GetQuoteStatusOk returns a tuple with the QuoteStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteStatus

`func (o *Quote) SetQuoteStatus(v QuoteStatus)`

SetQuoteStatus sets QuoteStatus field to given value.


### GetQuoteAmountType

`func (o *Quote) GetQuoteAmountType() QuoteAmountType`

GetQuoteAmountType returns the QuoteAmountType field if non-nil, zero value otherwise.

### GetQuoteAmountTypeOk

`func (o *Quote) GetQuoteAmountTypeOk() (*QuoteAmountType, bool)`

GetQuoteAmountTypeOk returns a tuple with the QuoteAmountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmountType

`func (o *Quote) SetQuoteAmountType(v QuoteAmountType)`

SetQuoteAmountType sets QuoteAmountType field to given value.

### HasQuoteAmountType

`func (o *Quote) HasQuoteAmountType() bool`

HasQuoteAmountType returns a boolean if a field has been set.

### GetSourceAmount

`func (o *Quote) GetSourceAmount() float64`

GetSourceAmount returns the SourceAmount field if non-nil, zero value otherwise.

### GetSourceAmountOk

`func (o *Quote) GetSourceAmountOk() (*float64, bool)`

GetSourceAmountOk returns a tuple with the SourceAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceAmount

`func (o *Quote) SetSourceAmount(v float64)`

SetSourceAmount sets SourceAmount field to given value.

### HasSourceAmount

`func (o *Quote) HasSourceAmount() bool`

HasSourceAmount returns a boolean if a field has been set.

### GetDestinationAmount

`func (o *Quote) GetDestinationAmount() float64`

GetDestinationAmount returns the DestinationAmount field if non-nil, zero value otherwise.

### GetDestinationAmountOk

`func (o *Quote) GetDestinationAmountOk() (*float64, bool)`

GetDestinationAmountOk returns a tuple with the DestinationAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationAmount

`func (o *Quote) SetDestinationAmount(v float64)`

SetDestinationAmount sets DestinationAmount field to given value.

### HasDestinationAmount

`func (o *Quote) HasDestinationAmount() bool`

HasDestinationAmount returns a boolean if a field has been set.

### GetSourceCurrency

`func (o *Quote) GetSourceCurrency() string`

GetSourceCurrency returns the SourceCurrency field if non-nil, zero value otherwise.

### GetSourceCurrencyOk

`func (o *Quote) GetSourceCurrencyOk() (*string, bool)`

GetSourceCurrencyOk returns a tuple with the SourceCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCurrency

`func (o *Quote) SetSourceCurrency(v string)`

SetSourceCurrency sets SourceCurrency field to given value.


### GetDestinationCurrency

`func (o *Quote) GetDestinationCurrency() string`

GetDestinationCurrency returns the DestinationCurrency field if non-nil, zero value otherwise.

### GetDestinationCurrencyOk

`func (o *Quote) GetDestinationCurrencyOk() (*string, bool)`

GetDestinationCurrencyOk returns a tuple with the DestinationCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrency

`func (o *Quote) SetDestinationCurrency(v string)`

SetDestinationCurrency sets DestinationCurrency field to given value.


### GetSourceCountry

`func (o *Quote) GetSourceCountry() string`

GetSourceCountry returns the SourceCountry field if non-nil, zero value otherwise.

### GetSourceCountryOk

`func (o *Quote) GetSourceCountryOk() (*string, bool)`

GetSourceCountryOk returns a tuple with the SourceCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCountry

`func (o *Quote) SetSourceCountry(v string)`

SetSourceCountry sets SourceCountry field to given value.

### HasSourceCountry

`func (o *Quote) HasSourceCountry() bool`

HasSourceCountry returns a boolean if a field has been set.

### GetDestinationCountry

`func (o *Quote) GetDestinationCountry() string`

GetDestinationCountry returns the DestinationCountry field if non-nil, zero value otherwise.

### GetDestinationCountryOk

`func (o *Quote) GetDestinationCountryOk() (*string, bool)`

GetDestinationCountryOk returns a tuple with the DestinationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCountry

`func (o *Quote) SetDestinationCountry(v string)`

SetDestinationCountry sets DestinationCountry field to given value.

### HasDestinationCountry

`func (o *Quote) HasDestinationCountry() bool`

HasDestinationCountry returns a boolean if a field has been set.

### GetPayoutCategory

`func (o *Quote) GetPayoutCategory() string`

GetPayoutCategory returns the PayoutCategory field if non-nil, zero value otherwise.

### GetPayoutCategoryOk

`func (o *Quote) GetPayoutCategoryOk() (*string, bool)`

GetPayoutCategoryOk returns a tuple with the PayoutCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutCategory

`func (o *Quote) SetPayoutCategory(v string)`

SetPayoutCategory sets PayoutCategory field to given value.


### GetPayinCategory

`func (o *Quote) GetPayinCategory() string`

GetPayinCategory returns the PayinCategory field if non-nil, zero value otherwise.

### GetPayinCategoryOk

`func (o *Quote) GetPayinCategoryOk() (*string, bool)`

GetPayinCategoryOk returns a tuple with the PayinCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayinCategory

`func (o *Quote) SetPayinCategory(v string)`

SetPayinCategory sets PayinCategory field to given value.


### GetAdjustedExchangeRate

`func (o *Quote) GetAdjustedExchangeRate() AdjustedExchangeRate`

GetAdjustedExchangeRate returns the AdjustedExchangeRate field if non-nil, zero value otherwise.

### GetAdjustedExchangeRateOk

`func (o *Quote) GetAdjustedExchangeRateOk() (*AdjustedExchangeRate, bool)`

GetAdjustedExchangeRateOk returns a tuple with the AdjustedExchangeRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdjustedExchangeRate

`func (o *Quote) SetAdjustedExchangeRate(v AdjustedExchangeRate)`

SetAdjustedExchangeRate sets AdjustedExchangeRate field to given value.

### HasAdjustedExchangeRate

`func (o *Quote) HasAdjustedExchangeRate() bool`

HasAdjustedExchangeRate returns a boolean if a field has been set.

### GetFees

`func (o *Quote) GetFees() []FeeSummary`

GetFees returns the Fees field if non-nil, zero value otherwise.

### GetFeesOk

`func (o *Quote) GetFeesOk() (*[]FeeSummary, bool)`

GetFeesOk returns a tuple with the Fees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFees

`func (o *Quote) SetFees(v []FeeSummary)`

SetFees sets Fees field to given value.

### HasFees

`func (o *Quote) HasFees() bool`

HasFees returns a boolean if a field has been set.

### GetCreatedAt

`func (o *Quote) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Quote) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Quote) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *Quote) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetExpiresAt

`func (o *Quote) GetExpiresAt() time.Time`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *Quote) GetExpiresAtOk() (*time.Time, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *Quote) SetExpiresAt(v time.Time)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *Quote) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetDestinationBlockchainNetwork

`func (o *Quote) GetDestinationBlockchainNetwork() string`

GetDestinationBlockchainNetwork returns the DestinationBlockchainNetwork field if non-nil, zero value otherwise.

### GetDestinationBlockchainNetworkOk

`func (o *Quote) GetDestinationBlockchainNetworkOk() (*string, bool)`

GetDestinationBlockchainNetworkOk returns a tuple with the DestinationBlockchainNetwork field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationBlockchainNetwork

`func (o *Quote) SetDestinationBlockchainNetwork(v string)`

SetDestinationBlockchainNetwork sets DestinationBlockchainNetwork field to given value.

### HasDestinationBlockchainNetwork

`func (o *Quote) HasDestinationBlockchainNetwork() bool`

HasDestinationBlockchainNetwork returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


