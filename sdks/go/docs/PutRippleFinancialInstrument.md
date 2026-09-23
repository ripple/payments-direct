# PutRippleFinancialInstrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Label** | Pointer to **string** | A user-defined label for the financial instrument. | [optional] 
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
**KrKftc** | Pointer to [**KrKftc**](KrKftc.md) |  | [optional] 
**InNeft** | Pointer to [**InNeft**](InNeft.md) |  | [optional] 
**PeLbtr** | Pointer to [**PeLbtr**](PeLbtr.md) |  | [optional] 
**AuNpp** | Pointer to [**AuNpp**](AuNpp.md) |  | [optional] 
**ClTef** | Pointer to [**ClTef**](ClTef.md) |  | [optional] 
**AeIpi** | Pointer to [**AeIpi**](AeIpi.md) |  | [optional] 
**ArInterbanking** | Pointer to [**ArInterbanking**](ArInterbanking.md) |  | [optional] 

## Methods

### NewPutRippleFinancialInstrument

`func NewPutRippleFinancialInstrument() *PutRippleFinancialInstrument`

NewPutRippleFinancialInstrument instantiates a new PutRippleFinancialInstrument object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPutRippleFinancialInstrumentWithDefaults

`func NewPutRippleFinancialInstrumentWithDefaults() *PutRippleFinancialInstrument`

NewPutRippleFinancialInstrumentWithDefaults instantiates a new PutRippleFinancialInstrument object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabel

`func (o *PutRippleFinancialInstrument) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *PutRippleFinancialInstrument) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *PutRippleFinancialInstrument) SetLabel(v string)`

SetLabel sets Label field to given value.

### HasLabel

`func (o *PutRippleFinancialInstrument) HasLabel() bool`

HasLabel returns a boolean if a field has been set.

### GetUsAch

`func (o *PutRippleFinancialInstrument) GetUsAch() UsAch`

GetUsAch returns the UsAch field if non-nil, zero value otherwise.

### GetUsAchOk

`func (o *PutRippleFinancialInstrument) GetUsAchOk() (*UsAch, bool)`

GetUsAchOk returns a tuple with the UsAch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsAch

`func (o *PutRippleFinancialInstrument) SetUsAch(v UsAch)`

SetUsAch sets UsAch field to given value.

### HasUsAch

`func (o *PutRippleFinancialInstrument) HasUsAch() bool`

HasUsAch returns a boolean if a field has been set.

### GetUsFedwire

`func (o *PutRippleFinancialInstrument) GetUsFedwire() UsFedwire`

GetUsFedwire returns the UsFedwire field if non-nil, zero value otherwise.

### GetUsFedwireOk

`func (o *PutRippleFinancialInstrument) GetUsFedwireOk() (*UsFedwire, bool)`

GetUsFedwireOk returns a tuple with the UsFedwire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsFedwire

`func (o *PutRippleFinancialInstrument) SetUsFedwire(v UsFedwire)`

SetUsFedwire sets UsFedwire field to given value.

### HasUsFedwire

`func (o *PutRippleFinancialInstrument) HasUsFedwire() bool`

HasUsFedwire returns a boolean if a field has been set.

### GetMxSpei

`func (o *PutRippleFinancialInstrument) GetMxSpei() MxSpei`

GetMxSpei returns the MxSpei field if non-nil, zero value otherwise.

### GetMxSpeiOk

`func (o *PutRippleFinancialInstrument) GetMxSpeiOk() (*MxSpei, bool)`

GetMxSpeiOk returns a tuple with the MxSpei field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMxSpei

`func (o *PutRippleFinancialInstrument) SetMxSpei(v MxSpei)`

SetMxSpei sets MxSpei field to given value.

### HasMxSpei

`func (o *PutRippleFinancialInstrument) HasMxSpei() bool`

HasMxSpei returns a boolean if a field has been set.

### GetEuSepa

`func (o *PutRippleFinancialInstrument) GetEuSepa() EuSepa`

GetEuSepa returns the EuSepa field if non-nil, zero value otherwise.

### GetEuSepaOk

`func (o *PutRippleFinancialInstrument) GetEuSepaOk() (*EuSepa, bool)`

GetEuSepaOk returns a tuple with the EuSepa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEuSepa

`func (o *PutRippleFinancialInstrument) SetEuSepa(v EuSepa)`

SetEuSepa sets EuSepa field to given value.

### HasEuSepa

`func (o *PutRippleFinancialInstrument) HasEuSepa() bool`

HasEuSepa returns a boolean if a field has been set.

### GetGbFps

`func (o *PutRippleFinancialInstrument) GetGbFps() GbFps`

GetGbFps returns the GbFps field if non-nil, zero value otherwise.

### GetGbFpsOk

`func (o *PutRippleFinancialInstrument) GetGbFpsOk() (*GbFps, bool)`

