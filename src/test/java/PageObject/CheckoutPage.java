package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutPage {

	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By promoCode= By.cssSelector(".promoCode");
private By placeOrderBtn = By.xpath("//button[.='Place Order']");
	private By promoInfo = By.cssSelector(".promoInfo");
	private By promoBtn = By.cssSelector(".promoBtn");
	private By checkoutProductName = By.cssSelector(".product-name");
	private By checkoutProductQty = By.cssSelector(".quantity");
private By checkout =By.xpath("//button[.='PROCEED TO CHECKOUT']");
	
	public void goToCheckoutPage()
	{
		driver.findElement(checkout).click();
	}
	public void applyPromoCode(String promocode)
	{
		driver.findElement(promoCode).sendKeys(promocode);
		driver.findElement(promoBtn).click();
		}
	
	public void proceedToPlaceTheOrder()
	{
		driver.findElement(placeOrderBtn).click();
	}
	
	public boolean verifyPromoInformation()
	{
		return driver.findElement(promoInfo).isDisplayed();
	}
	
	
	public boolean verifyPlaceOrder()
	{
	return	driver.findElement(placeOrderBtn).isDisplayed();
	}
	
	
	public String getCheckoutProductName()
	{
		 return driver.findElement(checkoutProductName).getText().split("-")[0].trim();
		 
	}
	
	public String getCheckoutProductQty()
	{
		 return driver.findElement(checkoutProductQty).getText();
		 
	}
	
}
