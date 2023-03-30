package live.frolic.login.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;

public class FrolicCreateBattlePage extends BaseFrolicAutomationPage {

	@FindBy(xpath = "//android.widget.TextView[@text = 'Play with friends']")
	private WebElement lblPlayWithFriends;

	@FindBy(id = "live.frolic.app.debug:id/btn_create_room")
	private WebElement btnCreateBattle;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select Game']")
	private WebElement lblSelectGame;

	@FindBy(id = "live.frolic.app.debug:id/et_search")
	private WebElement txtSearch;

	@FindBy(id = "live.frolic.app.debug:id/img_banner")
	private WebElement btnSelectGame;

	@FindBy(id = "live.frolic.app.debug:id/tv_title_name")
	private WebElement lblSelectGameName;

	@FindBy(id = "live.frolic.app.debug:id/create_room_text")
	private WebElement lblCreateYourBattletext;

	@FindBy(id = "live.frolic.app.debug:id/tv_entry_fee")
	private WebElement lblSelectEntryFees;

	@FindBy(id = "live.frolic.app.debug:id/tv_entry_cash")
	private WebElement btnCash;

	@FindBy(id = "live.frolic.app.debug:id/tv_entry_coin")
	private WebElement btnCoin;

	@FindBy(id = "live.frolic.app.debug:id/seek_bar")
	private WebElement btnSeekBar;

	@FindBy(id = "live.frolic.app.debug:id/record_share")
	private WebElement lblRecordAndShare;

	@FindBy(id = "live.frolic.app.debug:id/live_stream")
	private WebElement lblLiveStream;

	@FindBy(id = "live.frolic.app.debug:id/create_room_button_text")
	private WebElement btnCreateRoom;

	@FindBy(id = "live.frolic.app.debug:id/record_and_share_switch")
	private WebElement togglebuttonRecordandShare;

	@FindBy(id = "live.frolic.app.debug:id/live_stream_switch")
	private WebElement togglebuttonLiveStream;

	@FindBy(id = "live.frolic.app.debug:id/game_icon")
	private WebElement txtSelectGameCard;

	@FindBy(id = "live.frolic.app.debug:id/invite_layout")
	private WebElement btnPlusIcon;

	@FindBy(id = "live.frolic.app.debug:id/tv_title")
	private WebElement lblSearchAndInvitePeople;

	@FindBy(id = "live.frolic.app.debug:id/add_account_cont")
	private WebElement btnSelectUserName;

	@FindBy(id = "live.frolic.app.debug:id/navigation_bar_item_large_label_view")
	private WebElement btnGames;

	@FindBy(id = "live.frolic.app.debug:id/title")
	private WebElement lblLiveTournaments;

	@FindBy(id = "live.frolic.app.debug:id/boldTextView2")
	private WebElement lblTimeOut;

	@FindBy(id = "live.frolic.app.debug:id/btn_exit")
	private WebElement btnOkay;

	@FindBy(xpath = "//android.widget.TextView[@text = 'user12345']")
	private WebElement txtSelectInUser;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Search for users']")
	private WebElement txtSearchNameForUSers;

	@FindBy(id = "live.frolic.app.debug:id/title")
	private WebElement lblTournaments;

	@FindBy(id = "live.frolic.app.debug:id/join_room_button_text")
	private WebElement btnJoinRooms;

	@FindBy(id = "live.frolic.app.debug:id/top_container_title")
	private WebElement lblJoinBattle;

	@FindBy(id = "live.frolic.app.debug:id/enter_passcode")
	private WebElement lblPasscodeToJoinRoom;

	@FindBy(id = "live.frolic.app.debug:id/join_room_pass_text")
	private WebElement txtPasscode;

	@FindBy(id = "live.frolic.app.debug:id/title")
	private WebElement btnAcceptChallenge;

