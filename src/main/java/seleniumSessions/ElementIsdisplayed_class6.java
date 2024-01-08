package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsdisplayed_class6 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flagImg=driver.findElement(By.className("img-responsive")).isDisplayed();
//		if(flagImg) System.out.println("Pass");
//		
//		boolean flagSearch=driver.findElement(By.name("search")).isDisplayed();
//		if(flagSearch) {
//			
//			System.out.println("Pass");
//			driver.findElement(By.name("search")).sendKeys("macbook");

		By logoImg = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.cssSelector("#search > input");

		if (doElementIsDisplayed(logoImg)) {
			System.out.println(" Image is present - Pass");
		}
		if (doElementIsDisplayed(search)) {

			System.out.println("Search is present - Pass");

			doSendKeys(search, "macbook");

			doclick(searchIcon);

		}

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static boolean doElementIsDisplayed(By locator) {

		return getElement(locator).isDisplayed();
	}

	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	public static void doclick(By locator) {

		getElement(locator).click();
	}
}
