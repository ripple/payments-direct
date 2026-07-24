# AuNpp

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BsbCode** | **string** | The 6-digit Bank-State-Branch (BSB) routing code | 
**AccountNumber** | **string** | The identity&#39;s bank account number | 

## Methods

### NewAuNpp

`func NewAuNpp(bankName string, bsbCode string, accountNumber string, ) *AuNpp`

NewAuNpp instantiates a new AuNpp object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuNppWithDefaults

`func NewAuNppWithDefaults() *AuNpp`

NewAuNppWithDefaults instantiates a new AuNpp object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *AuNpp) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *AuNpp) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *AuNpp) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBsbCode

`func (o *AuNpp) GetBsbCode() string`

GetBsbCode returns the BsbCode field if non-nil, zero value otherwise.

### GetBsbCodeOk

`func (o *AuNpp) GetBsbCodeOk() (*string, bool)`

GetBsbCodeOk returns a tuple with the BsbCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsbCode

`func (o *AuNpp) SetBsbCode(v string)`

SetBsbCode sets BsbCode field to given value.


### GetAccountNumber

`func (o *AuNpp) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *AuNpp) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *AuNpp) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


