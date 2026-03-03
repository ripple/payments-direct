# AfricaBankPayout

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Country-dependant - Limit:   - Ghana: ₵100,000   - Nigeria: ₦5,000,000   - Zambia: ZK 150,000   - Uganda: UGX 20,000   - Rwanda: RWF 10,000,000   - South Africa: R 300,000 - Settlement: Real time to 48 hours - Cut-off time: Real time - Banking holidays: Country specific banking holidays apply - Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank | [default to undefined]
**bankCode** | **string** | The bank code of the identity\&#39;s bank | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number associated with the Account Identification Scheme | [default to undefined]
**country** | **string** | The country of the identity’s bank, using the Alpha-2 code as defined in ISO 3166-1.   Allowed values are:  - &#x60;GH&#x60;   - &#x60;NG&#x60;   - &#x60;RW&#x60;   - &#x60;UG&#x60;   - &#x60;ZA&#x60;   - &#x60;ZM&#x60;  | [default to undefined]

## Example

```typescript
import { AfricaBankPayout } from '@ripple/payments-direct-client';

const instance: AfricaBankPayout = {
    bankName,
    bankCode,
    accountNumber,
    country,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
