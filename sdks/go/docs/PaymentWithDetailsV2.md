# PaymentWithDetailsV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentId** | **string** | The unique ID that identifies this payment. This value is the same as the quote ID. | 
**CryptoTransactionHash** | Pointer to **string** | Transaction hash of the crypto payment on the destination blockchain network | [optional] 
**InitiatedAt** | Pointer to **time.Time** | The time at which the payment was initiated, specified in UTC. | [optional] 
**ExpiresAt** | Pointer to **time.Time** | The time at which this payment expires, specified in UTC. | [optional] 
**JitFundingExpiresAt** | Pointer to **time.Time** | The time at which JIT funding for this payment expires, specified in UTC. | [optional] 
**LastStateUpdatedAt** | Pointer to **time.Time** | The time at which the payment state was last updated for this payment, specified in UTC. | [optional] 
**PaymentState** | **string** | Current state of a payment. The payment lifecycle currently uses the following values: - &#x60;QUOTED&#x60; - &#x60;INITIATED&#x60; - &#x60;VALIDATING&#x60; - &#x60;TRANSFERRING&#x60; - &#x60;COMPLETED&#x60; - &#x60;FAILED&#x60; - &#x60;RETURNED&#x60; - &#x60;DECLINED&#x60; - &#x60;AWAITING_FUNDING&#x60; Additional states may be introduced in the future without breaking existing integrations.  | 
**Originator** | Pointer to [**OriginatorV2**](OriginatorV2.md) |  | [optional] 
**Destination** | Pointer to [**DestinationV2**](DestinationV2.md) |  | [optional] 
**AdjustedExchangeRate** | Pointer to [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**Fees** | Pointer to [**[]FeeSummary**](FeeSummary.md) | A summary of fees included in payment quote. | [optional] 
**Taxes** | Pointer to [**[]TaxSummary**](TaxSummary.md) | A summary of taxes included in the payment quote. | [optional] 
**SourceOfCash** | Pointer to **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] 
**PurposeCode** | Pointer to **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] 
**TransactionDetails** | Pointer to [**TransactionDetailsV2**](TransactionDetailsV2.md) |  | [optional] 
**Errors** | Pointer to [**[]PaymentError**](PaymentError.md) |  | [optional] 
**PaymentLabels** | Pointer to **[]string** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 
**ReceiverRelationship** | Pointer to **string** | The relationship to the debtor. | [optional] 
**PaymentMemo** | Pointer to **string** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Validation rules (required, allowed characters, max length) vary by corridor. Consult the data requirements for your corridor. Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  | [optional] 
**PayoutExecutionDetails** | Pointer to [**PayoutExecutionDetails**](PayoutExecutionDetails.md) |  | [optional] 

## Methods

### NewPaymentWithDetailsV2

`func NewPaymentWithDetailsV2(paymentId string, paymentState string, ) *PaymentWithDetailsV2`

NewPaymentWithDetailsV2 instantiates a new PaymentWithDetailsV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentWithDetailsV2WithDefaults

`func NewPaymentWithDetailsV2WithDefaults() *PaymentWithDetailsV2`

NewPaymentWithDetailsV2WithDefaults instantiates a new PaymentWithDetailsV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentId

`func (o *PaymentWithDetailsV2) GetPaymentId() string`

GetPaymentId returns the PaymentId field if non-nil, zero value otherwise.

### GetPaymentIdOk

`func (o *PaymentWithDetailsV2) GetPaymentIdOk() (*string, bool)`

GetPaymentIdOk returns a tuple with the PaymentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentId

`func (o *PaymentWithDetailsV2) SetPaymentId(v string)`

SetPaymentId sets PaymentId field to given value.


### GetCryptoTransactionHash

`func (o *PaymentWithDetailsV2) GetCryptoTransactionHash() string`

GetCryptoTransactionHash returns the CryptoTransactionHash field if non-nil, zero value otherwise.

### GetCryptoTransactionHashOk

`func (o *PaymentWithDetailsV2) GetCryptoTransactionHashOk() (*string, bool)`

