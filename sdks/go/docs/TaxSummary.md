# TaxSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalTaxes** | Pointer to **float64** | The value of the total taxes included in this quote. | [optional] 
**TaxCurrency** | Pointer to **string** | The currency in which taxes are charged. | [optional] 
**TaxBreakdown** | Pointer to [**[]TaxBreakdown**](TaxBreakdown.md) | An array of taxes with details such as tax description, rate, name and tax amount. | [optional] 

## Methods

### NewTaxSummary

`func NewTaxSummary() *TaxSummary`

NewTaxSummary instantiates a new TaxSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTaxSummaryWithDefaults

`func NewTaxSummaryWithDefaults() *TaxSummary`

NewTaxSummaryWithDefaults instantiates a new TaxSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotalTaxes

`func (o *TaxSummary) GetTotalTaxes() float64`

GetTotalTaxes returns the TotalTaxes field if non-nil, zero value otherwise.

### GetTotalTaxesOk

`func (o *TaxSummary) GetTotalTaxesOk() (*float64, bool)`

GetTotalTaxesOk returns a tuple with the TotalTaxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalTaxes

`func (o *TaxSummary) SetTotalTaxes(v float64)`

SetTotalTaxes sets TotalTaxes field to given value.

### HasTotalTaxes

`func (o *TaxSummary) HasTotalTaxes() bool`

HasTotalTaxes returns a boolean if a field has been set.

### GetTaxCurrency

`func (o *TaxSummary) GetTaxCurrency() string`

GetTaxCurrency returns the TaxCurrency field if non-nil, zero value otherwise.

### GetTaxCurrencyOk

`func (o *TaxSummary) GetTaxCurrencyOk() (*string, bool)`

GetTaxCurrencyOk returns a tuple with the TaxCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxCurrency

`func (o *TaxSummary) SetTaxCurrency(v string)`

SetTaxCurrency sets TaxCurrency field to given value.

### HasTaxCurrency

`func (o *TaxSummary) HasTaxCurrency() bool`

HasTaxCurrency returns a boolean if a field has been set.

### GetTaxBreakdown

`func (o *TaxSummary) GetTaxBreakdown() []TaxBreakdown`

GetTaxBreakdown returns the TaxBreakdown field if non-nil, zero value otherwise.

### GetTaxBreakdownOk

`func (o *TaxSummary) GetTaxBreakdownOk() (*[]TaxBreakdown, bool)`

GetTaxBreakdownOk returns a tuple with the TaxBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxBreakdown

`func (o *TaxSummary) SetTaxBreakdown(v []TaxBreakdown)`

SetTaxBreakdown sets TaxBreakdown field to given value.

### HasTaxBreakdown

`func (o *TaxSummary) HasTaxBreakdown() bool`

HasTaxBreakdown returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


