# PaymentsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Array&lt;Payment&gt;**](Payment.md) | Array of Payment objects | [optional] [default to undefined]
**filter** | [**PaymentFilter**](PaymentFilter.md) |  | [optional] [default to undefined]
**sort** | [**Sort**](Sort.md) |  | [optional] [default to undefined]
**page** | [**Page**](Page.md) |  | [optional] [default to undefined]

## Example

```typescript
import { PaymentsResponse } from '@ripple/payments-direct-client';

const instance: PaymentsResponse = {
    data,
    filter,
    sort,
    page,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
