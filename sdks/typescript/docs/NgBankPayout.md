# NgBankPayout

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Country-dependant - Limit: - Nigeria: ₦5,000,000 - Settlement: Real time to 48 hours - Cut-off time: Real time - Banking holidays: Nigeria banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The bank code of the identity\&#39;s bank | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]
**country** | **string** | The country of the identity’s bank, using the Alpha-2 code as defined in ISO 3166-1. | [default to undefined]

## Example

```typescript
import { NgBankPayout } from '@ripple/payments-direct-client';

const instance: NgBankPayout = {
    bankName,
    bankCode,
    accountNumber,
    country,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
