# RippleFinancialInstrumentEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UsAch** | Pointer to [**UsAch**](UsAch.md) |  | [optional] 
**UsFedwire** | Pointer to [**UsFedwire**](UsFedwire.md) |  | [optional] 
**MxSpei** | Pointer to [**MxSpei**](MxSpei.md) |  | [optional] 
**EuSepa** | Pointer to [**EuSepa**](EuSepa.md) |  | [optional] 
**GbFps** | Pointer to [**GbFps**](GbFps.md) |  | [optional] 
**NgBankPayout** | Pointer to [**NgBankPayout**](NgBankPayout.md) |  | [optional] 
**GhBankPayout** | Pointer to [**GhBankPayout**](GhBankPayout.md) |  | [optional] 
**RwBankPayout** | Pointer to [**RwBankPayout**](RwBankPayout.md) |  | [optional] 
**ZaBankPayout** | Pointer to [**ZaBankPayout**](ZaBankPayout.md) |  | [optional] 
**UgBankPayout** | Pointer to [**UgBankPayout**](UgBankPayout.md) |  | [optional] 
**ZmBankPayout** | Pointer to [**ZmBankPayout**](ZmBankPayout.md) |  | [optional] 
**EthWallet** | Pointer to [**EthWallet**](EthWallet.md) |  | [optional] 
**TronWallet** | Pointer to [**TronWallet**](TronWallet.md) |  | [optional] 
**SolWallet** | Pointer to [**SolWallet**](SolWallet.md) |  | [optional] 
**BrPix** | Pointer to [**BrPix**](BrPix.md) |  | [optional] 
**CoPse** | Pointer to [**CoPse**](CoPse.md) |  | [optional] 
**BrTed** | Pointer to [**BrTed**](BrTed.md) |  | [optional] 
**CaEft** | Pointer to [**CaEft**](CaEft.md) |  | [optional] 
**HkBankPayout** | Pointer to [**HkBankPayout**](HkBankPayout.md) |  | [optional] 
**CnTrade** | Pointer to [**CnTrade**](CnTrade.md) |  | [optional] 
**CnIndividual** | Pointer to [**CnIndividual**](CnIndividual.md) |  | [optional] 
**CnIndividualTrade** | Pointer to [**CnIndividualTrade**](CnIndividualTrade.md) |  | [optional] 
**CnCfxps** | Pointer to [**CnCfxps**](CnCfxps.md) |  | [optional] 
**Currency** | **string** | The 3-letter ISO currency code of the financial instrument. | 
**Label** | Pointer to **string** | A user-defined label for the financial instrument. | [optional] 
**FinancialInstrumentType** | **string** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | 
**Country** | Pointer to **string** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. For crypto wallet instruments (ETH_WALLET, TRON_WALLET, SOL_WALLET), this field returns &#x60;ZZ&#x60;, the ISO 3166-1 user-assigned code used when no country jurisdiction applies.  | [optional] 
**FinancialInstrumentId** | Pointer to **string** | The unique identifier of the financial instrument. | [optional] 
**CreatedAt** | Pointer to **time.Time** | The time at which the financial instrument was created | [optional] 
**UpdatedAt** | Pointer to **time.Time** | The time at which the financial instrument was last updated | [optional] 

## Methods

### NewRippleFinancialInstrumentEntry

`func NewRippleFinancialInstrumentEntry(currency string, financialInstrumentType string, ) *RippleFinancialInstrumentEntry`

NewRippleFinancialInstrumentEntry instantiates a new RippleFinancialInstrumentEntry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRippleFinancialInstrumentEntryWithDefaults

`func NewRippleFinancialInstrumentEntryWithDefaults() *RippleFinancialInstrumentEntry`

NewRippleFinancialInstrumentEntryWithDefaults instantiates a new RippleFinancialInstrumentEntry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsAch

`func (o *RippleFinancialInstrumentEntry) GetUsAch() UsAch`

GetUsAch returns the UsAch field if non-nil, zero value otherwise.

### GetUsAchOk

`func (o *RippleFinancialInstrumentEntry) GetUsAchOk() (*UsAch, bool)`

GetUsAchOk returns a tuple with the UsAch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsAch

`func (o *RippleFinancialInstrumentEntry) SetUsAch(v UsAch)`

SetUsAch sets UsAch field to given value.

### HasUsAch

`func (o *RippleFinancialInstrumentEntry) HasUsAch() bool`

HasUsAch returns a boolean if a field has been set.

### GetUsFedwire

`func (o *RippleFinancialInstrumentEntry) GetUsFedwire() UsFedwire`

