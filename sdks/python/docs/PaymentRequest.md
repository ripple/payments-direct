# PaymentRequest

Information required to initiate a payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote_id** | **str** | ID of the quote you want to accept to initiate this payment. Must be in UUID format. This will be used as paymentId. | 
**originator_identity_id** | **str** | The identity ID of the payment originator in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | [optional] 
**beneficiary_identity_id** | **str** | The identity ID of the payment beneficiary in UUID format. You can find the identity ID using the &#x60;GET /identities&#x60; operation. | 
**internal_id** | **str** | Customer defined value, such as an invoice number. | [optional] 
**purpose_code** | **str** | Indicates the purpose of the payment  For more information about the &#x60;purposeCode&#x60; options, see [purposeCode](../../building-payment-request-body/#purposecode).  | [optional] 
**source_of_cash** | **str** | Source of cash for payout. | [optional] 
**payment_labels** | **List[str]** | List of labels associated with the payment. A label typically contains a UUID of your choice, designated as the batchId. | [optional] 

## Example

```python
from ripple_payments_direct.models.payment_request import PaymentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentRequest from a JSON string
payment_request_instance = PaymentRequest.from_json(json)
# print the JSON string representation of the object
print(PaymentRequest.to_json())

# convert the object into a dict
payment_request_dict = payment_request_instance.to_dict()
# create an instance of PaymentRequest from a dict
payment_request_from_dict = PaymentRequest.from_dict(payment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


