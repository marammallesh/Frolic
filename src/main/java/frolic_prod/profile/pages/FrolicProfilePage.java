package frolic_prod.profile.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import frolic_prod.helpdesk.pages.FrolicRaiseTicketPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrolicProfilePage extends BaseFrolicAutomationPage {


    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/iv_avatar']")
    private WebElement clickAndVerifyProfilePic;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/tv_title']")
    private WebElement myProfileText;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/tv_user_name_layout']")
    private WebElement verifyUserName;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/tv_phone_user_id']")
    private WebElement verifyPhoneAndUserId;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Followers']")
    private WebElement verifyFollowersText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Following']")
    private WebElement verifyFollowingText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Referred']")
    private WebElement verifyReferredText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'XP Points']")
    private WebElement verifyXPPoints;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/top_title']")
    private WebElement verifyEmailTitle;

    @FindBy(xpath = "//android.widget.TextView[@text = 'About']")
    private WebElement verifyAboutText;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Games Won']")
    private WebElement verifyGamesWonText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Games Played']")
    private WebElement verifyGamesPlayedBtn;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Games Played']")
    private WebElement verifyGamesPlayedText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Tournaments']")
    private WebElement verifyTournamentsText;

    @FindBy(xpath = "//android.widget.TextView[@text = 'My Posts']")
    private WebElement verifyandSaveMyPostText;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/view_all']")
    private WebElement clickViewAllBtn;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/edit_save_changes']")
    private WebElement clickEditBtn;

    @FindBy(xpath = "//android.widget.TextView[@text = 'MENU']")
    private WebElement tabMenu;
    @FindBy(xpath = "//android.widget.EditText[@text = 'Enter Name']")
    private WebElement enterName;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Save']")
    private WebElement clickSaveBtn;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Rahul']")
    private WebElement verifyProfileName;
    @FindBy(xpath = "//android.widget.EditText[@text = 'My Name is Rahul Gupta. I am from Delhi.']")
    private WebElement verifyAboutUsContentText;

    @FindBy(xpath = "//android.widget.EditText[@text = 'Tell us about you.']")
    private WebElement enterText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Arena History']")
    private WebElement verifyArenaHistoryText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'Games']")
    private WebElement verifyGamesText;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/btn_back']")
    private WebElement clickBackBtn;

    private static final Logger logger = Logger.getLogger(FrolicRaiseTicketPage.class.getName());

    public FrolicProfilePage(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    public void clickOnProfilePic() {
        logger.info("Starting of clickOnProfilePic method");
        logger.info("Ending of clickOnProfilePic method");
        clickOnElement(clickAndVerifyProfilePic);

    }
    public String getMyProfileText() {
        logger.info("Starting of myProfileText method");
        logger.info("Ending of myProfileText method");
        return getText(myProfileText);
    }
    public String verifyProfilePic() {
        logger.info("Starting of verifyProfilePic method");
        logger.info("Ending of verifyProfilePic method");
        return getText(clickAndVerifyProfilePic);

    }
    public String verifyUserName() {
        logger.info("Starting of verifyUserName method");
        logger.info("Ending of verifyUserName method");
        return getText(verifyUserName);

    }
    public String verifyPhoneAndUserId() {
        logger.info("Starting of verifyPhoneAndUserId method");
        logger.info("Ending of verifyPhoneAndUserId method");
        return getText(verifyPhoneAndUserId);
    }
    public String verifyFollowersText() {
        logger.info("Starting of verifyFollowersText method");
        logger.info("Ending of verifyFollowersText method");
        return getText(verifyFollowersText);

    }
    public String verifyFollowingText() {
        logger.info("Starting of verifyFollowingText method");
        logger.info("Ending of verifyFollowingText method");
        return getText(verifyFollowingText);

    }
    public String verifyReferredText() {
        logger.info("Starting of verifyReferredText method");
        logger.info("Ending of verifyReferredText method");
        return getText(verifyReferredText);

    }
    public String verifyXPPoints() {
        logger.info("Starting of verifyXPPoints method");
        logger.info("Ending of verifyXPPoints method");
        return getText(verifyXPPoints);

    }
    public String verifyEmailTitle() {
        logger.info("Starting of verifyEmailTitle method");
        logger.info("Ending of verifyEmailTitle method");
        return getText(verifyEmailTitle);

    }
    public String verifyAboutText() {
        logger.info("Starting of verifyAboutText method");
        logger.info("Ending of verifyAboutText method");
        return getText(verifyAboutText);
    }
    public String verifyGamesWonText() {
        logger.info("Starting of verifyGamesWonText method");
        logger.info("Ending of verifyGamesWonText method");
        return getText(verifyGamesWonText);
    }
    public String verifyMyPostText() {
        logger.info("Starting of verifyMyPostText method");
        logger.info("Ending of verifyMyPostText method");
        return getText(verifyandSaveMyPostText);
    }
    public String verifySavedPostText() {
        logger.info("Starting of verifySavedPostText method");
        logger.info("Ending of verifySavedPostText method");
        return getText(verifyandSaveMyPostText);
    }
    public String verifyGamesPlayedText() {
        logger.info("Starting of verifyGamesPlayedText method");
        logger.info("Ending of verifyGamesPlayedText method");
        return getText(verifyGamesPlayedText);
    }
    public String verifyTournamentsText() {
        logger.info("Starting of verifyTournamentsText method");
        logger.info("Ending of verifyTournamentsText method");
        return getText(verifyTournamentsText);
    }
    public void clickViewAllBtn() {
        logger.info("Starting of clickViewAllBtn method");
        logger.info("Ending of clickViewAllBtn method");
        clickOnElement(clickViewAllBtn);
    }
    public void clickEditBtn() {
        logger.info("Starting of clickEditBtn method");
        logger.info("Ending of clickEditBtn method");
        clickOnElement(clickEditBtn);
    }
    public void addName(String data) {
        logger.info("Starting of addName method");

        //clickOnElement(enterName);

        this.enterName.sendKeys(data);

        logger.info("Ending of addName method");
    }
    public void clickSaveBtn() {
        logger.info("Starting of clickSaveBtn method");
        logger.info("Ending of clickSaveBtn method");
        clickOnElement(clickSaveBtn);
    }
    public void addAboutUsText(String data) {
        logger.info("Starting of addAboutUsText method");

        clickOnElement(enterText);

        this.enterText.sendKeys(data);

        logger.info("Ending of addAboutUsText method");
    }
    public void clickGamesWonTab() {
        logger.info("Starting of clickGamesWonTab method");
        logger.info("Ending of clickGamesWonTab method");
        clickOnElement(verifyGamesWonText);
    }
    public void clickGamesPlayedTab() {
        logger.info("Starting of clickGamesPlayedTab method");
        logger.info("Ending of clickGamesPlayedTab method");
        clickOnElement(verifyGamesPlayedText);
    }
    public String verifyArenaHistoryText() {
        logger.info("Starting of verifyArenaHistoryText method");
        logger.info("Ending of verifyArenaHistoryText method");
        return getText(verifyArenaHistoryText);
    }
    public String verifyGamesText() {
        logger.info("Starting of verifyGamesText method");
        logger.info("Ending of verifyGamesText method");
        return getText(verifyGamesText);
    }
    public String verifyProfileNameText() {
        logger.info("Starting of verifyProfileNameText method");
        logger.info("Ending of verifyProfileNameText method");
        return getText(verifyProfileName);
    }
    public String verifyAboutUsContentData() {
        logger.info("Starting of verifyAboutUsContentData method");
        logger.info("Ending of verifyAboutUsContentData method");
        return getText(verifyAboutUsContentText);
    }

    public void clickBackBtn() {
        logger.info("Starting of clickBackBtn method");
        logger.info("Ending of clickBackBtn method");
        clickOnElement(clickBackBtn);
    }

    public void redirectToMainTabs() {
        logger.info("Starting of redirectToMainTabs method");

        int i = 1;
        while (i <= 6) {
            try {
                if (tabMenu.isDisplayed()) {
                    clickOnElement(tabMenu);
                    break;
                }
            } catch (Exception e) {
            }
            this.hardback();
            i++;
        }

        logger.info("Ending of redirectToMainTabs method");
    }


}