GetUsFedwire returns the UsFedwire field if non-nil, zero value otherwise.

### GetUsFedwireOk

`func (o *RippleFinancialInstrumentEntry) GetUsFedwireOk() (*UsFedwire, bool)`

GetUsFedwireOk returns a tuple with the UsFedwire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsFedwire

`func (o *RippleFinancialInstrumentEntry) SetUsFedwire(v UsFedwire)`

SetUsFedwire sets UsFedwire field to given value.

### HasUsFedwire

`func (o *RippleFinancialInstrumentEntry) HasUsFedwire() bool`

HasUsFedwire returns a boolean if a field has been set.

### GetMxSpei

`func (o *RippleFinancialInstrumentEntry) GetMxSpei() MxSpei`

GetMxSpei returns the MxSpei field if non-nil, zero value otherwise.

### GetMxSpeiOk

`func (o *RippleFinancialInstrumentEntry) GetMxSpeiOk() (*MxSpei, bool)`

GetMxSpeiOk returns a tuple with the MxSpei field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMxSpei

`func (o *RippleFinancialInstrumentEntry) SetMxSpei(v MxSpei)`

SetMxSpei sets MxSpei field to given value.

### HasMxSpei

`func (o *RippleFinancialInstrumentEntry) HasMxSpei() bool`

HasMxSpei returns a boolean if a field has been set.

### GetEuSepa

`func (o *RippleFinancialInstrumentEntry) GetEuSepa() EuSepa`

GetEuSepa returns the EuSepa field if non-nil, zero value otherwise.

### GetEuSepaOk

`func (o *RippleFinancialInstrumentEntry) GetEuSepaOk() (*EuSepa, bool)`

GetEuSepaOk returns a tuple with the EuSepa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEuSepa

`func (o *RippleFinancialInstrumentEntry) SetEuSepa(v EuSepa)`

SetEuSepa sets EuSepa field to given value.

### HasEuSepa

`func (o *RippleFinancialInstrumentEntry) HasEuSepa() bool`

HasEuSepa returns a boolean if a field has been set.

### GetGbFps

`func (o *RippleFinancialInstrumentEntry) GetGbFps() GbFps`

GetGbFps returns the GbFps field if non-nil, zero value otherwise.

### GetGbFpsOk

`func (o *RippleFinancialInstrumentEntry) GetGbFpsOk() (*GbFps, bool)`

GetGbFpsOk returns a tuple with the GbFps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGbFps

`func (o *RippleFinancialInstrumentEntry) SetGbFps(v GbFps)`

SetGbFps sets GbFps field to given value.

### HasGbFps

`func (o *RippleFinancialInstrumentEntry) HasGbFps() bool`

HasGbFps returns a boolean if a field has been set.

### GetNgBankPayout

`func (o *RippleFinancialInstrumentEntry) GetNgBankPayout() NgBankPayout`

GetNgBankPayout returns the NgBankPayout field if non-nil, zero value otherwise.

### GetNgBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetNgBankPayoutOk() (*NgBankPayout, bool)`

GetNgBankPayoutOk returns a tuple with the NgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNgBankPayout

`func (o *RippleFinancialInstrumentEntry) SetNgBankPayout(v NgBankPayout)`

SetNgBankPayout sets NgBankPayout field to given value.

### HasNgBankPayout

`func (o *RippleFinancialInstrumentEntry) HasNgBankPayout() bool`

HasNgBankPayout returns a boolean if a field has been set.

### GetGhBankPayout

`func (o *RippleFinancialInstrumentEntry) GetGhBankPayout() GhBankPayout`

GetGhBankPayout returns the GhBankPayout field if non-nil, zero value otherwise.

### GetGhBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetGhBankPayoutOk() (*GhBankPayout, bool)`

GetGhBankPayoutOk returns a tuple with the GhBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGhBankPayout

`func (o *RippleFinancialInstrumentEntry) SetGhBankPayout(v GhBankPayout)`

SetGhBankPayout sets GhBankPayout field to given value.

### HasGhBankPayout

`func (o *RippleFinancialInstrumentEntry) HasGhBankPayout() bool`

HasGhBankPayout returns a boolean if a field has been set.

### GetRwBankPayout

`func (o *RippleFinancialInstrumentEntry) GetRwBankPayout() RwBankPayout`

GetRwBankPayout returns the RwBankPayout field if non-nil, zero value otherwise.

### GetRwBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetRwBankPayoutOk() (*RwBankPayout, bool)`

GetRwBankPayoutOk returns a tuple with the RwBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwBankPayout

