package steps;

import jsystem.framework.TestProperties;
import junit.framework.Assert;

import org.junit.Test;

public class Verify extends AbstractSeleniumBuilderTestCase{
	
	private String url;

	/**
	 * Verify current URL
	 */
	@Test
	@TestProperties(name = "Verify current url is ${url}", paramsInclude = { "url" })
	public void verifyCurrentUrl() {
		Assert.assertEquals(url, driver.getCurrentUrl());
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
