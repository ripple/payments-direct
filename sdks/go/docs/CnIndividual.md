# CnIndividual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | Beneficiary Bank Name in English. Published list available at docs.ripple.com. | 
**BankCode** | **string** | Beneficiary Bank Code. Published bank code list at docs.ripple.com. | 
**AccountNumber** | **string** | Beneficiary Account Number. | 

## Methods

### NewCnIndividual

`func NewCnIndividual(bankName string, bankCode string, accountNumber string, ) *CnIndividual`

NewCnIndividual instantiates a new CnIndividual object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCnIndividualWithDefaults

`func NewCnIndividualWithDefaults() *CnIndividual`

NewCnIndividualWithDefaults instantiates a new CnIndividual object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *CnIndividual) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *CnIndividual) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *CnIndividual) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *CnIndividual) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *CnIndividual) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *CnIndividual) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *CnIndividual) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *CnIndividual) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *CnIndividual) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


