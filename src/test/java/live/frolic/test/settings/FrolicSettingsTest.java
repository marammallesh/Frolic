package live.frolic.test.settings;

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
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.settings.pages.FrolicSettingsPage;
import live.frolic.test.BaseTestAutomation;
import live.frolic.wallet.pages.FrolicWalletPage;

/*
 * @author b2btesters
*/

@Epic("Frolic Settings Feature")
@Feature("Frolic Settings Funtionality")

public class FrolicSettingsTest extends BaseTestAutomation {
	public static final Logger logger = Logger.getLogger(FrolicSettingsTest.class.getName());

	private FrolicSettingsPage settingsPage = null;
	private FrolicWalletPage walletPage = null;
	private FrolicChooseRegionPage chooseRegion = null;
	private FrolicUserLoginPage userLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(@Optional String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in Frolic ChallengePlayLaterTest");

		this.settingsPage = new FrolicSettingsPage(driver);
		this.walletPage = new FrolicWalletPage(driver);
		this.chooseRegion = new FrolicChooseRegionPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in Frolic ChallengePlayLaterTest");
	}

	@Test(priority = 1, description = "Verifying  Settings")
	@Description("Verifying  Settings")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying  Settings")

	public void verifySettings() {
		logger.info("Starting of verify Settings method");

		try {
			settingsPage.clickOnMenuTab();

			Assert.assertEquals(chooseRegion.getAboutUsText(), expectedAssertionsProp.getProperty(ABOUT_US_LABEL));

			chooseRegion.clickOnSettings();

			Assert.assertEquals(chooseRegion.getSettingsText(),
					expectedAssertionsProp.getProperty(SETTINGS_LABEL_SCREEN));

			Assert.assertEquals(settingsPage.getPrivateAccountText(),
					expectedAssertionsProp.getProperty(PRIVATE_ACCOUNT_LABEL));

			settingsPage.clickOnPrivateToggle();
			settingsPage.clickOnDoneIcon();

			Assert.assertEquals(settingsPage.getPushNotificationText(),
					expectedAssertionsProp.getProperty(PUSH_NOTIFICATION_LABEL));

			settingsPage.clickOnPushNotificationToggle();
			settingsPage.clickOnDoneIcon();

			Assert.assertEquals(settingsPage.getDailyLimitText(),
					expectedAssertionsProp.getProperty(DAILY_SPEND_LIMIT_LABEL));

		//	settingsPage.clickOnEditIcon();

		//	Assert.assertEquals(settingsPage.getSetLimitText(),
				//	expectedAssertionsProp.getProperty(SET_DAILY_LIMIT_LABEL));

		//	settingsPage.SetLimit();
		//	settingsPage.clickOnOkButton();

			Assert.assertEquals(settingsPage.getContactUsText(), expectedAssertionsProp.getProperty(CONTACT_US_LABEL));

			settingsPage.clickOnContachUs();

			Assert.assertEquals(settingsPage.getNeedHelptext(), expectedAssertionsProp.getProperty(NEED_HELP_TEXT));

			walletPage.clickOnBackButton();

			Assert.assertEquals(chooseRegion.getSettingsText(), expectedAssertionsProp.getProperty(SETTINGS_LABEL));

			Assert.assertEquals(settingsPage.getShareProfileText(),
					expectedAssertionsProp.getProperty(SHARE_YOUR_PROFILE));

			Assert.assertEquals(settingsPage.getBlockedUsersText(),
					expectedAssertionsProp.getProperty(BLOCKED_USER_LABEL));

			settingsPage.clickOnBlockedUsers();
			walletPage.clickOnBackButton();
			walletPage.clickOnBackButton();

		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing Settings : " + e.getMessage());
			logger.error("Exception occured while verifying Settings :", e);
		}

		logger.info("Ending of verify Settings method");
	}

}
