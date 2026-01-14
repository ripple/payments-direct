# GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tenant** | Pointer to **string** | Identifier of the tenant that owns this ledger transaction. | [optional] 
**Amount** | Pointer to **float32** | Amount of the transaction applied to the tenant’s ledger account.  | [optional] 
**Currency** | Pointer to **string** | Three-letter ISO 4217 currency code of the transaction. | [optional] 
**Operation** | Pointer to **string** | Operation performed on the tenant’s prefunded ledger account.  | [optional] 
**TxnSource** | Pointer to **string** | Source of the ledger transaction (for example, which system or flow created it).  | [optional] 
**Status** | Pointer to **string** | State of the ledger transaction. | [optional] 
**CreatedDttm** | Pointer to **time.Time** | Timestamp (UTC) when the ledger transaction was created. | [optional] 
**UpdatedDttm** | Pointer to **time.Time** | Timestamp (UTC) when the ledger transaction was last updated. | [optional] 
**AvailableBalanceBefore** | Pointer to **float32** | Available ledger account balance (in the transaction currency) immediately before this transaction was applied.  | [optional] 
**AvailableBalanceAfter** | Pointer to **float32** | Available ledger account balance (in the transaction currency) immediately after this transaction was applied.  | [optional] 

## Methods

### NewGetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner

`func NewGetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner() *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner`

NewGetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner instantiates a new GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInnerWithDefaults

`func NewGetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInnerWithDefaults() *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner`

NewGetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInnerWithDefaults instantiates a new GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTenant

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetTenant() string`

GetTenant returns the Tenant field if non-nil, zero value otherwise.

### GetTenantOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetTenantOk() (*string, bool)`

GetTenantOk returns a tuple with the Tenant field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTenant

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetTenant(v string)`

SetTenant sets Tenant field to given value.

### HasTenant

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasTenant() bool`

HasTenant returns a boolean if a field has been set.

### GetAmount

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCurrency

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetOperation

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetOperation(v string)`

SetOperation sets Operation field to given value.

### HasOperation

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasOperation() bool`

HasOperation returns a boolean if a field has been set.

### GetTxnSource

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetTxnSource() string`

GetTxnSource returns the TxnSource field if non-nil, zero value otherwise.

### GetTxnSourceOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetTxnSourceOk() (*string, bool)`

GetTxnSourceOk returns a tuple with the TxnSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxnSource

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetTxnSource(v string)`

SetTxnSource sets TxnSource field to given value.

### HasTxnSource

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasTxnSource() bool`

HasTxnSource returns a boolean if a field has been set.

### GetStatus

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCreatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetCreatedDttm() time.Time`

GetCreatedDttm returns the CreatedDttm field if non-nil, zero value otherwise.

### GetCreatedDttmOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetCreatedDttmOk() (*time.Time, bool)`

GetCreatedDttmOk returns a tuple with the CreatedDttm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetCreatedDttm(v time.Time)`

SetCreatedDttm sets CreatedDttm field to given value.

### HasCreatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasCreatedDttm() bool`

HasCreatedDttm returns a boolean if a field has been set.

### GetUpdatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetUpdatedDttm() time.Time`

GetUpdatedDttm returns the UpdatedDttm field if non-nil, zero value otherwise.

### GetUpdatedDttmOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetUpdatedDttmOk() (*time.Time, bool)`

GetUpdatedDttmOk returns a tuple with the UpdatedDttm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetUpdatedDttm(v time.Time)`

SetUpdatedDttm sets UpdatedDttm field to given value.

### HasUpdatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasUpdatedDttm() bool`

HasUpdatedDttm returns a boolean if a field has been set.

### GetAvailableBalanceBefore

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetAvailableBalanceBefore() float32`

GetAvailableBalanceBefore returns the AvailableBalanceBefore field if non-nil, zero value otherwise.

### GetAvailableBalanceBeforeOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetAvailableBalanceBeforeOk() (*float32, bool)`

GetAvailableBalanceBeforeOk returns a tuple with the AvailableBalanceBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableBalanceBefore

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetAvailableBalanceBefore(v float32)`

SetAvailableBalanceBefore sets AvailableBalanceBefore field to given value.

### HasAvailableBalanceBefore

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasAvailableBalanceBefore() bool`

HasAvailableBalanceBefore returns a boolean if a field has been set.

### GetAvailableBalanceAfter

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetAvailableBalanceAfter() float32`

GetAvailableBalanceAfter returns the AvailableBalanceAfter field if non-nil, zero value otherwise.

### GetAvailableBalanceAfterOk

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) GetAvailableBalanceAfterOk() (*float32, bool)`

GetAvailableBalanceAfterOk returns a tuple with the AvailableBalanceAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableBalanceAfter

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) SetAvailableBalanceAfter(v float32)`

SetAvailableBalanceAfter sets AvailableBalanceAfter field to given value.

### HasAvailableBalanceAfter

`func (o *GetStatementsTransactionsForCustomer200ResponseInnerStatementTransactionsInner) HasAvailableBalanceAfter() bool`

HasAvailableBalanceAfter returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


