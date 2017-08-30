package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Utils.WdFuntion;

public class RLConfig extends WdFuntion {

	@BeforeTest
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ralphlauren.com/");
		driver.manage().window().maximize();

	

	}	
}
