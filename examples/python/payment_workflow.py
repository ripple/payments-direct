import time
import logging

from ripple_payments_direct.configuration import Configuration
from ripple_payments_direct.api_client import ApiClient
from ripple_payments_direct.api.authentication_api import AuthenticationApi
from ripple_payments_direct.api.quote_api import QuoteApi
from ripple_payments_direct.api.identities_v2_api import IdentitiesV2Api
from ripple_payments_direct.api.payments_api import PaymentsApi
from ripple_payments_direct.api.ledger_public_api import LedgerPublicApi
from ripple_payments_direct.models import *

# Setup logger
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("PaymentWorkflow")

# Configuration
client_id = ""
client_secret = ""
base_url = ""
tenant_id = ""

# Globals
quote_id = None
identity_id = None

def setup_api_client():
    config = Configuration(host=base_url)
    return ApiClient(configuration=config)

# Get JWT token
def authenticate():
    global quote_api, identity_api, payments_api, ledger_api

    api_client = setup_api_client()
    auth_api = AuthenticationApi(api_client)

    auth_request = AuthenticationRequest(
        client_id=client_id,
        client_secret=client_secret,
        audience=tenant_id,
        grant_type="client_credentials"
    )

    response = auth_api.authenticate(auth_request)
    access_token = response.access_token
    logger.info("Authenticated successfully.")

    # Set auth token for other APIs
    api_client.configuration.access_token = access_token

    quote_api = QuoteApi(api_client)
    identity_api = IdentitiesV2Api(api_client)
    payments_api = PaymentsApi(api_client)
    ledger_api = LedgerPublicApi(api_client)

# Get a quote
def get_quote():
    global quote_id

    request = QuoteCollectionRequest(
        source_country="US",
        source_currency="USD",
        destination_currency="MXN",
        destination_country="MX",
        quote_amount=20.0,
        quote_amount_type=QuoteAmountType("SOURCE_AMOUNT"),
        payin_category="T_PLUS_ONE",
        payout_category="BANK"
    )

    response = quote_api.create_quote_collection(request)
    quote_id = str(response.quotes[0].quote_id)
    logger.info(f"Quote ID: {quote_id}")


def build_pii_data():
    return {
        "Cdtr": {
            "Nm": "Botsford and Sons",
            "CtctDtls": {
                "MobNb": "16-834-748-1777",
                "EmailAdr": "Raoul94@yahoo.com"
            },
            "PstlAdr": {
                "AdrLine": ["3103 Orn Garden"],
                "PstCd": "75357",
                "TwnNm": "West Marjolaine",
                "CtrySubDvsn": "Durango",
                "Ctry": "MX"
            },
            "Id": {
                "OrgId": {
                    "RelShipToDbtr": "SUBS",
                    "dtAndPlcofIncorp": {"CtryofIncorprtn": "MX"},
                    "Othr": {
                        "Id": "751-539-9808",
                        "SchmeNm": {"Cd": "TXID"}
                    }
                }
            }
        },
        "CdtrAcct": {
            "Ccy": "MXN",
            "Id": {
                "Othr": {
                    "Id": "002010077777777771",
                    "SchmeNm": {"Cd": "CLABE"}
                }
            }
        },
        "CdtrAgt": {
            "FinInstnId": {"Nm": "enhance"},
            "BrnchId": {
                "PstlAdr": {"Ctry": "MX"}
            }
        }
    }

# Create a beneficiary
def create_beneficiary():
    global identity_id

    request = CreateIdentityRequestV2(
        nick_name="Lindgren - Breitenberg",
        identity_type=IdentityTypeV2("BENEFICIARY"),
        use_case_type=UseCaseType("BUSINESS"),
        pii_data=build_pii_data()
    )

    response = identity_api.create_identity_v2(request)
    identity_id = str(response.identity_id)
    logger.info(f"Beneficiary Identity ID: {identity_id}")

# Create a payment
def create_payment():
    request = PaymentRequest(
        beneficiary_identity_id=identity_id,
        purpose_code="OTHR",
        internal_id="test",
        payment_labels=["test-payment"],
        quote_id=quote_id
    )

    response = payments_api.create_payment(request)
    payment_id = str(response.payment_id)
    logger.info(f"Payment ID: {payment_id}")

# Poll for terminal payment state
def poll_payment_state(max_attempts=25, delay_seconds=10):
    for i in range(max_attempts):
        transitions = payments_api.get_payment_state_transitions_by_id(quote_id)
        states = transitions.state_transitions

        for state in states:
            updated_to = state.updated_to
            if updated_to == PaymentState.COMPLETED:
                logger.info("Payment completed successfully.")
                return
            if updated_to == PaymentState.FAILED:
                logger.error("Payment failed.")
                raise Exception("Payment failed.")

        logger.info(f"Attempt {i + 1}: Payment not yet completed or failed.")
        time.sleep(delay_seconds)

    raise TimeoutError("Payment did not reach a terminal state within the allowed number of attempts.")

# Delete beneficiary
def delete_beneficiary():
    identity_api.deactivate_identity_v2(identity_id)
    logger.info("Beneficiary deleted.")

# If pre-funded, then use this. Otherwise, this api is not needed.
def get_balance():
    ledger_api.get_balances("USD")


if __name__ == "__main__":
    authenticate()
    get_quote()
    create_beneficiary()
    create_payment()
    poll_payment_state()
    delete_beneficiary()
    get_balance()
