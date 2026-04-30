# UsFedwire

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank. | 
**BankRoutingNumber** | **string** | 9-digit ABA Routing Transit Number (RTN) of the beneficiary’s bank. | 
**AccountNumber** | **string** | The identity&#39;s account number to be credited. | 

## Methods

### NewUsFedwire

`func NewUsFedwire(bankName string, bankRoutingNumber string, accountNumber string, ) *UsFedwire`

NewUsFedwire instantiates a new UsFedwire object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsFedwireWithDefaults

`func NewUsFedwireWithDefaults() *UsFedwire`

NewUsFedwireWithDefaults instantiates a new UsFedwire object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *UsFedwire) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *UsFedwire) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *UsFedwire) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankRoutingNumber

`func (o *UsFedwire) GetBankRoutingNumber() string`

GetBankRoutingNumber returns the BankRoutingNumber field if non-nil, zero value otherwise.

### GetBankRoutingNumberOk

`func (o *UsFedwire) GetBankRoutingNumberOk() (*string, bool)`

GetBankRoutingNumberOk returns a tuple with the BankRoutingNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankRoutingNumber

`func (o *UsFedwire) SetBankRoutingNumber(v string)`

SetBankRoutingNumber sets BankRoutingNumber field to given value.


### GetAccountNumber

`func (o *UsFedwire) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *UsFedwire) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *UsFedwire) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


