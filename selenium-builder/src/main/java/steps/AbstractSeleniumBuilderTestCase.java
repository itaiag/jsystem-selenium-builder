package steps;

import infra.WebDriverFactory;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.SystemTestCase4;

public abstract class AbstractSeleniumBuilderTestCase extends SystemTestCase4 {

	protected WebDriver driver;

	public enum By {
		ID, LINK_TEXT, PARTIAL_LINK_TEXT, NAME, TAG_NAME, XPATH, CLASS_NAME, CSS_SELECTOR
	}

	@Before
	public void setUp() throws Exception {
		WebDriverFactory factory = (WebDriverFactory) system.getSystemObject("webdriver");
		driver = factory.buildDriver();
	}

	protected WebElement findElement(By by, String locator) {
		report.report("About to find element by " + by.name() + ":" + locator);
		switch (by) {
		case CLASS_NAME:
			return driver.findElement(org.openqa.selenium.By.className(locator));
		case CSS_SELECTOR:
			return driver.findElement(org.openqa.selenium.By.cssSelector(locator));
		case ID:
			return driver.findElement(org.openqa.selenium.By.id(locator));
		case LINK_TEXT:
			return driver.findElement(org.openqa.selenium.By.linkText(locator));
		case NAME:
			return driver.findElement(org.openqa.selenium.By.name(locator));
		case PARTIAL_LINK_TEXT:
			return driver.findElement(org.openqa.selenium.By.partialLinkText(locator));
		case TAG_NAME:
			return driver.findElement(org.openqa.selenium.By.tagName(locator));
		case XPATH:
			return driver.findElement(org.openqa.selenium.By.xpath(locator));
		}
		throw new IllegalArgumentException("Unknown by " + by);
	}

}
