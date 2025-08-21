# FeeSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalFee** | Pointer to **float64** | The value of the total fee included in this quote. | [optional] 
**FeeCurrency** | Pointer to **string** | The currency in which fees are charged. | [optional] 
**FeeBreakdown** | Pointer to [**[]TotalFeeBreakdown**](TotalFeeBreakdown.md) | An array of fees that provides a breakdown of how the total fees is calculated for this quote. | [optional] 

## Methods

### NewFeeSummary

`func NewFeeSummary() *FeeSummary`

NewFeeSummary instantiates a new FeeSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeeSummaryWithDefaults

`func NewFeeSummaryWithDefaults() *FeeSummary`

NewFeeSummaryWithDefaults instantiates a new FeeSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotalFee

`func (o *FeeSummary) GetTotalFee() float64`

GetTotalFee returns the TotalFee field if non-nil, zero value otherwise.

### GetTotalFeeOk

`func (o *FeeSummary) GetTotalFeeOk() (*float64, bool)`

GetTotalFeeOk returns a tuple with the TotalFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalFee

`func (o *FeeSummary) SetTotalFee(v float64)`

SetTotalFee sets TotalFee field to given value.

### HasTotalFee

`func (o *FeeSummary) HasTotalFee() bool`

HasTotalFee returns a boolean if a field has been set.

### GetFeeCurrency

`func (o *FeeSummary) GetFeeCurrency() string`

GetFeeCurrency returns the FeeCurrency field if non-nil, zero value otherwise.

### GetFeeCurrencyOk

`func (o *FeeSummary) GetFeeCurrencyOk() (*string, bool)`

GetFeeCurrencyOk returns a tuple with the FeeCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeCurrency

`func (o *FeeSummary) SetFeeCurrency(v string)`

SetFeeCurrency sets FeeCurrency field to given value.

### HasFeeCurrency

`func (o *FeeSummary) HasFeeCurrency() bool`

HasFeeCurrency returns a boolean if a field has been set.

### GetFeeBreakdown

`func (o *FeeSummary) GetFeeBreakdown() []TotalFeeBreakdown`

GetFeeBreakdown returns the FeeBreakdown field if non-nil, zero value otherwise.

### GetFeeBreakdownOk

`func (o *FeeSummary) GetFeeBreakdownOk() (*[]TotalFeeBreakdown, bool)`

GetFeeBreakdownOk returns a tuple with the FeeBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeBreakdown

`func (o *FeeSummary) SetFeeBreakdown(v []TotalFeeBreakdown)`

SetFeeBreakdown sets FeeBreakdown field to given value.

### HasFeeBreakdown

`func (o *FeeSummary) HasFeeBreakdown() bool`

HasFeeBreakdown returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


