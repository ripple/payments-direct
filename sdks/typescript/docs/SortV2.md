# SortV2

Defines the sorting parameters for listing payments, including the field and sort direction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortField** | **string** | The field to use when sorting payments in the requested sort order. Currently supported values include: - &#x60;internalId&#x60; - &#x60;paymentState&#x60; - &#x60;sourceCurrency&#x60; - &#x60;sourceAmount&#x60; - &#x60;destinationCurrency&#x60; - &#x60;destinationCountry&#x60; - &#x60;destinationAmount&#x60; - &#x60;initiatedAt&#x60; - &#x60;expiresAt&#x60; - &#x60;lastStateUpdatedAt&#x60; - &#x60;paymentLabel&#x60; If an unsupported value is provided, the request fails with a validation error.  | [optional] [default to 'initiatedAt']
**sortDirection** | **string** | Indicates whether results are sorted in ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [default to SortDirectionEnum_DESC]

## Example

```typescript
import { SortV2 } from '@ripple/payments-direct-client';

const instance: SortV2 = {
    sortField,
    sortDirection,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
