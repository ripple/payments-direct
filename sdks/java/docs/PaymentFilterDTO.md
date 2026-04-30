

# PaymentFilterDTO

Filter criteria to return desired payment search results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentIds** | **List&lt;UUID&gt;** | Specify a list of uuids to search for payment with payment ids equals one from the list |  [optional] |
|**paymentStates** | **List&lt;PaymentStateDTO&gt;** | Array of payment states like &#x60;EXECUTING&#x60; or &#x60;COMPLETED&#x60;. |  [optional] |
|**filterRangeType** | **PaymentFilterRangeTypeDTO** |  |  [optional] |
|**beforeTimestamp** | **OffsetDateTime** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or before the specified time. |  [optional] |
|**afterTimestamp** | **OffsetDateTime** | Depending on the value of the &#x60;filterRangeType&#x60; field, this timestamp returns a list of payments that were created/modified/expired at or after the specified time. |  [optional] |
|**beneficiaryIdentityIds** | **List&lt;UUID&gt;** | To get all payments made to one or more beneficiaries, specify the identity ID(s) of those beneficiaries in this field. You can find the identity ID using the &#x60;GET /identities&#x60; operation. |  [optional] |
|**internalId** | **String** | Specify an &#x60;internalId&#x60; to get payments associated with them. A prefix match will be executed. |  [optional] |
|**beneficiaryIdentityNickname** | **String** | To get all payments made to a beneficiary, specify the nickname of that beneficiary in this field. You can find the nickname using the &#x60;GET /identities&#x60; operation. |  [optional] |
|**destinationCurrencies** | **List&lt;String&gt;** | Specify one or more currency codes to get payments where the beneficiary received funds in these currencies. |  [optional] |
|**paymentLabels** | **List&lt;String&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. |  [optional] |