`func (o *RippleFinancialInstrumentEntry) SetRwBankPayout(v RwBankPayout)`

SetRwBankPayout sets RwBankPayout field to given value.

### HasRwBankPayout

`func (o *RippleFinancialInstrumentEntry) HasRwBankPayout() bool`

HasRwBankPayout returns a boolean if a field has been set.

### GetZaBankPayout

`func (o *RippleFinancialInstrumentEntry) GetZaBankPayout() ZaBankPayout`

GetZaBankPayout returns the ZaBankPayout field if non-nil, zero value otherwise.

### GetZaBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetZaBankPayoutOk() (*ZaBankPayout, bool)`

GetZaBankPayoutOk returns a tuple with the ZaBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZaBankPayout

`func (o *RippleFinancialInstrumentEntry) SetZaBankPayout(v ZaBankPayout)`

SetZaBankPayout sets ZaBankPayout field to given value.

### HasZaBankPayout

`func (o *RippleFinancialInstrumentEntry) HasZaBankPayout() bool`

HasZaBankPayout returns a boolean if a field has been set.

### GetUgBankPayout

`func (o *RippleFinancialInstrumentEntry) GetUgBankPayout() UgBankPayout`

GetUgBankPayout returns the UgBankPayout field if non-nil, zero value otherwise.

### GetUgBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetUgBankPayoutOk() (*UgBankPayout, bool)`

GetUgBankPayoutOk returns a tuple with the UgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUgBankPayout

`func (o *RippleFinancialInstrumentEntry) SetUgBankPayout(v UgBankPayout)`

SetUgBankPayout sets UgBankPayout field to given value.

### HasUgBankPayout

`func (o *RippleFinancialInstrumentEntry) HasUgBankPayout() bool`

HasUgBankPayout returns a boolean if a field has been set.

### GetZmBankPayout

`func (o *RippleFinancialInstrumentEntry) GetZmBankPayout() ZmBankPayout`

GetZmBankPayout returns the ZmBankPayout field if non-nil, zero value otherwise.

### GetZmBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetZmBankPayoutOk() (*ZmBankPayout, bool)`

GetZmBankPayoutOk returns a tuple with the ZmBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZmBankPayout

`func (o *RippleFinancialInstrumentEntry) SetZmBankPayout(v ZmBankPayout)`

SetZmBankPayout sets ZmBankPayout field to given value.

### HasZmBankPayout

`func (o *RippleFinancialInstrumentEntry) HasZmBankPayout() bool`

HasZmBankPayout returns a boolean if a field has been set.

### GetEthWallet

`func (o *RippleFinancialInstrumentEntry) GetEthWallet() EthWallet`

GetEthWallet returns the EthWallet field if non-nil, zero value otherwise.

### GetEthWalletOk

`func (o *RippleFinancialInstrumentEntry) GetEthWalletOk() (*EthWallet, bool)`

GetEthWalletOk returns a tuple with the EthWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthWallet

`func (o *RippleFinancialInstrumentEntry) SetEthWallet(v EthWallet)`

SetEthWallet sets EthWallet field to given value.

### HasEthWallet

`func (o *RippleFinancialInstrumentEntry) HasEthWallet() bool`

HasEthWallet returns a boolean if a field has been set.

### GetTronWallet

`func (o *RippleFinancialInstrumentEntry) GetTronWallet() TronWallet`

GetTronWallet returns the TronWallet field if non-nil, zero value otherwise.

### GetTronWalletOk

`func (o *RippleFinancialInstrumentEntry) GetTronWalletOk() (*TronWallet, bool)`

GetTronWalletOk returns a tuple with the TronWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTronWallet

`func (o *RippleFinancialInstrumentEntry) SetTronWallet(v TronWallet)`

SetTronWallet sets TronWallet field to given value.

### HasTronWallet

`func (o *RippleFinancialInstrumentEntry) HasTronWallet() bool`

HasTronWallet returns a boolean if a field has been set.

### GetSolWallet

`func (o *RippleFinancialInstrumentEntry) GetSolWallet() SolWallet`

GetSolWallet returns the SolWallet field if non-nil, zero value otherwise.

### GetSolWalletOk

`func (o *RippleFinancialInstrumentEntry) GetSolWalletOk() (*SolWallet, bool)`

GetSolWalletOk returns a tuple with the SolWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSolWallet

`func (o *RippleFinancialInstrumentEntry) SetSolWallet(v SolWallet)`

SetSolWallet sets SolWallet field to given value.

### HasSolWallet

`func (o *RippleFinancialInstrumentEntry) HasSolWallet() bool`

