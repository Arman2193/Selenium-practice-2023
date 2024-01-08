package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithElements_class24 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footer = By.cssSelector("footer a");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// presenceOfAllElementsLocatedBy - any on the elements are present it will
		// return the list

		//List<WebElement> footerList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));

		// visibilityOfAllElementsLocatedBy - will check if the elements are visible on
		// the page -will return the complete list
		List<WebElement> footerList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));

		System.out.println(footerList.size());

	}
	
	
	
// Please check the ElementUtil class for the utility created 
}
