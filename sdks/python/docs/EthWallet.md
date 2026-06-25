# EthWallet

Rails: CRYPTO  Rail Definitions:  CRYPTO:   - Availability: 24/7/365   - Limit: None   - Settlement: Blockchain dependent   - Cut-off time: None   - Banking holidays: Not applicable  Routing Policy: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wallet_address** | **str** | Receiving wallet address at the exchange | 
**crypto_institution_name** | **str** | Name of the crypto exchange | 
**network** | **str** | The default name of the blockchain network for this instrument | [optional] [readonly] [default to 'ETHEREUM']
**supported_corridors** | **List[str]** | The list of supported corridors for the payout method | [optional] [readonly] 

## Example

```python
from ripple_payments_direct.models.eth_wallet import EthWallet

# TODO update the JSON string below
json = "{}"
# create an instance of EthWallet from a JSON string
eth_wallet_instance = EthWallet.from_json(json)
# print the JSON string representation of the object
print(EthWallet.to_json())

# convert the object into a dict
eth_wallet_dict = eth_wallet_instance.to_dict()
# create an instance of EthWallet from a dict
eth_wallet_from_dict = EthWallet.from_dict(eth_wallet_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


