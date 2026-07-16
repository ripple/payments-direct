# ThPromptpay

Rails: PromptPay  Rail Definitions:  PromptPay (National ITMX):   - Availability: 24/7/365   - Limit: THB 500,000 per transaction   - Settlement: Real-time (within seconds)   - Cut-off time: None   - Banking holidays: Not applicable  Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | Domestic bank code for the identity&#39;s bank in Thailand. See the Bank Codes resource in Ripple Docs for the authoritative list of supported values. | 
**account_number** | **str** | The identity&#39;s bank account number | 

## Example

```python
from ripple_payments_direct.models.th_promptpay import ThPromptpay

# TODO update the JSON string below
json = "{}"
# create an instance of ThPromptpay from a JSON string
th_promptpay_instance = ThPromptpay.from_json(json)
# print the JSON string representation of the object
print(ThPromptpay.to_json())

# convert the object into a dict
th_promptpay_dict = th_promptpay_instance.to_dict()
# create an instance of ThPromptpay from a dict
th_promptpay_from_dict = ThPromptpay.from_dict(th_promptpay_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


