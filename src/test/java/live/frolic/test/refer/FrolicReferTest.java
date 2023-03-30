package live.frolic.test.refer;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.refer.FrolicReferPage;
import live.frolic.test.BaseTestAutomation;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import static live.frolic.util.Constants.OWN_REFERRAL_ERROR_TEXT;
import static live.frolic.util.Constants.REFERRAL_SIGNUP_TEXT;

public class FrolicReferTest extends BaseTestAutomation {
    public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());
    private FrolicReferPage frolicReferPage = null;
    private FrolicUserLoginPage newLoginPage = null;
    private FrolicUserLoginPage newUserLogin = null;
    BaseFrolicAutomationPage obj = null;

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(@Optional String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in ReferTest");
        this.newLoginPage = new FrolicUserLoginPage(driver);
        this.frolicReferPage = new FrolicReferPage(driver);
        this.newUserLogin = new FrolicUserLoginPage(driver);
        this.obj = new BaseFrolicAutomationPage(driver);
        logger.info("Ending of initClass method in ReferTest");
        RestAssured.baseURI="https://api.frolicz5.de/service/___/administrator";
        RequestSpecification request=RestAssured.given();
        request.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiZjJmOTkxYTctMWY0Yi00ZGIyLWFjM2QtYjM4OTU5YWRlYjNiIiwiZXhwIjoxNjc5MzkzMDc5LjQxLCJpYXQiOjE2NzgwOTcwNzl9.iuCIwllL6xE7n-JEnDgE_VPsMrRypyFKWTNY8f3EBrQ")
                .header("Content-Type","application/json");
        Response response = request.delete("/v1/users/63f46d292ca39325f48f0562/delete-referral-devices");
        logger.info(response.asString());
    }
    @BeforeMethod
public void goToMainPage() throws InterruptedException {
   newUserLogin.redirectToMaintabs();
}
    @Test(priority = 3)
    public void verifyLeaderBoardOpenedOrNot() {
        logger.info("Starting of LeaderBoard method");
        try {
            frolicReferPage.clickOnMenu();
            frolicReferPage.clickOnReferAndEarn();
            frolicReferPage.clickOnLeaderBoard();
            Assert.assertTrue(frolicReferPage.verifyWinner1Exists());
            Assert.assertTrue(frolicReferPage.verifyWinner2Exists());
            Assert.assertTrue(frolicReferPage.verifyWinner3Exists());
            Assert.assertTrue(frolicReferPage.verifyLeaderboardTableExist());
            logger.info("Leader board opened and all winners are visible");
        } catch (Exception e) {
            Assert.fail("Exception occured while testing winners : " + e.getMessage());
            logger.error("Exception occured while verifying winners :", e);
        }
    }

    @Test(priority = 4)
    public void VerifyTotalRewardsEmptyState() {
        logger.info("Starting of TotalReward method");
        try {
            frolicReferPage.clickOnMenu();
            frolicReferPage.clickOnReferAndEarn();
            frolicReferPage.clickOnTotalReward();
            if (frolicReferPage.verifyInviteButtonExists()) {
                Assert.assertEquals(frolicReferPage.getNoReferralText(), "No referrals found", "No Referral found text not present");
                logger.info("No referral found");
            }
        } catch (Exception e) {
            Assert.assertTrue(frolicReferPage.verifyReferralsExists(), "Referrals not found");
            Assert.assertTrue(frolicReferPage.verifyYourReferralsTextExists(), "Your Referrals text  not found");
            logger.info("Referral found");
        }
    }

    @Test(priority = 5)
    public void VerifyOwnReferralCodeError() {
        logger.info("Starting of Referral  method");
        try {
         frolicReferPage.clickOnMenu();
            frolicReferPage.clickOnReferAndEarn();
            String code = frolicReferPage.getReferralCode();
            frolicReferPage.enterReferral(code);
            frolicReferPage.clickOnApplyBtn();
            Assert.assertEquals(frolicReferPage.getErrorMessage(), expectedAssertionsProp.getProperty(OWN_REFERRAL_ERROR_TEXT), "Own referralcode error message");
        } catch (Exception e) {
            Assert.fail("Exception occured while verifying Own Referral Code" + e.getMessage());

            logger.error("Exception occured while verifying Own Referral Code", e);
        }
    }

    @Test(priority = 6)
    public void VerifyInviteFriends() {
        logger.info("Starting of Invite friends method");
        try {
           frolicReferPage.clickOnMenu();
           frolicReferPage.clickOnReferAndEarn();
            frolicReferPage.clickOnInviteFriendsBtn();
            Assert.assertTrue(frolicReferPage.verifyInviteTextExists(), "Invite Text not found");
        }catch(Exception e)
        {
            Assert.fail("Exception occured while verifying Invite Friends" + e.getMessage());
            logger.error("Exception occured while verifying Invite Friends", e);
        }

    }

    @Test(priority = 7)
    public void VerifyReferralCode() {
        logger.info("Starting of Applying Referral  method");
        try {
            frolicReferPage.clickOnMenu();
            frolicReferPage.clickOnReferAndEarn();
            RestAssured.baseURI="https://api.frolicz5.de/service/___/administrator";
            RequestSpecification request=RestAssured.given();
            request.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiZjJmOTkxYTctMWY0Yi00ZGIyLWFjM2QtYjM4OTU5YWRlYjNiIiwiZXhwIjoxNjc5MzkzMDc5LjQxLCJpYXQiOjE2NzgwOTcwNzl9.iuCIwllL6xE7n-JEnDgE_VPsMrRypyFKWTNY8f3EBrQ")
                    .header("Content-Type","application/json");
            frolicReferPage.enterReferral( testDataProp.getProperty("Referral.code"));
            frolicReferPage.clickOnApplyBtn();
            Assert.assertEquals(frolicReferPage.getReferralSignup(), expectedAssertionsProp.getProperty(REFERRAL_SIGNUP_TEXT), "Referral Signup text not visible");
            Response response1 = request.delete("/v1/users/63f46d292ca39325f48f0562/delete-referral-devices");
            logger.info(response1.asString());
            response1.then().assertThat().statusCode(200);
        }catch(Exception e)
        {
            Assert.fail("Exception occured while verifying Referral Code" + e.getMessage());

            logger.error("Exception occured while verifying Referral Code", e);
        }
    }
}






