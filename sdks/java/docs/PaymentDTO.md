

# PaymentDTO


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
|**sourceOfCash** | **String** | Indicates the source of funds |  [optional] |
|**purposeCode** | **String** | Indicates the purpose of the payment  For more information about the &#x60;purposeCode&#x60; options, see  [purposeCode](../../building-payment-request-body/#purposecode).  |  [optional] |
|**transactionDetails** | [**TransactionDetailsDTO**](TransactionDetailsDTO.md) |  |  [optional] |
|**paymentLabels** | **List&lt;String&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. |  [optional] |



