# AeIpi

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**Iban** | **string** | The International Bank Account Number (IBAN) of the identity&#39;s account | 

## Methods

### NewAeIpi

`func NewAeIpi(bankName string, iban string, ) *AeIpi`

NewAeIpi instantiates a new AeIpi object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAeIpiWithDefaults

`func NewAeIpiWithDefaults() *AeIpi`

NewAeIpiWithDefaults instantiates a new AeIpi object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *AeIpi) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *AeIpi) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *AeIpi) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetIban

`func (o *AeIpi) GetIban() string`

GetIban returns the Iban field if non-nil, zero value otherwise.

### GetIbanOk

`func (o *AeIpi) GetIbanOk() (*string, bool)`

GetIbanOk returns a tuple with the Iban field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIban

`func (o *AeIpi) SetIban(v string)`

SetIban sets Iban field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


