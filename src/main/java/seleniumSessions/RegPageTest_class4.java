package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest_class4 {
	
	public static void main(String[] args) {
		
		// We will use the utility class BrowserUtil -to launch the browser as below
		
		// we need to create the object of BrowserUtil to call the method as below
		
		String browser="chrome";
		BrowserUtil_class3 brUtil= new BrowserUtil_class3(); 
		
		WebDriver driver = brUtil.inintDriver(browser);
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title=brUtil.getPageTitle();
		System.out.println(title);
		
		// By Locators- We have maintained the locators - ie object repository
		// and we are not hitting the server 
		
		//So total 6  by locators as below 
		
		By FirstName= By.id("input-firstname");
		By LastName= By.id("input-lastname");
		By Email= By.id("input-email");
		
		By Telephone= By.id("input-telephone");
		By Password= By.id("input-password");
		By ConfirmPassword= By.id("input-confirm");
		
		
		// We need to call doSendKeys method from  ElementUtil_class4 as below
		// so we create the object of the  ElementUtil_class4 class 
		
		ElementUtil_class4 eleUtil = new ElementUtil_class4(driver);
		
		eleUtil.doSendKeys(FirstName, "arman");
		eleUtil.doSendKeys(LastName, "baig");
		eleUtil.doSendKeys(Email, "arman.baig@mercer.com");
		eleUtil.doSendKeys(Telephone, "9699599652");
		eleUtil.doSendKeys(Password, "arman21");
		eleUtil.doSendKeys(ConfirmPassword, "arman21");
		
		
	}
	

}
