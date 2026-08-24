# PeLbtr

Rails: LBTR (Sistema de Liquidación Bruta en Tiempo Real)  Rail Definitions:  LBTR: - Availability: Business days and banking hours only - Limit: Minimum Transaction amount is 5 USD - Settlement: Same-day - Cut-off time: 3:00 PM PET - Banking holidays: Peru banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**swift_code** | **str** | SWIFT/BIC code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s bank account number | 
**account_type** | **str** | The identity&#39;s account type | 

## Example

```python
from ripple_payments_direct.models.pe_lbtr import PeLbtr

# TODO update the JSON string below
json = "{}"
# create an instance of PeLbtr from a JSON string
pe_lbtr_instance = PeLbtr.from_json(json)
# print the JSON string representation of the object
print(PeLbtr.to_json())

# convert the object into a dict
pe_lbtr_dict = pe_lbtr_instance.to_dict()
# create an instance of PeLbtr from a dict
pe_lbtr_from_dict = PeLbtr.from_dict(pe_lbtr_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


