# QuoteError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Unique identifier of an error | 
**Title** | **string** | Error message providing a brief summary of the error | 
**Type** | **string** | Identifies the problem type | 
**Description** | **string** | Provides more technical information | 
**Timestamp** | **time.Time** | The time when this error occurred, specified in UTC. | 

## Methods

### NewQuoteError

`func NewQuoteError(code string, title string, type_ string, description string, timestamp time.Time, ) *QuoteError`

NewQuoteError instantiates a new QuoteError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuoteErrorWithDefaults

`func NewQuoteErrorWithDefaults() *QuoteError`

NewQuoteErrorWithDefaults instantiates a new QuoteError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *QuoteError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *QuoteError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *QuoteError) SetCode(v string)`

SetCode sets Code field to given value.


### GetTitle

`func (o *QuoteError) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *QuoteError) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *QuoteError) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetType

`func (o *QuoteError) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *QuoteError) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *QuoteError) SetType(v string)`

SetType sets Type field to given value.


### GetDescription

`func (o *QuoteError) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *QuoteError) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *QuoteError) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetTimestamp

`func (o *QuoteError) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *QuoteError) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *QuoteError) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


