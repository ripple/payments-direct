# ArInterbanking

Rails: Interbanking  Rail Definitions:  Interbanking: - Availability: Business days only - Limit: ARS 10,000,000 - Settlement: Same-day or next business day - Cut-off time: 3:00 PM ART - Banking holidays: Argentina banking holidays apply  Routing Evaluation Order: AR_INTERBANKING has a single payment rail; no routing evaluation order applies. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank. Must begin and end with a letter or digit, and consecutive identical punctuation characters are not permitted. | [default to undefined]
**bankCode** | **string** | BCRA-assigned 3-digit Argentine bank code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number (CBU or CVU) | [default to undefined]
**accountType** | **string** | The identity\&#39;s account type | [default to undefined]

## Example

```typescript
import { ArInterbanking } from '@ripple/payments-direct-client';

const instance: ArInterbanking = {
    bankName,
    bankCode,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
