package StepDefination;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LandingPage;
import PageObjectManager.PageObjectManager;
import Utils.SharedObjects;
import Utils.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageStepDefination {
	
	public  SharedObjects variable;
	LandingPage landingPage ;
	//public PageObjectManager pageObjectManager;
	public LandingPageStepDefination(SharedObjects variable)
	{
		
		this.variable=variable;
		landingPage=variable.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on greencart home page")
	public void user_is_on_greencart_home_page() throws IOException {
			System.err.println("Landing Page GitDemo");
			System.err.println("Practising git");
		
			
			System.out.println("Changes done by user 1");
		Assert.assertTrue(landingPage.getTitleOfLadingPage().contains("GreenKart"));
	}
	@When("^user searched with shortname (.+) and extracted actual product$")
	public void user_searched_with_shortname_and_extracted_actual_product(String string) throws InterruptedException {
		 landingPage = variable.pageObjectManager.getLandingPage();
		landingPage.searchProduct(string);
	   Thread.sleep(3000);
	   variable.productName= landingPage.getProductName().split("-")[0].trim();
	   System.err.println("Extracted Product Name : "+ variable.productName);
	
	   
	}
	
	@When("adds product to cart with quantity {string}")
	public void add_product_to_cart(String qty) throws InterruptedException
	{
		landingPage.incrementProductQuantity(Integer.parseInt(qty));
		landingPage.addProductToCart();
		Thread.sleep(2000);
		 landingPage.gotoCartPage();
	}
	
}
