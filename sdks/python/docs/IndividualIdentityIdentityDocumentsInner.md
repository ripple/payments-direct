# IndividualIdentityIdentityDocumentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_number** | **str** | Identification Number. | 
**id_type** | **str** | The type of identification document used to identify the identity. | 

## Example

```python
from ripple_payments_direct.models.individual_identity_identity_documents_inner import IndividualIdentityIdentityDocumentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of IndividualIdentityIdentityDocumentsInner from a JSON string
individual_identity_identity_documents_inner_instance = IndividualIdentityIdentityDocumentsInner.from_json(json)
# print the JSON string representation of the object
print(IndividualIdentityIdentityDocumentsInner.to_json())

# convert the object into a dict
individual_identity_identity_documents_inner_dict = individual_identity_identity_documents_inner_instance.to_dict()
# create an instance of IndividualIdentityIdentityDocumentsInner from a dict
individual_identity_identity_documents_inner_from_dict = IndividualIdentityIdentityDocumentsInner.from_dict(individual_identity_identity_documents_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


