package seleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1.Browser specific:
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver1= new FirefoxDriver();

		// 2. Webdriver = new chrome driver - its valid topcasting -recommended for
		// local execution
		// WebDriver driver= new ChromeDriver();

		// 3.Search context = new chrome driver - its valid topcasting but not
		// recommended as we cannot use the features of webdriver in it
		// SearchContext driver =new ChromeDriver();

		// 4.remote webdriver = new chrome driver -its valid topcasting and recommended
		// for local execution as well
		// RemoteWebDriver driver = new ChromeDriver();

		// 5. Webdriver = new remote web driver - its valid topcasting and used for
		// remote execution ie -if we want to run the tests on cloud or other remote
		// machines.
		// Selenium GRID is used for it.

		// WebDriver driver = new RemoteWebDriver(null);

		// 6. Search context = new remote web driver - its valid topcasting but its of
		// no use
		// SearchContext driver =new RemoteWebDriver(null);
		
		
		// * We cannot create a object of interface(webdriver) - no we cannot create it
		//eg - WebDriver driver= new WebDriver();
		

	}
}
