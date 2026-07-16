# PeLbtr

Rails: LBTR (Sistema de Liquidación Bruta en Tiempo Real)  Rail Definitions:  LBTR: - Availability: Business days and banking hours only - Limit: Minimum Transaction amount is 5 USD - Settlement: Same-day - Cut-off time: 3:00 PM PET - Banking holidays: Peru banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**swiftCode** | **string** | SWIFT/BIC code of the identity\&#39;s bank | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]
**accountType** | **string** | The identity\&#39;s account type | [default to undefined]

## Example

```typescript
import { PeLbtr } from '@ripple/payments-direct-client';

const instance: PeLbtr = {
    bankName,
    swiftCode,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
