# KrKftc

Rails: KFTC (Korea Financial Telecommunications and Clearings)  Rail Definitions:  KFTC: - Availability: 24/7/365 - Limit: KRW 10,000,000 per transaction (varies) - Settlement: Real-time - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | KFTC-assigned Korean domestic clearing code. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**account_number** | **str** | The identity&#39;s bank account number | 

## Example

```python
from ripple_payments_direct.models.kr_kftc import KrKftc

# TODO update the JSON string below
json = "{}"
# create an instance of KrKftc from a JSON string
kr_kftc_instance = KrKftc.from_json(json)
# print the JSON string representation of the object
print(KrKftc.to_json())

# convert the object into a dict
kr_kftc_dict = kr_kftc_instance.to_dict()
# create an instance of KrKftc from a dict
kr_kftc_from_dict = KrKftc.from_dict(kr_kftc_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


