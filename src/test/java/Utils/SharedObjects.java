package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectManager.PageObjectManager;

public class SharedObjects {

	//public WebDriver driver;
		public  String productName;
		public  String offerProduct;
		public String checkoutProduct;
		
	public TestBase testbase;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	
	public SharedObjects() throws IOException
	{
		testbase=new TestBase();
		pageObjectManager=new PageObjectManager(testbase.initializeDriver());
		genericUtils=new GenericUtils(testbase.initializeDriver());
	}
}
