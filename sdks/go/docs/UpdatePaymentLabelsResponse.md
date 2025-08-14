# UpdatePaymentLabelsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | **[]string** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | 

## Methods

### NewUpdatePaymentLabelsResponse

`func NewUpdatePaymentLabelsResponse(labels []string, ) *UpdatePaymentLabelsResponse`

NewUpdatePaymentLabelsResponse instantiates a new UpdatePaymentLabelsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePaymentLabelsResponseWithDefaults

`func NewUpdatePaymentLabelsResponseWithDefaults() *UpdatePaymentLabelsResponse`

NewUpdatePaymentLabelsResponseWithDefaults instantiates a new UpdatePaymentLabelsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabels

`func (o *UpdatePaymentLabelsResponse) GetLabels() []string`

GetLabels returns the Labels field if non-nil, zero value otherwise.

### GetLabelsOk

`func (o *UpdatePaymentLabelsResponse) GetLabelsOk() (*[]string, bool)`

GetLabelsOk returns a tuple with the Labels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabels

`func (o *UpdatePaymentLabelsResponse) SetLabels(v []string)`

SetLabels sets Labels field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