HasSolWallet returns a boolean if a field has been set.

### GetBrPix

`func (o *RippleFinancialInstrumentEntry) GetBrPix() BrPix`

GetBrPix returns the BrPix field if non-nil, zero value otherwise.

### GetBrPixOk

`func (o *RippleFinancialInstrumentEntry) GetBrPixOk() (*BrPix, bool)`

GetBrPixOk returns a tuple with the BrPix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrPix

`func (o *RippleFinancialInstrumentEntry) SetBrPix(v BrPix)`

SetBrPix sets BrPix field to given value.

### HasBrPix

`func (o *RippleFinancialInstrumentEntry) HasBrPix() bool`

HasBrPix returns a boolean if a field has been set.

### GetCoPse

`func (o *RippleFinancialInstrumentEntry) GetCoPse() CoPse`

GetCoPse returns the CoPse field if non-nil, zero value otherwise.

### GetCoPseOk

`func (o *RippleFinancialInstrumentEntry) GetCoPseOk() (*CoPse, bool)`

GetCoPseOk returns a tuple with the CoPse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoPse

`func (o *RippleFinancialInstrumentEntry) SetCoPse(v CoPse)`

SetCoPse sets CoPse field to given value.

### HasCoPse

`func (o *RippleFinancialInstrumentEntry) HasCoPse() bool`

HasCoPse returns a boolean if a field has been set.

### GetBrTed

`func (o *RippleFinancialInstrumentEntry) GetBrTed() BrTed`

GetBrTed returns the BrTed field if non-nil, zero value otherwise.

### GetBrTedOk

`func (o *RippleFinancialInstrumentEntry) GetBrTedOk() (*BrTed, bool)`

GetBrTedOk returns a tuple with the BrTed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrTed

`func (o *RippleFinancialInstrumentEntry) SetBrTed(v BrTed)`

SetBrTed sets BrTed field to given value.

### HasBrTed

`func (o *RippleFinancialInstrumentEntry) HasBrTed() bool`

HasBrTed returns a boolean if a field has been set.

### GetCaEft

`func (o *RippleFinancialInstrumentEntry) GetCaEft() CaEft`

GetCaEft returns the CaEft field if non-nil, zero value otherwise.

### GetCaEftOk

`func (o *RippleFinancialInstrumentEntry) GetCaEftOk() (*CaEft, bool)`

GetCaEftOk returns a tuple with the CaEft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaEft

`func (o *RippleFinancialInstrumentEntry) SetCaEft(v CaEft)`

SetCaEft sets CaEft field to given value.

### HasCaEft

`func (o *RippleFinancialInstrumentEntry) HasCaEft() bool`

HasCaEft returns a boolean if a field has been set.

### GetHkBankPayout

`func (o *RippleFinancialInstrumentEntry) GetHkBankPayout() HkBankPayout`

GetHkBankPayout returns the HkBankPayout field if non-nil, zero value otherwise.

### GetHkBankPayoutOk

`func (o *RippleFinancialInstrumentEntry) GetHkBankPayoutOk() (*HkBankPayout, bool)`

GetHkBankPayoutOk returns a tuple with the HkBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHkBankPayout

`func (o *RippleFinancialInstrumentEntry) SetHkBankPayout(v HkBankPayout)`

SetHkBankPayout sets HkBankPayout field to given value.

### HasHkBankPayout

`func (o *RippleFinancialInstrumentEntry) HasHkBankPayout() bool`

HasHkBankPayout returns a boolean if a field has been set.

### GetCnTrade

`func (o *RippleFinancialInstrumentEntry) GetCnTrade() CnTrade`

GetCnTrade returns the CnTrade field if non-nil, zero value otherwise.

### GetCnTradeOk

`func (o *RippleFinancialInstrumentEntry) GetCnTradeOk() (*CnTrade, bool)`

GetCnTradeOk returns a tuple with the CnTrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnTrade

`func (o *RippleFinancialInstrumentEntry) SetCnTrade(v CnTrade)`

SetCnTrade sets CnTrade field to given value.

### HasCnTrade

`func (o *RippleFinancialInstrumentEntry) HasCnTrade() bool`

HasCnTrade returns a boolean if a field has been set.

### GetCnIndividual

`func (o *RippleFinancialInstrumentEntry) GetCnIndividual() CnIndividual`

GetCnIndividual returns the CnIndividual field if non-nil, zero value otherwise.

### GetCnIndividualOk

`func (o *RippleFinancialInstrumentEntry) GetCnIndividualOk() (*CnIndividual, bool)`

GetCnIndividualOk returns a tuple with the CnIndividual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnIndividual

