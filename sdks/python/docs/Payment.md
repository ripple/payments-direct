# Payment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payment_id** | **str** | The unique ID that identifies this payment. This value is the same as the quote ID. | 
**crypto_transaction_hash** | **str** | Transaction hash of the crypto payment on the destination blockchain network | [optional] 
**initiated_at** | **datetime** | The time at which the payment was initiated, specified in UTC. | [optional] 
**expires_at** | **datetime** | The time at which this payment expires, specified in UTC. | [optional] 
**last_state_updated_at** | **datetime** | The time at which the payment state was last updated for this payment, specified in UTC. | [optional] 
**payment_state** | [**PaymentState**](PaymentState.md) |  | 
**originator** | [**Originator**](Originator.md) |  | [optional] 
**destination** | [**Destination**](Destination.md) |  | [optional] 
**adjusted_exchange_rate** | [**AdjustedExchangeRate**](AdjustedExchangeRate.md) |  | [optional] 
**fees** | [**List[FeeSummary]**](FeeSummary.md) | A summary of fees included in payment quote. | [optional] 
**source_of_cash** | **str** | Source of Cash may be required depending on corridor and payout partner. Valid Source of Cash values vary by corridor. | [optional] 
**purpose_code** | **str** | Purpose Code may be required depending on corridor and payout partner. Valid Purpose Code values vary by corridor. | [optional] 
**transaction_details** | [**TransactionDetails**](TransactionDetails.md) |  | [optional] 
**payment_labels** | **List[str]** | Application-defined labels for grouping and categorizing payments (e.g., campaign IDs, workflow tags, or batch identifiers). Labels are optional and mutable; they can be added or removed over the payment’s lifetime. | [optional] 

## Example

```python
from ripple_payments_direct.models.payment import Payment

# TODO update the JSON string below
json = "{}"
# create an instance of Payment from a JSON string
payment_instance = Payment.from_json(json)
# print the JSON string representation of the object
print(Payment.to_json())

# convert the object into a dict
payment_dict = payment_instance.to_dict()
# create an instance of Payment from a dict
payment_from_dict = Payment.from_dict(payment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


