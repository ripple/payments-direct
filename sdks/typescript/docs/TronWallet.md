# TronWallet

Rails: CRYPTO  Rail Definitions:  CRYPTO:   - Availability: 24/7/365   - Limit: None   - Settlement: Blockchain dependent   - Cut-off time: None   - Banking holidays: Not applicable  Routing Policy: Not applicable 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**walletAddress** | **string** | Receiving wallet address at the exchange | [default to undefined]
**cryptoInstitutionName** | **string** | Name of the crypto exchange | [default to undefined]
**network** | **string** | The default name of the blockchain network for this instrument | [optional] [readonly] [default to 'TRON']
**supportedCorridors** | **Array&lt;string&gt;** | The list of supported corridors for the payout method | [optional] [readonly] [default to undefined]

## Example

```typescript
import { TronWallet } from '@ripple/payments-direct-client';

const instance: TronWallet = {
    walletAddress,
    cryptoInstitutionName,
    network,
    supportedCorridors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
