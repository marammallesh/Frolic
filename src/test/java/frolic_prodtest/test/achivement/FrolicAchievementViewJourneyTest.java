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

public class FrolicAchievementViewJourneyTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicAchievementViewJourneyTest.class.getName());

	private FrolicAchievementPage achievementPage = null;
	private FrolicTournamentsPage newTournamenentJoin = null;
	private FrolicUserLoginPage userLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })

	public void initClass(String deviceIndex) throws Exception {

		logger.info("Starting of initClass method in FrolicAchievementViewJourneyTest");

		this.achievementPage = new FrolicAchievementPage(driver);
		this.newTournamenentJoin = new FrolicTournamentsPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in FrolicAchievementViewJourneyTest");
	}

	@Test(priority = 1, description = "Verifying Achievement Copper- II level View Journey of frolic app")
	@Description("Verifying Achievement Copper- II level View Journey of frolic app")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verifying Achievement Copper- II level View Journey of frolic app")
	public void verifyViewJourney() {

		logger.info("Starting of verifyViewJourney method");

		try {
			achievementPage.clickOnMenu();
			achievementPage.clickOnAchievement();

			Assert.assertEquals(achievementPage.getAchievementsLabel(),
					expectedAssertionsProp.getProperty(LABEL_ACHIEVEMENTS));

			achievementPage.clickOnViewJourney();

			Assert.assertEquals(achievementPage.getRewardHistoryLabel(),
					expectedAssertionsProp.getProperty(LABEL_REWARD_HISTORY));

			boolean iron_exist = driver.getPageSource().contains(expectedAssertionsProp.getProperty(IRON_ONE));

			if (iron_exist) {
				achievementPage.clickOnIronOne();

				Assert.assertEquals(achievementPage.getRewardJourneyLabel(),
						expectedAssertionsProp.getProperty(LABEL_REWARD_JOURNEY));

				newTournamenentJoin.clickOnBackIcon();
				newTournamenentJoin.clickOnBackIcon();
			} else {

				newTournamenentJoin.clickOnBackIcon();
			}
		} catch (Exception e) {
			achievementPage.redirectToAchivementLabel();
			Assert.fail("Exception occured while testing  Search Batches : " + e.getMessage());
			logger.error("Exception occured while verifying Search Batches :", e);
		}

		logger.info("Ending of verifyViewJourney method");
	}

	@Test(priority = 2, description = "Verifying LearnMore in Achivements")
	@Description("Verifying LearnMore user flow in Achivements")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verifying LearnMore user flow in Achivements")
	public void verifyDailyLearnMoreLabel() {
		logger.info("Starting of verifyLearnMore method");
		try {
			if (achievementPage.checkNoDailyTaskText() == true) {

				Assert.assertEquals(achievementPage.getNoDailytaskText(),
						expectedAssertionsProp.getProperty(NO_DAILY_TASK_TEXT));

			} else {
				achievementPage.clickOnLearnMore();

				Assert.assertEquals(achievementPage.getXpDetailsLabel(),
						expectedAssertionsProp.getProperty(LABEL_XP_DETAILS));

				Assert.assertEquals(achievementPage.getPlayPracticeGameLabel(),
						expectedAssertionsProp.getProperty(LABEL_PLAY_PRACTICE_MATCH));

				Assert.assertEquals(achievementPage.getFollowerLabel(),
						expectedAssertionsProp.getProperty(LABEL_FOLLWER));

				Assert.assertEquals(achievementPage.getReferralLabel(),
						expectedAssertionsProp.getProperty(LABEL_REFERRAL));

				achievementPage.clickOnLearnMoreSocial();

				Assert.assertEquals(achievementPage.getFollowerLabel(),
						expectedAssertionsProp.getProperty(LABEL_FOLLWER));

				achievementPage.clickOnLearnMoreGaming();

				Assert.assertEquals(achievementPage.getPlayPracticeGameLabel(),
						expectedAssertionsProp.getProperty(LABEL_PLAY_PRACTICE_MATCH));

				achievementPage.clickOnLearnMoreOther();
				newTournamenentJoin.clickOnBackIcon();
			}
		} catch (Exception e) {
			achievementPage.redirectToAchivementLabel();
			Assert.fail("Exception occured while testing  Search Batches : " + e.getMessage());
			logger.error("Exception occured while verifying Search Batches :", e);
		}

		logger.info("Ending of verifyLearnMore method");
	}

	@Test(priority = 3, description = "Verifying weekly tab in Achivements")
	@Description("Verifying weekly tab in Achivements")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verifying weekly tab in Achivements")
	public void verifyWeeklyTab() {
		logger.info("Starting of verifyWeeklyTab method");

		try {
			achievementPage.clickOnWeeklyTab();

			Assert.assertEquals(achievementPage.getRecommendedLabel(),
					expectedAssertionsProp.getProperty(LABEL_RECOMMENDED));

			achievementPage.clickOnWeeklyExploreMore();

			Assert.assertEquals(achievementPage.getParticipateText(),
					expectedAssertionsProp.getProperty(LABEL_PARTICIPATE));

			achievementPage.clickOnLearnMore();

			Assert.assertEquals(achievementPage.getXpDetailsLabel(),
					expectedAssertionsProp.getProperty(LABEL_XP_DETAILS));

			achievementPage.clickOnLearnMoreSocial();

			Assert.assertEquals(achievementPage.getFollowerLabel(), expectedAssertionsProp.getProperty(LABEL_FOLLWER));

			achievementPage.clickOnLearnMoreGaming();

			Assert.assertEquals(achievementPage.getPlayPracticeGameLabel(),
					expectedAssertionsProp.getProperty(LABEL_PLAY_PRACTICE_MATCH));

			achievementPage.clickOnLearnMoreOther();

			Assert.assertEquals(achievementPage.getReferralLabel(), expectedAssertionsProp.getProperty(LABEL_REFERRAL));

			newTournamenentJoin.clickOnBackIcon();
			newTournamenentJoin.clickOnBackIcon();
			newTournamenentJoin.clickOnBackIcon();

			Assert.assertEquals(achievementPage.getAchievementsLabel(),
					expectedAssertionsProp.getProperty(LABEL_ACHIEVEMENTS));

		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Search Batches : " + e.getMessage());
			logger.error("Exception occured while verifying Search Batches :", e);
		}

		logger.info("Ending of verifyWeeklyTab method");
	}
}
