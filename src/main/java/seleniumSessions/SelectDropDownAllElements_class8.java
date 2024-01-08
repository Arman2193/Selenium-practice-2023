package seleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements_class8 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		// Select based drop down:

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		// By country = By.id("Form_getForm_Country");

		// Select select = new Select(driver.findElement(country));
		// getOptions() = will give us all the element options under that tag of the
		// element
		// it will return the dropdown values are there

//		List<WebElement> countryList = select.getOptions();
//
//		System.out.println(countryList.size() - 1);
//
//		for (WebElement e : countryList) {
//
//			String text = e.getText();
//			System.out.println(text);
//
//			if (text.equals("Brazil")) {
//
//				e.click();
//				break;
//			}
//		}

		// * interview question - select a drop down without using by value , index and
		// visible text
		// we need to explain above getOptions method and store in the list and get the
		// text and click on it using a for each loop

		By country = By.id("Form_getForm_Country");

//		if (getTotalDropDownOptions(country) - 1 == 232) {
//
//			System.out.println("Country dropdown is correct");
//		}
//
//		if (getDropdownOptionsTextList(country).contains("India")) {
//
//			System.out.println(" India is present ");
//
//		}
//
//		List<String> expCountryList = Arrays.asList("India", "Brazil", " Blegium");
//
//		if (getDropdownOptionsTextList(country).containsAll(expCountryList)) {
//
//			System.out.println("Pass");
//		}
			
		selectDropDownValue(country, "North Korea");
		
		
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static List<WebElement> getTotalDropDownOptionsList(By locator) {

		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public static List<String> getDropdownOptionsTextList(By locator) {

		List<WebElement> optionsList = getTotalDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : optionsList) {

			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

	// Purpose of the below method is that , if the normal  by value , index and
	// visible text id not working -its kind of a back up method .
	
	public static void selectDropDownValue(By locator, String expValue) {

		List<WebElement> optionsList = getTotalDropDownOptionsList(locator);
		for (WebElement e : optionsList) {

			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {

				e.click();
				break;
			}
		}

	}

	public static int getTotalDropDownOptions(By locator) {

		int optionsCount = getTotalDropDownOptionsList(locator).size();
		System.out.println("Total options --->" + optionsCount);
		return optionsCount;
	}
}
