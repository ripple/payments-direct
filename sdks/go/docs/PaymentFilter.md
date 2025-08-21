# PaymentFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentIds** | Pointer to **[]string** | Specify a list of uuids to search for payment with payment ids equals one from the list | [optional] 
**PaymentStates** | Pointer to [**[]PaymentState**](PaymentState.md) | Array of payment states like &#x60;EXECUTING&#x60; or &#x60;COMPLETED&#x60;. | [optional] 
**FilterRangeType** | Pointer to [**PaymentFilterRangeType**](PaymentFilterRangeType.md) |  | [optional] 
**BeforeTimestamp** | Pointer to **time.Time** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or before the specified time. | [optional] 
**AfterTimestamp** | Pointer to **time.Time** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or after the specified time. | [optional] 
**BeneficiaryIdentityIds** | Pointer to **[]string** | To get all payments made to one or more beneficiaries, specify the identity ID(s) of those beneficiaries in this field. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**InternalId** | Pointer to **string** | Specify an &#x60;internalId&#x60; to get payments associated with them. A prefix match will be executed. | [optional] 
**BeneficiaryIdentityNickname** | Pointer to **string** | To get all payments made to a beneficiary, specify the nickname of that beneficiary in this field. You can find the nickname using the &#x60;GET /identities&#x60; operation. | [optional] 
**DestinationCurrencies** | Pointer to **[]string** | Specify one or more currency codes to get payments where the beneficiary received funds in these currencies. | [optional] 
**PaymentLabels** | Pointer to **[]string** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 

## Methods

### NewPaymentFilter

`func NewPaymentFilter() *PaymentFilter`

NewPaymentFilter instantiates a new PaymentFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentFilterWithDefaults

`func NewPaymentFilterWithDefaults() *PaymentFilter`

NewPaymentFilterWithDefaults instantiates a new PaymentFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentIds

`func (o *PaymentFilter) GetPaymentIds() []string`

GetPaymentIds returns the PaymentIds field if non-nil, zero value otherwise.

### GetPaymentIdsOk

`func (o *PaymentFilter) GetPaymentIdsOk() (*[]string, bool)`

GetPaymentIdsOk returns a tuple with the PaymentIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentIds

`func (o *PaymentFilter) SetPaymentIds(v []string)`

SetPaymentIds sets PaymentIds field to given value.

### HasPaymentIds

`func (o *PaymentFilter) HasPaymentIds() bool`

HasPaymentIds returns a boolean if a field has been set.

### GetPaymentStates

`func (o *PaymentFilter) GetPaymentStates() []PaymentState`

GetPaymentStates returns the PaymentStates field if non-nil, zero value otherwise.

### GetPaymentStatesOk

`func (o *PaymentFilter) GetPaymentStatesOk() (*[]PaymentState, bool)`

GetPaymentStatesOk returns a tuple with the PaymentStates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentStates

`func (o *PaymentFilter) SetPaymentStates(v []PaymentState)`

SetPaymentStates sets PaymentStates field to given value.

### HasPaymentStates

`func (o *PaymentFilter) HasPaymentStates() bool`

HasPaymentStates returns a boolean if a field has been set.

### GetFilterRangeType

`func (o *PaymentFilter) GetFilterRangeType() PaymentFilterRangeType`

GetFilterRangeType returns the FilterRangeType field if non-nil, zero value otherwise.

### GetFilterRangeTypeOk

`func (o *PaymentFilter) GetFilterRangeTypeOk() (*PaymentFilterRangeType, bool)`

GetFilterRangeTypeOk returns a tuple with the FilterRangeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterRangeType

`func (o *PaymentFilter) SetFilterRangeType(v PaymentFilterRangeType)`

SetFilterRangeType sets FilterRangeType field to given value.

### HasFilterRangeType

`func (o *PaymentFilter) HasFilterRangeType() bool`

HasFilterRangeType returns a boolean if a field has been set.

### GetBeforeTimestamp

`func (o *PaymentFilter) GetBeforeTimestamp() time.Time`

