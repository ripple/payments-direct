# SearchPaymentsRequest

Request body containing search criteria for payments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**PaymentFilter**](PaymentFilter.md) |  | [optional] [default to undefined]
**sort** | [**Sort**](Sort.md) |  | [optional] [default to undefined]
**page** | [**Page**](Page.md) |  | [optional] [default to undefined]

## Example

```typescript
import { SearchPaymentsRequest } from '@ripple/payments-direct-client';

const instance: SearchPaymentsRequest = {
    filter,
    sort,
    page,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
