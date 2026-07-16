# PhNrps

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**SwiftCode** | **string** | The SWIFT/BIC code of the beneficiary bank. Constrained to the SWIFT/BIC code list published on Ripple Docs. | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 

## Methods

### NewPhNrps

`func NewPhNrps(bankName string, swiftCode string, accountNumber string, ) *PhNrps`

NewPhNrps instantiates a new PhNrps object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPhNrpsWithDefaults

`func NewPhNrpsWithDefaults() *PhNrps`

NewPhNrpsWithDefaults instantiates a new PhNrps object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *PhNrps) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *PhNrps) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *PhNrps) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetSwiftCode

`func (o *PhNrps) GetSwiftCode() string`

GetSwiftCode returns the SwiftCode field if non-nil, zero value otherwise.

### GetSwiftCodeOk

`func (o *PhNrps) GetSwiftCodeOk() (*string, bool)`

GetSwiftCodeOk returns a tuple with the SwiftCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSwiftCode

`func (o *PhNrps) SetSwiftCode(v string)`

SetSwiftCode sets SwiftCode field to given value.


### GetAccountNumber

`func (o *PhNrps) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *PhNrps) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *PhNrps) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


