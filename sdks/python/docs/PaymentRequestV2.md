# PaymentRequestV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_id** | **str** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | 
**originator_identity_id** | **str** | The identity ID of the payment originator. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**beneficiary_identity_id** | **str** | The identity ID of the payment beneficiary. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | 
**internal_id** | **str** | Customer defined value, such as an invoice number. | [optional] 
**purpose_code** | **str** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] 
**source_of_cash** | **str** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] 
**payment_labels** | **List[str]** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 
**beneficiary_financial_instrument_id** | **str** | The financial instrument ID associated with a payment beneficiary’s identity. This value must reference a financial instrument created for the same beneficiary identity using Identity Management v3. Use the &#x60;financialInstrumentId&#x60; returned when you create or fetch the beneficiary’s payout instrument.  | 
**receiver_relationship** | **str** | The relationship to the debtor. | [optional] 
**payment_memo** | **str** | Optional, transaction-specific memo carried with the payment for beneficiary reconciliation. Validation rules (required, allowed characters, max length) vary by corridor. Consult the data requirements for your corridor. Not stored in PII; persisted on the payment object and forwarded to compliance and payout partners. Where possible, the memo will also be delivered to the final beneficiary&#39;s credit record, but delivery cannot be guaranteed in all cases due to payout partner or downstream constraints. If omitted, Ripple may generate a memo automatically.  | [optional] 

## Example

```python
from ripple_payments_direct.models.payment_request_v2 import PaymentRequestV2

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentRequestV2 from a JSON string
payment_request_v2_instance = PaymentRequestV2.from_json(json)
# print the JSON string representation of the object
print(PaymentRequestV2.to_json())

# convert the object into a dict
payment_request_v2_dict = payment_request_v2_instance.to_dict()
# create an instance of PaymentRequestV2 from a dict
payment_request_v2_from_dict = PaymentRequestV2.from_dict(payment_request_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


