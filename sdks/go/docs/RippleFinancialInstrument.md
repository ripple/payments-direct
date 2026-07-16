# RippleFinancialInstrument

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
**IdBifast** | Pointer to [**IdBifast**](IdBifast.md) |  | [optional] 
**KrKftc** | Pointer to [**KrKftc**](KrKftc.md) |  | [optional] 
**InNeft** | Pointer to [**InNeft**](InNeft.md) |  | [optional] 
**PeLbtr** | Pointer to [**PeLbtr**](PeLbtr.md) |  | [optional] 
**CnTrade** | Pointer to [**CnTrade**](CnTrade.md) |  | [optional] 
**CnIndividual** | Pointer to [**CnIndividual**](CnIndividual.md) |  | [optional] 
**CnIndividualTrade** | Pointer to [**CnIndividualTrade**](CnIndividualTrade.md) |  | [optional] 
**CnCfxps** | Pointer to [**CnCfxps**](CnCfxps.md) |  | [optional] 
**ClTef** | Pointer to [**ClTef**](ClTef.md) |  | [optional] 
**AeIpi** | Pointer to [**AeIpi**](AeIpi.md) |  | [optional] 
**TrFast** | Pointer to [**TrFast**](TrFast.md) |  | [optional] 
**PhNrps** | Pointer to [**PhNrps**](PhNrps.md) |  | [optional] 
**ThPromptpay** | Pointer to [**ThPromptpay**](ThPromptpay.md) |  | [optional] 
**ArInterbanking** | Pointer to [**ArInterbanking**](ArInterbanking.md) |  | [optional] 
**Currency** | **string** | The 3-letter ISO currency code of the financial instrument. | 
**Label** | Pointer to **string** | A user-defined label for the financial instrument. | [optional] 
**FinancialInstrumentType** | **string** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | 

## Methods

### NewRippleFinancialInstrument

`func NewRippleFinancialInstrument(currency string, financialInstrumentType string, ) *RippleFinancialInstrument`

NewRippleFinancialInstrument instantiates a new RippleFinancialInstrument object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRippleFinancialInstrumentWithDefaults

`func NewRippleFinancialInstrumentWithDefaults() *RippleFinancialInstrument`

NewRippleFinancialInstrumentWithDefaults instantiates a new RippleFinancialInstrument object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsAch

`func (o *RippleFinancialInstrument) GetUsAch() UsAch`

GetUsAch returns the UsAch field if non-nil, zero value otherwise.

### GetUsAchOk

`func (o *RippleFinancialInstrument) GetUsAchOk() (*UsAch, bool)`

GetUsAchOk returns a tuple with the UsAch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsAch

`func (o *RippleFinancialInstrument) SetUsAch(v UsAch)`

SetUsAch sets UsAch field to given value.

### HasUsAch

`func (o *RippleFinancialInstrument) HasUsAch() bool`

HasUsAch returns a boolean if a field has been set.

### GetUsFedwire

`func (o *RippleFinancialInstrument) GetUsFedwire() UsFedwire`

GetUsFedwire returns the UsFedwire field if non-nil, zero value otherwise.

### GetUsFedwireOk

`func (o *RippleFinancialInstrument) GetUsFedwireOk() (*UsFedwire, bool)`

GetUsFedwireOk returns a tuple with the UsFedwire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsFedwire

`func (o *RippleFinancialInstrument) SetUsFedwire(v UsFedwire)`

SetUsFedwire sets UsFedwire field to given value.

### HasUsFedwire

`func (o *RippleFinancialInstrument) HasUsFedwire() bool`

HasUsFedwire returns a boolean if a field has been set.

### GetMxSpei

`func (o *RippleFinancialInstrument) GetMxSpei() MxSpei`

GetMxSpei returns the MxSpei field if non-nil, zero value otherwise.

### GetMxSpeiOk

`func (o *RippleFinancialInstrument) GetMxSpeiOk() (*MxSpei, bool)`

GetMxSpeiOk returns a tuple with the MxSpei field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMxSpei

`func (o *RippleFinancialInstrument) SetMxSpei(v MxSpei)`

SetMxSpei sets MxSpei field to given value.

### HasMxSpei

`func (o *RippleFinancialInstrument) HasMxSpei() bool`

HasMxSpei returns a boolean if a field has been set.

### GetEuSepa

