package live.frolic.test.playlater;

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
import live.frolic.challenges.pages.FrolicChallengePlayLaterPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;
import live.frolic.tournaments.pages.FrolicTournamentsPage;

/*
 * @author b2btesters
*/

@Epic("Frolic Challenge Play Later")
@Feature("Frolic Challenge And Play Later Battle Game Functionality")
public class FrolicChallengePlayLaterTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicChallengePlayLaterTest.class.getName());
	private FrolicChallengePlayLaterPage challengerPlayLater = null;
	private FrolicTournamentsPage newTournamenentJoin = null;
	private FrolicUserLoginPage newLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(@Optional String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in Frolic ChallengePlayLaterTest");

		this.challengerPlayLater = new FrolicChallengePlayLaterPage(driver);
		this.newTournamenentJoin = new FrolicTournamentsPage(driver);
		this.newLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in Frolic ChallengePlayLaterTest");
	}

	@Test(priority = 1, description = "Verifying Challenge PlayLater")
	@Description("Verifying Challenge PlayLater")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Challenge PlayLater")
	public void verifyChallengeGame() throws InterruptedException {
		logger.info("Starting of verify Challenge PlayLater method");

		try {

			Assert.assertEquals(newLoginPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

			newTournamenentJoin.scrollToTournamentsLabel();
			newTournamenentJoin.clickOnViewAllButton();

			Assert.assertEquals(newTournamenentJoin.getArenaText(), expectedAssertionsProp.getProperty(ARENA_LABEL));

			newTournamenentJoin.clickOnBattlesTab();

			Assert.assertEquals(newTournamenentJoin.getFairPlayText(),
					expectedAssertionsProp.getProperty(BATTLE_FAIRPLAY_TEXT));

			challengerPlayLater.clickOnCreateNewBattle();

			challengerPlayLater.getAquaBubbleShooterText();

			Assert.assertEquals(challengerPlayLater.getAquaBubbleShooterText(),
					expectedAssertionsProp.getProperty(CHALLENGED_GAME_TEXT));

			challengerPlayLater.clickOnSelectedGame();

			challengerPlayLater.setOpponentUser(testDataProp.getProperty("opponent.name"));

			Assert.assertEquals(challengerPlayLater.getOpponentUserText(),
					expectedAssertionsProp.getProperty(VERIFY_OPPONENT_NAME_TEXT));

			challengerPlayLater.clickOnChallengeButton();

		} catch (Exception e) {
			Assert.fail("Exception occured while testing Challenge Games : " + e.getMessage());
			logger.error("Exception occured while verifying Challenge Games :", e);
		}

		logger.info("Ending of verify Challenge PlayLater method");
	}

	@Test(priority = 2, description = "Verifying ChallengeAmount in Challenge PlayLater")
	@Description("Verifying ChallengeAmount in Challenge PlayLater")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying ChallengeAmount in Challenge PlayLater")
	public void verifyChallengeAmount() throws InterruptedException {
		logger.info("Starting of verifyChallengeAmount method");

		try {
			challengerPlayLater.clickOnBonusCashRadioButton();
			challengerPlayLater.clickOnAddSelectedBonusCash();
			challengerPlayLater.clickOnBonusCash();

			Assert.assertEquals(challengerPlayLater.getEnteredCashText(),
					expectedAssertionsProp.getProperty(ENTERED_AMOUNT));

			challengerPlayLater.clickOnCashRadioButton();
			challengerPlayLater.clickOnAddSelectedCash();
			challengerPlayLater.setChallengeAmount(testDataProp.getProperty("challenge.amount"));
			challengerPlayLater.clickOnRemindButton();

			Assert.assertEquals(challengerPlayLater.getTextGameChallengeTime(),
					expectedAssertionsProp.getProperty(GAME_CHALLENGE_TIME_LABEL));

			challengerPlayLater.clickOnNextButton();
			challengerPlayLater.clickOnSelectedDate();
			challengerPlayLater.clickOnOkButton();

		} catch (Exception e) {
			Assert.fail("Exception occured while testing  Challenge Amount : " + e.getMessage());
			logger.error("Exception occured while verifying Challenge Amount :", e);
		}

		logger.info("Ending of verifyChallengeAmount method");
	}

	@Test(priority = 3, description = "VerifyIng Rejecting GameCard in Challenges PlayLater")
	@Description("VerifyIng Rejecting GameCard in Challenges PlayLater")
	@Severity(SeverityLevel.BLOCKER)
	@Story("VerifyIng Rejecting GameCard in Challenges PlayLater")
	public void verifyRejectingGameCard() throws InterruptedException {
		logger.info("Starting of verifiying reject game Card  method");

		try {

			Assert.assertEquals(challengerPlayLater.getChallengedGameText(),
					expectedAssertionsProp.getProperty(CHALLENGED_GAME_TEXT));

			Assert.assertEquals(challengerPlayLater.getTextChallengedEntryFee(),
					expectedAssertionsProp.getProperty(CHALLENGE_AMOUNT_TEXT));

			Assert.assertEquals(challengerPlayLater.getTextChallengerName(),
					expectedAssertionsProp.getProperty(VERIFY_OPPONENT_NAME_TEXT));

			challengerPlayLater.clickOnRejectButton();

			Assert.assertEquals(challengerPlayLater.getWantToRejectChallengesText(),
					expectedAssertionsProp.getProperty(REJECT_GAME_CARD_TEXT));

			challengerPlayLater.clickOnYesButton();
			challengerPlayLater.clickOnBackIcon();
		} catch (Exception e) {
			newLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Reject Game Card : " + e.getMessage());
			logger.error("Exception occured while verifying Reject Game Card :", e);
		}

		logger.info("Ending of verifying reject game card method");
	}
}