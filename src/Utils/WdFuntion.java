package Utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WdFuntion {

	public static WebDriver driver;
	public static Logger App_log= Logger.getLogger("Golog");
	
	public void typeByXpath(String rlLocators){
		
		
	};
	
	public void typeByXpath(String rlLocators, String rlValue){
		driver.findElement(By.xpath(rlLocators)).clear();
		driver.findElement(By.xpath(rlLocators)).sendKeys(rlValue);
		
	};
	
	public void clickById(String rlLocators){
		driver.findElement(By.id(rlLocators));
		
	};
	
	public void clickByXpath(String rlLocators){
		driver.findElement(By.xpath(rlLocators)).click();
	};
}
