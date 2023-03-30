package frolic_prodtest.capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

public class CapabilityBuider {
	public static final Logger logger = Logger.getLogger(CapabilityBuider.class.getName());
	public AndroidDriver<AndroidElement> driver;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DesiredCapabilities setUp(String configFilePath, String deviceIndex) throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject config = (JSONObject) parser.parse(new FileReader(configFilePath));
		JSONArray envs = (JSONArray) config.get("environments");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		Map<String, String> envCapabilities = (Map<String, String>) envs.get(Integer.parseInt(deviceIndex) - 1);
		Iterator it = envCapabilities.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
			System.out.println(pair.getKey().toString() + ":" + pair.getValue().toString());
		}

		Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
		System.out.println("***********" + System.getProperty("BS_APP_URL") + "**************");

		it = commonCapabilities.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if (capabilities.getCapability(pair.getKey().toString()) == null) {
				System.out.println(pair.getKey().toString() + ":" + pair.getValue().toString());
				capabilities.setCapability(pair.getKey().toString(), pair.getValue());

			}

			if (configFilePath.contains("browserstack")) {

				capabilities.setCapability("browserstack.user", System.getenv("BS_USER"));
				capabilities.setCapability("browserstack.key", System.getenv("BS_KEY"));
				capabilities.setCapability("app", System.getenv("BS_APP_URL"));
				/*
				 * capabilities.setCapability("browserstack.user", "anuragkishore_fyDTvx");
				 * capabilities.setCapability("browserstack.key", "Lu9E3hRupppxVmo5hDrf");
				 * capabilities.setCapability("app",
				 * "bs://a848d3a97c119a554acd3c39026f8f0445c5d789");
				 */
			}
		}
		return capabilities;
	}

}
