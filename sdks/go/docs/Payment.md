# Payment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentId** | **string** | The unique ID that identifies this payment. This value is the same as the quote ID. | 
**CryptoTransactionHash** | Pointer to **string** | Transaction hash of the crypto payment on the destination blockchain network | [optional] 
**InitiatedAt** | Pointer to **time.Time** | The time at which the payment was initiated, specified in UTC. | [optional] 
**ExpiresAt** | Pointer to **time.Time** | The time at which this payment expires, specified in UTC. | [optional] 
**LastStateUpdatedAt** | Pointer to **time.Time** | The time at which the payment state was last updated for this payment, specified in UTC. | [optional] 
**PaymentState** | [**PaymentState**](PaymentState.md) |  | 
**Originator** | Pointer to [**Originator**](Originator.md) |  | [optional] 
**Destination** | Pointer to [**Destination**](Destination.md) |  | [optional] 
**AdjustedExchangeRate** | Pointer to [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**Fees** | Pointer to [**[]FeeSummary**](FeeSummary.md) | A summary of fees included in payment quote. | [optional] 
**SourceOfCash** | Pointer to **string** | Indicates the source of funds | [optional] 
**PurposeCode** | Pointer to **string** | Indicates the purpose of the payment  For more information about the &#x60;purposeCode&#x60; options, see  [purposeCode](../../building-payment-request-body/#purposecode).  | [optional] 
**TransactionDetails** | Pointer to [**TransactionDetails**](TransactionDetails.md) |  | [optional] 
**PaymentLabels** | Pointer to **[]string** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 

## Methods

### NewPayment

`func NewPayment(paymentId string, paymentState PaymentState, ) *Payment`

NewPayment instantiates a new Payment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentWithDefaults

`func NewPaymentWithDefaults() *Payment`

NewPaymentWithDefaults instantiates a new Payment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentId

`func (o *Payment) GetPaymentId() string`

GetPaymentId returns the PaymentId field if non-nil, zero value otherwise.

### GetPaymentIdOk

`func (o *Payment) GetPaymentIdOk() (*string, bool)`

GetPaymentIdOk returns a tuple with the PaymentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentId

`func (o *Payment) SetPaymentId(v string)`

SetPaymentId sets PaymentId field to given value.


### GetCryptoTransactionHash

`func (o *Payment) GetCryptoTransactionHash() string`

GetCryptoTransactionHash returns the CryptoTransactionHash field if non-nil, zero value otherwise.

### GetCryptoTransactionHashOk

`func (o *Payment) GetCryptoTransactionHashOk() (*string, bool)`

GetCryptoTransactionHashOk returns a tuple with the CryptoTransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptoTransactionHash

`func (o *Payment) SetCryptoTransactionHash(v string)`

SetCryptoTransactionHash sets CryptoTransactionHash field to given value.

### HasCryptoTransactionHash

`func (o *Payment) HasCryptoTransactionHash() bool`

HasCryptoTransactionHash returns a boolean if a field has been set.

### GetInitiatedAt

`func (o *Payment) GetInitiatedAt() time.Time`

GetInitiatedAt returns the InitiatedAt field if non-nil, zero value otherwise.

### GetInitiatedAtOk

`func (o *Payment) GetInitiatedAtOk() (*time.Time, bool)`

GetInitiatedAtOk returns a tuple with the InitiatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitiatedAt

`func (o *Payment) SetInitiatedAt(v time.Time)`

SetInitiatedAt sets InitiatedAt field to given value.

### HasInitiatedAt

`func (o *Payment) HasInitiatedAt() bool`

HasInitiatedAt returns a boolean if a field has been set.

### GetExpiresAt

`func (o *Payment) GetExpiresAt() time.Time`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *Payment) GetExpiresAtOk() (*time.Time, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *Payment) SetExpiresAt(v time.Time)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *Payment) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetLastStateUpdatedAt

`func (o *Payment) GetLastStateUpdatedAt() time.Time`

GetLastStateUpdatedAt returns the LastStateUpdatedAt field if non-nil, zero value otherwise.

### GetLastStateUpdatedAtOk

`func (o *Payment) GetLastStateUpdatedAtOk() (*time.Time, bool)`

GetLastStateUpdatedAtOk returns a tuple with the LastStateUpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastStateUpdatedAt

`func (o *Payment) SetLastStateUpdatedAt(v time.Time)`

SetLastStateUpdatedAt sets LastStateUpdatedAt field to given value.

### HasLastStateUpdatedAt

`func (o *Payment) HasLastStateUpdatedAt() bool`

HasLastStateUpdatedAt returns a boolean if a field has been set.

### GetPaymentState

`func (o *Payment) GetPaymentState() PaymentState`

