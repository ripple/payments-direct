# DestinationV2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beneficiary_financial_instrument_id** | **str** | The financial instrument ID, the identity ID of the payment beneficiary is related to. | [optional] 
**destination_amount** | **float** | The amount received by the payment beneficiary. This field can hold a value with up to 6 decimal places. | [optional] 
**destination_country** | **str** | The country where the beneficiary is located specified in Alpha-2 Code format as defined in the ISO CountryCode ISO 3166-1 list. If the beneficiary is an individual, then this value is their country of residence. If the beneficiary is an institution, then this value is their the country of incorporation. | [optional] 
**destination_currency** | **str** | The currency code of the currency in which the beneficiary will receive this payment. | [optional] 
**destination_blockchain_network** | **str** | The name of the blockchain network on which the beneficiary will receive this payment. | [optional] 
**beneficiary_identity_id** | **str** | The unique ID associated with the payment beneficiary&#39;s identity record. | [optional] 
**beneficiary_identity_version** | **int** | The current version of the beneficiary&#39;s identity record. | [optional] 
**beneficiary_identity_nick_name** | **str** | Nickname associated with the beneficiary&#39;s identity record. | [optional] 
**payout** | **str** | The payout category for this payment. | [optional] 

## Example

```python
from ripple_payments_direct.models.destination_v2 import DestinationV2

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationV2 from a JSON string
destination_v2_instance = DestinationV2.from_json(json)
# print the JSON string representation of the object
print(DestinationV2.to_json())

# convert the object into a dict
destination_v2_dict = destination_v2_instance.to_dict()
# create an instance of DestinationV2 from a dict
destination_v2_from_dict = DestinationV2.from_dict(destination_v2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


