

# PaymentRequestDTO

Information required to initiate a payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteId** | **UUID** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. |  |
|**originatorIdentityId** | **UUID** | The identity ID of the payment originator in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. |  [optional] |
|**beneficiaryIdentityId** | **UUID** | The identity ID of the payment beneficiary in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. |  |
|**internalId** | **String** | Customer defined value, such as an invoice number. |  [optional] |
|**purposeCode** | **String** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. |  [optional] |
|**sourceOfCash** | **String** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. |  [optional] |
|**paymentLabels** | **List&lt;String&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. |  [optional] |



