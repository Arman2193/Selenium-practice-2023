package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		// Path configuration for .exe file
		
		//Mac
		//System.setProperty("wedriver.chrome.driver", "/Users/.../chromedriver");
		
		//Windows
		//System.setProperty("wedriver.chrome.driver", "c:\\Users\\...\\chromedriver.exe");
		
		
		
		WebDriver driver =new ChromeDriver();
	//1. before 4.6 selenium version we had to mention the set path exe file or configure the .exe file
	
	// 2.After 4.6 selenium version we dont need to configure exe file .
	//   selenium manager helps - 4.6 onwards 
	//	 webdriver manager
	//   So if the browser gets updated , it will help in upgrading the exe file automatically.	

	}

}
