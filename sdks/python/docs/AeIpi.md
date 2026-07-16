# AeIpi

Rails: IPI, FTS  Rail Definitions:  IPI: - Availability: 24/7/365 - Limit: AED 25,000 - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  FTS: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: ~2:00 PM GST - Banking holidays: UAE Central Bank holidays apply  Routing Evaluation Order:   1. IPI        - Conditions: beneficiary account is IPI-addressable AND amount ≤ AED 25,000   2. FTS        - Conditions: otherwise applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**iban** | **str** | The International Bank Account Number (IBAN) of the identity&#39;s account | 

## Example

```python
from ripple_payments_direct.models.ae_ipi import AeIpi

# TODO update the JSON string below
json = "{}"
# create an instance of AeIpi from a JSON string
ae_ipi_instance = AeIpi.from_json(json)
# print the JSON string representation of the object
print(AeIpi.to_json())

# convert the object into a dict
ae_ipi_dict = ae_ipi_instance.to_dict()
# create an instance of AeIpi from a dict
ae_ipi_from_dict = AeIpi.from_dict(ae_ipi_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