`func (o *RippleFinancialInstrumentEntry) SetCnIndividual(v CnIndividual)`

SetCnIndividual sets CnIndividual field to given value.

### HasCnIndividual

`func (o *RippleFinancialInstrumentEntry) HasCnIndividual() bool`

HasCnIndividual returns a boolean if a field has been set.

### GetCnIndividualTrade

`func (o *RippleFinancialInstrumentEntry) GetCnIndividualTrade() CnIndividualTrade`

GetCnIndividualTrade returns the CnIndividualTrade field if non-nil, zero value otherwise.

### GetCnIndividualTradeOk

`func (o *RippleFinancialInstrumentEntry) GetCnIndividualTradeOk() (*CnIndividualTrade, bool)`

GetCnIndividualTradeOk returns a tuple with the CnIndividualTrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnIndividualTrade

`func (o *RippleFinancialInstrumentEntry) SetCnIndividualTrade(v CnIndividualTrade)`

SetCnIndividualTrade sets CnIndividualTrade field to given value.

### HasCnIndividualTrade

`func (o *RippleFinancialInstrumentEntry) HasCnIndividualTrade() bool`

HasCnIndividualTrade returns a boolean if a field has been set.

### GetCnCfxps

`func (o *RippleFinancialInstrumentEntry) GetCnCfxps() CnCfxps`

GetCnCfxps returns the CnCfxps field if non-nil, zero value otherwise.

### GetCnCfxpsOk

`func (o *RippleFinancialInstrumentEntry) GetCnCfxpsOk() (*CnCfxps, bool)`

GetCnCfxpsOk returns a tuple with the CnCfxps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnCfxps

`func (o *RippleFinancialInstrumentEntry) SetCnCfxps(v CnCfxps)`

SetCnCfxps sets CnCfxps field to given value.

### HasCnCfxps

`func (o *RippleFinancialInstrumentEntry) HasCnCfxps() bool`

HasCnCfxps returns a boolean if a field has been set.

### GetCurrency

`func (o *RippleFinancialInstrumentEntry) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *RippleFinancialInstrumentEntry) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *RippleFinancialInstrumentEntry) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetLabel

`func (o *RippleFinancialInstrumentEntry) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *RippleFinancialInstrumentEntry) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *RippleFinancialInstrumentEntry) SetLabel(v string)`

SetLabel sets Label field to given value.

### HasLabel

`func (o *RippleFinancialInstrumentEntry) HasLabel() bool`

HasLabel returns a boolean if a field has been set.

### GetFinancialInstrumentType

`func (o *RippleFinancialInstrumentEntry) GetFinancialInstrumentType() string`

GetFinancialInstrumentType returns the FinancialInstrumentType field if non-nil, zero value otherwise.

### GetFinancialInstrumentTypeOk

`func (o *RippleFinancialInstrumentEntry) GetFinancialInstrumentTypeOk() (*string, bool)`

GetFinancialInstrumentTypeOk returns a tuple with the FinancialInstrumentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinancialInstrumentType

`func (o *RippleFinancialInstrumentEntry) SetFinancialInstrumentType(v string)`

SetFinancialInstrumentType sets FinancialInstrumentType field to given value.


### GetCountry

`func (o *RippleFinancialInstrumentEntry) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *RippleFinancialInstrumentEntry) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *RippleFinancialInstrumentEntry) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *RippleFinancialInstrumentEntry) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetFinancialInstrumentId

`func (o *RippleFinancialInstrumentEntry) GetFinancialInstrumentId() string`

GetFinancialInstrumentId returns the FinancialInstrumentId field if non-nil, zero value otherwise.

### GetFinancialInstrumentIdOk

`func (o *RippleFinancialInstrumentEntry) GetFinancialInstrumentIdOk() (*string, bool)`

GetFinancialInstrumentIdOk returns a tuple with the FinancialInstrumentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinancialInstrumentId

`func (o *RippleFinancialInstrumentEntry) SetFinancialInstrumentId(v string)`

SetFinancialInstrumentId sets FinancialInstrumentId field to given value.

### HasFinancialInstrumentId

`func (o *RippleFinancialInstrumentEntry) HasFinancialInstrumentId() bool`

HasFinancialInstrumentId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *RippleFinancialInstrumentEntry) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *RippleFinancialInstrumentEntry) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *RippleFinancialInstrumentEntry) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *RippleFinancialInstrumentEntry) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *RippleFinancialInstrumentEntry) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *RippleFinancialInstrumentEntry) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *RippleFinancialInstrumentEntry) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *RippleFinancialInstrumentEntry) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


