

# PaymentV2DTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **UUID** | The unique ID that identifies this payment. This value is the same as the quote ID. |  |
|**cryptoTransactionHash** | **String** | Transaction hash of the crypto payment on the destination blockchain network |  [optional] |
|**initiatedAt** | **OffsetDateTime** | The time at which the payment was initiated, specified in UTC. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The time at which this payment expires, specified in UTC. |  [optional] |
|**jitFundingExpiresAt** | **OffsetDateTime** | The time at which JIT funding for this payment expires, specified in UTC. |  [optional] |
|**lastStateUpdatedAt** | **OffsetDateTime** | The time at which the payment state was last updated for this payment, specified in UTC. |  [optional] |
|**paymentState** | **String** | Current state of a payment.  The payment lifecycle currently uses the following values:  - &#x60;QUOTED&#x60;  - &#x60;INITIATED&#x60;  - &#x60;VALIDATING&#x60;  - &#x60;TRANSFERRING&#x60;  - &#x60;COMPLETED&#x60;  - &#x60;FAILED&#x60;  - &#x60;RETURNED&#x60;  - &#x60;DECLINED&#x60;  - &#x60;AWAITING_FUNDING&#x60;  Additional states may be introduced in the future without breaking existing integrations.  |  |
|**originator** | [**OriginatorV2DTO**](OriginatorV2DTO.md) |  |  [optional] |
|**destination** | [**DestinationV2DTO**](DestinationV2DTO.md) |  |  [optional] |
|**adjustedExchangeRate** | [**AdjustedExchangeRateDTO**](AdjustedExchangeRateDTO.md) |  |  [optional] |
|**fees** | [**List&lt;FeeSummaryDTO&gt;**](FeeSummaryDTO.md) | A summary of fees included in the payment quote. |  [optional] |
|**taxes** | [**List&lt;TaxSummaryDTO&gt;**](TaxSummaryDTO.md) | A summary of taxes included in the payment quote. |  [optional] |
|**sourceOfCash** | **String** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. |  [optional] |
|**purposeCode** | **String** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. |  [optional] |
|**transactionDetails** | [**TransactionDetailsV2DTO**](TransactionDetailsV2DTO.md) |  |  [optional] |
|**paymentLabels** | **List&lt;String&gt;** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment&#39;s lifetime. |  [optional] |
|**receiverRelationship** | **String** | The relationship to the debtor. |  [optional] |
|**paymentMemo** | **String** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Validation rules (required, allowed characters, max length) vary by corridor. Consult the data requirements for your corridor. Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  |  [optional] |



