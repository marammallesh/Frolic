package live.runtime.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

public class B2BTestersMobileLabCapabilities implements DriverCapabilities {
	
	private String deviceIndex = null;
	private String configFilePath = null;
	private CapabilityBuider capabilities = null;

	public B2BTestersMobileLabCapabilities(String configFilePath, String deviceIndex) {
		
		this.configFilePath = configFilePath;
		this.deviceIndex = deviceIndex;
	}
	
	@BeforeSuite
	public DesiredCapabilities capabilities() throws Exception {
		this.capabilities = new CapabilityBuider();
		return capabilities.setUp(this.configFilePath,deviceIndex);
	}

	

}
