package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle_class8 {

	// Select based drop down:
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

//			By country = By.id("Form_getForm_Country");

		// Please not - below dropdown utilities will work on  --- html tag ---> <select> tag
		// it will not work on other dropdown tags
		
		// use select class in selenium for dropdown

//		WebElement country_ele= driver.findElement(country);
//		Select select=new Select(country_ele);

		// We can select the dropdown " by index" as below
		// We can use below in terms of where data is constant-days , weeks , months
		// select.selectByIndex(5);

		// We can select the dropdown "by value" as below
		// select.selectByValue("Belgium"); // value attribute

		// We can select the dropdown "by visibletext" as below
		// select.selectByVisibleText("India"); // text of the option

		By country = By.id("Form_getForm_Country");

		// We can use thread .sleep to put a wait
		// thread is a class in java and sleep would be pausing the script.

		doSelectDropDownByIndex(country, 5);

		Thread.sleep(2000);

		doSelectDropDownByValue(country, "Belgium");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country, "India");

	}

	public static WebElement getelement(By locator) {

		return driver.findElement(locator);

	}

	public static void doSelectDropDownByIndex(By locator, int index) {

		Select select = new Select(getelement(locator));

		select.selectByIndex(index);

	}

	public static void doSelectDropDownByValue(By locator, String value) {

		Select select = new Select(getelement(locator));

		select.selectByValue(value);

	}

	public static void doSelectDropDownByVisibleText(By locator, String value) {

		Select select = new Select(getelement(locator));

		select.selectByVisibleText(value);

	}
	
	
}
