package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarHandle_class25 {
	
	// Need to write the code from video as its not available
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		

		
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		
	
		
		//driver.findElement(By.xpath("//a[text()='23']")).click();
		
		selectFutureDate("July 2023", "7");

	}

public static void selectFutureDate(String monthYear, String day) {
		
		String acMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(acMonthYear);
		
		while(!acMonthYear.equals(monthYear)) {
			Actions act = new Actions(driver);
			act.click(driver.findElement(By.xpath("//span[text()='Next']"))).perform();
			acMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(acMonthYear);
		}
		
		List<WebElement> daysList = 
				driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
	
	for(WebElement e : daysList) {
		String text = e.getText();
			if(text.equals(day)) {
				e.click();
				break;
			}
	}}
	
}
