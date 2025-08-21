# GetBalances200ResponseBalancesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FundingType** | **string** | The funding method associated with your account. | 
**Currency** | **string** | Currency code. | 
**AvailableBalance** | **float32** | Available funded balance that you can use to initiate payments. | 
**ReservedBalance** | **float32** | Amount reserved to complete in-progress transactions. You can&#39;t use this amount to initiate new payments. | 

## Methods

### NewGetBalances200ResponseBalancesInner

`func NewGetBalances200ResponseBalancesInner(fundingType string, currency string, availableBalance float32, reservedBalance float32, ) *GetBalances200ResponseBalancesInner`

NewGetBalances200ResponseBalancesInner instantiates a new GetBalances200ResponseBalancesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBalances200ResponseBalancesInnerWithDefaults

`func NewGetBalances200ResponseBalancesInnerWithDefaults() *GetBalances200ResponseBalancesInner`

NewGetBalances200ResponseBalancesInnerWithDefaults instantiates a new GetBalances200ResponseBalancesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFundingType

`func (o *GetBalances200ResponseBalancesInner) GetFundingType() string`

GetFundingType returns the FundingType field if non-nil, zero value otherwise.

### GetFundingTypeOk

`func (o *GetBalances200ResponseBalancesInner) GetFundingTypeOk() (*string, bool)`

GetFundingTypeOk returns a tuple with the FundingType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFundingType

`func (o *GetBalances200ResponseBalancesInner) SetFundingType(v string)`

SetFundingType sets FundingType field to given value.


### GetCurrency

`func (o *GetBalances200ResponseBalancesInner) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *GetBalances200ResponseBalancesInner) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *GetBalances200ResponseBalancesInner) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetAvailableBalance

`func (o *GetBalances200ResponseBalancesInner) GetAvailableBalance() float32`

GetAvailableBalance returns the AvailableBalance field if non-nil, zero value otherwise.

### GetAvailableBalanceOk

`func (o *GetBalances200ResponseBalancesInner) GetAvailableBalanceOk() (*float32, bool)`

GetAvailableBalanceOk returns a tuple with the AvailableBalance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableBalance

`func (o *GetBalances200ResponseBalancesInner) SetAvailableBalance(v float32)`

SetAvailableBalance sets AvailableBalance field to given value.


### GetReservedBalance

`func (o *GetBalances200ResponseBalancesInner) GetReservedBalance() float32`

GetReservedBalance returns the ReservedBalance field if non-nil, zero value otherwise.

### GetReservedBalanceOk

`func (o *GetBalances200ResponseBalancesInner) GetReservedBalanceOk() (*float32, bool)`

GetReservedBalanceOk returns a tuple with the ReservedBalance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReservedBalance

`func (o *GetBalances200ResponseBalancesInner) SetReservedBalance(v float32)`

SetReservedBalance sets ReservedBalance field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


