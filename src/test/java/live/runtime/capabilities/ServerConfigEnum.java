package live.runtime.capabilities;

public enum ServerConfigEnum {
	BROWSER_STACK("browserstack"), MOBILE_LAB("mobilelab"),	LOCAL("local"),LOCAL2("local1");

	private final String serverType;

	ServerConfigEnum(String filePath) {
		this.serverType = filePath;
	}

	public String getServerName() {
		return serverType;
	}
}