GetGbFpsOk returns a tuple with the GbFps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGbFps

`func (o *PutRippleFinancialInstrument) SetGbFps(v GbFps)`

SetGbFps sets GbFps field to given value.

### HasGbFps

`func (o *PutRippleFinancialInstrument) HasGbFps() bool`

HasGbFps returns a boolean if a field has been set.

### GetNgBankPayout

`func (o *PutRippleFinancialInstrument) GetNgBankPayout() NgBankPayout`

GetNgBankPayout returns the NgBankPayout field if non-nil, zero value otherwise.

### GetNgBankPayoutOk

`func (o *PutRippleFinancialInstrument) GetNgBankPayoutOk() (*NgBankPayout, bool)`

GetNgBankPayoutOk returns a tuple with the NgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNgBankPayout

`func (o *PutRippleFinancialInstrument) SetNgBankPayout(v NgBankPayout)`

SetNgBankPayout sets NgBankPayout field to given value.

### HasNgBankPayout

`func (o *PutRippleFinancialInstrument) HasNgBankPayout() bool`

HasNgBankPayout returns a boolean if a field has been set.

### GetGhBankPayout

`func (o *PutRippleFinancialInstrument) GetGhBankPayout() GhBankPayout`

GetGhBankPayout returns the GhBankPayout field if non-nil, zero value otherwise.

### GetGhBankPayoutOk

`func (o *PutRippleFinancialInstrument) GetGhBankPayoutOk() (*GhBankPayout, bool)`

GetGhBankPayoutOk returns a tuple with the GhBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGhBankPayout

`func (o *PutRippleFinancialInstrument) SetGhBankPayout(v GhBankPayout)`

SetGhBankPayout sets GhBankPayout field to given value.

### HasGhBankPayout

`func (o *PutRippleFinancialInstrument) HasGhBankPayout() bool`

HasGhBankPayout returns a boolean if a field has been set.

### GetRwBankPayout

`func (o *PutRippleFinancialInstrument) GetRwBankPayout() RwBankPayout`

GetRwBankPayout returns the RwBankPayout field if non-nil, zero value otherwise.

### GetRwBankPayoutOk

`func (o *PutRippleFinancialInstrument) GetRwBankPayoutOk() (*RwBankPayout, bool)`

GetRwBankPayoutOk returns a tuple with the RwBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwBankPayout

`func (o *PutRippleFinancialInstrument) SetRwBankPayout(v RwBankPayout)`

SetRwBankPayout sets RwBankPayout field to given value.

### HasRwBankPayout

`func (o *PutRippleFinancialInstrument) HasRwBankPayout() bool`

HasRwBankPayout returns a boolean if a field has been set.

### GetZaBankPayout

`func (o *PutRippleFinancialInstrument) GetZaBankPayout() ZaBankPayout`

GetZaBankPayout returns the ZaBankPayout field if non-nil, zero value otherwise.

### GetZaBankPayoutOk

`func (o *PutRippleFinancialInstrument) GetZaBankPayoutOk() (*ZaBankPayout, bool)`

GetZaBankPayoutOk returns a tuple with the ZaBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZaBankPayout

`func (o *PutRippleFinancialInstrument) SetZaBankPayout(v ZaBankPayout)`

SetZaBankPayout sets ZaBankPayout field to given value.

### HasZaBankPayout

`func (o *PutRippleFinancialInstrument) HasZaBankPayout() bool`

HasZaBankPayout returns a boolean if a field has been set.

### GetUgBankPayout

`func (o *PutRippleFinancialInstrument) GetUgBankPayout() UgBankPayout`

GetUgBankPayout returns the UgBankPayout field if non-nil, zero value otherwise.

### GetUgBankPayoutOk

`func (o *PutRippleFinancialInstrument) GetUgBankPayoutOk() (*UgBankPayout, bool)`

GetUgBankPayoutOk returns a tuple with the UgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUgBankPayout

`func (o *PutRippleFinancialInstrument) SetUgBankPayout(v UgBankPayout)`

SetUgBankPayout sets UgBankPayout field to given value.

### HasUgBankPayout

`func (o *PutRippleFinancialInstrument) HasUgBankPayout() bool`

HasUgBankPayout returns a boolean if a field has been set.

### GetZmBankPayout

`func (o *PutRippleFinancialInstrument) GetZmBankPayout() ZmBankPayout`

GetZmBankPayout returns the ZmBankPayout field if non-nil, zero value otherwise.

### GetZmBankPayoutOk

`func (o *PutRippleFinancialInstrument) GetZmBankPayoutOk() (*ZmBankPayout, bool)`

GetZmBankPayoutOk returns a tuple with the ZmBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZmBankPayout

`func (o *PutRippleFinancialInstrument) SetZmBankPayout(v ZmBankPayout)`

