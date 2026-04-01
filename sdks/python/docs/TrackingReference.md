# TrackingReference

A tracking reference provided by the payout partner for this transaction. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference_type** | **str** | The type or category of this tracking reference. Known values include IMAD and OMAD for Fedwire transfers, but additional types may be provided depending on the payment rail and payout partner.  | [optional] 
**value** | **str** | The tracking reference value. Use this to locate the transaction with the payout partner or payment rail operator. Format varies by referenceType. | [optional] 
**display_name** | **str** | A human-readable name for this tracking reference, suitable for display in user interfaces. | [optional] 
**description** | **str** | A detailed description of what this tracking reference represents and how it can be used. | [optional] 

## Example

```python
from ripple_payments_direct.models.tracking_reference import TrackingReference

# TODO update the JSON string below
json = "{}"
# create an instance of TrackingReference from a JSON string
tracking_reference_instance = TrackingReference.from_json(json)
# print the JSON string representation of the object
print(TrackingReference.to_json())

# convert the object into a dict
tracking_reference_dict = tracking_reference_instance.to_dict()
# create an instance of TrackingReference from a dict
tracking_reference_from_dict = TrackingReference.from_dict(tracking_reference_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


