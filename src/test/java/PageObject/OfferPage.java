package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;
	
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchFeildOfOfferPage =By.id("search-field");
	By productAvailableInOffer = By.cssSelector("tr td:nth-child(1)");
	
	
	public void searchForProduct(String productText)
	{
		driver.findElement(searchFeildOfOfferPage).sendKeys(productText);
	}
	
	public String getProductNameAvailableInOffer()
	{
		return driver.findElement(productAvailableInOffer).getText();
	}
	
	
}
