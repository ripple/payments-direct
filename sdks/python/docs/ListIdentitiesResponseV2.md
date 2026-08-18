# ListIdentitiesResponseV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[IdentityV2]**](IdentityV2.md) | The list of the identities that match the query parameters | [optional] 

## Example

```python
from ripple_payments_direct.models.list_identities_response_v2 import ListIdentitiesResponseV2

# TODO update the JSON string below
json = "{}"
# create an instance of ListIdentitiesResponseV2 from a JSON string
list_identities_response_v2_instance = ListIdentitiesResponseV2.from_json(json)
# print the JSON string representation of the object
print(ListIdentitiesResponseV2.to_json())

# convert the object into a dict
list_identities_response_v2_dict = list_identities_response_v2_instance.to_dict()
# create an instance of ListIdentitiesResponseV2 from a dict
list_identities_response_v2_from_dict = ListIdentitiesResponseV2.from_dict(list_identities_response_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


