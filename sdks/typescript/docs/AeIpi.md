# AeIpi

Rails: IPI, FTS  Rail Definitions:  IPI: - Availability: 24/7/365 - Limit: AED 25,000 - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  FTS: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: ~2:00 PM GST - Banking holidays: UAE Central Bank holidays apply  Routing Evaluation Order:   1. IPI        - Conditions: beneficiary account is IPI-addressable AND amount ≤ AED 25,000   2. FTS        - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**iban** | **string** | The International Bank Account Number (IBAN) of the identity\&#39;s account | [default to undefined]

## Example

```typescript
import { AeIpi } from '@ripple/payments-direct-client';

const instance: AeIpi = {
    bankName,
    iban,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
