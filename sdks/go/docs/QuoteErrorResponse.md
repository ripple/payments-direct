# QuoteErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**[]QuoteError**](QuoteError.md) | List of quote errors | 
**Status** | **int32** | Response status code | 

## Methods

### NewQuoteErrorResponse

`func NewQuoteErrorResponse(errors []QuoteError, status int32, ) *QuoteErrorResponse`

NewQuoteErrorResponse instantiates a new QuoteErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteErrorResponseWithDefaults

`func NewQuoteErrorResponseWithDefaults() *QuoteErrorResponse`

NewQuoteErrorResponseWithDefaults instantiates a new QuoteErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *QuoteErrorResponse) GetErrors() []QuoteError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *QuoteErrorResponse) GetErrorsOk() (*[]QuoteError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *QuoteErrorResponse) SetErrors(v []QuoteError)`

SetErrors sets Errors field to given value.


### GetStatus

`func (o *QuoteErrorResponse) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *QuoteErrorResponse) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *QuoteErrorResponse) SetStatus(v int32)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


