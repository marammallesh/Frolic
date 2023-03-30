package live.frolic.test.login;

import static live.frolic.util.Constants.*;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.login.pages.FrolicCreateBattlePage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;

@Epic("Frolic Create Battle")
@Feature("Frolic Create Battle Functionality")
public class FrolicCreateBattleTest extends BaseTestAutomation {

	public static final Logger logger = Logger.getLogger(FrolicCreateBattleTest.class.getName());

	private FrolicUserLoginPage newUserLoginPage = null;
	private FrolicUserLoginPage newUserLoginPageOFFriend = null;
	private FrolicCreateBattlePage frolicCreateBattlePage = null;
	private FrolicCreateBattlePage frolicCreateBattlePageFriend = null;

	@BeforeClass()
	@Parameters({ "deviceIndex", "deviceIndex1" })
	public void initClass(@Optional("1") String deviceIndex, @Optional("2") String deviceIndex1) throws Exception {
		logger.info("Starting of initClass method in Frolic CreateBattleTest");

		driver = initMobileDriver2(deviceIndex, driver);
		driver1 = initMobileDriver2(deviceIndex1, driver1);

		newUserLoginPage = new FrolicUserLoginPage(driver);
		newUserLoginPageOFFriend = new FrolicUserLoginPage(driver1);
		frolicCreateBattlePage = new FrolicCreateBattlePage(driver);
		frolicCreateBattlePageFriend = new FrolicCreateBattlePage(driver1);

		logger.info("Ending of initClass method in Frolic CreateBattleTest");
	}

