package seleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle_class19 {

	public static void main(String[] args) {
		
		// Context Menu - When we right click the options comes are called as context menu 
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			
		WebElement ele=	driver.findElement(By.xpath("//span[text()='right click me']"));
			
		Actions act =new Actions(driver);
		
		act.contextClick(ele).build().perform();
		
	List<WebElement> rightEles= 	driver.findElements(By.cssSelector("ul.context-menu-list span"));
	
	System.out.println(rightEles.size());
	
	for(WebElement e: rightEles) {
		
		String text =e.getText();
		
		System.out.println(text);
		if(text.equals("Copy")) {
			
			e.click();
			
			Alert alert= driver.switchTo().alert(); // it will switch to the alert pop up
			System.out.println(alert.getText()); // 
			alert.accept(); // will accept the alert 
			break;
			
		}
	}
	
	}

}
