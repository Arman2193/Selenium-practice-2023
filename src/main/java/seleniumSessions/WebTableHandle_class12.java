package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle_class12 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);

		driver.findElement(By.name("username")).sendKeys("newautomation"); // -> use the same username
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");// -> use the same password

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		// driver.findElement(By.xpath("//a[text()='Ali
		// khan']//parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		
		selectUser("Ali khan");
		selectUser("deepti gupta");
		
		String cname=getUserCompanyName("Ali khan");
		System.out.println(cname);
		
		cname=getUserCompanyName("deepti gupta");
		System.out.println(cname);
		
	
		
	}
	
	
	// driver.findElement(By.xpath("//a[text()='Ali
	// khan']//parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

	public static void selectUser(String username) {
		driver.findElement(
				By.xpath("//a[text()='" + username + "']//parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click(); // Dynamic xpath - it will only work for this application

	}
	
	//company name -Dynamic xpath as below
	// Dynamic xpath 
	
	// //a[text()='Ali khan']/parent::td/following-sibling::td/a[@context="company"]
	
	public static String getUserCompanyName(String username) {
		
		return driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context=\"company\"]")).getText();
		
	}
	

}
