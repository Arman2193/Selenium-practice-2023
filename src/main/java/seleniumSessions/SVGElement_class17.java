package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement_class17 {

	//SVG element helps to design the graphs and on the html 
	// To create xpath for svg we have a separate formula to start with - //*[local-name()='svg'
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map/");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

	String svgXpath=  "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path'] ";
	
 	List<WebElement> statesList= driver.findElements(By.xpath(svgXpath));
 	
 	System.out.println(statesList.size());
		
 	for(WebElement e : statesList ) {
 		
 	String stateName=e.getAttribute("name");
 	System.out.println(stateName);
 	
 	if(stateName.equals("Maryland")) {
 		
 		e.click();
 		break;
 	}
 		
 		
 	}
 	
 	//We can create a generic method as below and pass the attribute through parameters
 	
 	
 	
	}
	//Eg:
public static void createUser(String name) {
 		
	String xpath = "//input[contains(text()='"+ name+"')]";//Dynamic xpath
 		
 	}

}
