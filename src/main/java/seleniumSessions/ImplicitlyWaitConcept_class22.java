package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept_class22 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// the line on implicitlyWait means its deprecated -and the method can be
		// deleted any time from the selenium library
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Selenium 3.X version

		// Hence we need to use the below option -"Duration" syntax

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Selenium 4.X version
		
		// global wait: for 10 secs
		// it will be applied for all the elements by default.
		// So when we use findelements method - implicit wait will be applied automatically 
		

		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email11")).sendKeys("naveen@gmail.com");//10 - 5 = 5
		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");//10 - 2 = 8
		
		// implicitly wait supports web elements: svg, iframes, webelements
		// implicitly wait doesn't support non web elements :title,url,java script alerts 
		
		// But - never use implicitly wait in the framework
		
		

	}

}
