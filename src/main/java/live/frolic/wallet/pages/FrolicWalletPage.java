package live.frolic.wallet.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;

public class FrolicWalletPage extends BaseFrolicAutomationPage {

	//@FindBy(id = "live.frolic.app.debug:id/iv_wallet")
	@FindBy(xpath = "//android.widget.TextView[@text = 'Wallet']")
	private WebElement btnWallet;

	@FindBy(id = "live.frolic.app.debug:id/btn_transaction_history")
	private WebElement btnTransactionHistory;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Transaction']")
	private WebElement txtTran;

	@FindBy(xpath = "//android.widget.TextView[@text = 'BONUS CASH']")
	private WebElement btnBounus;

	@FindBy(id = "live.frolic.app.debug:id/btn_help_support")
	private WebElement btnHelp;

	@FindBy(id = "live.frolic.app.debug:id/btn_learn_more")
	private WebElement btnLearnMore;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Bonus cash']")
	private WebElement txtBonus;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Continue']")
	private WebElement txtContinue;

	@FindBy(xpath = "//android.widget.TextView[@text = 'My Wallet']")
	private WebElement txtMyWallet;

	@FindBy(id = "live.frolic.app.debug:id/tv_title")
	private WebElement txtBalanceAndTransactionDetails;

	@FindBy(id = "live.frolic.app.debug:id/tv_bonus_cash")
	private WebElement txtBonuscash;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Add Money']")
	private WebElement btnAddMoney;

	@FindBy(id = "//android.widget.TextView[@text = 'Cash Balance']")
	private WebElement txtCashBalence;

	@FindBy(xpath = "//android.widget.TextView[@text = '50']")
	private WebElement btnFifty;

	@FindBy(id = "live.frolic.app.debug:id/et_amnt")
	private WebElement txtAddMoney;

	@FindBy(id = "live.frolic.app.debug:id/tv_error")
	private WebElement txtErrorMsg;

	@FindBy(id = "live.frolic.app.debug:id/tv_view_all")
	private WebElement btnViewAllCoupons;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Scratch Cards']")
	private WebElement btnScratchcards;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Coupons & Offers']")
	private WebElement btnCoupons;

	@FindBy(id = "live.frolic.app.debug:id/tv_error")
	private WebElement txtErrorMsgCoupons;

	@FindBy(id = "live.frolic.app.debug:id/tv_coupon_apply")
	private WebElement btnApplyCoupon;

	@FindBy(id = "live.frolic.app.debug:id/btn_back")
	private WebElement btnBack;

	@FindBy(id = "live.frolic.app.debug:id/et_upi_address")
	private WebElement txtUpiId;

	@FindBy(id = "live.frolic.app.debug:id/tv_info_text")
	private WebElement txtUpiError;

	@FindBy(id = "live.frolic.app.debug:id/btn_continue")
	private WebElement btnContinue;

	@FindBy(xpath = "//android.widget.TextView[@text = 'BHIM UPI']")
	private WebElement txtBhimUpi;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Net Banking']")
	private WebElement btnNetBanking;

	@FindBy(id = "live.frolic.app.debug:id/chosen_bank_name")
	private WebElement btnSelectBank;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select your bank']")
	private WebElement txtSelectBank;

