package frolic_prod.challenges.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/*
 * @author b2btesters
*/

public class FrolicChallengePlayLaterPage extends BaseFrolicAutomationPage {

	@FindBy(xpath = "//android.widget.TextView[@text = 'Custom Battles']")
	private WebElement txtCustomBattle;

	@FindBy(id = "live.frolic.app:id/btn_view_all")
	private WebElement btnViewAll;

	@FindBy(id = "live.frolic.app:id/tv_app_name")
	private WebElement txtArena;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Battles']")
	private WebElement btnBattle;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Create New Battle']")
	private WebElement btnCreateBattle;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Apply']")
	private WebElement btnApply;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Cancel']")
	private WebElement btnCancel;

	@FindBy(id = "live.frolic.app:id/btn_done")
	private WebElement btnDone;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select Game']")
	private WebElement txtSelectGame;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Aqua Bubble Shooter']")
	private WebElement btnBubbleShooter;

	@FindBy(id = "live.frolic.app:id/ed_search")
	private WebElement txtOpponent;

	@FindBy(xpath = "//android.widget.TextView[@text = 'naresh212']")
	private WebElement getOpponent;

	@FindBy(id = "live.frolic.app:id/btn_challenge_user")
	private WebElement btnChallenge;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Play Challenge']")
	private WebElement txtPlayChallenge;

	@FindBy(id = "live.frolic.app:id/rb_digital_currency")
	private WebElement btnBonusCash;

	@FindBy(xpath = "//android.widget.TextView[@text = '25']")
	private WebElement btnTwintyFive;

	@FindBy(xpath = "//android.widget.TextView[@text = '2']")
	private WebElement btnTwoRupees;

	@FindBy(id = "live.frolic.app:id/et_amnt")
	private WebElement txtAmount;

	@FindBy(id = "live.frolic.app:id/rb_currency")
	private WebElement btnCash;

	@FindBy(id = "live.frolic.app:id/btn_schedule_match")
	private WebElement btnRemind;

