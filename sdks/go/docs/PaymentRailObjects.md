# PaymentRailObjects

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

## Methods

### NewPaymentRailObjects

`func NewPaymentRailObjects() *PaymentRailObjects`

NewPaymentRailObjects instantiates a new PaymentRailObjects object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentRailObjectsWithDefaults

`func NewPaymentRailObjectsWithDefaults() *PaymentRailObjects`

NewPaymentRailObjectsWithDefaults instantiates a new PaymentRailObjects object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsAch

`func (o *PaymentRailObjects) GetUsAch() UsAch`

GetUsAch returns the UsAch field if non-nil, zero value otherwise.

### GetUsAchOk

`func (o *PaymentRailObjects) GetUsAchOk() (*UsAch, bool)`

GetUsAchOk returns a tuple with the UsAch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsAch

`func (o *PaymentRailObjects) SetUsAch(v UsAch)`

SetUsAch sets UsAch field to given value.

### HasUsAch

`func (o *PaymentRailObjects) HasUsAch() bool`

HasUsAch returns a boolean if a field has been set.

### GetUsFedwire

`func (o *PaymentRailObjects) GetUsFedwire() UsFedwire`

GetUsFedwire returns the UsFedwire field if non-nil, zero value otherwise.

### GetUsFedwireOk

`func (o *PaymentRailObjects) GetUsFedwireOk() (*UsFedwire, bool)`

GetUsFedwireOk returns a tuple with the UsFedwire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsFedwire

`func (o *PaymentRailObjects) SetUsFedwire(v UsFedwire)`

SetUsFedwire sets UsFedwire field to given value.

### HasUsFedwire

`func (o *PaymentRailObjects) HasUsFedwire() bool`

HasUsFedwire returns a boolean if a field has been set.

### GetMxSpei

`func (o *PaymentRailObjects) GetMxSpei() MxSpei`

GetMxSpei returns the MxSpei field if non-nil, zero value otherwise.

### GetMxSpeiOk

`func (o *PaymentRailObjects) GetMxSpeiOk() (*MxSpei, bool)`

GetMxSpeiOk returns a tuple with the MxSpei field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMxSpei

`func (o *PaymentRailObjects) SetMxSpei(v MxSpei)`

SetMxSpei sets MxSpei field to given value.

### HasMxSpei

`func (o *PaymentRailObjects) HasMxSpei() bool`

HasMxSpei returns a boolean if a field has been set.

### GetEuSepa

`func (o *PaymentRailObjects) GetEuSepa() EuSepa`

GetEuSepa returns the EuSepa field if non-nil, zero value otherwise.

### GetEuSepaOk

`func (o *PaymentRailObjects) GetEuSepaOk() (*EuSepa, bool)`

GetEuSepaOk returns a tuple with the EuSepa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEuSepa

`func (o *PaymentRailObjects) SetEuSepa(v EuSepa)`

SetEuSepa sets EuSepa field to given value.

### HasEuSepa

`func (o *PaymentRailObjects) HasEuSepa() bool`

HasEuSepa returns a boolean if a field has been set.

### GetGbFps

`func (o *PaymentRailObjects) GetGbFps() GbFps`

GetGbFps returns the GbFps field if non-nil, zero value otherwise.

### GetGbFpsOk

`func (o *PaymentRailObjects) GetGbFpsOk() (*GbFps, bool)`

GetGbFpsOk returns a tuple with the GbFps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGbFps

`func (o *PaymentRailObjects) SetGbFps(v GbFps)`

SetGbFps sets GbFps field to given value.

### HasGbFps

`func (o *PaymentRailObjects) HasGbFps() bool`

HasGbFps returns a boolean if a field has been set.

### GetNgBankPayout

`func (o *PaymentRailObjects) GetNgBankPayout() NgBankPayout`

GetNgBankPayout returns the NgBankPayout field if non-nil, zero value otherwise.

### GetNgBankPayoutOk

`func (o *PaymentRailObjects) GetNgBankPayoutOk() (*NgBankPayout, bool)`

GetNgBankPayoutOk returns a tuple with the NgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNgBankPayout

`func (o *PaymentRailObjects) SetNgBankPayout(v NgBankPayout)`

SetNgBankPayout sets NgBankPayout field to given value.

### HasNgBankPayout

`func (o *PaymentRailObjects) HasNgBankPayout() bool`

HasNgBankPayout returns a boolean if a field has been set.

### GetGhBankPayout

`func (o *PaymentRailObjects) GetGhBankPayout() GhBankPayout`

