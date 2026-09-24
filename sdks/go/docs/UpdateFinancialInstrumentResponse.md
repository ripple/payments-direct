# UpdateFinancialInstrumentResponse

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
**KrKftc** | Pointer to [**KrKftc**](KrKftc.md) |  | [optional] 
**InNeft** | Pointer to [**InNeft**](InNeft.md) |  | [optional] 
**PeLbtr** | Pointer to [**PeLbtr**](PeLbtr.md) |  | [optional] 
**AuNpp** | Pointer to [**AuNpp**](AuNpp.md) |  | [optional] 
**CnCfxps** | Pointer to [**CnCfxps**](CnCfxps.md) |  | [optional] 
**ClTef** | Pointer to [**ClTef**](ClTef.md) |  | [optional] 
**AeIpi** | Pointer to [**AeIpi**](AeIpi.md) |  | [optional] 
**ArInterbanking** | Pointer to [**ArInterbanking**](ArInterbanking.md) |  | [optional] 
**Currency** | **string** | The 3-letter ISO currency code of the financial instrument. | 
**Label** | Pointer to **string** | A user-defined label for the financial instrument. | [optional] 
**FinancialInstrumentType** | **string** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | 
**Country** | Pointer to **string** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. This field is omitted when no country jurisdiction applies (for example, crypto wallet instruments such as ETH_WALLET, TRON_WALLET, and SOL_WALLET). An absent &#x60;country&#x60; should be interpreted as \&quot;no applicable jurisdiction\&quot;.  | [optional] 
**FinancialInstrumentId** | **string** | The unique identifier of the financial instrument. | 
**CreatedAt** | Pointer to **time.Time** | The time at which the financial instrument was created | [optional] 
**UpdatedAt** | Pointer to **time.Time** | The time at which the financial instrument was last updated | [optional] 

## Methods

### NewUpdateFinancialInstrumentResponse

`func NewUpdateFinancialInstrumentResponse(currency string, financialInstrumentType string, financialInstrumentId string, ) *UpdateFinancialInstrumentResponse`

NewUpdateFinancialInstrumentResponse instantiates a new UpdateFinancialInstrumentResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateFinancialInstrumentResponseWithDefaults

`func NewUpdateFinancialInstrumentResponseWithDefaults() *UpdateFinancialInstrumentResponse`

NewUpdateFinancialInstrumentResponseWithDefaults instantiates a new UpdateFinancialInstrumentResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsAch

`func (o *UpdateFinancialInstrumentResponse) GetUsAch() UsAch`

GetUsAch returns the UsAch field if non-nil, zero value otherwise.

### GetUsAchOk

`func (o *UpdateFinancialInstrumentResponse) GetUsAchOk() (*UsAch, bool)`

GetUsAchOk returns a tuple with the UsAch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsAch

`func (o *UpdateFinancialInstrumentResponse) SetUsAch(v UsAch)`

SetUsAch sets UsAch field to given value.

### HasUsAch

`func (o *UpdateFinancialInstrumentResponse) HasUsAch() bool`

HasUsAch returns a boolean if a field has been set.

### GetUsFedwire

`func (o *UpdateFinancialInstrumentResponse) GetUsFedwire() UsFedwire`

GetUsFedwire returns the UsFedwire field if non-nil, zero value otherwise.

### GetUsFedwireOk

`func (o *UpdateFinancialInstrumentResponse) GetUsFedwireOk() (*UsFedwire, bool)`

GetUsFedwireOk returns a tuple with the UsFedwire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsFedwire

`func (o *UpdateFinancialInstrumentResponse) SetUsFedwire(v UsFedwire)`

SetUsFedwire sets UsFedwire field to given value.

### HasUsFedwire

`func (o *UpdateFinancialInstrumentResponse) HasUsFedwire() bool`

HasUsFedwire returns a boolean if a field has been set.

### GetMxSpei

`func (o *UpdateFinancialInstrumentResponse) GetMxSpei() MxSpei`

