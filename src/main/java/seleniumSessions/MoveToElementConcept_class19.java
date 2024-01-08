package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept_class19 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
	WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
		
	// In order to perform keyboard and mouse actions - we use "actions" class
	
	Actions  act=new Actions(driver);
	
	// Whenever we use actions- we need to use build() and perform() functions
	
	//Build() -to build the action 
	//Perform () -perform the actions
	
	act.moveToElement(menu).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("COURSES")).click();
	

	}

}
