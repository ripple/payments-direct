# BrTed

Rails: TED  Rail Definitions:  TED: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: ~5:00 PM BRT  - Banking holidays: Brazil banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The code of the identity\&#39;s bank (BICFI code) | [default to undefined]
**branchNumber** | **string** | The branch number of the identity\&#39;s bank account | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]
**accountType** | **string** | The identity\&#39;s account type (Savings, Checking etc.):     * CHECKING: Checking account     * SAVINGS: Savings account  | [default to undefined]

## Example

```typescript
import { BrTed } from '@ripple/payments-direct-client';

const instance: BrTed = {
    bankName,
    bankCode,
    branchNumber,
    accountNumber,
    accountType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