`func (o *RippleFinancialInstrument) GetEuSepa() EuSepa`

GetEuSepa returns the EuSepa field if non-nil, zero value otherwise.

### GetEuSepaOk

`func (o *RippleFinancialInstrument) GetEuSepaOk() (*EuSepa, bool)`

GetEuSepaOk returns a tuple with the EuSepa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEuSepa

`func (o *RippleFinancialInstrument) SetEuSepa(v EuSepa)`

SetEuSepa sets EuSepa field to given value.

### HasEuSepa

`func (o *RippleFinancialInstrument) HasEuSepa() bool`

HasEuSepa returns a boolean if a field has been set.

### GetGbFps

`func (o *RippleFinancialInstrument) GetGbFps() GbFps`

GetGbFps returns the GbFps field if non-nil, zero value otherwise.

### GetGbFpsOk

`func (o *RippleFinancialInstrument) GetGbFpsOk() (*GbFps, bool)`

GetGbFpsOk returns a tuple with the GbFps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGbFps

`func (o *RippleFinancialInstrument) SetGbFps(v GbFps)`

SetGbFps sets GbFps field to given value.

### HasGbFps

`func (o *RippleFinancialInstrument) HasGbFps() bool`

HasGbFps returns a boolean if a field has been set.

### GetNgBankPayout

`func (o *RippleFinancialInstrument) GetNgBankPayout() NgBankPayout`

GetNgBankPayout returns the NgBankPayout field if non-nil, zero value otherwise.

### GetNgBankPayoutOk

`func (o *RippleFinancialInstrument) GetNgBankPayoutOk() (*NgBankPayout, bool)`

GetNgBankPayoutOk returns a tuple with the NgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNgBankPayout

`func (o *RippleFinancialInstrument) SetNgBankPayout(v NgBankPayout)`

SetNgBankPayout sets NgBankPayout field to given value.

### HasNgBankPayout

`func (o *RippleFinancialInstrument) HasNgBankPayout() bool`

HasNgBankPayout returns a boolean if a field has been set.

### GetGhBankPayout

`func (o *RippleFinancialInstrument) GetGhBankPayout() GhBankPayout`

GetGhBankPayout returns the GhBankPayout field if non-nil, zero value otherwise.

### GetGhBankPayoutOk

`func (o *RippleFinancialInstrument) GetGhBankPayoutOk() (*GhBankPayout, bool)`

GetGhBankPayoutOk returns a tuple with the GhBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGhBankPayout

`func (o *RippleFinancialInstrument) SetGhBankPayout(v GhBankPayout)`

SetGhBankPayout sets GhBankPayout field to given value.

### HasGhBankPayout

`func (o *RippleFinancialInstrument) HasGhBankPayout() bool`

HasGhBankPayout returns a boolean if a field has been set.

### GetRwBankPayout

`func (o *RippleFinancialInstrument) GetRwBankPayout() RwBankPayout`

GetRwBankPayout returns the RwBankPayout field if non-nil, zero value otherwise.

### GetRwBankPayoutOk

`func (o *RippleFinancialInstrument) GetRwBankPayoutOk() (*RwBankPayout, bool)`

GetRwBankPayoutOk returns a tuple with the RwBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwBankPayout

`func (o *RippleFinancialInstrument) SetRwBankPayout(v RwBankPayout)`

SetRwBankPayout sets RwBankPayout field to given value.

### HasRwBankPayout

`func (o *RippleFinancialInstrument) HasRwBankPayout() bool`

HasRwBankPayout returns a boolean if a field has been set.

### GetZaBankPayout

`func (o *RippleFinancialInstrument) GetZaBankPayout() ZaBankPayout`

GetZaBankPayout returns the ZaBankPayout field if non-nil, zero value otherwise.

### GetZaBankPayoutOk

`func (o *RippleFinancialInstrument) GetZaBankPayoutOk() (*ZaBankPayout, bool)`

GetZaBankPayoutOk returns a tuple with the ZaBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZaBankPayout

`func (o *RippleFinancialInstrument) SetZaBankPayout(v ZaBankPayout)`

SetZaBankPayout sets ZaBankPayout field to given value.

### HasZaBankPayout

`func (o *RippleFinancialInstrument) HasZaBankPayout() bool`

HasZaBankPayout returns a boolean if a field has been set.

### GetUgBankPayout

