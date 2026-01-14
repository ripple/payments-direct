# GetStatementsTransactionsForCustomer200ResponseInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offset** | Pointer to **int32** | Offset used in the request to skip a specific number of records.  | [optional] 
**PageSize** | Pointer to **int32** | Number of records requested per page | [optional] 
**PageElements** | Pointer to **int32** | Number of records returned in requested page | [optional] 
**Total** | Pointer to **int64** | Total number of records available for the given filters. | [optional] 
**StatementTransactions** | Pointer to [**[]GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner**](GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner.md) | Statement transaction details for the tenant. | [optional] 

## Methods

### NewGetStatementsTransactionsForCustomer200ResponseInner

`func NewGetStatementsTransactionsForCustomer200ResponseInner() *GetStatementsTransactionsForCustomer200ResponseInner`

NewGetStatementsTransactionsForCustomer200ResponseInner instantiates a new GetStatementsTransactionsForCustomer200ResponseInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetStatementsTransactionsForCustomer200ResponseInnerWithDefaults

`func NewGetStatementsTransactionsForCustomer200ResponseInnerWithDefaults() *GetStatementsTransactionsForCustomer200ResponseInner`

NewGetStatementsTransactionsForCustomer200ResponseInnerWithDefaults instantiates a new GetStatementsTransactionsForCustomer200ResponseInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffset

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetPageSize

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetPageSize() int32`

GetPageSize returns the PageSize field if non-nil, zero value otherwise.

### GetPageSizeOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetPageSizeOk() (*int32, bool)`

GetPageSizeOk returns a tuple with the PageSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageSize

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) SetPageSize(v int32)`

SetPageSize sets PageSize field to given value.

### HasPageSize

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) HasPageSize() bool`

HasPageSize returns a boolean if a field has been set.

### GetPageElements

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetPageElements() int32`

GetPageElements returns the PageElements field if non-nil, zero value otherwise.

### GetPageElementsOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetPageElementsOk() (*int32, bool)`

GetPageElementsOk returns a tuple with the PageElements field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageElements

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) SetPageElements(v int32)`

SetPageElements sets PageElements field to given value.

### HasPageElements

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) HasPageElements() bool`

HasPageElements returns a boolean if a field has been set.

### GetTotal

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetTotal() int64`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetTotalOk() (*int64, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) SetTotal(v int64)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) HasTotal() bool`

HasTotal returns a boolean if a field has been set.

### GetStatementTransactions

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetStatementTransactions() []GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner`

GetStatementTransactions returns the StatementTransactions field if non-nil, zero value otherwise.

### GetStatementTransactionsOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) GetStatementTransactionsOk() (*[]GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner, bool)`

GetStatementTransactionsOk returns a tuple with the StatementTransactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatementTransactions

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) SetStatementTransactions(v []GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner)`

SetStatementTransactions sets StatementTransactions field to given value.

### HasStatementTransactions

`func (o *GetStatementsTransactionsForCustomer200ResponseInner) HasStatementTransactions() bool`

HasStatementTransactions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


