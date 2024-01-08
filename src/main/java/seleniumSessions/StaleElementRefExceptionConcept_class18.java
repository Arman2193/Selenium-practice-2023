package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept_class18 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	WebElement fn=	driver.findElement(By.id("input-email"));
		
		fn.sendKeys("navee@gmail.com");//dom-v1
		
		
		// So when we refresh the page , the DOM also gets refreshed and we get the exception
		//and we use fn -which we created from dom-v1 and after refresh it cant be access through dom-v2
		//Hence -It throws StaleElementException
		
		//to get rid of this  we would need to write the fn variable as below and we need to create element 
		
		fn=	driver.findElement(By.id("input-email")); // dom-v2
		fn.sendKeys("arman@gmail.com");//dom- v2
		
		// the solution for StaleElementException is that we need to create a new webelement as above fn
		// Hence do not refresh the page else you will get 	
	}

}
