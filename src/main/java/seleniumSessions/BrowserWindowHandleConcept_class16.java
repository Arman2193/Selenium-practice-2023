package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept_class16 {

	public static void main(String[] args) throws InterruptedException {
		
		// For eg- orange hrm web page having the facebook , linkedin links in the footer
		// When you click on this links -we get a separate browser window pop up
		// in the html dom -there is a tag - target="_blank" , from which we can say its a separate browser window pop up 
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	WebElement twEle=	driver.findElement(By.xpath("//a[contains(@href,'https://twitter.com/orangehrm?lang=en')]"));
		twEle.click();
		
	// get the window ids	
 	Set<String> handles=  driver.getWindowHandles(); // - it will give us window ids of the particular browser	
	
 	// Both windows id will be stored in the set as above , and then we can iterate 
 	
 	Iterator<String> it=handles.iterator(); // iterator will point above the both ids
 	
 	String parentWindowid= it.next(); // Hence we need to use next() method to point it at the ids - it will move and will give the value stored
 	
 	System.out.println("Parent window :"+ parentWindowid);
 	
 	String childWindowid= it.next();
 	
 	System.out.println("Child window :" + childWindowid);
 	
 	//switching to window
 	
 	driver.switchTo().window(childWindowid);
 	System.out.println("Child window url" + driver.getCurrentUrl());
 	
 	// Please note -dont use quit() method , it will close both the windows 
 	
 	driver.close(); //will close the current child window
 	
 	// now the driver would be lost ,hence we need to switch it to to parent window to continue the operation
 	
 	driver.switchTo().window(parentWindowid);
 	
 	System.out.println("Parent window url" + driver.getCurrentUrl());
 	
 	driver.quit(); // now we can use quit() method as we are done with the operation
 	
 	//driver.switchTo().window(null)
 	
 	
		
	}
}
