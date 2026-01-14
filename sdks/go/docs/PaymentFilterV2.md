# PaymentFilterV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentIds** | Pointer to **[]string** | Specify a list of uuids to search for payment with payment ids equals one from the list | [optional] 
**PaymentStates** | Pointer to **[]string** | Array of payment states like &#x60;EXECUTING&#x60; or &#x60;COMPLETED&#x60;. | [optional] 
**FilterRangeType** | Pointer to **string** | The type of timestamp to use when filtering payments by a date and time range. Supported values include: - &#x60;PAYMENT_CREATION&#x60; - &#x60;PAYMENT_EXPIRY&#x60; - &#x60;PAYMENT_STATUS_LAST_UPDATED&#x60; If another value is provided, the filter is rejected with a validation error.  | [optional] 
**BeforeTimestamp** | Pointer to **time.Time** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or before the specified time. | [optional] 
**AfterTimestamp** | Pointer to **time.Time** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or after the specified time. | [optional] 
**BeneficiaryIdentityIds** | Pointer to **[]string** | To get all payments made to one or more beneficiaries, specify the identity ID(s) of those beneficiaries in this field. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**InternalId** | Pointer to **string** | Specify an &#x60;internalId&#x60; to get payments associated with them. A prefix match will be executed. | [optional] 
**BeneficiaryIdentityNickname** | Pointer to **string** | To get all payments made to a beneficiary, specify the nickname of that beneficiary in this field. You can find the nickname using the &#x60;GET /identities&#x60; operation. | [optional] 
**DestinationCurrencies** | Pointer to **[]string** | Specify one or more currency codes to get payments where the beneficiary received funds in these currencies. | [optional] 
**PaymentLabels** | Pointer to **[]string** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 

## Methods

### NewPaymentFilterV2

`func NewPaymentFilterV2() *PaymentFilterV2`

NewPaymentFilterV2 instantiates a new PaymentFilterV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentFilterV2WithDefaults

`func NewPaymentFilterV2WithDefaults() *PaymentFilterV2`

NewPaymentFilterV2WithDefaults instantiates a new PaymentFilterV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentIds

`func (o *PaymentFilterV2) GetPaymentIds() []string`

GetPaymentIds returns the PaymentIds field if non-nil, zero value otherwise.

### GetPaymentIdsOk

`func (o *PaymentFilterV2) GetPaymentIdsOk() (*[]string, bool)`

GetPaymentIdsOk returns a tuple with the PaymentIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentIds

`func (o *PaymentFilterV2) SetPaymentIds(v []string)`

SetPaymentIds sets PaymentIds field to given value.

### HasPaymentIds

`func (o *PaymentFilterV2) HasPaymentIds() bool`

HasPaymentIds returns a boolean if a field has been set.

### GetPaymentStates

`func (o *PaymentFilterV2) GetPaymentStates() []string`

GetPaymentStates returns the PaymentStates field if non-nil, zero value otherwise.

### GetPaymentStatesOk

`func (o *PaymentFilterV2) GetPaymentStatesOk() (*[]string, bool)`

GetPaymentStatesOk returns a tuple with the PaymentStates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentStates

`func (o *PaymentFilterV2) SetPaymentStates(v []string)`

SetPaymentStates sets PaymentStates field to given value.

### HasPaymentStates

`func (o *PaymentFilterV2) HasPaymentStates() bool`

HasPaymentStates returns a boolean if a field has been set.

### GetFilterRangeType

`func (o *PaymentFilterV2) GetFilterRangeType() string`

GetFilterRangeType returns the FilterRangeType field if non-nil, zero value otherwise.

### GetFilterRangeTypeOk

`func (o *PaymentFilterV2) GetFilterRangeTypeOk() (*string, bool)`

GetFilterRangeTypeOk returns a tuple with the FilterRangeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterRangeType

`func (o *PaymentFilterV2) SetFilterRangeType(v string)`

SetFilterRangeType sets FilterRangeType field to given value.

### HasFilterRangeType

`func (o *PaymentFilterV2) HasFilterRangeType() bool`

HasFilterRangeType returns a boolean if a field has been set.

### GetBeforeTimestamp

`func (o *PaymentFilterV2) GetBeforeTimestamp() time.Time`

GetBeforeTimestamp returns the BeforeTimestamp field if non-nil, zero value otherwise.

### GetBeforeTimestampOk

`func (o *PaymentFilterV2) GetBeforeTimestampOk() (*time.Time, bool)`

GetBeforeTimestampOk returns a tuple with the BeforeTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeforeTimestamp

`func (o *PaymentFilterV2) SetBeforeTimestamp(v time.Time)`

SetBeforeTimestamp sets BeforeTimestamp field to given value.

