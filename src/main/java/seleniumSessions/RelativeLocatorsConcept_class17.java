package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept_class17 {

	public static void main(String[] args) throws InterruptedException {
		
		//We can get rid of complex xpaths and handle webtables using relative locators
		// Relative -we can as neighbour elements 
		
		// For eg there's a relative in the below point and we can move to the right ,
		// left up and down position and near as well
		//			 up
		
		// Left		   .        Right
		
		//           down
		
		//This was introduced in Selenium 4.X
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.aqi.in/in/dashboard/canada");
		Thread.sleep(2000);
		
	WebElement ele=	driver.findElement(By.linkText("Yellowknife, Canada"));
	
	String rightIndex =driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(rightIndex);
		
	String leftRank =driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftRank);	
		
	String aboveCity =driver.findElement(with(By.tagName("p")).above(ele)).getText();
	System.out.println(aboveCity);	
	
	
	String belowCity =driver.findElement(with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowCity);	
	
	// near - will find the nearest element of the base element as below under 100 pixels
	
	String nearCity =driver.findElement(with(By.tagName("p")).near(ele)).getText();
	System.out.println(nearCity);	
	
		
		
	}

}
