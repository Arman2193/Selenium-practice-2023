package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts_class9 {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());

		// After launching the browser when we want to navigate to another website "
		// navigate () to() is used"
		
		// Below also calls get() method
		driver.navigate().to(new URL("https://www.amazon.com/")); 
		
		//Below also calls get() method
		driver.navigate().to("https://www.amazon.com/");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());
		
		driver.navigate().forward();

		System.out.println(driver.getTitle());
		
		// to refresh the page we use the below
		driver.navigate().refresh();
		
		
		// Difference between get() method  navigate () to()
		
		// refer link - https://naveenautomationlabs.com/selenium-webdriver-navigation-commands/
		
		// So internally to() method call get() method 
		// Both can maintain the history
	}

}
