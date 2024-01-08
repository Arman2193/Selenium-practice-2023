package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// Steps

		// 1.open the browser : chrome,firefox, safari , edge
		//ChromeDriver driver = new ChromeDriver(); // Automatically constructor is called and it opens the browser. It
													// opens the replica of the browser
		
		
		// *type casting for cross browsing for multiple browsers 
			//WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver(); firefox
			//WebDriver driver= new SafariDriver(); safari
			//WebDriver driver= new EdgeDriver(); edge
			
		// No what we can do is we can keep webdriver driver = null value
		
		String browser ="Chrome";
		WebDriver driver=null;
		
		// cross browser logic 
		// Assignment - write the below code using switch case and default
		if(browser.equals("chrome")) {
			
			driver =new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver= new SafariDriver();
			
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
			
		}else
		{
			System.out.println("Please pass the right browser : " + browser);
		}
			
		// 2. enter the url
		driver.get("https://www.google.com"); // without https or http -it will not work

		// 3. get the title
		String actTitle = driver.getTitle();
		System.out.println("Page title :" + actTitle);

		// but selenium cannot validate the title
		// we need validation point/checkpoint
		if (actTitle.equals("Google")) {

			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}

		// Automation steps + validation/assertions(testng) = Automation testing

		// to close the browser , we can use quit or close method , difference will be
		// explained in further class
		
		driver.quit();
		
		// * With above approach we cannot use cross browsers , hence we need to use topcasting approach 
	}

}
