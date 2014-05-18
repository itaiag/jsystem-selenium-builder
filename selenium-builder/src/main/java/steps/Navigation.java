package steps;

import jsystem.framework.TestProperties;

import org.junit.Test;

public class Navigation extends AbstractSeleniumBuilderTestCase {

	private String url;

	private boolean maximizeWindow = true;

	/**
	 * Navigate to the given URL.
	 */
	@Test
	@TestProperties(name = "Navigate to ${url}", paramsInclude = { "url", "maximizeWindow" })
	public void get() {
		driver.get(url);
		driver.manage().window().maximize();
	}

	/**
	 * Refresh page
	 */
	@Test
	@TestProperties(name = "Refresh page", paramsInclude = { "" })
	public void refresh() {
		driver.navigate().refresh();
	}

	/**
	 * Go back a page
	 */
	@Test
	@TestProperties(name = "Go back", paramsInclude = { "" })
	public void goBack() {
		driver.navigate().back();
	}

	/**
	 * Go forward a page
	 */
	@Test
	@TestProperties(name = "Go forward", paramsInclude = { "" })
	public void goForward() {
		driver.navigate().forward();
	}

	/**
	 * End Selenium script
	 */
	@Test
	@TestProperties(name = "Close", paramsExclude = { "" })
	public void close() {
		driver.close();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isMaximizeWindow() {
		return maximizeWindow;
	}

	public void setMaximizeWindow(boolean maximizeWindow) {
		this.maximizeWindow = maximizeWindow;
	}

}
