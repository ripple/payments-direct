# UsAch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankRoutingNumber** | **string** | The identity&#39;s bank routing number | 
**AccountNumber** | **string** | The identity&#39;s account number into which the funds must be credited | 
**AccountType** | **string** | The identity’s account type. | 

## Methods

### NewUsAch

`func NewUsAch(bankName string, bankRoutingNumber string, accountNumber string, accountType string, ) *UsAch`

NewUsAch instantiates a new UsAch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsAchWithDefaults

`func NewUsAchWithDefaults() *UsAch`

NewUsAchWithDefaults instantiates a new UsAch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *UsAch) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *UsAch) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *UsAch) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankRoutingNumber

`func (o *UsAch) GetBankRoutingNumber() string`

GetBankRoutingNumber returns the BankRoutingNumber field if non-nil, zero value otherwise.

### GetBankRoutingNumberOk

`func (o *UsAch) GetBankRoutingNumberOk() (*string, bool)`

GetBankRoutingNumberOk returns a tuple with the BankRoutingNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankRoutingNumber

`func (o *UsAch) SetBankRoutingNumber(v string)`

SetBankRoutingNumber sets BankRoutingNumber field to given value.


### GetAccountNumber

`func (o *UsAch) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *UsAch) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *UsAch) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountType

`func (o *UsAch) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *UsAch) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *UsAch) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


