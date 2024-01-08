package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator_class18 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.xpath("//////input[@@id='name']")).sendKeys("testing");
		
		// We will get -  "InvalidSelectorException"  for the above after entering invalid xpath syntax locator
		
	driver.findElement(By.xpath("//input[@id='namenaveen']")).sendKeys("testing");
	
	// We will get - "NoSuchElementException" for the above after entering the invalid id , and the format syntax is also correct   
		
		
	// Till now we have seen the below exceptions 
	
	// 1.NoAlertException
	// 2.NoFramePresentException
	
// Other are covered in previous examples
		

	}

}
