# BrPix

Rails: PIX  Rail Definitions:  PIX: - Availability: 24/7/365 - Limit: No limit - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The code of the identity\&#39;s bank (BICFI code) | [default to undefined]
**branchNumber** | **string** | The identity\&#39;s bank branch number | [default to undefined]
**pixKey** | **string** | The identity\&#39;s PIX key, which can be an email, phone number, or a hash | [default to undefined]
**pixKeyType** | **string** | The type of PIX key used by the identity. | [default to undefined]

## Example

```typescript
import { BrPix } from '@ripple/payments-direct-client';

const instance: BrPix = {
    bankName,
    bankCode,
    branchNumber,
    pixKey,
    pixKeyType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
