# UsFedwire

Rails: FEDWIRE  Rail Definitions:  FEDWIRE:   - Availability: U.S. business days and operating hours.   - Limit: No limit   - Settlement: Real-time gross settlement (typically within minutes).   - Cut-off time: 5:00 p.m. ET; transfers submitted after cut-off queue for next business day.   - Banking holidays: Follows the Federal Reserve holiday schedule. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank. | 
**bank_routing_number** | **str** | 9-digit ABA Routing Transit Number (RTN) of the beneficiary&#39;s bank. | 
**account_number** | **str** | The identity&#39;s account number to be credited. | 

## Example

```python
from ripple_payments_direct.models.us_fedwire import UsFedwire

# TODO update the JSON string below
json = "{}"
# create an instance of UsFedwire from a JSON string
us_fedwire_instance = UsFedwire.from_json(json)
# print the JSON string representation of the object
print(UsFedwire.to_json())

# convert the object into a dict
us_fedwire_dict = us_fedwire_instance.to_dict()
# create an instance of UsFedwire from a dict
us_fedwire_from_dict = UsFedwire.from_dict(us_fedwire_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


