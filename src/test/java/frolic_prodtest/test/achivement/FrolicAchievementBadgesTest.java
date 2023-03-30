package frolic_prodtest.test.achivement;

import frolic_prodtest.test.BaseTestAutomation;
import io.qameta.allure.*;
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

@Epic("Frolic Achivement Badges")
@Feature("Frolic  Achivements Functionality")
public class FrolicAchievementBadgesTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicAchievementBadgesTest.class.getName());

	private FrolicAchievementPage frolicAchievement = null;
	private FrolicTournamentsPage newTournamenentJoin = null;
	private FrolicUserLoginPage userLoginpage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in FrolicAchievementTest");

		this.frolicAchievement = new FrolicAchievementPage(driver);
		this.newTournamenentJoin = new FrolicTournamentsPage(driver);
		this.userLoginpage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in FrolicAchievementTest");
	}

	@Test(priority = 1, description = "Verifing My Badges label in Achivements")
	@Description("Verifing My Badges label in Achivements")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifing My Badges label in Achivements")
	public void verifyMyBadges() throws InterruptedException {
		logger.info("Starting of verifyMyBadges method");

		try {
			frolicAchievement.clickOnMenu();
			frolicAchievement.clickOnAchievement();

			Assert.assertEquals(frolicAchievement.getAchievementsLabel(),
					expectedAssertionsProp.getProperty(LABEL_ACHIEVEMENTS));

			frolicAchievement.getMyBadgesText();
			frolicAchievement.clickOnMyBadges();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnIronOne();
			frolicAchievement.clickOnEarnMoreXP();
			frolicAchievement.clickOnLearnMoreAll();
			frolicAchievement.clickOnLearnMoreSocial();
			frolicAchievement.clickOnLearnMoreGaming();
			frolicAchievement.clickOnLearnMoreOther();
			newTournamenentJoin.clickOnBackIcon();
			frolicAchievement.clickOnIronTwo();
			frolicAchievement.clickOnDismiss();
			frolicAchievement.clickOnIronThree();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnCopperOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnBronzeOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnSilverOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnGoldOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnPlatinumOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnDiamondOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnImmortalOne();
			frolicAchievement.clickOnDismiss();

			Assert.assertEquals(frolicAchievement.getMyBadgesLabel(),
					expectedAssertionsProp.getProperty(LABEL_MY_BADGES));

			frolicAchievement.clickOnRadiantOne();
			frolicAchievement.clickOnDismiss();
			newTournamenentJoin.clickOnBackIcon();
			newTournamenentJoin.clickOnBackIcon();

			Assert.assertEquals(frolicAchievement.getAchievementLabel(),
					expectedAssertionsProp.getProperty(LABEL_ACHIEVEMENTS_MESSAGE));

		} catch (Exception e) {
			userLoginpage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  My Badges : " + e.getMessage());
			logger.error("Exception occured while verifying My Badges :", e);
		}

		logger.info("Ending of verifyMyBadges method");
	}
}
