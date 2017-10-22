package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rlLocators {
	
	WebDriver driver;
	
	public rlLocators(WebDriver driver){
		this.driver=driver;
	}

	//clicksByXpath
	public String Rlpop= "//map[@id[contains(.,('ltBoxMap'))]]//area[1]";
	public String Rlregister= "//li[@class='user-info user-logout']//a[@title='Login']";
	public String Rlsignin= "//div[@class='form-row form-row-button login-bottom-row']//button[@type='submit']";
	public String Rlmen= "//a[@class='has-sub-menu'][.='Men']";
	public String RlNewArv= "//div[@id='left-nav']//ul[@class='nav-items']//a[.='New Arrivals']";
	public String Rlsearchtop= "//div[@id='search']//a[@aria-controls='Header_SearchFlyout']";
	public String Rlsearchsubmit= "//button[@type='submit']";
	public String RlJacketSuedeBomber= "//a[@title='Go to Product: Suede Bomber Jacket']";
	public String Rlselectsize= "//a[@class='select-attribute'][.='Select Size']";
	public String RlsizeL= "//li[@class='selectable']//a[@title='Select Primary Size: L']";
	public String Rladd2cart= "//button[@id='add-to-cart']";
	public String Rlsportcoat= "//a[@class='prodtitle'][.='Morgan Plaid Twill Sport Coat']";
	public String RljacketSize= "//li[@class='selectable']//a[@title='Select Primary Size: 46']";
	public String Rlsecondsize= "//a[@class='select-attribute'][.='Select Secondary Size']";
	public String Rlregularsize= "//li[@class='selectable']//a[@title='Select Secondary Size: Regular']";
	public String RlshoppingBag= "//a[@title='View Bag']";
	public String RlCheckout= "//button[@data-button='bottom']";
	public String Rlcontinuecheckout="//button[@class='button-fancy-large valid']";
	public String Rlralphlaurenhome= "//a[@title='Ralph Lauren Home']";
	public String Rlback2account= "//li[@class='user-info myaccount']//a[@title='Account']";
	public String RlLogout= "//span[@class='account-logout']//a[@title='Logout']";
	
	
	public WebElement linkNewArrival(){
		return driver.findElement(By.xpath("//ul[@class='nav-items']//a[@class='leftnav']"));
	}
	
	//typeByXpath
	public String RlsignInemail= "//div[@class='field-wrapper']//input[@class='input-text email required']"; 
	public String Rlpass="//form[@id='dwfrm_login']/fieldset/div[2]/div[1]/input";
	public String Rlrepass= ".//*[@id='confPasswrd']";
	public String Rlsearch= "//form[@role='search']//input[@id='q']";
	public String Rlfirstname="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_firstName']";
	public String Rllastname="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']";
	public String Rladdress="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address1']";
	public String Rlcity="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_city']";
	public String Rlstate="//select[@name='dwfrm_singleshipping_shippingAddress_addressFields_states_state']//option[@label='New York']";
	public String Rlzipcode="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_postal']";
	public String Rlphone="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']";
	
	
	//clickById

			
	
	
}
