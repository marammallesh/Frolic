package frolic_prod.achievement.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @author b2btesters
*/

public class FrolicAchievementPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app:id/profileMenu")
	private WebElement btnMenu;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Achievements']")
	private WebElement btnAchievements;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout")
	private WebElement btnFollower;

	@FindBy(id = "live.frolic.app:id/tv_rewards")
	private WebElement btnRewards;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Raise Ticket']")
	private WebElement btnRaiseTicket;

	@FindBy(id = "live.frolic.app:id/ed_email")
	private WebElement txtEmailId;

	@FindBy(id = "live.frolic.app:id/ed_comment")
	private WebElement txtQuery;

	@FindBy(id = "live.frolic.app:id/search")
	private WebElement btnSearchTab;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Search']")
	private WebElement lblGetSearch;

	@FindBy(id = "live.frolic.app:id/btn_add_attachment")
	private WebElement btnAttachment;

	@FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
	private WebElement btnAddAttachmentOne;

	@FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView")
	private WebElement btnAddAttachmentBonusCash;

	@FindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
	private WebElement btnAddAttachmentTwo;

	@FindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
	private WebElement btnAddAttachmentThree;

	@FindBy(id = "live.frolic.app:id/btn_create_ticket")
	private WebElement btnRaiseTicketButton;

	@FindBy(xpath = "//android.widget.CheckedTextView[@text = 'Weekly']")
	private WebElement lblWeekly;

	@FindBy(id = "live.frolic.app:id/swipe_layout")
	private WebElement btnWallet;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private WebElement txtGetWallet;

	@FindBy(id = "live.frolic.app:id/iv_icon_chat")
	private WebElement btnChatWithUs;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Type a message']")
	private WebElement txtChatMessage;

	@FindBy(id = "live.frolic.app:id/freshchat_conv_detail_send_reply_button")
	private WebElement btnSendMessage;

	@FindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement tabBonusCash;

	@FindBy(id = "live.frolic.app:id/raise_ticket")
	private WebElement btnBonusCashRaiseTicket;

	@FindBy(id = "live.frolic.app:id/ed_email")
	private WebElement txtBonusCashEmailId;

	@FindBy(id = "live.frolic.app:id/ed_comment")
	private WebElement txtBonusCashQuery;

	@FindBy(id = "live.frolic.app:id/btn_create_ticket")
	private WebElement btnBonusCashRaiseTicketButton;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Wallet']")
	private WebElement btnBonusCashWallet;

	@FindBy(id = "live.frolic.app:id/tv_chat")
	private WebElement btnBonusCashChatWithUs;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Type a message']")
	private WebElement txtBonusCashChatMessage;

	@FindBy(id = "live.frolic.app:id/tv_journey")
	private WebElement btnViewJourney;

	@FindBy(id = "live.frolic.app:id/btn_back")
	private WebElement iconBack;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.viewpager.widget.ViewPager[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat[1]")
	private WebElement btnRewardHistoryListOption;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Copper - I']")
	private WebElement btnCopperOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Iron - III']")
	private WebElement btnIronThree;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Iron - II']")
	private WebElement btnIronTwo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Iron - I']")
	private WebElement btnIronOne;

	@FindBy(id = "live.frolic.app:id/tv_learn_more")
	private WebElement btnLearnMore;

	@FindBy(xpath = "//android.widget.TextView[@text = 'All']")
	private WebElement btnLearnMoreAll;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Social']")
	private WebElement btnLearnMoreSocial;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Gaming']")
	private WebElement btnLearnMoreGaming;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Other']")
	private WebElement btnLearnMoreOther;

	@FindBy(xpath = "//android.widget.TextView[@text = 'My Badges']")
	private WebElement btnMyBadges;

	@FindBy(id = "live.frolic.app:id/tv_earn")
	private WebElement btnEarnMoreXP;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Bronze - I']")
	private WebElement btnBronzeOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Silver - I']")
	private WebElement btnSilverOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Gold - I']")
	private WebElement btnGoldOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Platinum - I']")
	private WebElement btnPlatinumOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Diamond - I']")
	private WebElement btnDiamondOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Immortal - I']")
	private WebElement btnImmortalOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Radiant - I']")
	private WebElement btnRadiantOne;

	@FindBy(id = "live.frolic.app:id/tv_get_otp")
	private WebElement btnGetOtpButton;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[1]/android.widget.EditText")
	private WebElement txtOtp;

	@FindBy(id = "live.frolic.app:id/tv_verify")
	private WebElement btnVerifyButton;

	@FindBy(id = "live.frolic.app:id/tv_weekly")
	private WebElement btnWeeklyTab;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.FrameLayout")
	private WebElement btnWeeklyOption;

	@FindBy(id = "live.frolic.app:id/tv_claim")
	private WebElement btnClaimReward;

	@FindBy(id = "live.frolic.app:id/tv_claim")
	private WebElement btnParticipate;

	@FindBy(id = "live.frolic.app:id/tv_history")
	private WebElement btnHistoryTab;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Achievements']")
	private WebElement lblAchievements;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Transaction']")
	private WebElement lblTransaction;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Transaction Details']")
	private WebElement lblTransactionDetails;

	@FindBy(id = "live.frolic.app:id/tv_transaction_message")
	private WebElement lblAddedSuccessMessage;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Contact Support']")
	private WebElement lblContactSupport;

	@FindBy(id = "live.frolic.app:id/tv_toolbar_title")
	private WebElement lblMyTicket;

	@FindBy(id = "live.frolic.app:id/tv_subject")
	private WebElement lblTicketDetails;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Chat with us']")
	private WebElement lblChatWithUs;

	@FindBy(id = "live.frolic.app:id/tv_app_name")
	private WebElement lblRewardHistory;

	@FindBy(id = "live.frolic.app:id/tv_app_name")
	private WebElement lblRewardJourney;

	@FindBy(xpath = "//android.widget.TextView[@text = 'XP Details']")
	private WebElement lblXpDetails;

	@FindBy(xpath = "//android.widget.TextView[@text = 'My Badges']")
	private WebElement lblMyBadges;

	@FindBy(xpath = "//android.widget.TextView[@text = 'How to earn more XP?']")
	private WebElement lblEarnMoreXP;

	@FindBy(id = "live.frolic.app:id/tv_recommended")
	private WebElement lblRecommended;

	@FindBy(xpath = "//android.widget.TextView[@text = 'EarnXPCampaign']")
	private WebElement lblEarnXPCampaign;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement btnFileAllow;

	@FindBy(xpath = "//android.widget.Button[@text = 'ALLOW']")
	private WebElement lblFileAllow;

	@FindBy(id = "com.android.permissioncontroller:id/permission_message")
	private WebElement lblFileAllowAcessMessage;

	@FindBy(xpath = "//android.widget.TextView[@text = 'hello this is testing']")
	private WebElement lblWalletMessage;

	@FindBy(id = "live.frolic.app:id/tv_dismiss")
	private WebElement btnDismiss;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Achievements']")
	private WebElement lblAchievement;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Play Practice Game']")
	private WebElement lblPracticeGame;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Follower']")
	private WebElement lblFollower;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Referral']")
	private WebElement lblReferral;

	@FindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[@text = 'Explore More']")
	private WebElement btnLearnWeeklyMore;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Participate']")
	private WebElement txtParticipate;

	@FindBy(xpath = "//android.widget.TextView[@text = 'No Daily Task']")
	private WebElement txtNoDailytask;

	@FindBy(xpath = "//android.view.ViewGroup[2]")
	private WebElement btnBonusCashOption;

	@FindBy(xpath = "//android.view.ViewGroup[1]")
	private WebElement btnCashOption;

	@FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.TextView")
	private WebElement txtCash;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	private WebElement txtStatus;

	private static final Logger logger = Logger.getLogger(FrolicAchievementPage.class.getName());

	public FrolicAchievementPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of FrolicLoginPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicLoginPage method");
	}

	public void clickOnMenu() {
		logger.info("Starting of clickOnMenu method");

		clickOnElement(btnMenu);

		logger.info("Ending of clickOnMenu method");
	}

	public void clickOnCashTransition() {
		logger.info("Starting of clickOnCashTransition method");

		clickOnElement(btnCashOption);

		logger.info("Ending of clickOnCashTransition method");
	}

	public void clickOnBonusOption() {
		logger.info("Starting of clickOnBonusOption method");

		clickOnElement(btnBonusCashOption);

		logger.info("Ending of clickOnBonusOption method");
	}

	public String getParticipateText() {
		logger.info("starting of getParticipateText method");

		logger.info("Ending of getParticipateText Method");

		return getText(txtParticipate);
	}

	public String getStatuText() {
		logger.info("starting of getStatuText method");

		logger.info("Ending of getStatuText Method");

		return getText(txtStatus);
	}

	public String getCashText() {
		logger.info("starting of getCashText method");

		logger.info("Ending of getCashText Method");

		return getText(txtCash);
	}

	public String getWeeklyLabelText() {

		logger.info("Starting of getWeeklyLabelText method");

		logger.info("Ending of getWeeklyLabelText method");

		return getText(lblWeekly);
	}

	public void clickOnSearchTab() {
		logger.info("Starting of clickOnSearchTab method");

		clickOnElement(btnSearchTab);

		logger.info("Ending of clickOnSearchTab method");

	}

	public void clickOnWeeklyExploreMore() {
		logger.info("Starting of clickOnWeeklyLearnMore method");

		clickOnElement(btnLearnWeeklyMore);

		logger.info("Ending of clickOnWeeklyLearnMore method");
	}

	public void clickOnAchievement() {
		logger.info("Starting of clickOnAchievement method");

		clickOnElement(btnAchievements);

		logger.info("Ending of clickOnAchievement method");
	}

	public void clickOnFollower() {
		logger.info("Starting of clickOnFollower method");

		clickOnElement(btnFollower);

		logger.info("Ending of clickOnFollower method");

	}

	public void clickOnRewards() {
		logger.info("Starting of clickOnRewards method");

		clickOnElement(btnRewards);

		logger.info("Ending of clickOnRewards method");

	}

	public void clickOnCashTab() {
		logger.info("Starting of clickOnCashTab method");

		clickOnElement(txtCash);

		logger.info("Ending of clickOnCashTab method");

	}

	public void clickOnRaiseTicket() {
		logger.info("Starting of clickOnRaiseTicket method");

		clickOnElement(btnRaiseTicket);

		logger.info("Ending of clickOnRaiseTicket method");
	}

	public void enterEmailId(String str) {
		logger.info("Starting of enterEmailId method");

		clear(txtEmailId);

		clickOnElement(txtEmailId);

		sendKeys(txtEmailId, str);

		driver.hideKeyboard();

		logger.info("Ending of enterEmailId method");
	}

	public void enterQuery(String str) {
		logger.info("Starting of enterQuery method");

		clear(txtQuery);

		clickOnElement(txtQuery);

		sendKeys(txtQuery, str);

		driver.hideKeyboard();

		logger.info("Ending of enterQuery method");
	}

	public void clickOnRaiseTicketButton() {
		logger.info("Starting of clickOnRaiseTicketButton method");

		clickOnElement(btnRaiseTicketButton);

		logger.info("Ending of clickOnRaiseTicketButton method");
	}

	public String getWalletText() {
		logger.info("Starting of getWalletText method");

		logger.info("Ending of getWalletText method");

		return getText(txtGetWallet);
	}

	public void clickOnWallet() {
		logger.info("Starting of clickOnWallet method");

		clickOnElement(btnWallet);

		logger.info("Ending of clickOnWallet method");
	}

	public void clickOnChatWithUs() {
		logger.info("Starting of clickOnChatWithUs method");

		clickOnElement(btnChatWithUs);

		logger.info("Ending of clickOnChatWithUs method");
	}

	public void enterChatMessage(String str) {
		logger.info("Starting of enterChatMessage method");

		clear(txtChatMessage);
		clickOnElement(txtChatMessage);
		sendKeys(txtChatMessage, str);
		driver.hideKeyboard();

		logger.info("Ending of enterChatMessage method");
	}

	public void clickOnCash() {
		logger.info("Starting of clickOnCash method");

		clickOnElement(txtCash);

		logger.info("Ending of clickOnCash method");
	}

	public void clickOnBonusCash() {
		logger.info("Starting of clickOnBonusCash method");

		clickOnElement(tabBonusCash);

		logger.info("Ending of clickOnBonusCash method");
	}

	public void clickOnBonusCashTab() {
		logger.info("Starting of clickOnBonusCashTab method");

		clickOnElement(btnBonusCashOption);

		logger.info("Ending of clickOnBonusCashTab method");
	}

	public void clickOnBonusCashRaiseTicket() {
		logger.info("Starting of clickOnBonusCashRaiseTicekt method");

		clickOnElement(btnBonusCashRaiseTicket);

		logger.info("Ending of clickOnBonusCashRaiseTicekt method");

	}

	public void enterBonusCashEmailId(String str) {
		logger.info("Starting of enterBonusCashEmailId method");

		clear(txtBonusCashEmailId);

		clickOnElement(txtBonusCashEmailId);

		sendKeys(txtBonusCashEmailId, str);

		driver.hideKeyboard();

		logger.info("Ending of enterBonusCashEmailId method");
	}

	public void enterBonusCashQuery(String str) {
		logger.info("Starting of enterBonusCashQuery method");

		this.explicitWait(txtBonusCashQuery);

		clear(txtBonusCashQuery);

		clickOnElement(txtBonusCashQuery);

		sendKeys(txtBonusCashQuery, str);

		driver.hideKeyboard();

		logger.info("Ending of enterBonusCashQuery method");
	}

	public void clickOnBonusCashRaiseTicektButton() {
		logger.info("Starting of clickOnBonusCashRaiseTicektButton method");

		clickOnElement(btnBonusCashRaiseTicketButton);

		logger.info("Ending of clickOnBonusCashRaiseTicektButton method");
	}

	public void clickOnBonusCashWallet() {
		logger.info("Starting of clickOnBonusCashWallet method");

		clickOnElement(btnBonusCashWallet);

		logger.info("Ending of clickOnBonusCashWallet method");
	}

	public void clickOnBonusCashChatWithUs() {
		logger.info("Starting of clickOnBonusCashChatWithUs method");

		clickOnElement(btnBonusCashChatWithUs);

		logger.info("Ending of clickOnBonusCashChatWithUs method");
	}

	public void enterBonusCashChatMessage(String str) {
		logger.info("Starting of enterBonusCashChatMessage method");

		clear(txtBonusCashChatMessage);
		clickOnElement(txtBonusCashChatMessage);
		sendKeys(txtBonusCashChatMessage, str);
		driver.hideKeyboard();

		logger.info("Ending of enterBonusCashChatMessage method");
	}

	public void clickOnViewJourney() {
		logger.info("Starting of clickOnViewJourney method");

		clickOnElement(btnViewJourney);

		logger.info("Ending of clickOnViewJourney method");
	}

	public void clickOnRewardHistoryListOption() {
		logger.info("Starting of clickOnRewardHistoryListOption method");

		clickOnElement(btnRewardHistoryListOption);

		logger.info("Ending of clickOnRewardHistoryListOption method");
	}

	public void clickOnCopperOne() {
		logger.info("Starting of clickOnCopperI method");

		clickOnElement(btnCopperOne);

		logger.info("Ending of clickOnCopperI method");
	}

	public void clickOnIronThree() {
		logger.info("Starting of clickOnIronThree method");

		clickOnElement(btnIronThree);

		logger.info("Ending of clickOnIronThree method");
	}

	public void clickOnIronTwo() {
		logger.info("Starting of clickOnIronTwo method");

		clickOnElement(btnIronTwo);

		logger.info("Ending of clickOnIronTwo method");
	}

	public void clickOnIronOne() {
		logger.info("Starting of clickOnIronOne method");

		clickOnElement(btnIronOne);

		logger.info("Ending of clickOnIronOne method");
	}

	public void clickOnLearnMore() {
		logger.info("Starting of clickOnLearnMore method");

		this.scrollUsingText("Learn More");

		clickOnElement(btnLearnMore);

		logger.info("Ending of clickOnLearnMore method");
	}

	public void clickOnLearnMoreAll() {
		logger.info("Starting of clickOnLearnMoreAll method");

		clickOnElement(btnLearnMoreAll);

		logger.info("Ending of clickOnLearnMoreAll method");
	}

	public void clickOnLearnMoreSocial() {
		logger.info("Starting of clickOnLearnMoreSocial method");

		clickOnElement(btnLearnMoreSocial);

		logger.info("Ending of clickOnLearnMoreSocial method");
	}

	public void clickOnLearnMoreGaming() {
		logger.info("Starting of clickOnLearnMoreGaming method");

		clickOnElement(btnLearnMoreGaming);

		logger.info("Ending of clickOnLearnMoreGaming method");
	}

	public void clickOnLearnMoreOther() {
		logger.info("Starting of clickOnLearnMoreOther method");

		clickOnElement(btnLearnMoreOther);

		logger.info("Ending of clickOnLearnMoreOther method");
	}

	public String getMyBadgesText() {
		logger.info("Starting of getMyBadgesText method");

		logger.info("Ending of getMyBadgesText method");

		return getText(btnMyBadges);
	}

	public String getNoDailytaskText() {
		logger.info("Starting of getNoDailytaskText method");

		logger.info("Ending of getNoDailytaskText method");

		return getText(txtNoDailytask);
	}

	public void clickOnMyBadges() {
		logger.info("Starting of clickOnMyBadges method");

		clickOnElement(btnMyBadges);

		logger.info("Ending of clickOnMyBadges method");
	}

	public void clickOnEarnMoreXP() {
		logger.info("Starting of clickOnEarnMoreXP method");

		clickOnElement(btnEarnMoreXP);

		logger.info("Ending of clickOnEarnMoreXP method");
	}

	public void clickOnBronzeOne() {
		logger.info("Starting of clickOnBronzeOne method");

		clickOnElement(btnBronzeOne);

		logger.info("Ending of clickOnBronzeOne method");
	}

	public void clickOnSilverOne() {
		logger.info("Starting of clickOnSilverOne method");

		clickOnElement(btnSilverOne);

		logger.info("Ending of clickOnSilverOne method");
	}

	public void clickOnGoldOne() throws InterruptedException {
		logger.info("Starting of clickOnGoldOne method");

		this.verticalScrollDown();

		clickOnElement(btnGoldOne);

		logger.info("Ending of clickOnGoldOne method");
	}

	public void clickOnPlatinumOne() throws InterruptedException {
		logger.info("Starting of clickOnPlatinumOne method");

		this.verticalScrollDown();

		clickOnElement(btnPlatinumOne);

		logger.info("Ending of clickOnPlatinumOne method");
	}

	public void clickOnDiamondOne() throws InterruptedException {
		logger.info("Starting of clickOnDiamondOne method");

		this.verticalScrollDown();

		clickOnElement(btnDiamondOne);

		logger.info("Ending of clickOnDiamondOne method");
	}

	public void clickOnImmortalOne() throws InterruptedException {
		logger.info("Starting of clickOnImmortalOne method");

		this.verticalScrollDown();

		clickOnElement(btnImmortalOne);

		logger.info("Ending of clickOnImmortalOne method");
	}

	public void clickOnRadiantOne() throws InterruptedException {
		logger.info("Starting of clickOnRadiantOne method");

		this.verticalScrollDown();

		clickOnElement(btnRadiantOne);

		logger.info("Ending of clickOnRadiantOne method");
	}

	public void clickOnOtpButton() {
		logger.info("Starting of clickOnOtpButton method");

		clickOnElement(btnGetOtpButton);

		logger.info("Ending of clickOnOtpButton method");
	}

	public void enterOtpNumber(String str) {
		logger.info("Starting of enterOtpNumber method");

		clear(txtOtp);
		clickOnElement(txtOtp);
		sendKeys(txtOtp, str);
		driver.hideKeyboard();

		logger.info("Ending of enterOtpNumber method");
	}

	public void clickOnVerifyButton() {
		logger.info("Starting of clickOnVerifyButton method");

		clickOnElement(btnVerifyButton);

		logger.info("Ending of clickOnVerifyButton method");
	}

	public void clickOnAttachment() {
		logger.info("Starting of clickOnAttachment method");

		clickOnElement(btnAttachment);

		logger.info("Ending of clickOnAttachment method");
	}

	public void clickOnAddAttachmentOne() {
		logger.info("Starting of clickOnAddAttachmentOne method");

		clickOnElement(btnAddAttachmentOne);

		logger.info("Ending of clickOnAddAttachmentOne method");
	}

	public void clickOnAddAttachmentTwo() {
		logger.info("Starting of clickOnAddAttachmentTwo method");

		clickOnElement(btnAddAttachmentTwo);

		logger.info("Ending of clickOnAddAttachmentTwo method");
	}

	public void clickOnAddAttachmentThree() {
		logger.info("Starting of clickOnAddAttachmentThree method");

		clickOnElement(btnAddAttachmentThree);

		logger.info("Ending of clickOnAddAttachmentThree method");
	}

	public void clickOnChatSendButton() {
		logger.info("Starting of clickOnChatSendButton method");

		clickOnElement(btnSendMessage);

		logger.info("Ending of clickOnChatSendButton method");
	}

	public void clickOnWeeklyTab() {
		logger.info("Starting of clickOnWeeklyTab method");

		clickOnElement(btnWeeklyTab);

		logger.info("Ending of clickOnWeeklyTab method");
	}

	public void clickOnWeeklyOption() {
		logger.info("Starting of clickOnWeeklyOption method");

		clickOnElement(btnWeeklyOption);

		logger.info("Ending of clickOnWeeklyOption method");
	}

	public void clickOnClaimReward() {
		logger.info("Starting of clickOnClaimReward method");

		clickOnElement(btnClaimReward);

		logger.info("Ending of clickOnClaimReward method");
	}

	public void clickOnParticipate() {
		logger.info("Starting of clickOnParticipate method");

		clickOnElement(btnParticipate);

		logger.info("Ending of clickOnParticipate method");
	}

	public void clickOnHistoryTab() {
		logger.info("Starting of clickOnHistoryTab method");

		clickOnElement(btnHistoryTab);

		logger.info("Ending of clickOnHistoryTab method");
	}

	public void clickOnFileAllow() {
		logger.info("Starting of clickOnFileAllow method");

		clickOnElement(btnFileAllow);

		logger.info("Ending of clickOnFileAllow method");
	}

	public void clickOnDismiss() {
		logger.info("Starting of clickOnDismiss method");

		clickOnElement(btnDismiss);

		logger.info("Ending of clickOnDismiss method");
	}

	public String getAchievementsLabel() {
		logger.info("Starting of getAchievementsLabel method");

		logger.info("Ending of getAchievementsLabel method");

		return getText(lblAchievements);
	}

	public String getTransactionLabel() {
		logger.info("Starting of getTransactionLabel method");

		logger.info("Ending of getTransactionLabel method");

		return getText(lblTransaction);
	}

	public String getCashLabel() {
		logger.info("Starting of getCashLabel method");

		logger.info("Ending of getCashLabel method");

		return getText(txtCash);
	}

	public String getBonusCashLabel() {
		logger.info("Starting of getBonusCashLabel method");

		logger.info("Ending of getBonusCashLabel method");

		return getText(tabBonusCash);
	}

	public String getTransactionDetailsLabel() {
		logger.info("Starting of getTransactionDetailsLabel method");

		logger.info("Ending of getTransactionDetailsLabel method");

		return getText(lblTransactionDetails);
	}

	public String getSuccessMessageLabel() {
		logger.info("Starting of getSuccessMessageLabel method");

		logger.info("Ending of getSuccessMessageLabel method");

		return getText(lblAddedSuccessMessage);
	}

	public String getContactSupportLabel() {
		logger.info("Starting of getContactSupportLabel method");

		logger.info("Ending of getContactSupportLabel method");

		return getText(lblContactSupport);
	}

	public String getMyTicketLabel() {
		logger.info("Starting of getMyTicketLabel method");

		logger.info("Ending of getMyTicketLabel method");

		return getText(lblMyTicket);
	}

	public String getMyTicketQueryLabel() {
		logger.info("Starting of getMyTicketQueryLabel method");

		logger.info("Ending of getMyTicketQueryLabel method");

		return getText(btnBonusCashWallet);
	}

	public String getTicketDetailsLabel() {
		logger.info("Starting of getTicketDetailsLabel method");

		logger.info("Ending of getTicketDetailsLabel method");

		return getText(lblTicketDetails);
	}

	public String getChatWithUsLabel() {
		logger.info("Starting of getChatWithUsLabel method");

		logger.info("Ending of getChatWithUsLabel method");

		return getText(lblChatWithUs);
	}

	public String getRewardHistoryLabel() {
		logger.info("Starting of getRewardHistoryLabel method");

		logger.info("Ending of getRewardHistoryLabel method");

		return getText(lblRewardHistory);
	}

	public String getRewardJourneyLabel() {
		logger.info("Starting of getRewardJourneyLabel method");

		logger.info("Ending of getRewardJourneyLabel method");

		return getText(lblRewardJourney);
	}

	public String getXpDetailsLabel() {
		logger.info("Starting of getXPDetailsLabel method");

		logger.info("Ending of getXPDetailsLabel method");

		return getText(lblXpDetails);
	}

	public String getMyBadgesLabel() {
		logger.info("Starting of getMyBadgesLabel method");

		logger.info("Ending of getMyBadgesLabel method");

		return getText(lblMyBadges);
	}

	public String getEarnMoreXPLabel() {
		logger.info("Starting of getEarnMoreXPLabel method");

		logger.info("Ending of getEarnMoreXPLabel method");

		return getText(lblEarnMoreXP);
	}

	public String getRecommendedLabel() {
		logger.info("Starting of getRecommendedLabel method");

		logger.info("Ending of getRecommendedLabel method");

		return getText(lblRecommended);
	}

	public String getFileAllowLabel() {
		logger.info("Starting of getFileAllowLabel method");

		logger.info("Ending of getFileAllowLabel method");

		return getText(lblFileAllow);
	}

	public String getFileAllowAccessMessageLabel() {
		logger.info("Starting of getFileAllowAccessMessageLabel method");

		logger.info("Ending of getFileAllowAccessMessageLabel method");

		return getText(lblFileAllowAcessMessage);
	}

	public String getWalletMessageLabel() {
		logger.info("Starting of getWalletMessageLabel method");

		logger.info("Ending of getWalletMessageLabel method");

		return getText(lblWalletMessage);
	}

	public String getAchievementLabel() {
		logger.info("Starting of getAchievementLabel method");

		logger.info("Ending of getAchievementLabel method");

		return getText(btnAchievements);
	}

	public String getSearchLabel() {
		logger.info("Starting of getSearchLabel method");

		logger.info("Ending of getSearchLabel method");

		return getText(lblGetSearch);
	}

	public String getPlayPracticeGameLabel() {
		logger.info("Starting of getPlayPracticeGameLabel method");

		logger.info("Ending of getPlayPracticeGameLabel method");

		return getText(lblPracticeGame);
	}

	public String getFollowerLabel() {
		logger.info("Starting of getFollowerLabel method");

		logger.info("Ending of getFollowerLabel method");

		return getText(lblFollower);
	}

	public String getReferralLabel() {
		logger.info("Starting of getReferralLabel method");

		logger.info("Ending of getReferralLabel method");

		return getText(lblReferral);
	}

	public boolean checkNoDailyTaskText() {
		logger.info("Starting of checkNoDailyTaskText method");

		this.implicitWait();

		logger.info("Starting of checkNoDailyTaskText method");

		return driver.getPageSource().contains("No Daily Task");
	}

	public void redirectToRewards() {
		logger.info("Starting of redirectToCashTab method");

		int i = 1;
		while (i <= 6) {
			try {
				if (btnRewards.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			this.hardback();
			i++;
		}

		logger.info("Ending of redirectToCashTab method");
	}

	public void redirectToAchivementLabel() {
		logger.info("Starting of redirectToAchivementLabel method");

		int i = 1;
		while (i <= 6) {
			try {
				if (lblAchievements.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			this.hardback();
			i++;
		}

		logger.info("Ending of redirectToAchivementLabel method");
	}

}
