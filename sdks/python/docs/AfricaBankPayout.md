# AfricaBankPayout

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Country-dependant - Limit:   - Ghana: ₵100,000   - Nigeria: ₦5,000,000   - Zambia: ZK 150,000   - Uganda: UGX 20,000   - Rwanda: RWF 10,000,000   - South Africa: R 300,000 - Settlement: Real time to 48 hours - Cut-off time: Real time - Banking holidays: Country specific banking holidays apply - Routing Evaluation Order: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_name** | **str** | The name of the identity&#39;s bank | 
**bank_code** | **str** | The bank code of the identity&#39;s bank | 
**account_number** | **str** | The identity&#39;s account number associated with the Account Identification Scheme | 
**country** | **str** | The country of the identity’s bank, using the Alpha-2 code as defined in ISO 3166-1.   Allowed values are:  - &#x60;GH&#x60;   - &#x60;NG&#x60;   - &#x60;RW&#x60;   - &#x60;UG&#x60;   - &#x60;ZA&#x60;   - &#x60;ZM&#x60;  | 

## Example

```python
from ripple_payments_direct.models.africa_bank_payout import AfricaBankPayout

# TODO update the JSON string below
json = "{}"
# create an instance of AfricaBankPayout from a JSON string
africa_bank_payout_instance = AfricaBankPayout.from_json(json)
# print the JSON string representation of the object
print(AfricaBankPayout.to_json())

# convert the object into a dict
africa_bank_payout_dict = africa_bank_payout_instance.to_dict()
# create an instance of AfricaBankPayout from a dict
africa_bank_payout_from_dict = AfricaBankPayout.from_dict(africa_bank_payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


