# CaEft

Rails: EFT  Rail Definitions:  EFT: - Availability: Business days only - Limit: CAD 1,000,000 - Settlement: T+1 - Cut-off time: ~4:30 PM EST - Banking holidays: Canadian banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**institution_number** | **str** | The institution number of the identity&#39;s bank | 
**transit_number** | **str** | The transit number of the identity&#39;s bank account | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 
**account_type** | **str** | The identity&#39;s account type. | 

## Example

```python
from ripple_payments_direct.models.ca_eft import CaEft

# TODO update the JSON string below
json = "{}"
# create an instance of CaEft from a JSON string
ca_eft_instance = CaEft.from_json(json)
# print the JSON string representation of the object
print(CaEft.to_json())

# convert the object into a dict
ca_eft_dict = ca_eft_instance.to_dict()
# create an instance of CaEft from a dict
ca_eft_from_dict = CaEft.from_dict(ca_eft_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


