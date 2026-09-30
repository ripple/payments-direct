# JpZengin

Rails: Zengin, Zengin Prompt Service  Rail Definitions:  Zengin: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 9:00 PM JST (varies by bank) - Banking holidays: Japan banking holidays apply  Zengin Prompt Service: - Availability: 24/7/365 - Limit: JPY 1,000,000 (typically) - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order:   1. Zengin Prompt Service      - Conditions: beneficiary account is ZPS-addressable AND amount ≤ JPY 1,000,000   2. Zengin      - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**accountHolderName** | **string** | Name of the account holder in Japanese Katakana characters | [default to undefined]
**bankCode** | **string** | Zengin-Net/BOJ-assigned 4-digit Japanese bank code (e.g. 0001 Mizuho Bank, 0005 MUFG Bank). See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | [default to undefined]
**branchCode** | **string** | Bank-assigned branch code identifying the specific branch | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]
**accountType** | **string** | The identity\&#39;s account type | [default to undefined]

## Example

```typescript
import { JpZengin } from '@ripple/payments-direct-client';

const instance: JpZengin = {
    bankName,
    accountHolderName,
    bankCode,
    branchCode,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
