# PeLbtr

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**SwiftCode** | **string** | SWIFT/BIC code of the identity&#39;s bank | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 
**AccountType** | **string** | The identity&#39;s account type | 

## Methods

### NewPeLbtr

`func NewPeLbtr(bankName string, swiftCode string, accountNumber string, accountType string, ) *PeLbtr`

NewPeLbtr instantiates a new PeLbtr object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPeLbtrWithDefaults

`func NewPeLbtrWithDefaults() *PeLbtr`

NewPeLbtrWithDefaults instantiates a new PeLbtr object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *PeLbtr) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *PeLbtr) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *PeLbtr) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetSwiftCode

`func (o *PeLbtr) GetSwiftCode() string`

GetSwiftCode returns the SwiftCode field if non-nil, zero value otherwise.

### GetSwiftCodeOk

`func (o *PeLbtr) GetSwiftCodeOk() (*string, bool)`

GetSwiftCodeOk returns a tuple with the SwiftCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSwiftCode

`func (o *PeLbtr) SetSwiftCode(v string)`

SetSwiftCode sets SwiftCode field to given value.


### GetAccountNumber

`func (o *PeLbtr) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *PeLbtr) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *PeLbtr) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountType

`func (o *PeLbtr) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *PeLbtr) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *PeLbtr) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