GetCryptoTransactionHashOk returns a tuple with the CryptoTransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptoTransactionHash

`func (o *PaymentWithDetailsV2) SetCryptoTransactionHash(v string)`

SetCryptoTransactionHash sets CryptoTransactionHash field to given value.

### HasCryptoTransactionHash

`func (o *PaymentWithDetailsV2) HasCryptoTransactionHash() bool`

HasCryptoTransactionHash returns a boolean if a field has been set.

### GetInitiatedAt

`func (o *PaymentWithDetailsV2) GetInitiatedAt() time.Time`

GetInitiatedAt returns the InitiatedAt field if non-nil, zero value otherwise.

### GetInitiatedAtOk

`func (o *PaymentWithDetailsV2) GetInitiatedAtOk() (*time.Time, bool)`

GetInitiatedAtOk returns a tuple with the InitiatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitiatedAt

`func (o *PaymentWithDetailsV2) SetInitiatedAt(v time.Time)`

SetInitiatedAt sets InitiatedAt field to given value.

### HasInitiatedAt

`func (o *PaymentWithDetailsV2) HasInitiatedAt() bool`

HasInitiatedAt returns a boolean if a field has been set.

### GetExpiresAt

`func (o *PaymentWithDetailsV2) GetExpiresAt() time.Time`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *PaymentWithDetailsV2) GetExpiresAtOk() (*time.Time, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *PaymentWithDetailsV2) SetExpiresAt(v time.Time)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *PaymentWithDetailsV2) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetJitFundingExpiresAt

`func (o *PaymentWithDetailsV2) GetJitFundingExpiresAt() time.Time`

GetJitFundingExpiresAt returns the JitFundingExpiresAt field if non-nil, zero value otherwise.

### GetJitFundingExpiresAtOk

`func (o *PaymentWithDetailsV2) GetJitFundingExpiresAtOk() (*time.Time, bool)`

GetJitFundingExpiresAtOk returns a tuple with the JitFundingExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJitFundingExpiresAt

`func (o *PaymentWithDetailsV2) SetJitFundingExpiresAt(v time.Time)`

SetJitFundingExpiresAt sets JitFundingExpiresAt field to given value.

### HasJitFundingExpiresAt

`func (o *PaymentWithDetailsV2) HasJitFundingExpiresAt() bool`

HasJitFundingExpiresAt returns a boolean if a field has been set.

### GetLastStateUpdatedAt

`func (o *PaymentWithDetailsV2) GetLastStateUpdatedAt() time.Time`

GetLastStateUpdatedAt returns the LastStateUpdatedAt field if non-nil, zero value otherwise.

### GetLastStateUpdatedAtOk

`func (o *PaymentWithDetailsV2) GetLastStateUpdatedAtOk() (*time.Time, bool)`

GetLastStateUpdatedAtOk returns a tuple with the LastStateUpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastStateUpdatedAt

`func (o *PaymentWithDetailsV2) SetLastStateUpdatedAt(v time.Time)`

SetLastStateUpdatedAt sets LastStateUpdatedAt field to given value.

### HasLastStateUpdatedAt

`func (o *PaymentWithDetailsV2) HasLastStateUpdatedAt() bool`

HasLastStateUpdatedAt returns a boolean if a field has been set.

### GetPaymentState

`func (o *PaymentWithDetailsV2) GetPaymentState() string`

GetPaymentState returns the PaymentState field if non-nil, zero value otherwise.

### GetPaymentStateOk

`func (o *PaymentWithDetailsV2) GetPaymentStateOk() (*string, bool)`

GetPaymentStateOk returns a tuple with the PaymentState field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentState

`func (o *PaymentWithDetailsV2) SetPaymentState(v string)`

SetPaymentState sets PaymentState field to given value.


### GetOriginator

`func (o *PaymentWithDetailsV2) GetOriginator() OriginatorV2`

GetOriginator returns the Originator field if non-nil, zero value otherwise.

### GetOriginatorOk

`func (o *PaymentWithDetailsV2) GetOriginatorOk() (*OriginatorV2, bool)`

GetOriginatorOk returns a tuple with the Originator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginator

