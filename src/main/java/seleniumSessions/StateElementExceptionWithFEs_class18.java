package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElementExceptionWithFEs_class18 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
	
	// v1
	List<WebElement> linklist=	driver.findElements(By.xpath("(//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP'])[3]//a"));
		
		for(int i=0;i>linklist.size();i++) {
			
			linklist.get(i).click();// v1
			// once we click it will got v2 dom- and will throw state element exception
			// We need to create the list once again , whenever we get a new dom update the webelement or list
			
			//v3
			linklist=	driver.findElements(By.xpath("(//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP'])[3]//a"));// v2 -v3 -v4
			
			
		}
		 // Below are the conditions actions where we would get the State element exception
		 // click, back, forward ,refresh
		
		// Please note -theres one more concept "fluent wait " in which we dont need to create new webelement or list 
		
		
	}

}
