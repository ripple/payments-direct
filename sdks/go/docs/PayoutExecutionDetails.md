# PayoutExecutionDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PaymentRailUsed** | Pointer to **string** | The payment rail or network used to execute the payout (e.g., FEDWIRE, ACH, RTP_US, SPEI, FPS_UK).  | [optional] 
**PayoutStartTime** | Pointer to **time.Time** | The time at which the payout execution started, specified in UTC.  | [optional] 
**PayoutEndTime** | Pointer to **time.Time** | The timestamp when the payout execution completed or was last updated, as reported by the payout partner. Specified in UTC using ISO 8601 format. For in-progress payouts, this may represent the last status update time.  | [optional] 
**TrackingReferences** | Pointer to [**[]TrackingReference**](TrackingReference.md) | A list of tracking references for this transaction, such as transaction IDs and confirmation numbers.  | [optional] 

## Methods

### NewPayoutExecutionDetails

`func NewPayoutExecutionDetails() *PayoutExecutionDetails`

NewPayoutExecutionDetails instantiates a new PayoutExecutionDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPayoutExecutionDetailsWithDefaults

`func NewPayoutExecutionDetailsWithDefaults() *PayoutExecutionDetails`

NewPayoutExecutionDetailsWithDefaults instantiates a new PayoutExecutionDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaymentRailUsed

`func (o *PayoutExecutionDetails) GetPaymentRailUsed() string`

GetPaymentRailUsed returns the PaymentRailUsed field if non-nil, zero value otherwise.

### GetPaymentRailUsedOk

`func (o *PayoutExecutionDetails) GetPaymentRailUsedOk() (*string, bool)`

GetPaymentRailUsedOk returns a tuple with the PaymentRailUsed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentRailUsed

`func (o *PayoutExecutionDetails) SetPaymentRailUsed(v string)`

SetPaymentRailUsed sets PaymentRailUsed field to given value.

### HasPaymentRailUsed

`func (o *PayoutExecutionDetails) HasPaymentRailUsed() bool`

HasPaymentRailUsed returns a boolean if a field has been set.

### GetPayoutStartTime

`func (o *PayoutExecutionDetails) GetPayoutStartTime() time.Time`

GetPayoutStartTime returns the PayoutStartTime field if non-nil, zero value otherwise.

### GetPayoutStartTimeOk

`func (o *PayoutExecutionDetails) GetPayoutStartTimeOk() (*time.Time, bool)`

GetPayoutStartTimeOk returns a tuple with the PayoutStartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutStartTime

`func (o *PayoutExecutionDetails) SetPayoutStartTime(v time.Time)`

SetPayoutStartTime sets PayoutStartTime field to given value.

### HasPayoutStartTime

`func (o *PayoutExecutionDetails) HasPayoutStartTime() bool`

HasPayoutStartTime returns a boolean if a field has been set.

### GetPayoutEndTime

`func (o *PayoutExecutionDetails) GetPayoutEndTime() time.Time`

GetPayoutEndTime returns the PayoutEndTime field if non-nil, zero value otherwise.

### GetPayoutEndTimeOk

`func (o *PayoutExecutionDetails) GetPayoutEndTimeOk() (*time.Time, bool)`

GetPayoutEndTimeOk returns a tuple with the PayoutEndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutEndTime

`func (o *PayoutExecutionDetails) SetPayoutEndTime(v time.Time)`

SetPayoutEndTime sets PayoutEndTime field to given value.

### HasPayoutEndTime

`func (o *PayoutExecutionDetails) HasPayoutEndTime() bool`

HasPayoutEndTime returns a boolean if a field has been set.

### GetTrackingReferences

`func (o *PayoutExecutionDetails) GetTrackingReferences() []TrackingReference`

GetTrackingReferences returns the TrackingReferences field if non-nil, zero value otherwise.

### GetTrackingReferencesOk

`func (o *PayoutExecutionDetails) GetTrackingReferencesOk() (*[]TrackingReference, bool)`

GetTrackingReferencesOk returns a tuple with the TrackingReferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingReferences

`func (o *PayoutExecutionDetails) SetTrackingReferences(v []TrackingReference)`

SetTrackingReferences sets TrackingReferences field to given value.

### HasTrackingReferences

`func (o *PayoutExecutionDetails) HasTrackingReferences() bool`

HasTrackingReferences returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


