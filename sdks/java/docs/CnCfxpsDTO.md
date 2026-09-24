

# CnCfxpsDTO

Rails: CFXPS (China Foreign Exchange Payment System)  Rail Definitions:  CFXPS: - Availability: Business days and banking hours only - Limit: No limit (institutional) - Settlement: Same-day or next business day - Cut-off time: 5:00 PM CST (varies by bank) - Banking holidays: China banking holidays apply 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | Beneficiary Bank Name. Looked up from swiftCode. |  |
|**swiftCode** | **String** | Beneficiary Bank SWIFT/BIC Code. See the China entry in the bank code lookup in the integration resources for the supported list. |  |
|**accountNumber** | **String** | Beneficiary Account Number. |  |
|**accountHolderName** | **String** | Beneficiary Account Holder Name (English). |  |



