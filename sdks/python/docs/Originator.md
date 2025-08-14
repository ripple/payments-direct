# Originator

Payment originator and source details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originator_identity_id** | **str** | The unique ID associated with the payment originator&#39;s identity record. | [optional] 
**originator_identity_id_version** | **int** | The current version of the originator&#39;s identity record. | [optional] 
**originator_identity_nick_name** | **str** | Nickname associated with the originator&#39;s identity record. | [optional] 
**internal_id** | **str** | An ID associated with this payment, if provided by the customer during payment initiation. | [optional] 
**source_country** | **str** | The country where the payment originator is located or incorporated, specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. | [optional] 
**source_currency** | **str** | originator&#39;s currency | [optional] 
**source_amount** | **float** | The amount sent by the originator in this payment. This field can hold a value with up to 6 decimal places. | [optional] 
**payin** | **str** | Details about how this payment is funded. | [optional] 

## Example

```python
from ripple_payments_direct.models.originator import Originator

# TODO update the JSON string below
json = "{}"
# create an instance of Originator from a JSON string
originator_instance = Originator.from_json(json)
# print the JSON string representation of the object
print(Originator.to_json())

# convert the object into a dict
originator_dict = originator_instance.to_dict()
# create an instance of Originator from a dict
originator_from_dict = Originator.from_dict(originator_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


