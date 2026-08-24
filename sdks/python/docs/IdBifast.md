# IdBifast

Rails: BI-FAST  Rail Definitions:  BI-FAST: - Availability: 24/7/365 - Limit: IDR 50,000,000 - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | Bank Indonesia-assigned domestic clearing code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**account_number** | **str** | The identity&#39;s bank account number | 

## Example

```python
from ripple_payments_direct.models.id_bifast import IdBifast

# TODO update the JSON string below
json = "{}"
# create an instance of IdBifast from a JSON string
id_bifast_instance = IdBifast.from_json(json)
# print the JSON string representation of the object
print(IdBifast.to_json())

# convert the object into a dict
id_bifast_dict = id_bifast_instance.to_dict()
# create an instance of IdBifast from a dict
id_bifast_from_dict = IdBifast.from_dict(id_bifast_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


