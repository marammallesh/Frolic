package live.frolic.helpdesk.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import live.frolic.base.BaseFrolicAutomationPage;

/*
 * @author b2btesters
*/

public class FrolicHelpDeskPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app.debug:id/profileMenu")
	private WebElement btnMenu;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Help & Support']")
	private WebElement btnHelpDesk;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Helpdesk']")
	private WebElement txtHelpDesk;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement btnGeneral;

	@FindBy(id = "live.frolic.app.debug:id/tv_toolbar_title")
	private WebElement txtFaqs;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement btnAllFaqs;

	@FindBy(xpath = "//android.widget.TextView[@text = 'KYC']")
	private WebElement btnKyc;

	@FindBy(id = "live.frolic.app.debug:id/btn_back")
	private WebElement iconBack;

	@FindBy(id = "live.frolic.app.debug:id/tv_ticket_status")
	private WebElement btnOpen;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Games']")
	private WebElement btnGames;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Battles']")
	private WebElement btnBattles;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Tournaments']")
	private WebElement btnTournaments;

	@FindBy(xpath = "//android.widget.TextView[@text = 'GamePlays']")
	private WebElement btnGamePlays;

	@FindBy(id = "live.frolic.app.debug:id/tv_view_all_gameplays")
	private WebElement btnViewAllRecentActivity;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Recent Activity']")
	private WebElement txtRecentActivity;

	@FindBy(id = "live.frolic.app.debug:id/tv_view_all_faq")
	private WebElement btnViewAllFaqs;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Wallet']")
	private WebElement btnWallet;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Deposit']")
	private WebElement btnDeposit;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Withdrawals']")
	private WebElement btnWithdrawals;

	private static final Logger logger = Logger.getLogger(FrolicHelpDeskPage.class.getName());

	public FrolicHelpDeskPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of FrolicHelpDeskPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicHelpDeskPage method");
	}

	public void clickOnMenuButton() {
		logger.info("Starting of clickOnMenuButton method");

		clickOnElement(btnMenu);

		logger.info("Ending of clickOnMenuButton method");
	}

	public void clickOnHelpAndSupport() {
		logger.info("Starting of clickOnHelpAndSupport method");

		clickOnElement(btnHelpDesk);

		logger.info("Ending of clickOnHelpAndSupport method");
	}

	public void clickOnOpenButton() {
		logger.info("Starting of clickOnOpenButton method");

		clickOnElement(btnOpen);

		logger.info("Ending of clickOnOpenButton method");
	}

	public String getHelpDeskText() {
		logger.info("Starting of getHelpDeskText method");

		logger.info("Ending of getHelpDeskText method");

		return getText(txtHelpDesk);
	}

	public void clickOnGeneral() {
		logger.info("Starting of clickOnGeneral method");

		clickOnElement(btnGeneral);

		logger.info("Ending of clickOnGeneral method");
	}

	public String getFaqsText() {
		logger.info("Starting of getFaqsText method");

		logger.info("Ending of getFaqsText method");

		return getText(txtFaqs);
	}

	public void clickOnAllFaqs() throws InterruptedException {
		logger.info("Starting of clickOnAllFaqs method");

		List<WebElement> faq = driver.findElements(By.xpath("//android.view.ViewGroup[5]/android.widget.ImageView"));

		for (int i = 0; i < faq.size(); i++) {

			explicitWait(faq.get(i));
			clickOnElement(faq.get(i));
			clickOnElement(faq.get(i));

			logger.info("Ending of clickOnAllFaqs method");
		}
	}

	public void clickOnBackIcon() {
		logger.info("Starting of clickOnBackButton method");

		this.explicitWait(iconBack);
		clickOnElement(iconBack);

		logger.info("Ending of clickOnBackButton method");
	}

	public void clickOnKyc() {
		logger.info("Starting of clickOnKYC method");

		clickOnElement(btnKyc);

		logger.info("Ending of clickOnKYC method");
	}

	public String getKycText() {
		logger.info("Starting of getKycText method");

		logger.info("Ending of getKycText method");

		return getText(btnKyc);
	}

	public void clickOnGamesButton() {
		logger.info("Starting of clickOnGamesButton method");

		clickOnElement(btnGames);

		logger.info("Ending of clickOnGamesButton method");
	}

	public String getGamesText() {
		logger.info("Starting of getGamesText method");

		logger.info("Ending of getGamesText method");

		return getText(btnGames);
	}

	public void clickOnBattlesButton() {
		logger.info("Starting of clickOnBattlesButton method");

		clickOnElement(btnBattles);

		logger.info("Ending of clickOnBattlesButton method");
	}

	public String getBattlesText() {
		logger.info("Starting of getBattlesText method");

		logger.info("Ending of getBattlesText method");

		return getText(btnBattles);
	}

	public void clickOnTournaments() {
		logger.info("Starting of clickOnTournaments method");

		clickOnElement(btnTournaments);

		logger.info("Ending of clickOnTournaments method");
	}

	public String getTournamentsText() {
		logger.info("Starting of getTournamentsText method");

		logger.info("Ending of getTournamentsText method");

		return getText(btnTournaments);
	}

	public void clickOnGamePlays() {
		logger.info("Starting of clickOnGamePlays method");

		clickOnElement(btnGamePlays);

		logger.info("Ending of clickOnGamePlays method");
	}

	public void clickOnRecentActivityViewAllButton() {
		logger.info("Starting of clickOnRecentActivityViewAllButton method");

		clickOnElement(btnViewAllRecentActivity);

		logger.info("Ending of clickOnRecentActivityViewAllButton method");
	}

	public String getRecentActivityText() {
		logger.info("Starting of getRecentActivityText method");

		logger.info("Ending of getRecentActivityText method");

		return getText(txtRecentActivity);
	}

	public void clickOnViewAllFaqs() {
		logger.info("Starting of clickOnViewAllFaqs method");

		clickOnElement(btnViewAllFaqs);

		logger.info("Ending of clickOnViewAllFaqs method");
	}

	public String getGamePlaysText() {
		logger.info("Starting of getGamePlaysText method");

		logger.info("Ending of getGamePlaysText method");

		return getText(btnGamePlays);
	}

	public void clickOnWalletButton() {
		logger.info("Starting of clickOnWalletButton method");

		clickOnElement(btnWallet);

		logger.info("Ending of clickOnWalletButton method");
	}

	public String getWalletText() {
		logger.info("Starting of getWalletText method");

		logger.info("Ending of getWalletText method");

		return getText(btnWallet);
	}

	public void clickOnDepositButton() {
		logger.info("Starting of clickOnDepositButton method");

		clickOnElement(btnDeposit);

		logger.info("Ending of clickOnDepositButton method");
	}

	public String getDepositText() {
		logger.info("Starting of getDepositText method");

		logger.info("Ending of getDepositText method");

		return getText(btnDeposit);
	}

	public void clickOnWithdrawalsButton() {
		logger.info("Starting of clickOnWithdrawalsButton method");

		clickOnElement(btnWithdrawals);

		logger.info("Ending of clickOnWithdrawalsButton method");
	}

	public String getWithdrawalsText() {
		logger.info("Starting of getWithdrawalsText method");

		logger.info("Ending of getWithdrawalsText method");

		return getText(btnWithdrawals);
	}

	public void clickOnWithdrawalsAllFaqs() throws InterruptedException {
		logger.info("Starting of clickOnWithdrawalsAllFaqs method");

		List<WebElement> faq = driver.findElements(
				By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView"));
		System.out.println(faq.size());

		for (int i = 0; i < faq.size(); i++) {

			explicitWait(faq.get(i));
			clickOnElement(faq.get(i));
			clickOnElement(faq.get(i));
		}

		logger.info("Ending of clickOnWithdrawalsAllFaqs method");
	}

	public void redirectToHelpdeskLabel() {
		logger.info("Starting of redirectToHelpdeskLabel method");

		int i = 1;
		while (i <= 6) {
			try {
				if (txtHelpDesk.isDisplayed()) {
					break;
				}
			} catch (Exception e) {
			}
			this.hardback();
			i++;
		}

		logger.info("Ending of redirectToHelpdeskLabel method");
	}
}