# FeeSummaryV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalFee** | Pointer to **float64** | The value of the total fee included in this quote. | [optional] 
**FeeCurrency** | Pointer to **string** | The currency in which fees are charged. | [optional] 
**FeeBreakdown** | Pointer to [**[]TotalFeeBreakdownV2**](TotalFeeBreakdownV2.md) | An array of fees that provides a breakdown of how the total fees is calculated for this quote. | [optional] 

## Methods

### NewFeeSummaryV2

`func NewFeeSummaryV2() *FeeSummaryV2`

NewFeeSummaryV2 instantiates a new FeeSummaryV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeeSummaryV2WithDefaults

`func NewFeeSummaryV2WithDefaults() *FeeSummaryV2`

NewFeeSummaryV2WithDefaults instantiates a new FeeSummaryV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotalFee

`func (o *FeeSummaryV2) GetTotalFee() float64`

GetTotalFee returns the TotalFee field if non-nil, zero value otherwise.

### GetTotalFeeOk

`func (o *FeeSummaryV2) GetTotalFeeOk() (*float64, bool)`

GetTotalFeeOk returns a tuple with the TotalFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalFee

`func (o *FeeSummaryV2) SetTotalFee(v float64)`

SetTotalFee sets TotalFee field to given value.

### HasTotalFee

`func (o *FeeSummaryV2) HasTotalFee() bool`

HasTotalFee returns a boolean if a field has been set.

### GetFeeCurrency

`func (o *FeeSummaryV2) GetFeeCurrency() string`

GetFeeCurrency returns the FeeCurrency field if non-nil, zero value otherwise.

### GetFeeCurrencyOk

`func (o *FeeSummaryV2) GetFeeCurrencyOk() (*string, bool)`

GetFeeCurrencyOk returns a tuple with the FeeCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeCurrency

`func (o *FeeSummaryV2) SetFeeCurrency(v string)`

SetFeeCurrency sets FeeCurrency field to given value.

### HasFeeCurrency

`func (o *FeeSummaryV2) HasFeeCurrency() bool`

HasFeeCurrency returns a boolean if a field has been set.

### GetFeeBreakdown

`func (o *FeeSummaryV2) GetFeeBreakdown() []TotalFeeBreakdownV2`

GetFeeBreakdown returns the FeeBreakdown field if non-nil, zero value otherwise.

### GetFeeBreakdownOk

`func (o *FeeSummaryV2) GetFeeBreakdownOk() (*[]TotalFeeBreakdownV2, bool)`

GetFeeBreakdownOk returns a tuple with the FeeBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeBreakdown

`func (o *FeeSummaryV2) SetFeeBreakdown(v []TotalFeeBreakdownV2)`

SetFeeBreakdown sets FeeBreakdown field to given value.

### HasFeeBreakdown

`func (o *FeeSummaryV2) HasFeeBreakdown() bool`

HasFeeBreakdown returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


