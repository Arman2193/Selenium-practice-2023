package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShadowDOMConcept_class21 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		//driver.findElement(By.id("pizza")).sendKeys("veg pizza");
		
		// below is the hierarchy of the shadow dom 
		// and for shadow dom we dont have switch to frame function
		
		//browser --> page --> shadowDOM --> shadow DOM ---> input element
		
		// Please note IMP*****
		// Shadow dom should be open in the html 

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript(" return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		
		pizza.sendKeys("veg pizza");
		
	}

}
