# GbFps

Rails: FPS, CHAPS  Rail Definitions:  FPS: - Availability: 24/7/365 - Limit: £1,000,000 - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  CHAPS: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: Typically 5:00 PM GMT/BST (bank-dependent) - Banking holidays: UK banking holidays apply  Routing Evaluation Order:   1. FPS        - Conditions: beneficiary account is FPS-addressable AND amount ≤ £1,000,000   2. CHAPS        - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**sortCode** | **string** | The sort code of the identity\&#39;s bank account | [default to undefined]
**accountNumber** | **string** | The account number of the identity\&#39;s bank account | [default to undefined]

## Example

```typescript
import { GbFps } from '@ripple/payments-direct-client';

const instance: GbFps = {
    bankName,
    sortCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
