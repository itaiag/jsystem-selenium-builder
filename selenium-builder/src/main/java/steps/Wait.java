package steps;

import jsystem.framework.TestProperties;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends AbstractSeleniumBuilderTestCase {

	private String url;

	private String title;

	private int timeOutInSec = 60;

	private String text;

	private By by;

	private String locator;

	private WebDriverWait wait;

	@Before
	public void setUp() {
		wait = new WebDriverWait(driver, timeOutInSec);
	}

	/**
	 * Wait for URL
	 */
	@Test
	@TestProperties(name = "Wait for url ${url} for ${timeOutInSec} seconds", paramsInclude = { "url", "timeOutInSec" })
	public void waitForCurrentUrl() {

	}

	@Test
	@TestProperties(name = "Wait for title ${title} for ${timeOutInSec} seconds", paramsInclude = { "title",
			"timeOutInSec" })
	public void waitForTitle() {
		wait.until(ExpectedConditions.titleContains(title));
	}

	@Test
	@TestProperties(name = "Wait for text in element ${by}:${locator} to be '${text}' for ${timeOutInSec} seconds", paramsInclude = {
			"by", "locator", "text", "timeOutInSec" })
	public void waitForText() {
		WebElement element = findElement(by, locator);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getTimeOutInSec() {
		return timeOutInSec;
	}

	public void setTimeOutInSec(int timeOutInSec) {
		this.timeOutInSec = timeOutInSec;
	}

}
