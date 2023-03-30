package live.frolic.test.playnow;

import static live.frolic.util.Constants.*;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.battles.pages.FrolicBattlePlayNowPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;

/*
 * @author b2btesters
*/

@Epic("Frolic  Battle feature")
@Feature("Frolic Battle feature  Functionality")
public class FrolicBattlePlayNowTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());

	private FrolicBattlePlayNowPage battlePlayNow = null;
	private FrolicUserLoginPage userLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in BattlesTest");

		this.battlePlayNow = new FrolicBattlePlayNowPage(driver);
		this.userLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending of initClass method in BattlesTest");
	}

	@Test(priority = 1, description = "Verifying Join Battle")
	@Description("Verifying Join Battle")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verifying Join Battle")
	public void verifyBattleJoin() throws InterruptedException {
		logger.info("Starting of verifyBattle method");

		try {
			battlePlayNow.clickOnSearchTab();

			Assert.assertEquals(battlePlayNow.getSearchText(), expectedAssertionsProp.getProperty(SEARCH_LABEL));

			battlePlayNow.clickOnSearch(testDataProp.getProperty("search.game"));
			battlePlayNow.clickOnGameCard();

			Assert.assertEquals(battlePlayNow.getGameNameText(), expectedAssertionsProp.getProperty(GAME_NAME_LABEL));

			battlePlayNow.clickOnPlayFreeButton();

			if ((battlePlayNow.checkRecordAndShareLabel()) && (battlePlayNow.checkVideoChatLabel())) {
				battlePlayNow.clickOnRecordButton();
				battlePlayNow.clickOnVideoButton();
				battlePlayNow.clickOnVideoButton();

			} else if (battlePlayNow.checkRecordAndShareLabel() && (battlePlayNow.checkVideoChatLabel())
					&& (battlePlayNow.checkLiveStreamLabel())) {
				battlePlayNow.clickOnRecordButton();
				battlePlayNow.clickOnVideoButton();
				battlePlayNow.clickOnLiveButton();
				battlePlayNow.clickOnLiveButton();
			}

			battlePlayNow.clickOnStartGame();

			Assert.assertEquals(battlePlayNow.getStartingInText(),
					expectedAssertionsProp.getProperty(STARTING_IN_LABEL));

			AfterSuit();

		} catch (Exception e) {
			userLoginPage.redirectToMaintabs();
			Assert.fail("Exception occured while testing  Battle Join : " + e.getMessage());
			logger.error("Exception occured while verifying Battle Join :", e);
		}

		logger.info("Ending of verifyBattle method");
	}

	@AfterSuite
	public void AfterSuit() {
		driver.quit();

		logger.info("Ending of Frolic Automation Suite");
	}
}
