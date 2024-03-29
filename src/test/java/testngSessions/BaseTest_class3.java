package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest_class3 {
	
	
	 WebDriver driver;
	 	
	 @Parameters({"url","browser"})
		@BeforeTest
		public void setup(String url ,String browserName) {
		 
		 System.out.println("running test on :" +browserName);

		 if(browserName.equalsIgnoreCase("chrome")){
			 
			 driver=new ChromeDriver();
			 
		 }
		 else if(browserName.equalsIgnoreCase("firefox")) {
			 
			 driver=new FirefoxDriver();
		 }
		 else if(browserName.equalsIgnoreCase("safari")) {
			 
			 driver=new SafariDriver();
		 }
		 
		 else{
			 
			 System.out.println(" Please pass the right browser..." +browserName);
		 }
		 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
			driver.get(url);
		}
		
		@AfterTest
		public void teardown() {

			driver.quit();
		}

}
