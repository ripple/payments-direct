# GetBalances400ResponseErrorsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | A unique error code that identifies the specific error | 
**Type** | **string** | A high-level categorization of the error, indicating the type of issue that occurred | 
**Title** | **string** | A brief, user-friendly description of the error | 
**Description** | **string** | A more detailed explanation of the error, including potential causes and next steps | 
**Timestamp** | **time.Time** | The timestamp of the error occurrence | 

## Methods

### NewGetBalances400ResponseErrorsInner

`func NewGetBalances400ResponseErrorsInner(code string, type_ string, title string, description string, timestamp time.Time, ) *GetBalances400ResponseErrorsInner`

NewGetBalances400ResponseErrorsInner instantiates a new GetBalances400ResponseErrorsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBalances400ResponseErrorsInnerWithDefaults

`func NewGetBalances400ResponseErrorsInnerWithDefaults() *GetBalances400ResponseErrorsInner`

NewGetBalances400ResponseErrorsInnerWithDefaults instantiates a new GetBalances400ResponseErrorsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *GetBalances400ResponseErrorsInner) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *GetBalances400ResponseErrorsInner) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *GetBalances400ResponseErrorsInner) SetCode(v string)`

SetCode sets Code field to given value.


### GetType

`func (o *GetBalances400ResponseErrorsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetBalances400ResponseErrorsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetBalances400ResponseErrorsInner) SetType(v string)`

SetType sets Type field to given value.


### GetTitle

`func (o *GetBalances400ResponseErrorsInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *GetBalances400ResponseErrorsInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *GetBalances400ResponseErrorsInner) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetDescription

`func (o *GetBalances400ResponseErrorsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *GetBalances400ResponseErrorsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *GetBalances400ResponseErrorsInner) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetTimestamp

`func (o *GetBalances400ResponseErrorsInner) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *GetBalances400ResponseErrorsInner) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *GetBalances400ResponseErrorsInner) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


