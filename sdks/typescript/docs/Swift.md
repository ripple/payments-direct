# Swift

Rails: SWIFT  Rail Definitions:  SWIFT:   - Availability: Business days and banking hours.   - Limit: No limit   - Settlement: 1-4 business days depending on corridor.   - Cut-off time: Varies by bank.   - Banking holidays: Applicable based on sender and receiver countries.  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**swiftCode** | **string** | The SWIFT/BIC code of the identity\&#39;s bank | [default to undefined]
**accountHolderName** | **string** | The name of the account holder | [default to undefined]
**accountNumber** | **string** | The account number of the identity\&#39;s bank account | [default to undefined]

## Example

```typescript
import { Swift } from '@ripple/payments-direct-client';

const instance: Swift = {
    bankName,
    swiftCode,
    accountHolderName,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
