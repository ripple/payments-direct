# TaxSummary

A summary of taxes included in this quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalTaxes** | **number** | The value of the total taxes included in this quote. | [optional] [default to undefined]
**taxCurrency** | **string** | The currency in which taxes are charged. | [optional] [default to undefined]
**taxBreakdown** | [**Array&lt;TaxBreakdown&gt;**](TaxBreakdown.md) | An array of taxes with details such as tax description, rate, name and tax amount. | [optional] [default to undefined]

## Example

```typescript
import { TaxSummary } from '@ripple/payments-direct-client';

const instance: TaxSummary = {
    totalTaxes,
    taxCurrency,
    taxBreakdown,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
