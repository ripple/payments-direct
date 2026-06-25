# GhBankPayout

Rails: GIP  Rail Definitions:   GIP:     - Availability: 24/7/365     - Limit: ₵100,000     - Settlement: Real time to 48 hours     - Cut-off time: Real time     - Banking holidays: Applicable  Routing Evaluation Order:   1. GIP – Conditions: Account addressability, amount ≤ ₵100,000 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The bank code of the identity\&#39;s bank | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]

## Example

```typescript
import { GhBankPayout } from '@ripple/payments-direct-client';

const instance: GhBankPayout = {
    bankName,
    bankCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
