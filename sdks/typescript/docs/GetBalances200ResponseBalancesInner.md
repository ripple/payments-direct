# GetBalances200ResponseBalancesInner

Customer available prefund balance for specific currency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundingType** | **string** | The funding method associated with your account. | [default to undefined]
**currency** | **string** | Currency code. | [default to undefined]
**availableBalance** | **number** | Available funded balance that you can use to initiate payments. | [default to undefined]
**reservedBalance** | **number** | Amount reserved to complete in-progress transactions. You can\&#39;t use this amount to initiate new payments. | [default to undefined]

## Example

```typescript
import { GetBalances200ResponseBalancesInner } from '@ripple/payments-direct-client';

const instance: GetBalances200ResponseBalancesInner = {
    fundingType,
    currency,
    availableBalance,
    reservedBalance,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
