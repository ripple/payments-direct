# BrPix

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankName** | **string** | The name of the identity&#39;s bank | 
**BankCode** | **string** | The code of the identity&#39;s bank (BICFI code) | 
**BranchNumber** | **string** | The identity&#39;s bank branch number | 
**PixKey** | **string** | The identity&#39;s PIX key, which can be an email, phone number, or a hash | 
**PixKeyType** | **string** | The type of PIX key used by the identity.  - &#x60;CPF&#x60;   - &#x60;CNPJ&#x60;   - &#x60;EMAIL&#x60;   - &#x60;PHONE&#x60;   - &#x60;EVP&#x60;  | 

## Methods

### NewBrPix

`func NewBrPix(bankName string, bankCode string, branchNumber string, pixKey string, pixKeyType string, ) *BrPix`

NewBrPix instantiates a new BrPix object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBrPixWithDefaults

`func NewBrPixWithDefaults() *BrPix`

NewBrPixWithDefaults instantiates a new BrPix object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankName

`func (o *BrPix) GetBankName() string`

GetBankName returns the BankName field if non-nil, zero value otherwise.

### GetBankNameOk

`func (o *BrPix) GetBankNameOk() (*string, bool)`

GetBankNameOk returns a tuple with the BankName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankName

`func (o *BrPix) SetBankName(v string)`

SetBankName sets BankName field to given value.


### GetBankCode

`func (o *BrPix) GetBankCode() string`

GetBankCode returns the BankCode field if non-nil, zero value otherwise.

### GetBankCodeOk

`func (o *BrPix) GetBankCodeOk() (*string, bool)`

GetBankCodeOk returns a tuple with the BankCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankCode

`func (o *BrPix) SetBankCode(v string)`

SetBankCode sets BankCode field to given value.


### GetBranchNumber

`func (o *BrPix) GetBranchNumber() string`

GetBranchNumber returns the BranchNumber field if non-nil, zero value otherwise.

### GetBranchNumberOk

`func (o *BrPix) GetBranchNumberOk() (*string, bool)`

GetBranchNumberOk returns a tuple with the BranchNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchNumber

`func (o *BrPix) SetBranchNumber(v string)`

SetBranchNumber sets BranchNumber field to given value.


### GetPixKey

`func (o *BrPix) GetPixKey() string`

GetPixKey returns the PixKey field if non-nil, zero value otherwise.

### GetPixKeyOk

`func (o *BrPix) GetPixKeyOk() (*string, bool)`

GetPixKeyOk returns a tuple with the PixKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPixKey

`func (o *BrPix) SetPixKey(v string)`

SetPixKey sets PixKey field to given value.


### GetPixKeyType

`func (o *BrPix) GetPixKeyType() string`

GetPixKeyType returns the PixKeyType field if non-nil, zero value otherwise.

### GetPixKeyTypeOk

`func (o *BrPix) GetPixKeyTypeOk() (*string, bool)`

GetPixKeyTypeOk returns a tuple with the PixKeyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPixKeyType

`func (o *BrPix) SetPixKeyType(v string)`

SetPixKeyType sets PixKeyType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


