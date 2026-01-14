# SortV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SortField** | Pointer to **string** | The field to use when sorting payments in the requested sort order.  Currently supported values include:  - &#x60;internalId&#x60;  - &#x60;paymentState&#x60;  - &#x60;sourceCurrency&#x60;  - &#x60;sourceAmount&#x60;  - &#x60;destinationCurrency&#x60;  - &#x60;destinationCountry&#x60;  - &#x60;destinationAmount&#x60;  - &#x60;initiatedAt&#x60;  - &#x60;expiresAt&#x60;  - &#x60;lastStateUpdatedAt&#x60;  - &#x60;paymentLabel&#x60;  If an unsupported value is provided, the request fails with a validation error.  | [optional] [default to "initiatedAt"]
**SortDirection** | Pointer to **string** | Indicates whether results are sorted in ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [default to "DESC"]

## Methods

### NewSortV2

`func NewSortV2() *SortV2`

NewSortV2 instantiates a new SortV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSortV2WithDefaults

`func NewSortV2WithDefaults() *SortV2`

NewSortV2WithDefaults instantiates a new SortV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSortField

`func (o *SortV2) GetSortField() string`

GetSortField returns the SortField field if non-nil, zero value otherwise.

### GetSortFieldOk

`func (o *SortV2) GetSortFieldOk() (*string, bool)`

GetSortFieldOk returns a tuple with the SortField field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortField

`func (o *SortV2) SetSortField(v string)`

SetSortField sets SortField field to given value.

### HasSortField

`func (o *SortV2) HasSortField() bool`

HasSortField returns a boolean if a field has been set.

### GetSortDirection

`func (o *SortV2) GetSortDirection() string`

GetSortDirection returns the SortDirection field if non-nil, zero value otherwise.

### GetSortDirectionOk

`func (o *SortV2) GetSortDirectionOk() (*string, bool)`

GetSortDirectionOk returns a tuple with the SortDirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortDirection

`func (o *SortV2) SetSortDirection(v string)`

SetSortDirection sets SortDirection field to given value.

### HasSortDirection

`func (o *SortV2) HasSortDirection() bool`

HasSortDirection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


