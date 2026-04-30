# MxSpei

Rails: SPEI  Rail Definitions:  SPEI: - Availability: 24/7/365 - Limit: None - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**clabe** | **string** | The identity\&#39;s CLABE account identification code | [default to undefined]

## Example

```typescript
import { MxSpei } from '@ripple/payments-direct-client';

const instance: MxSpei = {
    bankName,
    clabe,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
