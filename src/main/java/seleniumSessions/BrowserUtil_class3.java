package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

// this utility / generic  class - methods can be used in other projects as well 
// Like we have created  wrapper methods with customized selenium methods - means wrapped with selenium methods.

public class BrowserUtil_class3 {

	private WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return this returns the specific browser driver
	 */

	public WebDriver inintDriver(String browserName) {

		System.out.println("Browser name is :" + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":

			driver = new ChromeDriver();

			break;

		case "firefox":

			driver = new FirefoxDriver();

			break;
		case "edge":

			driver = new EdgeDriver();

			break;
		case "safari":

			driver = new SafariDriver();

			break;

		default:

			System.out.println("Please pass the right browser :" + browserName);

			break;
		}
		
		
		return driver;
	}

	// https://www.google.com - we have created a custom function error message
	public void launchURL(String url) {

		if (url == null) {

			System.out.println("Url cannot be null");

		}

		if (url.indexOf("https") == 0) {

			driver.get(url);
		}

	}

	public String getPageTitle() {

		String title = driver.getTitle();
		System.out.println(" Page title is :" + title);
		return title;
	}

	public String getPageURL() {

		String url = driver.getCurrentUrl();
		System.out.println("Page Current url : " + url);
		return url;
	}

	public void closeBrowser() {

		if (driver != null) {
			driver.close();
		}

	}

	public void quitBrowser() {

		if (driver != null) {
			driver.quit();
		}
	}
}