GetGhBankPayout returns the GhBankPayout field if non-nil, zero value otherwise.

### GetGhBankPayoutOk

`func (o *PaymentRailObjects) GetGhBankPayoutOk() (*GhBankPayout, bool)`

GetGhBankPayoutOk returns a tuple with the GhBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGhBankPayout

`func (o *PaymentRailObjects) SetGhBankPayout(v GhBankPayout)`

SetGhBankPayout sets GhBankPayout field to given value.

### HasGhBankPayout

`func (o *PaymentRailObjects) HasGhBankPayout() bool`

HasGhBankPayout returns a boolean if a field has been set.

### GetRwBankPayout

`func (o *PaymentRailObjects) GetRwBankPayout() RwBankPayout`

GetRwBankPayout returns the RwBankPayout field if non-nil, zero value otherwise.

### GetRwBankPayoutOk

`func (o *PaymentRailObjects) GetRwBankPayoutOk() (*RwBankPayout, bool)`

GetRwBankPayoutOk returns a tuple with the RwBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwBankPayout

`func (o *PaymentRailObjects) SetRwBankPayout(v RwBankPayout)`

SetRwBankPayout sets RwBankPayout field to given value.

### HasRwBankPayout

`func (o *PaymentRailObjects) HasRwBankPayout() bool`

HasRwBankPayout returns a boolean if a field has been set.

### GetZaBankPayout

`func (o *PaymentRailObjects) GetZaBankPayout() ZaBankPayout`

GetZaBankPayout returns the ZaBankPayout field if non-nil, zero value otherwise.

### GetZaBankPayoutOk

`func (o *PaymentRailObjects) GetZaBankPayoutOk() (*ZaBankPayout, bool)`

GetZaBankPayoutOk returns a tuple with the ZaBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZaBankPayout

`func (o *PaymentRailObjects) SetZaBankPayout(v ZaBankPayout)`

SetZaBankPayout sets ZaBankPayout field to given value.

### HasZaBankPayout

`func (o *PaymentRailObjects) HasZaBankPayout() bool`

HasZaBankPayout returns a boolean if a field has been set.

### GetUgBankPayout

`func (o *PaymentRailObjects) GetUgBankPayout() UgBankPayout`

GetUgBankPayout returns the UgBankPayout field if non-nil, zero value otherwise.

### GetUgBankPayoutOk

`func (o *PaymentRailObjects) GetUgBankPayoutOk() (*UgBankPayout, bool)`

GetUgBankPayoutOk returns a tuple with the UgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUgBankPayout

`func (o *PaymentRailObjects) SetUgBankPayout(v UgBankPayout)`

SetUgBankPayout sets UgBankPayout field to given value.

### HasUgBankPayout

`func (o *PaymentRailObjects) HasUgBankPayout() bool`

HasUgBankPayout returns a boolean if a field has been set.

### GetZmBankPayout

`func (o *PaymentRailObjects) GetZmBankPayout() ZmBankPayout`

GetZmBankPayout returns the ZmBankPayout field if non-nil, zero value otherwise.

### GetZmBankPayoutOk

`func (o *PaymentRailObjects) GetZmBankPayoutOk() (*ZmBankPayout, bool)`

GetZmBankPayoutOk returns a tuple with the ZmBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZmBankPayout

`func (o *PaymentRailObjects) SetZmBankPayout(v ZmBankPayout)`

SetZmBankPayout sets ZmBankPayout field to given value.

### HasZmBankPayout

`func (o *PaymentRailObjects) HasZmBankPayout() bool`

HasZmBankPayout returns a boolean if a field has been set.

### GetEthWallet

`func (o *PaymentRailObjects) GetEthWallet() EthWallet`

GetEthWallet returns the EthWallet field if non-nil, zero value otherwise.

### GetEthWalletOk

`func (o *PaymentRailObjects) GetEthWalletOk() (*EthWallet, bool)`

GetEthWalletOk returns a tuple with the EthWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthWallet

`func (o *PaymentRailObjects) SetEthWallet(v EthWallet)`

SetEthWallet sets EthWallet field to given value.

### HasEthWallet

`func (o *PaymentRailObjects) HasEthWallet() bool`

HasEthWallet returns a boolean if a field has been set.

### GetTronWallet

`func (o *PaymentRailObjects) GetTronWallet() TronWallet`

GetTronWallet returns the TronWallet field if non-nil, zero value otherwise.

### GetTronWalletOk

