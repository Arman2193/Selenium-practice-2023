package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle_class16 {

	// when we need to open a new browser tab or new browser window -we can use the
	// below newwindow method
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Pwid = driver.getWindowHandle();
		
		// driver.switchTo().newWindow(WindowType.TAB); // -it will open a new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // - it will open a new window -introduce in selenium 4.X
		
		driver.get("https://www.google.com");
		
		System.out.println("Child window title :" + driver.getTitle());
		
		driver.close(); // closes the child window

		// driver.quit(); // all the windows will be closed -when all the work is done
		// then we can use quit
		driver.switchTo().window(Pwid);
		
		System.out.println("Parent window title :" + driver.getTitle());

		// 2. Random pop ups- Cannot be handled directly with selenium
		// So we would need to raise and block these in the QA /staging /test
		// environment - it should only be for prod environment
		
		// There will no multiple alert and pop ups together 
		
		
	}

}