GetMxSpei returns the MxSpei field if non-nil, zero value otherwise.

### GetMxSpeiOk

`func (o *UpdateFinancialInstrumentResponse) GetMxSpeiOk() (*MxSpei, bool)`

GetMxSpeiOk returns a tuple with the MxSpei field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMxSpei

`func (o *UpdateFinancialInstrumentResponse) SetMxSpei(v MxSpei)`

SetMxSpei sets MxSpei field to given value.

### HasMxSpei

`func (o *UpdateFinancialInstrumentResponse) HasMxSpei() bool`

HasMxSpei returns a boolean if a field has been set.

### GetEuSepa

`func (o *UpdateFinancialInstrumentResponse) GetEuSepa() EuSepa`

GetEuSepa returns the EuSepa field if non-nil, zero value otherwise.

### GetEuSepaOk

`func (o *UpdateFinancialInstrumentResponse) GetEuSepaOk() (*EuSepa, bool)`

GetEuSepaOk returns a tuple with the EuSepa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEuSepa

`func (o *UpdateFinancialInstrumentResponse) SetEuSepa(v EuSepa)`

SetEuSepa sets EuSepa field to given value.

### HasEuSepa

`func (o *UpdateFinancialInstrumentResponse) HasEuSepa() bool`

HasEuSepa returns a boolean if a field has been set.

### GetGbFps

`func (o *UpdateFinancialInstrumentResponse) GetGbFps() GbFps`

GetGbFps returns the GbFps field if non-nil, zero value otherwise.

### GetGbFpsOk

`func (o *UpdateFinancialInstrumentResponse) GetGbFpsOk() (*GbFps, bool)`

GetGbFpsOk returns a tuple with the GbFps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGbFps

`func (o *UpdateFinancialInstrumentResponse) SetGbFps(v GbFps)`

SetGbFps sets GbFps field to given value.

### HasGbFps

`func (o *UpdateFinancialInstrumentResponse) HasGbFps() bool`

HasGbFps returns a boolean if a field has been set.

### GetNgBankPayout

`func (o *UpdateFinancialInstrumentResponse) GetNgBankPayout() NgBankPayout`

GetNgBankPayout returns the NgBankPayout field if non-nil, zero value otherwise.

### GetNgBankPayoutOk

`func (o *UpdateFinancialInstrumentResponse) GetNgBankPayoutOk() (*NgBankPayout, bool)`

GetNgBankPayoutOk returns a tuple with the NgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNgBankPayout

`func (o *UpdateFinancialInstrumentResponse) SetNgBankPayout(v NgBankPayout)`

SetNgBankPayout sets NgBankPayout field to given value.

### HasNgBankPayout

`func (o *UpdateFinancialInstrumentResponse) HasNgBankPayout() bool`

HasNgBankPayout returns a boolean if a field has been set.

### GetGhBankPayout

`func (o *UpdateFinancialInstrumentResponse) GetGhBankPayout() GhBankPayout`

GetGhBankPayout returns the GhBankPayout field if non-nil, zero value otherwise.

### GetGhBankPayoutOk

`func (o *UpdateFinancialInstrumentResponse) GetGhBankPayoutOk() (*GhBankPayout, bool)`

GetGhBankPayoutOk returns a tuple with the GhBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGhBankPayout

`func (o *UpdateFinancialInstrumentResponse) SetGhBankPayout(v GhBankPayout)`

SetGhBankPayout sets GhBankPayout field to given value.

### HasGhBankPayout

`func (o *UpdateFinancialInstrumentResponse) HasGhBankPayout() bool`

HasGhBankPayout returns a boolean if a field has been set.

### GetRwBankPayout

`func (o *UpdateFinancialInstrumentResponse) GetRwBankPayout() RwBankPayout`

GetRwBankPayout returns the RwBankPayout field if non-nil, zero value otherwise.

### GetRwBankPayoutOk

`func (o *UpdateFinancialInstrumentResponse) GetRwBankPayoutOk() (*RwBankPayout, bool)`

