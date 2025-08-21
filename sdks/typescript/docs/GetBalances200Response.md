# GetBalances200Response

Customer available prefund balance details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **string** | Timestamp of the balance response. | [default to undefined]
**balances** | [**Array&lt;GetBalances200ResponseBalancesInner&gt;**](GetBalances200ResponseBalancesInner.md) | List of available prefund balances. | [default to undefined]

## Example

```typescript
import { GetBalances200Response } from '@ripple/payments-direct-client';

const instance: GetBalances200Response = {
    timestamp,
    balances,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
