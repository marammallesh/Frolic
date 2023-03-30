package live.frolic.test.notifications;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.notifications.FrolicNotificationPage;
import live.frolic.refer.FrolicReferPage;
import live.frolic.test.BaseTestAutomation;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import static live.frolic.util.Constants.REFERRAL_SIGNUP_TEXT;

public class FrolicReferralNotificationsTest extends BaseTestAutomation {
    public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());
    private FrolicReferPage frolicReferPage = null;
    private FrolicUserLoginPage newLoginPage = null;
    private FrolicNotificationPage notificationPage = null;
    BaseFrolicAutomationPage obj = null;
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiZjJmOTkxYTctMWY0Yi00ZGIyLWFjM2QtYjM4OTU5YWRlYjNiIiwiZXhwIjoxNjc5MzkzMDc5LjQxLCJpYXQiOjE2NzgwOTcwNzl9.iuCIwllL6xE7n-JEnDgE_VPsMrRypyFKWTNY8f3EBrQ";

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(@Optional String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in NotificationTest");
        this.newLoginPage = new FrolicUserLoginPage(driver);
        this.notificationPage = new FrolicNotificationPage(driver);
        this.frolicReferPage = new FrolicReferPage(driver);
        this.obj = new BaseFrolicAutomationPage(driver);
        logger.info("Ending of initClass method in NotificationTest");
        RestAssured.baseURI = "https://api.frolicz5.de/service/___/administrator";
        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer "+ token)
                .header("Content-Type", "application/json");
        Response response = request.delete("/v1/users/63f46d292ca39325f48f0562/delete-referral-devices");
        logger.info(response.asString());
    }
    @BeforeMethod
    public void goToMainPage() throws InterruptedException {
        newLoginPage.redirectToMaintabs();
    }
    @Test
    public void verifyReferralNotification() throws InterruptedException {
        logger.info("Starting of Notification method");
        try {
            RestAssured.baseURI = "https://api.frolicz5.de/service/___/administrator";
            RequestSpecification request = RestAssured.given();
            request.header("Authorization", "Bearer "+ token)
                    .header("Content-Type", "application/json");
            frolicReferPage.clickOnMenu();
            frolicReferPage.clickOnReferAndEarn();
            frolicReferPage.enterReferral(testDataProp.getProperty("Referral.code"));
            frolicReferPage.clickOnApplyBtn();
            Assert.assertEquals(frolicReferPage.getReferralSignup(), expectedAssertionsProp.getProperty(REFERRAL_SIGNUP_TEXT), "Referral Signup text not visible");
            Response response1 = request.delete("/v1/users/63f46d292ca39325f48f0562/delete-referral-devices");
            logger.info(response1.asString());
            response1.then().assertThat().statusCode(200);
            obj.hardback();
            notificationPage.clickOnNotifications();
            Assert.assertTrue(notificationPage.scrollToReferralPerksNotification());
            logger.info("Referral Notification Perks are visible");
        } catch (Exception e) {
            newLoginPage.redirectToMaintabs();
            Assert.fail("Exception occured while testing Referral Notifications : " + e.getMessage());
            logger.error("Exception occured while verifying Referral Notifications:", e);
        }
    }
}







