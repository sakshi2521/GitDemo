package StepDefination;



import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import PageObject.LandingPage;
import PageObject.OfferPage;
import Utils.SharedObjects;
import io.cucumber.java.en.Then;

public class OfferPageStepDefination {
	//single responsibility principle
	public SharedObjects variable;
	public OfferPageStepDefination(SharedObjects variable)
	{
		this.variable=variable;
	}
	
	@Then("^user searched for same shortname (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
		OfferPage offerPage = variable.pageObjectManager.getOffersPage();
		
	   
		switchToOfferPage();
	 	offerPage.searchForProduct(shortname);
	 Thread.sleep(2000);
	 
	variable.offerProduct = offerPage.getProductNameAvailableInOffer();
	System.err.println(variable.offerProduct);
	}
	
	public void switchToOfferPage()
	{
		LandingPage landingPage = variable.pageObjectManager.getLandingPage();
		
		landingPage.goToOfferPage();
		variable.genericUtils.switchToWindow();
		
		 
	}
	
	@Then("validate if it is same as in the home page product")
	public void validate_searched_product_in_home_and_offer_page()
	{
		Assert.assertEquals(variable.offerProduct, variable.productName);
		
	}
}
