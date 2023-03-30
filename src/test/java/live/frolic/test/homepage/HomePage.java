package live.frolic.test.homepage;
import static live.frolic.util.Constants.*;

import io.appium.java_client.android.AndroidDriver;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.homepage.pages.FrolicNewHomePage;
import live.frolic.test.BaseTestAutomation;
import live.frolic.livematches.pages.LiveMatchesPage;
import live.frolic.base.BaseFrolicAutomationPage;



import org.apache.log4j.Logger;
import org.apache.tools.ant.types.selectors.SelectSelector;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import live.frolic.test.liveMatches.*;
import live.frolic.livematches.pages.*;

@Epic("Home Page")
@Feature("Home Page Functionality")


public class HomePage extends BaseTestAutomation {
    public static final Logger logger = Logger.getLogger(live.frolic.test.liveMatches.LiveMatches.class.getName());

    private FrolicNewHomePage newHomePage = null;
    private LiveMatchesPage liveMatches = null;
    private BaseFrolicAutomationPage baseScroll = null;


    // public LiveMatches(AndroidDriver<WebElement> driver) {
    //   super();
    // }

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in HomePage");

        this.newHomePage = new FrolicNewHomePage(driver);
        this.liveMatches = new LiveMatchesPage(driver);
        this.baseScroll = new BaseFrolicAutomationPage(driver);

