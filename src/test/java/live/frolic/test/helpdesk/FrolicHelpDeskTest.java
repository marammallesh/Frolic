package live.frolic.test.helpdesk;

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
import live.frolic.chooseregion.pages.FrolicChooseRegionPage;
import live.frolic.helpdesk.pages.FrolicHelpDeskPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;

/*
 * @author b2btesters
*/

@Epic("Frolic HelpDesk feature")
@Feature("HelpDesk feature Functionality")
public class FrolicHelpDeskTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicHelpDeskTest.class.getName());

	private FrolicHelpDeskPage helpDeskPage = null;
	private FrolicChooseRegionPage chooseRegion = null;
	private FrolicUserLoginPage userLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(@Optional String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in FrolicHelpDeskTest");

		this.helpDeskPage = new FrolicHelpDeskPage(driver);
		this.chooseRegion = new FrolicChooseRegionPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in FrolicHelpDeskTest");
	}

	@Test(priority = 1, description = "Verifying General FAQ  in HelpDesk")
	@Description("Verifying General FAQ  in HelpDesk")
	@Severity(SeverityLevel.MINOR)
	@Story("Verifying General FAQ  in HelpDesk")
	public void verifyGeneral() throws InterruptedException {
		logger.info("Starting of General FAQ  in Helpdesk method");

		try {
			helpDeskPage.clickOnMenuButton();
			helpDeskPage.clickOnHelpAndSupport();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			helpDeskPage.clickOnGeneral();

			Assert.assertEquals(helpDeskPage.getFaqsText(), expectedAssertionsProp.getProperty(FAQS_LABEL));

			helpDeskPage.clickOnAllFaqs();
			helpDeskPage.clickOnBackIcon();
		} catch (Exception e) {
			helpDeskPage.redirectToHelpdeskLabel();
			Assert.fail("Exception occured while testing General FAQ : " + e.getMessage());
			logger.error("Exception occured while verifying General FAQ :", e);
		}

		logger.info("Ending of General FAQ  in Helpdesk method");
	}

	@Test(priority = 2, description = "Verifying KYC FAQ in HelpDesk")
	@Description("Verifying KYC FAQ in HelpDesk")
	@Severity(SeverityLevel.MINOR)
	@Story("Verifying KYC FAQ in HelpDesk")
	public void verifyKyc() throws InterruptedException {
		logger.info("Starting of Kyc FAQ in HelpDesk method");
		try {
			helpDeskPage.clickOnKyc();

			Assert.assertEquals(helpDeskPage.getKycText(), expectedAssertionsProp.getProperty(KYC_LABEL));

			helpDeskPage.clickOnAllFaqs();
			helpDeskPage.clickOnBackIcon();

		} catch (Exception e) {
			helpDeskPage.redirectToHelpdeskLabel();
			Assert.fail("Exception occured while testing  Kyc FAQ : " + e.getMessage());
			logger.error("Exception occured while verifying Kyc FAQ :", e);
		}

		logger.info("Ending of Kyc FAQ in HelpDesk method");
	}

	@Test(priority = 3, description = "Verifying Games FAQ in HelpDesk")
	@Description("Verifying Games FAQ in HelpDesk")
	@Severity(SeverityLevel.MINOR)
	@Story("Verifying Games FAQ in HelpDesk")
	public void verifyGames() throws InterruptedException {
		logger.info("Starting of Games FAQ in HelpDesk method");

		try {
			helpDeskPage.clickOnGamesButton();

			Assert.assertEquals(helpDeskPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

			helpDeskPage.clickOnBattlesButton();

			Assert.assertEquals(helpDeskPage.getBattlesText(), expectedAssertionsProp.getProperty(BATTLES_LABEL));

			helpDeskPage.clickOnAllFaqs();
			helpDeskPage.clickOnBackIcon();
			helpDeskPage.clickOnTournaments();

			Assert.assertEquals(helpDeskPage.getTournamentsText(),
					expectedAssertionsProp.getProperty(TOURNAMENT_LABEL));

			helpDeskPage.clickOnAllFaqs();
			helpDeskPage.clickOnBackIcon();
			helpDeskPage.clickOnGamePlays();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			helpDeskPage.clickOnRecentActivityViewAllButton();

			Assert.assertEquals(helpDeskPage.getRecentActivityText(),
					expectedAssertionsProp.getProperty(RECENT_ACTIVITY_LABEL));

			helpDeskPage.clickOnTournaments();
			helpDeskPage.clickOnBattlesButton();
			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));
		} catch (Exception e) {
			helpDeskPage.redirectToHelpdeskLabel();
			Assert.fail("Exception occured while testing  Games FAQ : " + e.getMessage());
			logger.error("Exception occured while verifying Games FAQ :", e);
		}

		logger.info("Ending of Games FAQ in HelpDesk method");
	}

	@Test(priority = 4, description = "Verifying Wallet FAQ in HelpDesk")
	@Description("Verifying Wallet FAQ in HelpDesk")
	@Severity(SeverityLevel.MINOR)
	@Story("Verifying Wallet FAQ in HelpDesk")
	public void verifyWallet() throws InterruptedException {
		logger.info("Starting of Wallet FAQ in HelpDesk method");

		try {
			helpDeskPage.clickOnWalletButton();

			Assert.assertEquals(helpDeskPage.getWalletText(), expectedAssertionsProp.getProperty(WALLET1_LABEL));

			helpDeskPage.clickOnDepositButton();

			Assert.assertEquals(helpDeskPage.getDepositText(), expectedAssertionsProp.getProperty(DEPOSIT_LABEL));

			helpDeskPage.clickOnAllFaqs();
			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getWalletText(), expectedAssertionsProp.getProperty(WALLET1_LABEL));

			helpDeskPage.clickOnWithdrawalsButton();

			Assert.assertEquals(helpDeskPage.getWithdrawalsText(),
					expectedAssertionsProp.getProperty(WITHDRAWALS_LABEL));

			helpDeskPage.clickOnAllFaqs();
			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getWalletText(), expectedAssertionsProp.getProperty(WALLET1_LABEL));

			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(chooseRegion.getAboutUsText(), expectedAssertionsProp.getProperty(ABOUT_US_LABEL));

		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Wallet FAQ : " + e.getMessage());
			logger.error("Exception occured while verifying Wallet FAQ :", e);
		}

		logger.info("Ending of Wallet FAQ in HelpDesk method");
	}
}