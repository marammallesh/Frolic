package frolic_prodtest.test.achivement;

import frolic_prodtest.test.BaseTestAutomation;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import frolic_prod.achievement.pages.FrolicAchievementPage;
import frolic_prod.login.pages.FrolicUserLoginPage;
import frolic_prod.tournaments.pages.FrolicTournamentsPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static frolic_prodtest.util.Constants.*;

/*
 * @author b2btesters
*/

public class FrolicAchievementRewardsTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicAchievementRewardsTest.class.getName());

	private FrolicAchievementPage frolicAchievement = null;
	private FrolicTournamentsPage tournamentPage = null;
	private FrolicUserLoginPage userLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(String deviceIndex) throws Exception {

		logger.info("Starting of initClass method in FrolicAchievementRewardsTest");

		this.frolicAchievement = new FrolicAchievementPage(driver);
		this.tournamentPage = new FrolicTournamentsPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in FrolicAchievementRewardsTest");

	}

	@Test(priority = 1, description = "Verifying Achievement Cash Reward in Achivements")
	@Description("Verifying Achievement Cash Reward in Achivements")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Achievement Cash Reward in Achivements")
	public void verifyAchievementTransaction() {

		logger.info("Starting of verifyAchievement cash reward method");

		try {
			frolicAchievement.clickOnMenu();
			frolicAchievement.clickOnAchievement();

			Assert.assertEquals(frolicAchievement.getAchievementsLabel(),
					expectedAssertionsProp.getProperty(LABEL_ACHIEVEMENTS));

			frolicAchievement.clickOnRewards();

			Assert.assertEquals(frolicAchievement.getCashText(), expectedAssertionsProp.getProperty(LABEL_CASH));

			frolicAchievement.clickOnCashTransition();

			Assert.assertEquals(frolicAchievement.getStatuText(), expectedAssertionsProp.getProperty(STATUS_TEXT));

			tournamentPage.clickOnBackIcon();

			Assert.assertEquals(frolicAchievement.getBonusCashLabel(),
					expectedAssertionsProp.getProperty(LABEL_BONUS_CASH));

			tournamentPage.clickOnBackIcon();

		} catch (Exception e) {
			frolicAchievement.redirectToRewards();
			Assert.fail("Exception occured while testing  Achivement Transaction : " + e.getMessage());
			logger.error("Exception occured while verifying Achivement Transaction :", e);
		}

		logger.info("Ending of verifyAchievement method");
	}

	@Test(priority = 2, description = "Verifying Achievement BonusCash Reward in achivements")
	@Description("Verifying Achievement BonusCash Reward in achivements")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Achievement BonusCash Reward in achivements")
	public void verifyAchievementBonusCash() {
		logger.info("Starting of verifyAchievementBonusCash method");

		try {
			frolicAchievement.clickOnRewards();
			frolicAchievement.clickOnBonusCash();

			Assert.assertEquals(frolicAchievement.getBonusCashLabel(),
					expectedAssertionsProp.getProperty(LABEL_BONUS_CASH));

			frolicAchievement.clickOnBonusOption();

			Assert.assertEquals(frolicAchievement.getStatuText(), expectedAssertionsProp.getProperty(STATUS_TEXT));

			frolicAchievement.clickOnBonusCashRaiseTicket();

			Assert.assertEquals(frolicAchievement.getContactSupportLabel(),
					expectedAssertionsProp.getProperty(LABEL_CONTACT_SUPPORT));

			tournamentPage.clickOnBackIcon();
			tournamentPage.clickOnBackIcon();
			tournamentPage.clickOnBackIcon();
			tournamentPage.clickOnBackIcon();
			userLoginPage.clickonFeedTab();

		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Achivement Bonus Cash : " + e.getMessage());
			logger.error("Exception occured while verifying Achivement Bonus Cash :", e);
		}

		logger.info("Ending of verifyAchievementBonusCash method");
	}

}
