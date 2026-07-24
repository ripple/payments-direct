# JpZengin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**AccountHolderName** | **string** | Name of the account holder in Japanese Katakana characters | 
**BankCode** | **string** | Zengin-Net/BOJ-assigned 4-digit Japanese bank code (e.g. 0001 Mizuho Bank, 0005 MUFG Bank). See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**BranchCode** | **string** | Bank-assigned branch code identifying the specific branch | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 
**AccountType** | **string** | The identity&#39;s account type | 

## Methods

### NewJpZengin

`func NewJpZengin(bankName string, accountHolderName string, bankCode string, branchCode string, accountNumber string, accountType string, ) *JpZengin`

NewJpZengin instantiates a new JpZengin object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewJpZenginWithDefaults

`func NewJpZenginWithDefaults() *JpZengin`

NewJpZenginWithDefaults instantiates a new JpZengin object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *JpZengin) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *JpZengin) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *JpZengin) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetAccountHolderName

`func (o *JpZengin) GetAccountHolderName() string`

GetAccountHolderName returns the AccountHolderName field if non-nil, zero value otherwise.

### GetAccountHolderNameOk

`func (o *JpZengin) GetAccountHolderNameOk() (*string, bool)`

GetAccountHolderNameOk returns a tuple with the AccountHolderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountHolderName

`func (o *JpZengin) SetAccountHolderName(v string)`

SetAccountHolderName sets AccountHolderName field to given value.


### GetBankCode

`func (o *JpZengin) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *JpZengin) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *JpZengin) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetBranchCode

`func (o *JpZengin) GetBranchCode() string`

GetBranchCode returns the BranchCode field if non-nil, zero value otherwise.

### GetBranchCodeOk

`func (o *JpZengin) GetBranchCodeOk() (*string, bool)`

GetBranchCodeOk returns a tuple with the BranchCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchCode

`func (o *JpZengin) SetBranchCode(v string)`

SetBranchCode sets BranchCode field to given value.


### GetAccountNumber

`func (o *JpZengin) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *JpZengin) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *JpZengin) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountType

`func (o *JpZengin) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *JpZengin) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *JpZengin) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


