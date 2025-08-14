# GetBalances400Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **int32** | The HTTP status code representing the error response | 
**Errors** | [**[]GetBalances400ResponseErrorsInner**](GetBalances400ResponseErrorsInner.md) | An array containing details about the errors encountered | 

## Methods

### NewGetBalances400Response

`func NewGetBalances400Response(status int32, errors []GetBalances400ResponseErrorsInner, ) *GetBalances400Response`

NewGetBalances400Response instantiates a new GetBalances400Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBalances400ResponseWithDefaults

`func NewGetBalances400ResponseWithDefaults() *GetBalances400Response`

NewGetBalances400ResponseWithDefaults instantiates a new GetBalances400Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetBalances400Response) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetBalances400Response) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetBalances400Response) SetStatus(v int32)`

SetStatus sets Status field to given value.


### GetErrors

`func (o *GetBalances400Response) GetErrors() []GetBalances400ResponseErrorsInner`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *GetBalances400Response) GetErrorsOk() (*[]GetBalances400ResponseErrorsInner, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *GetBalances400Response) SetErrors(v []GetBalances400ResponseErrorsInner)`

SetErrors sets Errors field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


