

# HkBankPayoutDTO

Rails: Bank Payout  Rail Definitions:  Bank Payout: - Availability: Business days only - Limit: None - Settlement: Same-day to T+1 - Cut-off time: Bank-dependent - Banking holidays: Hong Kong banking holidays apply  Routing Evaluation Order: Not applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the beneficiary&#39;s bank |  |
|**accountNumber** | **String** | Bank account number (BBAN) |  |
|**accountHolderName** | **String** | Name of the account holder |  |
|**swiftCode** | **String** | SWIFT/BIC code of the bank |  |
|**currency** | **String** | Currency code. Only HKD is supported for Hong Kong Bank Payout. |  [optional] |



