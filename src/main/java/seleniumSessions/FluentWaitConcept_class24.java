package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept_class24 {
 static WebDriver driver;
	public static void main(String[] args) {
		// Fluent wait is a class -which is a child of wait interface.
		// And Webdriver wait is the child of fluent wait

		// So there's no difference if we use Fluent wait or Webdriver wait , just a bit
		// of syntax difference

		// with fluent wait we need to use the below syntax with topcasting 
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
		
		
		 driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		By freeTrial = By.cssSelector("a[title='Free Trial']");

		// Below ignore method will help us ignore the exceptions while waiting
		// We can define the exceptions as below

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(2)) // polling means the interval time to check the web element on the
														// browser
														// For eg after every 2 seconds selenium will check and will try
														// to find the element on the browser - request and response
														// and the intervals would be be 5 times in the duration of
														// seconds initialized- as above we have initialized 10 seconds
														// and the default polling time is of 500 mili seconds
				.withMessage("Element not found"); // We can add a custom method as well when the element is not found

//	WebElement freeTrialEle=wait.until(ExpectedConditions.elementToBeClickable(freeTrial));
//
//	freeTrialEle.click();
		
		waitForElementPresenceWithFluentWait(10, 2, freeTrial).click();
	}

	// Utility for the above
	public static WebElement waitForElementPresenceWithFluentWait( int timeOut, int pollingtime, By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class) // it will ignore till 10 sec after that it will throw the error if the element is not found
				.ignoring(StaleElementReferenceException.class) // it will ignore till 10 sec
				.pollingEvery(Duration.ofSeconds(pollingtime)) // polling means the interval time to check the web element on the
														// browser
														// For eg after every 2 seconds selenium will check and will try
														// to find the element on the browser - request and response
														// and the intervals would be be 5 times in the duration of
														// seconds initialized- as above we have initialized 10 seconds
														// and the default polling time is of 500 mili seconds
				.withMessage("Element not found"); // We can add a custom method as well when the element is not found
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		
		
	}
	//Utility for alert 
	
	public static void waitForAlertPresenceWithFluentWait( int timeOut, int pollingtime, By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoAlertPresentException.class)
				.pollingEvery(Duration.ofSeconds(pollingtime)) // polling means the interval time to check the web element on the
														// browser
														// For eg after every 2 seconds selenium will check and will try
														// to find the element on the browser - request and response
														// and the intervals would be be 5 times in the duration of
														// seconds initialized- as above we have initialized 10 seconds
														// and the default polling time is of 500 mili seconds
				.withMessage("Element not found"); // We can add a custom method as well when the element is not found
		wait.until(ExpectedConditions.alertIsPresent());

		
		
	}
	
	
}
