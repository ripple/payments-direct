# PutRippleFinancialInstrument

Request to update an existing financial instrument of an identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **string** | A user-defined label for the financial instrument. | [optional] [default to undefined]
**usAch** | [**UsAch**](UsAch.md) |  | [optional] [default to undefined]
**usFedwire** | [**UsFedwire**](UsFedwire.md) |  | [optional] [default to undefined]
**mxSpei** | [**MxSpei**](MxSpei.md) |  | [optional] [default to undefined]
**euSepa** | [**EuSepa**](EuSepa.md) |  | [optional] [default to undefined]
**gbFps** | [**GbFps**](GbFps.md) |  | [optional] [default to undefined]
**ngBankPayout** | [**NgBankPayout**](NgBankPayout.md) |  | [optional] [default to undefined]
**brPix** | [**BrPix**](BrPix.md) |  | [optional] [default to undefined]
**coPse** | [**CoPse**](CoPse.md) |  | [optional] [default to undefined]
**brTed** | [**BrTed**](BrTed.md) |  | [optional] [default to undefined]
**caEft** | [**CaEft**](CaEft.md) |  | [optional] [default to undefined]

## Example

```typescript
import { PutRippleFinancialInstrument } from '@ripple/payments-direct-client';

const instance: PutRippleFinancialInstrument = {
    label,
    usAch,
    usFedwire,
    mxSpei,
    euSepa,
    gbFps,
    ngBankPayout,
    brPix,
    coPse,
    brTed,
    caEft,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
