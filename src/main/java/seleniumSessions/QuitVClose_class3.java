package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVClose_class3 {

	public static void main(String[] args) {

		// SID- session id -it very important topic

		WebDriver driver = new ChromeDriver();// sid- 123
		driver.get("http:\\www.amazon.com"); // sid- 123
		String title = driver.getTitle(); // sid- 123
		System.out.println(title); // sid- 123

		driver.quit(); // sid- 123

		System.out.println(driver.getTitle()); // it will give No such Session Exception :Session id is null.Using
												// webdriver after calling quit()
												// as we have used quit method.

		// So every request -session id will be maintained and as we write driver.quit()
		// method the session id becomes null

		// To resolve this problem we need to launch the browser once again and then we
		// will get a session id

		driver = new ChromeDriver(); // sid- 456
		driver.get("http:\\www.amazon.com"); // sid- 456

		// if we use close method- then the session id will be maintained and be null
		// but it will be invalid

		driver.close();
		
		
		
	}
}
