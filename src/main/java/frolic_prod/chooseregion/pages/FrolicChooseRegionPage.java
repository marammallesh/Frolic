package frolic_prod.chooseregion.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @author b2btesters
*/

public class FrolicChooseRegionPage extends BaseFrolicAutomationPage {

	@FindBy(id = "live.frolic.app:id/profileMenu")
	private WebElement menuTab;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Settings']")
	private WebElement btnSettigs;

	@FindBy(id = "live.frolic.app:id/img_edit_state")
	private WebElement btnEditIcon;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Dadra and Nagar Haveli and Daman and Diu']")
	private WebElement btnTargetRegion;

	@FindBy(id = "live.frolic.app:id/btn_exit")
	private WebElement btnOk;

	@FindBy(id = "live.frolic.app:id/btn_back")
	private WebElement btnBackIcon;

	@FindBy(id = "live.frolic.app:id/games")
	private WebElement tabGames;

	@FindBy(xpath = "//android.widget.TextView[@text = 'About Us']")
	private WebElement txtAboutUs;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Settings']")
	private WebElement txtSettings;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select Your Location']")
	private WebElement txtSelectYourLocation;

	@FindBy(id = "live.frolic.app:id/tv_title")
	private WebElement txtLocation;

	private static final Logger logger = Logger.getLogger(FrolicChooseRegionPage.class.getName());

	public FrolicChooseRegionPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);

		logger.info("Starting of FrolicChallengePlayLater method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicChallengePlayLater method");
	}

	public void clickOnMenuTab() {
		logger.info("Starting of clickOnMenuTab method");

		clickOnElement(menuTab);

		logger.info("Ending of the clickOnMenuTab method");
	}

	public String getAboutUsText() {
		logger.info("Starting of getAboutUsText method");

		logger.info("Ending of the getAboutUsText method");

		return getText(txtAboutUs);
	}

	public String getChooseYourLocationText() {
		logger.info("Starting of getChooseYourLocationText method");

		logger.info("Ending of the getChooseYourLocationText method");

		return getText(txtSelectYourLocation);
	}

	public void clickOnSettings() {
		logger.info("Starting of clickOnSettings method");

		clickOnElement(btnSettigs);

		logger.info("Ending of the clickOnSettings method");
	}

	public String getSettingsText() {
		logger.info("Starting of getSettingsText method");

		logger.info("Ending of the getSettingsText method");

		return getText(txtSettings);
	}

	public String getLocationText() {
		logger.info("Starting of getLocationText method");

		logger.info("Ending of the getLocationText method");

		return getText(txtLocation);
	}

	public void clickOnEditIcon() {
		logger.info("Starting of clickOnEditIcon method");

		clickOnElement(btnEditIcon);

		logger.info("Ending of the clickOnEditIcon method");
	}

	public void clickOnTargetRegion() {
		logger.info("Starting of clickOnTargetRegion method");

		clickOnElement(btnTargetRegion);

		logger.info("Ending of the clickOnTargetRegion method");
	}

	public void clickOnOkButton() {
		logger.info("Starting of clickOnOkButton method");

		clickOnElement(btnOk);

		logger.info("Ending of the clickOnOkButton method");
	}

	public void clickOnBackIcon() {
		logger.info("Starting of clickOnBackIcon method");

		clickOnElement(btnBackIcon);

		logger.info("Ending of the clickOnBackIcon method");
	}

	public void clickonGamesTab() {
		logger.info("Starting of clickonGamesTab method");

		clickOnElement(tabGames);

		logger.info("Ending of the clickonGamesTab method");
	}
}
