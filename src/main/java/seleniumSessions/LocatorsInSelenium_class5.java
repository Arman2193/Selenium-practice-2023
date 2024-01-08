package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium_class5 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		    // Locators : There are 8 Locators in selenium as below
			// Id , name, class name, xpath, css selector,link text , partial link text, tagName
		
			// If Id is available , we will go with Id as its unique attribute 
			// Id , name, class name - we will pefer Id
			// Xpath, css selector - we will choose as per the situation , both can be used
		
			// link text , partial link text - we will go with link text as partial link text can have duplicate text
			// tagName - used in special cases where we have tags in the html

		
		
			// # Web Elements
			// 1.We have to create a web element + perform some action on it(eg- click ,
			// send
			// keys , isDisplayed)

			// 1. Create a webelement : need locator

			driver= new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
			
			//1. Id:
			
			// driver.findElement(By.id("input-email")).sendKeys("arman@gmail.com");
			//note -By is a class and name is a method inside it
			
			//2. Name:
			// *Between Id and name - we need to use id , as name can be duplicate but id wont be
			
			//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
			//By email=By.name("email");
			
			
			//3.class name:
			
			// As there are multiple form-control class name  ,hence its not recommended to use class name
			// Or use class name only if its unique
			
			//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
			
			// Above all locators are attribute 
			
			//4.Xpath :xpath is not an attribute , its a address of the element in the html DOM
			
//			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("\"test@gmail.com\"");
//			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("21arman");
//			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			
//			By emailId =By.xpath("//*[@id=\"input-email\"]");
//			By password =By.xpath("//*[@id=\"input-password\"]");
//			By login =By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//			
//			doSendKeys(emailId, "test@gmail.com");
//			doSendKeys(password, "21arman");
//			doclick(login);
			
			
			//5.css selector: not an attribute , pretty much faster than xpath
			
//			driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com\"");
//			driver.findElement(By.cssSelector("#input-password")).sendKeys("21arman");
//			driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

			
			//6. Link text : Its only used for the links ,from the home page where it  redirect to new page
			//  Its has the href property and every link has a text , and its not a attribute 
			// also Link text can be duplicate as well
			
			
			//driver.findElement(By.linkText("Register")).click();
			
			//By registerLink = By.linkText("Register");
			//doclick(registerLink);
			
			
			
			//7. Partial Link text :Its also  used for the links   
			// It can be risky if there are Forgotten text in multiple links , or to text having same name
			
			
			//Forgotten Password
			//Forgotten userid
			//driver.findElement(By.partialLinkText("Forgotten")).click();
			
			
			//8.TagName: html tag -we can get the text of the element
			
//			String header=driver.findElement(By.tagName("h2")).getText();
//			System.out.println(header);
			
			// getText : it will work for links, paragraph, headers
		
//			By header= By.tagName("h2");
//			String value=doElementGetText(header);
//			System.out.println(value);
			
			By payment= By.linkText("Recurring payments");
			String pay=doElementGetText(payment);
			System.out.println(pay);
			
			//doclick : it will work for buttons , check boxes , radio button, images , links
			//sendKeys :text box/ text field , dropdown ,fileupload  
			
			
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static void doclick(By locator) {
		
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator ,String value) {
		
		getElement(locator).sendKeys(value);
		
	} 
	
	public static String doElementGetText(By locator ) {
		return getElement(locator).getText();
		
	}
	 
	
}


