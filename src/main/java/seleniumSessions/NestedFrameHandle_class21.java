package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle_class21 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//nested iframes - has frames inside a frame - We have to follow the below hierarchy 
		//f1 -- ele
			//f2  -- ele
				//f3 -- ele
		
		//we can write in the below format as well
		

		driver.switchTo()
		.frame("pact1")
			.switchTo().frame("pact2")
					.findElement(By.id("jex"))
						.sendKeys("PQR");;//f2
		
		
		//------------------------------------
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("ABC");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("PQR");
		
		
		// Switches to the parent frame - in reverse manner
		driver.switchTo().parentFrame();// available from selenium 4.x -- f1
		driver.findElement(By.id("inp_val")).sendKeys("ABC--new");
		
		
		driver.switchTo().frame("pact2");//f2
		driver.switchTo().frame("pact3");//f3
		driver.findElement(By.id("glaf")).sendKeys("Naveen");
		
		driver.switchTo().parentFrame();//sel 4.x -- f2
		driver.switchTo().parentFrame();//sel 4.x -- f1
		//driver.switchTo().defaultContent();// main page
		driver.findElement(By.id("inp_val")).sendKeys("ABC---456");

		// coming to the new page
		driver.switchTo().defaultContent();
	}

}
