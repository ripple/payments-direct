# CaEft

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**InstitutionNumber** | **string** | The institution number of the identity&#39;s bank | 
**TransitNumber** | **string** | The transit number of the identity&#39;s bank account | 
**AccountNumber** | **string** | The identity&#39;s account number associated with the Account Identification Scheme | 
**AccountType** | **string** | The identity’s account type.  - &#x60;CHECKING&#x60; — Checking account   - &#x60;SAVINGS&#x60; — Savings account  | 

## Methods

### NewCaEft

`func NewCaEft(bankName string, institutionNumber string, transitNumber string, accountNumber string, accountType string, ) *CaEft`

NewCaEft instantiates a new CaEft object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCaEftWithDefaults

`func NewCaEftWithDefaults() *CaEft`

NewCaEftWithDefaults instantiates a new CaEft object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *CaEft) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *CaEft) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *CaEft) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetInstitutionNumber

`func (o *CaEft) GetInstitutionNumber() string`

GetInstitutionNumber returns the InstitutionNumber field if non-nil, zero value otherwise.

### GetInstitutionNumberOk

`func (o *CaEft) GetInstitutionNumberOk() (*string, bool)`

GetInstitutionNumberOk returns a tuple with the InstitutionNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitutionNumber

`func (o *CaEft) SetInstitutionNumber(v string)`

SetInstitutionNumber sets InstitutionNumber field to given value.


### GetTransitNumber

`func (o *CaEft) GetTransitNumber() string`

GetTransitNumber returns the TransitNumber field if non-nil, zero value otherwise.

### GetTransitNumberOk

`func (o *CaEft) GetTransitNumberOk() (*string, bool)`

GetTransitNumberOk returns a tuple with the TransitNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransitNumber

`func (o *CaEft) SetTransitNumber(v string)`

SetTransitNumber sets TransitNumber field to given value.


### GetAccountNumber

`func (o *CaEft) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *CaEft) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *CaEft) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountType

`func (o *CaEft) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *CaEft) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *CaEft) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


