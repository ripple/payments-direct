# CaEft

Rails: EFT  Rail Definitions:  EFT: - Availability: Business days only - Limit: CAD 1,000,000 - Settlement: T+1 - Cut-off time: ~4:30 PM EST - Banking holidays: Canadian banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**institutionNumber** | **string** | The institution number of the identity\&#39;s bank | [default to undefined]
**transitNumber** | **string** | The transit number of the identity\&#39;s bank account | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]
**accountType** | **string** | The identity’s account type. | [default to undefined]

## Example

```typescript
import { CaEft } from '@ripple/payments-direct-client';

const instance: CaEft = {
    bankName,
    institutionNumber,
    transitNumber,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
