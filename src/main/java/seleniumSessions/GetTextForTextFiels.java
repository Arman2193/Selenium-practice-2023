package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextFiels {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	WebElement fn	=driver.findElement(By.id("input-firstname"));
	
	fn.sendKeys("Arma");
	
	// get text will not work , we will need to fetch the value attribute to fetch
	
	//String name= fn.getText();
	String name= fn.getAttribute("value");
	System.out.println(name);
	
	// interview question- 
	// entering null in the field - it will throw exception 
	//illegal argument exception()
	WebElement ln	=driver.findElement(By.id("input-lastname"));
	ln.sendKeys(null); //illegal argument exception()
	
	
	
	}

}
