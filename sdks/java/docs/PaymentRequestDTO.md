

# PaymentRequestDTO

Information required to initiate a payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteId** | **UUID** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. |  |
|**originatorIdentityId** | **UUID** | The identity ID of the payment originator in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. |  [optional] |
|**beneficiaryIdentityId** | **UUID** | The identity ID of the payment beneficiary in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. |  |
|**internalId** | **String** | Customer defined value, such as an invoice number. |  [optional] |
|**purposeCode** | **String** | Indicates the purpose of the payment  For more information about the &#x60;purposeCode&#x60; options, see [purposeCode](../../building-payment-request-body/#purposecode).  |  [optional] |
|**sourceOfCash** | **String** | Source of cash for payout. |  [optional] |
|**paymentLabels** | **List&lt;String&gt;** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. |  [optional] |



