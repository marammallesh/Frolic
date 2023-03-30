package frolic_prod.livematches.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import frolic_prod.helpdesk.pages.FrolicRaiseTicketPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LiveMatchesPage extends BaseFrolicAutomationPage {

    @FindBy(id = "live.frolic.app:id/riv_title")
    private WebElement txtLiveMatches;

    @FindBy(id = "live.frolic.app:id/description")
    private WebElement txtLiveMatchesDescription;

    @FindBy(id = "live.frolic.app:id/btnAction")
    private WebElement btnViewAllMatchesButton;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/semiBoldTextView5']")
    private WebElement matchLiveContestText;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/tv_selected_game']")
    private WebElement btnSelectGameDropDown;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/tv_title']")
    private WebElement selectGameText;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/et_search']")
    private WebElement btnSearchField;

    @FindBy(id = "live.frolic.app:id/img_banner")
    private WebElement imgMonsterStriker;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/iv_refresh']")
    private WebElement clickRefreshField;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app:id/entry_layout']")
    private WebElement clickEntryPoint;
    @FindBy(id = "live.frolic.app:id/error_text_title")
    private WebElement errorText;
    @FindBy(xpath = "//android.widget.TextView[@text = 'GAMES']")
    private WebElement tabGames;

    private static final Logger logger = Logger.getLogger(FrolicRaiseTicketPage.class.getName());

    public LiveMatchesPage(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    public String getLiveMatches() {
        logger.info("Starting of getLiveMatches method");
        logger.info("Ending of getLiveMatches method");
        return getText(txtLiveMatches);

    }
    public String getLiveMatchesDescription() {
        logger.info("Starting of getLiveMatches method");
        logger.info("Ending of getLiveMatches method");
        return getText(txtLiveMatchesDescription);

    }
    public String getViewAllMatchesButton() {
        logger.info("Starting of getViewAllMatchesButton method");
        logger.info("Ending of getViewAllMatchesButton method");
        return getText(btnViewAllMatchesButton);

    }
    public void clickOnViewAllMatchesButton() {
        logger.info("Starting of clickOnViewAllMatchesButton method");
        clickOnElement(btnViewAllMatchesButton);
        logger.info("Ending of clickOnViewAllMatchesButton method");
    }
    public String getLiveContestText() {
        logger.info("Starting of getLiveContestText method");
        logger.info("Ending of getLiveContestText method");
        return getText(matchLiveContestText);

    }
    public void clickOnSelectGameDropDown() {
        logger.info("Starting of clickOnSelectGameDropDown method");
        clickOnElement(btnSelectGameDropDown);
        logger.info("Ending of clickOnSelectGameDropDown method");
    }
    public String getSelectGameText() {
        logger.info("Starting of getSelectGameText method");
        logger.info("Ending of getSelectGameText method");
        return getText(selectGameText);
    }
    public void clickOnSearchField(String Fruit) {
        logger.info("Starting of clickOnSearchField method");

        clickOnElement(btnSearchField);

        this.btnSearchField.sendKeys(Fruit);

        logger.info("Ending of clickOnSearchField method");
    }
    public void clickOnGameCard() {
        logger.info("Starting of clickOnGameCard method");

        clickOnElement(imgMonsterStriker);

        logger.info("Ending of clickOnGameCard method");
    }
    public void clickOnRefreshButton() {
        logger.info("Starting of clickOnRefreshButton method");

        clickOnElement(clickRefreshField);

        logger.info("Ending of clickOnRefreshButton method");
    }
    public void clickOnGamePlayButton() {
        logger.info("Starting of clickOnEntryPoint method");

        clickOnElement(clickEntryPoint);

        logger.info("Ending of clickOnEntryPoint method");
    }
    public String getEntryPoint() {
        logger.info("Starting of getEntryPoint method");
        logger.info("Ending of getEntryPoint method");
        return getText(clickEntryPoint);
    }
    public String getErrorText() {
        logger.info("Starting of getErrorText method");
        logger.info("Ending of getErrorText method");
        return getText(errorText);
    }
    public void redirectToMaintabs() {
        logger.info("Starting of redirectToMaintabs method");

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
            i++;
        }

        logger.info("Ending of redirectToMaintabs method");
    }


}


