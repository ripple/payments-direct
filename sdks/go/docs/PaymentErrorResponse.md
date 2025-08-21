# PaymentErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**PaymentError**](PaymentError.md) |  | 
**Status** | **string** | Error Response Status | 

## Methods

### NewPaymentErrorResponse

`func NewPaymentErrorResponse(errors PaymentError, status string, ) *PaymentErrorResponse`

NewPaymentErrorResponse instantiates a new PaymentErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentErrorResponseWithDefaults

`func NewPaymentErrorResponseWithDefaults() *PaymentErrorResponse`

NewPaymentErrorResponseWithDefaults instantiates a new PaymentErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *PaymentErrorResponse) GetErrors() PaymentError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *PaymentErrorResponse) GetErrorsOk() (*PaymentError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *PaymentErrorResponse) SetErrors(v PaymentError)`

SetErrors sets Errors field to given value.


### GetStatus

`func (o *PaymentErrorResponse) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *PaymentErrorResponse) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *PaymentErrorResponse) SetStatus(v string)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


