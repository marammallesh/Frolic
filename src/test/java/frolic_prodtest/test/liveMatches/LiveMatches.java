package frolic_prodtest.test.liveMatches;

import frolic_prodtest.test.BaseTestAutomation;
import io.qameta.allure.*;
import frolic_prod.livematches.pages.LiveMatchesPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static frolic_prodtest.util.Constants.*;

@Epic("Live Matches")
@Feature("Live Matches Functionality")


public class LiveMatches extends BaseTestAutomation {
    public static final Logger logger = Logger.getLogger(LiveMatches.class.getName());

    private LiveMatchesPage liveMatches = null;

   // public LiveMatches(AndroidDriver<WebElement> driver) {
     //   super();
   // }

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in LoginTest");

        this.liveMatches = new LiveMatchesPage(driver);

        logger.info("Ending of initClass method in LoginTest");
    }
    @Test(priority = 0, description = "Live_Matches_0 , Verify to the Games tab")
    @Description("Live_Matches_0, Verify to the Games tab")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_0, Verify to the Games tab")
    public void redirectToGamesTab() throws InterruptedException {

        logger.info("Starting of verify redirectToGamesTab method");
        liveMatches.redirectToMaintabs();
        logger.info("Ending of verifyLiveMatchesText method");
    }


    @Test(priority = 1, description = "Live_Matches_1 , Verify the Live Matches Text")
    @Description("Live_Matches_1, Verify the Live Matches Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_1, Verify the Live Matches Text")
    public void verifyLiveMatchesText() throws InterruptedException {
        logger.info("Starting of verifyLiveMatchesText method");
        try {
            Assert.assertEquals(liveMatches.getLiveMatches(), expectedAssertionsProp.getProperty(LIVE_MATCH_DESCRIPTION));
            //logger.info("Live Matches Text Verified");

            //logger.info("Ending of verifyLiveMatchesText method");
            //System.out.println("Live Matches Text Verified");
        } catch (Exception e) {
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while verifying the Live Matches Text" + e.getMessage());

            logger.error("Exception occured while verifying the Live Matches Text", e);

        }
        logger.info("Ending of verifyLiveMatchesText method");
    }
    @Test(priority = 2, description = "Live_Matches_2 , Verify the Live Matches Description")
    @Description("Live_Matches_2, Verify the Live Matches Description")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_2, Verify the Live Matches Description")
    public void verifyLiveMatchesDescription() throws InterruptedException {
        logger.info("Starting of verifyLiveMatchesDescription method");
        try {
            Assert.assertEquals(liveMatches.getLiveMatchesDescription(), expectedAssertionsProp.getProperty(LIVE_MATCH_DESCRIPTION) + "\n" + expectedAssertionsProp.getProperty(LIVE_MATCH_DESCRIPTION2));
            //logger.info("Live Matches description Verified");

            //logger.info("Ending of verifyLiveMatchesDescription method");
            //System.out.println("Live Matches description Verified");
        } catch (Exception e) {
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while verifying the Live Matches Description" + e.getMessage());

            logger.error("Exception occured while verifying the Live Matches Description", e);
        }
        logger.info("Ending of verifyLiveMatchesDescription method");
    }
    @Test(priority = 3, description = "Live_Matches_3 , Click on the View all Available Matches CTA")
    @Description("Live_Matches_3, Click on the View all Available Matches CTA")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_3, Click on the View all Available Matches CTA")
    public void clickViewAllMatchesButton() throws InterruptedException {
        logger.info("Starting of clickOnViewAllMatchesButton method");
        try {
            liveMatches.clickOnViewAllMatchesButton();
            //logger.info("Ending of clickOnViewAllMatchesButton method");

        } catch (Exception e){
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while click on the Available Matches CTA" + e.getMessage());

            logger.error("Exception occured while while click on the Available Matches CTA", e);
        }
        logger.info("Ending of clickOnViewAllMatchesButton method");
    }
    @Test(priority = 4, description = "Live_Matches_4 , Verify Live Contests Text")
    @Description("Live_Matches_4, Verify Live Contests Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_4, Verify Live Contests Text")
    public void verifyLiveContestText() throws InterruptedException {
        logger.info("Verify LiveContestsText");
        try {
            //logger.info("Live Contests Text Verified");
            Assert.assertEquals(liveMatches.getLiveContestText(), expectedAssertionsProp.getProperty(LIVE_CONTESTS_TEXT));
            //logger.info("Ending of Live Contests Text");
            //System.out.println("Live Contests Text Verified");
        } catch (Exception e){
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while verifying the Live Contest Text" + e.getMessage());

            logger.error("Exception occured while verifying the Live Contest Text", e);
        }
        logger.info("Ending of Live Contests Text");
    }
    @Test(priority = 5, description = "Live_Matches_5 , Click on Select Game Drop Down")
    @Description("Live_Matches_5, Click on Select Game Drop Down")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_5, Click on Select Game Drop Down")
    public void clickOnSelectGame() throws InterruptedException {
        logger.info("Click onSelectGame Drop Down");
        try {
            //logger.info("Click on Select Game Drop Down");
            liveMatches.clickOnSelectGameDropDown();
            //logger.info("Ending of Select Game Drop Down");
        } catch (Exception e){
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while click on the Drop Down CTA" + e.getMessage());

            logger.error("Exception occured while while click on the Drop Down CTA", e);
        }
        logger.info("Ending of Select Game Drop Down");
    }
    @Test(priority = 6, description = "Live_Matches_6 , Verify Select Game text on the popup")
    @Description("Live_Matches_6, Verify Select Game text on the popup")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_6, Verify Select Game text on the popup")
    public void verifySelectGameText() throws InterruptedException {
        logger.info("Verify SelectGameText on the popup");
        try {
            //logger.info("Select Game Text Verified");
            Assert.assertEquals(liveMatches.getSelectGameText(), expectedAssertionsProp.getProperty(SELECT_GAME_TEXT));
            //System.out.println("Select Game Text Verified");
            //logger.info("Ending of Select Game Text Verified");
        } catch (Exception e) {
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while verify the Select Game Text on the popup" + e.getMessage());

            logger.error("Exception occured while verify the Select Game Text on the popup", e);

        }
        logger.info("Ending of Select Game Text Verified");
    }

    @Test(priority = 7, description = "Live_Matches_7 , Enter the Game Name and click on the game")
        @Description("Live_Matches_7, Enter the Game Name and click on the game")
        @Severity(SeverityLevel.BLOCKER)
        @Story("Live_Matches_7, Enter the Game Name and click on the game")
        public void enterGameName() throws InterruptedException {
        logger.info("Search and enterGameName");
        try {
            //logger.info("Search and Enter the Game Name");
            liveMatches.clickOnSearchField(testDataProp.getProperty("search.game.Monster"));

        } catch (Exception e) {
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while Enter the Game Name and click on the game" + e.getMessage());

            logger.error("Exception occured while Enter the Game Name and click on the game", e);
        }
        logger.info("Ending of Select Game Text Verified");
    }
    @Test(priority = 8, description = "Live_Matches_8 , Click on the Game card")
    @Description("Live_Matches_8, Click on the Game card")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_8, Click on the Game card")
    public void clickGameCard() throws InterruptedException {
        logger.info("Click on the GameCard");
        try {
            //logger.info("Search and Enter the Game Name");
            liveMatches.clickOnGameCard();
            //System.out.println("Click on the Game Card");
            //logger.info("Ending of Select Game Text Verified");
        } catch (Exception e) {
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occured while click on the game card" + e.getMessage());

            logger.error("Exception occured while while click on the game card", e);
        }
        logger.info("Ending of Select Game Text Verified");
    }

        @Test(priority = 9, description = "Live_Matches_9 , Click on the Refresh button")
        @Description("Live_Matches_9, Click on the Refresh button")
        @Severity(SeverityLevel.BLOCKER)
        @Story("Live_Matches_9, Click on the Refresh button")
        public void clickOnRefreshButton() throws InterruptedException {
            logger.info("Click onRefreshButton");
            try {
                //logger.info("Click on the Refresh button");
                liveMatches.clickOnRefreshButton();
                //System.out.println("Successfully clicked on the Refresh button ");
                //logger.info("Ending of Refresh button Verified");
            } catch (Exception e){
                liveMatches.redirectToMaintabs();
                Assert.fail("Exception occured while click on the Refresh Button" + e.getMessage());

                logger.error("Exception occured while while click on the Refresh Button", e);
            }
            logger.info("Ending of Refresh button Verified");
    }
    @Test(priority = 10, description = "Live_Matches_10 , Verify and Click on the Game Play button")
    @Description("Live_Matches_10, Verify and Click on the Game Play button")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Live_Matches_10, Verify and ClickOnGamePlayButton")
    public void clickOnGamePlayButton() throws InterruptedException {
        logger.info("Verify and ClickOnGamePlayButton");
        try {
            //logger.info("Click on the Refresh button");
            boolean response = driver.getPageSource().contains(liveMatches.getEntryPoint());
            if (response = true) {
                liveMatches.clickOnGamePlayButton();
                liveMatches.redirectToMaintabs();

            }else
            {
                Assert.assertEquals(liveMatches.getErrorText(), expectedAssertionsProp.getProperty(NO_CONTEST_FOUND));
            }

            //logger.info("Ending of Refresh button Verified");
        } catch (Exception e){
            liveMatches.redirectToMaintabs();
            Assert.fail("Exception occur while verify the entry point button" + e.getMessage());

            logger.error("Exception occur while while verify the entry point button", e);
        }
        logger.info("Ending of Refresh button Verified");
    }

}





