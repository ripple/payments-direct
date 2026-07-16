# ClTef

Rails: TEF (Transferencia Electrónica de Fondos)  Rail Definitions:  TEF: - Availability: Business days only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 3:00 PM CLT - Banking holidays: Chile banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**swiftCode** | **string** | SWIFT/BIC code of the identity\&#39;s bank | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]
**accountType** | **string** | The identity\&#39;s account type | [default to undefined]

## Example

```typescript
import { ClTef } from '@ripple/payments-direct-client';

const instance: ClTef = {
    bankName,
    swiftCode,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
