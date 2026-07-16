# ArInterbanking

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank. Must begin and end with a letter or digit, and consecutive identical punctuation characters are not permitted. | 
**BankCode** | **string** | BCRA-assigned 3-digit Argentine bank code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**AccountNumber** | **string** | The identity&#39;s account number (CBU or CVU) | 
**AccountType** | **string** | The identity&#39;s account type | 

## Methods

### NewArInterbanking

`func NewArInterbanking(bankName string, bankCode string, accountNumber string, accountType string, ) *ArInterbanking`

NewArInterbanking instantiates a new ArInterbanking object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewArInterbankingWithDefaults

`func NewArInterbankingWithDefaults() *ArInterbanking`

NewArInterbankingWithDefaults instantiates a new ArInterbanking object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *ArInterbanking) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *ArInterbanking) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *ArInterbanking) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *ArInterbanking) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *ArInterbanking) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *ArInterbanking) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *ArInterbanking) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *ArInterbanking) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *ArInterbanking) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountType

`func (o *ArInterbanking) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *ArInterbanking) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *ArInterbanking) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


