# CoPse

Rails: PSE  Rail Definitions:  PSE: - Availability: Business days and banking hours only - Limit: None - Settlement:   - Major banks (Bancolombia, Davivienda, Banco de Bogotá, BBVA, Grupo Aval, Nequi): 35–100 min  - Other banks (via ACH): Same-day or T+1 depending on cutoff - Cut-off time: 3PM COT - Banking holidays: Colombia banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The identity\&#39;s bank identifier code | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]
**accountType** | **string** | The type of account associated with the identity. | [default to undefined]

## Example

```typescript
import { CoPse } from '@ripple/payments-direct-client';

const instance: CoPse = {
    bankName,
    bankCode,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
