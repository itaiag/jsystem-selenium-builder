package steps;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import jsystem.framework.TestProperties;
import junit.framework.Assert;

public class Assertion extends AbstractSeleniumBuilderTestCase {

	private String url;
	private By by;
	private String locator;
	private String text;

	/**
	 * Assert current URL
	 */
	@Test
	@TestProperties(name = "Assert current url is ${url}", paramsInclude = { "url" })
	public void assertCurrentUrl() {
		Assert.assertEquals(url, driver.getCurrentUrl());
	}

	/**
	 * Asserts that the given element contains exactly the given text. If this
	 * is not the case, script execution will stop and be marked as failed.
	 */
	@Test
	@TestProperties(name = "Assert text '${text}' in element ${by}:${locator}", paramsInclude = { "by", "locator","text" })
	public void assertText() {
		WebElement element = findElement(by, locator);
		Assert.assertEquals(text, element.getText());
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public By getBy() {
		return by;
	}

	public void setBy(By by) {
		this.by = by;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
