# StateTransitionV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UpdatedFrom** | **string** | Current state of a payment.  The payment lifecycle currently uses the following values:  - &#x60;QUOTED&#x60;  - &#x60;INITIATED&#x60;  - &#x60;VALIDATING&#x60;  - &#x60;TRANSFERRING&#x60;  - &#x60;COMPLETED&#x60;  - &#x60;FAILED&#x60;  - &#x60;RETURNED&#x60;  - &#x60;DECLINED&#x60;  Additional states may be introduced in the future without breaking existing integrations.  | 
**UpdatedTo** | **string** | Current state of a payment.  The payment lifecycle currently uses the following values:  - &#x60;QUOTED&#x60;  - &#x60;INITIATED&#x60;  - &#x60;VALIDATING&#x60;  - &#x60;TRANSFERRING&#x60;  - &#x60;COMPLETED&#x60;  - &#x60;FAILED&#x60;  - &#x60;RETURNED&#x60;  - &#x60;DECLINED&#x60;  Additional states may be introduced in the future without breaking existing integrations.  | 
**UpdatedAt** | **time.Time** | The timestamp when the payment state was updated. | 

## Methods

### NewStateTransitionV2

`func NewStateTransitionV2(updatedFrom string, updatedTo string, updatedAt time.Time, ) *StateTransitionV2`

NewStateTransitionV2 instantiates a new StateTransitionV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStateTransitionV2WithDefaults

`func NewStateTransitionV2WithDefaults() *StateTransitionV2`

NewStateTransitionV2WithDefaults instantiates a new StateTransitionV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUpdatedFrom

`func (o *StateTransitionV2) GetUpdatedFrom() string`

GetUpdatedFrom returns the UpdatedFrom field if non-nil, zero value otherwise.

### GetUpdatedFromOk

`func (o *StateTransitionV2) GetUpdatedFromOk() (*string, bool)`

GetUpdatedFromOk returns a tuple with the UpdatedFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedFrom

`func (o *StateTransitionV2) SetUpdatedFrom(v string)`

SetUpdatedFrom sets UpdatedFrom field to given value.


### GetUpdatedTo

`func (o *StateTransitionV2) GetUpdatedTo() string`

GetUpdatedTo returns the UpdatedTo field if non-nil, zero value otherwise.

### GetUpdatedToOk

`func (o *StateTransitionV2) GetUpdatedToOk() (*string, bool)`

GetUpdatedToOk returns a tuple with the UpdatedTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTo

`func (o *StateTransitionV2) SetUpdatedTo(v string)`

SetUpdatedTo sets UpdatedTo field to given value.


### GetUpdatedAt

`func (o *StateTransitionV2) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *StateTransitionV2) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *StateTransitionV2) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