`func (o *RippleFinancialInstrument) GetUgBankPayout() UgBankPayout`

GetUgBankPayout returns the UgBankPayout field if non-nil, zero value otherwise.

### GetUgBankPayoutOk

`func (o *RippleFinancialInstrument) GetUgBankPayoutOk() (*UgBankPayout, bool)`

GetUgBankPayoutOk returns a tuple with the UgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUgBankPayout

`func (o *RippleFinancialInstrument) SetUgBankPayout(v UgBankPayout)`

SetUgBankPayout sets UgBankPayout field to given value.

### HasUgBankPayout

`func (o *RippleFinancialInstrument) HasUgBankPayout() bool`

HasUgBankPayout returns a boolean if a field has been set.

### GetZmBankPayout

`func (o *RippleFinancialInstrument) GetZmBankPayout() ZmBankPayout`

GetZmBankPayout returns the ZmBankPayout field if non-nil, zero value otherwise.

### GetZmBankPayoutOk

`func (o *RippleFinancialInstrument) GetZmBankPayoutOk() (*ZmBankPayout, bool)`

GetZmBankPayoutOk returns a tuple with the ZmBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZmBankPayout

`func (o *RippleFinancialInstrument) SetZmBankPayout(v ZmBankPayout)`

SetZmBankPayout sets ZmBankPayout field to given value.

### HasZmBankPayout

`func (o *RippleFinancialInstrument) HasZmBankPayout() bool`

HasZmBankPayout returns a boolean if a field has been set.

### GetEthWallet

`func (o *RippleFinancialInstrument) GetEthWallet() EthWallet`

GetEthWallet returns the EthWallet field if non-nil, zero value otherwise.

### GetEthWalletOk

`func (o *RippleFinancialInstrument) GetEthWalletOk() (*EthWallet, bool)`

GetEthWalletOk returns a tuple with the EthWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthWallet

`func (o *RippleFinancialInstrument) SetEthWallet(v EthWallet)`

SetEthWallet sets EthWallet field to given value.

### HasEthWallet

`func (o *RippleFinancialInstrument) HasEthWallet() bool`

HasEthWallet returns a boolean if a field has been set.

### GetTronWallet

`func (o *RippleFinancialInstrument) GetTronWallet() TronWallet`

GetTronWallet returns the TronWallet field if non-nil, zero value otherwise.

### GetTronWalletOk

`func (o *RippleFinancialInstrument) GetTronWalletOk() (*TronWallet, bool)`

GetTronWalletOk returns a tuple with the TronWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTronWallet

`func (o *RippleFinancialInstrument) SetTronWallet(v TronWallet)`

SetTronWallet sets TronWallet field to given value.

### HasTronWallet

`func (o *RippleFinancialInstrument) HasTronWallet() bool`

HasTronWallet returns a boolean if a field has been set.

### GetSolWallet

`func (o *RippleFinancialInstrument) GetSolWallet() SolWallet`

GetSolWallet returns the SolWallet field if non-nil, zero value otherwise.

### GetSolWalletOk

`func (o *RippleFinancialInstrument) GetSolWalletOk() (*SolWallet, bool)`

GetSolWalletOk returns a tuple with the SolWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSolWallet

`func (o *RippleFinancialInstrument) SetSolWallet(v SolWallet)`

SetSolWallet sets SolWallet field to given value.

### HasSolWallet

`func (o *RippleFinancialInstrument) HasSolWallet() bool`

HasSolWallet returns a boolean if a field has been set.

### GetBrPix

`func (o *RippleFinancialInstrument) GetBrPix() BrPix`

GetBrPix returns the BrPix field if non-nil, zero value otherwise.

### GetBrPixOk

`func (o *RippleFinancialInstrument) GetBrPixOk() (*BrPix, bool)`

GetBrPixOk returns a tuple with the BrPix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrPix

`func (o *RippleFinancialInstrument) SetBrPix(v BrPix)`

SetBrPix sets BrPix field to given value.

### HasBrPix

`func (o *RippleFinancialInstrument) HasBrPix() bool`

HasBrPix returns a boolean if a field has been set.

### GetCoPse

`func (o *RippleFinancialInstrument) GetCoPse() CoPse`

GetCoPse returns the CoPse field if non-nil, zero value otherwise.

### GetCoPseOk

`func (o *RippleFinancialInstrument) GetCoPseOk() (*CoPse, bool)`