GetBeforeTimestamp returns the BeforeTimestamp field if non-nil, zero value otherwise.

### GetBeforeTimestampOk

`func (o *PaymentFilter) GetBeforeTimestampOk() (*time.Time, bool)`

GetBeforeTimestampOk returns a tuple with the BeforeTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeforeTimestamp

`func (o *PaymentFilter) SetBeforeTimestamp(v time.Time)`

SetBeforeTimestamp sets BeforeTimestamp field to given value.

### HasBeforeTimestamp

`func (o *PaymentFilter) HasBeforeTimestamp() bool`

HasBeforeTimestamp returns a boolean if a field has been set.

### GetAfterTimestamp

`func (o *PaymentFilter) GetAfterTimestamp() time.Time`

GetAfterTimestamp returns the AfterTimestamp field if non-nil, zero value otherwise.

### GetAfterTimestampOk

`func (o *PaymentFilter) GetAfterTimestampOk() (*time.Time, bool)`

GetAfterTimestampOk returns a tuple with the AfterTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfterTimestamp

`func (o *PaymentFilter) SetAfterTimestamp(v time.Time)`

SetAfterTimestamp sets AfterTimestamp field to given value.

### HasAfterTimestamp

`func (o *PaymentFilter) HasAfterTimestamp() bool`

HasAfterTimestamp returns a boolean if a field has been set.

### GetBeneficiaryIdentityIds

`func (o *PaymentFilter) GetBeneficiaryIdentityIds() []string`

GetBeneficiaryIdentityIds returns the BeneficiaryIdentityIds field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityIdsOk

`func (o *PaymentFilter) GetBeneficiaryIdentityIdsOk() (*[]string, bool)`

GetBeneficiaryIdentityIdsOk returns a tuple with the BeneficiaryIdentityIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityIds

`func (o *PaymentFilter) SetBeneficiaryIdentityIds(v []string)`

SetBeneficiaryIdentityIds sets BeneficiaryIdentityIds field to given value.

### HasBeneficiaryIdentityIds

`func (o *PaymentFilter) HasBeneficiaryIdentityIds() bool`

HasBeneficiaryIdentityIds returns a boolean if a field has been set.

### GetInternalId

`func (o *PaymentFilter) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *PaymentFilter) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *PaymentFilter) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *PaymentFilter) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetBeneficiaryIdentityNickname

`func (o *PaymentFilter) GetBeneficiaryIdentityNickname() string`

GetBeneficiaryIdentityNickname returns the BeneficiaryIdentityNickname field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityNicknameOk

`func (o *PaymentFilter) GetBeneficiaryIdentityNicknameOk() (*string, bool)`

GetBeneficiaryIdentityNicknameOk returns a tuple with the BeneficiaryIdentityNickname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityNickname

`func (o *PaymentFilter) SetBeneficiaryIdentityNickname(v string)`

SetBeneficiaryIdentityNickname sets BeneficiaryIdentityNickname field to given value.

### HasBeneficiaryIdentityNickname

`func (o *PaymentFilter) HasBeneficiaryIdentityNickname() bool`

HasBeneficiaryIdentityNickname returns a boolean if a field has been set.

### GetDestinationCurrencies

`func (o *PaymentFilter) GetDestinationCurrencies() []string`

GetDestinationCurrencies returns the DestinationCurrencies field if non-nil, zero value otherwise.

### GetDestinationCurrenciesOk

`func (o *PaymentFilter) GetDestinationCurrenciesOk() (*[]string, bool)`

GetDestinationCurrenciesOk returns a tuple with the DestinationCurrencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrencies

`func (o *PaymentFilter) SetDestinationCurrencies(v []string)`

SetDestinationCurrencies sets DestinationCurrencies field to given value.

### HasDestinationCurrencies

`func (o *PaymentFilter) HasDestinationCurrencies() bool`

HasDestinationCurrencies returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *PaymentFilter) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *PaymentFilter) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *PaymentFilter) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *PaymentFilter) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