`func (o *PaymentRailObjects) GetTronWalletOk() (*TronWallet, bool)`

GetTronWalletOk returns a tuple with the TronWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTronWallet

`func (o *PaymentRailObjects) SetTronWallet(v TronWallet)`

SetTronWallet sets TronWallet field to given value.

### HasTronWallet

`func (o *PaymentRailObjects) HasTronWallet() bool`

HasTronWallet returns a boolean if a field has been set.

### GetSolWallet

`func (o *PaymentRailObjects) GetSolWallet() SolWallet`

GetSolWallet returns the SolWallet field if non-nil, zero value otherwise.

### GetSolWalletOk

`func (o *PaymentRailObjects) GetSolWalletOk() (*SolWallet, bool)`

GetSolWalletOk returns a tuple with the SolWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSolWallet

`func (o *PaymentRailObjects) SetSolWallet(v SolWallet)`

SetSolWallet sets SolWallet field to given value.

### HasSolWallet

`func (o *PaymentRailObjects) HasSolWallet() bool`

HasSolWallet returns a boolean if a field has been set.

### GetBrPix

`func (o *PaymentRailObjects) GetBrPix() BrPix`

GetBrPix returns the BrPix field if non-nil, zero value otherwise.

### GetBrPixOk

`func (o *PaymentRailObjects) GetBrPixOk() (*BrPix, bool)`

GetBrPixOk returns a tuple with the BrPix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrPix

`func (o *PaymentRailObjects) SetBrPix(v BrPix)`

SetBrPix sets BrPix field to given value.

### HasBrPix

`func (o *PaymentRailObjects) HasBrPix() bool`

HasBrPix returns a boolean if a field has been set.

### GetCoPse

`func (o *PaymentRailObjects) GetCoPse() CoPse`

GetCoPse returns the CoPse field if non-nil, zero value otherwise.

### GetCoPseOk

`func (o *PaymentRailObjects) GetCoPseOk() (*CoPse, bool)`

GetCoPseOk returns a tuple with the CoPse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoPse

`func (o *PaymentRailObjects) SetCoPse(v CoPse)`

SetCoPse sets CoPse field to given value.

### HasCoPse

`func (o *PaymentRailObjects) HasCoPse() bool`

HasCoPse returns a boolean if a field has been set.

### GetBrTed

`func (o *PaymentRailObjects) GetBrTed() BrTed`

GetBrTed returns the BrTed field if non-nil, zero value otherwise.

### GetBrTedOk

`func (o *PaymentRailObjects) GetBrTedOk() (*BrTed, bool)`

GetBrTedOk returns a tuple with the BrTed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrTed

`func (o *PaymentRailObjects) SetBrTed(v BrTed)`

SetBrTed sets BrTed field to given value.

### HasBrTed

`func (o *PaymentRailObjects) HasBrTed() bool`

HasBrTed returns a boolean if a field has been set.

### GetCaEft

`func (o *PaymentRailObjects) GetCaEft() CaEft`

GetCaEft returns the CaEft field if non-nil, zero value otherwise.

### GetCaEftOk

`func (o *PaymentRailObjects) GetCaEftOk() (*CaEft, bool)`

GetCaEftOk returns a tuple with the CaEft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaEft

`func (o *PaymentRailObjects) SetCaEft(v CaEft)`

SetCaEft sets CaEft field to given value.

### HasCaEft

`func (o *PaymentRailObjects) HasCaEft() bool`

HasCaEft returns a boolean if a field has been set.

### GetHkBankPayout

`func (o *PaymentRailObjects) GetHkBankPayout() HkBankPayout`

GetHkBankPayout returns the HkBankPayout field if non-nil, zero value otherwise.

### GetHkBankPayoutOk

`func (o *PaymentRailObjects) GetHkBankPayoutOk() (*HkBankPayout, bool)`

GetHkBankPayoutOk returns a tuple with the HkBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHkBankPayout

`func (o *PaymentRailObjects) SetHkBankPayout(v HkBankPayout)`

SetHkBankPayout sets HkBankPayout field to given value.

### HasHkBankPayout

`func (o *PaymentRailObjects) HasHkBankPayout() bool`

HasHkBankPayout returns a boolean if a field has been set.

### GetIdBifast

`func (o *PaymentRailObjects) GetIdBifast() IdBifast`

GetIdBifast returns the IdBifast field if non-nil, zero value otherwise.

### GetIdBifastOk

`func (o *PaymentRailObjects) GetIdBifastOk() (*IdBifast, bool)`

