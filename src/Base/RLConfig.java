package Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Utils.WdFuntion;

public class RLConfig extends WdFuntion {
	

	@BeforeClass
	public void startBrowser() {
		
		System.out.println("Start the browser");
		App_log.info("Browser Started");
		System.setProperty("webdriver.chrome.driver","C://Users//Ehsanul Dodul//workspace//DeeFinal//Driver//chromedriver.exe");
		App_log.info("Chrome driver found");
		driver=new ChromeDriver();
		App_log.info("Chrome Started");
		driver.get("http://www.ralphlauren.com/");
		driver.manage().window().maximize();
		iwait(120);
	

	

	}	
}
