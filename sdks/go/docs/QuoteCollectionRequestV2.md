# QuoteCollectionRequestV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteAmount** | **float64** | The amount for which you wish to receive a collection of quotes. | 
**QuoteAmountType** | [**QuoteAmountType**](QuoteAmountType.md) |  | [default to QUOTEAMOUNTTYPE_SOURCE_AMOUNT]
**SourceCurrency** | **string** | The currency code of the currency that you are sending. | 
**DestinationCurrency** | **string** | The currency code of the currency in which your beneficiary will receive this payment. | 
**SourceCountry** | Pointer to **string** | The country code of the country from where you are sending the funds. This is an ISO 3166-1 alpha-2 code. | [optional] 
**DestinationCountry** | Pointer to **string** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] 
**PayinCategory** | **string** | The name of the pay in category indicating how this payment will be funded. | 
**PaymentRail** | Pointer to **string** | The payment rail on which the beneficiary will receive this payment. This value may be used to filter quotes to a specific subset of supported payout rails. If not provided, quotes will be returned for all supported payout rails. For a list of supported values, see [Payment rail reference](/products/payments-direct-2/api-docs/integration-resources/payment-rail-reference).  | [optional] 

## Methods

### NewQuoteCollectionRequestV2

`func NewQuoteCollectionRequestV2(quoteAmount float64, quoteAmountType QuoteAmountType, sourceCurrency string, destinationCurrency string, payinCategory string, ) *QuoteCollectionRequestV2`

NewQuoteCollectionRequestV2 instantiates a new QuoteCollectionRequestV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteCollectionRequestV2WithDefaults

`func NewQuoteCollectionRequestV2WithDefaults() *QuoteCollectionRequestV2`

NewQuoteCollectionRequestV2WithDefaults instantiates a new QuoteCollectionRequestV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteAmount

`func (o *QuoteCollectionRequestV2) GetQuoteAmount() float64`

GetQuoteAmount returns the QuoteAmount field if non-nil, zero value otherwise.

### GetQuoteAmountOk

`func (o *QuoteCollectionRequestV2) GetQuoteAmountOk() (*float64, bool)`

GetQuoteAmountOk returns a tuple with the QuoteAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmount

`func (o *QuoteCollectionRequestV2) SetQuoteAmount(v float64)`

SetQuoteAmount sets QuoteAmount field to given value.


### GetQuoteAmountType

`func (o *QuoteCollectionRequestV2) GetQuoteAmountType() QuoteAmountType`

GetQuoteAmountType returns the QuoteAmountType field if non-nil, zero value otherwise.

### GetQuoteAmountTypeOk

`func (o *QuoteCollectionRequestV2) GetQuoteAmountTypeOk() (*QuoteAmountType, bool)`

GetQuoteAmountTypeOk returns a tuple with the QuoteAmountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteAmountType

`func (o *QuoteCollectionRequestV2) SetQuoteAmountType(v QuoteAmountType)`

SetQuoteAmountType sets QuoteAmountType field to given value.


### GetSourceCurrency

`func (o *QuoteCollectionRequestV2) GetSourceCurrency() string`

GetSourceCurrency returns the SourceCurrency field if non-nil, zero value otherwise.

### GetSourceCurrencyOk

`func (o *QuoteCollectionRequestV2) GetSourceCurrencyOk() (*string, bool)`

GetSourceCurrencyOk returns a tuple with the SourceCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCurrency

`func (o *QuoteCollectionRequestV2) SetSourceCurrency(v string)`

SetSourceCurrency sets SourceCurrency field to given value.


### GetDestinationCurrency

`func (o *QuoteCollectionRequestV2) GetDestinationCurrency() string`

GetDestinationCurrency returns the DestinationCurrency field if non-nil, zero value otherwise.

### GetDestinationCurrencyOk

`func (o *QuoteCollectionRequestV2) GetDestinationCurrencyOk() (*string, bool)`

GetDestinationCurrencyOk returns a tuple with the DestinationCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrency

`func (o *QuoteCollectionRequestV2) SetDestinationCurrency(v string)`

SetDestinationCurrency sets DestinationCurrency field to given value.


### GetSourceCountry

`func (o *QuoteCollectionRequestV2) GetSourceCountry() string`

GetSourceCountry returns the SourceCountry field if non-nil, zero value otherwise.

### GetSourceCountryOk

`func (o *QuoteCollectionRequestV2) GetSourceCountryOk() (*string, bool)`

GetSourceCountryOk returns a tuple with the SourceCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceCountry

`func (o *QuoteCollectionRequestV2) SetSourceCountry(v string)`

SetSourceCountry sets SourceCountry field to given value.

### HasSourceCountry

`func (o *QuoteCollectionRequestV2) HasSourceCountry() bool`

HasSourceCountry returns a boolean if a field has been set.

### GetDestinationCountry

`func (o *QuoteCollectionRequestV2) GetDestinationCountry() string`

GetDestinationCountry returns the DestinationCountry field if non-nil, zero value otherwise.

### GetDestinationCountryOk

`func (o *QuoteCollectionRequestV2) GetDestinationCountryOk() (*string, bool)`

GetDestinationCountryOk returns a tuple with the DestinationCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCountry

`func (o *QuoteCollectionRequestV2) SetDestinationCountry(v string)`

SetDestinationCountry sets DestinationCountry field to given value.

### HasDestinationCountry

`func (o *QuoteCollectionRequestV2) HasDestinationCountry() bool`

HasDestinationCountry returns a boolean if a field has been set.

### GetPayinCategory

`func (o *QuoteCollectionRequestV2) GetPayinCategory() string`

GetPayinCategory returns the PayinCategory field if non-nil, zero value otherwise.

### GetPayinCategoryOk

`func (o *QuoteCollectionRequestV2) GetPayinCategoryOk() (*string, bool)`

GetPayinCategoryOk returns a tuple with the PayinCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayinCategory

`func (o *QuoteCollectionRequestV2) SetPayinCategory(v string)`

SetPayinCategory sets PayinCategory field to given value.


### GetPaymentRail

`func (o *QuoteCollectionRequestV2) GetPaymentRail() string`

GetPaymentRail returns the PaymentRail field if non-nil, zero value otherwise.

### GetPaymentRailOk

`func (o *QuoteCollectionRequestV2) GetPaymentRailOk() (*string, bool)`

GetPaymentRailOk returns a tuple with the PaymentRail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRail

`func (o *QuoteCollectionRequestV2) SetPaymentRail(v string)`

SetPaymentRail sets PaymentRail field to given value.

### HasPaymentRail

`func (o *QuoteCollectionRequestV2) HasPaymentRail() bool`

HasPaymentRail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


