# RwBankPayout

Rails: RSwitch  Rail Definitions:   RSwitch:     - Availability: 24/7/365     - Limit: RWF 10,000,000     - Settlement: Real time to 48 hours     - Cut-off time: Real time     - Banking holidays: Applicable  Routing Evaluation Order:   1. RSwitch – Conditions: Account addressability, amount ≤ RWF 10,000,000 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The bank code of the identity\&#39;s bank | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]

## Example

```typescript
import { RwBankPayout } from '@ripple/payments-direct-client';

const instance: RwBankPayout = {
    bankName,
    bankCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
