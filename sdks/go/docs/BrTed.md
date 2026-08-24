# BrTed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | The code of the identity&#39;s bank (BICFI code) | 
**BranchNumber** | **string** | The branch number of the identity&#39;s bank account | 
**AccountNumber** | **string** | The identity&#39;s account number associated with the Account Identification Scheme | 
**AccountType** | **string** | The identity&#39;s account type (Savings, Checking etc.) | 

## Methods

### NewBrTed

`func NewBrTed(bankName string, bankCode string, branchNumber string, accountNumber string, accountType string, ) *BrTed`

NewBrTed instantiates a new BrTed object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBrTedWithDefaults

`func NewBrTedWithDefaults() *BrTed`

NewBrTedWithDefaults instantiates a new BrTed object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *BrTed) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *BrTed) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *BrTed) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *BrTed) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *BrTed) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *BrTed) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetBranchNumber

`func (o *BrTed) GetBranchNumber() string`

GetBranchNumber returns the BranchNumber field if non-nil, zero value otherwise.

### GetBranchNumberOk

`func (o *BrTed) GetBranchNumberOk() (*string, bool)`

GetBranchNumberOk returns a tuple with the BranchNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchNumber

`func (o *BrTed) SetBranchNumber(v string)`

SetBranchNumber sets BranchNumber field to given value.


### GetAccountNumber

`func (o *BrTed) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *BrTed) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *BrTed) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountType

`func (o *BrTed) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *BrTed) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *BrTed) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


