package drivers;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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
			}
			return options;
		}

	},
	EDGE {

		@Override
		public WebDriver createDriver() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MutableCapabilities getOptions() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	SAFARI {

		@Override
		public WebDriver createDriver() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MutableCapabilities getOptions() {
			// TODO Auto-generated method stub
			return null;
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
				options.addArguments("--headless=new");
			}
			return options;
		}

	};

	public abstract WebDriver createDriver();

	public abstract MutableCapabilities getOptions();

}