	@Test(priority = 1, description = "Login Test with Valid Credentials")
	@Description("Login Test with Valid Credentials")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Login Test with Valid Credentials")
	public void verifySignUpAndLogin() {
		logger.info("Starting of Verify Login method");

		try {

			Assert.assertEquals(newUserLoginPage.getGetStartedText(),
					expectedAssertionsProp.getProperty(GET_STARTED_LABEL));

			Assert.assertEquals(newUserLoginPage.getMobileNumberText(),
					expectedAssertionsProp.getProperty(MOBILE_NUMBER_LABEL));

			newUserLoginPage.setPhoneNumber(testDataProp.getProperty("phone.number"));
			newUserLoginPage.clickOnOtpButton();
			newUserLoginPage.setOTP(testDataProp.getProperty("otp"));
			Thread.sleep(5000);
			Assert.assertEquals(newUserLoginPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

		} catch (Exception e) {
			Assert.fail("Exception occured while testing  User Login : " + e.getMessage());
			logger.error("Exception occured while verifying User Login :", e);
		}

		logger.info("Ending of Verify Login  method");
	}

	@Test(priority = 2, description = "Login Test with Valid Credentials")
	@Description("Login Test with Valid Credentials")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Login Test with Valid Credentials")
	public void verifySignUpAndLogin2() {
		logger.info("Starting of Verify Login method");

		try {

			Assert.assertEquals(newUserLoginPageOFFriend.getGetStartedText(),
					expectedAssertionsProp.getProperty(GET_STARTED_LABEL));

			Assert.assertEquals(newUserLoginPageOFFriend.getMobileNumberText(),
					expectedAssertionsProp.getProperty(MOBILE_NUMBER_LABEL));

			newUserLoginPageOFFriend.setPhoneNumber(testDataProp.getProperty("phone.number.one"));
			newUserLoginPageOFFriend.clickOnOtpButton();
			newUserLoginPageOFFriend.setOTP(testDataProp.getProperty("otp"));
			Thread.sleep(5000);
			Assert.assertEquals(newUserLoginPageOFFriend.getGamesText(),
					expectedAssertionsProp.getProperty(GAMES_LABEL));

		} catch (Exception e) {
			Assert.fail("Exception occured while testing  User Login : " + e.getMessage());
			logger.error("Exception occured while verifying User Login :", e);
		}

		logger.info("Ending of Verify Login  method");
	}

	// @Test(priority = 3, description = "Join Rooms")
	@Description("Join Rooms")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Join Rooms")
	public void verifyJoinRooms() {
		logger.info("Starting of verify Join Rooms method");

		try {

			Assert.assertEquals(frolicCreateBattlePage.getLiveTournamentsLabel(),
					expectedAssertionsProp.getProperty(LABEL_LIVE_TOURNAMENTS_IN_JOIN_ROOMS));

			frolicCreateBattlePage.clickOnJoinRoomsButton();

			Assert.assertEquals(frolicCreateBattlePage.getJoinBattleLabel(),
					expectedAssertionsProp.getProperty(LABEL_JOIN_BATTLE_IN_JOIN_ROOM));

			Assert.assertEquals(frolicCreateBattlePage.getEnterPasscodeToJoinRoomText(),
					expectedAssertionsProp.getProperty(LABEL_ENTER_PASSCODE_TO_JOIN_ROOM_IN_JOIN_ROOMS));

			frolicCreateBattlePage.setPasscodeInJoinRooms(testDataProp.getProperty(ENTER_PASSCODE_TEXT_IN_JOIN_ROOM));
			frolicCreateBattlePage.clickOnAcceptChallengeButton();
		} catch (Exception e) {
			Assert.fail("Exception occured while testing  User Login : " + e.getMessage());
			logger.error("Exception occured while verifying User Login :", e);
		}

		logger.info("Ending of of verify Join Rooms method  method");
	}
	@Test(priority = 3, description = "Create Battle Test")
	@Description("Create Battle Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Create Battle Test")
	public void verifyCreateBattleTest() {
		logger.info("Staring of verify CreateBattleTest method");

		try {
			Thread.sleep(5000);
			frolicCreateBattlePage.verticalScrollDown();
			frolicCreateBattlePage.verticalScrollDown();
			frolicCreateBattlePage.verticalScrollDown();
			Assert.assertEquals(frolicCreateBattlePage.getPlayWithFriendsText(),
					expectedAssertionsProp.getProperty(PLAY_WITH_FRIENDS_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnCreateBattleButton();
			Assert.assertEquals(frolicCreateBattlePage.getSelectGameText(),
					expectedAssertionsProp.getProperty(LABEL_SELECT_GAME_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnGameTabs();
			frolicCreateBattlePage.setSearchName(testDataProp.getProperty(SEARCH_WITH_GAME_NAME_IN_CREATE_BATTLE_ROOM));
			Assert.assertEquals(frolicCreateBattlePage.getSelectEntryFeesText(),
					expectedAssertionsProp.getProperty(LABEL_SELECT_ENTRY_FEES_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnSwapButton();
			frolicCreateBattlePage.clickOnCloseButton();
			frolicCreateBattlePage.clickOnThreedotsIcon();
			frolicCreateBattlePage.clickOnHowToPlayButton();
			frolicCreateBattlePage.clickOnNavigateBackButton();
			frolicCreateBattlePage.clickOnThreedotsIcon();
			frolicCreateBattlePage.clickOnAboutGameButton();
			frolicCreateBattlePage.clickOnNavigateBackButton();;
			frolicCreateBattlePage.clickOnCoinButton();
			frolicCreateBattlePage.clickOnCashButton();
			//frolicCreateBattlePage.clickOnSeekBarButton();
			frolicCreateBattlePage.verticalScrollDown();
			frolicCreateBattlePage.clickOnRecordAndShareToogleButton();
			frolicCreateBattlePage.clickOnLiveStreamToogleButton();
			frolicCreateBattlePage.clickOnCreateRoomButton();
			
		} catch (Exception e) {
			Assert.fail("Exception occured while testing  Create Battle Test : " + e.getMessage());
			logger.error("Exception occured while verifying Create Battle Test :", e);
		}

		logger.info("Ending of verify Create Battle Test method");
	}
	
	@Test(priority = 4, description = "Exit Game In Create Battle")
	@Description("Exit Game In Create Battle")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Exit Game In Create Battle")
	public void verifyExitGameTesInCreateBattle() {

		logger.info("Starting of verifyExitGameTesInCreateBattle Test method");

		try {
			frolicCreateBattlePage.clickOnExitGameIconButton();
			Assert.assertEquals(frolicCreateBattlePage.getExitGameText(),
					expectedAssertionsProp.getProperty(LABEL_EXIT_GAME_IN_CREATE_BATTLE));
			frolicCreateBattlePage.clickOnCancelButton();
			frolicCreateBattlePage.clickOnExitGameIconButton();
			Assert.assertEquals(frolicCreateBattlePage.getExitGameText(),
					expectedAssertionsProp.getProperty(LABEL_EXIT_GAME_IN_CREATE_BATTLE));
			frolicCreateBattlePage.clickOnExitButton();

		} catch (Exception e) {
			Assert.fail("Exception occured while testing  Exit Game In Create Battle : " + e.getMessage());
			logger.error("Exception occured while verifying Exit Game In Create Battle :", e);
		}

		logger.info("Ending of of verifyExitGameTesInCreateBattle method");
	}
	
	@Test(priority = 5, description = "Create Room Test")
	@Description("Create Room Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Create Room Test")
	public void verifyCreateRoomTest() {
		logger.info("Staring of verify CreateRoomTest method");

		try {
			frolicCreateBattlePage.clickOnCreateRoomButton();
			frolicCreateBattlePage.clickOnPlusIconButton();
			Assert.assertEquals(frolicCreateBattlePage.getSearchAndInvitePeopleText(),
					expectedAssertionsProp.getProperty(LABEL_SEARCH_AND_INVITE_PEOPLE_IN_CREATE_BATTLE));

			frolicCreateBattlePage
					.setSearchNameForUsers(testDataProp.getProperty(SEARCH_WITH_USER_NAME_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePageFriend.clickOnMenuButton();
			frolicCreateBattlePageFriend.clickOnNotificationButton();
			frolicCreateBattlePageFriend.clickOnPushUpNotification();
			Assert.assertEquals(frolicCreateBattlePageFriend.getJoinBattleLabel(),
					expectedAssertionsProp.getProperty(LABEL_JOIN_BATTLE_IN_JOIN_ROOM));

			Assert.assertEquals(frolicCreateBattlePageFriend.getEnterPasscodeToJoinRoomText(),
					expectedAssertionsProp.getProperty(LABEL_ENTER_PASSCODE_TO_JOIN_ROOM_IN_JOIN_ROOMS));
			frolicCreateBattlePageFriend.clickOnJoinRoomsButton();
			frolicCreateBattlePage.clickOnCloseIconButton();
			frolicCreateBattlePage.clickOnStartGameButton();
			// frolicCreateBattlePage.clickOnAcceptChallengeButton();

		} catch (Exception e) {
			Assert.fail("Exception occured while testing  Create Room Test : " + e.getMessage());
			logger.error("Exception occured while verifying Create Room Test :", e);
		}

		logger.info("Ending of verify Create Room Test method");
	}

	@Test(priority = 6, description = "Record and Share In Create Battle Test")
	@Description("Record and Share In Create Battle Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Record and Share In Create Battle Test")
	public void VerifyRecordAndShareInCreateBattleTest() {
		logger.info("Staring of verify RecordAndShareInCreateBattleTest method");

		try {
			Thread.sleep(3);
			Assert.assertEquals(frolicCreateBattlePage.getPlayWithFriendsText(),
					expectedAssertionsProp.getProperty(PLAY_WITH_FRIENDS_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnCreateBattleButton();
			Assert.assertEquals(frolicCreateBattlePage.getSelectGameText(),
					expectedAssertionsProp.getProperty(LABEL_SELECT_GAME_IN_CREATE_BATTLE_ROOM));

			frolicCreateBattlePage.setSearchName(testDataProp.getProperty(SEARCH_WITH_GAME_NAME_IN_CREATE_BATTLE_ROOM));
			Assert.assertEquals(frolicCreateBattlePage.getSelectEntryFeesText(),
					expectedAssertionsProp.getProperty(LABEL_SELECT_ENTRY_FEES_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnCoinButton();
			frolicCreateBattlePage.clickOnCashButton();
			frolicCreateBattlePage.clickOnSeekBarButton();
			frolicCreateBattlePage.verticalScrollDown();
			frolicCreateBattlePage.clickOnRecordAndShareToogleButton();
			frolicCreateBattlePage.clickOnCreateRoomButton();
			frolicCreateBattlePage.clickOnPlusIconButton();
			Assert.assertEquals(frolicCreateBattlePage.getSearchAndInvitePeopleText(),
					expectedAssertionsProp.getProperty(LABEL_SEARCH_AND_INVITE_PEOPLE_IN_CREATE_BATTLE));

			frolicCreateBattlePage
					.setSearchNameForUsers(testDataProp.getProperty(SEARCH_WITH_USER_NAME_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePageFriend.clickOnMenuButton();
			frolicCreateBattlePageFriend.clickOnNotificationButton();
			frolicCreateBattlePageFriend.clickOnPushUpNotification();
			Assert.assertEquals(frolicCreateBattlePageFriend.getJoinBattleLabel(),
					expectedAssertionsProp.getProperty(LABEL_JOIN_BATTLE_IN_JOIN_ROOM));

			Assert.assertEquals(frolicCreateBattlePageFriend.getEnterPasscodeToJoinRoomText(),
					expectedAssertionsProp.getProperty(LABEL_ENTER_PASSCODE_TO_JOIN_ROOM_IN_JOIN_ROOMS));
			frolicCreateBattlePageFriend.clickOnJoinRoomsButton();
			frolicCreateBattlePage.clickOnCloseIconButton();
			frolicCreateBattlePageFriend.clickOnStartGameButton();
			// frolicCreateBattlePage.clickOnAcceptChallengeButton();

		} catch (Exception e) {
			Assert.fail("Exception occured while verifying Record and Share In Create Battle Test : " + e.getMessage());
			logger.error("Exception occured while verifying Record and Share In Create Battle Test :", e);
		}

		logger.info("Ending of verify RecordAndShareInCreateBattle Test method");
	}

	@Test(priority = 7, description = "Live Stream In Create Battle Test")
	@Description("Live Stream In Create Battle Test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Live Stream In Create Battle Test")
	public void verifyLiveStreamInCreateBattleTest() {
		logger.info("Staring of verify LiveStreamInCreateBattleTest method");

		try {
			Thread.sleep(3);
			Assert.assertEquals(frolicCreateBattlePage.getPlayWithFriendsText(),
					expectedAssertionsProp.getProperty(PLAY_WITH_FRIENDS_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnCreateBattleButton();
			Assert.assertEquals(frolicCreateBattlePage.getSelectGameText(),
					expectedAssertionsProp.getProperty(LABEL_SELECT_GAME_IN_CREATE_BATTLE_ROOM));

			frolicCreateBattlePage.setSearchName(testDataProp.getProperty(SEARCH_WITH_GAME_NAME_IN_CREATE_BATTLE_ROOM));
			Assert.assertEquals(frolicCreateBattlePage.getSelectEntryFeesText(),
					expectedAssertionsProp.getProperty(LABEL_SELECT_ENTRY_FEES_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePage.clickOnCoinButton();
			frolicCreateBattlePage.clickOnCashButton();
			frolicCreateBattlePage.clickOnSeekBarButton();
			frolicCreateBattlePage.verticalScrollDown();
			frolicCreateBattlePage.clickOnLiveStreamToogleButton();
			frolicCreateBattlePage.clickOnCreateRoomButton();
			frolicCreateBattlePage.clickOnPlusIconButton();
			Assert.assertEquals(frolicCreateBattlePage.getSearchAndInvitePeopleText(),
					expectedAssertionsProp.getProperty(LABEL_SEARCH_AND_INVITE_PEOPLE_IN_CREATE_BATTLE));

			frolicCreateBattlePage
					.setSearchNameForUsers(testDataProp.getProperty(SEARCH_WITH_USER_NAME_IN_CREATE_BATTLE_ROOM));
			frolicCreateBattlePageFriend.clickOnMenuButton();
			frolicCreateBattlePageFriend.clickOnNotificationButton();
			frolicCreateBattlePageFriend.clickOnPushUpNotification();
			Assert.assertEquals(frolicCreateBattlePageFriend.getJoinBattleLabel(),
					expectedAssertionsProp.getProperty(LABEL_JOIN_BATTLE_IN_JOIN_ROOM));

			Assert.assertEquals(frolicCreateBattlePageFriend.getEnterPasscodeToJoinRoomText(),
					expectedAssertionsProp.getProperty(LABEL_ENTER_PASSCODE_TO_JOIN_ROOM_IN_JOIN_ROOMS));
			frolicCreateBattlePageFriend.clickOnJoinRoomsButton();
			frolicCreateBattlePage.clickOnCloseIconButton();
			frolicCreateBattlePageFriend.clickOnStartGameButton();
			// frolicCreateBattlePage.clickOnAcceptChallengeButton();

		} catch (Exception e) {
			Assert.fail("Exception occured while verifying  Live Stream In Create Battle Test : " + e.getMessage());
			logger.error("Exception occured while verifying Live Stream In Create Battle Test :", e);
		}

		logger.info("Ending of verify LiveStream In CreateBattle Test method");
	}

	// @Test(priority = 4, description = "Start Game")
	@Description("Start Game")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Start Game")
	public void verifyStartGameTest() {

		logger.info("Starting of verify Start Game Test method");

		try {
			/*
			 * Assert.assertEquals(newLoginPage.getUserNameText(),
			 * expectedAssertionsProp.getProperty(ERROR_MSG_ONE));
			 * 
			 * Assert.assertEquals(newLoginPage.getSuggestionsText(),
			 * expectedAssertionsProp.getProperty(SUGGESTIONS_LABEL));
			 * 
			 * newLoginPage.setValidUserName(testDataProp.getProperty("User.name.two"));
			 * 
			 * Assert.assertEquals(newLoginPage.getUserNameText(),
			 * expectedAssertionsProp.getProperty(SUCCESS_MSG_ONE));
			 * 
			 * newLoginPage.clickOnCreateAccount();
			 * 
			 * Assert.assertEquals(newLoginPage.getGamesText(),
			 * expectedAssertionsProp.getProperty(GAMES_LABEL));
			 */

			// frolicCreateBattlePage.setPasscodeInJoinRooms(testDataProp.getProperty(ENTER_PASSCODE_TEXT_IN_JOIN_ROOM));
			// frolicCreateBattlePage.clickOnAcceptChallengeButton();
		} catch (Exception e) {
			Assert.fail("Exception occured while testing  User Login : " + e.getMessage());
			logger.error("Exception occured while verifying User Login :", e);
		}

		logger.info("Ending of of verify verify Start Game Test  method");
	}

}
