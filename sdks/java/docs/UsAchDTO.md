

# UsAchDTO

Rails: RTP, ACH  Rail Definitions:  RTP:   - Availability: 24/7/365   - Limit: $5,000,000   - Settlement: <5 minutes   - Cut-off time: None   - Banking holidays: Not applicable  ACH:   - Availability: Business days only   - Limit: $1,000,000   - Settlement: Same-day   - Cut-off time: 3:00 PM EST   - Banking holidays: U.S. banking holidays apply  Routing Evaluation Order:    1. RTP      - Conditions: beneficiary account is RTP-addressable AND amount ≤ $5,000,000   2. ACH      - Conditions: otherwise applicable 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankName** | **String** | The name of the identity&#39;s bank |  |
|**bankRoutingNumber** | **String** | The identity&#39;s bank routing number |  |
|**accountNumber** | **String** | The identity&#39;s account number into which the funds must be credited |  |
|**accountType** | **String** | The identity’s account type. |  |



