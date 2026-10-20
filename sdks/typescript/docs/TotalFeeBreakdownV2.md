# TotalFeeBreakdownV2

A breakdown of the total fees included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculatedFee** | **number** | Value of the fee when the configured fee unit is applied against the &#x60;value&#x60;. | [optional] [default to undefined]
**feeName** | **string** | The name of the fee. | [optional] [default to undefined]
**feeDescription** | **string** | Description of the fee. | [optional] [default to undefined]
**paymentRail** | **string** | The payment rail associated with this fee line item. | [optional] [default to undefined]

## Example

```typescript
import { TotalFeeBreakdownV2 } from '@ripple/payments-direct-client';

const instance: TotalFeeBreakdownV2 = {
    calculatedFee,
    feeName,
    feeDescription,
    paymentRail,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
