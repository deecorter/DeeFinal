package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.RLConfig;
import Locator.rlLocators;
import Value.rlValue;

public class rlTest extends RLConfig {


	rlLocators rll= new rlLocators(driver);
	rlValue rlv= new rlValue();

	//rll.Rlpop



	@Test (priority=1)
	public void SignIn () throws InterruptedException{
		System.out.println("Test 1 started");
		App_log.info("Sign in");
		//Shop1
		//Thread.sleep(3500);
		//popup(rll.Rlpop);
		Thread.sleep(2000);
		clickByXpath(rll.Rlregister);
		
		Thread.sleep(3500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		
		driver.navigate().refresh();
		Thread.sleep(2500);
		typeByXpath(rll.RlsignInemail, rlv.Rlemailvalue);
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlpass);
		typeByXpath(rll.Rlpass, rlv.Rlpassvalue);
		
		clickByXpath (rll.Rlsignin);
		System.out.println("Test 1 DONE");
		
	}
	
	@Test(priority=2)
	public void Shop1() throws InterruptedException{
		System.out.println("Test 2 started");
		App_log.info("Shop1/Add to Cart");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlsearchtop);
		System.out.println("Search clicked");
	
		Thread.sleep(1500);
		typeByXpath(rll.Rlsearch, rlv.Rlsearchvalue);
		System.out.println("Top left search clicked");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlsearchsubmit);
		System.out.println("Search submit");
		
		Thread.sleep(1500);
		clickByXpath(rll.RlJacketSuedeBomber);
		System.out.println("Suede Bomber Jacket search");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlselectsize);
		System.out.println("Select Size");
		
		Thread.sleep(3500);
		clickByXpath(rll.RlsizeL);
		System.out.println("Choose size");
		
		Thread.sleep(3500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2500);
		clickByXpath(rll.Rladd2cart);
		System.out.println("Added to cart");
		System.out.println("Test 2 done");
	}

	@Test (priority=3)
	public void Shop2() throws InterruptedException {
		App_log.info("Shop2/Add to Cart");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlsearchtop);
		System.out.println("Search clicked");
	
		Thread.sleep(3500);
		typeByXpath(rll.Rlsearch, rlv.Rlsearchvalue2);
		System.out.println("Search");
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlsearchsubmit);
		System.out.println("Submit");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlselectsize);
		System.out.println("Select Size");
		
		Thread.sleep(3500);
		clickByXpath(rll.RljacketSize);
		System.out.println("46 Size");
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlsecondsize);
		System.out.println("Second Size");
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlregularsize);
		System.out.println("Regular Size");
		
		Thread.sleep(3500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2500);
		clickByXpath(rll.Rladd2cart);
		System.out.println("Test 3 done");
	}
		
	@Test (priority=4)
	public void Checkout() throws InterruptedException{
		App_log.info("Checkout");
		
		Thread.sleep(3500);
		clickByXpath(rll.RlshoppingBag);
		System.out.println("Go to shopping bag");
		
		Thread.sleep(3500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(3500);
		clickByXpath(rll.RlCheckout);
		System.out.println("Checkout");
		System.out.println("Test 4 done");
		
		
	}
	
	@Test (priority=5)
	public void CreditCardinfor() throws InterruptedException{
		App_log.info("Credit Card Info");
		
		System.out.println("Payment info");
		
		Thread.sleep(15000);
		typeByXpath(rll.Rlfirstname, rlv.Rlfirstnamevalue);
		Thread.sleep(1500);
		typeByXpath(rll.Rllastname, rlv.Rllastnamevalue);
		Thread.sleep(1500);
		typeByXpath(rll.Rladdress, rlv.Rladdressvalue);
		Thread.sleep(1500);
		typeByXpath(rll.Rlcity, rlv.Rlcityvalue);
		Thread.sleep(3500);
		clickByXpath(rll.Rlstate);
		Thread.sleep(1500);
		typeByXpath(rll.Rlzipcode, rlv.Rlzicodevalue);
		Thread.sleep(1500);
		typeByXpath(rll.Rlphone, rlv.Rlphonevalue);
		
		Thread.sleep(3500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlcontinuecheckout);
		System.out.println("Continue Checkout");
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlralphlaurenhome);
		System.out.println("Ralph Lauren Home");
		System.out.println("Test 5 done");
		
	}
	
	@Test (priority=6)
	public void Logout() throws InterruptedException{
		App_log.info("Logout");
		
		Thread.sleep(3500);
		clickByXpath(rll.Rlback2account);
		System.out.println("My Account");
		
		Thread.sleep(3500);
		clickByXpath(rll.RlLogout);
		System.out.println("Log Out");
		System.out.println("Test 6 done");
		
	}

}




