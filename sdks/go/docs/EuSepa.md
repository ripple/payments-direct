# EuSepa

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**Iban** | **string** | The International Bank Account Number (IBAN) of the identity&#39;s account | 

## Methods

### NewEuSepa

`func NewEuSepa(bankName string, iban string, ) *EuSepa`

NewEuSepa instantiates a new EuSepa object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEuSepaWithDefaults

`func NewEuSepaWithDefaults() *EuSepa`

NewEuSepaWithDefaults instantiates a new EuSepa object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *EuSepa) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *EuSepa) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *EuSepa) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetIban

`func (o *EuSepa) GetIban() string`

GetIban returns the Iban field if non-nil, zero value otherwise.

### GetIbanOk

`func (o *EuSepa) GetIbanOk() (*string, bool)`

GetIbanOk returns a tuple with the Iban field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIban

`func (o *EuSepa) SetIban(v string)`

SetIban sets Iban field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


