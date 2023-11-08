package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By searchProduct = By.cssSelector(".search-keyword");
	private By productName = By.cssSelector("h4.product-name");
	private By offerPageLink = By.xpath("//a[@href='#/offers']");
	private By cartPage = By.xpath("//img[@alt='Cart']");
private By cartBtn = By.xpath("//button[.='ADD TO CART']");
private By increment = By.className("increment");
	public void searchProduct(String productText)
	{
		driver.findElement(searchProduct).sendKeys(productText);;
	}
	
	public void getSearchText()
	{
		driver.findElement(searchProduct).getText();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void goToOfferPage()
	{
		driver.findElement(offerPageLink).click();
	}
	
	public void gotoCartPage()
	{
		driver.findElement(cartPage).click();
	}
	
	public void addProductToCart()
	{
		driver.findElement(cartBtn).click();
	}
	
	public String getTitleOfLadingPage()
	{
		return driver.getTitle();
	}
	
	public void incrementProductQuantity(int qty)
	{
		
		for(int i=1;i<qty;i++)
		{
			
		driver.findElement(increment).click();
		}
	}
}
