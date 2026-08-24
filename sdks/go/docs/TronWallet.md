# TronWallet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WalletAddress** | **string** | Receiving wallet address at the exchange | 
**CryptoInstitutionName** | **string** | Name of the crypto exchange | 
**Network** | Pointer to **string** | The default name of the blockchain network for this instrument | [optional] [readonly] [default to "TRON"]
**SupportedCorridors** | Pointer to **[]string** | The list of supported corridors for the payout method | [optional] [readonly] 

## Methods

### NewTronWallet

`func NewTronWallet(walletAddress string, cryptoInstitutionName string, ) *TronWallet`

NewTronWallet instantiates a new TronWallet object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTronWalletWithDefaults

`func NewTronWalletWithDefaults() *TronWallet`

NewTronWalletWithDefaults instantiates a new TronWallet object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWalletAddress

`func (o *TronWallet) GetWalletAddress() string`

GetWalletAddress returns the WalletAddress field if non-nil, zero value otherwise.

### GetWalletAddressOk

`func (o *TronWallet) GetWalletAddressOk() (*string, bool)`

GetWalletAddressOk returns a tuple with the WalletAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletAddress

`func (o *TronWallet) SetWalletAddress(v string)`

SetWalletAddress sets WalletAddress field to given value.


### GetCryptoInstitutionName

`func (o *TronWallet) GetCryptoInstitutionName() string`

GetCryptoInstitutionName returns the CryptoInstitutionName field if non-nil, zero value otherwise.

### GetCryptoInstitutionNameOk

`func (o *TronWallet) GetCryptoInstitutionNameOk() (*string, bool)`

GetCryptoInstitutionNameOk returns a tuple with the CryptoInstitutionName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptoInstitutionName

`func (o *TronWallet) SetCryptoInstitutionName(v string)`

SetCryptoInstitutionName sets CryptoInstitutionName field to given value.


### GetNetwork

`func (o *TronWallet) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *TronWallet) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *TronWallet) SetNetwork(v string)`

SetNetwork sets Network field to given value.

### HasNetwork

`func (o *TronWallet) HasNetwork() bool`

HasNetwork returns a boolean if a field has been set.

### GetSupportedCorridors

`func (o *TronWallet) GetSupportedCorridors() []string`

GetSupportedCorridors returns the SupportedCorridors field if non-nil, zero value otherwise.

### GetSupportedCorridorsOk

`func (o *TronWallet) GetSupportedCorridorsOk() (*[]string, bool)`

GetSupportedCorridorsOk returns a tuple with the SupportedCorridors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportedCorridors

`func (o *TronWallet) SetSupportedCorridors(v []string)`

SetSupportedCorridors sets SupportedCorridors field to given value.

### HasSupportedCorridors

`func (o *TronWallet) HasSupportedCorridors() bool`

HasSupportedCorridors returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


