package live.frolic.usersSearchPages;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usersSearchPage extends BaseFrolicAutomationPage {



    //Locaters//

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement tabSearch;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Users\"]/android.widget.TextView")
    private WebElement tabUsers;

    @FindBy(id = "live.frolic.app.debug:id/ed_search")
    private WebElement textBox;

    @FindBy(id = "live.frolic.app.debug:id/tv_username")
    private WebElement searchResult;

    @FindBy(id = "live.frolic.app.debug:id/top_title")
    private WebElement userName;

    @FindBy(id = "live.frolic.app.debug:id/btn_back")
    private WebElement backButton;

    private static final Logger logger = Logger.getLogger(usersSearchPage.class.getName());

    public usersSearchPage(AppiumDriver<WebElement> appiumDriver)
    {
        super(appiumDriver);

        logger.info("Starting of usersearch method");

        PageFactory.initElements(appiumDriver, this);

        logger.info("Ending of usersearch method");

    }
    public String getSearchTab()
    {
        logger.info("Starting of getUserNameText method");

        logger.info("Ending of getUserNameText method");

        return getText(tabSearch);
    }
    public String getUsersTab()
    {
        logger.info("Starting of getUserNameText method");

        logger.info("Ending of getUserNameText method");

        return getText(tabUsers);
    }
    public String getTextBox()
    {
        logger.info("Starting of getSearchText method");

        logger.info("Ending of getSearchText method");

        return getText(textBox);
    }
    public String getSearchResult()
    {
        logger.info("Starting tap user method");

        logger.info("Ending tap user method");

        return getText(tabUsers);
    }

    public String getUsername()
    {
        logger.info("Starting tap userName method");

        logger.info("Ending tap userName method");

        return getText(userName);
    }

    public String getBackButton()
    {
        logger.info("Starting back button method");

        logger.info("Ending back button method");

        return getText(backButton);
    }

    public void clickOnSearchTab()
    {
        clickOnElement(tabSearch);
    }

    public void clickOnUserTab()
    {
        clickOnElement(tabUsers);
    }

    public void clickOnTextBox(String sa)
    {
        logger.info("Starting of clickOntextBox method");

        clickOnElement(textBox);

        this.textBox.sendKeys(sa);

        logger.info("Ending of clickOntextBox method");
    }

    public void clickOnSearchResult()
    {
        clickOnElement(searchResult);
    }

    public void clickOnUsername()
    {
        clickOnElement(userName);

    }

    public void clickOnBackButton()
    {
        clickOnElement(backButton);
    }

}

