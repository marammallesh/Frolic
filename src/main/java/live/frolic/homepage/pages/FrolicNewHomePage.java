package live.frolic.homepage.pages;

import live.frolic.helpdesk.pages.FrolicRaiseTicketPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;

public class FrolicNewHomePage extends BaseFrolicAutomationPage {
    @FindBy(id = "live.frolic.app.debug:id/riv_bg")
    private WebElement liveMatchColumn;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Live Tournaments']")
    private WebElement liveTournamentTxt;

    @FindBy(xpath = "//android.widget.TextView[@text = 'View all']")
    private WebElement viewAllTxt;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Special Tasks For You']")
    private WebElement achievementTxt;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Perform your task now & get rewards']")
    private WebElement achievementSubTxt;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Recommended Games']")
    private WebElement recommendedGamesTxt;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Play battles and challenge your friends']")
    private WebElement recommendedGamesSubTxt;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Recommended by Leading Gamers']")
    private WebElement leadingGamersTxt;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Play with friends']")
    private WebElement playWithFriendsTxt;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Create custom battles and play with your chosen friends.']")
    private WebElement playWithFriendsSubTxt;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Join Rooms']")
    private WebElement joinRoomBtn;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Create Battle']")
    private WebElement createBattleBtn;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Gallery of Games']")
    private WebElement galleryGamesText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Try your luck on our wide range of game options']")
    private WebElement galleryGamesSubText;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app.debug:id/tvAction']")
    private WebElement clickViewAll40GamesBtn;
    @FindBy(xpath = "//android.widget.TextView[@text = 'New in Frolic Collection']")
    private WebElement frolicCollectionTxt;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Explore endless entertainment with all the new games.']")
    private WebElement frolicCollectionSubTxt;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app.debug:id/banner']")
    private WebElement surpriseMeBanner;
    @FindBy(xpath = "//android.widget.TextView[@text = 'GAMES']")
    private WebElement tabGames;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Games']")
    private WebElement gameTitle;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Search']")
    private WebElement searchTitle;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Arena']")
    private WebElement arenaTitle;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app.debug:id/btn_back']")
    private WebElement clickBackBtn;
    @FindBy(id = "live.frolic.app.debug:id/btnAction")
    private WebElement btnViewAllMatchesButton;


    private static final Logger logger = Logger.getLogger(FrolicRaiseTicketPage.class.getName());

    public FrolicNewHomePage(AppiumDriver<WebElement> driver) {
        super(driver);
    }
    public String verifyGamesText() {
        logger.info("Starting of verifyGamesText method");
        logger.info("Ending of verifyGamesText method");
        return getText(gameTitle);

    }
    public String verifySearchTitle() {
        logger.info("Starting of verifySearchTitle method");
        logger.info("Ending of verifySearchTitle method");
        return getText(searchTitle);

    }
    public String verifyArenaTitle() {
        logger.info("Starting of verifyArenaTitle method");
        logger.info("Ending of verifyArenaTitle method");
        return getText(arenaTitle);

    }


    public String verifyLiveMatchColumn() {
        logger.info("Starting of verifyLiveMatchColumn method");
        logger.info("Ending of verifyLiveMatchColumn method");
        return getText(liveMatchColumn);

    }
    public void clickOnViewAllMatchesButton() {
        logger.info("Starting of clickOnViewAllMatchesButton method");
        clickOnElement(btnViewAllMatchesButton);
        logger.info("Ending of clickOnViewAllMatchesButton method");
    }
    public String verifyLiveTournamentText() {
        logger.info("Starting of verifyLiveTournamentText method");
        logger.info("Ending of verifyLiveTournamentText method");
        return getText(liveTournamentTxt);

    }
    public String verifyViewAllText() {
        logger.info("Starting of verifyViewAllText method");
        logger.info("Ending of verifyViewAllText method");
        return getText(viewAllTxt);

    }

    public void clickOnViewAllBtn() {
        logger.info("Starting of clickOnJoinRoomBtn method");

        clickOnElement(viewAllTxt);

        logger.info("Ending of clickOnJoinRoomBtn method");
    }

