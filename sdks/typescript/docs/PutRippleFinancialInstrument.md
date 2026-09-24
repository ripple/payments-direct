# PutRippleFinancialInstrument

Request to update an existing financial instrument of an identity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **string** | A user-defined label for the financial instrument. | [optional] [default to undefined]
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
**krKftc** | [**KrKftc**](KrKftc.md) |  | [optional] [default to undefined]
**inNeft** | [**InNeft**](InNeft.md) |  | [optional] [default to undefined]
**peLbtr** | [**PeLbtr**](PeLbtr.md) |  | [optional] [default to undefined]
**auNpp** | [**AuNpp**](AuNpp.md) |  | [optional] [default to undefined]
**cnCfxps** | [**CnCfxps**](CnCfxps.md) |  | [optional] [default to undefined]
**clTef** | [**ClTef**](ClTef.md) |  | [optional] [default to undefined]
**aeIpi** | [**AeIpi**](AeIpi.md) |  | [optional] [default to undefined]
**arInterbanking** | [**ArInterbanking**](ArInterbanking.md) |  | [optional] [default to undefined]

## Example

```typescript
import { PutRippleFinancialInstrument } from '@ripple/payments-direct-client';

const instance: PutRippleFinancialInstrument = {
    label,
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
    krKftc,
    inNeft,
    peLbtr,
    auNpp,
    cnCfxps,
    clTef,
    aeIpi,
    arInterbanking,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
