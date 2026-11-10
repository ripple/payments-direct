# IdBifast

Rails: BI-FAST  Rail Definitions:  BI-FAST: - Availability: 24/7/365 - Limit: IDR 100,000,000 per transaction - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_branch_city** | **str** | The city of the identity&#39;s bank branch. Optional on every bank payout corridor and not enforced by the API. If your organization works with Ripple&#39;s Australian entity, supply it on every financial instrument you create, whatever the destination corridor. Omitting it does not return an error. However, a value that does not match the permitted characters, or exceeds 50 characters, fails financial instrument create and update with 400 Bad Request (USR_109). An update replaces the stored financial instrument, so include this field in every update, not only at creation.  | [optional] 
**bank_code** | **str** | Legacy Bank Indonesia-assigned domestic clearing code or Ripple Bank Code (RBC) for the destination bank in Indonesia. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
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


