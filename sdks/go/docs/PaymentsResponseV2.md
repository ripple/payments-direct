# PaymentsResponseV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]PaymentV2**](PaymentV2.md) | Array of Payment objects | [optional] 
**Filter** | Pointer to [**PaymentFilterV2**](PaymentFilterV2.md) |  | [optional] 
**Sort** | Pointer to [**SortV2**](SortV2.md) |  | [optional] 
**Page** | Pointer to [**Page**](Page.md) |  | [optional] 

## Methods

### NewPaymentsResponseV2

`func NewPaymentsResponseV2() *PaymentsResponseV2`

NewPaymentsResponseV2 instantiates a new PaymentsResponseV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentsResponseV2WithDefaults

`func NewPaymentsResponseV2WithDefaults() *PaymentsResponseV2`

NewPaymentsResponseV2WithDefaults instantiates a new PaymentsResponseV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *PaymentsResponseV2) GetData() []PaymentV2`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PaymentsResponseV2) GetDataOk() (*[]PaymentV2, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PaymentsResponseV2) SetData(v []PaymentV2)`

SetData sets Data field to given value.

### HasData

`func (o *PaymentsResponseV2) HasData() bool`

HasData returns a boolean if a field has been set.

### GetFilter

`func (o *PaymentsResponseV2) GetFilter() PaymentFilterV2`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *PaymentsResponseV2) GetFilterOk() (*PaymentFilterV2, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *PaymentsResponseV2) SetFilter(v PaymentFilterV2)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *PaymentsResponseV2) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetSort

`func (o *PaymentsResponseV2) GetSort() SortV2`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *PaymentsResponseV2) GetSortOk() (*SortV2, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *PaymentsResponseV2) SetSort(v SortV2)`

SetSort sets Sort field to given value.

### HasSort

`func (o *PaymentsResponseV2) HasSort() bool`

HasSort returns a boolean if a field has been set.

### GetPage

`func (o *PaymentsResponseV2) GetPage() Page`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *PaymentsResponseV2) GetPageOk() (*Page, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *PaymentsResponseV2) SetPage(v Page)`

SetPage sets Page field to given value.

### HasPage

`func (o *PaymentsResponseV2) HasPage() bool`

HasPage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


