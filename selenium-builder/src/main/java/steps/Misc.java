package steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import jsystem.framework.TestProperties;
import jsystem.framework.report.ReporterHelper;

public class Misc extends AbstractSeleniumBuilderTestCase {

	private int implictWaitInSec = 30;

	@Test
	@TestProperties(name = "Add cookie", paramsInclude = { "" })
	public void addCookie() {

	}

	@Test
	@TestProperties(name = "Set implicit wait to ${implictWaitInSec} seconds", paramsInclude = { "implictWaitInSec" })
	public void setImplictWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	@TestProperties(name = "Take screenshot")
	public void takeScreenshot() throws Exception {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File source = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		ReporterHelper.copyFileToReporterAndAddLink(report, source, "Screenshot");
	}

	public int getImplictWaitInSec() {
		return implictWaitInSec;
	}

	public void setImplictWaitInSec(int implictWaitInSec) {
		this.implictWaitInSec = implictWaitInSec;
	}

}
