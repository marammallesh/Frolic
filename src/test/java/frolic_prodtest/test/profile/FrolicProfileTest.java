package frolic_prodtest.test.profile;

import frolic_prodtest.test.BaseTestAutomation;
import frolic_prodtest.test.liveMatches.LiveMatches;
import io.qameta.allure.*;
import frolic_prod.profile.pages.FrolicProfilePage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static frolic_prodtest.util.Constants.*;

@Epic("Profile Page")
@Feature("Profile Page Functionality")


public class FrolicProfileTest extends BaseTestAutomation {
    public static final Logger logger = Logger.getLogger(LiveMatches.class.getName());

    private FrolicProfilePage profilePage = null;
    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in LoginTest");

        this.profilePage = new FrolicProfilePage(driver);

        logger.info("Ending of initClass method in LoginTest");
    }
    @Test(priority = 0, description = "Profile_0 , Verify to the Menu tab")
    @Description("Profile_0, Verify to the Menu tab")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_0, Verify to the Menu tab")
    public void redirectToMenuTab() throws InterruptedException {

        logger.info("Starting of verify redirectToMenuTab method");
        profilePage.redirectToMainTabs();
        logger.info("Ending of redirectToMenuTab method");
    }


    @Test(priority = 1, description = "Profile_1 , Click on the Profile Pic and Verify the My Profile Text ")
    @Description("Profile_1, Click on the Profile Pic")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_1, Click on the Profile Pic")
    public void clickProfilePic() throws InterruptedException {
        logger.info("Starting of clickProfilePic method");
        try {
            profilePage.clickOnProfilePic();
            Assert.assertEquals(profilePage.getMyProfileText(), expectedAssertionsProp.getProperty(MY_PROFILE_TEXT));
        } catch (Exception e) {
            profilePage.redirectToMainTabs();
            Assert.fail("Exception occur while click on the Profile Pic" + e.getMessage());

            logger.error("Exception occur while click on the Profile Pic", e);

        }
        logger.info("Ending of clickProfilePic method");
    }

    @Test(priority = 3, description = "Profile_3 , Verify the Phone Number and Username")
    @Description("Profile_3, Verify the Phone Number and Username")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_3, Verify the Phone Number and Username")
    public void verifyPhoneAndUserId() throws InterruptedException {
        logger.info("Starting of verifyPhoneAndUserId method");
        try {
            Assert.assertEquals(profilePage.verifyPhoneAndUserId(), expectedAssertionsProp.getProperty(PHONE_NUMBER_USERNAME));
           // Assert.assertEquals(profilePage.verifyPhoneAndUserId(), expectedAssertionsProp.
            //logger.info("Ending of clickOnViewAllMatchesButton method");

        } catch (Exception e){
            profilePage.redirectToMainTabs();
            Assert.fail("Exception occur while Verify the Phone Number and Username" + e.getMessage());

            logger.error("Exception occur while Verify the Phone Number and Username", e);
        }
        logger.info("Ending of clickOnViewAllMatchesButton method");
    }
    @Test(priority = 4, description = "Profile_4 , Verify Followers Text")
    @Description("Profile_4, Verify Followers Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_4, Verify Followers Text")
    public void verifyFollowersText() throws InterruptedException {
        logger.info("Starting of verifyFollowersText method");
        try {
            Assert.assertEquals(profilePage.verifyFollowersText(), expectedAssertionsProp.getProperty(FOLLOWERS));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify the Followers Text" + e.getMessage());

            logger.error("Exception occur while verify the Followers Text", e);

        }
        logger.info("Ending of verifyFollowersText method");
    }
    @Test(priority = 5, description = "Profile_5 , Verify Following Text")
    @Description("Profile_5, Verify Following Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_5, Verify Following Text")
    public void verifyFollowingText() throws InterruptedException {
        logger.info("Starting of verifyFollowingText method");
        try {

            Assert.assertEquals(profilePage.verifyFollowingText(), expectedAssertionsProp.getProperty(FOLLOWING));

        } catch (Exception e) {

            Assert.fail("Exception occur while verifyFollowingText" + e.getMessage());
            logger.error("Exception occur while verifyFollowingText", e);

        }
        logger.info("Ending of verifyFollowingText method");
    }
    @Test(priority = 6, description = "Profile_6 , Verify Referred Text")
    @Description("Profile_6, Verify Referred Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_6, Verify Referred Text")
    public void verifyReferredText() throws InterruptedException {
        logger.info("Starting of verifyReferredText method");
        try {

            Assert.assertEquals(profilePage.verifyReferredText(), expectedAssertionsProp.getProperty(REFERRED));

        } catch (Exception e) {

            Assert.fail("Exception occur while verifyReferredText" + e.getMessage());
            logger.error("Exception occur while verifyReferredText", e);

        }
        logger.info("Ending of verifyReferredText method");
    }
    @Test(priority = 7, description = "Profile_7 , Verify XP Points Text")
    @Description("Profile_7 , Verify XP Points Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_7 , Verify XP Points Text")
    public void verifyXpPointsText() throws InterruptedException {
        logger.info("Starting of verifyReferredText method");
        try {

            Assert.assertEquals(profilePage.verifyXPPoints(), expectedAssertionsProp.getProperty(XP_POINTS));

        } catch (Exception e) {

            Assert.fail("Exception occur while verifyXpPointsText" + e.getMessage());
            logger.error("Exception occur while verifyXpPointsText", e);

        }
        logger.info("Ending of verifyXpPointsText method");
    }

    @Test(priority = 8, description = "Profile_8 , Verify Email Text")
    @Description("Profile_8 , Verify Email Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_8 , Verify Email Text")
    public void verifyEmailTitle() throws InterruptedException {
        logger.info("Starting of verifyEmailTitle method");
        try {

            Assert.assertEquals(profilePage.verifyEmailTitle(), expectedAssertionsProp.getProperty(EMAIL));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify Email Text" + e.getMessage());
            logger.error("Exception occur while verify Email Text", e);

        }
        logger.info("Ending of verifyEmailTitle method");
    }

    @Test(priority = 9, description = "Profile_9 , Verify About Text")
    @Description("Profile_8 , Verify About Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_9 , Verify About Text")
    public void verifyAboutText() throws InterruptedException {
        logger.info("Starting of verifyAboutText method");
        try {

            Assert.assertEquals(profilePage.verifyAboutText(), expectedAssertionsProp.getProperty(ABOUT));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify verifyAboutText " + e.getMessage());
            logger.error("Exception occur while verifyAboutText", e);

        }
        logger.info("Ending of verifyAboutText method");
    }

    @Test(priority = 10, description = "Profile_10 , Verify Games Won Text")
    @Description("Profile_10 , Verify Games Won Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_10 , Verify Games Won Text")
    public void verifyGamesWonText() throws InterruptedException {
        logger.info("Starting of verifyAboutText method");
        try {

            Assert.assertEquals(profilePage.verifyGamesWonText(), expectedAssertionsProp.getProperty(GAMES_WON));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify verifyGamesWonText " + e.getMessage());
            logger.error("Exception occur while verifyGamesWonText", e);

        }
        logger.info("Ending of verifyGamesWonText method");
    }
    @Test(priority = 11, description = "Profile_11 , Verify Games Played Text")
    @Description("Profile_11 , Verify Games Played Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_11 , Verify Games Played Text")
    public void verifyGamesPlayedText() throws InterruptedException {
        logger.info("Starting of verifyGamesPlayedText method");
        try {

            Assert.assertEquals(profilePage.verifyGamesPlayedText(), expectedAssertionsProp.getProperty(GAMES_PLAYED));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify verifyGamesPlayedText " + e.getMessage());
            logger.error("Exception occur while verifyGamesPlayedText", e);

        }
        logger.info("Ending of verifyGamesPlayedText method");
    }
    @Test(priority = 12, description = "Profile_12 , Verify Tournaments Text")
    @Description("Profile_12 , Verify Tournaments Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_12 , Verify Tournaments Text")
    public void verifyTournamentsText() throws InterruptedException {
        logger.info("Starting of verifyTournamentsText method");
        try {

            Assert.assertEquals(profilePage.verifyTournamentsText(), expectedAssertionsProp.getProperty(TOURNAMENTS));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify verifyTournamentsText " + e.getMessage());
            logger.error("Exception occur while verifyTournamentsText", e);

        }
        logger.info("Ending of verifyTournamentsText method");
    }
    @Test(priority = 13, description = "Profile_13 , Verify My Posts Text")
    @Description("Profile_13 , Verify My Posts Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_13 , Verify My Posts Text")
    public void verifyMyPostText() throws InterruptedException {
        logger.info("Starting of verifyMyPostText method");
        try {

            Assert.assertEquals(profilePage.verifyMyPostText(), expectedAssertionsProp.getProperty(MY_POSTS));

        } catch (Exception e) {

            Assert.fail("Exception occur while verify verifyMyPostText " + e.getMessage());
            logger.error("Exception occur while verifyMyPostText", e);

        }
        logger.info("Ending of verifyMyPostText method");
    }

    @Test(priority = 14, description = "Profile_14 , Verify Saved Posts Text")
    @Description("Profile_14 , Verify Saved Posts Text")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_14 , Verify Saved Posts Text")
    public void verifySavedPostText() throws InterruptedException {
        logger.info("Starting of verifySavedPostText method");
        try {

            Assert.assertEquals(profilePage.verifySavedPostText(), expectedAssertionsProp.getProperty(SAVED_POSTS));

        } catch (Exception e) {

            Assert.fail("Exception occur while verifySavedPostText " + e.getMessage());
            logger.error("Exception occur while verifySavedPostText", e);

        }
        logger.info("Ending of verifySavedPostText method");
    }
    @Test(priority = 15, description = "Profile_15 , Verify to add the Name and About Us Detail in profile pic ")
    @Description("Profile_15 , Verify to add the Name and About Us Detail in profile pic")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_15 , Verify to add the Name and About Us Detail in profile pic")
    public void editName() throws InterruptedException {
        logger.info("Starting of editName method");
        try {
            profilePage.clickEditBtn();
            profilePage.addName(testDataProp.getProperty("profile.name"));
            profilePage.addAboutUsText(testDataProp.getProperty("profile.aboutUs"));
            profilePage.clickSaveBtn();
            Assert.assertEquals(profilePage.verifyProfileNameText(), expectedAssertionsProp.getProperty(PROFILE_NAME));
            Assert.assertEquals(profilePage.verifyAboutUsContentData(), expectedAssertionsProp.getProperty(ABOUT_US_CONTENT));


        } catch (Exception e) {

            Assert.fail("Exception occur while editName " + e.getMessage());
            logger.error("Exception occur while editName", e);
        }
        logger.info("Ending of editName method");
    }
    @Test(priority = 16, description = "Profile_16 , Verify the GamesWon Page Link")
    @Description("Profile_16 , Verify the GamesWon Page Link")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_16 , Verify the GamesWon Page Link")
    public void verifyGamesWonPage() throws InterruptedException {
        logger.info("Starting of verifyGamesWonPage method");
        try {
            profilePage.clickGamesWonTab();
            Assert.assertEquals(profilePage.verifyArenaHistoryText(), expectedAssertionsProp.getProperty(ARENA_HISTORY));
            profilePage.clickBackBtn();
            Assert.assertEquals(profilePage.getMyProfileText(), expectedAssertionsProp.getProperty(MY_PROFILE_TEXT));
        } catch (Exception e) {

            Assert.fail("Exception occur while verifyGamesWonPage " + e.getMessage());
            logger.error("Exception occur while verifyGamesWonPage", e);
        }
        logger.info("Ending of verifyGamesWonPage method");
    }
    @Test(priority = 17, description = "Profile_17 , Verify the GamesPlayed Page Link")
    @Description("Profile_17 , Verify the GamesPlayed Page Link")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Profile_17 , Verify the GamesPlayed Page Link")
    public void verifyGamesPlayedPage() throws InterruptedException {
        logger.info("Starting of verifyGamesWonPage method");
        try {
            profilePage.clickGamesPlayedTab();
            Assert.assertEquals(profilePage.verifyGamesText(), expectedAssertionsProp.getProperty(GAMES2));
            profilePage.clickBackBtn();
            Assert.assertEquals(profilePage.getMyProfileText(), expectedAssertionsProp.getProperty(MY_PROFILE_TEXT));
        } catch (Exception e) {

            Assert.fail("Exception occur while verifyGamesWonPage " + e.getMessage());
            logger.error("Exception occur while verifyGamesWonPage", e);
        }
        logger.info("Ending of verifyGamesWonPage method");
    }




}






