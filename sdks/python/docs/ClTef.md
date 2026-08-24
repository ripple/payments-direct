# ClTef

Rails: TEF (Transferencia Electrónica de Fondos)  Rail Definitions:  TEF: - Availability: Business days only - Limit: No limit - Settlement: Same-day or next business day - Cut-off time: 3:00 PM CLT - Banking holidays: Chile banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**swift_code** | **str** | SWIFT/BIC code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s bank account number | 
**account_type** | **str** | The identity&#39;s account type | 

## Example

```python
from ripple_payments_direct.models.cl_tef import ClTef

# TODO update the JSON string below
json = "{}"
# create an instance of ClTef from a JSON string
cl_tef_instance = ClTef.from_json(json)
# print the JSON string representation of the object
print(ClTef.to_json())

# convert the object into a dict
cl_tef_dict = cl_tef_instance.to_dict()
# create an instance of ClTef from a dict
cl_tef_from_dict = ClTef.from_dict(cl_tef_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