SetZmBankPayout sets ZmBankPayout field to given value.

### HasZmBankPayout

`func (o *PutRippleFinancialInstrument) HasZmBankPayout() bool`

HasZmBankPayout returns a boolean if a field has been set.

### GetEthWallet

`func (o *PutRippleFinancialInstrument) GetEthWallet() EthWallet`

GetEthWallet returns the EthWallet field if non-nil, zero value otherwise.

### GetEthWalletOk

`func (o *PutRippleFinancialInstrument) GetEthWalletOk() (*EthWallet, bool)`

GetEthWalletOk returns a tuple with the EthWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthWallet

`func (o *PutRippleFinancialInstrument) SetEthWallet(v EthWallet)`

SetEthWallet sets EthWallet field to given value.

### HasEthWallet

`func (o *PutRippleFinancialInstrument) HasEthWallet() bool`

HasEthWallet returns a boolean if a field has been set.

### GetTronWallet

`func (o *PutRippleFinancialInstrument) GetTronWallet() TronWallet`

GetTronWallet returns the TronWallet field if non-nil, zero value otherwise.

### GetTronWalletOk

`func (o *PutRippleFinancialInstrument) GetTronWalletOk() (*TronWallet, bool)`

GetTronWalletOk returns a tuple with the TronWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTronWallet

`func (o *PutRippleFinancialInstrument) SetTronWallet(v TronWallet)`

SetTronWallet sets TronWallet field to given value.

### HasTronWallet

`func (o *PutRippleFinancialInstrument) HasTronWallet() bool`

HasTronWallet returns a boolean if a field has been set.

### GetSolWallet

`func (o *PutRippleFinancialInstrument) GetSolWallet() SolWallet`

GetSolWallet returns the SolWallet field if non-nil, zero value otherwise.

### GetSolWalletOk

`func (o *PutRippleFinancialInstrument) GetSolWalletOk() (*SolWallet, bool)`

GetSolWalletOk returns a tuple with the SolWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSolWallet

`func (o *PutRippleFinancialInstrument) SetSolWallet(v SolWallet)`

SetSolWallet sets SolWallet field to given value.

### HasSolWallet

`func (o *PutRippleFinancialInstrument) HasSolWallet() bool`

HasSolWallet returns a boolean if a field has been set.

### GetBrPix

`func (o *PutRippleFinancialInstrument) GetBrPix() BrPix`

GetBrPix returns the BrPix field if non-nil, zero value otherwise.

### GetBrPixOk

`func (o *PutRippleFinancialInstrument) GetBrPixOk() (*BrPix, bool)`

GetBrPixOk returns a tuple with the BrPix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrPix

`func (o *PutRippleFinancialInstrument) SetBrPix(v BrPix)`

SetBrPix sets BrPix field to given value.

### HasBrPix

`func (o *PutRippleFinancialInstrument) HasBrPix() bool`

HasBrPix returns a boolean if a field has been set.

### GetCoPse

`func (o *PutRippleFinancialInstrument) GetCoPse() CoPse`

GetCoPse returns the CoPse field if non-nil, zero value otherwise.

### GetCoPseOk

`func (o *PutRippleFinancialInstrument) GetCoPseOk() (*CoPse, bool)`

GetCoPseOk returns a tuple with the CoPse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoPse

`func (o *PutRippleFinancialInstrument) SetCoPse(v CoPse)`

SetCoPse sets CoPse field to given value.

### HasCoPse

`func (o *PutRippleFinancialInstrument) HasCoPse() bool`

HasCoPse returns a boolean if a field has been set.

### GetBrTed

`func (o *PutRippleFinancialInstrument) GetBrTed() BrTed`

GetBrTed returns the BrTed field if non-nil, zero value otherwise.

### GetBrTedOk

`func (o *PutRippleFinancialInstrument) GetBrTedOk() (*BrTed, bool)`

GetBrTedOk returns a tuple with the BrTed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrTed

`func (o *PutRippleFinancialInstrument) SetBrTed(v BrTed)`

SetBrTed sets BrTed field to given value.

### HasBrTed

`func (o *PutRippleFinancialInstrument) HasBrTed() bool`

HasBrTed returns a boolean if a field has been set.

### GetCaEft

`func (o *PutRippleFinancialInstrument) GetCaEft() CaEft`

GetCaEft returns the CaEft field if non-nil, zero value otherwise.

### GetCaEftOk

`func (o *PutRippleFinancialInstrument) GetCaEftOk() (*CaEft, bool)`

GetCaEftOk returns a tuple with the CaEft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaEft

`func (o *PutRippleFinancialInstrument) SetCaEft(v CaEft)`

SetCaEft sets CaEft field to given value.

### HasCaEft

`func (o *PutRippleFinancialInstrument) HasCaEft() bool`

