

# TrFastDTO

Rails: FAST (Fast Electronic Fund Transfer), EFT (Elektronik Fon Transferi)  Rail Definitions:  FAST: - Availability: 24/7/365 - Limit: No limit - Settlement: Real-time (within minutes) - Cut-off time: None - Banking holidays: Not applicable  EFT: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 5:30 PM TRT - Banking holidays: Turkey banking holidays apply  Routing Evaluation Order:   1. FAST      - Conditions: beneficiary account is FAST-addressable   2. EFT      - Conditions: otherwise applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**iban** | **String** | Turkey IBAN (26 characters, starting with TR) |  |
|**bankCode** | **String** | SWIFT/BIC code of the identity&#39;s bank. Named bankCode for v2 ADR compatibility; maps to BICFI in ISO 20022. |  |



