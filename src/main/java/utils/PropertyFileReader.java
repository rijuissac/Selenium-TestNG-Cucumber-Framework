package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	private static Properties properties;
	private static String configFileName = "src/test/resources/config/config.properties";

	public static Properties loadPropertyFile() {

		FileInputStream file;
		try {
			properties = new Properties();
			file = new FileInputStream(configFileName);
			properties.load(file);
			System.out.println(properties.get("URL_HOME"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed Load property file");
		}
		return properties;

	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
