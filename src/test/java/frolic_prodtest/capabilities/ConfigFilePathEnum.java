package frolic_prodtest.capabilities;

public enum ConfigFilePathEnum {
	BROWSER_STACK("src/main/resources_prod/browserstack.conf.json"), MOBILE_LAB("src/main/resources_prod/mobilelab.conf.json"),
	LOCAL("src/main/resources_prod/local.conf.json"), SERVER_CONFIG("src/main/resources_prod/config.json");

	private final String path;

	ConfigFilePathEnum(String string) {
		this.path = string;
	}

	public String getConfigFilePath() {
		// (otherName == null) check is not needed because name.equals(null) returns
		// false
		return path;
	}
}
