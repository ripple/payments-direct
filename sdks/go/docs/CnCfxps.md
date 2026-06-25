# CnCfxps

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | Beneficiary Bank Name. Looked up from swiftCode. | 
**SwiftCode** | **string** | Beneficiary Bank SWIFT/BIC Code. ~67 proprietary SWIFT codes (e.g., ICBKCNBJXXX, BKCHCNBJXXX, CMBCCNBSXXX). | 
**AccountNumber** | **string** | Beneficiary Account Number. | 
**AccountHolderName** | **string** | Beneficiary Account Holder Name (English). | 

## Methods

### NewCnCfxps

`func NewCnCfxps(bankName string, swiftCode string, accountNumber string, accountHolderName string, ) *CnCfxps`

NewCnCfxps instantiates a new CnCfxps object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCnCfxpsWithDefaults

`func NewCnCfxpsWithDefaults() *CnCfxps`

NewCnCfxpsWithDefaults instantiates a new CnCfxps object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *CnCfxps) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *CnCfxps) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *CnCfxps) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetSwiftCode

`func (o *CnCfxps) GetSwiftCode() string`

GetSwiftCode returns the SwiftCode field if non-nil, zero value otherwise.

### GetSwiftCodeOk

`func (o *CnCfxps) GetSwiftCodeOk() (*string, bool)`

GetSwiftCodeOk returns a tuple with the SwiftCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSwiftCode

`func (o *CnCfxps) SetSwiftCode(v string)`

SetSwiftCode sets SwiftCode field to given value.


### GetAccountNumber

`func (o *CnCfxps) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *CnCfxps) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *CnCfxps) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountHolderName

`func (o *CnCfxps) GetAccountHolderName() string`

GetAccountHolderName returns the AccountHolderName field if non-nil, zero value otherwise.

### GetAccountHolderNameOk

`func (o *CnCfxps) GetAccountHolderNameOk() (*string, bool)`

GetAccountHolderNameOk returns a tuple with the AccountHolderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountHolderName

`func (o *CnCfxps) SetAccountHolderName(v string)`

SetAccountHolderName sets AccountHolderName field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


