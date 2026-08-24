# TrFast

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**Iban** | **string** | Turkey IBAN (26 characters, starting with TR) | 
**BankCode** | **string** | SWIFT/BIC code of the identity&#39;s bank. Named bankCode for v2 ADR compatibility; maps to BICFI in ISO 20022. | 

## Methods

### NewTrFast

`func NewTrFast(bankName string, iban string, bankCode string, ) *TrFast`

NewTrFast instantiates a new TrFast object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrFastWithDefaults

`func NewTrFastWithDefaults() *TrFast`

NewTrFastWithDefaults instantiates a new TrFast object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *TrFast) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *TrFast) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *TrFast) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetIban

`func (o *TrFast) GetIban() string`

GetIban returns the Iban field if non-nil, zero value otherwise.

### GetIbanOk

`func (o *TrFast) GetIbanOk() (*string, bool)`

GetIbanOk returns a tuple with the Iban field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIban

`func (o *TrFast) SetIban(v string)`

SetIban sets Iban field to given value.


### GetBankCode

`func (o *TrFast) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *TrFast) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *TrFast) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


