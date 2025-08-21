# StateTransition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UpdatedFrom** | [**PaymentState**](PaymentState.md) |  | 
**UpdatedTo** | [**PaymentState**](PaymentState.md) |  | 
**UpdatedAt** | **time.Time** | The timestamp when the payment state was updated. | 

## Methods

### NewStateTransition

`func NewStateTransition(updatedFrom PaymentState, updatedTo PaymentState, updatedAt time.Time, ) *StateTransition`

NewStateTransition instantiates a new StateTransition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStateTransitionWithDefaults

`func NewStateTransitionWithDefaults() *StateTransition`

NewStateTransitionWithDefaults instantiates a new StateTransition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUpdatedFrom

`func (o *StateTransition) GetUpdatedFrom() PaymentState`

GetUpdatedFrom returns the UpdatedFrom field if non-nil, zero value otherwise.

### GetUpdatedFromOk

`func (o *StateTransition) GetUpdatedFromOk() (*PaymentState, bool)`

GetUpdatedFromOk returns a tuple with the UpdatedFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedFrom

`func (o *StateTransition) SetUpdatedFrom(v PaymentState)`

SetUpdatedFrom sets UpdatedFrom field to given value.


### GetUpdatedTo

`func (o *StateTransition) GetUpdatedTo() PaymentState`

GetUpdatedTo returns the UpdatedTo field if non-nil, zero value otherwise.

### GetUpdatedToOk

`func (o *StateTransition) GetUpdatedToOk() (*PaymentState, bool)`

GetUpdatedToOk returns a tuple with the UpdatedTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTo

`func (o *StateTransition) SetUpdatedTo(v PaymentState)`

SetUpdatedTo sets UpdatedTo field to given value.


### GetUpdatedAt

`func (o *StateTransition) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *StateTransition) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *StateTransition) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


