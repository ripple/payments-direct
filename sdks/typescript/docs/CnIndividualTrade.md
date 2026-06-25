# CnIndividualTrade

Rails: CUP (China UnionPay)  Rail Definitions:  CUP (China UnionPay): - Availability: 24/7/365 - Limit: Varies by bank and account type - Settlement: Real-time or near real-time - Cut-off time: None - Banking holidays: Not applicable (24/7 service)  Routing: CUP routes using the card/account number directly. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | Beneficiary Bank Name. | [default to undefined]
**accountNumber** | **string** | Beneficiary Account Number. | [default to undefined]
**accountHolderName** | **string** | Beneficiary Account Holder Name (Hanzi). Account name in Chinese Hanzi characters. For sole proprietors, bank account may be registered under business name. | [default to undefined]

## Example

```typescript
import { CnIndividualTrade } from '@ripple/payments-direct-client';

const instance: CnIndividualTrade = {
    bankName,
    accountNumber,
    accountHolderName,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
