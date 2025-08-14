# CreateIdentityRequestV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pii_data** | **Dict[str, object]** | PII data in JSON format.  You must use the correct &#x60;piiData&#x60; schema for the type of identity you want to create.  **Note**: Reach out to your Ripple liaison to get this schema.  | 
**identity_type** | [**IdentityTypeV2**](IdentityTypeV2.md) |  | 
**nick_name** | **str** | The nickname for the identity provided at the time of identity creation | [optional] 
**use_case_type** | [**UseCaseType**](UseCaseType.md) |  | 

## Example

```python
from ripple_payments_direct.models.create_identity_request_v2 import CreateIdentityRequestV2

# TODO update the JSON string below
json = "{}"
# create an instance of CreateIdentityRequestV2 from a JSON string
create_identity_request_v2_instance = CreateIdentityRequestV2.from_json(json)
# print the JSON string representation of the object
print(CreateIdentityRequestV2.to_json())

# convert the object into a dict
create_identity_request_v2_dict = create_identity_request_v2_instance.to_dict()
# create an instance of CreateIdentityRequestV2 from a dict
create_identity_request_v2_from_dict = CreateIdentityRequestV2.from_dict(create_identity_request_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


