# PhNrps

Rails: InstaPay, PESONet  Rail Definitions:  InstaPay:   - Availability: 24/7/365   - Limit: PHP 1,000,000   - Settlement: Real-time (within 15 minutes)   - Cut-off time: None   - Banking holidays: Applicable  PESONet:   - Availability: Business days only   - Limit: No limit   - Settlement: Same-day or next business day   - Cut-off time: 2:00 PM PHT   - Banking holidays: Philippines banking holidays apply  Routing Evaluation Order: InstaPay > PESONet 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**swiftCode** | **string** | The SWIFT/BIC code of the beneficiary bank. Constrained to the SWIFT/BIC code list published on Ripple Docs. | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s bank account number | [default to undefined]

## Example

```typescript
import { PhNrps } from '@ripple/payments-direct-client';

const instance: PhNrps = {
    bankName,
    swiftCode,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
