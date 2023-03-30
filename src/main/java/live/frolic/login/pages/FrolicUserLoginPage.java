package live.frolic.login.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;

/*
 * @author b2btesters
*/

public class FrolicUserLoginPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app.debug:id/et_mobile_no")
	private WebElement txtPhoneNumber;

	@FindBy(id = "live.frolic.app.debug:id/tv_get_otp")
	private WebElement btnOtp;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Get Started']")
	private WebElement txtGetStarted;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Mobile Number']")
	private WebElement txtMobileNumber;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[1]/android.widget.EditText")
	private WebElement lblOtp;

	@FindBy(id = "live.frolic.app.debug:id/tv_verify")
	private WebElement btnVerify;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Welcome!']")
	private WebElement txtWelcome;

	@FindBy(id = "live.frolic.app.debug:id/et_username")
	private WebElement txtUserName;

	@FindBy(id = "live.frolic.app.debug:id/tv_error")
	private WebElement txtName;

	@FindBy(id = "live.frolic.app.debug:id/tv_suggestions")
	private WebElement txtSuggestions;

	@FindBy(id = "live.frolic.app.debug:id/et_referral")
	private WebElement txtReferral;

	@FindBy(id = "live.frolic.app.debug:id/tv_error_referral")
	private WebElement txtErrorMessage;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Create Account']")
	private WebElement btnCreateAccount;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement txtGames;

	@FindBy(id = "live.frolic.app.debug:id/tv_title")
	private WebElement txtBlockedState;

	@FindBy(id = "live.frolic.app.debug:id/simpleDraweeView3")
	private WebElement btnCloseIcon;

	@FindBy(xpath= "//android.widget.FrameLayout[@content-desc=\"Feed\"]")
	private WebElement tabFeed;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Choose a username that represents you.']")
	private WebElement txtChooseName;

	private static final Logger logger = Logger.getLogger(FrolicUserLoginPage.class.getName());

	public FrolicUserLoginPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of NewUserloginPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of NewUserloginPage method");
	}

	public String getGetStartedText() {
		logger.info("Starting of getGetStartedText method");

		logger.info("Ending of getGetStartedText method");

		return getText(txtGetStarted);
	}

	public String getMobileNumberText() {
		logger.info("Starting of getMobileNumberText method");

		logger.info("Ending of getMobileNumberText method");

		return getText(txtMobileNumber);
	}

	public String getChooseNameText() {
		logger.info("Starting of getChooseNameText method");

		logger.info("Ending of getChooseNameText method");

		return getText(txtChooseName);
	}

	public void setPhoneNumber(String mobileNumber) {
		logger.info("Starting of setPhoneNumber method");

		clear(txtPhoneNumber);

		clickOnElement(txtPhoneNumber);

		sendKeys(txtPhoneNumber, mobileNumber);

		driver.hideKeyboard();

		logger.info("Ending of setPhoneNumber method");
	}

	public void clickOnOtpButton() {
		logger.info("Starting of clickOnOtpButton method");

		clickOnElement(btnOtp);

		logger.info("Ending of clickOnOtpButton method");
	}

	public String getBlockedStateText() {
		logger.info("Starting of getBlockedStateText method");

		logger.info("Ending of getBlockedStateText method");

		return getText(txtBlockedState);
	}

	public void setOTP(String otpvalue) {
		logger.info("Starting of setOTP method");

		clickOnElement(lblOtp);

		this.lblOtp.sendKeys(otpvalue);

		driver.hideKeyboard();

		logger.info("Ending of setOTP method");
	}

	public void clickOnVerifyButton() {
		logger.info("Starting of clickOnVerifyButton method");

		clickOnElement(btnVerify);

		logger.info("Ending of clickOnVerifyButton method");
	}

	public void clickonFeedTab() {
		logger.info("Starting of clickonFeedTab method");

		clickOnElement(tabFeed);

		logger.info("Ending of clickonFeedTab method");
	}

	public void clickOnCloseIcon() {
		logger.info("Starting of clickOnCloseIcon method");

		clickOnElement(btnCloseIcon);

		logger.info("Ending of clickOnCloseIcon method");
	}

	public String getWelcomeText() {
		logger.info("Starting of getWelcomeText method");

		logger.info("Ending of getWelcomeText method");

		return getText(txtWelcome);
	}

	public void setInvalidUserName(String Username) {
		logger.info("Starting of setInvalidUserName method");

		clickOnElement(txtUserName);

		sendKeys(txtUserName, Username);

		driver.hideKeyboard();

		logger.info("Ending of setInvalidUserName method");
	}

	public void setValidUserName(String Username) {
		logger.info("Starting of setValidUserName method");

		clickOnElement(txtUserName);

		clear(txtUserName);

		sendKeys(txtUserName, Username);

		driver.hideKeyboard();

		logger.info("Ending of setValidUserName method");
	}

	public String getUserNameText() {
		logger.info("Starting of getUserNameText method");

		logger.info("Ending of getUserNameText method");

		return getText(txtName);
	}

	public String getSuggestionsText() {
		logger.info("Starting of getSuggestionsText method");

		logger.info("Ending of getSuggestionsText method");

		return getText(txtSuggestions);
	}

	public void setReferral(String Referral) {
		logger.info("Starting of setReferral method");
		try {
			clickOnElement(txtReferral);

			clear(txtReferral);

			sendKeys(txtReferral, Referral);

			driver.hideKeyboard();
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("Ending of setReferral method");
	}

	public String getErrorMsgText() {
		logger.info("Starting of getErrorMsgText method");

		logger.info("Ending of getErrorMsgText method");

		return getText(txtErrorMessage);
	}

	public void clickOnCreateAccount() {
		logger.info("Starting of btnCreateAccount method");

		clickOnElement(btnCreateAccount);

		logger.info("Ending of clickOnCreateAccount method");
	}

	public String getGamesText() {
		logger.info("Starting of getGamesText method");

		this.implicitWait();

		logger.info("Ending of getGamesText method");

		return getText(txtGames);
	
	}

	public boolean checkWelcomeText() {
		logger.info("Starting of checkWelcomeText method");

		this.explicitWait(txtWelcome);

		logger.info("Ending of checkWelcomeText method");

		return driver.getPageSource().contains("Welcome!");
	}

	public void userLogin(String mobileNumber, String otp) {
		logger.info("Starting of userLogin method");

		this.implicitWait();

		this.setPhoneNumber(mobileNumber);

		this.clickOnOtpButton();

		this.setOTP(otp);

		this.clickOnVerifyButton();

		logger.info("Ending of userLogin method");
	}

	public void redirectToMaintabs() {
		logger.info("Starting of redirectToMaintabs method");

		int i = 1;
		while (i <= 6) {
			try {
				if (tabFeed.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			this.hardback();
			i++;
		}

		logger.info("Ending of redirectToMaintabs method");
	}
}
