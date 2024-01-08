package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle_class15{

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("India-9090");
		
		// it doesnt matter , we have frames or iframes we will use - switchTo().frame
		
		driver.switchTo().defaultContent();
		
		// Also there is frame inside a frame which will be discussed further.
		// Also nested frame will be discussed further.
		
	}

}
