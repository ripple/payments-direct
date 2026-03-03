# BrPix

Rails: PIX  Rail Definitions:  PIX: - Availability: 24/7/365 - Limit: No limit - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The code of the identity&#39;s bank (BICFI code) | 
**branch_number** | **str** | The identity&#39;s bank branch number | 
**pix_key** | **str** | The identity&#39;s PIX key, which can be an email, phone number, or a hash | 
**pix_key_type** | **str** | The type of PIX key used by the identity.  - &#x60;CPF&#x60;   - &#x60;CNPJ&#x60;   - &#x60;EMAIL&#x60;   - &#x60;PHONE&#x60;   - &#x60;EVP&#x60;  | 

## Example

```python
from ripple_payments_direct.models.br_pix import BrPix

# TODO update the JSON string below
json = "{}"
# create an instance of BrPix from a JSON string
br_pix_instance = BrPix.from_json(json)
# print the JSON string representation of the object
print(BrPix.to_json())

# convert the object into a dict
br_pix_dict = br_pix_instance.to_dict()
# create an instance of BrPix from a dict
br_pix_from_dict = BrPix.from_dict(br_pix_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