`func (o *PaymentWithDetailsV2) SetOriginator(v OriginatorV2)`

SetOriginator sets Originator field to given value.

### HasOriginator

`func (o *PaymentWithDetailsV2) HasOriginator() bool`

HasOriginator returns a boolean if a field has been set.

### GetDestination

`func (o *PaymentWithDetailsV2) GetDestination() DestinationV2`

GetDestination returns the Destination field if non-nil, zero value otherwise.

### GetDestinationOk

`func (o *PaymentWithDetailsV2) GetDestinationOk() (*DestinationV2, bool)`

GetDestinationOk returns a tuple with the Destination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestination

`func (o *PaymentWithDetailsV2) SetDestination(v DestinationV2)`

SetDestination sets Destination field to given value.

### HasDestination

`func (o *PaymentWithDetailsV2) HasDestination() bool`

HasDestination returns a boolean if a field has been set.

### GetAdjustedExchangeRate

`func (o *PaymentWithDetailsV2) GetAdjustedExchangeRate() AdjustedExchangeRate`

GetAdjustedExchangeRate returns the AdjustedExchangeRate field if non-nil, zero value otherwise.

### GetAdjustedExchangeRateOk

`func (o *PaymentWithDetailsV2) GetAdjustedExchangeRateOk() (*AdjustedExchangeRate, bool)`

GetAdjustedExchangeRateOk returns a tuple with the AdjustedExchangeRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdjustedExchangeRate

`func (o *PaymentWithDetailsV2) SetAdjustedExchangeRate(v AdjustedExchangeRate)`

SetAdjustedExchangeRate sets AdjustedExchangeRate field to given value.

### HasAdjustedExchangeRate

`func (o *PaymentWithDetailsV2) HasAdjustedExchangeRate() bool`

HasAdjustedExchangeRate returns a boolean if a field has been set.

### GetFees

`func (o *PaymentWithDetailsV2) GetFees() []FeeSummary`

GetFees returns the Fees field if non-nil, zero value otherwise.

### GetFeesOk

`func (o *PaymentWithDetailsV2) GetFeesOk() (*[]FeeSummary, bool)`

GetFeesOk returns a tuple with the Fees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFees

`func (o *PaymentWithDetailsV2) SetFees(v []FeeSummary)`

SetFees sets Fees field to given value.

### HasFees

`func (o *PaymentWithDetailsV2) HasFees() bool`

HasFees returns a boolean if a field has been set.

### GetTaxes

`func (o *PaymentWithDetailsV2) GetTaxes() []TaxSummary`

GetTaxes returns the Taxes field if non-nil, zero value otherwise.

### GetTaxesOk

`func (o *PaymentWithDetailsV2) GetTaxesOk() (*[]TaxSummary, bool)`

GetTaxesOk returns a tuple with the Taxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxes

`func (o *PaymentWithDetailsV2) SetTaxes(v []TaxSummary)`

SetTaxes sets Taxes field to given value.

### HasTaxes

`func (o *PaymentWithDetailsV2) HasTaxes() bool`

HasTaxes returns a boolean if a field has been set.

### GetSourceOfCash

`func (o *PaymentWithDetailsV2) GetSourceOfCash() string`

GetSourceOfCash returns the SourceOfCash field if non-nil, zero value otherwise.

### GetSourceOfCashOk

`func (o *PaymentWithDetailsV2) GetSourceOfCashOk() (*string, bool)`

GetSourceOfCashOk returns a tuple with the SourceOfCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceOfCash

`func (o *PaymentWithDetailsV2) SetSourceOfCash(v string)`

SetSourceOfCash sets SourceOfCash field to given value.

### HasSourceOfCash

`func (o *PaymentWithDetailsV2) HasSourceOfCash() bool`

HasSourceOfCash returns a boolean if a field has been set.

### GetPurposeCode

`func (o *PaymentWithDetailsV2) GetPurposeCode() string`

GetPurposeCode returns the PurposeCode field if non-nil, zero value otherwise.

### GetPurposeCodeOk