GetIdBifastOk returns a tuple with the IdBifast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdBifast

`func (o *PaymentRailObjects) SetIdBifast(v IdBifast)`

SetIdBifast sets IdBifast field to given value.

### HasIdBifast

`func (o *PaymentRailObjects) HasIdBifast() bool`

HasIdBifast returns a boolean if a field has been set.

### GetKrKftc

`func (o *PaymentRailObjects) GetKrKftc() KrKftc`

GetKrKftc returns the KrKftc field if non-nil, zero value otherwise.

### GetKrKftcOk

`func (o *PaymentRailObjects) GetKrKftcOk() (*KrKftc, bool)`

GetKrKftcOk returns a tuple with the KrKftc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKrKftc

`func (o *PaymentRailObjects) SetKrKftc(v KrKftc)`

SetKrKftc sets KrKftc field to given value.

### HasKrKftc

`func (o *PaymentRailObjects) HasKrKftc() bool`

HasKrKftc returns a boolean if a field has been set.

### GetInNeft

`func (o *PaymentRailObjects) GetInNeft() InNeft`

GetInNeft returns the InNeft field if non-nil, zero value otherwise.

### GetInNeftOk

`func (o *PaymentRailObjects) GetInNeftOk() (*InNeft, bool)`

GetInNeftOk returns a tuple with the InNeft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInNeft

`func (o *PaymentRailObjects) SetInNeft(v InNeft)`

SetInNeft sets InNeft field to given value.

### HasInNeft

`func (o *PaymentRailObjects) HasInNeft() bool`

HasInNeft returns a boolean if a field has been set.

### GetPeLbtr

`func (o *PaymentRailObjects) GetPeLbtr() PeLbtr`

GetPeLbtr returns the PeLbtr field if non-nil, zero value otherwise.

### GetPeLbtrOk

`func (o *PaymentRailObjects) GetPeLbtrOk() (*PeLbtr, bool)`

GetPeLbtrOk returns a tuple with the PeLbtr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeLbtr

`func (o *PaymentRailObjects) SetPeLbtr(v PeLbtr)`

SetPeLbtr sets PeLbtr field to given value.

### HasPeLbtr

`func (o *PaymentRailObjects) HasPeLbtr() bool`

HasPeLbtr returns a boolean if a field has been set.

### GetCnTrade

`func (o *PaymentRailObjects) GetCnTrade() CnTrade`

GetCnTrade returns the CnTrade field if non-nil, zero value otherwise.

### GetCnTradeOk

`func (o *PaymentRailObjects) GetCnTradeOk() (*CnTrade, bool)`

GetCnTradeOk returns a tuple with the CnTrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnTrade

`func (o *PaymentRailObjects) SetCnTrade(v CnTrade)`

SetCnTrade sets CnTrade field to given value.

### HasCnTrade

`func (o *PaymentRailObjects) HasCnTrade() bool`

HasCnTrade returns a boolean if a field has been set.

### GetCnIndividual

`func (o *PaymentRailObjects) GetCnIndividual() CnIndividual`

GetCnIndividual returns the CnIndividual field if non-nil, zero value otherwise.

### GetCnIndividualOk

`func (o *PaymentRailObjects) GetCnIndividualOk() (*CnIndividual, bool)`

GetCnIndividualOk returns a tuple with the CnIndividual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnIndividual

`func (o *PaymentRailObjects) SetCnIndividual(v CnIndividual)`

SetCnIndividual sets CnIndividual field to given value.

### HasCnIndividual

`func (o *PaymentRailObjects) HasCnIndividual() bool`

HasCnIndividual returns a boolean if a field has been set.

### GetCnIndividualTrade

`func (o *PaymentRailObjects) GetCnIndividualTrade() CnIndividualTrade`

GetCnIndividualTrade returns the CnIndividualTrade field if non-nil, zero value otherwise.

### GetCnIndividualTradeOk

`func (o *PaymentRailObjects) GetCnIndividualTradeOk() (*CnIndividualTrade, bool)`

GetCnIndividualTradeOk returns a tuple with the CnIndividualTrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnIndividualTrade

`func (o *PaymentRailObjects) SetCnIndividualTrade(v CnIndividualTrade)`

SetCnIndividualTrade sets CnIndividualTrade field to given value.

### HasCnIndividualTrade

`func (o *PaymentRailObjects) HasCnIndividualTrade() bool`

HasCnIndividualTrade returns a boolean if a field has been set.

### GetCnCfxps

