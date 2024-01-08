package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect_class8 {

	static WebDriver driver;

	public static void main(String[] args) {
	
		// * interview question - select a drop down without using Select class
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		By countryOptions= By.xpath("//select[@id='Form_getForm_Country']/option");
	
		List<WebElement> optionsList=driver.findElements(countryOptions);
	
	System.out.println(optionsList.size());
	
	for(WebElement e : optionsList) {
		
		String text= e.getText();
		System.out.println(text);
		
		if(text.equals("India")) {
			
			e.click();
			break;
		}
	}
	
	// create a utility as assignment for the above
	
		

	}

}
