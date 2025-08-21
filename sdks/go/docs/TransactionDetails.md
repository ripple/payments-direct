# TransactionDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentProduct** | Pointer to **NullableString** | The Ripple payments product used to make this payment. | [optional] 
**FlowType** | Pointer to **NullableString** | Specifies the type of payment you&#39;re making as categorized by the identity type of the payment originator and beneficiary. | [optional] 
**ThirdPartyPayment** | Pointer to **NullableBool** | Flag to indicate if this payment is initiated on behalf of a third-party originator. | [optional] 
**BusinessUseCase** | Pointer to **NullableString** | Indicates the type of payment you&#39;re making. | [optional] 

## Methods

### NewTransactionDetails

`func NewTransactionDetails() *TransactionDetails`

NewTransactionDetails instantiates a new TransactionDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTransactionDetailsWithDefaults

`func NewTransactionDetailsWithDefaults() *TransactionDetails`

NewTransactionDetailsWithDefaults instantiates a new TransactionDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentProduct

`func (o *TransactionDetails) GetPaymentProduct() string`

GetPaymentProduct returns the PaymentProduct field if non-nil, zero value otherwise.

### GetPaymentProductOk

`func (o *TransactionDetails) GetPaymentProductOk() (*string, bool)`

GetPaymentProductOk returns a tuple with the PaymentProduct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentProduct

`func (o *TransactionDetails) SetPaymentProduct(v string)`

SetPaymentProduct sets PaymentProduct field to given value.

### HasPaymentProduct

`func (o *TransactionDetails) HasPaymentProduct() bool`

HasPaymentProduct returns a boolean if a field has been set.

### SetPaymentProductNil

`func (o *TransactionDetails) SetPaymentProductNil(b bool)`

 SetPaymentProductNil sets the value for PaymentProduct to be an explicit nil

### UnsetPaymentProduct
`func (o *TransactionDetails) UnsetPaymentProduct()`

UnsetPaymentProduct ensures that no value is present for PaymentProduct, not even an explicit nil
### GetFlowType

`func (o *TransactionDetails) GetFlowType() string`

GetFlowType returns the FlowType field if non-nil, zero value otherwise.

### GetFlowTypeOk

`func (o *TransactionDetails) GetFlowTypeOk() (*string, bool)`

GetFlowTypeOk returns a tuple with the FlowType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlowType

`func (o *TransactionDetails) SetFlowType(v string)`

SetFlowType sets FlowType field to given value.

### HasFlowType

`func (o *TransactionDetails) HasFlowType() bool`

HasFlowType returns a boolean if a field has been set.

### SetFlowTypeNil

`func (o *TransactionDetails) SetFlowTypeNil(b bool)`

 SetFlowTypeNil sets the value for FlowType to be an explicit nil

### UnsetFlowType
`func (o *TransactionDetails) UnsetFlowType()`

UnsetFlowType ensures that no value is present for FlowType, not even an explicit nil
### GetThirdPartyPayment

`func (o *TransactionDetails) GetThirdPartyPayment() bool`

GetThirdPartyPayment returns the ThirdPartyPayment field if non-nil, zero value otherwise.

### GetThirdPartyPaymentOk

`func (o *TransactionDetails) GetThirdPartyPaymentOk() (*bool, bool)`

GetThirdPartyPaymentOk returns a tuple with the ThirdPartyPayment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThirdPartyPayment

`func (o *TransactionDetails) SetThirdPartyPayment(v bool)`

SetThirdPartyPayment sets ThirdPartyPayment field to given value.

### HasThirdPartyPayment

`func (o *TransactionDetails) HasThirdPartyPayment() bool`

HasThirdPartyPayment returns a boolean if a field has been set.

### SetThirdPartyPaymentNil

`func (o *TransactionDetails) SetThirdPartyPaymentNil(b bool)`

 SetThirdPartyPaymentNil sets the value for ThirdPartyPayment to be an explicit nil

### UnsetThirdPartyPayment
`func (o *TransactionDetails) UnsetThirdPartyPayment()`

UnsetThirdPartyPayment ensures that no value is present for ThirdPartyPayment, not even an explicit nil
### GetBusinessUseCase

`func (o *TransactionDetails) GetBusinessUseCase() string`

GetBusinessUseCase returns the BusinessUseCase field if non-nil, zero value otherwise.

### GetBusinessUseCaseOk

`func (o *TransactionDetails) GetBusinessUseCaseOk() (*string, bool)`

GetBusinessUseCaseOk returns a tuple with the BusinessUseCase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessUseCase

`func (o *TransactionDetails) SetBusinessUseCase(v string)`

SetBusinessUseCase sets BusinessUseCase field to given value.

### HasBusinessUseCase

`func (o *TransactionDetails) HasBusinessUseCase() bool`

HasBusinessUseCase returns a boolean if a field has been set.

### SetBusinessUseCaseNil

`func (o *TransactionDetails) SetBusinessUseCaseNil(b bool)`

 SetBusinessUseCaseNil sets the value for BusinessUseCase to be an explicit nil

### UnsetBusinessUseCase
`func (o *TransactionDetails) UnsetBusinessUseCase()`

UnsetBusinessUseCase ensures that no value is present for BusinessUseCase, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