        logger.info("Ending of initClass method in HomePage");
    }
    @Test(priority = 0, description = "HomePage_0 , Verify to the Games tab")
    @Description("HomePage_0, Verify to the Games tab")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_0, Verify to the Games tab")
    public void redirectToGamesTab() throws InterruptedException {

        logger.info("Starting of verify redirectToGamesTab method");
        newHomePage.redirectToGamesTabs();
        Assert.assertEquals(newHomePage.verifyGamesText(), expectedAssertionsProp.getProperty(GAMES_TEXT));
        logger.info("Ending of redirectToGamesTab method");
    }


    @Test(priority = 1, description = "HomePage_1 , Verify the Live Matches Column")
    @Description("HomePage_1, Verify the Live Matches Column")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_1, Verify the Live Matches Text")
    public void verifyLiveMatchColumn() throws InterruptedException {
        logger.info("Starting of verifyLiveMatchColumn method");
        try {
            newHomePage.clickOnViewAllMatchesButton();
            //Assert.assertEquals(liveMatches.getLiveContestText(), expectedAssertionsProp.getProperty(LIVE_CONTESTS_TEXT));
            newHomePage.clickBackBtn();
            logger.info("Live Matches column Verified Successfully");
        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyLiveMatchColumn" + e.getMessage());

            logger.error("Exception occur while verifying verifyLiveMatchColumn", e);

        }
        logger.info("Ending of verifyLiveMatchColumn method");
    }

    @Test(priority = 2, description = "HomePage_2 , Verify the Live Tournaments Text")
    @Description("HomePage_2, Verify the Live Tournaments Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_2, Verify the Live Tournaments Text")
    public void verifyTournamentText() throws InterruptedException {
        logger.info("Starting of verifyTournamentText method");
        try {
            Assert.assertEquals(newHomePage.verifyLiveTournamentText(), expectedAssertionsProp.getProperty(LIVE_TOURNAMENT_TEXT));

        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyTournamentText Text" + e.getMessage());

            logger.error("Exception occur while verifying the verifyTournamentText", e);

        }
        logger.info("Ending of verifyLiveMatchesText method");
    }
    @Test(priority = 3, description = "HomePage_3 , Verify the View All Text and click on it ")
    @Description("HomePage_3, Verify the View All Text and click on it")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_3, Verify the View All Text and click on it")
    public void verifyViewAllBtn() throws InterruptedException {
        logger.info("Starting of verifyViewAllBtn method");
        try {
            Assert.assertEquals(newHomePage.verifyViewAllText(), expectedAssertionsProp.getProperty(VIEW_ALL));
            newHomePage.clickOnViewAllBtn();
            Assert.assertEquals(newHomePage.verifyArenaTitle(), expectedAssertionsProp.getProperty(ARENA_TEXT));
            newHomePage.clickBackBtn();
            Assert.assertEquals(newHomePage.verifyGamesText(), expectedAssertionsProp.getProperty(GAMES_TEXT));
            baseScroll.verticalScrollDown();


        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyViewAllBtn Text" + e.getMessage());

            logger.error("Exception occur while verifying the verifyViewAllBtn", e);

        }
        logger.info("Ending of verifyViewAllBtn method");
    }
    @Test(priority = 4, description = "HomePage_4 , Verify the Achievement Text ")
    @Description("HomePage_4, Verify the Achievement Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_4, Verify the Achievement Text")
    public void verifyAchievementText() throws InterruptedException {
        logger.info("Starting of verifyAchievementText method");
        try {
            Assert.assertEquals(newHomePage.verifyAchievementText(), expectedAssertionsProp.getProperty(ACHIEVEMENT_TEXT));

        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyAchievementText Text" + e.getMessage());

            logger.error("Exception occur while verifying the verifyAchievementText", e);

        }
        logger.info("Ending of verifyAchievementText method");
    }
    @Test(priority = 5, description = "HomePage_5 , Verify the Achievement Sub Text ")
    @Description("HomePage_5, Verify the Achievement Sub Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_5, Verify the Achievement Sub Text")
    public void verifyAchievementSubText() throws InterruptedException {
        logger.info("Starting of verifyAchievementSubText method");
        try {
            Assert.assertEquals(newHomePage.verifyAchievementSubTxt(), expectedAssertionsProp.getProperty(ACHIEVEMENT_SUB_TEXT));

        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyAchievementSubText Text" + e.getMessage());

            logger.error("Exception occur while verifying the verifyAchievementSubText", e);

        }
        logger.info("Ending of verifyAchievementSubText method");
    }
    @Test(priority = 6, description = "HomePage_6 , Verify the recommendedGamesTxt Text ")
    @Description("HomePage_6, Verify the recommendedGamesTxt Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_6, Verify the Recommended Text")
    public void verifyRecommendedGamesText() throws InterruptedException {
        logger.info("Starting of verifyRecommendedGamesTxtText method");
        try {
            Assert.assertEquals(newHomePage.verifyRecommendedGamesTxt(), expectedAssertionsProp.getProperty(RECOMMENDED_GAMES));

        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyRecommendedGamesText" + e.getMessage());

            logger.error("Exception occur while verifying the verifyRecommendedGamesText", e);

        }
        logger.info("Ending of verifyRecommendedGamesText method");
    }
    @Test(priority = 7, description = "HomePage_7 , Verify the recommendedGamesSubTxt Text ")
    @Description("HomePage_7, Verify the recommendedGamesSubTxt Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_7, Verify the Recommended Sub Text")
    public void verifyRecommendedGamesSubText() throws InterruptedException {
        logger.info("Starting of verifyRecommendedGamesSubText method");
        try {
            Assert.assertEquals(newHomePage.verifyRecommendedGamesSubTxt(), expectedAssertionsProp.getProperty(RECOMMENDED_GAMES_SUB_TEXT));
            baseScroll.verticalScrollDown();
        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            baseScroll.verticalScrollDown();
            Assert.fail("Exception occur while verifying the verifyRecommendedGamesSubText" + e.getMessage());

            logger.error("Exception occur while verifying the verifyRecommendedGamesSubText", e);

        }
        logger.info("Ending of verifyRecommendedGamesSubText method");
    }
    @Test(priority = 8, description = "HomePage_8 , Verify the leadingGamers Text ")
    @Description("HomePage_8, Verify the leadingGamers Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_8, Verify the leadingGamers Text")
    public void verifyLeadingGamersText() throws InterruptedException {
        logger.info("Starting of verifyLeadingGamersText method");
        try {
            Assert.assertEquals(newHomePage.verifyLeadingGamersTxt(), expectedAssertionsProp.getProperty(LEADING_GAMERS));
            baseScroll.verticalScrollDown();
        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyLeadingGamersText" + e.getMessage());

            logger.error("Exception occur while verifying the verifyLeadingGamersText", e);

        }
        logger.info("Ending of verifyLeadingGamersText method");
    }
    @Test(priority = 9, description = "HomePage_9 , Verify the Battle Room Column ")
    @Description("HomePage_9 , Verify the Battle Room Column")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_9 , Verify the Battle Room Column")
    public void verifyBattleRoomText() throws InterruptedException {
        logger.info("Starting of verifyBattleRoomText method");
        try {
            Assert.assertEquals(newHomePage.verifyPlayWithFriendsTxt(), expectedAssertionsProp.getProperty(PLAY_WITH_FRIENDS));
            Assert.assertEquals(newHomePage.verifyPlayWithFriendsSubTxt(), expectedAssertionsProp.getProperty(PLAY_WITH_FRIENDS_SUB_TEXT));

        } catch (Exception e) {
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifying the verifyBattleRoomText" + e.getMessage());

            logger.error("Exception occur while verifying the verifyBattleRoomText", e);

        }
        logger.info("Ending of verifyBattleRoomText method");
    }

    @Test(priority = 10, description = "HomePage_10 , Click on the Join Rooms Button ")
    @Description("HomePage_10 , Click on the Join Rooms Button")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_10 , Click on the Join Rooms Button")
    public void clickJoinRoomButton() throws InterruptedException {
        logger.info("Starting of clickJoinRoomButton method");
        try {
            newHomePage.clickOnJoinRoomBtn();
            newHomePage.hardback();
            baseScroll.verticalScrollDown();

        } catch (Exception e){
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occured while clickJoinRoomButton" + e.getMessage());

            logger.error("Exception occured while  clickJoinRoomButton", e);
        }
        logger.info("Ending of clickJoinRoomButton method");
    }