GetCoPseOk returns a tuple with the CoPse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoPse

`func (o *RippleFinancialInstrument) SetCoPse(v CoPse)`

SetCoPse sets CoPse field to given value.

### HasCoPse

`func (o *RippleFinancialInstrument) HasCoPse() bool`

HasCoPse returns a boolean if a field has been set.

### GetBrTed

`func (o *RippleFinancialInstrument) GetBrTed() BrTed`

GetBrTed returns the BrTed field if non-nil, zero value otherwise.

### GetBrTedOk

`func (o *RippleFinancialInstrument) GetBrTedOk() (*BrTed, bool)`

GetBrTedOk returns a tuple with the BrTed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrTed

`func (o *RippleFinancialInstrument) SetBrTed(v BrTed)`

SetBrTed sets BrTed field to given value.

### HasBrTed

`func (o *RippleFinancialInstrument) HasBrTed() bool`

HasBrTed returns a boolean if a field has been set.

### GetCaEft

`func (o *RippleFinancialInstrument) GetCaEft() CaEft`

GetCaEft returns the CaEft field if non-nil, zero value otherwise.

### GetCaEftOk

`func (o *RippleFinancialInstrument) GetCaEftOk() (*CaEft, bool)`

GetCaEftOk returns a tuple with the CaEft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaEft

`func (o *RippleFinancialInstrument) SetCaEft(v CaEft)`

SetCaEft sets CaEft field to given value.

### HasCaEft

`func (o *RippleFinancialInstrument) HasCaEft() bool`

HasCaEft returns a boolean if a field has been set.

### GetHkBankPayout

`func (o *RippleFinancialInstrument) GetHkBankPayout() HkBankPayout`

GetHkBankPayout returns the HkBankPayout field if non-nil, zero value otherwise.

### GetHkBankPayoutOk

`func (o *RippleFinancialInstrument) GetHkBankPayoutOk() (*HkBankPayout, bool)`

GetHkBankPayoutOk returns a tuple with the HkBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHkBankPayout

`func (o *RippleFinancialInstrument) SetHkBankPayout(v HkBankPayout)`

SetHkBankPayout sets HkBankPayout field to given value.

### HasHkBankPayout

`func (o *RippleFinancialInstrument) HasHkBankPayout() bool`

HasHkBankPayout returns a boolean if a field has been set.

### GetIdBifast

`func (o *RippleFinancialInstrument) GetIdBifast() IdBifast`

GetIdBifast returns the IdBifast field if non-nil, zero value otherwise.

### GetIdBifastOk

`func (o *RippleFinancialInstrument) GetIdBifastOk() (*IdBifast, bool)`

GetIdBifastOk returns a tuple with the IdBifast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdBifast

`func (o *RippleFinancialInstrument) SetIdBifast(v IdBifast)`

SetIdBifast sets IdBifast field to given value.

### HasIdBifast

`func (o *RippleFinancialInstrument) HasIdBifast() bool`

HasIdBifast returns a boolean if a field has been set.

### GetKrKftc

`func (o *RippleFinancialInstrument) GetKrKftc() KrKftc`

GetKrKftc returns the KrKftc field if non-nil, zero value otherwise.

### GetKrKftcOk

`func (o *RippleFinancialInstrument) GetKrKftcOk() (*KrKftc, bool)`

GetKrKftcOk returns a tuple with the KrKftc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKrKftc

`func (o *RippleFinancialInstrument) SetKrKftc(v KrKftc)`

SetKrKftc sets KrKftc field to given value.

### HasKrKftc

`func (o *RippleFinancialInstrument) HasKrKftc() bool`

HasKrKftc returns a boolean if a field has been set.

### GetInNeft

`func (o *RippleFinancialInstrument) GetInNeft() InNeft`

GetInNeft returns the InNeft field if non-nil, zero value otherwise.

### GetInNeftOk

`func (o *RippleFinancialInstrument) GetInNeftOk() (*InNeft, bool)`

GetInNeftOk returns a tuple with the InNeft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInNeft

`func (o *RippleFinancialInstrument) SetInNeft(v InNeft)`

SetInNeft sets InNeft field to given value.

### HasInNeft

`func (o *RippleFinancialInstrument) HasInNeft() bool`

HasInNeft returns a boolean if a field has been set.

### GetPeLbtr

