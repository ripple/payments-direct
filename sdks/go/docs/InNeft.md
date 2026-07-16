# InNeft

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**IfscCode** | **string** | The 11-character IFSC code of the identity&#39;s bank branch | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 

## Methods

### NewInNeft

`func NewInNeft(bankName string, ifscCode string, accountNumber string, ) *InNeft`

NewInNeft instantiates a new InNeft object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInNeftWithDefaults

`func NewInNeftWithDefaults() *InNeft`

NewInNeftWithDefaults instantiates a new InNeft object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *InNeft) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *InNeft) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *InNeft) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetIfscCode

`func (o *InNeft) GetIfscCode() string`

GetIfscCode returns the IfscCode field if non-nil, zero value otherwise.

### GetIfscCodeOk

`func (o *InNeft) GetIfscCodeOk() (*string, bool)`

GetIfscCodeOk returns a tuple with the IfscCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIfscCode

`func (o *InNeft) SetIfscCode(v string)`

SetIfscCode sets IfscCode field to given value.


### GetAccountNumber

`func (o *InNeft) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *InNeft) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *InNeft) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


