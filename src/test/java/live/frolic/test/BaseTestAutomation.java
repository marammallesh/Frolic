package live.frolic.test;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import io.appium.java_client.Setting;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import live.frolic.environment.config.reader.EnvironmentConfigReader;
import live.frolic.util.TestListener;
import live.frolic.vo.MobileConfigurationVO;
import live.runtime.capabilities.DriverCapabilities;
import live.runtime.capabilities.DriverCapabilitiesFactory;

/**
 * @author b2btesters
*/

@Listeners(TestListener.class)
public class BaseTestAutomation {
	private static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());
	protected static AndroidDriver<WebElement> driver = null;
	protected static AndroidDriver<WebElement> driver1 = null;

	protected static Map<String, AndroidDriver<WebElement>> driversMap = new HashMap<String, AndroidDriver<WebElement>>();
	protected MobileConfigurationVO mobileConfigurationVO = null;
	protected static Properties testDataProp = null;
	protected static Properties expectedAssertionsProp = null;

	public enum SCREEN_ID {
		LOGIN_SCREEN, FEWQUESTIONS_SCREEN, DASHBOARD_SCREEN, OTP_SCREEN, AMOUNT_SCREEN, EKYC_SCREEN, AGREEMENT_SCREEN,
		POST_SCREEN, BROWSERSTACK, LOCAL, MOBILE_LAB;
	}

	@BeforeSuite
	public void initTestData() {
		logger.info("Starting of method initTestData in BaseFrolicAutomationtest");

		if (testDataProp == null) {
			FileReader testDataReader = null;
			FileReader assertionsReader = null;

			try {
				testDataReader = new FileReader("src/main/resources/testdata.properties");
				assertionsReader = new FileReader("src/main/resources/expectedassertions.properties");

				testDataProp = new Properties();
				testDataProp.load(testDataReader);

				expectedAssertionsProp = new Properties();
				expectedAssertionsProp.load(assertionsReader);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					testDataReader.close();
					assertionsReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		logger.info("Ending of method initTestData in BaseFrolicAutomationtest");
	}

	protected synchronized void initMobileDriver(String deviceIndex) throws Exception {
		logger.info("Starting of method initMobileDriver in BaseFrolicAutomationtest");

		EnvironmentConfigReader environmentConfigReader = new EnvironmentConfigReader();
		DriverCapabilitiesFactory capFactory = new DriverCapabilitiesFactory();
		DriverCapabilities driverCapabilities = capFactory.getCapabilities(environmentConfigReader.getServer(),
				deviceIndex);
		DesiredCapabilities cap = null;
		cap = driverCapabilities.capabilities();
		System.out.println(cap);
		String url = environmentConfigReader.getServerURL();
		System.out.println(environmentConfigReader.getServerURL());
		driver = new AndroidDriver<WebElement>(new URL(environmentConfigReader.getServerURL()), cap);
		driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1);
		logger.info(deviceIndex);
		driversMap.put(deviceIndex, driver);
		driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1);

		logger.info("Ending of method initMobileDriver in BaseFrolicAutomationtest");
	}
	protected synchronized void initMobileDriver1(String deviceIndex,AndroidDriver<WebElement> driver1) throws Exception {
		logger.info("Starting of method initMobileDriver in BaseFrolicAutomationtest");

		EnvironmentConfigReader environmentConfigReader = new EnvironmentConfigReader();
		DriverCapabilitiesFactory capFactory = new DriverCapabilitiesFactory();
		DriverCapabilities driverCapabilities = capFactory.getCapabilities(environmentConfigReader.getServer(),
				deviceIndex);
		DesiredCapabilities cap = null;
		cap = driverCapabilities.capabilities();
		System.out.println(cap);
		String url = environmentConfigReader.getServerURL();
		driver1 = new AndroidDriver<WebElement>(new URL(environmentConfigReader.getServerURL()), cap);
		driver1.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1);
		logger.info(deviceIndex);
		driversMap.put(deviceIndex, driver);
		driver1.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1);

		logger.info("Ending of method initMobileDriver in BaseFrolicAutomationtest");
	}
	

	protected synchronized AndroidDriver<WebElement> getMobileDriver(String driverKey) throws Exception {
		logger.info("Starting of method getMobileDriver in BaseFrolicAutomationtest");

		driver = driversMap.get(driverKey);
		// Use existing driver
		if (driver == null) {
			logger.error("Driver not initialized, Please call initDriver Method. Before calling getDriver ");
			throw new Exception("Drivier not initialized");

		}
		// Otherwise create new driver

		logger.info("Ending of method getMobileDriver in BaseFrolicAutomationtest");
		return driver;
	}

	protected synchronized void quitMobileDriver(String deviceIndex) {
		logger.info("Starting of method quitDriver in BaseFrolicAutomationtest");

		AndroidDriver<WebElement> driver = null;
		driver = (AndroidDriver<WebElement>) driversMap.get(deviceIndex);
		try {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			driver = null;
		}

		logger.info("Ending of method quitDriver in BaseFrolicAutomationtest");
	}

	public void resetApp() {
		logger.info("Starting of resetApp method");

		driver.resetApp();

		logger.info("Ending of resetApp method");
	}

	public void hardWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public WebDriver getChildWebDriver() {
		return driver;
	}
	protected synchronized AndroidDriver<WebElement> initMobileDriver2(String deviceIndex,AndroidDriver<WebElement> driver1) throws Exception {
		logger.info("Starting of method initMobileDriver in BaseFrolicAutomationtest");

		EnvironmentConfigReader environmentConfigReader = new EnvironmentConfigReader();
		DriverCapabilitiesFactory capFactory = new DriverCapabilitiesFactory();
		DriverCapabilities driverCapabilities = capFactory.getCapabilities(environmentConfigReader.getServer(),
				deviceIndex);
		DesiredCapabilities cap = null;
		cap = driverCapabilities.capabilities();
		System.out.println(cap);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
		String url = environmentConfigReader.getServerURL();
		driver1 = new AndroidDriver<WebElement>(new URL(environmentConfigReader.getServerURL()), cap);
		driver1.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1);
		logger.info(deviceIndex);
		driversMap.put(deviceIndex, driver);
		driver1.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1);

		logger.info("Ending of method initMobileDriver in BaseFrolicAutomationtest");
return driver1;	
	}
}