`func (o *RippleFinancialInstrument) GetPeLbtr() PeLbtr`

GetPeLbtr returns the PeLbtr field if non-nil, zero value otherwise.

### GetPeLbtrOk

`func (o *RippleFinancialInstrument) GetPeLbtrOk() (*PeLbtr, bool)`

GetPeLbtrOk returns a tuple with the PeLbtr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeLbtr

`func (o *RippleFinancialInstrument) SetPeLbtr(v PeLbtr)`

SetPeLbtr sets PeLbtr field to given value.

### HasPeLbtr

`func (o *RippleFinancialInstrument) HasPeLbtr() bool`

HasPeLbtr returns a boolean if a field has been set.

### GetCnTrade

`func (o *RippleFinancialInstrument) GetCnTrade() CnTrade`

GetCnTrade returns the CnTrade field if non-nil, zero value otherwise.

### GetCnTradeOk

`func (o *RippleFinancialInstrument) GetCnTradeOk() (*CnTrade, bool)`

GetCnTradeOk returns a tuple with the CnTrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnTrade

`func (o *RippleFinancialInstrument) SetCnTrade(v CnTrade)`

SetCnTrade sets CnTrade field to given value.

### HasCnTrade

`func (o *RippleFinancialInstrument) HasCnTrade() bool`

HasCnTrade returns a boolean if a field has been set.

### GetCnIndividual

`func (o *RippleFinancialInstrument) GetCnIndividual() CnIndividual`

GetCnIndividual returns the CnIndividual field if non-nil, zero value otherwise.

### GetCnIndividualOk

`func (o *RippleFinancialInstrument) GetCnIndividualOk() (*CnIndividual, bool)`

GetCnIndividualOk returns a tuple with the CnIndividual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnIndividual

`func (o *RippleFinancialInstrument) SetCnIndividual(v CnIndividual)`

SetCnIndividual sets CnIndividual field to given value.

### HasCnIndividual

`func (o *RippleFinancialInstrument) HasCnIndividual() bool`

HasCnIndividual returns a boolean if a field has been set.

### GetCnIndividualTrade

`func (o *RippleFinancialInstrument) GetCnIndividualTrade() CnIndividualTrade`

GetCnIndividualTrade returns the CnIndividualTrade field if non-nil, zero value otherwise.

### GetCnIndividualTradeOk

`func (o *RippleFinancialInstrument) GetCnIndividualTradeOk() (*CnIndividualTrade, bool)`

GetCnIndividualTradeOk returns a tuple with the CnIndividualTrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnIndividualTrade

`func (o *RippleFinancialInstrument) SetCnIndividualTrade(v CnIndividualTrade)`

SetCnIndividualTrade sets CnIndividualTrade field to given value.

### HasCnIndividualTrade

`func (o *RippleFinancialInstrument) HasCnIndividualTrade() bool`

HasCnIndividualTrade returns a boolean if a field has been set.

### GetCnCfxps

`func (o *RippleFinancialInstrument) GetCnCfxps() CnCfxps`

GetCnCfxps returns the CnCfxps field if non-nil, zero value otherwise.

### GetCnCfxpsOk

`func (o *RippleFinancialInstrument) GetCnCfxpsOk() (*CnCfxps, bool)`

GetCnCfxpsOk returns a tuple with the CnCfxps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnCfxps

`func (o *RippleFinancialInstrument) SetCnCfxps(v CnCfxps)`

SetCnCfxps sets CnCfxps field to given value.

### HasCnCfxps

`func (o *RippleFinancialInstrument) HasCnCfxps() bool`

HasCnCfxps returns a boolean if a field has been set.

### GetClTef

`func (o *RippleFinancialInstrument) GetClTef() ClTef`

GetClTef returns the ClTef field if non-nil, zero value otherwise.

### GetClTefOk

`func (o *RippleFinancialInstrument) GetClTefOk() (*ClTef, bool)`

GetClTefOk returns a tuple with the ClTef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClTef

`func (o *RippleFinancialInstrument) SetClTef(v ClTef)`

SetClTef sets ClTef field to given value.

### HasClTef

`func (o *RippleFinancialInstrument) HasClTef() bool`

HasClTef returns a boolean if a field has been set.

### GetAeIpi

`func (o *RippleFinancialInstrument) GetAeIpi() AeIpi`

GetAeIpi returns the AeIpi field if non-nil, zero value otherwise.

