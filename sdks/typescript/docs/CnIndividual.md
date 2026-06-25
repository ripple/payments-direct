# CnIndividual

Rails: CUP (China UnionPay), CNAPS  Rail Definitions:  CUP (China UnionPay): - Availability: 24/7/365 - Limit: Varies by bank and account type - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable  CNAPS: - Availability: Business days and banking hours only (HVPS); batch throughout day (BEPS) - Limit: No limit (HVPS); CNY 30,000 limit to individuals; - Settlement: Same-day (HVPS real-time gross; BEPS batched) - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply  Routing Evaluation Order: Determined at runtime. CUP is the primary rail for card-based account routing. CNAPS may be used for bank account routing depending on account type. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | Beneficiary Bank Name in English. Published list available at docs.ripple.com. | [default to undefined]
**bankCode** | **string** | Beneficiary Bank Code. Published bank code list at docs.ripple.com. | [default to undefined]
**accountNumber** | **string** | Beneficiary Account Number. | [default to undefined]

## Example

```typescript
import { CnIndividual } from '@ripple/payments-direct-client';

const instance: CnIndividual = {
    bankName,
    bankCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
