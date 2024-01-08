package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods_class3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.com");
		driver.manage().window().maximize(); // Maximizes the browser window

		// driver.manage().window().fullscreen();// if we have big screen and need to
		// fit to the screen we can use full
		// screen

		driver.manage().deleteAllCookies();// we can delete the cookies ,if we are running manual test cases

		String url = driver.getCurrentUrl(); // So if we go to different from amazon home page , then it gives the
												// current pages url

		System.out.println(url);
		if (url.contains("amazon.com")) {

			System.out.println("Pass");
		}

		String pgSrc = driver.getPageSource(); // gives the source code of the page -generally we dont use it , but if
												// want to verify some footer or any other text we can use it
		System.out.println(pgSrc);
		if (pgSrc.contains("abc footer end")) {

			System.out.println("Pass");
		}

		driver.quit(); // it quits all the browser . difference in close and quit will be explained in
						// next session
	}

}