### GetAeIpiOk

`func (o *RippleFinancialInstrument) GetAeIpiOk() (*AeIpi, bool)`

GetAeIpiOk returns a tuple with the AeIpi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAeIpi

`func (o *RippleFinancialInstrument) SetAeIpi(v AeIpi)`

SetAeIpi sets AeIpi field to given value.

### HasAeIpi

`func (o *RippleFinancialInstrument) HasAeIpi() bool`

HasAeIpi returns a boolean if a field has been set.

### GetTrFast

`func (o *RippleFinancialInstrument) GetTrFast() TrFast`

GetTrFast returns the TrFast field if non-nil, zero value otherwise.

### GetTrFastOk

`func (o *RippleFinancialInstrument) GetTrFastOk() (*TrFast, bool)`

GetTrFastOk returns a tuple with the TrFast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrFast

`func (o *RippleFinancialInstrument) SetTrFast(v TrFast)`

SetTrFast sets TrFast field to given value.

### HasTrFast

`func (o *RippleFinancialInstrument) HasTrFast() bool`

HasTrFast returns a boolean if a field has been set.

### GetPhNrps

`func (o *RippleFinancialInstrument) GetPhNrps() PhNrps`

GetPhNrps returns the PhNrps field if non-nil, zero value otherwise.

### GetPhNrpsOk

`func (o *RippleFinancialInstrument) GetPhNrpsOk() (*PhNrps, bool)`

GetPhNrpsOk returns a tuple with the PhNrps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhNrps

`func (o *RippleFinancialInstrument) SetPhNrps(v PhNrps)`

SetPhNrps sets PhNrps field to given value.

### HasPhNrps

`func (o *RippleFinancialInstrument) HasPhNrps() bool`

HasPhNrps returns a boolean if a field has been set.

### GetThPromptpay

`func (o *RippleFinancialInstrument) GetThPromptpay() ThPromptpay`

GetThPromptpay returns the ThPromptpay field if non-nil, zero value otherwise.

### GetThPromptpayOk

`func (o *RippleFinancialInstrument) GetThPromptpayOk() (*ThPromptpay, bool)`

GetThPromptpayOk returns a tuple with the ThPromptpay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThPromptpay

`func (o *RippleFinancialInstrument) SetThPromptpay(v ThPromptpay)`

SetThPromptpay sets ThPromptpay field to given value.

### HasThPromptpay

`func (o *RippleFinancialInstrument) HasThPromptpay() bool`

HasThPromptpay returns a boolean if a field has been set.

### GetArInterbanking

`func (o *RippleFinancialInstrument) GetArInterbanking() ArInterbanking`

GetArInterbanking returns the ArInterbanking field if non-nil, zero value otherwise.

### GetArInterbankingOk

`func (o *RippleFinancialInstrument) GetArInterbankingOk() (*ArInterbanking, bool)`

GetArInterbankingOk returns a tuple with the ArInterbanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArInterbanking

`func (o *RippleFinancialInstrument) SetArInterbanking(v ArInterbanking)`

SetArInterbanking sets ArInterbanking field to given value.

### HasArInterbanking

`func (o *RippleFinancialInstrument) HasArInterbanking() bool`

HasArInterbanking returns a boolean if a field has been set.

### GetCurrency

`func (o *RippleFinancialInstrument) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *RippleFinancialInstrument) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *RippleFinancialInstrument) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetLabel

`func (o *RippleFinancialInstrument) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *RippleFinancialInstrument) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *RippleFinancialInstrument) SetLabel(v string)`

SetLabel sets Label field to given value.

### HasLabel

`func (o *RippleFinancialInstrument) HasLabel() bool`

HasLabel returns a boolean if a field has been set.

### GetFinancialInstrumentType

`func (o *RippleFinancialInstrument) GetFinancialInstrumentType() string`

GetFinancialInstrumentType returns the FinancialInstrumentType field if non-nil, zero value otherwise.

### GetFinancialInstrumentTypeOk

`func (o *RippleFinancialInstrument) GetFinancialInstrumentTypeOk() (*string, bool)`

GetFinancialInstrumentTypeOk returns a tuple with the FinancialInstrumentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinancialInstrumentType

`func (o *RippleFinancialInstrument) SetFinancialInstrumentType(v string)`

SetFinancialInstrumentType sets FinancialInstrumentType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