### HasBeforeTimestamp

`func (o *PaymentFilterV2) HasBeforeTimestamp() bool`

HasBeforeTimestamp returns a boolean if a field has been set.

### GetAfterTimestamp

`func (o *PaymentFilterV2) GetAfterTimestamp() time.Time`

GetAfterTimestamp returns the AfterTimestamp field if non-nil, zero value otherwise.

### GetAfterTimestampOk

`func (o *PaymentFilterV2) GetAfterTimestampOk() (*time.Time, bool)`

GetAfterTimestampOk returns a tuple with the AfterTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfterTimestamp

`func (o *PaymentFilterV2) SetAfterTimestamp(v time.Time)`

SetAfterTimestamp sets AfterTimestamp field to given value.

### HasAfterTimestamp

`func (o *PaymentFilterV2) HasAfterTimestamp() bool`

HasAfterTimestamp returns a boolean if a field has been set.

### GetBeneficiaryIdentityIds

`func (o *PaymentFilterV2) GetBeneficiaryIdentityIds() []string`

GetBeneficiaryIdentityIds returns the BeneficiaryIdentityIds field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityIdsOk

`func (o *PaymentFilterV2) GetBeneficiaryIdentityIdsOk() (*[]string, bool)`

GetBeneficiaryIdentityIdsOk returns a tuple with the BeneficiaryIdentityIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityIds

`func (o *PaymentFilterV2) SetBeneficiaryIdentityIds(v []string)`

SetBeneficiaryIdentityIds sets BeneficiaryIdentityIds field to given value.

### HasBeneficiaryIdentityIds

`func (o *PaymentFilterV2) HasBeneficiaryIdentityIds() bool`

HasBeneficiaryIdentityIds returns a boolean if a field has been set.

### GetInternalId

`func (o *PaymentFilterV2) GetInternalId() string`

GetInternalId returns the InternalId field if non-nil, zero value otherwise.

### GetInternalIdOk

`func (o *PaymentFilterV2) GetInternalIdOk() (*string, bool)`

GetInternalIdOk returns a tuple with the InternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalId

`func (o *PaymentFilterV2) SetInternalId(v string)`

SetInternalId sets InternalId field to given value.

### HasInternalId

`func (o *PaymentFilterV2) HasInternalId() bool`

HasInternalId returns a boolean if a field has been set.

### GetBeneficiaryIdentityNickname

`func (o *PaymentFilterV2) GetBeneficiaryIdentityNickname() string`

GetBeneficiaryIdentityNickname returns the BeneficiaryIdentityNickname field if non-nil, zero value otherwise.

### GetBeneficiaryIdentityNicknameOk

`func (o *PaymentFilterV2) GetBeneficiaryIdentityNicknameOk() (*string, bool)`

GetBeneficiaryIdentityNicknameOk returns a tuple with the BeneficiaryIdentityNickname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeneficiaryIdentityNickname

`func (o *PaymentFilterV2) SetBeneficiaryIdentityNickname(v string)`

SetBeneficiaryIdentityNickname sets BeneficiaryIdentityNickname field to given value.

### HasBeneficiaryIdentityNickname

`func (o *PaymentFilterV2) HasBeneficiaryIdentityNickname() bool`

HasBeneficiaryIdentityNickname returns a boolean if a field has been set.

### GetDestinationCurrencies

`func (o *PaymentFilterV2) GetDestinationCurrencies() []string`

GetDestinationCurrencies returns the DestinationCurrencies field if non-nil, zero value otherwise.

### GetDestinationCurrenciesOk

`func (o *PaymentFilterV2) GetDestinationCurrenciesOk() (*[]string, bool)`

GetDestinationCurrenciesOk returns a tuple with the DestinationCurrencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationCurrencies

`func (o *PaymentFilterV2) SetDestinationCurrencies(v []string)`

SetDestinationCurrencies sets DestinationCurrencies field to given value.

### HasDestinationCurrencies

`func (o *PaymentFilterV2) HasDestinationCurrencies() bool`

HasDestinationCurrencies returns a boolean if a field has been set.

### GetPaymentLabels

`func (o *PaymentFilterV2) GetPaymentLabels() []string`

GetPaymentLabels returns the PaymentLabels field if non-nil, zero value otherwise.

### GetPaymentLabelsOk

`func (o *PaymentFilterV2) GetPaymentLabelsOk() (*[]string, bool)`

GetPaymentLabelsOk returns a tuple with the PaymentLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentLabels

`func (o *PaymentFilterV2) SetPaymentLabels(v []string)`

SetPaymentLabels sets PaymentLabels field to given value.

### HasPaymentLabels

`func (o *PaymentFilterV2) HasPaymentLabels() bool`

HasPaymentLabels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


