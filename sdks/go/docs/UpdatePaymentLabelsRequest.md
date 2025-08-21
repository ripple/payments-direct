# UpdatePaymentLabelsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LabelsToAdd** | Pointer to **[]string** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 
**LabelsToRemove** | Pointer to **[]string** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 

## Methods

### NewUpdatePaymentLabelsRequest

`func NewUpdatePaymentLabelsRequest() *UpdatePaymentLabelsRequest`

NewUpdatePaymentLabelsRequest instantiates a new UpdatePaymentLabelsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePaymentLabelsRequestWithDefaults

`func NewUpdatePaymentLabelsRequestWithDefaults() *UpdatePaymentLabelsRequest`

NewUpdatePaymentLabelsRequestWithDefaults instantiates a new UpdatePaymentLabelsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabelsToAdd

`func (o *UpdatePaymentLabelsRequest) GetLabelsToAdd() []string`

GetLabelsToAdd returns the LabelsToAdd field if non-nil, zero value otherwise.

### GetLabelsToAddOk

`func (o *UpdatePaymentLabelsRequest) GetLabelsToAddOk() (*[]string, bool)`

GetLabelsToAddOk returns a tuple with the LabelsToAdd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelsToAdd

`func (o *UpdatePaymentLabelsRequest) SetLabelsToAdd(v []string)`

SetLabelsToAdd sets LabelsToAdd field to given value.

### HasLabelsToAdd

`func (o *UpdatePaymentLabelsRequest) HasLabelsToAdd() bool`

HasLabelsToAdd returns a boolean if a field has been set.

### GetLabelsToRemove

`func (o *UpdatePaymentLabelsRequest) GetLabelsToRemove() []string`

GetLabelsToRemove returns the LabelsToRemove field if non-nil, zero value otherwise.

### GetLabelsToRemoveOk

`func (o *UpdatePaymentLabelsRequest) GetLabelsToRemoveOk() (*[]string, bool)`

GetLabelsToRemoveOk returns a tuple with the LabelsToRemove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelsToRemove

`func (o *UpdatePaymentLabelsRequest) SetLabelsToRemove(v []string)`

SetLabelsToRemove sets LabelsToRemove field to given value.

### HasLabelsToRemove

`func (o *UpdatePaymentLabelsRequest) HasLabelsToRemove() bool`

HasLabelsToRemove returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


