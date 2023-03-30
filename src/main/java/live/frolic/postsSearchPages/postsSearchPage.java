package live.frolic.postsSearchPages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.chooseregion.pages.FrolicChooseRegionPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.settings.pages.FrolicSettingsPage;
import live.frolic.wallet.pages.FrolicWalletPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class postsSearchPage extends BaseFrolicAutomationPage {


    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Posts\"]/android.widget.TextView")
    private WebElement tapPostsTab;

    @FindBy(id = "live.frolic.app.debug:id/ed_search")
    private WebElement tapSearchBox;

    @FindBy(id = "live.frolic.app.debug:id/img_post_media")
    private WebElement postResult;

    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private WebElement vailidatePostResult;

    private static final Logger logger = Logger.getLogger(postsSearchPage.class.getName());

    public postsSearchPage(AppiumDriver<WebElement> appiumDriver)
        {
            super(appiumDriver);
            logger.info("Starting of postssearch method");

            PageFactory.initElements(appiumDriver, this);

            logger.info("Ending of postssearch method");
        }

    public String getPostsTab()
    {
            logger.info("Starting of getUserNameText method");

            logger.info("Ending of getUserNameText method");

            return getText(tapPostsTab);
        }

    public String getSearchBox()
        {
            logger.info("Starting of getUserNameText method");

            logger.info("Ending of getUserNameText method");

            return getText(tapSearchBox);
        }
    public String getPostResult()
        {
            logger.info("Starting of getUserNameText method");

            logger.info("Ending of getUserNameText method");

            return getText(postResult);
        }
    public String getVailidatePostResult()
        {
            logger.info("Starting of getUserNameText method");

            logger.info("Ending of getUserNameText method");

            return getText(vailidatePostResult);
        }
    public void clickOnpostsTab()
        {
            clickOnElement(tapPostsTab);
        }

    public void clickOnSearchBox(String Abc)
        {
            clickOnElement(tapSearchBox);

            this.tapSearchBox.sendKeys(Abc);

            logger.info("Ending of clickOnSearchBox method");
        }

    public void clickOnPostResult()
        {
            clickOnElement(postResult);
        }
    public void clickOnVailidatePostResult()
        {
            clickOnElement(vailidatePostResult);
        }

}


