# AuthenticationRequest

The authentication request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The client ID associated with a specific set of API credentials. | 
**client_secret** | **str** | The client secret associated with a specific set of API credentials. | 
**audience** | **str** | The value of the &#x60;audience&#x60; field is based on [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) syntax.  **Format**: &#x60;urn:ripplexcurrent-{ENVIRONMENT_STRING}:{YOUR_TENANT_ID}&#x60;  * The first component is &#x60;urn:ripplenetxcurrent-&#x60;. * The second component refers to the environment you want to access. * The third component is your tenant ID. Ripple integration engineers provide this component during training.  | Environment | Environment string | Description | | --- | --- | --- | | Test | &#x60;test&#x60; | Test environment with simulated partners and simulated currency. | | Production | &#x60;prod&#x60; | Production environment for Ripple&#39;s internal services. |  **Example**: &#x60;urn:ripplexcurrent-test:{YOUR_TENANT_ID}&#x60;  | 
**grant_type** | **str** | Set the grant-type for this client credentials request. This must be set to &#x60;client_credentials&#x60;. | 

## Example

```python
from ripple_payments_direct.models.authentication_request import AuthenticationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AuthenticationRequest from a JSON string
authentication_request_instance = AuthenticationRequest.from_json(json)
# print the JSON string representation of the object
print(AuthenticationRequest.to_json())

# convert the object into a dict
authentication_request_dict = authentication_request_instance.to_dict()
# create an instance of AuthenticationRequest from a dict
authentication_request_from_dict = AuthenticationRequest.from_dict(authentication_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


