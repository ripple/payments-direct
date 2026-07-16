# CnTrade

Rails: CNAPS, SIB (IBPS), CUP, NUCC  Rail Definitions:  CNAPS: - Availability: Business days and banking hours only (HVPS); batch throughout day (BEPS) - Limit: No limit (HVPS); CNY 50,000 (BEPS) - Settlement: Same-day (HVPS real-time gross; BEPS batched) - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply  SIB / IBPS (Super Internet Banking / Internet Banking Payment System): - Availability: 24/7/365 - Limit: Varies by bank - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  CUP (China UnionPay): - Availability: 24/7/365 - Limit: Varies by bank and account type - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  NUCC (NetsUnion Clearing Corporation): - Availability: 24/7/365 - Limit: Varies - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Determined at runtime based on transaction type, amount, and operational conditions. All rails use the same CNAPS bank codes for routing.  Purpose codes: GDDS (Goods), SCVE (Services) — trade-only. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | Beneficiary Bank Name. Looked up from bankCode. | [default to undefined]
**bankCode** | **string** | Beneficiary Bank Code (CNAPS). List provided in the Ripple Docs Bank Codes utility. | [default to undefined]
**branchName** | **string** | Beneficiary Branch Name (Hanzi). Branch name in Chinese Hanzi characters. | [default to undefined]
**branchProvince** | **string** | Beneficiary Bank Branch Province. Province/region codes — 34 values published on Docs (e.g., 110000&#x3D;北京, 310000&#x3D;上海). | [default to undefined]
**branchCity** | **string** | Beneficiary Bank Branch City. City codes — 700+ values published on Docs (e.g., 110000&#x3D;北京, 130100&#x3D;石家庄). | [default to undefined]
**accountNumber** | **string** | Beneficiary Account Number. | [default to undefined]
**accountHolderName** | **string** | Beneficiary Account Holder Name (Hanzi). Account name in Chinese Hanzi characters. | [default to undefined]

## Example

```typescript
import { CnTrade } from '@ripple/payments-direct-client';

const instance: CnTrade = {
    bankName,
    bankCode,
    branchName,
    branchProvince,
    branchCity,
    accountNumber,
    accountHolderName,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
