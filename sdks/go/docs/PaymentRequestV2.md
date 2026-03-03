# PaymentRequestV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteId** | **string** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | 
**OriginatorIdentityId** | Pointer to **string** | The identity ID of the payment originator. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**BeneficiaryIdentityId** | **string** | The identity ID of the payment beneficiary. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | 
**InternalId** | Pointer to **string** | Customer defined value, such as an invoice number. | [optional] 
**PurposeCode** | Pointer to **string** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] 
**SourceOfCash** | Pointer to **string** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] 
**PaymentLabels** | Pointer to **[]string** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 
**BeneficiaryFinancialInstrumentId** | **string** | The financial instrument ID associated with a payment beneficiary’s identity. This value must reference a financial instrument created for the same beneficiary identity using Identity Management v3. Use the &#x60;financialInstrumentId&#x60; returned when you create or fetch the beneficiary’s payout instrument.  | 
**ReceiverRelationship** | Pointer to **string** | The relationship to the debtor. | [optional] 
**PaymentMemo** | Pointer to **string** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Must be UPPERCASE and may include only letters (A-Z), digits (0-9), spaces, and the following punctuation characters: comma (,), period (.), parentheses (()), forward slash (/), and hyphen (-). Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  | [optional] 

## Methods

### NewPaymentRequestV2

`func NewPaymentRequestV2(quoteId string, beneficiaryIdentityId string, beneficiaryFinancialInstrumentId string, ) *PaymentRequestV2`

NewPaymentRequestV2 instantiates a new PaymentRequestV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentRequestV2WithDefaults

`func NewPaymentRequestV2WithDefaults() *PaymentRequestV2`

NewPaymentRequestV2WithDefaults instantiates a new PaymentRequestV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteId

`func (o *PaymentRequestV2) GetQuoteId() string`

GetQuoteId returns the QuoteId field if non-nil, zero value otherwise.

### GetQuoteIdOk

`func (o *PaymentRequestV2) GetQuoteIdOk() (*string, bool)`

GetQuoteIdOk returns a tuple with the QuoteId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteId

`func (o *PaymentRequestV2) SetQuoteId(v string)`

SetQuoteId sets QuoteId field to given value.


### GetOriginatorIdentityId

`func (o *PaymentRequestV2) GetOriginatorIdentityId() string`

GetOriginatorIdentityId returns the OriginatorIdentityId field if non-nil, zero value otherwise.

### GetOriginatorIdentityIdOk

`func (o *PaymentRequestV2) GetOriginatorIdentityIdOk() (*string, bool)`

GetOriginatorIdentityIdOk returns a tuple with the OriginatorIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityId

`func (o *PaymentRequestV2) SetOriginatorIdentityId(v string)`

SetOriginatorIdentityId sets OriginatorIdentityId field to given value.

### HasOriginatorIdentityId

`func (o *PaymentRequestV2) HasOriginatorIdentityId() bool`

HasOriginatorIdentityId returns a boolean if a field has been set.

### GetBeneficiaryIdentityId

`func (o *PaymentRequestV2) GetBeneficiaryIdentityId() string`

GetBeneficiaryIdentityId returns the BeneficiaryIdentityId field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityIdOk

`func (o *PaymentRequestV2) GetBeneficiaryIdentityIdOk() (*string, bool)`

GetBeneficiaryIdentityIdOk returns a tuple with the BeneficiaryIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityId

`func (o *PaymentRequestV2) SetBeneficiaryIdentityId(v string)`

SetBeneficiaryIdentityId sets BeneficiaryIdentityId field to given value.


### GetInternalId

`func (o *PaymentRequestV2) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *PaymentRequestV2) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *PaymentRequestV2) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *PaymentRequestV2) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetPurposeCode

`func (o *PaymentRequestV2) GetPurposeCode() string`

GetPurposeCode returns the PurposeCode field if non-nil, zero value otherwise.

### GetPurposeCodeOk

`func (o *PaymentRequestV2) GetPurposeCodeOk() (*string, bool)`

GetPurposeCodeOk returns a tuple with the PurposeCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurposeCode

`func (o *PaymentRequestV2) SetPurposeCode(v string)`

SetPurposeCode sets PurposeCode field to given value.

### HasPurposeCode

`func (o *PaymentRequestV2) HasPurposeCode() bool`

HasPurposeCode returns a boolean if a field has been set.

### GetSourceOfCash

`func (o *PaymentRequestV2) GetSourceOfCash() string`

GetSourceOfCash returns the SourceOfCash field if non-nil, zero value otherwise.

### GetSourceOfCashOk

`func (o *PaymentRequestV2) GetSourceOfCashOk() (*string, bool)`

GetSourceOfCashOk returns a tuple with the SourceOfCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceOfCash

`func (o *PaymentRequestV2) SetSourceOfCash(v string)`

SetSourceOfCash sets SourceOfCash field to given value.

### HasSourceOfCash

`func (o *PaymentRequestV2) HasSourceOfCash() bool`

HasSourceOfCash returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *PaymentRequestV2) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *PaymentRequestV2) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *PaymentRequestV2) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *PaymentRequestV2) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.

### GetBeneficiaryFinancialInstrumentId

`func (o *PaymentRequestV2) GetBeneficiaryFinancialInstrumentId() string`

GetBeneficiaryFinancialInstrumentId returns the BeneficiaryFinancialInstrumentId field if non-nil, zero value otherwise.

### GetBeneficiaryFinancialInstrumentIdOk

`func (o *PaymentRequestV2) GetBeneficiaryFinancialInstrumentIdOk() (*string, bool)`

GetBeneficiaryFinancialInstrumentIdOk returns a tuple with the BeneficiaryFinancialInstrumentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryFinancialInstrumentId

`func (o *PaymentRequestV2) SetBeneficiaryFinancialInstrumentId(v string)`

SetBeneficiaryFinancialInstrumentId sets BeneficiaryFinancialInstrumentId field to given value.


### GetReceiverRelationship

`func (o *PaymentRequestV2) GetReceiverRelationship() string`

GetReceiverRelationship returns the ReceiverRelationship field if non-nil, zero value otherwise.

### GetReceiverRelationshipOk

`func (o *PaymentRequestV2) GetReceiverRelationshipOk() (*string, bool)`

GetReceiverRelationshipOk returns a tuple with the ReceiverRelationship field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiverRelationship

`func (o *PaymentRequestV2) SetReceiverRelationship(v string)`

SetReceiverRelationship sets ReceiverRelationship field to given value.

### HasReceiverRelationship

`func (o *PaymentRequestV2) HasReceiverRelationship() bool`

HasReceiverRelationship returns a boolean if a field has been set.

### GetPaymentMemo

`func (o *PaymentRequestV2) GetPaymentMemo() string`

GetPaymentMemo returns the PaymentMemo field if non-nil, zero value otherwise.

### GetPaymentMemoOk

`func (o *PaymentRequestV2) GetPaymentMemoOk() (*string, bool)`

GetPaymentMemoOk returns a tuple with the PaymentMemo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMemo

`func (o *PaymentRequestV2) SetPaymentMemo(v string)`

SetPaymentMemo sets PaymentMemo field to given value.

### HasPaymentMemo

`func (o *PaymentRequestV2) HasPaymentMemo() bool`

HasPaymentMemo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


