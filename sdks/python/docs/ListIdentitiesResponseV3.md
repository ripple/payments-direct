# ListIdentitiesResponseV3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[IdentityResponseV3]**](IdentityResponseV3.md) | The list of the identities that match the query parameters | [optional] 
**next_token** | **str** | The token to retrieve the next page of results | [optional] 

## Example

```python
from ripple_payments_direct.models.list_identities_response_v3 import ListIdentitiesResponseV3

# TODO update the JSON string below
json = "{}"
# create an instance of ListIdentitiesResponseV3 from a JSON string
list_identities_response_v3_instance = ListIdentitiesResponseV3.from_json(json)
# print the JSON string representation of the object
print(ListIdentitiesResponseV3.to_json())

# convert the object into a dict
list_identities_response_v3_dict = list_identities_response_v3_instance.to_dict()
# create an instance of ListIdentitiesResponseV3 from a dict
list_identities_response_v3_from_dict = ListIdentitiesResponseV3.from_dict(list_identities_response_v3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


