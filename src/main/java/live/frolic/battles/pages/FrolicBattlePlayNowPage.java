package live.frolic.battles.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;

public class FrolicBattlePlayNowPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app.debug:id/search")
	private WebElement btnSearch;

	@FindBy(id = "live.frolic.app.debug:id/ed_search")
	private WebElement btnSearchField;

	@FindBy(id = "live.frolic.app.debug:id/tv_game_name")
	private WebElement imgFruitDart;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Play Free']")
	private WebElement btnPlayFree;

	@FindBy(id = "live.frolic.app.debug:id/sw_rns")
	private WebElement lblRecordAndShare;

	@FindBy(id = "live.frolic.app.debug:id/sw_go_live")
	private WebElement lblLive;

	@FindBy(id = "live.frolic.app.debug:id/sw_video_call")
	private WebElement lblVideoChat;

	@FindBy(id = "live.frolic.app.debug:id/tv_go_live")
	private WebElement lblLiveStream;

	@FindBy(id = "live.frolic.app.debug:id/btn_add_money")
	private WebElement btnStartGame;

	@FindBy(id = "live.frolic.app.debug:id/iv_opponent_user")
	private WebElement imgOpponent;

	@FindBy(id = "live.frolic.app.debug:id/tv_starting")
	private WebElement txtStarting;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Record and Share']")
	private WebElement txtRecordAndShare;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Video Chat']")
	private WebElement txtVideochat;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Livestream']")
	private WebElement txtLiveStream;

	//@FindBy(id = "live.frolic.app.debug:id/tv_tab2")
	@FindBy(xpath = "//android.widget.TextView[@text='SEARCH']")
	private WebElement txtSearch;

	@FindBy(id = "live.frolic.app.debug:id/tv_title_name")
	private WebElement txtGameCard;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement btnAllowPermission;

	private static final Logger logger = Logger.getLogger(FrolicBattlePlayNowPage.class.getName());

	public FrolicBattlePlayNowPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of BattlesPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of BattlesPage method");
	}

	public String getSearchText() {

		logger.info("Starting of getSearchText method");

		logger.info("Ending of getSearchText method");

		return getText(txtSearch);
	}

	public String getGameNameText() {

		logger.info("Starting of getGameNameText method");

		logger.info("Ending of getGameNameText method");

		return getText(txtGameCard);
	}

	public String getStartingInText() {

		logger.info("Starting of getStartingInText method");

		logger.info("Ending of getStartingInText method");

		return getText(txtStarting);
	}

	public void clickOnSearchTab() {
		logger.info("Starting of clickOnSearchTab method");

		clickOnElement(btnSearch);

		logger.info("Ending of clickOnSearchTab method");
	}

	public void clickOnSearch(String Fruit) {
		logger.info("Starting of clickOnSearchFeild method");

		clickOnElement(btnSearchField);

		this.btnSearchField.sendKeys(Fruit);

		logger.info("Ending of clickOnSearchFeild method");
	}

	public void clickOnGameCard() {
		logger.info("Starting of clickOnGameCard method");

		clickOnElement(imgFruitDart);

		logger.info("Ending of clickOnGameCard method");
	}

	public void clickOnPlayFreeButton() {
		logger.info("Starting of clickOnPlayFreeButton method");

		this.explicitWait(btnPlayFree);

		clickOnElement(btnPlayFree);

		logger.info("Ending of clickOnPlayFreeButton method");
	}

	public void clickOnRecordButton() {
		logger.info("Starting of clickOnRecordButton method");

		clickOnElement(lblRecordAndShare);

		logger.info("Ending of clickOnRecordButton method");
	}

	public String getRecordAndShareText() {
		logger.info("Starting of getRecordAndShareText method");

		logger.info("Ending of getRecordAndShareText method");

		return getText(txtRecordAndShare);
	}

	public String getVideoChatText() {
		logger.info("Starting of getTextVideoChat method");

		logger.info("Ending of getTextVideoChat method");

		return getText(txtVideochat);
	}

	public String getLiveStreamText() {
		logger.info("Starting of getLiveStreamText method");

		logger.info("Ending of getLiveStreamText method");

		return getText(txtLiveStream);
	}

	public void clickOnLiveButton() {
		logger.info("Starting of clickOnLiveButton method");

		clickOnElement(lblLive);

		logger.info("Ending of clickOnLiveButton method");
	}

	public void clickOnVideoButton() {
		logger.info("Starting of clickOnVideoButton method");

		clickOnElement(lblVideoChat);

		logger.info("Ending of clickOnVideoButton method");
	}

	public void clickOnStartGame() {
		logger.info("Starting of clickOnStartGame method");

		clickOnElement(btnStartGame);

		logger.info("Ending of clickOnStartGame method");
	}

	public void getOpponentImg() {
		logger.info("Starting of getOpponentImg method");

		this.explicitWait(imgOpponent);

		logger.info("Ending of getOpponentImg method");
	}

	public boolean checkAllowAccessText() {
		logger.info("Starting of checkAllowAccessText method");

		this.explicitWait(btnAllowPermission);

		logger.info("Ending of checkAllowAccessText method");

		return driver.getPageSource().contains("Available Coupons");
	}

	public boolean checkVideoChatLabel() {
		logger.info("Starting of checkVideoChatLabel method");

		this.explicitWait(lblVideoChat);

		logger.info("Ending of checkVideoChatLabel method");

		return driver.getPageSource().contains("Video Chat");
	}

	public boolean checkLiveStreamLabel() {
		logger.info("Starting of checkLiveStreamLabel method");

		this.explicitWait(lblLiveStream);

		logger.info("Ending of checkLiveStreamLabel method");

		return driver.getPageSource().contains("Livestream");
	}

	public boolean checkRecordAndShareLabel() {
		logger.info("Starting of checkRecordAndShareLabel method");

		this.explicitWait(lblRecordAndShare);

		logger.info("Ending of checkRecordAndShareLabel method");

		return driver.getPageSource().contains("Record and Share");
	}

}
