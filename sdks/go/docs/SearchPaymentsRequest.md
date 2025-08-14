# SearchPaymentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filter** | Pointer to [**PaymentFilter**](PaymentFilter.md) |  | [optional] 
**Sort** | Pointer to [**Sort**](Sort.md) |  | [optional] 
**Page** | Pointer to [**Page**](Page.md) |  | [optional] 

## Methods

### NewSearchPaymentsRequest

`func NewSearchPaymentsRequest() *SearchPaymentsRequest`

NewSearchPaymentsRequest instantiates a new SearchPaymentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchPaymentsRequestWithDefaults

`func NewSearchPaymentsRequestWithDefaults() *SearchPaymentsRequest`

NewSearchPaymentsRequestWithDefaults instantiates a new SearchPaymentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilter

`func (o *SearchPaymentsRequest) GetFilter() PaymentFilter`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *SearchPaymentsRequest) GetFilterOk() (*PaymentFilter, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *SearchPaymentsRequest) SetFilter(v PaymentFilter)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *SearchPaymentsRequest) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetSort

`func (o *SearchPaymentsRequest) GetSort() Sort`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *SearchPaymentsRequest) GetSortOk() (*Sort, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *SearchPaymentsRequest) SetSort(v Sort)`

SetSort sets Sort field to given value.

### HasSort

`func (o *SearchPaymentsRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.

### GetPage

`func (o *SearchPaymentsRequest) GetPage() Page`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *SearchPaymentsRequest) GetPageOk() (*Page, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *SearchPaymentsRequest) SetPage(v Page)`

SetPage sets Page field to given value.

### HasPage

`func (o *SearchPaymentsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


