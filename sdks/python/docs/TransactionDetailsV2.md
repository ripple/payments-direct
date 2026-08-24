# TransactionDetailsV2

A summary of the payment category.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payment_product** | **str** | The Ripple payments product used to make this payment. | [optional] 
**flow_type** | **str** | Specifies the type of payment you&#39;re making as categorized by the identity type of the payment originator and beneficiary. | [optional] 
**third_party_payment** | **bool** | Flag to indicate if this payment is initiated on behalf of a third-party originator. | [optional] 
**business_use_case** | **str** | Indicates the type of payment you&#39;re making. | [optional] 

## Example

```python
from ripple_payments_direct.models.transaction_details_v2 import TransactionDetailsV2

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionDetailsV2 from a JSON string
transaction_details_v2_instance = TransactionDetailsV2.from_json(json)
# print the JSON string representation of the object
print(TransactionDetailsV2.to_json())

# convert the object into a dict
transaction_details_v2_dict = transaction_details_v2_instance.to_dict()
# create an instance of TransactionDetailsV2 from a dict
transaction_details_v2_from_dict = TransactionDetailsV2.from_dict(transaction_details_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


