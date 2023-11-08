package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.SharedObjects;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	SharedObjects sharedObject;
	WebDriver driver;
	
	public Hooks(SharedObjects sharedObject) throws IOException
	{
		this.sharedObject=sharedObject;
		driver=sharedObject.testbase.initializeDriver();
	}
	
	@After
	public void tearDown() throws IOException
	{
		driver.quit();
	}
	
	@AfterStep
	public void captureScreenshot(Scenario sc) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		byte[] fileContent =FileUtils.readFileToByteArray(source);
		sc.attach(fileContent, "image/png", sc.getName());
	}
}