	@FindBy(xpath = "//android.widget.TextView[@text = 'If your bank is not shown above select one']")
	private WebElement txtSelectOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'City Union Bank']")
	private WebElement btnBank;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
	private WebElement btnScratchCard;

	@FindBy(id = "live.frolic.app.debug:id/btn_add_money")
	private WebElement btnPay;

	@FindBy(id = "live.frolic.app.debug:id/tv_ammount")
	private WebElement txtAmount;

	@FindBy(id = "live.frolic.app.debug:id/tv_transaction_message")
	private WebElement txtSeccessMessage;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Transaction Details']")
	private WebElement txtTransactionDetails;

	@FindBy(id = "live.frolic.app.debug:id/iv_share")
	private WebElement btnShare;

	@FindBy(xpath = "//android.widget.Button[@text = 'Failure']")
	private WebElement btnFailure;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private WebElement txtCouponsAndScrachCards;

	@FindBy(xpath = "//android.widget.TextView[@text = 'View all']")
	private WebElement txtViewAll;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[@text = 'Terms & Conditions']")
	private WebElement txtTnc;

	@FindBy(id = "live.frolic.app.debug:id/tv_info_text")
	private WebElement txtUpiUserName;

	@FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnAvailableUpi;

	@FindBy(id = "live.frolic.app.debug:id/error_text")
	private WebElement txtNoScratchCards;

	@FindBy(id = "live.frolic.app.debug:id/tv_available_coupon")
	private WebElement txtCouponsAvailable;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement txtNoCoupons;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'XP']")
	private WebElement txtXp;

	private static final Logger logger = Logger.getLogger(FrolicWalletPage.class.getName());

	public FrolicWalletPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
		logger.info("Starting of FrolicWalletPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicWalletPage method");
	}

	public void clickOnWalletButton() {
		logger.info("Starting of clickOnWalletButton method");

		this.implicitWait();

		clickOnElement(btnWallet);

		logger.info("Ending of clickOnWalletButton method");
	}

	public void clickOnScratchCard() {
		logger.info("Starting of clickOnScratchCard method");

		clickOnElement(btnScratchCard);

		logger.info("Ending of clickOnScratchCard method");
	}

	public String getCouponsAvailableText() {
		logger.info("Starting of clickOnScratchCard method");

		logger.info("Ending of clickOnScratchCard method");

		return getText(txtCouponsAvailable);
	}

	public String getXpText() {
		logger.info("Starting of getXpText method");

		logger.info("Ending of getXpText method");

		return getText(txtXp);
	}

	public void clickOnScratchCardsTab() {
		logger.info("Starting of clickOnScratchCardsTab method");

		clickOnElement(btnScratchcards);

		logger.info("Ending of clickOnScratchCardsTab method");
	}

	public String getMyWalletText() {
		logger.info("Starting of getMyWalletText method");

		logger.info("Ending of getMyWalletText method");

		return getText(txtMyWallet);
	}

	public String getNoScratchCardText() {
		logger.info("Starting of getNoScratchCardText method");

		logger.info("Starting of getNoScratchCardText method");

		return getText(txtNoScratchCards);
	}

	public String getNoCouponsText() {
		logger.info("Starting of getNoCouponsText method");

		logger.info("Starting of getNoCouponsText method");

		return getText(txtNoCoupons);
	}

	public String getAddMoneyText() {
		logger.info("Starting of getAddMoneyText method");

		logger.info("Ending of getAddMoneyText method");

		return getText(btnAddMoney);
	}

	public String getContinueText() {
		logger.info("Starting of getContinueText method");

		logger.info("Ending of getContinueText method");

		return getText(txtContinue);
	}

	public String getUpiNameText() {
		logger.info("Starting of getUpiNameText method");

		logger.info("Ending of getUpiNameText method");

		return getText(txtUpiUserName);
	}

	public String getTermsAndConditionstext() {
		logger.info("Starting of getTermsAndConditionstext method");

		logger.info("Ending of getTermsAndConditionstext method");

		return getText(txtTnc);
	}

	public String getCouponsAndScratchCardsText() {
		logger.info("Starting of getCouponsAndScratchCardsText method");

		logger.info("Ending of getCouponsAndScratchCardsText method");

		return getText(txtCouponsAndScrachCards);
	}

	public String getCheckBalanceAndTransactionDeatailsText() {
		logger.info("Starting of getCheckBalanceAndTransactionDeatailsText method");

		logger.info("Ending of getCheckBalanceAndTransactionDeatailsText method");

		return getText(txtBalanceAndTransactionDetails);
	}

	public String getBonusCashText() {
		logger.info("Starting of getBonusCashText method");

		logger.info("Ending of getBonusCashText method");

		return getText(txtBonuscash);
	}

	public void clickOnTransactionIcon() {
		logger.info("Starting of clickOnTransactionIcon method");

		clickOnElement(btnTransactionHistory);

		logger.info("Ending of clickOnTransactionIcon method");
	}

	public String getTransactionText() {
		logger.info("Starting of getTransactionText method");

		logger.info("Ending of getTransactionText method");

		return getText(txtTran);
	}

	public void clickOnHelpIcon() {
		logger.info("Starting of clickOnHelpIcon method");

		clickOnElement(btnHelp);

		logger.info("Ending of clickOnHelpIcon method");
	}

	public void clickOnLearnMoreButton() {
		logger.info("Starting of clickOnLearnMoreButton method");

		clickOnElement(btnLearnMore);

		logger.info("Ending of clickOnLearnMoreButton method");
	}

	public String getBonusText() {
		logger.info("Starting of getTextBonus method");

		logger.info("Ending of getTextBonus method");

		return getText(txtBonus);
	}

	public void clickOnAddMoneyButton() {
		logger.info("Starting of clickOnAddMoneyButton method");

		clickOnElement(btnAddMoney);

		logger.info("Ending of clickOnAddMoneyButton method");
	}

	public String getCashBalanceText() {
		logger.info("Starting of getCashBalanceText method");

		logger.info("Ending of getCashBalanceText method");

		return getText(txtBalanceAndTransactionDetails);
	}

	public void clickOnAddSelectedAmount() {
		logger.info("Starting of clickOnAddSelectedAmount method");

		List<WebElement> addMoney = driver.findElements(By.xpath(
				"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[1]"));
		try {
			for (int i = 0; i < addMoney.size(); i++) {

				explicitWait(addMoney.get(i));

				clickOnElement(addMoney.get(i));
			}
		} catch (Exception e) {

			clickOnElement(btnFifty);
		}

		logger.info("Ending of clickOnAddSelectedAmount method");
	}

	public void setAddMoney(String amount) {
		logger.info("Starting of setAddMoney method");

		clear(txtAddMoney);

		clickOnElement(txtAddMoney);

		sendKeys(txtAddMoney, amount);

		driver.hideKeyboard();

		logger.info("Ending of setAddMoney method");
	}

	public String getErrorMessageText() {
		logger.info("Starting of getErrorMessageText method");

		logger.info("Ending of getErrorMessageText method");

		return getText(txtErrorMsg);
	}

	public String getEnteredAmountText() {
		logger.info("Starting of getEnteredAmountText method");

		logger.info("Ending of getEnteredAmountText method");

		return getText(txtAddMoney);
	}

	public void clickOnFiftyButton() {
		logger.info("Starting of clickOnFiftyButton method");

		clickOnElement(btnFifty);

		logger.info("Ending of clickOnFiftyButton method");
	}

	public boolean GetTextViewAll() {
		logger.info("Starting of clickOnViewAllCoupons method");

		txtViewAll.isEnabled();

		logger.info("Ending of clickOnViewAllCoupons method");
		return false;
	}

	public void clickOnViewAllCoupons() {
		logger.info("Starting of clickOnViewAllCoupons method");

		clickOnElement(btnViewAllCoupons);

		logger.info("Ending of clickOnViewAllCoupons method");
	}

	public String getErrorMessageCouponsText() {
		logger.info("Starting of getErrorMessageCouponsText method");

		logger.info("Ending of getErrorMessageCouponsText method");

		return getText(txtErrorMsgCoupons);
	}

	public void clickOnApplyCode() {
		logger.info("Starting of clickOnApplyCode method");

		clickOnElement(btnApplyCoupon);

		logger.info("Ending of clickOnApplyCode method");
	}

	public void clickOnBackButton() {
		logger.info("Starting of clickOnBackButton method");

		this.implicitWait();

		clickOnElement(btnBack);

		logger.info("Ending of clickOnBackButton method");
	}

	public String getCouponsAndOffersText() {
		logger.info("Starting of getCouponsAndOffersText method");

		logger.info("Ending of getCouponsAndOffersText method");

		return getText(btnCoupons);
	}

	public void clickOnCouponsAndOffers() {
		logger.info("Starting of clickOnCouponsAndOffers method");

		clickOnElement(btnCoupons);

		logger.info("Ending of clickOnCouponsAndOffers method");
	}

	public void clickOnContinueButton() throws InterruptedException {
		logger.info("Starting of clickOnContinueButton method");

		this.androidScrollUsingText(getContinueText());

		clickOnElement(btnContinue);

		logger.info("Ending of clickOnContinueButton method");
	}

	public String getBhimUpiText() {
		logger.info("Starting of getBhimUpiText method");

		logger.info("Ending of getBhimUpiText method");

		return getText(txtBhimUpi);
	}

	public void clickOnNetBanking() throws InterruptedException {
		logger.info("Starting of clickOnNetBanking method");

		androidScrollUsingText("Net Banking");

		clickOnElement(btnNetBanking);

		logger.info("Ending of clickOnNetBanking method");
	}

	public void clickOnNetBankingCards() {
		logger.info("Starting of clickOnNetBankingCards method");

		List<WebElement> card = driver.findElements(By
				.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView"));

		for (int i = 0; i < card.size(); i++) {

			clickOnElement(card.get(i));

		}

		logger.info("Ending of clickOnNetBankingCards method");
	}

	public void clickOnSelectYourBankHere() {
		logger.info("Starting of clickOnSelectYourBankHere method");

		scroll();

		clickOnElement(btnSelectBank);

		logger.info("Ending of clickOnSelectYourBankHere method");
	}

	public String getSelectOneText() {
		logger.info("Starting of getSelectOneText method");

		logger.info("Ending of getSelectOneText method");

		return getText(txtSelectOne);
	}

	public String getSelectYourBankText() {
		logger.info("Starting of getSelectYourBankText method");

		logger.info("Ending of getSelectYourBankText method");

		return getText(txtSelectBank);
	}

	public void setUpiId(String upi) {
		logger.info("Starting of setUpiId method");

		clear(txtUpiId);

		clickOnElement(txtUpiId);

		sendKeys(txtUpiId, upi);

		driver.hideKeyboard();

		logger.info("Ending of setUpiId method");
	}

	public void clickOnSelectdBank() {
		logger.info("Starting of clickOnSelectdBank method");

		clickOnElement(btnBank);
		this.scroll();

		logger.info("Ending of clickOnSelectdBank method");
	}

	public String getSelectedBankText() {
		logger.info("Starting of getSelectedBankText method");

		logger.info("Ending of getSelectedBankText method");

		return getText(btnSelectBank);
	}

	public void clickOnAvailableUpi() throws InterruptedException {
		logger.info("Starting of clickOnAvailableUpi method");

		verticalScrollDown();

		clickOnElement(btnAvailableUpi);

		logger.info("Ending of clickOnAvailableUpi method");
	}

	public String getUpiErrorMessageText() {
		logger.info("Starting of getUpiErrorMessageText method");

		logger.info("Ending of getUpiErrorMessageText method");

		return getText(txtUpiError);
	}

	public void clickOnPayButton() {
		logger.info("Starting of clickOnPayButton method");

		explicitWait(btnPay);

		clickOnElement(btnPay);

		logger.info("Ending of clickOnPayButton method");
	}

	public String getSuccessMessageText() {
		logger.info("Starting of getTextSccessMessage method");

		logger.info("Ending of getTextSccessMessage method");

		return getText(txtSeccessMessage);
	}

	public String getTransactionDetailsText() {
		logger.info("Starting of getTransactionDetailsText method");

		logger.info("Ending of getTransactionDetailsText method");

		return getText(txtTransactionDetails);
	}

	public void clickOnShareIcon() {
		logger.info("Starting of clickOnShareIcon method");

		clickOnElement(btnShare);

		clickOnBackButton();

		logger.info("Ending of clickOnShareIcon method");
	}

	public void clickOnFailureButton() {
		logger.info("Starting of clickOnFailureButton method");

		clickOnElement(btnFailure);

		logger.info("Ending of clickOnFailureButton method");
	}

	public boolean checkNoScratchCardsText() {
		logger.info("Starting of checkNoScratchCardsText method");

		this.explicitWait(txtNoScratchCards);

		logger.info("Ending of checkNoScratchCardsText method");

		return driver.getPageSource().contains("No Scratch Card Available");
	}

	public boolean checkNoCouponsAvailable() {
		logger.info("Starting of checkNoCouponsAvailable method");

		this.explicitWait(txtNoCoupons);

		logger.info("Ending of checkNoCouponsAvailable method");

		return driver.getPageSource().contains("No Coupon Available");
	}

	public boolean checkCouponsAvailableText() {
		logger.info("Starting of checkCouponsAvailableText method");

		this.explicitWait(txtCouponsAvailable);

		logger.info("Ending of checkCouponsAvailableText method");

		return driver.getPageSource().contains("Available Coupons");
	}

	public boolean checkScratchCardAvalilable() {
		logger.info("Starting of checkScratchCardAvalilable method");

		this.explicitWait(txtXp);

		logger.info("Ending of checkScratchCardAvalilable method");

		return driver.getPageSource().contains("XP");
	}

	public void redirectToAddMoney() {
		logger.info("Starting of redirectToAddMoney method");

		int i = 1;
		while (i <= 6) {
			try {
				if (btnAddMoney.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			this.hardback();
			i++;
		}

		logger.info("Ending of redirectToAddMoney method");
	}

}