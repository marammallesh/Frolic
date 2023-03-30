package live.frolic.refer;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrolicReferPage extends BaseFrolicAutomationPage {
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Menu\"]")
    private WebElement menuButton;

    @FindBy(xpath = "//*[@resource-id='live.frolic.app.debug:id/rv_profile_menu']/android.view.ViewGroup[6]")
    private WebElement referAndEarn;

    @FindBy(id = "live.frolic.app.debug:id/iv_leader_board")
    private WebElement leaderBoard;

    @FindBy(id = "live.frolic.app.debug:id/img_winner1")
    private WebElement imgWinner1;

    @FindBy(id = "live.frolic.app.debug:id/img_winner2")
    private WebElement imgWinner2;

    @FindBy(id = "live.frolic.app.debug:id/img_winner3")
    private WebElement imgWinner3;

    @FindBy(id = "live.frolic.app:id/img_winner1")
    private WebElement idWinner1;

    @FindBy(id = "live.frolic.app:id/img_winner2")
    private WebElement idWinner2;
    @FindBy(id = "live.frolic.app:id/img_winner3")
    private WebElement idWinner3;
    @FindBy(id = "live.frolic.app.debug:id/tv_total_reward")
    private WebElement totalReward;

    @FindBy(id = "live.frolic.app.debug:id/button_retry")
    private WebElement btnInvite;

    @FindBy(id = "live.frolic.app.debug:id/error_text")
    private WebElement txtNoReferral;
    @FindBy(id = "live.frolic.app.debug:id/tv_referral_code")
    private WebElement copyReferral;
    @FindBy(id = "live.frolic.app.debug:id/et_referral")
    private WebElement referralField;
    @FindBy(id = "live.frolic.app.debug:id/tv_apply")
    private WebElement applyBtn;
    @FindBy(id = "live.frolic.app.debug:id/tv_error")
    private WebElement errorMessage;
    @FindBy(id = "live.frolic.app.debug:id/rv_requests")
    private WebElement referralRequests;
    @FindBy(id = "live.frolic.app.debug:id/tv_invite_friends")
    private WebElement inviteFriends;
    @FindBy(id = "live.frolic.app.debug:id/recycler_leadarboard")
    private WebElement leaderboardTable;
    @FindBy(xpath = "//*[contains(@text,'Hi, I have just given you Rs 25 as a gift.')]")
    private WebElement inviteText;
    @FindBy(xpath = "//*[contains(@text,'Your Referrals')]")
    private WebElement yourReferrals;
    @FindBy(xpath = "//*[@resource-id='live.frolic.app.debug:id/ll_referrer']/android.widget.TextView")
    private WebElement referralSignup;

    private static final Logger logger = Logger.getLogger(FrolicReferPage.class.getName());

    public FrolicReferPage(AppiumDriver<WebElement> appiumDriver) {
        super(appiumDriver);
        logger.info("Starting of ReferPage method");
        PageFactory.initElements(appiumDriver, this);
        logger.info("Ending of ReferPage method");

    }

    public void clickOnMenu() {
        System.out.println("click on menu");
        clickOnElement(menuButton);
    }public void clickOnApplyBtn() {
        System.out.println("click on Apply Button");
        clickOnElement(applyBtn);
    }
public void clickOnInviteFriendsBtn() {
        System.out.println("click on Invite Friends Button");
        clickOnElement(inviteFriends);
    }

    public void clickOnReferAndEarn() {
        clickOnElement(referAndEarn);
    }

    public void clickOnLeaderBoard() {
        clickOnElement(leaderBoard);
    }

    public void clickOnTotalReward() {
        clickOnElement(totalReward);
    }


    public boolean verifyWinner1Exists() {
        // boolean result = checkElementPresence(idWinner1);
        boolean result = false;
        try {
            result = checkElementPresence(imgWinner1);
            //    result = driver.findElementById("live.frolic.app.debug:id/img_winner1").isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }public boolean verifyLeaderboardTableExist() {
        boolean result = false;
        try {
            result = checkElementPresence(leaderboardTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getNoReferralText(){
        return getText(txtNoReferral);
    }
    public String getReferralCode(){

        return getText(copyReferral);
    } public String getReferralSignup(){

        return getText(referralSignup);
    }public String getErrorMessage(){

        return getText(errorMessage);
    }
    public void enterReferral(String code){
        clear(referralField);
        sendKeys(referralField,code);


    //public void enterReferral(String str ="BCZB5939"){
     //   clear(referralField);
      //  sendKeys(referralField, code);
    }

    public boolean verifyWinner2Exists() {
        boolean result = checkElementPresence(imgWinner2);
        // boolean result = driver.findElementById("live.frolic.debug:id/img_winner2").isDisplayed();
        return result;
    }
    public boolean verifyWinner3Exists () {
        boolean result = checkElementPresence(imgWinner3);
        //  boolean result = driver.findElementById("live.frolic.debug:id/img_winner3").isDisplayed();
        return result;
    }

    public boolean verifyInviteButtonExists(){
        boolean result = checkElementPresence(btnInvite);
        return result;

    }
    public boolean verifyReferralsExists(){
        boolean result = checkElementPresence(referralRequests);
        return result;

    }
    public boolean verifyInviteTextExists(){
        boolean result = checkElementPresence(inviteText);
        return result;

    }public boolean verifyYourReferralsTextExists(){
        boolean result = checkElementPresence(yourReferrals);
        return result;

    }
}


