package Tests;

import org.testng.annotations.Test;
import Base.RLConfig;
import Locator.rlLocators;
import Value.rlValue;

public class rlTest extends RLConfig {


	rlLocators rll= new rlLocators(driver);
	rlValue rlv= new rlValue();

	//rll.Rlpop

	@Test(enabled= false)
	public void Register() throws InterruptedException{
		System.out.println("test 1 started");
		App_log.info("Register");
		//Register 
		popup(rll.Rlpop);
		Thread.sleep(1500);
		clickByXpath(rll.Rlregister);
		typeByXpath(rll.Rlemail, rlv.Rlemailvalue);
		typeByXpath(rll.Rlpass, rlv.Rlpassvalue);
		typeByXpath(rll.Rlrepass, rlv.Rlpassconf);
		typeByXpath(rll.Rlcreate);
		System.out.println("test 1 done");
	}

	@Test(enabled= false)
	public void Shop1() throws InterruptedException{
		System.out.println("test 2 started");
		App_log.info("Shop1/Add to Cart");
		//Shop1
		Thread.sleep(3500);
		popup(rll.Rlpop);
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlmen);
		System.out.println("men link clicked ");
		
		Thread.sleep(5500);
		//waitByPage(rll.linkNewArrival());
		clickByXpath(rll.RlNewArv);
		System.out.println(" New arrival  link clicked ");
	
		Thread.sleep(1500);
		typeByXpath(rll.Rlsearch, rlv.Rlsearchvalue);
		System.out.println(" Search ");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlsearchsubmit);
		System.out.println(" Submit ");
		
		Thread.sleep(1500);
		clickByXpath(rll.RlJacketSuedeBomber);
		System.out.println(" Suede Bomber Jacket ");
		
		Thread.sleep(1500);
		clickByXpath(rll.RlsizeL);
		
		Thread.sleep(2500);
		clickByXpath(rll.Rladd2cart);
		System.out.println("test 2 done");
	}




	@Test(enabled=true)
	public void Shop2() throws InterruptedException{
		App_log.info("Shop2/Add to Cart");
		//Shop2
		Thread.sleep(3500);
		popup(rll.Rlpop);
		
		Thread.sleep(1500);
		typeByXpath(rll.Rlsearch, rlv.Rlsearchvalue2);
		System.out.println(" Search ");
		
		Thread.sleep(1500);
		clickByXpath(rll.Rlsearchsubmit);
		System.out.println(" Submit ");
		
		Thread.sleep(1500);
		clickByXpath(rll.RljacketSize);
		System.out.println(" 44 Regular ");
		
		Thread.sleep(2500);
		clickByXpath(rll.Rladd2cart);
		System.out.println("test 3 done");



	}


}




