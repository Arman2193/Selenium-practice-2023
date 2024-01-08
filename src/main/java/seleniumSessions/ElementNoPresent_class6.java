package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNoPresent_class6 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImg = By.className("img-responsive11"); // need to change the locator to get the erro
		By search = By.name("search");
		
		// webelement + action 
		// while creating the we element it will throw exception 
		
		 boolean flagImg =driver.findElement(logoImg).isDisplayed(); // find element -will throw element not found exception
		 System.out.println(flagImg);
		 
		 
		
	}
}
