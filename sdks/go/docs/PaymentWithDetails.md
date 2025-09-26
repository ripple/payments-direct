# PaymentWithDetails

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
**SourceOfCash** | Pointer to **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] 
**PurposeCode** | Pointer to **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] 
**TransactionDetails** | Pointer to [**TransactionDetails**](TransactionDetails.md) |  | [optional] 
**Errors** | Pointer to [**[]PaymentError**](PaymentError.md) |  | [optional] 
**PaymentLabels** | Pointer to **[]string** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 

## Methods

### NewPaymentWithDetails

`func NewPaymentWithDetails(paymentId string, paymentState PaymentState, ) *PaymentWithDetails`

NewPaymentWithDetails instantiates a new PaymentWithDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentWithDetailsWithDefaults

`func NewPaymentWithDetailsWithDefaults() *PaymentWithDetails`

NewPaymentWithDetailsWithDefaults instantiates a new PaymentWithDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentId

`func (o *PaymentWithDetails) GetPaymentId() string`

GetPaymentId returns the PaymentId field if non-nil, zero value otherwise.

### GetPaymentIdOk

`func (o *PaymentWithDetails) GetPaymentIdOk() (*string, bool)`

GetPaymentIdOk returns a tuple with the PaymentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentId

`func (o *PaymentWithDetails) SetPaymentId(v string)`

SetPaymentId sets PaymentId field to given value.


### GetCryptoTransactionHash

`func (o *PaymentWithDetails) GetCryptoTransactionHash() string`

GetCryptoTransactionHash returns the CryptoTransactionHash field if non-nil, zero value otherwise.

### GetCryptoTransactionHashOk

`func (o *PaymentWithDetails) GetCryptoTransactionHashOk() (*string, bool)`

GetCryptoTransactionHashOk returns a tuple with the CryptoTransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptoTransactionHash

`func (o *PaymentWithDetails) SetCryptoTransactionHash(v string)`

SetCryptoTransactionHash sets CryptoTransactionHash field to given value.

### HasCryptoTransactionHash

`func (o *PaymentWithDetails) HasCryptoTransactionHash() bool`

HasCryptoTransactionHash returns a boolean if a field has been set.

### GetInitiatedAt

`func (o *PaymentWithDetails) GetInitiatedAt() time.Time`

GetInitiatedAt returns the InitiatedAt field if non-nil, zero value otherwise.

### GetInitiatedAtOk

`func (o *PaymentWithDetails) GetInitiatedAtOk() (*time.Time, bool)`

GetInitiatedAtOk returns a tuple with the InitiatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitiatedAt

`func (o *PaymentWithDetails) SetInitiatedAt(v time.Time)`

SetInitiatedAt sets InitiatedAt field to given value.

### HasInitiatedAt

`func (o *PaymentWithDetails) HasInitiatedAt() bool`

HasInitiatedAt returns a boolean if a field has been set.

### GetExpiresAt

`func (o *PaymentWithDetails) GetExpiresAt() time.Time`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *PaymentWithDetails) GetExpiresAtOk() (*time.Time, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *PaymentWithDetails) SetExpiresAt(v time.Time)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *PaymentWithDetails) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetLastStateUpdatedAt

`func (o *PaymentWithDetails) GetLastStateUpdatedAt() time.Time`

GetLastStateUpdatedAt returns the LastStateUpdatedAt field if non-nil, zero value otherwise.

### GetLastStateUpdatedAtOk

`func (o *PaymentWithDetails) GetLastStateUpdatedAtOk() (*time.Time, bool)`

GetLastStateUpdatedAtOk returns a tuple with the LastStateUpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastStateUpdatedAt

`func (o *PaymentWithDetails) SetLastStateUpdatedAt(v time.Time)`

SetLastStateUpdatedAt sets LastStateUpdatedAt field to given value.

### HasLastStateUpdatedAt

`func (o *PaymentWithDetails) HasLastStateUpdatedAt() bool`

HasLastStateUpdatedAt returns a boolean if a field has been set.

### GetPaymentState

`func (o *PaymentWithDetails) GetPaymentState() PaymentState`

GetPaymentState returns the PaymentState field if non-nil, zero value otherwise.

### GetPaymentStateOk

`func (o *PaymentWithDetails) GetPaymentStateOk() (*PaymentState, bool)`

GetPaymentStateOk returns a tuple with the PaymentState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentState

`func (o *PaymentWithDetails) SetPaymentState(v PaymentState)`

SetPaymentState sets PaymentState field to given value.


### GetOriginator

`func (o *PaymentWithDetails) GetOriginator() Originator`

GetOriginator returns the Originator field if non-nil, zero value otherwise.

### GetOriginatorOk

`func (o *PaymentWithDetails) GetOriginatorOk() (*Originator, bool)`