//    @Test(priority = 11, description = "HomePage_11 , Click on the Create Battle Button ")
//    @Description("HomePage_11 , Click on the Create Battle Button")
//    @Severity(SeverityLevel.BLOCKER)
//    @Story("HomePage_11 , Click on the Create Battle Button")
//    public void clickCreateBattleButton() throws InterruptedException {
//        logger.info("Starting of clickCreateBattleButton method");
//        try {
//            newHomePage.clickOnCreateBattleBtn();
//            newHomePage.hardback();
//
//        } catch (Exception e){
//            newHomePage.redirectToGamesTabs();
//            Assert.fail("Exception occured while clickCreateBattleButton" + e.getMessage());
//
//            logger.error("Exception occured while clickCreateBattleButton", e);
//        }
//        logger.info("Ending of clickCreateBattleButton method");
//    }
    @Test(priority = 12, description = "HomePage_12 , Verify Gallery of Games Column ")
    @Description("HomePage_12 , Verify Gallery of Games Column ")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_12 , Verify Gallery of Games Column ")
    public void verifyGalleryOfGames() throws InterruptedException {
        logger.info("Starting of verifyGalleryOfGames method");
        try {
            Assert.assertEquals(newHomePage.verifyGalleryGamesText(), expectedAssertionsProp.getProperty(GAMES_OF_GALLERY));
            Assert.assertEquals(newHomePage.verifyGalleryGamesSubText(), expectedAssertionsProp.getProperty(GAMES_OF_GALLERY_SUB_TEXT));
            baseScroll.verticalScrollDown();
            newHomePage.clickViewAll40GamesBtn();
            Assert.assertEquals(newHomePage.verifySearchTitle(), expectedAssertionsProp.getProperty(SEARCH_TEXT));
            newHomePage.clickBackBtn();

        } catch (Exception e){
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifyGalleryOfGames" + e.getMessage());

            logger.error("Exception occur while verifyGalleryOfGames", e);
        }
        logger.info("Ending of verifyGalleryOfGames method");
    }
    @Test(priority = 13, description = "HomePage_13 , Verify New Frolic Games ")
    @Description("HomePage_13 , Verify New Frolic Games ")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_13 , Verify New Frolic Games ")
    public void verifyNewGames() throws InterruptedException {
        logger.info("Starting of verifyNewGames method");
        try {
            Assert.assertEquals(newHomePage.verifyFrolicCollectionTxt(), expectedAssertionsProp.getProperty(FROLIC_COLLECTION_TEXT));
            Assert.assertEquals(newHomePage.verifyFrolicCollectionSubTxt(), expectedAssertionsProp.getProperty(FROLIC_COLLECTION_SUB_TEXT));
            baseScroll.verticalScrollDown();
        } catch (Exception e){
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifyNewGames" + e.getMessage());

            logger.error("Exception occur while verifyNewGames", e);
        }
        logger.info("Ending of verifyNewGames method");
    }
    @Test(priority = 14, description = "HomePage_14 , Verify Surprise Me Column ")
    @Description("HomePage_14 , Verify Surprise Me Column ")
    @Severity(SeverityLevel.BLOCKER)
    @Story("HomePage_14 , Verify Surprise Me Column ")
    public void verifySurpriseMe() throws InterruptedException {
        logger.info("Starting of verifySurpriseMe method");
        try {
            newHomePage.verifySurpriseMeBanner();
            newHomePage.clickBackBtn();
            Assert.assertEquals(newHomePage.verifyGamesText(), expectedAssertionsProp.getProperty(GAMES_TEXT));

        } catch (Exception e){
            newHomePage.redirectToGamesTabs();
            Assert.fail("Exception occur while verifySurpriseMe" + e.getMessage());

            logger.error("Exception occur while verifySurpriseMe", e);
        }
        logger.info("Ending of verifySurpriseMe method");
    }


}
