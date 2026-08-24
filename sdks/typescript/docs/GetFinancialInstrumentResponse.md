# GetFinancialInstrumentResponse

This object contains the details of a financial instrument and optional identity if requested.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**financialInstrument** | [**RippleFinancialInstrumentEntry**](RippleFinancialInstrumentEntry.md) |  | [default to undefined]
**identity** | [**GetIdentityResponseV3**](GetIdentityResponseV3.md) |  | [optional] [default to undefined]

## Example

```typescript
import { GetFinancialInstrumentResponse } from '@ripple/payments-direct-client';

const instance: GetFinancialInstrumentResponse = {
    financialInstrument,
    identity,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
