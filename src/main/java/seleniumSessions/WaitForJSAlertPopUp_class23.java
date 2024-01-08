package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertPopUp_class23 {

	// Waits for non web elements
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		//Below code will throw exception - no alert exception - as we are not clicking on the button element
		// driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		 
		// Below code will wait for 10 sec - for the alert is present or not
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// in the below code -we dont need to switch to alert , it will automatically switch 
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}
	
	// Utility - wait for alert
	public static Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	// Utility - to get alert text
	
	public static String getAlertText(int timeOut) {
		return waitForAlertPresence(timeOut).getText();
	}
	
	// Utility - to accept alert text
	public static void acceptAlert(int timeOut) {
		waitForAlertPresence(timeOut).accept();
	}
	
	// Utility - to dismiss alert text
	public static void dismissAlert(int timeOut) {
		waitForAlertPresence(timeOut).dismiss();
	}
	// Utility - to send keys
	public static void alertSendKeys(int timeOut, String value) {
		waitForAlertPresence(timeOut).sendKeys(value);
	}

}
