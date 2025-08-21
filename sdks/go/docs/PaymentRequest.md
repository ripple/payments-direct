# PaymentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuoteId** | **string** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | 
**OriginatorIdentityId** | Pointer to **string** | The identity ID of the payment originator in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**BeneficiaryIdentityId** | **string** | The identity ID of the payment beneficiary in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | 
**InternalId** | Pointer to **string** | Customer defined value, such as an invoice number. | [optional] 
**PurposeCode** | Pointer to **string** | Indicates the purpose of the payment  For more information about the &#x60;purposeCode&#x60; options, see [purposeCode](../../building-payment-request-body/#purposecode).  | [optional] 
**SourceOfCash** | Pointer to **string** | Source of cash for payout. | [optional] 
**PaymentLabels** | Pointer to **[]string** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 

## Methods

### NewPaymentRequest

`func NewPaymentRequest(quoteId string, beneficiaryIdentityId string, ) *PaymentRequest`

NewPaymentRequest instantiates a new PaymentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentRequestWithDefaults

`func NewPaymentRequestWithDefaults() *PaymentRequest`

NewPaymentRequestWithDefaults instantiates a new PaymentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuoteId

`func (o *PaymentRequest) GetQuoteId() string`

GetQuoteId returns the QuoteId field if non-nil, zero value otherwise.

### GetQuoteIdOk

`func (o *PaymentRequest) GetQuoteIdOk() (*string, bool)`

GetQuoteIdOk returns a tuple with the QuoteId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuoteId

`func (o *PaymentRequest) SetQuoteId(v string)`

SetQuoteId sets QuoteId field to given value.


### GetOriginatorIdentityId

`func (o *PaymentRequest) GetOriginatorIdentityId() string`

GetOriginatorIdentityId returns the OriginatorIdentityId field if non-nil, zero value otherwise.

### GetOriginatorIdentityIdOk

`func (o *PaymentRequest) GetOriginatorIdentityIdOk() (*string, bool)`

GetOriginatorIdentityIdOk returns a tuple with the OriginatorIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginatorIdentityId

`func (o *PaymentRequest) SetOriginatorIdentityId(v string)`

SetOriginatorIdentityId sets OriginatorIdentityId field to given value.

### HasOriginatorIdentityId

`func (o *PaymentRequest) HasOriginatorIdentityId() bool`

HasOriginatorIdentityId returns a boolean if a field has been set.

### GetBeneficiaryIdentityId

`func (o *PaymentRequest) GetBeneficiaryIdentityId() string`

GetBeneficiaryIdentityId returns the BeneficiaryIdentityId field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityIdOk

`func (o *PaymentRequest) GetBeneficiaryIdentityIdOk() (*string, bool)`

GetBeneficiaryIdentityIdOk returns a tuple with the BeneficiaryIdentityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityId

`func (o *PaymentRequest) SetBeneficiaryIdentityId(v string)`

SetBeneficiaryIdentityId sets BeneficiaryIdentityId field to given value.


### GetInternalId

`func (o *PaymentRequest) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *PaymentRequest) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *PaymentRequest) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *PaymentRequest) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetPurposeCode

`func (o *PaymentRequest) GetPurposeCode() string`

GetPurposeCode returns the PurposeCode field if non-nil, zero value otherwise.

### GetPurposeCodeOk

`func (o *PaymentRequest) GetPurposeCodeOk() (*string, bool)`

GetPurposeCodeOk returns a tuple with the PurposeCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurposeCode

`func (o *PaymentRequest) SetPurposeCode(v string)`

SetPurposeCode sets PurposeCode field to given value.

### HasPurposeCode

`func (o *PaymentRequest) HasPurposeCode() bool`

HasPurposeCode returns a boolean if a field has been set.

### GetSourceOfCash

`func (o *PaymentRequest) GetSourceOfCash() string`

GetSourceOfCash returns the SourceOfCash field if non-nil, zero value otherwise.

### GetSourceOfCashOk

`func (o *PaymentRequest) GetSourceOfCashOk() (*string, bool)`

GetSourceOfCashOk returns a tuple with the SourceOfCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceOfCash

`func (o *PaymentRequest) SetSourceOfCash(v string)`

SetSourceOfCash sets SourceOfCash field to given value.

### HasSourceOfCash

`func (o *PaymentRequest) HasSourceOfCash() bool`

HasSourceOfCash returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *PaymentRequest) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *PaymentRequest) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *PaymentRequest) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *PaymentRequest) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


