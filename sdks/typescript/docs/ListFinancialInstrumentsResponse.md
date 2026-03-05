# ListFinancialInstrumentsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Array&lt;FinancialInstrumentMetadata&gt;**](FinancialInstrumentMetadata.md) | The list of the financial instruments that match the query parameters | [optional] [default to undefined]
**nextToken** | **string** | The token to retrieve the next page of results | [optional] [default to undefined]

## Example

```typescript
import { ListFinancialInstrumentsResponse } from '@ripple/payments-direct-client';

const instance: ListFinancialInstrumentsResponse = {
    data,
    nextToken,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
