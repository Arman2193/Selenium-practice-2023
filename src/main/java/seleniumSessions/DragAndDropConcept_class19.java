package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept_class19 {

	public static void main(String[] args) throws InterruptedException {
		// We cannot do file droping from one window to another.
		// We can only do ui webelement drop and within the same window.

     WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		
		WebElement srcEle= driver.findElement(By.id("draggable"));
		WebElement targetEle= driver.findElement(By.id("droppable"));
		
		
		Actions act =new Actions(driver);
		
		
		// Below is the example of builder pattern
		// if we forget to write build() function - then perform() function will do the job
		// But use build() perform() function together
		
		// 1- First approach
		act.clickAndHold(srcEle).moveToElement(targetEle).release().build().perform();
		
		// We also have a drag and drop method that does the same job as above
		//We can use any one from the both approach
		
		// 2- Second approach
		act.dragAndDrop(srcEle, targetEle).build().perform();
		
		
		
		
	}

}
