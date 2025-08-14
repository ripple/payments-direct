# TotalFeeBreakdown

A breakdown of the total fees included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculatedFee** | **number** | Value of the fee when the configured fee unit is applied against the &#x60;value&#x60;. | [optional] [default to undefined]
**feeName** | **string** | The name of the fee. | [optional] [default to undefined]
**feeDescription** | **string** | Description of the fee. | [optional] [default to undefined]

## Example

```typescript
import { TotalFeeBreakdown } from '@ripple/payments-direct-client';

const instance: TotalFeeBreakdown = {
    calculatedFee,
    feeName,
    feeDescription,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
