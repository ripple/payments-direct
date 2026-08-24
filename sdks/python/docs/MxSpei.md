# MxSpei

Rails: SPEI  Rail Definitions:  SPEI: - Availability: 24/7/365 - Limit: None - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**clabe** | **str** | The identity&#39;s CLABE account identification code | 

## Example

```python
from ripple_payments_direct.models.mx_spei import MxSpei

# TODO update the JSON string below
json = "{}"
# create an instance of MxSpei from a JSON string
mx_spei_instance = MxSpei.from_json(json)
# print the JSON string representation of the object
print(MxSpei.to_json())

# convert the object into a dict
mx_spei_dict = mx_spei_instance.to_dict()
# create an instance of MxSpei from a dict
mx_spei_from_dict = MxSpei.from_dict(mx_spei_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


