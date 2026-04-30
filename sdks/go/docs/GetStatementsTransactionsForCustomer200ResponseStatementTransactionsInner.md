# GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tenant** | Pointer to **string** | Identifier of the customer that owns this ledger transaction. | [optional] 
**Amount** | Pointer to **float32** | Amount of the transaction applied to the customer&#39;s ledger account.  | [optional] 
**Currency** | Pointer to **string** | Three-letter ISO 4217 currency code of the transaction. | [optional] 
**TxnReference** | Pointer to **NullableString** | External reference that links this ledger transaction to a payment or other upstream operation. Present for RESERVE and DEBIT operations, where it matches the Payments Direct payment ID. Null for all other operation types.  | [optional] 
**Operation** | Pointer to **string** | Operation performed on the customer&#39;s prefunded ledger account.  | [optional] 
**TxnSource** | Pointer to **string** | Source of the ledger transaction (for example, which system or flow created it).  | [optional] 
**Status** | Pointer to **string** | State of the ledger transaction. | [optional] 
**CreatedDttm** | Pointer to **time.Time** | Timestamp (UTC) when the ledger transaction was created. | [optional] 
**UpdatedDttm** | Pointer to **time.Time** | Timestamp (UTC) when the ledger transaction was last updated. | [optional] 
**AvailableBalanceBefore** | Pointer to **float32** | Available ledger account balance (in the transaction currency) immediately before this transaction was applied.  | [optional] 
**AvailableBalanceAfter** | Pointer to **float32** | Available ledger account balance (in the transaction currency) immediately after this transaction was applied.  | [optional] 

## Methods

### NewGetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner

`func NewGetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner() *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner`

NewGetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner instantiates a new GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetStatementsTransactionsForCustomer200ResponseStatementTransactionsInnerWithDefaults

`func NewGetStatementsTransactionsForCustomer200ResponseStatementTransactionsInnerWithDefaults() *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner`

NewGetStatementsTransactionsForCustomer200ResponseStatementTransactionsInnerWithDefaults instantiates a new GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTenant

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetTenant() string`

GetTenant returns the Tenant field if non-nil, zero value otherwise.

### GetTenantOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetTenantOk() (*string, bool)`

GetTenantOk returns a tuple with the Tenant field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTenant

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetTenant(v string)`

SetTenant sets Tenant field to given value.

### HasTenant

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasTenant() bool`

HasTenant returns a boolean if a field has been set.

### GetAmount

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCurrency

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetTxnReference

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetTxnReference() string`

GetTxnReference returns the TxnReference field if non-nil, zero value otherwise.

### GetTxnReferenceOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetTxnReferenceOk() (*string, bool)`

GetTxnReferenceOk returns a tuple with the TxnReference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxnReference

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetTxnReference(v string)`

SetTxnReference sets TxnReference field to given value.

### HasTxnReference

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasTxnReference() bool`

HasTxnReference returns a boolean if a field has been set.

### SetTxnReferenceNil

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetTxnReferenceNil(b bool)`

 SetTxnReferenceNil sets the value for TxnReference to be an explicit nil

### UnsetTxnReference
`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) UnsetTxnReference()`

UnsetTxnReference ensures that no value is present for TxnReference, not even an explicit nil
### GetOperation

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetOperation(v string)`

SetOperation sets Operation field to given value.

### HasOperation

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasOperation() bool`

HasOperation returns a boolean if a field has been set.

### GetTxnSource

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetTxnSource() string`

GetTxnSource returns the TxnSource field if non-nil, zero value otherwise.

### GetTxnSourceOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetTxnSourceOk() (*string, bool)`

GetTxnSourceOk returns a tuple with the TxnSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxnSource

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetTxnSource(v string)`

SetTxnSource sets TxnSource field to given value.

### HasTxnSource

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasTxnSource() bool`

HasTxnSource returns a boolean if a field has been set.

### GetStatus

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCreatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetCreatedDttm() time.Time`

GetCreatedDttm returns the CreatedDttm field if non-nil, zero value otherwise.

### GetCreatedDttmOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetCreatedDttmOk() (*time.Time, bool)`

GetCreatedDttmOk returns a tuple with the CreatedDttm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetCreatedDttm(v time.Time)`

SetCreatedDttm sets CreatedDttm field to given value.

### HasCreatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasCreatedDttm() bool`

HasCreatedDttm returns a boolean if a field has been set.

### GetUpdatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetUpdatedDttm() time.Time`

GetUpdatedDttm returns the UpdatedDttm field if non-nil, zero value otherwise.

### GetUpdatedDttmOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetUpdatedDttmOk() (*time.Time, bool)`

GetUpdatedDttmOk returns a tuple with the UpdatedDttm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetUpdatedDttm(v time.Time)`

SetUpdatedDttm sets UpdatedDttm field to given value.

### HasUpdatedDttm

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasUpdatedDttm() bool`

HasUpdatedDttm returns a boolean if a field has been set.

### GetAvailableBalanceBefore

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetAvailableBalanceBefore() float32`

GetAvailableBalanceBefore returns the AvailableBalanceBefore field if non-nil, zero value otherwise.

### GetAvailableBalanceBeforeOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetAvailableBalanceBeforeOk() (*float32, bool)`

GetAvailableBalanceBeforeOk returns a tuple with the AvailableBalanceBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableBalanceBefore

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetAvailableBalanceBefore(v float32)`

SetAvailableBalanceBefore sets AvailableBalanceBefore field to given value.

### HasAvailableBalanceBefore

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasAvailableBalanceBefore() bool`

HasAvailableBalanceBefore returns a boolean if a field has been set.

### GetAvailableBalanceAfter

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetAvailableBalanceAfter() float32`

GetAvailableBalanceAfter returns the AvailableBalanceAfter field if non-nil, zero value otherwise.

### GetAvailableBalanceAfterOk

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) GetAvailableBalanceAfterOk() (*float32, bool)`

GetAvailableBalanceAfterOk returns a tuple with the AvailableBalanceAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableBalanceAfter

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) SetAvailableBalanceAfter(v float32)`

SetAvailableBalanceAfter sets AvailableBalanceAfter field to given value.

### HasAvailableBalanceAfter

`func (o *GetStatementsTransactionsForCustomer200ResponseStatementTransactionsInner) HasAvailableBalanceAfter() bool`

HasAvailableBalanceAfter returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


