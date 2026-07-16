# InNeft

Rails: NEFT (National Electronic Funds Transfer)  Rail Definitions:  NEFT: - Availability: Business days and banking hours only - Limit: No limit - Settlement: Same-day (by end of business day) - Cut-off time: 7:00 PM IST (varies by bank) - Banking holidays: India banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**ifscCode** | **string** | The 11-character IFSC code of the identity\&#39;s bank branch | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]

## Example

```typescript
import { InNeft } from '@ripple/payments-direct-client';

const instance: InNeft = {
    bankName,
    ifscCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
