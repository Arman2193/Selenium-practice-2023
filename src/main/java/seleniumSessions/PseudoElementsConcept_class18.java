package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class PseudoElementsConcept_class18 {

	public static void main(String[] args) {

		// in the html dom - we have :: elements , which are the pseudo elements 
		// Eg- the red * sign for mandatory fields 
		
		// In selenium we dont have any thing to support the pseudo element 
		// Hence we need to write a java script to handle it
		
		// Not imp for interview , but can be asked 
		
		
		// Below code is the java script code to use 
		
		// window.getComputedStyle(document.querySelector("label[for='input-firstname']") ,'::before').getPropertyValue('content')

		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		String script=" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\") ,'::before').getPropertyValue('content')";
		
		
		String mand_field= js.executeScript(script).toString();
		
		System.out.println(mand_field);
		
		if(mand_field.contains("*")) {
			
			System.out.println("This is mandatory");
		}
		
	}

}
