# PaymentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]Payment**](Payment.md) | Array of Payment objects | [optional] 
**Filter** | Pointer to [**PaymentFilter**](PaymentFilter.md) |  | [optional] 
**Sort** | Pointer to [**Sort**](Sort.md) |  | [optional] 
**Page** | Pointer to [**Page**](Page.md) |  | [optional] 

## Methods

### NewPaymentsResponse

`func NewPaymentsResponse() *PaymentsResponse`

NewPaymentsResponse instantiates a new PaymentsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentsResponseWithDefaults

`func NewPaymentsResponseWithDefaults() *PaymentsResponse`

NewPaymentsResponseWithDefaults instantiates a new PaymentsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *PaymentsResponse) GetData() []Payment`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PaymentsResponse) GetDataOk() (*[]Payment, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PaymentsResponse) SetData(v []Payment)`

SetData sets Data field to given value.

### HasData

`func (o *PaymentsResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetFilter

`func (o *PaymentsResponse) GetFilter() PaymentFilter`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *PaymentsResponse) GetFilterOk() (*PaymentFilter, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *PaymentsResponse) SetFilter(v PaymentFilter)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *PaymentsResponse) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetSort

`func (o *PaymentsResponse) GetSort() Sort`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *PaymentsResponse) GetSortOk() (*Sort, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *PaymentsResponse) SetSort(v Sort)`

SetSort sets Sort field to given value.

### HasSort

`func (o *PaymentsResponse) HasSort() bool`

HasSort returns a boolean if a field has been set.

### GetPage

`func (o *PaymentsResponse) GetPage() Page`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *PaymentsResponse) GetPageOk() (*Page, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *PaymentsResponse) SetPage(v Page)`

SetPage sets Page field to given value.

### HasPage

`func (o *PaymentsResponse) HasPage() bool`

HasPage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


