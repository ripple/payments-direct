# ThPromptpay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | Domestic bank code for the identity&#39;s bank in Thailand. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 

## Methods

### NewThPromptpay

`func NewThPromptpay(bankName string, bankCode string, accountNumber string, ) *ThPromptpay`

NewThPromptpay instantiates a new ThPromptpay object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewThPromptpayWithDefaults

`func NewThPromptpayWithDefaults() *ThPromptpay`

NewThPromptpayWithDefaults instantiates a new ThPromptpay object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *ThPromptpay) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *ThPromptpay) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *ThPromptpay) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *ThPromptpay) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *ThPromptpay) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *ThPromptpay) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *ThPromptpay) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *ThPromptpay) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *ThPromptpay) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


