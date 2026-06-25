# SolWallet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WalletAddress** | **string** | Receiving wallet address at the exchange | 
**CryptoInstitutionName** | **string** | Name of the crypto exchange | 
**Network** | Pointer to **string** | The default name of the blockchain network for this instrument | [optional] [readonly] [default to "SOLANA"]
**SupportedCorridors** | Pointer to **[]string** | The list of supported corridors for the payout method | [optional] [readonly] 

## Methods

### NewSolWallet

`func NewSolWallet(walletAddress string, cryptoInstitutionName string, ) *SolWallet`

NewSolWallet instantiates a new SolWallet object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSolWalletWithDefaults

`func NewSolWalletWithDefaults() *SolWallet`

NewSolWalletWithDefaults instantiates a new SolWallet object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWalletAddress

`func (o *SolWallet) GetWalletAddress() string`

GetWalletAddress returns the WalletAddress field if non-nil, zero value otherwise.

### GetWalletAddressOk

`func (o *SolWallet) GetWalletAddressOk() (*string, bool)`

GetWalletAddressOk returns a tuple with the WalletAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletAddress

`func (o *SolWallet) SetWalletAddress(v string)`

SetWalletAddress sets WalletAddress field to given value.


### GetCryptoInstitutionName

`func (o *SolWallet) GetCryptoInstitutionName() string`

GetCryptoInstitutionName returns the CryptoInstitutionName field if non-nil, zero value otherwise.

### GetCryptoInstitutionNameOk

`func (o *SolWallet) GetCryptoInstitutionNameOk() (*string, bool)`

GetCryptoInstitutionNameOk returns a tuple with the CryptoInstitutionName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptoInstitutionName

`func (o *SolWallet) SetCryptoInstitutionName(v string)`

SetCryptoInstitutionName sets CryptoInstitutionName field to given value.


### GetNetwork

`func (o *SolWallet) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *SolWallet) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *SolWallet) SetNetwork(v string)`

SetNetwork sets Network field to given value.

### HasNetwork

`func (o *SolWallet) HasNetwork() bool`

HasNetwork returns a boolean if a field has been set.

### GetSupportedCorridors

`func (o *SolWallet) GetSupportedCorridors() []string`

GetSupportedCorridors returns the SupportedCorridors field if non-nil, zero value otherwise.

### GetSupportedCorridorsOk

`func (o *SolWallet) GetSupportedCorridorsOk() (*[]string, bool)`

GetSupportedCorridorsOk returns a tuple with the SupportedCorridors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportedCorridors

`func (o *SolWallet) SetSupportedCorridors(v []string)`

SetSupportedCorridors sets SupportedCorridors field to given value.

### HasSupportedCorridors

`func (o *SolWallet) HasSupportedCorridors() bool`

HasSupportedCorridors returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


