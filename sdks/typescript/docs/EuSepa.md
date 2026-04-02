# EuSepa

Rails: SCT Inst, SCT  Rail Definitions:  SCT Inst: - Availability: 24/7/365 - Limit: €100,000 (bank-dependent) - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  SCT: - Availability: Business days only - Limit: No limit - Settlement: T+2 to T+5  - Cut-off time: 3:00PM GMT/BST - Banking holidays: TARGET2 holidays apply  Routing Evaluation Order:    1. SCT Inst        - Conditions: beneficiary account is SCT Inst-addressable AND amount ≤ €100,000   2. SCT        - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**iban** | **string** | The International Bank Account Number (IBAN) of the identity\&#39;s account | [default to undefined]

## Example

```typescript
import { EuSepa } from '@ripple/payments-direct-client';

const instance: EuSepa = {
    bankName,
    iban,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
