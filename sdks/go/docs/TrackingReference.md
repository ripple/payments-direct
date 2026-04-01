# TrackingReference

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReferenceType** | Pointer to **string** | The type or category of this tracking reference. Known values include IMAD and OMAD for Fedwire transfers, but additional types may be provided depending on the payment rail and payout partner.  | [optional] 
**Value** | Pointer to **string** | The tracking reference value. Use this to locate the transaction with the payout partner or payment rail operator. Format varies by referenceType. | [optional] 
**DisplayName** | Pointer to **string** | A human-readable name for this tracking reference, suitable for display in user interfaces. | [optional] 
**Description** | Pointer to **string** | A detailed description of what this tracking reference represents and how it can be used. | [optional] 

## Methods

### NewTrackingReference

`func NewTrackingReference() *TrackingReference`

NewTrackingReference instantiates a new TrackingReference object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrackingReferenceWithDefaults

`func NewTrackingReferenceWithDefaults() *TrackingReference`

NewTrackingReferenceWithDefaults instantiates a new TrackingReference object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReferenceType

`func (o *TrackingReference) GetReferenceType() string`

GetReferenceType returns the ReferenceType field if non-nil, zero value otherwise.

### GetReferenceTypeOk

`func (o *TrackingReference) GetReferenceTypeOk() (*string, bool)`

GetReferenceTypeOk returns a tuple with the ReferenceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReferenceType

`func (o *TrackingReference) SetReferenceType(v string)`

SetReferenceType sets ReferenceType field to given value.

### HasReferenceType

`func (o *TrackingReference) HasReferenceType() bool`

HasReferenceType returns a boolean if a field has been set.

### GetValue

`func (o *TrackingReference) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *TrackingReference) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *TrackingReference) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *TrackingReference) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetDisplayName

`func (o *TrackingReference) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *TrackingReference) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *TrackingReference) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.

### HasDisplayName

`func (o *TrackingReference) HasDisplayName() bool`

HasDisplayName returns a boolean if a field has been set.

### GetDescription

`func (o *TrackingReference) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TrackingReference) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TrackingReference) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *TrackingReference) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


