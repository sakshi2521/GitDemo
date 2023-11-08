package PageObjectManager;

import org.openqa.selenium.WebDriver;

import PageObject.CheckoutPage;
import PageObject.LandingPage;
import PageObject.OfferPage;

public class PageObjectManager {

	public WebDriver driver;
	public LandingPage landingPage;
	public  OfferPage offersPage;
	public CheckoutPage checkoutPage;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage()
	{
		return landingPage=new LandingPage(driver);
	}
	
	public OfferPage getOffersPage()
	{
		return offersPage=new OfferPage(driver);
	}
	
	public CheckoutPage getCheckoutPage()
	{
		return checkoutPage=new CheckoutPage(driver);
	}
}
