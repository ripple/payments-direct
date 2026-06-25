# CnTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | Beneficiary Bank Name. Looked up from bankCode. | 
**BankCode** | **string** | Ripple Bank Code for the destination bank. Use the Ripple Bank Codes lookup at docs.ripple.com to find the correct code. | 
**BranchName** | **string** | Beneficiary Branch Name (Hanzi). Branch name in Chinese Hanzi characters. | 
**BranchProvince** | **string** | Beneficiary Bank Branch Province. Province/region codes — 34 values published on Docs (e.g., 110000&#x3D;北京, 310000&#x3D;上海). | 
**BranchCity** | **string** | Beneficiary Bank Branch City. City codes — 700+ values published on Docs (e.g., 110000&#x3D;北京, 130100&#x3D;石家庄). | 
**AccountNumber** | **string** | Beneficiary Account Number. | 
**AccountHolderName** | **string** | Beneficiary Account Holder Name (Hanzi). Account name in Chinese Hanzi characters. | 

## Methods

### NewCnTrade

`func NewCnTrade(bankName string, bankCode string, branchName string, branchProvince string, branchCity string, accountNumber string, accountHolderName string, ) *CnTrade`

NewCnTrade instantiates a new CnTrade object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCnTradeWithDefaults

`func NewCnTradeWithDefaults() *CnTrade`

NewCnTradeWithDefaults instantiates a new CnTrade object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *CnTrade) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *CnTrade) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *CnTrade) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *CnTrade) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *CnTrade) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *CnTrade) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetBranchName

`func (o *CnTrade) GetBranchName() string`

GetBranchName returns the BranchName field if non-nil, zero value otherwise.

### GetBranchNameOk

`func (o *CnTrade) GetBranchNameOk() (*string, bool)`

GetBranchNameOk returns a tuple with the BranchName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchName

`func (o *CnTrade) SetBranchName(v string)`

SetBranchName sets BranchName field to given value.


### GetBranchProvince

`func (o *CnTrade) GetBranchProvince() string`

GetBranchProvince returns the BranchProvince field if non-nil, zero value otherwise.

### GetBranchProvinceOk

`func (o *CnTrade) GetBranchProvinceOk() (*string, bool)`

GetBranchProvinceOk returns a tuple with the BranchProvince field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchProvince

`func (o *CnTrade) SetBranchProvince(v string)`

SetBranchProvince sets BranchProvince field to given value.


### GetBranchCity

`func (o *CnTrade) GetBranchCity() string`

GetBranchCity returns the BranchCity field if non-nil, zero value otherwise.

### GetBranchCityOk

`func (o *CnTrade) GetBranchCityOk() (*string, bool)`

GetBranchCityOk returns a tuple with the BranchCity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchCity

`func (o *CnTrade) SetBranchCity(v string)`

SetBranchCity sets BranchCity field to given value.


### GetAccountNumber

`func (o *CnTrade) GetAccountNumber() string`

GetAccountNumber returns the AccountNumber field if non-nil, zero value otherwise.

### GetAccountNumberOk

`func (o *CnTrade) GetAccountNumberOk() (*string, bool)`

GetAccountNumberOk returns a tuple with the AccountNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountNumber

`func (o *CnTrade) SetAccountNumber(v string)`

SetAccountNumber sets AccountNumber field to given value.


### GetAccountHolderName

`func (o *CnTrade) GetAccountHolderName() string`

GetAccountHolderName returns the AccountHolderName field if non-nil, zero value otherwise.

### GetAccountHolderNameOk

`func (o *CnTrade) GetAccountHolderNameOk() (*string, bool)`

GetAccountHolderNameOk returns a tuple with the AccountHolderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountHolderName

`func (o *CnTrade) SetAccountHolderName(v string)`

SetAccountHolderName sets AccountHolderName field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


