package infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jsystem.framework.system.SystemObjectImpl;

public class WebDriverFactory extends SystemObjectImpl {

	private WebDriver driver;

	private String browserType;

	@Override
	public void init() throws Exception {
		super.init();
		driver = new FirefoxDriver();
	}

	public WebDriver buildDriver() {
		return driver;
	}

	@Override
	public void close() {
		if (driver != null) {
			driver.quit();
		}
	}

	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

}
