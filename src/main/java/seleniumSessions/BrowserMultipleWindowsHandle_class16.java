package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle_class16 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentWindowId = driver.getWindowHandle();

		Thread.sleep(3000);
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'https://twitter.com/orangehrm?lang=en')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/OrangeHRM/')]"));
		WebElement ytEle = driver
				.findElement(By.xpath("//a[contains(@href,'https://www.youtube.com/c/OrangeHRMInc')]"));
		WebElement liEle = driver
				.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/company/orangehrm/mycompany/')]"));

		twEle.click();
		fbEle.click();
		ytEle.click();
		liEle.click();

		// Note - getWindowHandles(); will return set of strings -because windows is
		// will be unique and set stores unique values
		// Note -findelements ((); will give list of string

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		// hasNext() will check do we have the next element and then it will move

		while (it.hasNext()) {

			String windowid = it.next();
			driver.switchTo().window(windowid);
			System.out.println(" " + driver.getCurrentUrl());
			Thread.sleep(1500);

			// if the window id not equals to parentwindow id then only the window will get
			// closed
			if (!windowid.equals(parentWindowId)) {

				driver.close();

			}

			// We need to get the driver back to the parent url back

			// Note- dot forget to come back to the parent window after switching the window
			driver.switchTo().window(parentWindowId);
			System.out.println("Parent window url: " + driver.getCurrentUrl());

			// Homework - Scenario 2 -Open the links one by one , open first link then get
			// the title then switch back to parent window and then go to second link and
			// vice versa for other links as well
			// We will get a pair of only two windows , unlike the last scenario where there were 5 window segment
			
			// In the second approach we have better handling of windows as there can be multiple number of links in a webpage
			
			
			
		}

	}

}
