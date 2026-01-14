# IndividualIdentityIdentityDocumentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_number** | **str** | Identification Number. | 
**id_type** | **str** | The type of identification document used to identify the identity.  - &#x60;ALIEN_REGISTRATION&#x60; — Alien Registration Number   - &#x60;CUSTOMER_ID&#x60; — Customer Identification Number   - &#x60;DRIVERS_LICENSE&#x60; — Driver’s License Number   - &#x60;PASSPORT&#x60; — Passport Number   - &#x60;EMPLOYEE_ID&#x60; — Employee ID   - &#x60;NATIONAL_ID_NUMBER&#x60; — National ID   - &#x60;SSN&#x60; — Social Security Number   - &#x60;TAX_ID&#x60; — Tax ID  | 

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


