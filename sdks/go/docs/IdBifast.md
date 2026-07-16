# IdBifast

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | Bank Indonesia-assigned domestic clearing code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 

## Methods

### NewIdBifast

`func NewIdBifast(bankName string, bankCode string, accountNumber string, ) *IdBifast`

NewIdBifast instantiates a new IdBifast object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIdBifastWithDefaults

`func NewIdBifastWithDefaults() *IdBifast`

NewIdBifastWithDefaults instantiates a new IdBifast object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *IdBifast) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *IdBifast) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *IdBifast) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *IdBifast) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *IdBifast) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *IdBifast) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *IdBifast) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *IdBifast) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *IdBifast) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