HasCaEft returns a boolean if a field has been set.

### GetKrKftc

`func (o *PutRippleFinancialInstrument) GetKrKftc() KrKftc`

GetKrKftc returns the KrKftc field if non-nil, zero value otherwise.

### GetKrKftcOk

`func (o *PutRippleFinancialInstrument) GetKrKftcOk() (*KrKftc, bool)`

GetKrKftcOk returns a tuple with the KrKftc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKrKftc

`func (o *PutRippleFinancialInstrument) SetKrKftc(v KrKftc)`

SetKrKftc sets KrKftc field to given value.

### HasKrKftc

`func (o *PutRippleFinancialInstrument) HasKrKftc() bool`

HasKrKftc returns a boolean if a field has been set.

### GetInNeft

`func (o *PutRippleFinancialInstrument) GetInNeft() InNeft`

GetInNeft returns the InNeft field if non-nil, zero value otherwise.

### GetInNeftOk

`func (o *PutRippleFinancialInstrument) GetInNeftOk() (*InNeft, bool)`

GetInNeftOk returns a tuple with the InNeft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInNeft

`func (o *PutRippleFinancialInstrument) SetInNeft(v InNeft)`

SetInNeft sets InNeft field to given value.

### HasInNeft

`func (o *PutRippleFinancialInstrument) HasInNeft() bool`

HasInNeft returns a boolean if a field has been set.

### GetPeLbtr

`func (o *PutRippleFinancialInstrument) GetPeLbtr() PeLbtr`

GetPeLbtr returns the PeLbtr field if non-nil, zero value otherwise.

### GetPeLbtrOk

`func (o *PutRippleFinancialInstrument) GetPeLbtrOk() (*PeLbtr, bool)`

GetPeLbtrOk returns a tuple with the PeLbtr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeLbtr

`func (o *PutRippleFinancialInstrument) SetPeLbtr(v PeLbtr)`

SetPeLbtr sets PeLbtr field to given value.

### HasPeLbtr

`func (o *PutRippleFinancialInstrument) HasPeLbtr() bool`

HasPeLbtr returns a boolean if a field has been set.

### GetAuNpp

`func (o *PutRippleFinancialInstrument) GetAuNpp() AuNpp`

GetAuNpp returns the AuNpp field if non-nil, zero value otherwise.

### GetAuNppOk

`func (o *PutRippleFinancialInstrument) GetAuNppOk() (*AuNpp, bool)`

GetAuNppOk returns a tuple with the AuNpp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuNpp

`func (o *PutRippleFinancialInstrument) SetAuNpp(v AuNpp)`

SetAuNpp sets AuNpp field to given value.

### HasAuNpp

`func (o *PutRippleFinancialInstrument) HasAuNpp() bool`

HasAuNpp returns a boolean if a field has been set.

### GetClTef

`func (o *PutRippleFinancialInstrument) GetClTef() ClTef`

GetClTef returns the ClTef field if non-nil, zero value otherwise.

### GetClTefOk

`func (o *PutRippleFinancialInstrument) GetClTefOk() (*ClTef, bool)`

GetClTefOk returns a tuple with the ClTef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClTef

`func (o *PutRippleFinancialInstrument) SetClTef(v ClTef)`

SetClTef sets ClTef field to given value.

### HasClTef

`func (o *PutRippleFinancialInstrument) HasClTef() bool`

HasClTef returns a boolean if a field has been set.

### GetAeIpi

`func (o *PutRippleFinancialInstrument) GetAeIpi() AeIpi`

GetAeIpi returns the AeIpi field if non-nil, zero value otherwise.

### GetAeIpiOk

`func (o *PutRippleFinancialInstrument) GetAeIpiOk() (*AeIpi, bool)`

GetAeIpiOk returns a tuple with the AeIpi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAeIpi

`func (o *PutRippleFinancialInstrument) SetAeIpi(v AeIpi)`

SetAeIpi sets AeIpi field to given value.

### HasAeIpi

`func (o *PutRippleFinancialInstrument) HasAeIpi() bool`

HasAeIpi returns a boolean if a field has been set.

### GetArInterbanking

`func (o *PutRippleFinancialInstrument) GetArInterbanking() ArInterbanking`

GetArInterbanking returns the ArInterbanking field if non-nil, zero value otherwise.

### GetArInterbankingOk

`func (o *PutRippleFinancialInstrument) GetArInterbankingOk() (*ArInterbanking, bool)`

GetArInterbankingOk returns a tuple with the ArInterbanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArInterbanking

`func (o *PutRippleFinancialInstrument) SetArInterbanking(v ArInterbanking)`

SetArInterbanking sets ArInterbanking field to given value.

### HasArInterbanking

`func (o *PutRippleFinancialInstrument) HasArInterbanking() bool`

HasArInterbanking returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


