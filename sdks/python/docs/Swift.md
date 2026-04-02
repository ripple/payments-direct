# Swift

Rails: SWIFT  Rail Definitions:  SWIFT:   - Availability: Business days and banking hours.   - Limit: No limit   - Settlement: 1-4 business days depending on corridor.   - Cut-off time: Varies by bank.   - Banking holidays: Applicable based on sender and receiver countries.  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**swift_code** | **str** | The SWIFT/BIC code of the identity&#39;s bank | 
**account_holder_name** | **str** | The name of the account holder | 
**account_number** | **str** | The account number of the identity&#39;s bank account | 

## Example

```python
from ripple_payments_direct.models.swift import Swift

# TODO update the JSON string below
json = "{}"
# create an instance of Swift from a JSON string
swift_instance = Swift.from_json(json)
# print the JSON string representation of the object
print(Swift.to_json())

# convert the object into a dict
swift_dict = swift_instance.to_dict()
# create an instance of Swift from a dict
swift_from_dict = Swift.from_dict(swift_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


