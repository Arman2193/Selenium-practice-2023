package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser_class9 {

	public static void main(String[] args) {
		// Headless browser is not visible - but its launched
		// Headless testing is happening behind the scene
		// its Fast

		// ChromeOptions class is responsible for headless browser
		// We need create an object of the ChromeOptions class and pass it to the
		// chromedriver object as below

		// Only advantage of headless is that its little fast and execution is happening
		// behind the scenes and you can work on some other work - like sanity test cases
		
		//for complex html DOM -it will not work
		
		// in real time we dont use headless
		
		

		ChromeOptions co = new ChromeOptions();
		// co.setHeadless(true); // 1st option
		// co.addArguments("--headless"); // 2nd option
		
		// below code will run in incognito mode
		co.addArguments("--incognito"); //3rd option
		
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.getTitle();
		driver.getCurrentUrl();

		driver.quit();

	}

}
