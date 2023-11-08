package StepDefination;


import org.junit.Assert;

import PageObject.CheckoutPage;
import PageObject.LandingPage;
import Utils.SharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPageStepDefination {

	public  SharedObjects variable;
	public CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefination(SharedObjects variable)
	{
		this.variable=variable;
		checkoutPage=variable.pageObjectManager.getCheckoutPage();
	}


	  
	   
	   @Then("^User proceeds to checkout and validate product in checkout page$")
	   public void proceed_to_checkout_and_validate_product() throws InterruptedException
	   {
		  checkoutPage.goToCheckoutPage();
		   variable.checkoutProduct=checkoutPage.getCheckoutProductName();
		   System.err.println( variable.checkoutProduct);
		   System.err.println(checkoutPage.getCheckoutProductQty());
		   Assert.assertEquals(variable.checkoutProduct, variable.productName);
		   Thread.sleep(2000);
	   }
	
	   @Then("^User has the provision to apply the (.+) and place the order$")
	   public void apply_promocode_and_place_order(String promocode)
	   {
		  
		   checkoutPage.applyPromoCode(promocode);
			 
			  checkoutPage.proceedToPlaceTheOrder();
			  
	   }
}
