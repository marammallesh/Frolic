package live.runtime.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverCapabilities {
	
	DesiredCapabilities capabilities() throws Exception;

	
}