GetRwBankPayoutOk returns a tuple with the RwBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwBankPayout

`func (o *UpdateFinancialInstrumentResponse) SetRwBankPayout(v RwBankPayout)`

SetRwBankPayout sets RwBankPayout field to given value.

### HasRwBankPayout

`func (o *UpdateFinancialInstrumentResponse) HasRwBankPayout() bool`

HasRwBankPayout returns a boolean if a field has been set.

### GetZaBankPayout

`func (o *UpdateFinancialInstrumentResponse) GetZaBankPayout() ZaBankPayout`

GetZaBankPayout returns the ZaBankPayout field if non-nil, zero value otherwise.

### GetZaBankPayoutOk

`func (o *UpdateFinancialInstrumentResponse) GetZaBankPayoutOk() (*ZaBankPayout, bool)`

GetZaBankPayoutOk returns a tuple with the ZaBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZaBankPayout

`func (o *UpdateFinancialInstrumentResponse) SetZaBankPayout(v ZaBankPayout)`

SetZaBankPayout sets ZaBankPayout field to given value.

### HasZaBankPayout

`func (o *UpdateFinancialInstrumentResponse) HasZaBankPayout() bool`

HasZaBankPayout returns a boolean if a field has been set.

### GetUgBankPayout

`func (o *UpdateFinancialInstrumentResponse) GetUgBankPayout() UgBankPayout`

GetUgBankPayout returns the UgBankPayout field if non-nil, zero value otherwise.

### GetUgBankPayoutOk

`func (o *UpdateFinancialInstrumentResponse) GetUgBankPayoutOk() (*UgBankPayout, bool)`

GetUgBankPayoutOk returns a tuple with the UgBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUgBankPayout

`func (o *UpdateFinancialInstrumentResponse) SetUgBankPayout(v UgBankPayout)`

SetUgBankPayout sets UgBankPayout field to given value.

### HasUgBankPayout

`func (o *UpdateFinancialInstrumentResponse) HasUgBankPayout() bool`

HasUgBankPayout returns a boolean if a field has been set.

### GetZmBankPayout

`func (o *UpdateFinancialInstrumentResponse) GetZmBankPayout() ZmBankPayout`

GetZmBankPayout returns the ZmBankPayout field if non-nil, zero value otherwise.

### GetZmBankPayoutOk

`func (o *UpdateFinancialInstrumentResponse) GetZmBankPayoutOk() (*ZmBankPayout, bool)`

GetZmBankPayoutOk returns a tuple with the ZmBankPayout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZmBankPayout

`func (o *UpdateFinancialInstrumentResponse) SetZmBankPayout(v ZmBankPayout)`

SetZmBankPayout sets ZmBankPayout field to given value.

### HasZmBankPayout

`func (o *UpdateFinancialInstrumentResponse) HasZmBankPayout() bool`

HasZmBankPayout returns a boolean if a field has been set.

### GetEthWallet

`func (o *UpdateFinancialInstrumentResponse) GetEthWallet() EthWallet`

GetEthWallet returns the EthWallet field if non-nil, zero value otherwise.

### GetEthWalletOk

`func (o *UpdateFinancialInstrumentResponse) GetEthWalletOk() (*EthWallet, bool)`

GetEthWalletOk returns a tuple with the EthWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthWallet

`func (o *UpdateFinancialInstrumentResponse) SetEthWallet(v EthWallet)`

SetEthWallet sets EthWallet field to given value.

### HasEthWallet

`func (o *UpdateFinancialInstrumentResponse) HasEthWallet() bool`

HasEthWallet returns a boolean if a field has been set.

### GetTronWallet

`func (o *UpdateFinancialInstrumentResponse) GetTronWallet() TronWallet`

GetTronWallet returns the TronWallet field if non-nil, zero value otherwise.

### GetTronWalletOk

`func (o *UpdateFinancialInstrumentResponse) GetTronWalletOk() (*TronWallet, bool)`

GetTronWalletOk returns a tuple with the TronWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTronWallet

