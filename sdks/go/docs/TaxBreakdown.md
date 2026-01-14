# TaxBreakdown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaxAmount** | Pointer to **float64** | tax amount for this tax line item. | [optional] 
**TaxName** | Pointer to **string** | The name of the tax. | [optional] 
**TaxDescription** | Pointer to **string** | GST service fee tax . | [optional] 
**TaxRate** | Pointer to **float64** | The tax rate applied to calculate the tax amount. | [optional] 

## Methods

### NewTaxBreakdown

`func NewTaxBreakdown() *TaxBreakdown`

NewTaxBreakdown instantiates a new TaxBreakdown object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTaxBreakdownWithDefaults

`func NewTaxBreakdownWithDefaults() *TaxBreakdown`

NewTaxBreakdownWithDefaults instantiates a new TaxBreakdown object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTaxAmount

`func (o *TaxBreakdown) GetTaxAmount() float64`

GetTaxAmount returns the TaxAmount field if non-nil, zero value otherwise.

### GetTaxAmountOk

`func (o *TaxBreakdown) GetTaxAmountOk() (*float64, bool)`

GetTaxAmountOk returns a tuple with the TaxAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxAmount

`func (o *TaxBreakdown) SetTaxAmount(v float64)`

SetTaxAmount sets TaxAmount field to given value.

### HasTaxAmount

`func (o *TaxBreakdown) HasTaxAmount() bool`

HasTaxAmount returns a boolean if a field has been set.

### GetTaxName

`func (o *TaxBreakdown) GetTaxName() string`

GetTaxName returns the TaxName field if non-nil, zero value otherwise.

### GetTaxNameOk

`func (o *TaxBreakdown) GetTaxNameOk() (*string, bool)`

GetTaxNameOk returns a tuple with the TaxName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxName

`func (o *TaxBreakdown) SetTaxName(v string)`

SetTaxName sets TaxName field to given value.

### HasTaxName

`func (o *TaxBreakdown) HasTaxName() bool`

HasTaxName returns a boolean if a field has been set.

### GetTaxDescription

`func (o *TaxBreakdown) GetTaxDescription() string`

GetTaxDescription returns the TaxDescription field if non-nil, zero value otherwise.

### GetTaxDescriptionOk

`func (o *TaxBreakdown) GetTaxDescriptionOk() (*string, bool)`

GetTaxDescriptionOk returns a tuple with the TaxDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxDescription

`func (o *TaxBreakdown) SetTaxDescription(v string)`

SetTaxDescription sets TaxDescription field to given value.

### HasTaxDescription

`func (o *TaxBreakdown) HasTaxDescription() bool`

HasTaxDescription returns a boolean if a field has been set.

### GetTaxRate

`func (o *TaxBreakdown) GetTaxRate() float64`

GetTaxRate returns the TaxRate field if non-nil, zero value otherwise.

### GetTaxRateOk

`func (o *TaxBreakdown) GetTaxRateOk() (*float64, bool)`

GetTaxRateOk returns a tuple with the TaxRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxRate

`func (o *TaxBreakdown) SetTaxRate(v float64)`

SetTaxRate sets TaxRate field to given value.

### HasTaxRate

`func (o *TaxBreakdown) HasTaxRate() bool`

HasTaxRate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