	@FindBy(xpath = "//android.widget.TextView[@text = 'MENU']")
	private WebElement btnMenu;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Notifications']")
	private WebElement btnNotification;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnPushUpNotification;

	@FindBy(id = "live.frolic.app.debug:id/join_room_button_text")
	private WebElement btnAcceptJoinRoom;

	@FindBy(id = "live.frolic.app.debug:id/iv_close")
	private WebElement btnClose;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Start Game']")
	private WebElement btnStartGame;

	@FindBy(id = "live.frolic.app.debug:id/exit_game")
	private WebElement btnExitGameIcon;

	@FindBy(id = "live.frolic.app.debug:id/btn_cancel")
	private WebElement btnCancel;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Exit Game']")
	private WebElement lblExitGame;

	@FindBy(id = "live.frolic.app.debug:id/btn_exit")
	private WebElement btnExit;

	@FindBy(id = "live.frolic.app.debug:id/iv_more_info")
	private WebElement btnThreedotIcon;

	@FindBy(xpath = "//android.widget.TextView[@text = 'How to Play']")
	private WebElement btnHowToPlay;

	@FindBy(xpath = "//android.widget.TextView[@text = 'About Game']")
	private WebElement btnAboutGame;

	@FindBy(id = "live.frolic.app.debug:id/btn_back")
	private WebElement btnNavigateBack;

	@FindBy(id = "live.frolic.app.debug:id/iv_swap_btn")
	private WebElement btnSwap;
	
	@FindBy(id = "live.frolic.app.debug:id/close")
	private WebElement btnCloseIcon;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Action']")
	private WebElement btnAction;

	private static final Logger logger = Logger.getLogger(FrolicCreateBattlePage.class.getName());

