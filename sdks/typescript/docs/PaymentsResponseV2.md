# PaymentsResponseV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Array&lt;PaymentV2&gt;**](PaymentV2.md) | Array of Payment objects | [optional] [default to undefined]
**filter** | [**PaymentFilterV2**](PaymentFilterV2.md) |  | [optional] [default to undefined]
**sort** | [**SortV2**](SortV2.md) |  | [optional] [default to undefined]
**page** | [**Page**](Page.md) |  | [optional] [default to undefined]

## Example

```typescript
import { PaymentsResponseV2 } from '@ripple/payments-direct-client';

const instance: PaymentsResponseV2 = {
    data,
    filter,
    sort,
    page,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
