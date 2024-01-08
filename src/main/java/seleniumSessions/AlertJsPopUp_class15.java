package seleniumSessions;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUp_class15 {

	public static void main(String[] args) throws InterruptedException {

		// 1.js alert - > alert , prompt ,confirm
		// 2.auth popup ->
		// 3.browser window pop up/adv pop up
		// 4.file upload pop up

		// 1.js alert - > alert , prompt ,confirm

		// Note- alert pop ups are not the part of Dom . its a part of alert messages

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		 driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		 Thread.sleep(3000);
//		 
//		 Alert alert =driver.switchTo().alert();
		// NoAlertPresentException:in case of no such alert

//		 String text=alert.getText();
//		 System.out.println(text);

//		 alert.accept();
		// alert.dismiss();

		
		//2.confirm
//		 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		 Thread.sleep(3000);
//		 
//		 Alert alert =driver.switchTo().alert();
//		 String text=alert.getText();
//		 System.out.println(text);
//		 alert.accept(); // click on ok
		 
		//alert.dismiss(); //click on cancel
		
		//3.prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("Arman");
		alert.accept();
		
		// Please note -we will never get two java script pop ups as the same time , advertising pop ups can be multiple
		// For practice -go to rediff.com and click on login without entering username and password
		
		
		
		
	}

}
