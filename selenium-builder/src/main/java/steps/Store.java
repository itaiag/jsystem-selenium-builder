package steps;

import java.io.IOException;

import org.junit.Test;

import jsystem.framework.RunProperties;
import jsystem.framework.TestProperties;

public class Store extends AbstractSeleniumBuilderTestCase {

	private String variable;

	/**
	 * Store current URL
	 */
	@Test
	@TestProperties(name = "Store current URL in variable ${variable}", paramsInclude = { "variable" })
	public void storeCurrentUrl() throws IOException {
		RunProperties.getInstance().setRunProperty(variable, driver.getCurrentUrl());
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

}
