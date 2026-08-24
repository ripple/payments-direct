# CoPse

Rails: PSE  Rail Definitions:  PSE: - Availability: Business days and banking hours only - Limit: None - Settlement:   - Major banks (Bancolombia, Davivienda, Banco de Bogotá, BBVA, Grupo Aval, Nequi): 35–100 min  - Other banks (via ACH): Same-day or T+1 depending on cutoff - Cut-off time: 3PM COT - Banking holidays: Colombia banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The identity&#39;s bank identifier code | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 
**account_type** | **str** | The type of account associated with the identity. | 

## Example

```python
from ripple_payments_direct.models.co_pse import CoPse

# TODO update the JSON string below
json = "{}"
# create an instance of CoPse from a JSON string
co_pse_instance = CoPse.from_json(json)
# print the JSON string representation of the object
print(CoPse.to_json())

# convert the object into a dict
co_pse_dict = co_pse_instance.to_dict()
# create an instance of CoPse from a dict
co_pse_from_dict = CoPse.from_dict(co_pse_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


