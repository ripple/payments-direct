# KrKftc

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | KFTC-assigned Korean domestic clearing code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 

## Methods

### NewKrKftc

`func NewKrKftc(bankName string, bankCode string, accountNumber string, ) *KrKftc`

NewKrKftc instantiates a new KrKftc object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKrKftcWithDefaults

`func NewKrKftcWithDefaults() *KrKftc`

NewKrKftcWithDefaults instantiates a new KrKftc object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *KrKftc) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *KrKftc) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *KrKftc) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *KrKftc) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *KrKftc) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *KrKftc) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *KrKftc) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *KrKftc) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *KrKftc) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


