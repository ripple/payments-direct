# KrKftc

Rails: KFTC (Korea Financial Telecommunications and Clearings)  Rail Definitions:  KFTC: - Availability: 24/7/365 - Limit: KRW 10,000,000 per transaction (varies) - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | KFTC-assigned Korean domestic clearing code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]

## Example

```typescript
import { KrKftc } from '@ripple/payments-direct-client';

const instance: KrKftc = {
    bankName,
    bankCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
