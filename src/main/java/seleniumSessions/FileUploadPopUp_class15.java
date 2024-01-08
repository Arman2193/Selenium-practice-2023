package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp_class15 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		// use send keys instead of click -then only it will work
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/Arman/Desktop/Digital Marketing-Google.jpg");
		
		//Also he tag type should be file on html dom - <tag type="file"> its mandatory
		
		// We can use autoIT or Sikuli or Robot class  - but not recommended 
		
		// We can go the developer and ask them to add the <tag type="file"> in the html dom
		
		
		
		
		

	}

}
