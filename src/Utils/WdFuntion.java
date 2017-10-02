package Utils;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WdFuntion {

	public static WebDriver driver;
	public static Logger App_log= Logger.getLogger("devpinoyLogger");

	
	
	//waits
	
	public void iwait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	};
	
	
	public void waitByPage(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		wait.until(ExpectedConditions.visibilityOf(element));
	};
	
	
	
	public void typeByXpath(String rlLocators){


	};

	public void typeByXpath(String rlLocators, String rlValue){
		driver.findElement(By.xpath(rlLocators)).clear();
		driver.findElement(By.xpath(rlLocators)).sendKeys(rlValue);
		

	};


	public void popup(String popUpXpath) throws InterruptedException{
		App_log.info("popup test started");
		//close popup
		clickByXpath(popUpXpath);	
	}

	public void clickById(String rlLocators){
		driver.findElement(By.id(rlLocators)).click();;

	};

	public void clickByXpath(String rlLocators){
		driver.findElement(By.xpath(rlLocators)).click();
	};
}
