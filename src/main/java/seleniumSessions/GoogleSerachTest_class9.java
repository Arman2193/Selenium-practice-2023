package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSerachTest_class9 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("naveen automation labs ");

		Thread.sleep(3000);
		
		
//
//		List<WebElement> suggList = driver
//				.findElements(By.xpath("//div[@role='presentation']//div[@class='wM6W7d']/span"));
//
//		System.out.println(suggList.size());
//		
//		for(WebElement e: suggList) {
//			
//		String text=e.getText();
//		System.out.println(text);
//		if(text.equals("naveen automation labs github")) {
//			
//			e.click();
//			break;
			
		//}
		
			By suggListLocator =By.xpath("//div[@role='presentation']//div[@class='wM6W7d']/span");
		
			doSearch(suggListLocator, "naveen automation labs");
		
	}
	

	// Generic utility
	
	
	public static void doSearch(By suggListLocator, String suggName) {
		
		List<WebElement> suggList = driver.findElements(suggListLocator);

	System.out.println(suggList.size());
	
	for(WebElement e: suggList) {
		String text=e.getText();
	System.out.println(text);
		if(text.equals(suggName)) {
			
			e.click();
			break;
		
		}
		}
		
	}

}
