package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle_class15 {

	public static void main(String[] args) {
	
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		int frameSize=driver.findElements(By.xpath("//frame")).size();
		System.out.println(frameSize);
		//1. driver.switchTo().frame(2); - indexing is very risky
		
		//2.driver.switchTo().frame("main"); - we can use name
		
		//3.
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src=\"top.html\"]"))); //we can create xpath ans then switch to that frame
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		// Note- we can use from above the second and third option
		
		// After we are done with the frame -we need to come out of the frame , we can using the below 
		driver.switchTo().defaultContent();
		
		// There are two types of frames-
		
		//1.frame - frame is fixed on the webpage
		//2.iframes - n number of frames can be created and it can be moved on the webpage 
		   // iframes - security is provided 
		
		
		
		
	}

}
