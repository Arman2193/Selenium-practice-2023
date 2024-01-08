package seleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow_class24 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		
		By twitter = By.xpath("//a[contains(@href,'twitter')]");

//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickWhenReady(10, twitter);
		
	ElementUtil_class4 eleUtil=	new ElementUtil_class4(driver);
		
	eleUtil.clickWhenReady(10, twitter);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	
	Set<String> handles = driver.getWindowHandles();

	Iterator<String> it = handles.iterator();

	String parentWindowId = it.next();
	System.out.println("parent window id : " + parentWindowId);

	String childWindowId = it.next();
	System.out.println("child window id : " + childWindowId);

	// switching to window:
	driver.switchTo().window(childWindowId);
	System.out.println("child window url : " + driver.getCurrentUrl());

	

	}

}
