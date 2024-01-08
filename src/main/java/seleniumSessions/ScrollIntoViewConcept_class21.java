package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewConcept_class21 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("//span[text()='Explore Top offers in Smartphones']"));

		JavaScriptUtil_class20 jsutil = new JavaScriptUtil_class20(driver);

		jsutil.scrollIntoView(ele);

		// So there are below clicks that are availabe to use

		// 1.Click -UI - clicks on the middle of the element
		// 2.actions click - move to element - clicks on the middle of the element 
		// 3.js click - clicks from the DOM

		// Below is the js click code

		WebElement registry = driver.findElement(By.linkText("Registry"));
		jsutil.clickElementByJS(registry);
		
		// But js click will click from the DOM , hence its not recommended 
		
		// We do have send keys to execute in javascript . but there should be id availabe in the dom
		// Hence we avoid to use send keys and click
		
	}

}
