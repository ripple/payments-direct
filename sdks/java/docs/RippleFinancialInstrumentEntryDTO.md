

# RippleFinancialInstrumentEntryDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**usAch** | [**UsAchDTO**](UsAchDTO.md) |  |  [optional] |
|**usFedwire** | [**UsFedwireDTO**](UsFedwireDTO.md) |  |  [optional] |
|**mxSpei** | [**MxSpeiDTO**](MxSpeiDTO.md) |  |  [optional] |
|**euSepa** | [**EuSepaDTO**](EuSepaDTO.md) |  |  [optional] |
|**gbFps** | [**GbFpsDTO**](GbFpsDTO.md) |  |  [optional] |
|**ngBankPayout** | [**NgBankPayoutDTO**](NgBankPayoutDTO.md) |  |  [optional] |
|**ghBankPayout** | [**GhBankPayoutDTO**](GhBankPayoutDTO.md) |  |  [optional] |
|**rwBankPayout** | [**RwBankPayoutDTO**](RwBankPayoutDTO.md) |  |  [optional] |
|**zaBankPayout** | [**ZaBankPayoutDTO**](ZaBankPayoutDTO.md) |  |  [optional] |
|**ugBankPayout** | [**UgBankPayoutDTO**](UgBankPayoutDTO.md) |  |  [optional] |
|**zmBankPayout** | [**ZmBankPayoutDTO**](ZmBankPayoutDTO.md) |  |  [optional] |
|**ethWallet** | [**EthWalletDTO**](EthWalletDTO.md) |  |  [optional] |
|**tronWallet** | [**TronWalletDTO**](TronWalletDTO.md) |  |  [optional] |
|**solWallet** | [**SolWalletDTO**](SolWalletDTO.md) |  |  [optional] |
|**brPix** | [**BrPixDTO**](BrPixDTO.md) |  |  [optional] |
|**coPse** | [**CoPseDTO**](CoPseDTO.md) |  |  [optional] |
|**brTed** | [**BrTedDTO**](BrTedDTO.md) |  |  [optional] |
|**caEft** | [**CaEftDTO**](CaEftDTO.md) |  |  [optional] |
|**hkBankPayout** | [**HkBankPayoutDTO**](HkBankPayoutDTO.md) |  |  [optional] |
|**cnTrade** | [**CnTradeDTO**](CnTradeDTO.md) |  |  [optional] |
|**cnIndividual** | [**CnIndividualDTO**](CnIndividualDTO.md) |  |  [optional] |
|**cnIndividualTrade** | [**CnIndividualTradeDTO**](CnIndividualTradeDTO.md) |  |  [optional] |
|**cnCfxps** | [**CnCfxpsDTO**](CnCfxpsDTO.md) |  |  [optional] |
|**currency** | **String** | The 3-letter ISO currency code of the financial instrument. |  |
|**label** | **String** | A user-defined label for the financial instrument. |  [optional] |
|**financialInstrumentType** | **String** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  |  |
|**country** | **String** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. For crypto wallet instruments (ETH_WALLET, TRON_WALLET, SOL_WALLET), this field returns &#x60;ZZ&#x60;, the ISO 3166-1 user-assigned code used when no country jurisdiction applies.  |  [optional] |
|**financialInstrumentId** | **String** | The unique identifier of the financial instrument. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which the financial instrument was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time at which the financial instrument was last updated |  [optional] |



