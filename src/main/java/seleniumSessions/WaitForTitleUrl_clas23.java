package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl_clas23 {
	
	// There are chances the web page is slow , that time we would need to use wait for title
	static WebDriver driver ;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("Forgotten Password")).click();

		//System.out.println(driver.getTitle());//loading.... checking.... 
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//wait.until(ExpectedConditions.titleContains("Password?"));
		//System.out.println(driver.getTitle());
		
		
	String title=	waitForTitleContainsAndFetch(10,"Password");
	if(title.contains("Forgot Your Password")) {
		
		System.out.println("Pass");
	}
	
	driver.navigate().to("https://www.amazon.in/");
	driver.findElement(By.linkText("Mobiles")).click();
	if(waitForURLContains(10, "mobile-phones")) {
		System.out.println("URL is correct");
	}
	else {
		System.out.println("URL is in-correct");
	}
	
	
	
	}
	
	// utility for title contains and fetch- partial title
	
	public static String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
	}
	
	// utility for title is and fetch- exact full title value
	
	public static String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
	}
	
	
	
	

	
	
	
	// utility for url contains and fetch details
	public static String waitForURLContainsAndFetch(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getCurrentUrl();
	}
	
	// utility for url contains
	
	public static boolean waitForURLContains(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));
		
	}
	
	// url to be - after clicking particular webpage to another url
	public static String waitForURLIsAndFetch(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();
	}
	
	
	

}
