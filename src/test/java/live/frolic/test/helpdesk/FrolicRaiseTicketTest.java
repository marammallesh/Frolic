package live.frolic.test.helpdesk;

import static live.frolic.util.Constants.*;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.helpdesk.pages.FrolicHelpDeskPage;
import live.frolic.helpdesk.pages.FrolicRaiseTicketPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;

/*
 * @author b2btesters
*/

public class FrolicRaiseTicketTest extends BaseTestAutomation {
	public static final Logger logger = Logger.getLogger(FrolicRaiseTicketTest.class.getName());
	private FrolicHelpDeskPage helpDeskPage = null;
	private FrolicRaiseTicketPage raiseTicketPage = null;
	private FrolicUserLoginPage userLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(@Optional String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in FrolicRaiseTicketTest");

		this.helpDeskPage = new FrolicHelpDeskPage(driver);
		this.raiseTicketPage = new FrolicRaiseTicketPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in FrolicRaiseTicketTest");
	}

	@Test(priority = 1, description = "Verifying Raise Ticket in HelpDesk")
	@Description("Verifying Raise Ticket in HelpDesk")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Raise Ticket in HelpDesk")
	public void verifyRaiseTicket() throws InterruptedException {
		logger.info("Starting of verifyRaiseTicket method");

		try {
			helpDeskPage.clickOnMenuButton();
			helpDeskPage.clickOnHelpAndSupport();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			raiseTicketPage.clickOnGeneralButton();

			Assert.assertEquals(helpDeskPage.getFaqsText(), expectedAssertionsProp.getProperty(FAQS_LABEL));

			raiseTicketPage.clickOnContactSupport();

			Assert.assertEquals(raiseTicketPage.getContactSupportText(),
					expectedAssertionsProp.getProperty(CONTACT_SUPPORT));

			raiseTicketPage.setEmail(testDataProp.getProperty("tc.email"));
			raiseTicketPage.setQuery(testDataProp.getProperty("tc.description"));

			// Attachment file to raise ticket device specific flow
			/*
			 * raiseTicketPage.clickOnAttachmentIcon();
			 * 
			 * boolean allowButton =
			 * driver.getPageSource().contains(expectedAssertionsProp.getProperty(ALLOW_TEXT
			 * ));
			 * 
			 * if (allowButton == true) { raiseTicketPage.clickOnAllowButton();
			 * raiseTicketPage.clickOnCancelButton(); raiseTicketPage.clickOnLayOut();
			 * 
			 * // In one plus device raiseTicketPage.clickOnGetSelectedImage();
			 * raiseTicketPage.clickOnSelectButton();
			 * 
			 * // In other devices raiseTicketPage.clickOnImagePreview();
			 * raiseTicketPage.clickOnCancelPreviewIcon();
			 * 
			 * } else {
			 * 
			 * raiseTicketPage.clickOnGetSelectedImage();
			 * raiseTicketPage.clickOnImagePreview();
			 * raiseTicketPage.clickOnCancelPreviewIcon(); }
			 */
			raiseTicketPage.clickOnRaiseTicketButton();

			Assert.assertEquals(raiseTicketPage.getMyTicketsText(),
					expectedAssertionsProp.getProperty(MY_TICKETS_TEXT));

			Assert.assertEquals(raiseTicketPage.getOpenTicketsText(),
					expectedAssertionsProp.getProperty(OPEN_STATUS_TEXT));

			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getFaqsText(), expectedAssertionsProp.getProperty(FAQS_LABEL));

			helpDeskPage.clickOnBackIcon();

			Assert.assertEquals(helpDeskPage.getHelpDeskText(), expectedAssertionsProp.getProperty(HELP_DESK_LABEL));

			// Navigate to Menu
			helpDeskPage.clickOnBackIcon();
		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Raise Ticket : " + e.getMessage());
			logger.error("Exception occured while verifying Raise Tikcet :", e);
		}

		logger.info("Ending of verifyRaiseTicket method");
	}
}