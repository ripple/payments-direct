# Sort

Specify sorting direction and the filtering criterion to sort by.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortField** | [**PaymentSortField**](PaymentSortField.md) |  | [optional] [default to undefined]
**sortDirection** | **string** | Sort results in ascending or descending order. | [optional] [default to SortDirectionEnum_DESC]

## Example

```typescript
import { Sort } from '@ripple/payments-direct-client';

const instance: Sort = {
    sortField,
    sortDirection,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
