

# JpZenginDTO

Rails: Zengin, Zengin Prompt Service  Rail Definitions:  Zengin: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 9:00 PM JST (varies by bank) - Banking holidays: Japan banking holidays apply  Zengin Prompt Service: - Availability: 24/7/365 - Limit: JPY 1,000,000 (typically) - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order:   1. Zengin Prompt Service      - Conditions: beneficiary account is ZPS-addressable AND amount ≤ JPY 1,000,000   2. Zengin      - Conditions: otherwise applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**accountHolderName** | **String** | Name of the account holder in Japanese Katakana characters |  |
|**bankCode** | **String** | Zengin-Net/BOJ-assigned 4-digit Japanese bank code (e.g. 0001 Mizuho Bank, 0005 MUFG Bank). See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. |  |
|**branchCode** | **String** | Bank-assigned branch code identifying the specific branch |  |
|**accountNumber** | **String** | The identity&#39;s bank account number |  |
|**accountType** | **String** | The identity&#39;s account type |  |



