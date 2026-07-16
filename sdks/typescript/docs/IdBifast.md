# IdBifast

Rails: BI-FAST  Rail Definitions:  BI-FAST: - Availability: 24/7/365 - Limit: IDR 50,000,000 - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | Bank Indonesia-assigned domestic clearing code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]

## Example

```typescript
import { IdBifast } from '@ripple/payments-direct-client';

const instance: IdBifast = {
    bankName,
    bankCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
