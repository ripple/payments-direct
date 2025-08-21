# Sort

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SortField** | Pointer to [**PaymentSortField**](PaymentSortField.md) |  | [optional] [default to PAYMENTSORTFIELD_INITIATED_AT]
**SortDirection** | Pointer to **string** | Sort results in ascending or descending order. | [optional] [default to "DESC"]

## Methods

### NewSort

`func NewSort() *Sort`

NewSort instantiates a new Sort object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSortWithDefaults

`func NewSortWithDefaults() *Sort`

NewSortWithDefaults instantiates a new Sort object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSortField

`func (o *Sort) GetSortField() PaymentSortField`

GetSortField returns the SortField field if non-nil, zero value otherwise.

### GetSortFieldOk

`func (o *Sort) GetSortFieldOk() (*PaymentSortField, bool)`

GetSortFieldOk returns a tuple with the SortField field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortField

`func (o *Sort) SetSortField(v PaymentSortField)`

SetSortField sets SortField field to given value.

### HasSortField

`func (o *Sort) HasSortField() bool`

HasSortField returns a boolean if a field has been set.

### GetSortDirection

`func (o *Sort) GetSortDirection() string`

GetSortDirection returns the SortDirection field if non-nil, zero value otherwise.

### GetSortDirectionOk

`func (o *Sort) GetSortDirectionOk() (*string, bool)`

GetSortDirectionOk returns a tuple with the SortDirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortDirection

`func (o *Sort) SetSortDirection(v string)`

SetSortDirection sets SortDirection field to given value.

### HasSortDirection

`func (o *Sort) HasSortDirection() bool`

HasSortDirection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


