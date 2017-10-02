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
	public String Rlregister= ".//*[@id='accountsel']/a";
	public String Rlcreate= ".//*[@id='signUpButton']";
	public String Rlmen= "//a[@title='Men']/span";
	public String RlNewArv= "//div[@id='left-nav']//ul[@class='nav-items']//a[.='New Arrivals']";
	public String Rlsearchsubmit= "//form[@id='topnav_search']//input[@id='search-submit-head']";
	public String RlJacketSuedeBomber= "//a[@class='prodtitle'][.='Suede Bomber Jacket']";
	public String RlsizeL= "//ul[@id='size-swatches']/li[@title='L']";
	public String Rladd2cart= "//div[@id='AddToCart-button-container']//a[@id='addToCart']";
	public String Rlsportcoat= "//a[@class='prodtitle'][.='Morgan Plaid Twill Sport Coat']";
	public String RljacketSize= "//li[@title='44 Regular'][.='44 Regular']";
	
	public WebElement linkNewArrival(){
		return driver.findElement(By.xpath("//ul[@class='nav-items']//a[@class='leftnav']"));
	}
	
	//typeByXpath
	public String Rlemail= ".//*[@id='emailAddExmpl']"; 
	public String Rlpass= ".//*[@id='passwrd']";
	public String Rlrepass= ".//*[@id='confPasswrd']";
	public String Rlsearch= "//form[@id='topnav_search']//input[@id='search-box-head']";
	
	//clickById

			
	
	
}
