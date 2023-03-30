package live.runtime.capabilities;

public enum ConfigFilePathEnum {
	BROWSER_STACK("src/main/resources/browserstack.conf.json"), MOBILE_LAB("src/main/resources/mobilelab.conf.json"),
	LOCAL("src/main/resources/local.conf.json"), SERVER_CONFIG("src/main/resources/config.json"),LOCAL1("src/main/resources/local.config2.json");
;

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
