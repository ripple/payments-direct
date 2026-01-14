

# RippleFinancialInstrumentEntryDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**usAch** | [**UsAchDTO**](UsAchDTO.md) |  |  [optional] |
|**usFedwire** | [**UsFedwireDTO**](UsFedwireDTO.md) |  |  [optional] |
|**mxSpei** | [**MxSpeiDTO**](MxSpeiDTO.md) |  |  [optional] |
|**euSepa** | [**EuSepaDTO**](EuSepaDTO.md) |  |  [optional] |
|**gbFps** | [**GbFpsDTO**](GbFpsDTO.md) |  |  [optional] |
|**africaBankPayout** | [**AfricaBankPayoutDTO**](AfricaBankPayoutDTO.md) |  |  [optional] |
|**brPix** | [**BrPixDTO**](BrPixDTO.md) |  |  [optional] |
|**coPse** | [**CoPseDTO**](CoPseDTO.md) |  |  [optional] |
|**brTed** | [**BrTedDTO**](BrTedDTO.md) |  |  [optional] |
|**caEft** | [**CaEftDTO**](CaEftDTO.md) |  |  [optional] |
|**currency** | **String** | The 3-letter ISO currency code of the financial instrument. |  |
|**label** | **String** | A user-defined label for the financial instrument. |  [optional] |
|**financialInstrumentType** | **String** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  |  |
|**country** | **String** | The country of the financial instrument. |  [optional] |
|**financialInstrumentId** | **String** | The unique identifier of the financial instrument. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which the financial instrument was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time at which the financial instrument was last updated |  [optional] |



