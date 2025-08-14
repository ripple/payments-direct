# AuthenticationRequest

The authentication request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **string** | The client ID associated with a specific set of API credentials. | [default to undefined]
**clientSecret** | **string** | The client secret associated with a specific set of API credentials. | [default to undefined]
**audience** | **string** | The value of the &#x60;audience&#x60; field is based on [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) syntax.  **Format**: &#x60;urn:ripplexcurrent-{ENVIRONMENT_STRING}:{YOUR_TENANT_ID}&#x60;  * The first component is &#x60;urn:ripplenetxcurrent-&#x60;. * The second component refers to the environment you want to access. * The third component is your tenant ID. Ripple integration engineers provide this component during training.  | Environment | Environment string | Description | | --- | --- | --- | | Test | &#x60;test&#x60; | Test environment with simulated partners and simulated currency. | | Production | &#x60;prod&#x60; | Production environment for Ripple\&#39;s internal services. |  **Example**: &#x60;urn:ripplexcurrent-test:{YOUR_TENANT_ID}&#x60;  | [default to undefined]
**grantType** | **string** | Set the grant-type for this client credentials request. This must be set to &#x60;client_credentials&#x60;. | [default to undefined]

## Example

```typescript
import { AuthenticationRequest } from '@ripple/payments-direct-client';

const instance: AuthenticationRequest = {
    clientId,
    clientSecret,
    audience,
    grantType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
