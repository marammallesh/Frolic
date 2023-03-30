package frolic_prod.settings.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrolicSettingsPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app:id/profileMenu")
	private WebElement tabMenu;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Settings']")
	private WebElement lblSettings;

	@FindBy(id = "live.frolic.app:id/sw_privacy")
	private WebElement btnPrivateToggle;

	@FindBy(id = "live.frolic.app:id/sw_push_notifications")
	private WebElement btnPushToggle;

	@FindBy(id = "live.frolic.app:id/img_edit")
	private WebElement icnEdit;

	@FindBy(id = "live.frolic.app:id/seek_bar")
	private WebElement getSeekBar;

	@FindBy(id = "oplus:id/drag_view")
	private WebElement target;

	@FindBy(id = "live.frolic.app:id/tv_contact_us")
	private WebElement lblContactUs;

	@FindBy(id = "live.frolic.app:id/btn_share")
	private WebElement btnShare;

	@FindBy(id = "live.frolic.app:id/tv_delete_account")
	private WebElement btnDelete;

	@FindBy(id = "live.frolic.app:id/btn_remove")
	private WebElement btnConfirmDelete;

	@FindBy(id = "live.frolic.app:id/btn_done")
	private WebElement icnDone;

	@FindBy(id = "live.frolic.app:id/tv_privacy")
	private WebElement lblPrivateAccount;

	@FindBy(id = "live.frolic.app:id/tv_push_notifications")
	private WebElement lblPushNotifications;

	@FindBy(id = "live.frolic.app:id/tv_daily_limit")
	private WebElement lblDailyLimit;

	@FindBy(id = "live.frolic.app:id/tv_blocked_users")
	private WebElement lblBlockedUsers;

	@FindBy(id = "live.frolic.app:id/tv_title")
	private WebElement txtSetLimit;

	@FindBy(id = "live.frolic.app:id/btn_ok")
	private WebElement btnOk;

	@FindBy(id = "live.frolic.app:id/tv_share_profile")
	private WebElement lblShareProfile;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Need help? Send Us Your Query!']")
	private WebElement txtNeedHelp;

	private static final Logger logger = Logger.getLogger(FrolicSettingsPage.class.getName());

	public FrolicSettingsPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of FrolicSettingsPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicSettingsPage method");
	}

	public void SetLimit() {
		logger.info("Starting of SetLimit method");

		WebElement slider = driver.findElement(By.id("live.frolic.app:id/seek_bar"));
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(slider, 154, 0).build();
		action.perform();

		logger.info("Starting of SetLimit method");
	}

	public String getPrivateAccountText() {
		logger.info("Starting of getPrivateAccountText method");

		logger.info("Ending of getPrivateAccountText method");

		return getText(lblPrivateAccount);
	}

	public String getNeedHelptext() {
		logger.info("Starting of getNeedHelptext method");

		logger.info("Ending of getNeedHelptext method");

		return getText(txtNeedHelp);
	}

	public String getPushNotificationText() {
		logger.info("Starting of getPushNotificationText method");

		logger.info("Ending of getPushNotificationText method");

		return getText(lblPushNotifications);
	}

	public String getDailyLimitText() {
		logger.info("Starting of getDailyLimitText method");

		logger.info("Ending of getDailyLimitText method");

		return getText(lblDailyLimit);
	}

	public void clickOnBlockedUsers() {
		logger.info("Starting of clickOnBlockedUsers method");

		clickOnElement(lblBlockedUsers);

		logger.info("Ending of clickOnBlockedUsers method");
	}

	public void clickOnDoneIcon() {
		logger.info("Starting of clickOnDoneIcon method");

		this.explicitWait(icnDone);

		if (icnDone.isEnabled()) {
			clickOnElement(icnDone);
		}

		logger.info("Ending of clickOnDoneIcon method");
	}

	public void clickOnOkButton() {
		logger.info("Starting of clickOnOkButton method");

		clickOnElement(btnOk);

		logger.info("Ending of clickOnOkButton method");
	}

	public String getBlockedUsersText() {
		logger.info("Starting of getBlockedUsersText method");

		logger.info("Ending of getBlockedUsersText method");

		return getText(lblBlockedUsers);
	}

	public String getShareProfileText() {
		logger.info("Starting of getShareProfileText method");

		logger.info("Ending of getShareProfileText method");

		return getText(lblShareProfile);
	}

	public String getSetLimitText() {
		logger.info("Starting of getSetLimitText method");

		logger.info("Ending of getSetLimitText method");

		return getText(txtSetLimit);
	}

	public String getContactUsText() {
		logger.info("Starting of getContactUsText method");

		logger.info("Ending of getContactUsText method");

		return getText(lblContactUs);
	}

	public void clickOnContachUs() {
		logger.info("Starting of clickOnContachUs method");

		clickOnElement(lblContactUs);

		logger.info("Ending of clickOnContachUs method");
	}

	public void clickOnMenuTab() {
		logger.info("Starting of clickOnMenuTab method");

		clickOnElement(tabMenu);

		logger.info("Ending of clickOnMenuTab method");
	}

	public void clickOnSettingslabel() {
		logger.info("Starting of clickOnSettingslabel method");

		clickOnElement(lblSettings);

		logger.info("Ending of clickOnSettingslabel method");
	}

	public void clickOnPrivateToggle() {
		logger.info("Starting of clickOnPrivateToggle method");

		clickOnElement(btnPrivateToggle);

		logger.info("Ending of clickOnPrivateToggle method");
	}

	public void clickOnPushNotificationToggle() {
		logger.info("Starting of clickOnPushNotificationToggle method");

		clickOnElement(btnPushToggle);

		logger.info("Ending of clickOnPushNotificationToggle method");
	}

	public void clickOnEditIcon() {
		logger.info("Starting of clickOnEditIcon method");

		clickOnElement(icnEdit);

		logger.info("Starting of clickOnEditIcon method");

	}

	/*
	 * public void getSeekBar() { logger.info("Starting of clickOnEditIcon method");
	 * 
	 * clickOnElement(getSeekBar);
	 * 
	 * clickOnElement(target);
	 * 
	 * 
	 * logger.info("Starting of clickOnEditIcon method"); }
	 */

	public void clickOnDeleteAccount() {
		logger.info("Starting of clickOnDeleteAccount method");

		clickOnElement(btnDelete);

		logger.info("Starting of clickOnDeleteAccount method");

	}

	public void clickOnDeleteConfirmbutton() {
		logger.info("Starting of clickOnDeleteConfirmbutton method");

		clickOnElement(btnConfirmDelete);

		logger.info("Starting of clickOnDeleteConfirmbutton method");

	}
}
