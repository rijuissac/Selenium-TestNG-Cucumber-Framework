package constants;

import utils.PropertyFileReader;

public class FrameworkConstants {
	
	public static final String browser = "BROWSER";
	public static final String headLessState = PropertyFileReader.getProperty("HEADLESS");
	public static final int WAIT_PAGE_LOADED = Integer.parseInt(PropertyFileReader.getProperty("WAIT_PAGE_LOADED"))*1000;


}