`func (o *PaymentRailObjects) GetCnCfxps() CnCfxps`

GetCnCfxps returns the CnCfxps field if non-nil, zero value otherwise.

### GetCnCfxpsOk

`func (o *PaymentRailObjects) GetCnCfxpsOk() (*CnCfxps, bool)`

GetCnCfxpsOk returns a tuple with the CnCfxps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnCfxps

`func (o *PaymentRailObjects) SetCnCfxps(v CnCfxps)`

SetCnCfxps sets CnCfxps field to given value.

### HasCnCfxps

`func (o *PaymentRailObjects) HasCnCfxps() bool`

HasCnCfxps returns a boolean if a field has been set.

### GetClTef

`func (o *PaymentRailObjects) GetClTef() ClTef`

GetClTef returns the ClTef field if non-nil, zero value otherwise.

### GetClTefOk

`func (o *PaymentRailObjects) GetClTefOk() (*ClTef, bool)`

GetClTefOk returns a tuple with the ClTef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClTef

`func (o *PaymentRailObjects) SetClTef(v ClTef)`

SetClTef sets ClTef field to given value.

### HasClTef

`func (o *PaymentRailObjects) HasClTef() bool`

HasClTef returns a boolean if a field has been set.

### GetAeIpi

`func (o *PaymentRailObjects) GetAeIpi() AeIpi`

GetAeIpi returns the AeIpi field if non-nil, zero value otherwise.

### GetAeIpiOk

`func (o *PaymentRailObjects) GetAeIpiOk() (*AeIpi, bool)`

GetAeIpiOk returns a tuple with the AeIpi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAeIpi

`func (o *PaymentRailObjects) SetAeIpi(v AeIpi)`

SetAeIpi sets AeIpi field to given value.

### HasAeIpi

`func (o *PaymentRailObjects) HasAeIpi() bool`

HasAeIpi returns a boolean if a field has been set.

### GetTrFast

`func (o *PaymentRailObjects) GetTrFast() TrFast`

GetTrFast returns the TrFast field if non-nil, zero value otherwise.

### GetTrFastOk

`func (o *PaymentRailObjects) GetTrFastOk() (*TrFast, bool)`

GetTrFastOk returns a tuple with the TrFast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrFast

`func (o *PaymentRailObjects) SetTrFast(v TrFast)`

SetTrFast sets TrFast field to given value.

### HasTrFast

`func (o *PaymentRailObjects) HasTrFast() bool`

HasTrFast returns a boolean if a field has been set.

### GetPhNrps

`func (o *PaymentRailObjects) GetPhNrps() PhNrps`

GetPhNrps returns the PhNrps field if non-nil, zero value otherwise.

### GetPhNrpsOk

`func (o *PaymentRailObjects) GetPhNrpsOk() (*PhNrps, bool)`

GetPhNrpsOk returns a tuple with the PhNrps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhNrps

`func (o *PaymentRailObjects) SetPhNrps(v PhNrps)`

SetPhNrps sets PhNrps field to given value.

### HasPhNrps

`func (o *PaymentRailObjects) HasPhNrps() bool`

HasPhNrps returns a boolean if a field has been set.

### GetThPromptpay

`func (o *PaymentRailObjects) GetThPromptpay() ThPromptpay`

GetThPromptpay returns the ThPromptpay field if non-nil, zero value otherwise.

### GetThPromptpayOk

`func (o *PaymentRailObjects) GetThPromptpayOk() (*ThPromptpay, bool)`

GetThPromptpayOk returns a tuple with the ThPromptpay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThPromptpay

`func (o *PaymentRailObjects) SetThPromptpay(v ThPromptpay)`

SetThPromptpay sets ThPromptpay field to given value.

### HasThPromptpay

`func (o *PaymentRailObjects) HasThPromptpay() bool`

HasThPromptpay returns a boolean if a field has been set.

### GetArInterbanking

`func (o *PaymentRailObjects) GetArInterbanking() ArInterbanking`

GetArInterbanking returns the ArInterbanking field if non-nil, zero value otherwise.

### GetArInterbankingOk

`func (o *PaymentRailObjects) GetArInterbankingOk() (*ArInterbanking, bool)`

GetArInterbankingOk returns a tuple with the ArInterbanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArInterbanking

`func (o *PaymentRailObjects) SetArInterbanking(v ArInterbanking)`

SetArInterbanking sets ArInterbanking field to given value.

### HasArInterbanking

`func (o *PaymentRailObjects) HasArInterbanking() bool`

HasArInterbanking returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


