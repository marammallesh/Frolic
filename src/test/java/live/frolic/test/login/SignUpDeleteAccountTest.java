package live.frolic.test.login;

import static live.frolic.util.Constants.*;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.chooseregion.pages.FrolicChooseRegionPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.settings.pages.FrolicSettingsPage;
import live.frolic.test.BaseTestAutomation;

/*
 * @author b2btesters
*/

public class SignUpDeleteAccountTest extends BaseTestAutomation {
	public static final Logger logger = Logger.getLogger(SignUpDeleteAccountTest.class.getName());

	private FrolicSettingsPage settingsPage = null;
	private FrolicUserLoginPage newUserLoginPage = null;
	private FrolicChooseRegionPage chooseRegion = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in NewUserloginTest");

		this.initMobileDriver(deviceIndex);
		this.newUserLoginPage = new FrolicUserLoginPage(driver);
		this.settingsPage = new FrolicSettingsPage(driver);
		this.chooseRegion = new FrolicChooseRegionPage(driver);

		logger.info("Ending of initClass method in NewUserloginTest");
	}

	@Test(priority = 1, description = "New User Signup and Login Test")
	@Description("New User Signup and Login Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("New User Signup and Login Test")
	public void verifyNewUserLogin() {
		logger.info("Staring of User Signup and Login method");

		try {
			Assert.assertEquals(newUserLoginPage.getGetStartedText(),
					expectedAssertionsProp.getProperty(GET_STARTED_LABEL));

			Assert.assertEquals(newUserLoginPage.getMobileNumberText(),
					expectedAssertionsProp.getProperty(MOBILE_NUMBER_LABEL));

			newUserLoginPage.setPhoneNumber(testDataProp.getProperty("new.user.login"));
			newUserLoginPage.clickOnOtpButton();
			newUserLoginPage.setOTP(testDataProp.getProperty("otp"));
		//	newUserLoginPage.clickOnVerifyButton();

			if (newUserLoginPage.checkWelcomeText()) {

				Assert.assertEquals(newUserLoginPage.getChooseNameText(),
						expectedAssertionsProp.getProperty(CHOOSE_A_USERNAME));

				newUserLoginPage.setInvalidUserName(testDataProp.getProperty("User.name.one"));

				Assert.assertEquals(newUserLoginPage.getUserNameText(),
						expectedAssertionsProp.getProperty(ERROR_MSG_ONE));

				Assert.assertEquals(newUserLoginPage.getSuggestionsText(),
						expectedAssertionsProp.getProperty(SUGGESTIONS_LABEL));

				newUserLoginPage.setValidUserName(testDataProp.getProperty("User.name.two"));

				Assert.assertEquals(newUserLoginPage.getUserNameText(),
						expectedAssertionsProp.getProperty(SUCCESS_MSG_ONE));

				newUserLoginPage.clickOnCreateAccount();

				Assert.assertEquals(newUserLoginPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

			}
		} catch (Exception e) {
			Assert.fail("Exception occured while testing  New User Signup and Login : " + e.getMessage());
			logger.error("Exception occured while verifying New user Signup and Login :", e);
		}

		logger.info("Ending of verify User SignUp and Login method");
	}

	@Test(priority = 2, description = "Delete Existing User Account")
	@Description("Delete Existing User Account")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Delete Existing User Account")

	public void VerifyDeleteAccount() {
		logger.info("Staring of User Signup and Login method");
		try {
			chooseRegion.clickOnMenuTab();
			chooseRegion.clickOnSettings();
			settingsPage.clickOnDeleteAccount();
			settingsPage.clickOnDeleteConfirmbutton();

		} catch (Exception e) {
			newUserLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing Delete Account : " + e.getMessage());
			logger.error("Exception occured while verifying Delete Account :", e);
		}

		logger.info("Ending of User Signup and Login method");
	}

	@Test(priority = 3, description = "Login Test with Valid Credentials")
	@Description("Login Test with Valid Credentials")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Login Test with Valid Credentials")
	public void verifySignUpAndLogin() {
		logger.info("Starting of Verify Login method");

		try {

			Assert.assertEquals(newUserLoginPage.getGetStartedText(),
					expectedAssertionsProp.getProperty(GET_STARTED_LABEL));

			Assert.assertEquals(newUserLoginPage.getMobileNumberText(),
					expectedAssertionsProp.getProperty(MOBILE_NUMBER_LABEL));

			newUserLoginPage.setPhoneNumber(testDataProp.getProperty("phone.number"));
			newUserLoginPage.clickOnOtpButton();
			newUserLoginPage.setOTP(testDataProp.getProperty("otp"));
		//	newUserLoginPage.clickOnVerifyButton();
			Thread.sleep(2000);
			Assert.assertEquals(newUserLoginPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

		} catch (Exception e) {
			Assert.fail("Exception occured while testing  User Login : " + e.getMessage());
			logger.error("Exception occured while verifying User Login :", e);
		}

		logger.info("Ending of Verify Login  method");
	}

}
