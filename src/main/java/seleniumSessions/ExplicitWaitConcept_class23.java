package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept_class23 {
	static WebDriver driver; 
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		
		// Below code is used for implicit wait , but we cant write the same code again and again for every element
		// Hence we need to create a generic utilities for it
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("test@gmail.com");
//		
		
		// Below line will also return the web element with wait
		

		
		
		
		waitForElementPresence(emailId, 10).sendKeys("test@gmail.com");
		
		getElement(password).sendKeys("test@123");
		getElement(loginBtn).click();
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	// Explicit wait utility is as below-
	
	// Below documentation says that - presenceOfElementLocated method means -
	// An expectation for checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
	// Hence we have "visibility of element located " method to resolve this issues

	
	/** presenceOfElementLocated :
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	
	// * visibility of element located - below is the utility created for it 
    
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	// So visibility of element locater is better to use 
	

}
