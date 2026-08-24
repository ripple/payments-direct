# FinancialInstrumentMetadata

Metadata information for a financial instrument without the payment rail specific details. Used in list operations to provide summary information. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**financialInstrumentId** | **string** | The unique identifier of the financial instrument. | [default to undefined]
**financialInstrumentType** | **string** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | [default to undefined]
**currency** | **string** | The 3-letter ISO currency code of the financial instrument. | [default to undefined]
**label** | **string** | A user-defined label for the financial instrument. | [optional] [default to undefined]
**country** | **string** | The 2-letter ISO 3166-1 alpha-2 country code of the financial instrument. This field is omitted when no country jurisdiction applies (for example, crypto wallet instruments such as ETH_WALLET, TRON_WALLET, and SOL_WALLET). An absent &#x60;country&#x60; should be interpreted as \&quot;no applicable jurisdiction\&quot;.  | [optional] [default to undefined]
**createdAt** | **string** | The time at which the financial instrument was created | [optional] [default to undefined]
**updatedAt** | **string** | The time at which the financial instrument was last updated | [optional] [default to undefined]

## Example

```typescript
import { FinancialInstrumentMetadata } from '@ripple/payments-direct-client';

const instance: FinancialInstrumentMetadata = {
    financialInstrumentId,
    financialInstrumentType,
    currency,
    label,
    country,
    createdAt,
    updatedAt,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
