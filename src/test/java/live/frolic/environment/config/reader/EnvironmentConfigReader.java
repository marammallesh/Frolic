package live.frolic.environment.config.reader;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import live.runtime.capabilities.ConfigFilePathEnum;
import live.runtime.capabilities.ServerConfigEnum;

/**
 * @author b2btesters
*/

public class EnvironmentConfigReader {

	private String server = null;
	private String serverURL = null;
	private JSONObject config = null;
	
	public static final Logger logger = Logger.getLogger(EnvironmentConfigReader.class.getName());
	
	public EnvironmentConfigReader() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		this.config = (JSONObject) parser.parse(new FileReader(ConfigFilePathEnum.SERVER_CONFIG.getConfigFilePath()));
		logger.info(config.toJSONString());
	}

	public String getServer() {
		this.server = (String) config.get("server");
		return this.server;
	}

	public String getServerURL() {
		logger.info(this.server);
		ArrayList<JSONObject> serverURLs = (ArrayList<JSONObject>) config.get("urls");
		
		if (server.contains(ServerConfigEnum.BROWSER_STACK.getServerName())) {
			this.serverURL = (String) serverURLs.get(0).get("browserstackURL");
		} else if (server.contains(ServerConfigEnum.LOCAL.getServerName())) {
			this.serverURL = (String) serverURLs.get(1).get("localURL");
			logger.info(this.serverURL);
		} else if (server.contains(ServerConfigEnum.MOBILE_LAB.getServerName())) {
			this.serverURL = (String) serverURLs.get(2).get("mobilelabURL");
		}
		return this.serverURL;
	}
}
