package drivers;

public class BrowserConfig {
	
	private static final ThreadLocal<String> browser = new ThreadLocal<>();

    public static void setBrowser(String value) {
        browser.set(value.toUpperCase());
    }

    public static String getBrowser() {
        return browser.get();
    }

    public static void clear() {
        browser.remove();
    }

}
