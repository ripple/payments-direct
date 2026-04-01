# TrackingReference

A tracking reference provided by the payout partner for this transaction. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceType** | **string** | The type or category of this tracking reference. Known values include IMAD and OMAD for Fedwire transfers, but additional types may be provided depending on the payment rail and payout partner.  | [optional] [default to undefined]
**value** | **string** | The tracking reference value. Use this to locate the transaction with the payout partner or payment rail operator. Format varies by referenceType. | [optional] [default to undefined]
**displayName** | **string** | A human-readable name for this tracking reference, suitable for display in user interfaces. | [optional] [default to undefined]
**description** | **string** | A detailed description of what this tracking reference represents and how it can be used. | [optional] [default to undefined]

## Example

```typescript
import { TrackingReference } from '@ripple/payments-direct-client';

const instance: TrackingReference = {
    referenceType,
    value,
    displayName,
    description,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
