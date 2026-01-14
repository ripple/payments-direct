# TaxBreakdown

A breakdown of the individual taxes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxAmount** | **number** | tax amount for this tax line item. | [optional] [default to undefined]
**taxName** | **string** | The name of the tax. | [optional] [default to undefined]
**taxDescription** | **string** | GST service fee tax . | [optional] [default to undefined]
**taxRate** | **number** | The tax rate applied to calculate the tax amount. | [optional] [default to undefined]

## Example

```typescript
import { TaxBreakdown } from '@ripple/payments-direct-client';

const instance: TaxBreakdown = {
    taxAmount,
    taxName,
    taxDescription,
    taxRate,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