`func (o *PaymentWithDetailsV2) GetPurposeCodeOk() (*string, bool)`

GetPurposeCodeOk returns a tuple with the PurposeCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurposeCode

`func (o *PaymentWithDetailsV2) SetPurposeCode(v string)`

SetPurposeCode sets PurposeCode field to given value.

### HasPurposeCode

`func (o *PaymentWithDetailsV2) HasPurposeCode() bool`

HasPurposeCode returns a boolean if a field has been set.

### GetTransactionDetails

`func (o *PaymentWithDetailsV2) GetTransactionDetails() TransactionDetailsV2`

GetTransactionDetails returns the TransactionDetails field if non-nil, zero value otherwise.

### GetTransactionDetailsOk

`func (o *PaymentWithDetailsV2) GetTransactionDetailsOk() (*TransactionDetailsV2, bool)`

GetTransactionDetailsOk returns a tuple with the TransactionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionDetails

`func (o *PaymentWithDetailsV2) SetTransactionDetails(v TransactionDetailsV2)`

SetTransactionDetails sets TransactionDetails field to given value.

### HasTransactionDetails

`func (o *PaymentWithDetailsV2) HasTransactionDetails() bool`

HasTransactionDetails returns a boolean if a field has been set.

### GetErrors

`func (o *PaymentWithDetailsV2) GetErrors() []PaymentError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *PaymentWithDetailsV2) GetErrorsOk() (*[]PaymentError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *PaymentWithDetailsV2) SetErrors(v []PaymentError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *PaymentWithDetailsV2) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *PaymentWithDetailsV2) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *PaymentWithDetailsV2) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *PaymentWithDetailsV2) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *PaymentWithDetailsV2) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.

### GetReceiverRelationship

`func (o *PaymentWithDetailsV2) GetReceiverRelationship() string`

GetReceiverRelationship returns the ReceiverRelationship field if non-nil, zero value otherwise.

### GetReceiverRelationshipOk

`func (o *PaymentWithDetailsV2) GetReceiverRelationshipOk() (*string, bool)`

GetReceiverRelationshipOk returns a tuple with the ReceiverRelationship field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiverRelationship

`func (o *PaymentWithDetailsV2) SetReceiverRelationship(v string)`

SetReceiverRelationship sets ReceiverRelationship field to given value.

### HasReceiverRelationship

`func (o *PaymentWithDetailsV2) HasReceiverRelationship() bool`

HasReceiverRelationship returns a boolean if a field has been set.

### GetPaymentMemo

`func (o *PaymentWithDetailsV2) GetPaymentMemo() string`

GetPaymentMemo returns the PaymentMemo field if non-nil, zero value otherwise.

### GetPaymentMemoOk

`func (o *PaymentWithDetailsV2) GetPaymentMemoOk() (*string, bool)`

GetPaymentMemoOk returns a tuple with the PaymentMemo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMemo

`func (o *PaymentWithDetailsV2) SetPaymentMemo(v string)`

SetPaymentMemo sets PaymentMemo field to given value.

### HasPaymentMemo

`func (o *PaymentWithDetailsV2) HasPaymentMemo() bool`

HasPaymentMemo returns a boolean if a field has been set.

### GetPayoutExecutionDetails

`func (o *PaymentWithDetailsV2) GetPayoutExecutionDetails() PayoutExecutionDetails`

GetPayoutExecutionDetails returns the PayoutExecutionDetails field if non-nil, zero value otherwise.

### GetPayoutExecutionDetailsOk

`func (o *PaymentWithDetailsV2) GetPayoutExecutionDetailsOk() (*PayoutExecutionDetails, bool)`

GetPayoutExecutionDetailsOk returns a tuple with the PayoutExecutionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutExecutionDetails

`func (o *PaymentWithDetailsV2) SetPayoutExecutionDetails(v PayoutExecutionDetails)`

SetPayoutExecutionDetails sets PayoutExecutionDetails field to given value.

### HasPayoutExecutionDetails

`func (o *PaymentWithDetailsV2) HasPayoutExecutionDetails() bool`

HasPayoutExecutionDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


