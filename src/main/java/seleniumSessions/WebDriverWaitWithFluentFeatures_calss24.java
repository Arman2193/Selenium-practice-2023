package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentFeatures_calss24 {
	static WebDriver driver;
	public static void main(String[] args) {
		// Fluent wait is a class -which is a child of wait interface.
		// And Webdriver wait is the child of fluent wait
		// its upto us which o we want to use 
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By freeTrial = By.cssSelector("a[title='Free Trial']");
		
//	WebDriverWait	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(2));
//		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
//		wait.withMessage("element not found ");
//		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
//		
		// We can also use polling with the below webdriver wait-
		// So the below is webdriver wait with fluent wait features.
		WebDriverWait	wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
	}

}