	public FrolicCreateBattlePage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of FrolicCreateBattlePage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicCreateBattlePage method");
	}

	public void clickOnGamesTab() {
		logger.info("Starting of clickOnGamesTab method");

		clickOnElement(btnGames);

		logger.info("Ending of clickOnGamesTab method");
	}

	public String getLiveTournamentsText() {

		logger.info("Starting of getLiveTournamentsText method");

		logger.info("Ending of getLiveTournamentsText method");

		return getText(lblLiveTournaments);
	}

	public void scrollToTournamentsLabel() {
		logger.info("Starting of scrollToTournamentsLabel method");

		androidScrollUsingText("Live Tournaments");

		logger.info("Ending of scrollToTournamentsLabel method");
	}

	public String getPlayWithFriendsText() throws InterruptedException {

		logger.info("Starting of getPlayWithFriendsText method");

		logger.info("Ending of getPlayWithFriendsText method");
		this.verticalScrollDown();
		this.verticalScrollDown();

		return getText(lblPlayWithFriends);
	}

	public void clickOnCreateBattleButton() {
		logger.info("Starting of clickOnCreateBattleButton method");

		clickOnElement(btnCreateBattle);

		logger.info("Ending of clickOnCreateBattleButton method");
	}

	public String getSelectGameText() {

		logger.info("Starting of getSelectGameText method");

		logger.info("Ending of getSelectGameText method");

		return getText(lblSelectGame);
	}

	public void setSearchName(String SearchGame) throws InterruptedException {
		logger.info("Starting of setSearchName method");

		clickOnElement(txtSearch);

		this.txtSearch.sendKeys(SearchGame);

		// driver.hideKeyboard();
		Thread.sleep(3000);
		clickOnElement(btnSelectGame);

		logger.info("Ending of setSearchName method");
	}

	public String getSelectEntryFeesText() {

		logger.info("Starting of getSelectEntryFeesText method");

		logger.info("Ending of getSelectEntryFeesText method");

		return getText(lblSelectEntryFees);
	}

	public void clickOnCashButton() {
		logger.info("Starting of clickOnCashButton method");

		clickOnElement(btnCash);

		logger.info("Ending of clickOnCashButton method");
	}

	public void clickOnCoinButton() {
		logger.info("Starting of clickOnCoinButton method");

		clickOnElement(btnCoin);

		logger.info("Ending of clickOnCoinButton method");
	}

	public void clickOnSeekBarButton() {
		logger.info("Starting of clickOnSeekBarButton method");

		clickOnElement(btnSeekBar);

		logger.info("Ending of clickOnSeekBarButton method");
	}

	public void clickOnLiveStreamToogleButton() {
		logger.info("Starting of clickOnLiveStreamToogleButton method");

		clickOnElement(togglebuttonLiveStream);

		logger.info("Ending of clickOnLiveStreamToogleButton method");
	}

	public void clickOnCreateRoomButton() {
		logger.info("Starting of clickOnCreateRoomButton method");

		clickOnElement(btnCreateRoom);

		logger.info("Ending of clickOnCreateRoomButton method");
	}

	public String getRecordAndShareText() {

		logger.info("Starting of getRecordAndShareText method");

		logger.info("Ending of getRecordAndShareText method");

		return getText(lblRecordAndShare);
	}

	public void clickOnRecordAndShareToogleButton() {
		logger.info("Starting of clickOnRecordAndShareToogleButton method");

		clickOnElement(togglebuttonRecordandShare);

		logger.info("Ending of clickOnRecordAndShareToogleButton method");
	}

	public String getLiveStreamText() {

		logger.info("Starting of getLiveStreamText method");

		logger.info("Ending of getLiveStreamText method");

		return getText(lblLiveStream);
	}

	public String getSelectGameCardText() {

		logger.info("Starting of getSelectGameCardText method");

		logger.info("Ending of getSelectGameCardText method");

		return getText(txtSelectGameCard);
	}

	public void clickOnPlusIconButton() {
		logger.info("Starting of clickOnPlusIconButton method");

		clickOnElement(btnPlusIcon);

		logger.info("Ending of clickOnPlusIconButton method");
	}

	public String getSearchAndInvitePeopleText() {

		logger.info("Starting of getSearchAndInvitePeopleText method");

		logger.info("Ending of getSearchAndInvitePeopleText method");

		return getText(lblSearchAndInvitePeople);
	}

	public void setSearchNameForUsers(String SearchGameForUsers) {
		logger.info("Starting of setSearchName method");

		this.txtSearchNameForUSers.sendKeys(SearchGameForUsers);
		clickOnElement(txtSelectInUser);

		logger.info("Ending of setSearchName method");
	}

	public void clickOnSelectUserNameButton() {
		logger.info("Starting of clickOnSelectUserNameButton method");

		clickOnElement(btnSelectUserName);

		logger.info("Ending of clickOnSelectUserNameButton method");
	}

	public String getLiveTournamentsLabel() {

		logger.info("Starting of getLiveTournamentsLabel method");

		logger.info("Ending of getLiveTournamentsLabel method");

		return getText(lblTournaments);
	}

	public void clickOnJoinRoomsButton() {
		logger.info("Starting of clickOnJoinRoomsButton method");

		clickOnElement(btnJoinRooms);

		logger.info("Ending of clickOnJoinRoomsButton method");
	}

	public String getJoinBattleLabel() {

		logger.info("Starting of getJoinBattleLabel method");

		logger.info("Ending of getJoinBattleLabel method");

		return getText(lblJoinBattle);
	}

	public String getEnterPasscodeToJoinRoomText() {

		logger.info("Starting of getEnterPasscodeToJoinRoomText method");

		logger.info("Ending of getEnterPasscodeToJoinRoomText method");

		return getText(lblPasscodeToJoinRoom);
	}

	public void setPasscodeInJoinRooms(String Passcode) {
		logger.info("Starting of setSearchName method");

		clickOnElement(txtPasscode);

		this.txtSearch.sendKeys(Passcode);

		driver.hideKeyboard();
		clickOnElement(txtPasscode);

		logger.info("Ending of setSearchName method");
	}

	public void clickOnAcceptChallengeButton() {
		logger.info("Starting of clickOnAcceptChallengeButton method");

		clickOnElement(btnAcceptChallenge);

		logger.info("Ending of clickOnAcceptChallengeButton method");
	}

	public void clickOnMenuButton() {
		logger.info("Starting of clickOnMenuButton method");

		clickOnElement(btnMenu);

		logger.info("Ending of clickOnMenuButton method");
	}

	public void clickOnNotificationButton() {
		logger.info("Starting of clickOnNotificationButton method");

		clickOnElement(btnNotification);

		logger.info("Ending of clickOnNotificationButton method");
	}

	public void clickOnPushUpNotification() {
		logger.info("Starting of clickOnPushUpNotification method");

		clickOnElement(btnPushUpNotification);

		logger.info("Ending of clickOnPushUpNotification method");
	}

	public void clickOnStartGameButton() {
		logger.info("Starting of clickOnStartGameButton method");

		clickOnElement(btnStartGame);

		logger.info("Ending of clickOnStartGameButton method");
	}

	public void clickOnExitGameIconButton() {
		logger.info("Starting of clickOnExitGameIconButton method");

		clickOnElement(btnExitGameIcon);

		logger.info("Ending of clickOnExitGameIconButton method");
	}

	public String getExitGameText() {

		logger.info("Starting of getExitGameText method");

		logger.info("Ending of getExitGameText method");

		return getText(lblExitGame);
	}

	public void clickOnCancelButton() {
		logger.info("Starting of clickOnCancelButton method");

		clickOnElement(btnCancel);

		logger.info("Ending of clickOnCancelButton method");
	}

	public void clickOnExitButton() {
		logger.info("Starting of clickOnExitButton method");

		clickOnElement(btnExit);

		logger.info("Ending of clickOnExitButton method");
	}

	public void clickOnGameTabs() {
		logger.info("Starting of clickOnGameTabs method");

		List<WebElement> gameTabs = driver.findElements(By.xpath(
				"//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup"));
		try {
			for (int i = 0; i < gameTabs.size(); i++) {

				explicitWait(gameTabs.get(i));

				clickOnElement(gameTabs.get(i));
			}
		} catch (Exception e) {

			clickOnElement(btnAction);
		}

		logger.info("Ending of clickOnGameTabs method");
	}

	public void clickOnSwapButton() {
		logger.info("Starting of clickOnSwapButton method");

		clickOnElement(btnSwap);

		logger.info("Ending of clickOnSwapButton method");
	}

	public void clickOnCloseButton() {
		logger.info("Starting of clickOnCloseButton method");

		clickOnElement(btnClose);

		logger.info("Ending of clickOnCloseButton method");
	}

	public void clickOnThreedotsIcon() {
		logger.info("Starting of clickOnThreedotsIcon method");

		clickOnElement(btnThreedotIcon);

		logger.info("Ending of clickOnThreedotsIcon method");
	}

	public void clickOnHowToPlayButton() {
		logger.info("Starting of clickOnHowToPlayButton method");

		clickOnElement(btnHowToPlay);

		logger.info("Ending of clickOnHowToPlayButton method");
	}

	public void clickOnNavigateBackButton() {
		logger.info("Starting of clickOnNavigateBackButton method");

		clickOnElement(btnNavigateBack);

		logger.info("Ending of clickOnNavigateBackButton method");
	}

	public void clickOnAboutGameButton() {
		logger.info("Starting of clickOnAboutGameButton method");

		clickOnElement(btnAboutGame);

		logger.info("Ending of clickOnAboutGameButton method");
	}
	public void clickOnCloseIconButton() {
		logger.info("Starting of clickOnCloseIconButton method");

			clickOnElement(btnCloseIcon);

		logger.info("Ending of clickOnCloseIconButton method");
	}

}
