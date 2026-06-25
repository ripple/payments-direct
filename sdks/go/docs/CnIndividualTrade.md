# CnIndividualTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | Beneficiary Bank Name. | 
**AccountNumber** | **string** | Beneficiary Account Number. | 
**AccountHolderName** | **string** | Beneficiary Account Holder Name (Hanzi). Account name in Chinese Hanzi characters. For sole proprietors, bank account may be registered under business name. | 

## Methods

### NewCnIndividualTrade

`func NewCnIndividualTrade(bankName string, accountNumber string, accountHolderName string, ) *CnIndividualTrade`

NewCnIndividualTrade instantiates a new CnIndividualTrade object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCnIndividualTradeWithDefaults

`func NewCnIndividualTradeWithDefaults() *CnIndividualTrade`

NewCnIndividualTradeWithDefaults instantiates a new CnIndividualTrade object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *CnIndividualTrade) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *CnIndividualTrade) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *CnIndividualTrade) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetAccountNumber

`func (o *CnIndividualTrade) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *CnIndividualTrade) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *CnIndividualTrade) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountHolderName

`func (o *CnIndividualTrade) GetAccountHolderName() string`

GetAccountHolderName returns the AccountHolderName field if non-nil, zero value otherwise.

### GetAccountHolderNameOk

`func (o *CnIndividualTrade) GetAccountHolderNameOk() (*string, bool)`

GetAccountHolderNameOk returns a tuple with the AccountHolderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountHolderName

`func (o *CnIndividualTrade) SetAccountHolderName(v string)`

SetAccountHolderName sets AccountHolderName field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


