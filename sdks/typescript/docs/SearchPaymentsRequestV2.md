# SearchPaymentsRequestV2

Request body containing search criteria for payments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**PaymentFilterV2**](PaymentFilterV2.md) |  | [optional] [default to undefined]
**sort** | [**SortV2**](SortV2.md) |  | [optional] [default to undefined]
**page** | [**Page**](Page.md) |  | [optional] [default to undefined]

## Example

```typescript
import { SearchPaymentsRequestV2 } from '@ripple/payments-direct-client';

const instance: SearchPaymentsRequestV2 = {
    filter,
    sort,
    page,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
