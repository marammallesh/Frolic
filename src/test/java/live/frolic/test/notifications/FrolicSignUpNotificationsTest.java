package live.frolic.test.notifications;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.notifications.FrolicNotificationPage;
import live.frolic.refer.FrolicReferPage;
import live.frolic.test.BaseTestAutomation;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class FrolicSignUpNotificationsTest extends BaseTestAutomation {
    public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());
    private FrolicReferPage frolicReferPage = null;
    private FrolicUserLoginPage newLoginPage = null;
    private FrolicNotificationPage notificationPage = null;
    BaseFrolicAutomationPage obj = null;

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(@Optional String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in NotificationTest");
        this.newLoginPage = new FrolicUserLoginPage(driver);
        this.notificationPage = new FrolicNotificationPage(driver);
        this.frolicReferPage = new FrolicReferPage(driver);
        this.obj = new BaseFrolicAutomationPage(driver);
        logger.info("Ending of initClass method in NotificationTest");
    }
    @BeforeMethod
    public void goToMainPage() throws InterruptedException {
        newLoginPage.redirectToMaintabs();
    }
    @Test
    public void verifySignUpNotification() throws InterruptedException {
        logger.info("Starting of Sign Up Notification method");
        try {
            frolicReferPage.clickOnMenu();
            notificationPage.clickOnNotifications();
            Assert.assertTrue(notificationPage.scrollToSignUpNotification());
                logger.info(" You have earned signup bonus");
        } catch (Exception e) {
            newLoginPage.redirectToMaintabs();
            Assert.fail("Exception occured while testing Sign Up Notifications : " + e.getMessage());
            logger.error("Exception occured while verifying Sign Up Notifications:", e);
        }
    }

    }