`func (o *UpdateFinancialInstrumentResponse) SetTronWallet(v TronWallet)`

SetTronWallet sets TronWallet field to given value.

### HasTronWallet

`func (o *UpdateFinancialInstrumentResponse) HasTronWallet() bool`

HasTronWallet returns a boolean if a field has been set.

### GetSolWallet

`func (o *UpdateFinancialInstrumentResponse) GetSolWallet() SolWallet`

GetSolWallet returns the SolWallet field if non-nil, zero value otherwise.

### GetSolWalletOk

`func (o *UpdateFinancialInstrumentResponse) GetSolWalletOk() (*SolWallet, bool)`

GetSolWalletOk returns a tuple with the SolWallet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSolWallet

`func (o *UpdateFinancialInstrumentResponse) SetSolWallet(v SolWallet)`

SetSolWallet sets SolWallet field to given value.

### HasSolWallet

`func (o *UpdateFinancialInstrumentResponse) HasSolWallet() bool`

HasSolWallet returns a boolean if a field has been set.

### GetBrPix

`func (o *UpdateFinancialInstrumentResponse) GetBrPix() BrPix`

GetBrPix returns the BrPix field if non-nil, zero value otherwise.

### GetBrPixOk

`func (o *UpdateFinancialInstrumentResponse) GetBrPixOk() (*BrPix, bool)`

GetBrPixOk returns a tuple with the BrPix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrPix

`func (o *UpdateFinancialInstrumentResponse) SetBrPix(v BrPix)`

SetBrPix sets BrPix field to given value.

### HasBrPix

`func (o *UpdateFinancialInstrumentResponse) HasBrPix() bool`

HasBrPix returns a boolean if a field has been set.

### GetCoPse

`func (o *UpdateFinancialInstrumentResponse) GetCoPse() CoPse`

GetCoPse returns the CoPse field if non-nil, zero value otherwise.

### GetCoPseOk

`func (o *UpdateFinancialInstrumentResponse) GetCoPseOk() (*CoPse, bool)`

GetCoPseOk returns a tuple with the CoPse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoPse

`func (o *UpdateFinancialInstrumentResponse) SetCoPse(v CoPse)`

SetCoPse sets CoPse field to given value.

### HasCoPse

`func (o *UpdateFinancialInstrumentResponse) HasCoPse() bool`

HasCoPse returns a boolean if a field has been set.

### GetBrTed

`func (o *UpdateFinancialInstrumentResponse) GetBrTed() BrTed`

GetBrTed returns the BrTed field if non-nil, zero value otherwise.

### GetBrTedOk

`func (o *UpdateFinancialInstrumentResponse) GetBrTedOk() (*BrTed, bool)`

GetBrTedOk returns a tuple with the BrTed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrTed

`func (o *UpdateFinancialInstrumentResponse) SetBrTed(v BrTed)`

SetBrTed sets BrTed field to given value.

### HasBrTed

`func (o *UpdateFinancialInstrumentResponse) HasBrTed() bool`

HasBrTed returns a boolean if a field has been set.

### GetCaEft

`func (o *UpdateFinancialInstrumentResponse) GetCaEft() CaEft`

GetCaEft returns the CaEft field if non-nil, zero value otherwise.

### GetCaEftOk

`func (o *UpdateFinancialInstrumentResponse) GetCaEftOk() (*CaEft, bool)`

GetCaEftOk returns a tuple with the CaEft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaEft

`func (o *UpdateFinancialInstrumentResponse) SetCaEft(v CaEft)`

SetCaEft sets CaEft field to given value.

### HasCaEft

`func (o *UpdateFinancialInstrumentResponse) HasCaEft() bool`

HasCaEft returns a boolean if a field has been set.

### GetKrKftc

`func (o *UpdateFinancialInstrumentResponse) GetKrKftc() KrKftc`

GetKrKftc returns the KrKftc field if non-nil, zero value otherwise.

### GetKrKftcOk

`func (o *UpdateFinancialInstrumentResponse) GetKrKftcOk() (*KrKftc, bool)`

