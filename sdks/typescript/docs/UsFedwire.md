# UsFedwire

Rails: FEDWIRE  Rail Definitions:  FEDWIRE:   - Availability: U.S. business days and operating hours.   - Limit: No limit   - Settlement: Real-time gross settlement (typically within minutes).   - Cut-off time: 5:00 p.m. ET; transfers submitted after cut-off queue for next business day.   - Banking holidays: Follows the Federal Reserve holiday schedule. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **string** | The name of the identity\&#39;s bank. | [default to undefined]
**bankRoutingNumber** | **string** | 9-digit ABA Routing Transit Number (RTN) of the beneficiary\&#39;s bank. | [default to undefined]
**accountNumber** | **string** | The identity\&#39;s account number to be credited. | [default to undefined]

## Example

```typescript
import { UsFedwire } from '@ripple/payments-direct-client';

const instance: UsFedwire = {
    bankName,
    bankRoutingNumber,
    accountNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
