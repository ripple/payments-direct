# ArInterbanking

Rails: Interbanking  Rail Definitions:  Interbanking: - Availability: Business days only - Limit: ARS 10,000,000 - Settlement: Same-day or next business day - Cut-off time: 3:00 PM ART - Banking holidays: Argentina banking holidays apply  Routing Evaluation Order: AR_INTERBANKING has a single payment rail; no routing evaluation order applies. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank. Must begin and end with a letter or digit, and consecutive identical punctuation characters are not permitted. | 
**bank_code** | **str** | BCRA-assigned 3-digit Argentine bank code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**account_number** | **str** | The identity&#39;s account number (CBU or CVU) | 
**account_type** | **str** | The identity&#39;s account type | 

## Example

```python
from ripple_payments_direct.models.ar_interbanking import ArInterbanking

# TODO update the JSON string below
json = "{}"
# create an instance of ArInterbanking from a JSON string
ar_interbanking_instance = ArInterbanking.from_json(json)
# print the JSON string representation of the object
print(ArInterbanking.to_json())

# convert the object into a dict
ar_interbanking_dict = ar_interbanking_instance.to_dict()
# create an instance of ArInterbanking from a dict
ar_interbanking_from_dict = ArInterbanking.from_dict(ar_interbanking_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


