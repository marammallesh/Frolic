package live.frolic.practiceMatchPages;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practiceMatchPage extends BaseFrolicAutomationPage {

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Games\"]/android.widget.TextView")
    private WebElement tapGamesTab;

    @FindBy(id = "live.frolic.app.debug:id/ed_search")
    private WebElement tapSearchBox;

    @FindBy(id = "live.frolic.app.debug:id/iv_more_info")
    private WebElement tapMoreInfo;

    // @FindBy(id = "")
    // private WebElement TapAboutGamebutton;

    // @FindBy(id = "live.frolic.app.debug:id/btn_action")
    // private WebElement TapPlaybutton:

    private static final Logger logger = Logger.getLogger(practiceMatchPage.class.getName());

    public practiceMatchPage(AppiumDriver<WebElement> appiumDriver) {
        super(appiumDriver);
        logger.info("Starting of practicematches method");

        PageFactory.initElements(appiumDriver, this);

        logger.info("Ending of practicematches method");
    }

    public String getMoreInfo() {
        logger.info("Starting of MOREINFO method");

        logger.info("Ending of MOREINFO method");

        return getText(tapMoreInfo);
    }

    public String getGameTab() {
        logger.info("Starting game tab method");

        logger.info("Ending game tab method");

        return getText(tapGamesTab);

    }

    public String getSearchBox() {
        logger.info("Starting game tab method");

        logger.info("Ending game tab method");

        return getText(tapSearchBox);
    }

    public void clickOnGametab()
        {
            clickOnElement(tapGamesTab);
        }

    public void clickOnMoreInfo()
        {
            clickOnElement(tapMoreInfo);
        }

    public void clickOnSearchBox(String Fruit)
        {
            logger.info("Starting of Search box method");

            clickOnElement(tapSearchBox);

            this.tapSearchBox.sendKeys(Fruit);

            logger.info("Ending of Search box method");
        }
}
