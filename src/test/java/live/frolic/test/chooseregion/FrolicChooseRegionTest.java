package live.frolic.test.chooseregion;

import static live.frolic.util.Constants.*;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.chooseregion.pages.FrolicChooseRegionPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import live.frolic.test.BaseTestAutomation;

/*
 * @author b2btesters
*/

@Epic("Frolic Choose Region")
@Feature("Frolic Choose Region Functionality")
public class FrolicChooseRegionTest extends BaseTestAutomation {

	private static final Logger logger = Logger.getLogger(FrolicChooseRegionTest.class.getName());

	private FrolicChooseRegionPage chooseRegion = null;
	private FrolicUserLoginPage newUserLoginPage = null;

	@BeforeClass
	@Parameters({ "deviceIndex" })
	public void initClass(String deviceIndex) throws Exception {
		logger.info("Starting of initClass method in FrolicChooseRegionTest");

		this.chooseRegion = new FrolicChooseRegionPage(driver);
		this.newUserLoginPage = new FrolicUserLoginPage(driver);

		logger.info("Ending  of initClass method in FrolicChooseRegionTest");

	}

	@Test(priority = 1, description = "Choose Region Test of frolic app")
	@Description("Choose Region Test of frolic app")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Choose Region Test of frolic app")

	public void chooseRegion() throws InterruptedException {

		logger.info("Starting of chooseRegion");

		try {
			chooseRegion.clickOnMenuTab();

			Assert.assertEquals(chooseRegion.getAboutUsText(), expectedAssertionsProp.getProperty(ABOUT_US_LABEL));

			chooseRegion.clickOnSettings();

			Assert.assertEquals(chooseRegion.getSettingsText(), expectedAssertionsProp.getProperty(SETTINGS_LABEL));

			chooseRegion.clickOnEditIcon();

			Assert.assertEquals(chooseRegion.getChooseYourLocationText(),
					expectedAssertionsProp.getProperty(SELECT_YOUR_LOCATION_LABEL));

			chooseRegion.clickOnTargetRegion();

			Assert.assertEquals(chooseRegion.getLocationText(), expectedAssertionsProp.getProperty(LOCATION_LABEL));

			chooseRegion.clickOnOkButton();

			Assert.assertEquals(chooseRegion.getSettingsText(), expectedAssertionsProp.getProperty(SETTINGS_LABEL));

			chooseRegion.clickOnBackIcon();

			Assert.assertEquals(chooseRegion.getAboutUsText(), expectedAssertionsProp.getProperty(ABOUT_US_LABEL));

			chooseRegion.clickonGamesTab();

			Assert.assertEquals(newUserLoginPage.getGamesText(), expectedAssertionsProp.getProperty(GAMES_LABEL));

		} catch (Exception e) {

			Assert.fail("Exception occured while testing  Choose Region : " + e.getMessage());

			logger.error("Exception occured while verifying Choose Region :", e);
		}

		logger.info("Ending  of chooseRegion");
	}
}
