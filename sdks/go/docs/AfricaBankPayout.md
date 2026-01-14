# AfricaBankPayout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | The bank code of the identity&#39;s bank | 
**AccountNumber** | **string** | The identity&#39;s account number associated with the Account Identification Scheme | 
**Country** | **string** | The country of the identity’s bank, using the Alpha-2 code as defined in ISO 3166-1.   Allowed values are:  - &#x60;GH&#x60;   - &#x60;NG&#x60;   - &#x60;RW&#x60;   - &#x60;UG&#x60;   - &#x60;ZA&#x60;   - &#x60;ZM&#x60;  | 

## Methods

### NewAfricaBankPayout

`func NewAfricaBankPayout(bankName string, bankCode string, accountNumber string, country string, ) *AfricaBankPayout`

NewAfricaBankPayout instantiates a new AfricaBankPayout object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAfricaBankPayoutWithDefaults

`func NewAfricaBankPayoutWithDefaults() *AfricaBankPayout`

NewAfricaBankPayoutWithDefaults instantiates a new AfricaBankPayout object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *AfricaBankPayout) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *AfricaBankPayout) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *AfricaBankPayout) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *AfricaBankPayout) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *AfricaBankPayout) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *AfricaBankPayout) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetAccountNumber

`func (o *AfricaBankPayout) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *AfricaBankPayout) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *AfricaBankPayout) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetCountry

`func (o *AfricaBankPayout) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AfricaBankPayout) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AfricaBankPayout) SetCountry(v string)`

SetCountry sets Country field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


