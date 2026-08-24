# PhNrps

Rails: InstaPay, PESONet  Rail Definitions:  InstaPay:   - Availability: 24/7/365   - Limit: PHP 1,000,000   - Settlement: Real-time (within 15 minutes)   - Cut-off time: None   - Banking holidays: Applicable  PESONet:   - Availability: Business days only   - Limit: No limit   - Settlement: Same-day or next business day   - Cut-off time: 2:00 PM PHT   - Banking holidays: Philippines banking holidays apply  Routing Evaluation Order: InstaPay > PESONet 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**swift_code** | **str** | The SWIFT/BIC code of the beneficiary bank. Constrained to the SWIFT/BIC code list published on Ripple Docs. | 
**account_number** | **str** | The identity&#39;s bank account number | 

## Example

```python
from ripple_payments_direct.models.ph_nrps import PhNrps

# TODO update the JSON string below
json = "{}"
# create an instance of PhNrps from a JSON string
ph_nrps_instance = PhNrps.from_json(json)
# print the JSON string representation of the object
print(PhNrps.to_json())

# convert the object into a dict
ph_nrps_dict = ph_nrps_instance.to_dict()
# create an instance of PhNrps from a dict
ph_nrps_from_dict = PhNrps.from_dict(ph_nrps_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


