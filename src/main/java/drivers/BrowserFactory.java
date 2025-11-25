package drivers;

import static java.lang.Boolean.TRUE;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import Exceptions.HeadlessNotSupportedException;
import constants.FrameworkConstants;

public enum BrowserFactory {

	CHROME {

		@Override
		public WebDriver createDriver() {

			return new ChromeDriver(getOptions());
		}

		@Override
		public ChromeOptions getOptions() {
			ChromeOptions options = new ChromeOptions();

			if (Boolean.valueOf(FrameworkConstants.headLessState) == true) {
				options.addArguments("--headless=new");
				options.addArguments("--headless=new");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1880,1000");
			}
			return options;
		}

	},
	EDGE {

		@Override
		public WebDriver createDriver() {

			return new EdgeDriver(getOptions());
		}

		@Override
		public EdgeOptions getOptions() {
			EdgeOptions options = new EdgeOptions();

			if (Boolean.valueOf(FrameworkConstants.headLessState) == true) {
				options.addArguments("--headless=new");
				options.addArguments("--headless=new");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1880,1000");
			}
			return options;
		}


	},
	SAFARI {

		@Override
		public WebDriver createDriver() {
			return new SafariDriver(getOptions());
		}

		@Override
		public SafariOptions getOptions() {
			SafariOptions options = new SafariOptions();

			options.setAutomaticInspection(false);

            if (TRUE.equals(Boolean.valueOf(FrameworkConstants.headLessState)))
                throw new HeadlessNotSupportedException(options.getBrowserName());

            return options;
		}

	},
	FIREFOX {

		@Override
		public WebDriver createDriver() {

			return new FirefoxDriver(getOptions());

		}

		@Override
		public FirefoxOptions getOptions() {
			FirefoxOptions options = new FirefoxOptions();

			if (Boolean.valueOf(FrameworkConstants.headLessState) == true) {
				options.addArguments("--headless");
				options.addArguments("--width=1920");
                options.addArguments("--height=1080");
			}
			return options;
		}

	};

	public abstract WebDriver createDriver();

	public abstract MutableCapabilities getOptions();

}
