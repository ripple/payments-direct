# FeeSummaryV2

A summary of fees included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalFee** | **number** | The value of the total fee included in this quote. | [optional] [default to undefined]
**feeCurrency** | **string** | The currency in which fees are charged. | [optional] [default to undefined]
**feeBreakdown** | [**Array&lt;TotalFeeBreakdownV2&gt;**](TotalFeeBreakdownV2.md) | An array of fees that provides a breakdown of how the total fees is calculated for this quote. | [optional] [default to undefined]

## Example

```typescript
import { FeeSummaryV2 } from '@ripple/payments-direct-client';

const instance: FeeSummaryV2 = {
    totalFee,
    feeCurrency,
    feeBreakdown,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
