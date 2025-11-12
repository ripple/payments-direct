

# PaymentWithDetailsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **UUID** | The unique ID that identifies this payment. This value is the same as the quote ID. |  |
|**cryptoTransactionHash** | **String** | Transaction hash of the crypto payment on the destination blockchain network |  [optional] |
|**initiatedAt** | **OffsetDateTime** | The time at which the payment was initiated, specified in UTC. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The time at which this payment expires, specified in UTC. |  [optional] |
|**lastStateUpdatedAt** | **OffsetDateTime** | The time at which the payment state was last updated for this payment, specified in UTC. |  [optional] |
|**paymentState** | **PaymentStateDTO** |  |  |
|**originator** | [**OriginatorDTO**](OriginatorDTO.md) |  |  [optional] |
|**destination** | [**DestinationDTO**](DestinationDTO.md) |  |  [optional] |
|**adjustedExchangeRate** | [**AdjustedExchangeRateDTO**](AdjustedExchangeRateDTO.md) |  |  [optional] |
|**fees** | [**List&lt;FeeSummaryDTO&gt;**](FeeSummaryDTO.md) | A summary of fees included in payment quote. |  [optional] |
|**sourceOfCash** | **String** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. |  [optional] |
|**purposeCode** | **String** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. |  [optional] |
|**transactionDetails** | [**TransactionDetailsDTO**](TransactionDetailsDTO.md) |  |  [optional] |
|**errors** | [**List&lt;PaymentErrorDTO&gt;**](PaymentErrorDTO.md) |  |  [optional] |
|**paymentLabels** | **List&lt;String&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. |  [optional] |
|**paymentMemo** | **String** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Must be UPPERCASE and may include only letters (A-Z), digits (0-9), spaces, and the following punctuation characters: comma (,), period (.), parentheses (()), forward slash (/), and hyphen (-). Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  |  [optional] |