	@FindBy(id = "live.frolic.app:id/label")
	private WebElement txtGameTime;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc = 'Next']")
	private WebElement btnNext;

	@FindBy(xpath = "//android.widget.CheckedTextView[@text = '6']")
	private WebElement btnDateFifteen;

	@FindBy(id = "android:id/button1")
	private WebElement btnOk;

	@FindBy(id = "live.frolic.app:id/btn_cancel")
	private WebElement btnReject;

	@FindBy(id = "live.frolic.app:id/btn_exit")
	private WebElement btnYes;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Aqua Bubble Shooter']")
	private WebElement verifyGameName;

	@FindBy(id = "live.frolic.app:id/tv_entry_fee")
	private WebElement getEntryFeeText;

	@FindBy(id = "live.frolic.app:id/tv_challenger_name")
	private WebElement getOpponentName;

	@FindBy(id = "live.frolic.app:id/btn_back")
	private WebElement btnBackIcon;

	@FindBy(id = "live.frolic.app:id/tv_text")
	private WebElement txtRejectChallenge;

	@FindBy(id = "live.frolic.app:id/btn_enable")
	private WebElement btnAllowAccess;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	private WebElement btnOneTime;

	private static final Logger logger = Logger.getLogger(FrolicChallengePlayLaterPage.class.getName());

	public FrolicChallengePlayLaterPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
		logger.info("Starting of FrolicChallengePlayLater method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicChallengePlayLater method");
	}

	public String getCustomBattleText() {
		logger.info("Starting of getCustomBattleText method");

		logger.info("Ending of getCustomBattleText method");

		return getText(txtCustomBattle);
	}

	public void clickOnViewAllButton() throws InterruptedException {
		logger.info("Starting of clickOnViewAllButton method");

		verticalScrollDown();

		clickOnElement(btnViewAll);

		logger.info("Ending of clickOnViewAllButton method");
	}

	public String getArenaText() {
		logger.info("Starting of getArenaText method");

		logger.info("Ending of getArenaText method");

		return getText(txtArena);
	}

	public String getAllowAccessText() {
		logger.info("Starting of getAllowAccessText method");

		logger.info("Ending of getAllowAccessText method");

		return getText(btnAllowAccess);
	}

	public void clickOnAllowAccess() {
		logger.info("Starting of clickOnAllowAccess method");

		clickOnElement(btnAllowAccess);

		logger.info("Ending of clickOnAllowAccess method");
	}

	public void clickOnOneTimebutton() {
		logger.info("Starting of clickOnOneTimebutton method");

		clickOnElement(btnOneTime);

		logger.info("Ending of clickOnOneTimebutton method");
	}

	public String getWantToRejectChallengesText() {
		logger.info("Starting of getWantToRejectChallengesText method");

		logger.info("Ending of getWantToRejectChallengesText method");

		return getText(txtRejectChallenge);
	}

	public void clickOnBattles() {
		logger.info("Starting of clickOnBattles method");

		clickOnElement(btnBattle);

		logger.info("Ending of clickOnBattles method");
	}

	public void clickOnBackIcon() {
		logger.info("Starting of clickOnBackIcon method");

		clickOnElement(btnBackIcon);

		logger.info("Ending of clickOnBackIcon method");
	}

	public void clickOnCreateNewBattle() {
		logger.info("Starting of clickOnCreateNewBattle method");

		clickOnElement(btnCreateBattle);

		logger.info("Ending of clickOnCreateNewBattle method");
	}

	public void clickOnApplyButton() {
		logger.info("Starting of clickOnApplyButton method");

		clickOnElement(btnApply);

		logger.info("Ending of clickOnApplyButton method");
	}

	public void clickOnCancel() {
		logger.info("Starting of clickOnCancel method");

		clickOnElement(btnCancel);

		logger.info("Ending of clickOnCancel method");
	}

	public void clickOnDoneButton() {
		logger.info("Starting of clickOnDoneButton method");

		clickOnElement(btnDone);

		logger.info("Ending of clickOnDoneButton method");
	}

	public String getSelectGameText() {
		logger.info("Starting of getSelectGameText method");

		logger.info("Ending of getSelectGameText method");

		return getText(txtSelectGame);
	}

	public String getAquaBubbleShooterText() {
		logger.info("Starting of getAquaBubbleShooterText method");

		logger.info("Ending of getAquaBubbleShooterText method");

		return getText(btnBubbleShooter);
	}

	public void clickOnSelectedGame() {
		logger.info("Starting of clickOnSelectedGame method");

		clickOnElement(btnBubbleShooter);

		logger.info("Ending of clickOnSelectedGame method");
	}

	public String getBattlesText() {
		logger.info("Starting of getBattlesText method");

		logger.info("Ending of getTextSelectOpponent method");

		return getText(btnBattle);
	}

	public void setOpponentUser(String name) {
		logger.info("Starting of setOpponentUser method");

		clear(txtOpponent);

		clickOnElement(txtOpponent);

		sendKeys(txtOpponent, name);

		driver.hideKeyboard();

		logger.info("Ending of setOpponentUser method");
	}

	public String getOpponentUserText() {
		logger.info("Starting of getOpponentUserText method");

		logger.info("Ending of getOpponentUserText method");

		return getText(getOpponent);
	}

	public void clickOnChallengeButton() {
		logger.info("Starting of clickOnChallengeButton method");

		clickOnElement(btnChallenge);

		logger.info("Ending of clickOnChallengeButton method");
	}

	public String getPlayChallengeText() {
		logger.info("Starting of getPlayChallengeText method");

		logger.info("Ending of getPlayChallengeText method");

		return getText(txtPlayChallenge);
	}

	public void clickOnBonusCashRadioButton() {
		logger.info("Starting of clickOnBonusCashRadioButton method");

		clickOnElement(btnBonusCash);

		logger.info("Ending of clickOnBonusCashRadioButton method");
	}

	public void clickOnAddSelectedBonusCash() {
		logger.info("Starting of clickOnAddSelectedBonusCash method");

		List<WebElement> addMoney = driver.findElements(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/androidx.viewpager.widget.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[1]"));
		try {
			for (int i = 0; i < addMoney.size(); i++) {

				explicitWait(addMoney.get(i));
				clickOnElement(addMoney.get(i));
			}
		} catch (Exception e) {
			clickOnElement(btnTwintyFive);
		}

		logger.info("Ending of clickOnAddSelectedBonusCash method");
	}

	public void clickOnBonusCash() {
		logger.info("Starting of clickOnBonusCash method");

		clickOnElement(btnTwintyFive);

		logger.info("Ending of clickOnChallengeButton method");
	}

	public String getEnteredCashText() {
		logger.info("Starting of getEnteredCashText method");

		logger.info("Ending of getEnteredCashText method");

		return getText(txtAmount);
	}

	public void clickOnCashRadioButton() {
		logger.info("Starting of clickOnCashRadioButton method");

		clickOnElement(btnCash);

		logger.info("Ending of clickOnCashRadioButton method");
	}

	public void setChallengeAmount(String cash) {
		logger.info("Starting of setChallengeAmount method");

		clear(txtAmount);
		clickOnElement(txtAmount);
		sendKeys(txtAmount, cash);
		driver.hideKeyboard();

		logger.info("Ending of setChallengeAmount method");
	}

	public void clickOnAddSelectedCash() {
		logger.info("Starting of clickOnAddSelectedCash method");

		List<WebElement> addMoney = driver.findElements(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/androidx.viewpager.widget.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[1]"));
		try {
			for (int i = 0; i < addMoney.size(); i++) {

				explicitWait(addMoney.get(i));
				clickOnElement(addMoney.get(i));
			}
		} catch (Exception e) {
			clickOnElement(btnTwoRupees);
		}

		logger.info("Ending of clickOnAddSelectedCash method");
	}

	public void clickOnRemindButton() {
		logger.info("Starting of clickOnRemindButton method");

		clickOnElement(btnRemind);

		logger.info("Ending of clickOnRemindButton method");
	}

	public String getTextGameChallengeTime() {
		logger.info("Starting of getTextGameChallengeTime method");

		logger.info("Ending of getTextGameChallengeTime method");

		return getText(txtGameTime);
	}

	public void clickOnNextButton() {
		logger.info("Starting of clickOnNextButton method");

		clickOnElement(btnNext);

		logger.info("Ending of clickOnNextButton method");
	}

	public void clickOnSelectedDate() {
		logger.info("Starting of clickOnSelectedDate method");

		clickOnElement(btnDateFifteen);

		logger.info("Ending of clickOnSelectedDate method");
	}

	public void clickOnOkButton() {
		logger.info("Starting of clickOnOkButton method");

		clickOnElement(btnOk);

		logger.info("Ending of clickOnOkButton method");
	}

	public void scrollToCustomBattles() throws InterruptedException {
		logger.info("Starting of scrollToCustomBattles method");

		androidScrollUsingText("Custom Battles");

		logger.info("Ending of scrollToCustomBattles method");
	}

	public void clickOnRejectButton() throws InterruptedException {
		logger.info("Starting of clickOnRejectButton method");

		clickOnElement(btnReject);

		logger.info("Ending of clickOnRejectButton method");
	}

	public void clickOnYesButton() throws InterruptedException {
		logger.info("Starting of clickOnYesButton method");

		clickOnElement(btnYes);

		logger.info("Ending of clickOnYesButton method");
	}

	public String getChallengedGameText() {
		logger.info("Starting of getChallengedGameText method");

		logger.info("Ending of getChallengedGameText method");

		return getText(verifyGameName);
	}

	public String getTextChallengedEntryFee() {
		logger.info("Starting of getTextChallengedEntryFee method");

		logger.info("Ending of getTextChallengedEntryFee method");

		return getText(getEntryFeeText);
	}

	public String getTextChallengerName() {
		logger.info("Starting of getTextChallengerName method");

		logger.info("Ending of getTextChallengerName method");

		return getText(getOpponentName);
	}
}