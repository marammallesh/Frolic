package frolic_prodtest.capabilities;

public class DriverCapabilitiesFactory {

	public DriverCapabilities getCapabilities(String environmentType, String deviceIndex) {

		if (environmentType == null) {
			return null;
		} else if (environmentType.contains(ServerConfigEnum.BROWSER_STACK.getServerName())) {
			return new BrowserStackCapabilities(ConfigFilePathEnum.BROWSER_STACK.getConfigFilePath(), deviceIndex);
		} else if (environmentType.contains(ServerConfigEnum.LOCAL.getServerName())) {
			return new LocalCapabilities(ConfigFilePathEnum.LOCAL.getConfigFilePath(), deviceIndex);
		} else if (environmentType.contains(ServerConfigEnum.MOBILE_LAB.getServerName())) {
			return new B2BTestersMobileLabCapabilities(ConfigFilePathEnum.MOBILE_LAB.getConfigFilePath(), deviceIndex);
		}

		return null;
	}

}
