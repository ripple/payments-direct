# HkBankPayout

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Business days only - Limit: None - Settlement: Same-day to T+1 - Cut-off time: Bank-dependent - Banking holidays: Hong Kong banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the beneficiary\&#39;s bank | [default to undefined]
**accountNumber** | **string** | Bank account number (BBAN) | [default to undefined]
**accountHolderName** | **string** | Name of the account holder | [default to undefined]
**swiftCode** | **string** | SWIFT/BIC code of the bank | [default to undefined]
**currency** | **string** | Currency code. Only HKD is supported for Hong Kong Bank Payout. | [optional] [default to undefined]

## Example

```typescript
import { HkBankPayout } from '@ripple/payments-direct-client';

const instance: HkBankPayout = {
    bankName,
    accountNumber,
    accountHolderName,
    swiftCode,
    currency,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
