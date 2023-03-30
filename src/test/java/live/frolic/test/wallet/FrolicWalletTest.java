package live.frolic.test.wallet;

import static live.frolic.util.Constants.*;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.helpdesk.pages.FrolicHelpDeskPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;
import live.frolic.wallet.pages.FrolicWalletPage;
import live.frolic.chooseregion.pages.*;
/*
 * @author b2btesters
*/

@Epic("Frolic Wallet AddMoney feature")
@Feature("Wallet Add Money Through Upi And Bank Functionality")
public class FrolicWalletTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicWalletTest.class.getName());
	private FrolicWalletPage walletPage = null;
	private FrolicHelpDeskPage frolicHelpDesk = null;
	private FrolicUserLoginPage userLoginPage = null;

	private FrolicChooseRegionPage chooseRegionPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(@Optional String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in FrolicWalletTest");

		this.walletPage = new FrolicWalletPage(driver);
		this.frolicHelpDesk = new FrolicHelpDeskPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);
		this.chooseRegionPage = new FrolicChooseRegionPage(driver);

		logger.info("Ending of initClass method in FrolicWalletTest");
	}

	@Test(priority = 1, description = "Verifying Wallet")
	@Description("Verifying Wallet")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Wallet")
	public void verifyWallet() throws InterruptedException {
		logger.info("Starting of verifyWallet method");

		try {
			chooseRegionPage.clickOnMenuTab();
			walletPage.clickOnWalletButton();

			Assert.assertEquals(walletPage.getMyWalletText(), expectedAssertionsProp.getProperty(MYWALLET_LABEL));

			//Assert.assertEquals(walletPage.getCheckBalanceAndTransactionDeatailsText(),
				//	expectedAssertionsProp.getProperty(MY_BALANCE_LABEL));

			walletPage.clickOnTransactionIcon();

			Assert.assertEquals(walletPage.getTransactionText(), expectedAssertionsProp.getProperty(TRANSACTION_LABEL));

			walletPage.clickOnBackButton();

			Assert.assertEquals(walletPage.getMyWalletText(), expectedAssertionsProp.getProperty(MYWALLET_LABEL));

			walletPage.clickOnHelpIcon();

			Assert.assertEquals(frolicHelpDesk.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			walletPage.clickOnBackButton();
			walletPage.clickOnLearnMoreButton();

			Assert.assertEquals(walletPage.getBonusText(), expectedAssertionsProp.getProperty(BONUS_LABEL));

			walletPage.clickOnBackButton();

		} catch (Exception e) {
			walletPage.redirectToAddMoney();
			Assert.fail("Exception occured while testing  Wallet : " + e.getMessage());
			logger.error("Exception occured while verifying Wallet :", e);
		}

		logger.info("Ending of verifyWallet method");
	}

	@Test(priority = 2, description = "Verifying AddMoney in Wallet")
	@Description("Verifying AddMoney in Wallet")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying AddMoney in Wallet")
	public void verifyAddMoney() throws InterruptedException {
		logger.info("Starting of verifyAddMoney method");

		try {
			walletPage.clickOnAddMoneyButton();

			Assert.assertEquals(walletPage.getAddMoneyText(), expectedAssertionsProp.getProperty(ADD_MONEY_LABEL));

			walletPage.setAddMoney(testDataProp.getProperty("add.money"));

			Assert.assertEquals(walletPage.getErrorMessageText(), expectedAssertionsProp.getProperty(ERROR_MSG));

			walletPage.clickOnAddSelectedAmount();
		} catch (Exception e) {
			walletPage.redirectToAddMoney();
			Assert.fail("Exception occured while testing  Wallet Add Money : " + e.getMessage());
			logger.error("Exception occured while verifying Wallet Add Money :", e);
		}

		logger.info("Ending of verifyAddMoney method");
	}

	@Test(priority = 3, description = "Verifying Coupons and Scratch cards in Wallet")
	@Description("Verifying Coupons and Scratch cards in Wallet")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying AddMoney in Wallet")

	public void verifyCouponsAndScratchCards() {
		logger.info("Starting of verifyCouponsAndScratchCards method");

		try {
			walletPage.clickOnViewAllCoupons();

			Assert.assertEquals(walletPage.getCouponsAndOffersText(),
					expectedAssertionsProp.getProperty(COUPONS_OFFERS_LABEL));

			walletPage.clickOnScratchCardsTab();

			if (walletPage.checkScratchCardAvalilable() == true) {

				walletPage.clickOnScratchCard();

				Assert.assertEquals(walletPage.getTermsAndConditionstext(),
						expectedAssertionsProp.getProperty(TERMS_AND_CONDITIONS_LABEL));

				walletPage.clickOnBackButton();
			}

			walletPage.clickOnCouponsAndOffers();

			if (walletPage.checkNoCouponsAvailable() == true) {

				Assert.assertEquals(walletPage.getNoCouponsText(),
						expectedAssertionsProp.getProperty(NO_COUPONS_LABEL));

				walletPage.clickOnBackButton();
			} else {

				walletPage.clickOnApplyCode();

				Assert.assertEquals(walletPage.getAddMoneyText(), expectedAssertionsProp.getProperty(ADD_MONEY_LABEL));
			}
		} catch (Exception e) {
			walletPage.redirectToAddMoney();
			Assert.fail("Exception occured while testing  Coupons and Scratch cards : " + e.getMessage());
			logger.error("Exception occured while verifying Coupons and Scratch cards :", e);
		}

		logger.info("Ending of verifyCouponsAndScratchCards method");
	}

	@Test(priority = 4, description = "Verifying Payment by UPI in Wallet")
	@Description("Verifying Payment by UPI in Wallet")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Payment by UPI in Wallet")
	public void verifyPaymentByUpi() throws InterruptedException {
		logger.info("Starting of verifyPaymentByUpi method");

		try {

			Assert.assertEquals(walletPage.getAddMoneyText(), expectedAssertionsProp.getProperty(ADD_MONEY_LABEL));

			walletPage.clickOnContinueButton();

			// this method will be used for local code run//
			// walletPage.clickOnAvailableUpi();
			walletPage.setUpiId(testDataProp.getProperty("invalid.upi"));

			Assert.assertEquals(walletPage.getUpiErrorMessageText(), expectedAssertionsProp.getProperty(UPI_ERROR_MSG));

			walletPage.setUpiId(testDataProp.getProperty("valid.upi"));

			Assert.assertEquals(walletPage.getUpiNameText(),
					expectedAssertionsProp.getProperty(VALID_UPI_USER_NAME_TEXT));

			walletPage.clickOnPayButton();

			Assert.assertEquals(walletPage.getTransactionDetailsText(),
					expectedAssertionsProp.getProperty(LABEL_TRANSACTION_DETAILS));

			walletPage.clickOnBackButton();

			Assert.assertEquals(walletPage.getMyWalletText(), expectedAssertionsProp.getProperty(MYWALLET_LABEL));

		} catch (Exception e) {
			walletPage.redirectToAddMoney();
			Assert.fail("Exception occured while testing  Add Money by UPI : " + e.getMessage());
			logger.error("Exception occured while verifying Add Money by UPI :", e);
		}

		logger.info("Ending of verifyPaymentByUpi method");
	}

	@Test(priority = 5, description = "Verifying Payment by Bank in Wallet")
	@Description("Verifying Payment by Bank in Wallet")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Payment by Bank in Wallet")
	public void verifyPaymentByBank() throws InterruptedException {

		try {
			logger.info("Starting of verifyPaymentByBank method");

			walletPage.clickOnAddMoneyButton();

			Assert.assertEquals(walletPage.getAddMoneyText(), expectedAssertionsProp.getProperty(ADD_MONEY_LABEL));

			walletPage.clickOnFiftyButton();
			walletPage.clickOnContinueButton();
			walletPage.clickOnNetBanking();

			Assert.assertEquals(walletPage.getSelectOneText(), expectedAssertionsProp.getProperty(SELECT_ABOVE_LABEL));

			walletPage.clickOnNetBankingCards();
			walletPage.clickOnSelectYourBankHere();

			Assert.assertEquals(walletPage.getSelectYourBankText(),
					expectedAssertionsProp.getProperty(SELECT_YOUR_BANK_LABEL));

			walletPage.clickOnSelectdBank();

			Assert.assertEquals(walletPage.getSelectedBankText(),
					expectedAssertionsProp.getProperty(SELECTED_BANK_OPTION_LABEL));

			walletPage.clickOnPayButton();
			walletPage.clickOnFailureButton();

			Assert.assertEquals(walletPage.getSuccessMessageText(), expectedAssertionsProp.getProperty(FAILURE_MSG));

			walletPage.clickOnBackButton();

			Assert.assertEquals(walletPage.getMyWalletText(), expectedAssertionsProp.getProperty(MYWALLET_LABEL));

			walletPage.clickOnBackButton();
		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Add Money by Bank : " + e.getMessage());
			logger.error("Exception occured while verifying Add Money by bank :", e);
		}

		logger.info("Ending of verifyPaymentByBank method");
	}
}
