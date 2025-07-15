package constants;

import utils.PropertyFileReader;

public class FrameworkConstants {
	
	public static final String browser = "BROWSER";
	public static final String headLessState = PropertyFileReader.getProperty("HEADLESS");

}
