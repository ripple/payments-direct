

# AeIpiDTO

Rails: IPI, FTS  Rail Definitions:  IPI: - Availability: 24/7/365 - Limit: AED 25,000 - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  FTS: - Availability: Business days only - Limit: No limit - Settlement: Same-day - Cut-off time: ~2:00 PM GST - Banking holidays: UAE Central Bank holidays apply  Routing Evaluation Order:   1. IPI        - Conditions: beneficiary account is IPI-addressable AND amount ≤ AED 25,000   2. FTS        - Conditions: otherwise applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**iban** | **String** | The International Bank Account Number (IBAN) of the identity&#39;s account |  |



