package live.frolic.notifications;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.refer.FrolicReferPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrolicNotificationPage extends BaseFrolicAutomationPage {

    @FindBy(xpath = "//*[@resource-id='live.frolic.app.debug:id/rv_profile_menu']/android.view.ViewGroup[1]")
    private WebElement Notifications;

    private static final Logger logger = Logger.getLogger(FrolicNotificationPage.class.getName());

    public FrolicNotificationPage(AppiumDriver<WebElement> appiumDriver) {
        super(appiumDriver);
        logger.info("Starting of Notification method");
        PageFactory.initElements(appiumDriver, this);
        logger.info("Ending of Notification method");

    }
public void clickOnNotifications(){
        clickOnElement(Notifications);
}
    public boolean scrollToSignUpNotification() {
        boolean result = false;
        try {
            androidScrollUsingText("You have earned signup bonus");
            result =true;
        }
          catch (Exception e){
            logger.info("Signup Notification not present");
          }
        return result;

    }public boolean scrollToReferralPerksNotification() {
        boolean result = false;
        try {
            androidScrollUsingText("Referral Perks!");
            result =true;
        }
          catch (Exception e){
            logger.info("Referral Notification not present");
          }
        return result;
    }

}