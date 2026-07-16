# RippleFinancialInstrument

Request to create a new financial instrument for an identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usAch** | [**UsAch**](UsAch.md) |  | [optional] [default to undefined]
**usFedwire** | [**UsFedwire**](UsFedwire.md) |  | [optional] [default to undefined]
**mxSpei** | [**MxSpei**](MxSpei.md) |  | [optional] [default to undefined]
**euSepa** | [**EuSepa**](EuSepa.md) |  | [optional] [default to undefined]
**gbFps** | [**GbFps**](GbFps.md) |  | [optional] [default to undefined]
**ngBankPayout** | [**NgBankPayout**](NgBankPayout.md) |  | [optional] [default to undefined]
**ghBankPayout** | [**GhBankPayout**](GhBankPayout.md) |  | [optional] [default to undefined]
**rwBankPayout** | [**RwBankPayout**](RwBankPayout.md) |  | [optional] [default to undefined]
**zaBankPayout** | [**ZaBankPayout**](ZaBankPayout.md) |  | [optional] [default to undefined]
**ugBankPayout** | [**UgBankPayout**](UgBankPayout.md) |  | [optional] [default to undefined]
**zmBankPayout** | [**ZmBankPayout**](ZmBankPayout.md) |  | [optional] [default to undefined]
**ethWallet** | [**EthWallet**](EthWallet.md) |  | [optional] [default to undefined]
**tronWallet** | [**TronWallet**](TronWallet.md) |  | [optional] [default to undefined]
**solWallet** | [**SolWallet**](SolWallet.md) |  | [optional] [default to undefined]
**brPix** | [**BrPix**](BrPix.md) |  | [optional] [default to undefined]
**coPse** | [**CoPse**](CoPse.md) |  | [optional] [default to undefined]
**brTed** | [**BrTed**](BrTed.md) |  | [optional] [default to undefined]
**caEft** | [**CaEft**](CaEft.md) |  | [optional] [default to undefined]
**hkBankPayout** | [**HkBankPayout**](HkBankPayout.md) |  | [optional] [default to undefined]
**idBifast** | [**IdBifast**](IdBifast.md) |  | [optional] [default to undefined]
**krKftc** | [**KrKftc**](KrKftc.md) |  | [optional] [default to undefined]
**inNeft** | [**InNeft**](InNeft.md) |  | [optional] [default to undefined]
**peLbtr** | [**PeLbtr**](PeLbtr.md) |  | [optional] [default to undefined]
**cnTrade** | [**CnTrade**](CnTrade.md) |  | [optional] [default to undefined]
**cnIndividual** | [**CnIndividual**](CnIndividual.md) |  | [optional] [default to undefined]
**cnIndividualTrade** | [**CnIndividualTrade**](CnIndividualTrade.md) |  | [optional] [default to undefined]
**cnCfxps** | [**CnCfxps**](CnCfxps.md) |  | [optional] [default to undefined]
**clTef** | [**ClTef**](ClTef.md) |  | [optional] [default to undefined]
**aeIpi** | [**AeIpi**](AeIpi.md) |  | [optional] [default to undefined]
**trFast** | [**TrFast**](TrFast.md) |  | [optional] [default to undefined]
**phNrps** | [**PhNrps**](PhNrps.md) |  | [optional] [default to undefined]
**thPromptpay** | [**ThPromptpay**](ThPromptpay.md) |  | [optional] [default to undefined]
**arInterbanking** | [**ArInterbanking**](ArInterbanking.md) |  | [optional] [default to undefined]
**currency** | **string** | The 3-letter ISO currency code of the financial instrument. | [default to undefined]
**label** | **string** | A user-defined label for the financial instrument. | [optional] [default to undefined]
**financialInstrumentType** | **string** | The type of financial instrument or payment rail used for executing the transaction. This determines the structure and validation of account details required for the payout.  | [default to undefined]

## Example

```typescript
import { RippleFinancialInstrument } from '@ripple/payments-direct-client';

const instance: RippleFinancialInstrument = {
    usAch,
    usFedwire,
    mxSpei,
    euSepa,
    gbFps,
    ngBankPayout,
    ghBankPayout,
    rwBankPayout,
    zaBankPayout,
    ugBankPayout,
    zmBankPayout,
    ethWallet,
    tronWallet,
    solWallet,
    brPix,
    coPse,
    brTed,
    caEft,
    hkBankPayout,
    idBifast,
    krKftc,
    inNeft,
    peLbtr,
    cnTrade,
    cnIndividual,
    cnIndividualTrade,
    cnCfxps,
    clTef,
    aeIpi,
    trFast,
    phNrps,
    thPromptpay,
    arInterbanking,
    currency,
    label,
    financialInstrumentType,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