GetKrKftcOk returns a tuple with the KrKftc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKrKftc

`func (o *UpdateFinancialInstrumentResponse) SetKrKftc(v KrKftc)`

SetKrKftc sets KrKftc field to given value.

### HasKrKftc

`func (o *UpdateFinancialInstrumentResponse) HasKrKftc() bool`

HasKrKftc returns a boolean if a field has been set.

### GetInNeft

`func (o *UpdateFinancialInstrumentResponse) GetInNeft() InNeft`

GetInNeft returns the InNeft field if non-nil, zero value otherwise.

### GetInNeftOk

`func (o *UpdateFinancialInstrumentResponse) GetInNeftOk() (*InNeft, bool)`

GetInNeftOk returns a tuple with the InNeft field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInNeft

`func (o *UpdateFinancialInstrumentResponse) SetInNeft(v InNeft)`

SetInNeft sets InNeft field to given value.

### HasInNeft

`func (o *UpdateFinancialInstrumentResponse) HasInNeft() bool`

HasInNeft returns a boolean if a field has been set.

### GetPeLbtr

`func (o *UpdateFinancialInstrumentResponse) GetPeLbtr() PeLbtr`

GetPeLbtr returns the PeLbtr field if non-nil, zero value otherwise.

### GetPeLbtrOk

`func (o *UpdateFinancialInstrumentResponse) GetPeLbtrOk() (*PeLbtr, bool)`

GetPeLbtrOk returns a tuple with the PeLbtr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeLbtr

`func (o *UpdateFinancialInstrumentResponse) SetPeLbtr(v PeLbtr)`

SetPeLbtr sets PeLbtr field to given value.

### HasPeLbtr

`func (o *UpdateFinancialInstrumentResponse) HasPeLbtr() bool`

HasPeLbtr returns a boolean if a field has been set.

### GetAuNpp

`func (o *UpdateFinancialInstrumentResponse) GetAuNpp() AuNpp`

GetAuNpp returns the AuNpp field if non-nil, zero value otherwise.

### GetAuNppOk

`func (o *UpdateFinancialInstrumentResponse) GetAuNppOk() (*AuNpp, bool)`

GetAuNppOk returns a tuple with the AuNpp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuNpp

`func (o *UpdateFinancialInstrumentResponse) SetAuNpp(v AuNpp)`

SetAuNpp sets AuNpp field to given value.

### HasAuNpp

`func (o *UpdateFinancialInstrumentResponse) HasAuNpp() bool`

HasAuNpp returns a boolean if a field has been set.

### GetCnCfxps

`func (o *UpdateFinancialInstrumentResponse) GetCnCfxps() CnCfxps`

GetCnCfxps returns the CnCfxps field if non-nil, zero value otherwise.

### GetCnCfxpsOk

`func (o *UpdateFinancialInstrumentResponse) GetCnCfxpsOk() (*CnCfxps, bool)`

GetCnCfxpsOk returns a tuple with the CnCfxps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCnCfxps

`func (o *UpdateFinancialInstrumentResponse) SetCnCfxps(v CnCfxps)`

SetCnCfxps sets CnCfxps field to given value.

### HasCnCfxps

`func (o *UpdateFinancialInstrumentResponse) HasCnCfxps() bool`

HasCnCfxps returns a boolean if a field has been set.

### GetClTef

`func (o *UpdateFinancialInstrumentResponse) GetClTef() ClTef`

GetClTef returns the ClTef field if non-nil, zero value otherwise.

### GetClTefOk

`func (o *UpdateFinancialInstrumentResponse) GetClTefOk() (*ClTef, bool)`

GetClTefOk returns a tuple with the ClTef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClTef

`func (o *UpdateFinancialInstrumentResponse) SetClTef(v ClTef)`

SetClTef sets ClTef field to given value.

### HasClTef

`func (o *UpdateFinancialInstrumentResponse) HasClTef() bool`

HasClTef returns a boolean if a field has been set.

### GetAeIpi

