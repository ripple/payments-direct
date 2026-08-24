# HkBankPayout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the beneficiary&#39;s bank | 
**AccountNumber** | **string** | Bank account number (BBAN) | 
**AccountHolderName** | **string** | Name of the account holder | 
**SwiftCode** | **string** | SWIFT/BIC code of the bank | 
**Currency** | Pointer to **string** | Currency code. Only HKD is supported for Hong Kong Bank Payout. | [optional] 

## Methods

### NewHkBankPayout

`func NewHkBankPayout(bankName string, accountNumber string, accountHolderName string, swiftCode string, ) *HkBankPayout`

NewHkBankPayout instantiates a new HkBankPayout object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHkBankPayoutWithDefaults

`func NewHkBankPayoutWithDefaults() *HkBankPayout`

NewHkBankPayoutWithDefaults instantiates a new HkBankPayout object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *HkBankPayout) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *HkBankPayout) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *HkBankPayout) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetAccountNumber

`func (o *HkBankPayout) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *HkBankPayout) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *HkBankPayout) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountHolderName

`func (o *HkBankPayout) GetAccountHolderName() string`

GetAccountHolderName returns the AccountHolderName field if non-nil, zero value otherwise.

### GetAccountHolderNameOk

`func (o *HkBankPayout) GetAccountHolderNameOk() (*string, bool)`

GetAccountHolderNameOk returns a tuple with the AccountHolderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountHolderName

`func (o *HkBankPayout) SetAccountHolderName(v string)`

SetAccountHolderName sets AccountHolderName field to given value.


### GetSwiftCode

`func (o *HkBankPayout) GetSwiftCode() string`

GetSwiftCode returns the SwiftCode field if non-nil, zero value otherwise.

### GetSwiftCodeOk

`func (o *HkBankPayout) GetSwiftCodeOk() (*string, bool)`

GetSwiftCodeOk returns a tuple with the SwiftCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSwiftCode

`func (o *HkBankPayout) SetSwiftCode(v string)`

SetSwiftCode sets SwiftCode field to given value.


### GetCurrency

`func (o *HkBankPayout) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *HkBankPayout) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *HkBankPayout) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *HkBankPayout) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


