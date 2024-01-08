package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldButtonEnterValue_Class18 {

	public static void main(String[] args) {
		
// 1. Disabled TextField :
		
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		
//	WebElement pwd=	driver.findElement(By.id("pass")); // this disabled
//	pwd.sendKeys("test123");
//	We would get the exception for above : ElementNotInteractableException - element not interactable
	
	
// 2. Disabled ButtonField : 
// Note - the url is not working , might be some issue with the site
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		WebElement submit_btn = driver.findElement(By.id("submitButton"));
		
	String disableText=	submit_btn.getAttribute("disabled"); // will give true or false
		System.out.println(disableText);
		submit_btn.click();
		
		//We would get the exception for above :ElementClickInterceptedException
		
		// in some other application it might not give an exception
		
		
		
		
	}

}
