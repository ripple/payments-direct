# Page

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Size** | Pointer to **int32** | Size of the page | [optional] [default to 20]
**LastPageToken** | Pointer to **string** | The unique reference ID of the last fetched item. To retrieve subsequent item(s) if any, specify this value as the value of the &#x60;Page.list&#x60; field in the  &#x60;POST /payments/filter&#x60; operation request body. | [optional] 

## Methods

### NewPage

`func NewPage() *Page`

NewPage instantiates a new Page object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPageWithDefaults

`func NewPageWithDefaults() *Page`

NewPageWithDefaults instantiates a new Page object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSize

`func (o *Page) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *Page) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *Page) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *Page) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetLastPageToken

`func (o *Page) GetLastPageToken() string`

GetLastPageToken returns the LastPageToken field if non-nil, zero value otherwise.

### GetLastPageTokenOk

`func (o *Page) GetLastPageTokenOk() (*string, bool)`

GetLastPageTokenOk returns a tuple with the LastPageToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastPageToken

`func (o *Page) SetLastPageToken(v string)`

SetLastPageToken sets LastPageToken field to given value.

### HasLastPageToken

`func (o *Page) HasLastPageToken() bool`

HasLastPageToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


