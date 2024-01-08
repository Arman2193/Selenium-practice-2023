package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages_class6 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

//		driver.get("https://amazon.com/");
//		List<WebElement> ImgList= driver.findElements(By.tagName("img"));
//		
//		System.out.println(ImgList.size());
//		

		// Below code finds the text fields
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> textFields = driver.findElements(By.className("form-control"));

		System.out.println(textFields.size());

		// note -in case of findElements , if we pass wrong or invalid tag name or class
		// name it will give as 0 in the list
		
		// Return type of findElement is Webelement
		// Return type of findElements is  List<WebElement>
		// if findElement is not able to find the webelement - it will throw NoSuchElement exception
		// if findElements is not able to find the webelement -it will give empty list , size= 0 
		// Actions can only be performed on findElement
		// No Actions can only be performed on findElements
	}

}