GetOriginatorOk returns a tuple with the Originator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginator

`func (o *PaymentWithDetails) SetOriginator(v Originator)`

SetOriginator sets Originator field to given value.

### HasOriginator

`func (o *PaymentWithDetails) HasOriginator() bool`

HasOriginator returns a boolean if a field has been set.

### GetDestination

`func (o *PaymentWithDetails) GetDestination() Destination`

GetDestination returns the Destination field if non-nil, zero value otherwise.

### GetDestinationOk

`func (o *PaymentWithDetails) GetDestinationOk() (*Destination, bool)`

GetDestinationOk returns a tuple with the Destination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestination

`func (o *PaymentWithDetails) SetDestination(v Destination)`

SetDestination sets Destination field to given value.

### HasDestination

`func (o *PaymentWithDetails) HasDestination() bool`

HasDestination returns a boolean if a field has been set.

### GetAdjustedExchangeRate

`func (o *PaymentWithDetails) GetAdjustedExchangeRate() AdjustedExchangeRate`

GetAdjustedExchangeRate returns the AdjustedExchangeRate field if non-nil, zero value otherwise.

### GetAdjustedExchangeRateOk

`func (o *PaymentWithDetails) GetAdjustedExchangeRateOk() (*AdjustedExchangeRate, bool)`

GetAdjustedExchangeRateOk returns a tuple with the AdjustedExchangeRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdjustedExchangeRate

`func (o *PaymentWithDetails) SetAdjustedExchangeRate(v AdjustedExchangeRate)`

SetAdjustedExchangeRate sets AdjustedExchangeRate field to given value.

### HasAdjustedExchangeRate

`func (o *PaymentWithDetails) HasAdjustedExchangeRate() bool`

HasAdjustedExchangeRate returns a boolean if a field has been set.

### GetFees

`func (o *PaymentWithDetails) GetFees() []FeeSummary`

GetFees returns the Fees field if non-nil, zero value otherwise.

### GetFeesOk

`func (o *PaymentWithDetails) GetFeesOk() (*[]FeeSummary, bool)`

GetFeesOk returns a tuple with the Fees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFees

`func (o *PaymentWithDetails) SetFees(v []FeeSummary)`

SetFees sets Fees field to given value.

### HasFees

`func (o *PaymentWithDetails) HasFees() bool`

HasFees returns a boolean if a field has been set.

### GetSourceOfCash

`func (o *PaymentWithDetails) GetSourceOfCash() string`

GetSourceOfCash returns the SourceOfCash field if non-nil, zero value otherwise.

### GetSourceOfCashOk

`func (o *PaymentWithDetails) GetSourceOfCashOk() (*string, bool)`

GetSourceOfCashOk returns a tuple with the SourceOfCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceOfCash

`func (o *PaymentWithDetails) SetSourceOfCash(v string)`

SetSourceOfCash sets SourceOfCash field to given value.

### HasSourceOfCash

`func (o *PaymentWithDetails) HasSourceOfCash() bool`

HasSourceOfCash returns a boolean if a field has been set.

### GetPurposeCode

`func (o *PaymentWithDetails) GetPurposeCode() string`

GetPurposeCode returns the PurposeCode field if non-nil, zero value otherwise.

### GetPurposeCodeOk

`func (o *PaymentWithDetails) GetPurposeCodeOk() (*string, bool)`

GetPurposeCodeOk returns a tuple with the PurposeCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurposeCode

`func (o *PaymentWithDetails) SetPurposeCode(v string)`

SetPurposeCode sets PurposeCode field to given value.

### HasPurposeCode

`func (o *PaymentWithDetails) HasPurposeCode() bool`

HasPurposeCode returns a boolean if a field has been set.

### GetTransactionDetails

`func (o *PaymentWithDetails) GetTransactionDetails() TransactionDetails`

GetTransactionDetails returns the TransactionDetails field if non-nil, zero value otherwise.

### GetTransactionDetailsOk

`func (o *PaymentWithDetails) GetTransactionDetailsOk() (*TransactionDetails, bool)`

GetTransactionDetailsOk returns a tuple with the TransactionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionDetails

`func (o *PaymentWithDetails) SetTransactionDetails(v TransactionDetails)`

SetTransactionDetails sets TransactionDetails field to given value.

### HasTransactionDetails

`func (o *PaymentWithDetails) HasTransactionDetails() bool`

HasTransactionDetails returns a boolean if a field has been set.

### GetErrors

`func (o *PaymentWithDetails) GetErrors() []PaymentError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *PaymentWithDetails) GetErrorsOk() (*[]PaymentError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *PaymentWithDetails) SetErrors(v []PaymentError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *PaymentWithDetails) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *PaymentWithDetails) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *PaymentWithDetails) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *PaymentWithDetails) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *PaymentWithDetails) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


