# CnCfxps

Rails: CFXPS (China Foreign Exchange Payment System)  Rail Definitions:  CFXPS: - Availability: Business days and banking hours only - Limit: No limit (institutional) - Settlement: Same-day or next business day - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | Beneficiary Bank Name. Looked up from swiftCode. | [default to undefined]
**swiftCode** | **string** | Beneficiary Bank SWIFT/BIC Code. See the China entry in the bank code lookup in the integration resources for the supported list. | [default to undefined]
**accountNumber** | **string** | Beneficiary Account Number. | [default to undefined]
**accountHolderName** | **string** | Beneficiary Account Holder Name (English). | [default to undefined]

## Example

```typescript
import { CnCfxps } from '@ripple/payments-direct-client';

const instance: CnCfxps = {
    bankName,
    swiftCode,
    accountNumber,
    accountHolderName,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
