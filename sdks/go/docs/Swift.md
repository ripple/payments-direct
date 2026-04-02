# Swift

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**SwiftCode** | **string** | The SWIFT/BIC code of the identity&#39;s bank | 
**AccountHolderName** | **string** | The name of the account holder | 
**AccountNumber** | **string** | The account number of the identity&#39;s bank account | 

## Methods

### NewSwift

`func NewSwift(bankName string, swiftCode string, accountHolderName string, accountNumber string, ) *Swift`

NewSwift instantiates a new Swift object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSwiftWithDefaults

`func NewSwiftWithDefaults() *Swift`

NewSwiftWithDefaults instantiates a new Swift object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *Swift) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *Swift) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *Swift) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetSwiftCode

`func (o *Swift) GetSwiftCode() string`

GetSwiftCode returns the SwiftCode field if non-nil, zero value otherwise.

### GetSwiftCodeOk

`func (o *Swift) GetSwiftCodeOk() (*string, bool)`

GetSwiftCodeOk returns a tuple with the SwiftCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSwiftCode

`func (o *Swift) SetSwiftCode(v string)`

SetSwiftCode sets SwiftCode field to given value.


### GetAccountHolderName

`func (o *Swift) GetAccountHolderName() string`

GetAccountHolderName returns the AccountHolderName field if non-nil, zero value otherwise.

### GetAccountHolderNameOk

`func (o *Swift) GetAccountHolderNameOk() (*string, bool)`

GetAccountHolderNameOk returns a tuple with the AccountHolderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountHolderName

`func (o *Swift) SetAccountHolderName(v string)`

SetAccountHolderName sets AccountHolderName field to given value.


### GetAccountNumber

`func (o *Swift) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *Swift) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *Swift) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


