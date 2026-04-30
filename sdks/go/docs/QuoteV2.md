# QuoteV2

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
**PayinCategory** | **string** | The name of payin category specified in the quote request. | 
**AdjustedExchangeRate** | Pointer to [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**Fees** | Pointer to [**[]FeeSummaryV2**](FeeSummaryV2.md) | A summary of fees included in this quote. | [optional] 
**Taxes** | Pointer to [**[]TaxSummary**](TaxSummary.md) | A summary of taxes included in this quote. | [optional] 
**CreatedAt** | Pointer to **time.Time** | The time when this quote was created, specified in UTC. | [optional] 
**ExpiresAt** | Pointer to **time.Time** | The time when this quote expires, specified in UTC. | [optional] 
**PaymentRail** | Pointer to **string** | The payment rail used for this quote. | [optional] 

## Methods

### NewQuoteV2

`func NewQuoteV2(quoteId string, quoteStatus QuoteStatus, sourceCurrency string, destinationCurrency string, payinCategory string, ) *QuoteV2`

NewQuoteV2 instantiates a new QuoteV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteV2WithDefaults

`func NewQuoteV2WithDefaults() *QuoteV2`

NewQuoteV2WithDefaults instantiates a new QuoteV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteId

`func (o *QuoteV2) GetQuoteId() string`

GetQuoteId returns the QuoteId field if non-nil, zero value otherwise.

### GetQuoteIdOk

`func (o *QuoteV2) GetQuoteIdOk() (*string, bool)`

GetQuoteIdOk returns a tuple with the QuoteId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteId

`func (o *QuoteV2) SetQuoteId(v string)`

SetQuoteId sets QuoteId field to given value.


### GetQuoteStatus

`func (o *QuoteV2) GetQuoteStatus() QuoteStatus`

GetQuoteStatus returns the QuoteStatus field if non-nil, zero value otherwise.

### GetQuoteStatusOk

`func (o *QuoteV2) GetQuoteStatusOk() (*QuoteStatus, bool)`

GetQuoteStatusOk returns a tuple with the QuoteStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteStatus

`func (o *QuoteV2) SetQuoteStatus(v QuoteStatus)`

SetQuoteStatus sets QuoteStatus field to given value.


### GetQuoteAmountType

`func (o *QuoteV2) GetQuoteAmountType() QuoteAmountType`

GetQuoteAmountType returns the QuoteAmountType field if non-nil, zero value otherwise.

### GetQuoteAmountTypeOk

`func (o *QuoteV2) GetQuoteAmountTypeOk() (*QuoteAmountType, bool)`

GetQuoteAmountTypeOk returns a tuple with the QuoteAmountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmountType

`func (o *QuoteV2) SetQuoteAmountType(v QuoteAmountType)`

SetQuoteAmountType sets QuoteAmountType field to given value.

### HasQuoteAmountType

`func (o *QuoteV2) HasQuoteAmountType() bool`

HasQuoteAmountType returns a boolean if a field has been set.

### GetSourceAmount

`func (o *QuoteV2) GetSourceAmount() float64`

GetSourceAmount returns the SourceAmount field if non-nil, zero value otherwise.

### GetSourceAmountOk

`func (o *QuoteV2) GetSourceAmountOk() (*float64, bool)`

GetSourceAmountOk returns a tuple with the SourceAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceAmount

`func (o *QuoteV2) SetSourceAmount(v float64)`

SetSourceAmount sets SourceAmount field to given value.

### HasSourceAmount

`func (o *QuoteV2) HasSourceAmount() bool`

HasSourceAmount returns a boolean if a field has been set.

### GetDestinationAmount

`func (o *QuoteV2) GetDestinationAmount() float64`

GetDestinationAmount returns the DestinationAmount field if non-nil, zero value otherwise.

### GetDestinationAmountOk

`func (o *QuoteV2) GetDestinationAmountOk() (*float64, bool)`

GetDestinationAmountOk returns a tuple with the DestinationAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationAmount

`func (o *QuoteV2) SetDestinationAmount(v float64)`

SetDestinationAmount sets DestinationAmount field to given value.

### HasDestinationAmount

`func (o *QuoteV2) HasDestinationAmount() bool`

HasDestinationAmount returns a boolean if a field has been set.

### GetSourceCurrency

`func (o *QuoteV2) GetSourceCurrency() string`

GetSourceCurrency returns the SourceCurrency field if non-nil, zero value otherwise.

### GetSourceCurrencyOk

`func (o *QuoteV2) GetSourceCurrencyOk() (*string, bool)`

GetSourceCurrencyOk returns a tuple with the SourceCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCurrency

`func (o *QuoteV2) SetSourceCurrency(v string)`

SetSourceCurrency sets SourceCurrency field to given value.


### GetDestinationCurrency

`func (o *QuoteV2) GetDestinationCurrency() string`

GetDestinationCurrency returns the DestinationCurrency field if non-nil, zero value otherwise.

### GetDestinationCurrencyOk

`func (o *QuoteV2) GetDestinationCurrencyOk() (*string, bool)`

GetDestinationCurrencyOk returns a tuple with the DestinationCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrency

`func (o *QuoteV2) SetDestinationCurrency(v string)`

SetDestinationCurrency sets DestinationCurrency field to given value.


### GetSourceCountry

`func (o *QuoteV2) GetSourceCountry() string`

GetSourceCountry returns the SourceCountry field if non-nil, zero value otherwise.

### GetSourceCountryOk

`func (o *QuoteV2) GetSourceCountryOk() (*string, bool)`

GetSourceCountryOk returns a tuple with the SourceCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCountry

`func (o *QuoteV2) SetSourceCountry(v string)`

SetSourceCountry sets SourceCountry field to given value.

### HasSourceCountry

`func (o *QuoteV2) HasSourceCountry() bool`

HasSourceCountry returns a boolean if a field has been set.

### GetDestinationCountry

`func (o *QuoteV2) GetDestinationCountry() string`

GetDestinationCountry returns the DestinationCountry field if non-nil, zero value otherwise.

### GetDestinationCountryOk

`func (o *QuoteV2) GetDestinationCountryOk() (*string, bool)`

GetDestinationCountryOk returns a tuple with the DestinationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCountry

`func (o *QuoteV2) SetDestinationCountry(v string)`

SetDestinationCountry sets DestinationCountry field to given value.

### HasDestinationCountry

`func (o *QuoteV2) HasDestinationCountry() bool`

HasDestinationCountry returns a boolean if a field has been set.

### GetPayinCategory

`func (o *QuoteV2) GetPayinCategory() string`

GetPayinCategory returns the PayinCategory field if non-nil, zero value otherwise.

### GetPayinCategoryOk

`func (o *QuoteV2) GetPayinCategoryOk() (*string, bool)`

GetPayinCategoryOk returns a tuple with the PayinCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayinCategory

`func (o *QuoteV2) SetPayinCategory(v string)`

SetPayinCategory sets PayinCategory field to given value.


### GetAdjustedExchangeRate

`func (o *QuoteV2) GetAdjustedExchangeRate() AdjustedExchangeRate`

GetAdjustedExchangeRate returns the AdjustedExchangeRate field if non-nil, zero value otherwise.

### GetAdjustedExchangeRateOk

`func (o *QuoteV2) GetAdjustedExchangeRateOk() (*AdjustedExchangeRate, bool)`

GetAdjustedExchangeRateOk returns a tuple with the AdjustedExchangeRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdjustedExchangeRate

`func (o *QuoteV2) SetAdjustedExchangeRate(v AdjustedExchangeRate)`

SetAdjustedExchangeRate sets AdjustedExchangeRate field to given value.

### HasAdjustedExchangeRate

`func (o *QuoteV2) HasAdjustedExchangeRate() bool`

HasAdjustedExchangeRate returns a boolean if a field has been set.

### GetFees

`func (o *QuoteV2) GetFees() []FeeSummaryV2`

GetFees returns the Fees field if non-nil, zero value otherwise.

### GetFeesOk

`func (o *QuoteV2) GetFeesOk() (*[]FeeSummaryV2, bool)`

GetFeesOk returns a tuple with the Fees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFees

`func (o *QuoteV2) SetFees(v []FeeSummaryV2)`

SetFees sets Fees field to given value.

### HasFees

`func (o *QuoteV2) HasFees() bool`

HasFees returns a boolean if a field has been set.

### GetTaxes

`func (o *QuoteV2) GetTaxes() []TaxSummary`

GetTaxes returns the Taxes field if non-nil, zero value otherwise.

### GetTaxesOk

`func (o *QuoteV2) GetTaxesOk() (*[]TaxSummary, bool)`

GetTaxesOk returns a tuple with the Taxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxes

`func (o *QuoteV2) SetTaxes(v []TaxSummary)`

SetTaxes sets Taxes field to given value.

### HasTaxes

`func (o *QuoteV2) HasTaxes() bool`

HasTaxes returns a boolean if a field has been set.

### GetCreatedAt

`func (o *QuoteV2) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *QuoteV2) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *QuoteV2) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *QuoteV2) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetExpiresAt

`func (o *QuoteV2) GetExpiresAt() time.Time`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *QuoteV2) GetExpiresAtOk() (*time.Time, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *QuoteV2) SetExpiresAt(v time.Time)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *QuoteV2) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetPaymentRail

`func (o *QuoteV2) GetPaymentRail() string`

GetPaymentRail returns the PaymentRail field if non-nil, zero value otherwise.

### GetPaymentRailOk

`func (o *QuoteV2) GetPaymentRailOk() (*string, bool)`

GetPaymentRailOk returns a tuple with the PaymentRail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRail

`func (o *QuoteV2) SetPaymentRail(v string)`

SetPaymentRail sets PaymentRail field to given value.

### HasPaymentRail

`func (o *QuoteV2) HasPaymentRail() bool`

HasPaymentRail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