GetPaymentState returns the PaymentState field if non-nil, zero value otherwise.

### GetPaymentStateOk

`func (o *Payment) GetPaymentStateOk() (*PaymentState, bool)`

GetPaymentStateOk returns a tuple with the PaymentState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentState

`func (o *Payment) SetPaymentState(v PaymentState)`

SetPaymentState sets PaymentState field to given value.


### GetOriginator

`func (o *Payment) GetOriginator() Originator`

GetOriginator returns the Originator field if non-nil, zero value otherwise.

### GetOriginatorOk

`func (o *Payment) GetOriginatorOk() (*Originator, bool)`

GetOriginatorOk returns a tuple with the Originator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginator

`func (o *Payment) SetOriginator(v Originator)`

SetOriginator sets Originator field to given value.

### HasOriginator

`func (o *Payment) HasOriginator() bool`

HasOriginator returns a boolean if a field has been set.

### GetDestination

`func (o *Payment) GetDestination() Destination`

GetDestination returns the Destination field if non-nil, zero value otherwise.

### GetDestinationOk

`func (o *Payment) GetDestinationOk() (*Destination, bool)`

GetDestinationOk returns a tuple with the Destination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestination

`func (o *Payment) SetDestination(v Destination)`

SetDestination sets Destination field to given value.

### HasDestination

`func (o *Payment) HasDestination() bool`

HasDestination returns a boolean if a field has been set.

### GetAdjustedExchangeRate

`func (o *Payment) GetAdjustedExchangeRate() AdjustedExchangeRate`

GetAdjustedExchangeRate returns the AdjustedExchangeRate field if non-nil, zero value otherwise.

### GetAdjustedExchangeRateOk

`func (o *Payment) GetAdjustedExchangeRateOk() (*AdjustedExchangeRate, bool)`

GetAdjustedExchangeRateOk returns a tuple with the AdjustedExchangeRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdjustedExchangeRate

`func (o *Payment) SetAdjustedExchangeRate(v AdjustedExchangeRate)`

SetAdjustedExchangeRate sets AdjustedExchangeRate field to given value.

### HasAdjustedExchangeRate

`func (o *Payment) HasAdjustedExchangeRate() bool`

HasAdjustedExchangeRate returns a boolean if a field has been set.

### GetFees

`func (o *Payment) GetFees() []FeeSummary`

GetFees returns the Fees field if non-nil, zero value otherwise.

### GetFeesOk

`func (o *Payment) GetFeesOk() (*[]FeeSummary, bool)`

GetFeesOk returns a tuple with the Fees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFees

`func (o *Payment) SetFees(v []FeeSummary)`

SetFees sets Fees field to given value.

### HasFees

`func (o *Payment) HasFees() bool`

HasFees returns a boolean if a field has been set.

### GetSourceOfCash

`func (o *Payment) GetSourceOfCash() string`

GetSourceOfCash returns the SourceOfCash field if non-nil, zero value otherwise.

### GetSourceOfCashOk

`func (o *Payment) GetSourceOfCashOk() (*string, bool)`

GetSourceOfCashOk returns a tuple with the SourceOfCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceOfCash

`func (o *Payment) SetSourceOfCash(v string)`

SetSourceOfCash sets SourceOfCash field to given value.

### HasSourceOfCash

`func (o *Payment) HasSourceOfCash() bool`

HasSourceOfCash returns a boolean if a field has been set.

### GetPurposeCode

`func (o *Payment) GetPurposeCode() string`

GetPurposeCode returns the PurposeCode field if non-nil, zero value otherwise.

### GetPurposeCodeOk

`func (o *Payment) GetPurposeCodeOk() (*string, bool)`

GetPurposeCodeOk returns a tuple with the PurposeCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurposeCode

`func (o *Payment) SetPurposeCode(v string)`

SetPurposeCode sets PurposeCode field to given value.

### HasPurposeCode

`func (o *Payment) HasPurposeCode() bool`

HasPurposeCode returns a boolean if a field has been set.

### GetTransactionDetails

`func (o *Payment) GetTransactionDetails() TransactionDetails`

GetTransactionDetails returns the TransactionDetails field if non-nil, zero value otherwise.

### GetTransactionDetailsOk

`func (o *Payment) GetTransactionDetailsOk() (*TransactionDetails, bool)`

GetTransactionDetailsOk returns a tuple with the TransactionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionDetails

`func (o *Payment) SetTransactionDetails(v TransactionDetails)`

SetTransactionDetails sets TransactionDetails field to given value.

### HasTransactionDetails

`func (o *Payment) HasTransactionDetails() bool`

HasTransactionDetails returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *Payment) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *Payment) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *Payment) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *Payment) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


