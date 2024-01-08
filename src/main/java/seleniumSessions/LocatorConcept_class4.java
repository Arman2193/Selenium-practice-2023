package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept_class4 {
	
	static WebDriver driver;
	public static void main(String[] args) {

		// # Web Elements
		// 1.We have to create a web element + perform some action on it(eg- click ,
		// send
		// keys , isDisplayed)

		// 1. Create a webelement : need locator

		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Locators :

		// 1. ID

		// 1st approach
		
		// driver.findElement(By.id("input-email")).sendKeys("arman@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("21arman");

		// Note- findelement will return a webelement , and needs to be stored in a
		// variable as below

		// 2nd approach - would be better that the 1st one
		
		// WebElement emailId= driver.findElement(By.id("input-email"));
		// WebElement password=driver.findElement(By.id("input-password"));
		// emailId.sendKeys("arman@gmail.com");
		// password.sendKeys("21arman");

		// 3rd approach - By Locator - this approach is better than 2nd because we hit
		// the server after we maintain the by locator

		//By emailId = By.id("input-email");
		//By password = By.id("input-password");

		//WebElement eid = driver.findElement(emailId);
		//WebElement pwd = driver.findElement(password);
		//eid.sendKeys("arman@gmail.com");
		//pwd.sendKeys("21arman");

		
		//4th approach : By Locator + generic method  - much better approach then 1 ,2 ,3rd approach
		//		By emailId = By.id("input-email");
		//		By password = By.id("input-password");
		
		//		getElement(emailId).sendKeys("arman.baig@gmail.com");
		//		getElement(password).sendKeys("21arman");
		
		
		
		//5th approach :By Locator 	+ generic methods for web element and actions 
		
		//advantage of By Locator is that we are not hitting the server unnecessarily 
		
		//		By emailId = By.id("input-email");
		//		By password = By.id("input-password");
		//		
		//		doSendKeys(emailId, "arman.baig@gmail.com");
		//		doSendKeys(password, "21arman");

		
		//	6th approach :By Locator + generic methods for web element and actions in elementUtil class	
		
			By emailId = By.id("input-email");
			By password = By.id("input-password");
			
			ElementUtil_class4 eleUtil= new ElementUtil_class4(driver);
			eleUtil.doSendKeys(emailId, "arman.baig@gmail.com");
			eleUtil.doSendKeys(password, "21arman");
			
			
			
			
		
	}

	public static WebElement getElement(By Locator) {
		
		driver.findElement(Locator);
		return driver.findElement(Locator); // it will return web element.
		
	}
	
	public static  void doSendKeys(By Locator , String value ) {
		
		getElement(Locator).sendKeys(value);
		
	}
	

}
