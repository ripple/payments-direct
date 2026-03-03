# UpdateFinancialInstrumentResponse

This object contains the details of the updated financial instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usAch** | [**UsAch**](UsAch.md) |  | [optional] [default to undefined]
**usFedwire** | [**UsFedwire**](UsFedwire.md) |  | [optional] [default to undefined]
**mxSpei** | [**MxSpei**](MxSpei.md) |  | [optional] [default to undefined]
**euSepa** | [**EuSepa**](EuSepa.md) |  | [optional] [default to undefined]
**gbFps** | [**GbFps**](GbFps.md) |  | [optional] [default to undefined]
**africaBankPayout** | [**AfricaBankPayout**](AfricaBankPayout.md) |  | [optional] [default to undefined]
**brPix** | [**BrPix**](BrPix.md) |  | [optional] [default to undefined]
**coPse** | [**CoPse**](CoPse.md) |  | [optional] [default to undefined]
**brTed** | [**BrTed**](BrTed.md) |  | [optional] [default to undefined]
**caEft** | [**CaEft**](CaEft.md) |  | [optional] [default to undefined]
**currency** | **string** | The 3-letter ISO currency code of the financial instrument. | [default to undefined]
**label** | **string** | A user-defined label for the financial instrument. | [optional] [default to undefined]
**financialInstrumentType** | **string** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | [default to undefined]
**country** | **string** | The country of the financial instrument. | [optional] [default to undefined]
**financialInstrumentId** | **string** | The unique identifier of the financial instrument. | [default to undefined]
**createdAt** | **string** | The time at which the financial instrument was created | [optional] [default to undefined]
**updatedAt** | **string** | The time at which the financial instrument was last updated | [optional] [default to undefined]

## Example

```typescript
import { UpdateFinancialInstrumentResponse } from '@ripple/payments-direct-client';

const instance: UpdateFinancialInstrumentResponse = {
    usAch,
    usFedwire,
    mxSpei,
    euSepa,
    gbFps,
    africaBankPayout,
    brPix,
    coPse,
    brTed,
    caEft,
    currency,
    label,
    financialInstrumentType,
    country,
    financialInstrumentId,
    createdAt,
    updatedAt,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
