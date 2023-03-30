package live.frolic.test.tournaments;

import static live.frolic.util.Constants.*;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;
import live.frolic.tournaments.pages.FrolicTournamentsPage;

/*
 * @author b2btesters
*/

@Epic("Frolic New Tournament feature")
@Feature("Frolic New Tournament Functionality")
public class FrolicTournamentsTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicTournamentsTest.class.getName());

	private FrolicTournamentsPage tournamentsPage = null;
	private FrolicUserLoginPage newUserLogin = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in FrolicTournamentsTest");

		this.newUserLogin = new FrolicUserLoginPage(driver);
		this.tournamentsPage = new FrolicTournamentsPage(driver);

		logger.info("Ending of initClass method in FrolicTournamentsTest");
	}

	@Test(priority = 1, description = "Verifying Tabs in Tournaments")
	@Description("Verifying Tabs in Tournaments")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Tabs in Tournaments")
	public void VerifyTournamentViewTabs() {

		try {
			logger.info("Starting of VerifyTournamentTabs method");

			Assert.assertEquals(newUserLogin.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

			Assert.assertEquals(tournamentsPage.getViewAllText(),
					expectedAssertionsProp.getProperty(GET_TEXT_VIEW_ALL));

			tournamentsPage.clickOnViewAllButton();

			Assert.assertEquals(tournamentsPage.getArenaText(), expectedAssertionsProp.getProperty(ARENA_LABEL));

			tournamentsPage.clickOnArenaHistoryIcon();

			Assert.assertEquals(tournamentsPage.getArenaHistoryText(),
					expectedAssertionsProp.getProperty(ARENA_HISTORY_LABEL));

			tournamentsPage.clickOnBackIcon();

			Assert.assertEquals(tournamentsPage.getArenaText(), expectedAssertionsProp.getProperty(ARENA_LABEL));

			tournamentsPage.clickOnBattlesTab();

			Assert.assertEquals(tournamentsPage.getFairPlayText(),
					expectedAssertionsProp.getProperty(BATTLE_FAIRPLAY_TEXT));

			tournamentsPage.clickOnTournamentTab();
			tournamentsPage.clickOnAllTab();
			tournamentsPage.clickOnJoinedTab();
			tournamentsPage.clickOnbtnHistoryTab();
		} catch (Exception e) {
			tournamentsPage.redirectToArenaScreen();
			Assert.fail("Exception occured while testing  Tournament Tabs : " + e.getMessage());
			logger.error("Exception occured while verifying Tournament Tabs :", e);
		}

		logger.info("Ending of VerifyTournamentTabs method");
	}

	@Test(priority = 2, description = "Verifying Arena History in Tournaments")
	@Description("Verifying Arena History in Tournaments")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Arena History in Tournaments")
	public void VerifyTournamentShareResult() {

		try {
			logger.info("Starting of VerifyTournamentShareResult Method");

			tournamentsPage.clickOnResultButton();

			Assert.assertEquals(tournamentsPage.getLiveScoreText(),
					expectedAssertionsProp.getProperty(LIVE_SCORE_LABEL));

			Assert.assertEquals(tournamentsPage.getPositionText(), expectedAssertionsProp.getProperty(POSITION_LABEL));

			tournamentsPage.clickOnBackIcon();

			Assert.assertEquals(tournamentsPage.getAttemptsUsedText(),
					expectedAssertionsProp.getProperty(ATTEMPTS_USED_TEXT));

			tournamentsPage.clickOnLiveTab();
			tournamentsPage.clickOnBackIcon();

		} catch (Exception e) {
			newUserLogin.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Tournament Share Result : " + e.getMessage());
			logger.error("Exception occured while verifying Tournament Share Result :", e);
		}

		logger.info("Ending of VerifyTournamentShareResult Method");
	}

	@Test(priority = 3, description = "Verifying Tournament Details")
	@Description("Verifying Tournament Details")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Tournament Details")

	public void verifyTournamentDetails() throws InterruptedException {
		logger.info("Starting of verifyTournamentDetails Method");

		try {
			if (tournamentsPage.checkPrizePoolText() == true) {
				tournamentsPage.clickOnInfoIcon();
				tournamentsPage.clickOnLiveScoreButton();

				Assert.assertEquals(tournamentsPage.getArenaText(), expectedAssertionsProp.getProperty(ARENA_LABEL));

			}
		} catch (Exception e) {
			tournamentsPage.redirectToArenaScreen();
			Assert.fail("Exception occured while testing  Tournament Details : " + e.getMessage());
			logger.error("Exception occured while verifying Tournament Details :", e);
		}

		logger.info("Ending of verifyTournamentDetails Method");
	}

	@Test(priority = 4, description = "Verifying Join in Tournaments")
	@Description("Verifying Join in Tournaments")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Join in Tournaments")

	public void verifyTournamentJoin() {

		logger.info("Starting of Join Tournament Method");
		try {

			if (tournamentsPage.checkPrizePoolText() == true) {

				tournamentsPage.getAndJoinTournament();
			} else {
				Assert.assertEquals(tournamentsPage.getNoTournamentsFoundText(),
						expectedAssertionsProp.getProperty(NO_TOURNAMENT_TEXT));
			}
			tournamentsPage.clickOnBackIcon();

			Assert.assertEquals(newUserLogin.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

		} catch (

		Exception e) {
			newUserLogin.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Tournament Join : " + e.getMessage());
			logger.error("Exception occured while verifying Tournament Join :", e);
		}

		logger.info("Starting of Join Tournament Method");
	}
}
