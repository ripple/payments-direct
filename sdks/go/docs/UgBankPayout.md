# UgBankPayout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | The bank code of the identity&#39;s bank | 
**AccountNumber** | **string** | The identity&#39;s account number associated with the Account Identification Scheme | 

## Methods

### NewUgBankPayout

`func NewUgBankPayout(bankName string, bankCode string, accountNumber string, ) *UgBankPayout`

NewUgBankPayout instantiates a new UgBankPayout object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUgBankPayoutWithDefaults

`func NewUgBankPayoutWithDefaults() *UgBankPayout`

NewUgBankPayoutWithDefaults instantiates a new UgBankPayout object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *UgBankPayout) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *UgBankPayout) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *UgBankPayout) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *UgBankPayout) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *UgBankPayout) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *UgBankPayout) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *UgBankPayout) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *UgBankPayout) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *UgBankPayout) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


