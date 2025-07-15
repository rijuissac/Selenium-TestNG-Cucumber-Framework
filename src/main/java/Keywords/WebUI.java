package Keywords;

import drivers.DriverManager;

public class WebUI {
	
	
	public static void getUrl(String URL)
	{
		DriverManager.getDriver().get(URL);
		
	}


}
