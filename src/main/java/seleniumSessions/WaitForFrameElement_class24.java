package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrameElement_class24 {
	static WebDriver driver;
	public static void main(String[] args) {
	
		

			driver = new ChromeDriver();

			driver.get("http://www.londonfreelance.org/courses/frames/index.html");

			//waitForFramdAndSwitchToItByIDOrName(10, "main");

			waitForFramdAndSwitchToItByFrameElement(10, driver.findElement(By.xpath("//frame[@src='top.html']")));
			
			
			String header = driver.findElement(By.tagName("h2")).getText();
			System.out.println(header);
			
		}
		
		// Will wait for the frame and switch by id or name
		public static void waitForFramdAndSwitchToItByIDOrName(int timeOut, String idOrName) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
		}
		
		// Will wait for the frame and switch by frame index
		public static void waitForFramdAndSwitchToItByIndex(int timeOut, int frameIndex) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		}
		
		// Will wait for the frame and switch by frame element
		public static void waitForFramdAndSwitchToItByFrameElement(int timeOut, WebElement frameElement) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
		}
		// Will wait for the frame and switch by frame locator
		public static void waitForFramdAndSwitchToItByFrameLoctor(int timeOut, By frameLocator) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		}	
		
		
		
		

	}


