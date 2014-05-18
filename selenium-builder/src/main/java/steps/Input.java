package steps;

import jsystem.framework.TestProperties;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Input extends AbstractSeleniumBuilderTestCase {

	private By by;
	private String locator;
	private By targetBy;
	private String targetLocator;
	private String text;
	private boolean clearTextBefore = true;

	/**
	 * Click an element on the current page.
	 */
	@Test
	@TestProperties(name = "Click element ${by}:${locator}", paramsInclude = { "by", "locator" })
	public void clickElement() {
		findElement(by, locator).click();
	}

	/**
	 * Click an element on the current page twice.
	 */
	@Test
	@TestProperties(name = "Double click element ${by}:${locator}", paramsInclude = { "by", "locator" })
	public void doubleClickElement() {
		new Actions(driver).doubleClick(findElement(by, locator)).doubleClick().perform();
	}

	/**
	 * Move the mouse cursor over the given element.
	 */
	@Test
	@TestProperties(name = "Mouse over element ${by}:${locator}", paramsInclude = { "by", "locator" })
	public void mouseOverElement() {
		new Actions(driver).moveToElement(findElement(by, locator)).perform();

	}

	/**
	 * Set the text content of the given element.
	 */
	@Test
	@TestProperties(name = "Set element ${by}:${locator} text to '${text}'", paramsInclude = { "by", "locator", "text" })
	public void setElementText() {
		throw new IllegalStateException("Unimplemenetd");
	}

	/**
	 * Type text into an element on the current page.
	 */
	@Test
	@TestProperties(name = "Send keys '${text}' to element ${by}:${locator}", paramsInclude = { "by", "locator",
			"text", "clearTextBefore" })
	public void sendKeysToElement() {
		WebElement element = findElement(by, locator);
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Select an element. If it's a check box or radio button, it will become
	 * ticked. If it's an option inside a <select>, that option will become the
	 * chosen one. If it's an option inside a multi-select, that option will be
	 * added to the selection.
	 */
	@Test
	@TestProperties(name = "Set element ${by}:${locator} selected", paramsInclude = { "by", "locator" })
	public void setElementSelected() {
		throw new IllegalStateException("Unimplemenetd");
	}

	/**
	 * Un-select an element. If it's a check box, it will become not ticked. If
	 * it's an option inside a multi-select, that option will be removed from
	 * the selection.
	 */
	@Test
	@TestProperties(name = "Set element ${by}:${locator} not selected", paramsInclude = { "by", "locator" })
	public void setElementNotSelected() {
		throw new IllegalStateException("Unimplemenetd");
	}

	/**
	 * Clears the selections in a multi-select element.
	 */
	@Test
	@TestProperties(name = "Clear element ${by}:${locator} selection", paramsInclude = { "by", "locator" })
	public void clearSelections() {
		throw new IllegalStateException("Unimplemenetd");
	}

	/**
	 * Submits the form the targeted element is a part of. The element does not
	 * have to be the submit button - it can be any field or the form itself.
	 */
	@Test
	@TestProperties(name = "Submit element ${by}:${locator}", paramsInclude = { "by", "locator" })
	public void submitElement() {
		findElement(by, locator).submit();
	}

	/**
	 * Drags and drops an element onto another element.
	 */
	@Test
	@TestProperties(name = "Drag element ${by}:${locator} and drop on ${targetBy}:${targetLocator}", paramsInclude = {
			"by", "locator", "targetBy", "targetLocator" })
	public void dragToAndDropElement() {
		new Actions(driver).dragAndDrop(findElement(by, locator), findElement(targetBy, targetLocator)).perform();
	}

	/**
	 * Stops holding down the virtual mouse button.
	 */
	@Test
	@TestProperties(name = "Release element ${by}:${locator} ", paramsInclude = { "by", "locator" })
	public void releaseElement() {
		new Actions(driver).release(findElement(by, locator)).perform();
	}

	/**
	 * Starts clicking on an element but does not release the virtual mouse
	 * button.
	 */
	@Test
	@TestProperties(name = "Click and hold element ${by}:${locator}", paramsInclude = { "by", "locator" })
	public void clickAndHoldElement() {
		new Actions(driver).clickAndHold(findElement(by, locator));
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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

	public By getTargetBy() {
		return targetBy;
	}

	public void setTargetBy(By targetBy) {
		this.targetBy = targetBy;
	}

	public String getTargetLocator() {
		return targetLocator;
	}

	public void setTargetLocator(String targetLocator) {
		this.targetLocator = targetLocator;
	}

	public boolean isClearTextBefore() {
		return clearTextBefore;
	}

	public void setClearTextBefore(boolean clearTextBefore) {
		this.clearTextBefore = clearTextBefore;
	}

}
