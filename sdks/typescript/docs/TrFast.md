# TrFast

Rails: FAST (Fast Electronic Fund Transfer), EFT (Elektronik Fon Transferi)  Rail Definitions:  FAST: - Availability: 24/7/365 - Limit: No limit - Settlement: Real-time (within minutes) - Cut-off time: None - Banking holidays: Not applicable  EFT: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 5:30 PM TRT - Banking holidays: Turkey banking holidays apply  Routing Evaluation Order:   1. FAST      - Conditions: beneficiary account is FAST-addressable   2. EFT      - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**iban** | **string** | Turkey IBAN (26 characters, starting with TR) | [default to undefined]
**bankCode** | **string** | SWIFT/BIC code of the identity\&#39;s bank. Named bankCode for v2 ADR compatibility; maps to BICFI in ISO 20022. | [default to undefined]

## Example

```typescript
import { TrFast } from '@ripple/payments-direct-client';

const instance: TrFast = {
    bankName,
    iban,
    bankCode,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
