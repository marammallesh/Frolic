package frolic_prod.tournaments.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @author b2btesters
*/

public class FrolicTournamentsPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app:id/tvViewAll") //// android.widget.TextView[@text = 'View all'] changed in
														//// latest build 0.0.482
	private WebElement btnTxtViewAll;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Battles']")
	private WebElement tabBattles;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Create New Battle']")
	private WebElement txtCreateNewBattle;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Fairplay']")
	private WebElement TextFairplay;

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc = 'Tournaments']")
	private WebElement tabTournaments;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Prize money pool']")
	private WebElement getPrizeMoneyPooltext;

	@FindBy(id = "live.frolic.app:id/btn_history")
	private WebElement btnHistory;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Arena History']")
	private WebElement txtArenaHistory;

	@FindBy(id = "live.frolic.app:id/tv_app_name")
	private WebElement txtArena;

	@FindBy(xpath = "//android.widget.TextView[@text = 'All']")
	private WebElement btnAllTab;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Joined']")
	private WebElement tabJoined;

	@FindBy(id = "live.frolic.app:id/tv_title")
	private WebElement getLiveScoreText;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Live']")
	private WebElement txtLiveTab;

	@FindBy(xpath = "//android.widget.TextView[@text = 'History']")
	private WebElement tabHistory;

	@FindBy(id = "live.frolic.app:id/btn_join")
	private WebElement btnResult;

	@FindBy(id = "live.frolic.app:id/tv_title")
	private WebElement txtResultScreen;

	@FindBy(id = "live.frolic.app:id/iv_more")
	private WebElement iconShare;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement btnAllowPermission;

	@FindBy(id = "live.frolic.app:id/close")
	private WebElement iconClose;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Live']")
	private WebElement tabLive;

	@FindBy(xpath = "//android.widget.TextView[@text = 'No Tournaments found']")
	private WebElement txtNoTournaments;

	@FindBy(id = "live.frolic.app:id/btn_info")
	private WebElement iconInfo;

	@FindBy(id = "live.frolic.app:id/btn_add_money")
	private WebElement btnConfirmJoin;

	@FindBy(id = "live.frolic.app:id/btn_back")
	private WebElement iconBack;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView[@text = 'LiveScore']")
	private WebElement btnLiveScore;

	@FindBy(id = "live.frolic.app:id/tv_title")
	private WebElement txtShare;

	@FindBy(id = "live.frolic.app:id/tv_game_mode_title")
	private WebElement getAttemptsUsedText;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Live Tournaments']")
	private WebElement getLiveTournamentsText;

	@FindBy(xpath = "//android.widget.ScrollView")
	private WebElement getScroll;

	@FindBy(xpath = "//android.widget.Button[@text = 'Join']")
	private WebElement btnJoin;

	@FindBy(xpath = "//android.widget.Button[@text = 'Play']")
	private WebElement txtPlay;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement btnUsingAppAccess;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Position']")
	private WebElement txtPosition;

	@FindBy(id = "live.frolic.app:id/tv_amnt_title")
	private WebElement txtprizepool;

	@FindBy(id = "live.frolic.app:id/tv_fee_title")
	private WebElement txtEntryFee;

	private static final Logger logger = Logger.getLogger(FrolicTournamentsPage.class.getName());

	public FrolicTournamentsPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
		logger.info("Starting of FrolicTournamentsPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicTournamentsPage method");

	}

	public void clickOnAccessPermission() {
		logger.info("Starting of clickOnAccessPermission method");

		clickOnElement(btnUsingAppAccess);

		logger.info("Ending of clickOnAccessPermission method");
	}

	public void scrollToTournamentsLabel() {
		logger.info("Starting of scrollToTournamentsLabel method");

		androidScrollUsingText("Live Tournaments");

		logger.info("Ending of scrollToTournamentsLabel method");
	}

	public void getAndJoinTournament() {
		logger.info("Starting of getAndJoinTournament method");

		try {
			this.scrollUsingText("Join");

			this.clickOnJoinButton();

			this.clickOnJoinConfirmButton();
		}

		catch (Exception e) {

			this.getPlayText();
		}

		logger.info("Ending of getAndJoinTournament method");
	}

	public String getPlayText() {
		logger.info("Starting of getPlayText method");

		logger.info("Starting of getPlayText method");

		return getText(txtPlay);
	}

	public String getPositionText() {
		logger.info("Starting of getPositionText method");

		logger.info("Starting of getPositionText method");

		return getText(txtPosition);
	}

	public void clickOnJoinButton() {
		logger.info("Starting of clickOnJoinButton method");

		clickOnElement(btnJoin);

		logger.info("Ending of clickOnJoinButton method");
	}

	public String getLiveScoreText() {
		logger.info("Starting of getLiveScoreText method");

		logger.info("Ending of getLiveScoreText method");

		return getText(getLiveScoreText);
	}

	public String getShareText() {
		logger.info("Starting of getShareText method");

		logger.info("Ending of getShareText method");

		return getText(txtShare);
	}

	public String getAttemptsUsedText() {
		logger.info("Starting of getAttemptsUsedText method");

		logger.info("Ending of getAttemptsUsedText method");

		return getText(getAttemptsUsedText);
	}

	public String getTournamentDetailsText() {
		logger.info("Starting of getTournamentDetailsText method");

		logger.info("Ending of getTournamentDetailsText method");

		return getText(txtResultScreen);
	}

	public String getViewAllText() {
		logger.info("Starting of getViewAllText method");

		logger.info("Ending of getViewAllText method");

		return getText(btnTxtViewAll);
	}

	public String getLiveTabText() {
		logger.info("Starting of getLiveTabText method");

		logger.info("Ending of getLiveTabText method");

		return getText(txtLiveTab);
	}

	public String getFairPlayText() {
		logger.info("Starting of getFairPlayText method");

		logger.info("Ending of getFairPlayText method");

		return getText(TextFairplay);
	}

	public void clickOnBattlesTab() {
		logger.info("Starting of clickOnBattlesTab method");

		clickOnElement(tabBattles);

		logger.info("Ending of clickOnBattlesTab method");
	}

	public void clickOnTournamentTab() {
		logger.info("Starting of clickOnTournamentTab method");

		clickOnElement(tabTournaments);

		logger.info("Ending of clickOnTournamentTab method");
	}

	public String getPrizeMoneyPoolText() {
		logger.info("Starting of getPrizeMoneyPoolText method");

		logger.info("Ending of getPrizeMoneyPoolText method");

		return getText(getPrizeMoneyPooltext);
	}

	public void clickOnViewAllButton() {
		logger.info("Starting of clickOnViewAllButton method");

		this.scrollToTournamentsLabel();

		clickOnElement(btnTxtViewAll);

		logger.info("Ending of clickOnViewAllButton method");
	}

	public String getArenaText() {
		logger.info("Starting of getArenaText method");

		logger.info("Ending of getArenaText method");

		return getText(txtArena);
	}

	public void clickOnArenaHistoryIcon() {
		logger.info("Starting of clickOnArenaHistoryIcon method");

		clickOnElement(btnHistory);

		logger.info("Ending of clickOnArenaHistoryIcon method");
	}

	public String getArenaHistoryText() {
		logger.info("Starting of getArenaHistoryText method");

		logger.info("Ending of getArenaHistoryText method");

		return getText(txtArenaHistory);
	}

	public void clickOnAllTab() {
		logger.info("Starting of clickOnAllTab method");

		clickOnElement(btnAllTab);

		logger.info("Ending of clickOnAllTab method");
	}

	public void clickOnJoinedTab() {
		logger.info("Starting of clickOnJoinedTab method");

		clickOnElement(tabJoined);

		logger.info("Ending of clickOnJoinedTab method");
	}

	public void clickOnbtnHistoryTab() {
		logger.info("Starting of clickOnbtnHistoryTab method");

		clickOnElement(tabHistory);

		logger.info("Ending of clickOnbtnHistoryTab method");
	}

	public String getResultScreenText() {
		logger.info("Starting of getResultScreenText method");

		logger.info("Ending of getResultScreenText method");

		return getText(txtResultScreen);
	}

	public void clickOnResultButton() {
		logger.info("Starting of clickOnbtnHistoryTab method");

		clickOnElement(btnResult);

		logger.info("Ending of clickOnbtnHistoryTab method");
	}

	public void clickOnShareIcon() {
		logger.info("Starting of clickOnShareIcon method");

		clickOnElement(iconShare);

		logger.info("Ending of clickOnShareIcon method");
	}

	public String getAllowText() {
		logger.info("Starting of getAllowText method");

		logger.info("Ending of getAllowText method");

		return getText(btnAllowPermission);
	}

	public void clickOnAllowPermission() {
		logger.info("Starting of clickOnAllowPermission method");

		clickOnElement(btnAllowPermission);

		logger.info("Ending of clickOnAllowPermission method");
	}

	public void clickOnCloseIcon() {
		logger.info("Starting of clickOnCloseIcon method");

		clickOnElement(iconClose);

		logger.info("Ending of clickOnCloseIcon method");
	}

	public String getNoTournamentsFoundText() {
		logger.info("Starting of getNoTournamentsFoundText method");

		logger.info("Ending of getNoTournamentsFoundText method");

		return getText(txtNoTournaments);
	}

	public void clickOnLiveTab() {
		logger.info("Starting of clickOnbtnLiveTab method");

		clickOnElement(tabLive);

		logger.info("Ending of clickOnbtnLiveTab method");
	}

	public void clickOnInfoIcon() {
		logger.info("Starting of clickOnInfoIcon method");

		if (iconInfo.isDisplayed()) {

			clickOnElement(iconInfo);

			this.clickOnBackIcon();
		}

		logger.info("Ending of clickOnInfoIcon method");
	}

	public void clickOnBackIcon() {
		logger.info("Starting of clickOnBackIcon method");

		clickOnElement(iconBack);

		logger.info("Ending of clickOnBackIcon method");
	}

	public void clickOnLiveScoreButton() {
		logger.info("Starting of clickOnLiveScoreButton method");

		if (btnLiveScore.isDisplayed()) {

			clickOnElement(btnLiveScore);

			this.clickOnBackIcon();
		}

		logger.info("Ending of clickOnLiveScoreButton method");
	}

	public void clickOnJoinConfirmButton() {
		logger.info("Starting of clickOnJoinConfirmButton method");

		clickOnElement(btnConfirmJoin);

		logger.info("Ending of clickOnJoinConfirmButton method");
	}

	public boolean checkNoTournamentsText() {
		logger.info("Starting of checkNoTournamentsText method");

		this.explicitWait(txtNoTournaments);

		logger.info("Ending of checkNoTournamentsText method");

		return driver.getPageSource().contains("No Tournaments found");
	}

	public boolean checkPrizePoolText() {
		logger.info("Starting of checkPrizePoolText method");

		this.explicitWait(txtprizepool);

		logger.info("Ending of checkPrizePoolText method");

		return driver.getPageSource().contains("Prize money pool");
	}

	public boolean checkEntryFeeText() {
		logger.info("Starting of checkAllowAccessText method");

		this.explicitWait(txtEntryFee);

		logger.info("Starting of checkAllowAccessText method");

		return driver.getPageSource().contains("Entry Fee");
	}

	public void redirectToArenaScreen() {
		logger.info("Starting of redirectToArenaScreen method");

		int i = 1;
		while (i <= 6) {
			try {
				if (txtArena.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			this.hardback();
			i++;
		}

		logger.info("Ending of redirectToArenaScreen method");
	}

}
