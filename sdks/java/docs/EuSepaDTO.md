

# EuSepaDTO

Rails: SCT Inst, SCT  Rail Definitions:  SCT Inst: - Availability: 24/7/365 - Limit: €100,000 (bank-dependent) - Settlement: Instant - Cut-off time: None - Banking holidays: Not applicable  SCT: - Availability: Business days only - Limit: No limit - Settlement: T+2 to T+5  - Cut-off time: 3:00PM GMT/BST - Banking holidays: TARGET2 holidays apply  Routing Evaluation Order:    1. SCT Inst        - Conditions: beneficiary account is SCT Inst-addressable AND amount ≤ €100,000   2. SCT        - Conditions: otherwise applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**iban** | **String** | The International Bank Account Number (IBAN) of the identity&#39;s account |  |



