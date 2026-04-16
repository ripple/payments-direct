# TotalFeeBreakdownV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CalculatedFee** | Pointer to **float64** | Value of the fee when the configured fee unit is applied against the &#x60;value&#x60;. | [optional] 
**FeeName** | Pointer to **string** | The name of the fee. | [optional] 
**FeeDescription** | Pointer to **string** | Description of the fee. | [optional] 
**PaymentRail** | Pointer to **string** | The payment rail associated with this fee line item. | [optional] 

## Methods

### NewTotalFeeBreakdownV2

`func NewTotalFeeBreakdownV2() *TotalFeeBreakdownV2`

NewTotalFeeBreakdownV2 instantiates a new TotalFeeBreakdownV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTotalFeeBreakdownV2WithDefaults

`func NewTotalFeeBreakdownV2WithDefaults() *TotalFeeBreakdownV2`

NewTotalFeeBreakdownV2WithDefaults instantiates a new TotalFeeBreakdownV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCalculatedFee

`func (o *TotalFeeBreakdownV2) GetCalculatedFee() float64`

GetCalculatedFee returns the CalculatedFee field if non-nil, zero value otherwise.

### GetCalculatedFeeOk

`func (o *TotalFeeBreakdownV2) GetCalculatedFeeOk() (*float64, bool)`

GetCalculatedFeeOk returns a tuple with the CalculatedFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalculatedFee

`func (o *TotalFeeBreakdownV2) SetCalculatedFee(v float64)`

SetCalculatedFee sets CalculatedFee field to given value.

### HasCalculatedFee

`func (o *TotalFeeBreakdownV2) HasCalculatedFee() bool`

HasCalculatedFee returns a boolean if a field has been set.

### GetFeeName

`func (o *TotalFeeBreakdownV2) GetFeeName() string`

GetFeeName returns the FeeName field if non-nil, zero value otherwise.

### GetFeeNameOk

`func (o *TotalFeeBreakdownV2) GetFeeNameOk() (*string, bool)`

GetFeeNameOk returns a tuple with the FeeName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeName

`func (o *TotalFeeBreakdownV2) SetFeeName(v string)`

SetFeeName sets FeeName field to given value.

### HasFeeName

`func (o *TotalFeeBreakdownV2) HasFeeName() bool`

HasFeeName returns a boolean if a field has been set.

### GetFeeDescription

`func (o *TotalFeeBreakdownV2) GetFeeDescription() string`

GetFeeDescription returns the FeeDescription field if non-nil, zero value otherwise.

### GetFeeDescriptionOk

`func (o *TotalFeeBreakdownV2) GetFeeDescriptionOk() (*string, bool)`

GetFeeDescriptionOk returns a tuple with the FeeDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeDescription

`func (o *TotalFeeBreakdownV2) SetFeeDescription(v string)`

SetFeeDescription sets FeeDescription field to given value.

### HasFeeDescription

`func (o *TotalFeeBreakdownV2) HasFeeDescription() bool`

HasFeeDescription returns a boolean if a field has been set.

### GetPaymentRail

`func (o *TotalFeeBreakdownV2) GetPaymentRail() string`

GetPaymentRail returns the PaymentRail field if non-nil, zero value otherwise.

### GetPaymentRailOk

`func (o *TotalFeeBreakdownV2) GetPaymentRailOk() (*string, bool)`

GetPaymentRailOk returns a tuple with the PaymentRail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRail

`func (o *TotalFeeBreakdownV2) SetPaymentRail(v string)`

SetPaymentRail sets PaymentRail field to given value.

### HasPaymentRail

`func (o *TotalFeeBreakdownV2) HasPaymentRail() bool`

HasPaymentRail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


