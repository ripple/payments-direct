# ThPromptpay

Rails: PromptPay  Rail Definitions:  PromptPay (National ITMX):   - Availability: 24/7/365   - Limit: THB 500,000 per transaction   - Settlement: Real-time (within seconds)   - Cut-off time: None   - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | Domestic bank code for the identity\&#39;s bank in Thailand. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]

## Example

```typescript
import { ThPromptpay } from '@ripple/payments-direct-client';

const instance: ThPromptpay = {
    bankName,
    bankCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
