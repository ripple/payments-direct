# SearchPaymentsRequestV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filter** | Pointer to [**PaymentFilterV2**](PaymentFilterV2.md) |  | [optional] 
**Sort** | Pointer to [**SortV2**](SortV2.md) |  | [optional] 
**Page** | Pointer to [**Page**](Page.md) |  | [optional] 

## Methods

### NewSearchPaymentsRequestV2

`func NewSearchPaymentsRequestV2() *SearchPaymentsRequestV2`

NewSearchPaymentsRequestV2 instantiates a new SearchPaymentsRequestV2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchPaymentsRequestV2WithDefaults

`func NewSearchPaymentsRequestV2WithDefaults() *SearchPaymentsRequestV2`

NewSearchPaymentsRequestV2WithDefaults instantiates a new SearchPaymentsRequestV2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilter

`func (o *SearchPaymentsRequestV2) GetFilter() PaymentFilterV2`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *SearchPaymentsRequestV2) GetFilterOk() (*PaymentFilterV2, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *SearchPaymentsRequestV2) SetFilter(v PaymentFilterV2)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *SearchPaymentsRequestV2) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetSort

`func (o *SearchPaymentsRequestV2) GetSort() SortV2`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *SearchPaymentsRequestV2) GetSortOk() (*SortV2, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *SearchPaymentsRequestV2) SetSort(v SortV2)`

SetSort sets Sort field to given value.

### HasSort

`func (o *SearchPaymentsRequestV2) HasSort() bool`

HasSort returns a boolean if a field has been set.

### GetPage

`func (o *SearchPaymentsRequestV2) GetPage() Page`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *SearchPaymentsRequestV2) GetPageOk() (*Page, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *SearchPaymentsRequestV2) SetPage(v Page)`

SetPage sets Page field to given value.

### HasPage

`func (o *SearchPaymentsRequestV2) HasPage() bool`

HasPage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


