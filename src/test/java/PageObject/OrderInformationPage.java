package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderInformationPage {

	public WebDriver driver;
	
	public OrderInformationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By countryDropdown= By.tagName("select");
	private By checkAgree = By.cssSelector(".chkAgree");
	private By proceedBtn = By.xpath("//button[.='Proceed']");
	public void selectCountryName(String countryName)
	{
	WebElement dropdown=	driver.findElement(countryDropdown);
	dropdown.click();
	dropdown.sendKeys(countryName);
		
	}
	
public void agreeToTermsAndConditions()
{
	driver.findElement(checkAgree).click();
	driver.findElement(proceedBtn).click();
}
	

}
