package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.RLConfig;
import Locator.rlLocators;
import Value.rlValue;
import jdk.internal.org.objectweb.asm.TypePath;

public class rlTest extends RLConfig {
	
	
	rlLocators rll= new rlLocators();
	rlValue rlv= new rlValue();
	
	
	
	@Test
	public void popup(){
		App_log.info("popup test started");
	//close popup
		clickByXpath(rll.Rlpop);
		
	}

	@Test
	public void Register(){
		App_log.info("Register");
	//Register 
		clickByXpath(rll.Rlregister);
		typeByXpath(rll.Rlemail, rlv.Rlemailvalue);
		typeByXpath(rll.Rlpass, rlv.Rlpassvalue);
		typeByXpath(rll.Rlrepass, rlv.Rlpassconf);
		typeByXpath(rll.Rlcreate);
		
	}

	@Test
	public void Shop1(){
		App_log.info("Shop1/Add to Cart");
	//Shop1
		clickByXpath(rll.Rlmen);
		clickByXpath(rll.RlNewArv);
		clickByXpath(rll.RlJacket);
		clickByXpath(rll.RlsizeL);
		clickById(rll.Rladd2cart);
	}
	@Test
	public void Shop2(){
		App_log.info("Shop2/Add to Cart");
	//Shop2
		clickByXpath(rll.Rlmen);
		clickByXpath(rll.RlActiveWear);
		clickByXpath(rll.RlFleece);
		clickByXpath(rll.Rlcolor);
		clickByXpath(rll.RlFleeSize);
		clickById(rll.Rladd2cart);
		
	
		
	}


}


	