`func (o *UpdateFinancialInstrumentResponse) GetAeIpi() AeIpi`

GetAeIpi returns the AeIpi field if non-nil, zero value otherwise.

### GetAeIpiOk

`func (o *UpdateFinancialInstrumentResponse) GetAeIpiOk() (*AeIpi, bool)`

GetAeIpiOk returns a tuple with the AeIpi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAeIpi

`func (o *UpdateFinancialInstrumentResponse) SetAeIpi(v AeIpi)`

SetAeIpi sets AeIpi field to given value.

### HasAeIpi

`func (o *UpdateFinancialInstrumentResponse) HasAeIpi() bool`

HasAeIpi returns a boolean if a field has been set.

### GetArInterbanking

`func (o *UpdateFinancialInstrumentResponse) GetArInterbanking() ArInterbanking`

GetArInterbanking returns the ArInterbanking field if non-nil, zero value otherwise.

### GetArInterbankingOk

`func (o *UpdateFinancialInstrumentResponse) GetArInterbankingOk() (*ArInterbanking, bool)`

GetArInterbankingOk returns a tuple with the ArInterbanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArInterbanking

`func (o *UpdateFinancialInstrumentResponse) SetArInterbanking(v ArInterbanking)`

SetArInterbanking sets ArInterbanking field to given value.

### HasArInterbanking

`func (o *UpdateFinancialInstrumentResponse) HasArInterbanking() bool`

HasArInterbanking returns a boolean if a field has been set.

### GetCurrency

`func (o *UpdateFinancialInstrumentResponse) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *UpdateFinancialInstrumentResponse) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *UpdateFinancialInstrumentResponse) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetLabel

`func (o *UpdateFinancialInstrumentResponse) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *UpdateFinancialInstrumentResponse) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *UpdateFinancialInstrumentResponse) SetLabel(v string)`

SetLabel sets Label field to given value.

### HasLabel

`func (o *UpdateFinancialInstrumentResponse) HasLabel() bool`

HasLabel returns a boolean if a field has been set.

### GetFinancialInstrumentType

`func (o *UpdateFinancialInstrumentResponse) GetFinancialInstrumentType() string`

GetFinancialInstrumentType returns the FinancialInstrumentType field if non-nil, zero value otherwise.

### GetFinancialInstrumentTypeOk

`func (o *UpdateFinancialInstrumentResponse) GetFinancialInstrumentTypeOk() (*string, bool)`

GetFinancialInstrumentTypeOk returns a tuple with the FinancialInstrumentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinancialInstrumentType

`func (o *UpdateFinancialInstrumentResponse) SetFinancialInstrumentType(v string)`

SetFinancialInstrumentType sets FinancialInstrumentType field to given value.


### GetCountry

`func (o *UpdateFinancialInstrumentResponse) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *UpdateFinancialInstrumentResponse) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *UpdateFinancialInstrumentResponse) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *UpdateFinancialInstrumentResponse) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetFinancialInstrumentId

`func (o *UpdateFinancialInstrumentResponse) GetFinancialInstrumentId() string`

GetFinancialInstrumentId returns the FinancialInstrumentId field if non-nil, zero value otherwise.

### GetFinancialInstrumentIdOk

`func (o *UpdateFinancialInstrumentResponse) GetFinancialInstrumentIdOk() (*string, bool)`

GetFinancialInstrumentIdOk returns a tuple with the FinancialInstrumentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinancialInstrumentId

`func (o *UpdateFinancialInstrumentResponse) SetFinancialInstrumentId(v string)`

SetFinancialInstrumentId sets FinancialInstrumentId field to given value.


### GetCreatedAt

`func (o *UpdateFinancialInstrumentResponse) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *UpdateFinancialInstrumentResponse) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *UpdateFinancialInstrumentResponse) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *UpdateFinancialInstrumentResponse) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *UpdateFinancialInstrumentResponse) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *UpdateFinancialInstrumentResponse) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *UpdateFinancialInstrumentResponse) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *UpdateFinancialInstrumentResponse) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


