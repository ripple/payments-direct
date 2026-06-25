# PaymentFilterV2

Filter criteria to return desired payment search results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentIds** | **Array&lt;string&gt;** | Specify a list of uuids to search for payment with payment ids equals one from the list | [optional] [default to undefined]
**paymentStates** | **Array&lt;string&gt;** | Array of payment states like &#x60;EXECUTING&#x60; or &#x60;COMPLETED&#x60;. | [optional] [default to undefined]
**filterRangeType** | **string** | The type of timestamp to use when filtering payments by a date and time range.  Supported values include:  - &#x60;PAYMENT_CREATION&#x60;  - &#x60;PAYMENT_EXPIRY&#x60;  - &#x60;PAYMENT_STATUS_LAST_UPDATED&#x60;  If another value is provided, the filter is rejected with a validation error.  | [optional] [default to undefined]
**beforeTimestamp** | **string** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or before the specified time. | [optional] [default to undefined]
**afterTimestamp** | **string** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or after the specified time. | [optional] [default to undefined]
**beneficiaryIdentityIds** | **Array&lt;string&gt;** | To get all payments made to one or more beneficiaries, specify the identity ID(s) of those beneficiaries in this field. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] [default to undefined]
**internalId** | **string** | Specify an &#x60;internalId&#x60; to get payments associated with them. A prefix match will be executed. | [optional] [default to undefined]
**beneficiaryIdentityNickname** | **string** | To get all payments made to a beneficiary, specify the nickname of that beneficiary in this field. You can find the nickname using the &#x60;GET /identities&#x60; operation. | [optional] [default to undefined]
**destinationCurrencies** | **Array&lt;string&gt;** | Specify one or more currency codes to get payments where the beneficiary received funds in these currencies. | [optional] [default to undefined]
**paymentLabels** | **Array&lt;string&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment\&#39;s lifetime. | [optional] [default to undefined]

## Example

```typescript
import { PaymentFilterV2 } from '@ripple/payments-direct-client';

const instance: PaymentFilterV2 = {
    paymentIds,
    paymentStates,
    filterRangeType,
    beforeTimestamp,
    afterTimestamp,
    beneficiaryIdentityIds,
    internalId,
    beneficiaryIdentityNickname,
    destinationCurrencies,
    paymentLabels,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