    public String verifyAchievementText() {
        logger.info("Starting of verifyAchievementText method");
        logger.info("Ending of verifyAchievementText method");
        return getText(achievementTxt);

    }

    public String verifyAchievementSubTxt() {
        logger.info("Starting of verifyAchievementSubTxt method");
        logger.info("Ending of verifyAchievementSubTxt method");
        return getText(achievementSubTxt);
    }

    public String verifyRecommendedGamesTxt() {
        logger.info("Starting of verifyRecommendedGamesTxt method");
        logger.info("Ending of verifyRecommendedGamesTxt method");
        return getText(recommendedGamesTxt);
    }
    public String verifyRecommendedGamesSubTxt() {
        logger.info("Starting of verifyRecommendedGamesSubTxt method");
        logger.info("Ending of verifyRecommendedGamesSubTxt method");
        return getText(recommendedGamesSubTxt);
    }
    public String verifyLeadingGamersTxt() {
        logger.info("Starting of verifyLeadingGamersTxt method");
        logger.info("Ending of verifyLeadingGamersTxt method");
        return getText(leadingGamersTxt);
    }
    public String verifyPlayWithFriendsTxt() {
        logger.info("Starting of verifyPlayWithFriendsTxt method");
        logger.info("Ending of verifyPlayWithFriendsTxt method");
        return getText(playWithFriendsTxt);
    }
    public String verifyPlayWithFriendsSubTxt() {
        logger.info("Starting of verifyPlayWithFriendsSubTxt method");
        logger.info("Ending of verifyPlayWithFriendsSubTxt method");
        return getText(playWithFriendsSubTxt);
    }
    public void clickOnJoinRoomBtn() {
        logger.info("Starting of clickOnJoinRoomBtn method");

        clickOnElement(joinRoomBtn);

        logger.info("Ending of clickOnJoinRoomBtn method");
    }
    public void clickOnCreateBattleBtn() {
        logger.info("Starting of createBattleBtn method");

        clickOnElement(createBattleBtn);

        logger.info("Ending of createBattleBtn method");
    }
    public String verifyGalleryGamesText() {
        logger.info("Starting of verifyGalleryGamesText method");
        logger.info("Ending of verifyGalleryGamesText method");
        return getText(galleryGamesText);
    }
    public String verifyGalleryGamesSubText() {
        logger.info("Starting of verifyGalleryGamesSubText method");
        logger.info("Ending of verifyGalleryGamesSubText method");
        return getText(galleryGamesSubText);
    }
    public void clickViewAll40GamesBtn() {
        logger.info("Starting of clickViewAll40GamesBtn method");

        clickOnElement(clickViewAll40GamesBtn);

        logger.info("Ending of clickViewAll40GamesBtn method");
    }
    public String verifyFrolicCollectionTxt() {
        logger.info("Starting of verifyFrolicCollectionTxt method");
        logger.info("Ending of verifyFrolicCollectionTxt method");
        return getText(frolicCollectionTxt);
    }

    public String verifyFrolicCollectionSubTxt() {
        logger.info("Starting of verifyFrolicCollectionSubTxt method");
        logger.info("Ending of verifyFrolicCollectionSubTxt method");
        return getText(frolicCollectionSubTxt);
    }

    public void verifySurpriseMeBanner() {
        logger.info("Starting of verifySurpriseMeBanner method");

        clickOnElement(surpriseMeBanner);

        logger.info("Ending of verifySurpriseMeBanner method");
    }
    public void clickBackBtn() {
        logger.info("Starting of clickBackBtn method");
        logger.info("Ending of clickBackBtn method");
        clickOnElement(clickBackBtn);
    }

    public void hardback() {
        logger.info("Starting of hardback method");

        driver.navigate().back();

        logger.info("Ending of hardBack method");
    }

    public void redirectToGamesTabs() {
        logger.info("Starting of redirectToGamesTabs method");

        int i = 1;
        while (i <= 6) {
            try {
                if (tabGames.isDisplayed()) {
                    clickOnElement(tabGames);
                    break;
                }
            } catch (Exception e) {
            }
            this.hardback();
        }

        logger.info("Ending of redirectToGamesTabs method");
    }


}
