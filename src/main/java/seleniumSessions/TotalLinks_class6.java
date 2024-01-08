package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks_class6 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		// print the total links on the page 
		
		
		driver = new ChromeDriver();

		driver.get("https://amazon.com/");
		
		// Finding all the links on the page
		// for all the links we need to use tags locator as its unique 
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		
		int linksCount=linkList.size();
		System.out.println("Total Links count :" + linksCount);
		
		
		
		// print the text of each link
		
		//and avoid blank text - using for loop
		
//		for (int i =0;i<linksCount ;i++) {
//			
//			String text =linkList.get(i).getText();
//			
//			if(text.length()>0) // if condition will print only those link text whose length is more than zero
//				
//			{
//			System.out.println(i + ":"+ text); // i will give the line/ link number as well in which blank space is present
//			
//					
		
			// Using for each loop
				// e will go to the list one by one 
		
		int count =0;
		for(WebElement e : linkList) {
			
			String text =e.getText();
			if(text.length()>0) {
				System.out.println(count +" " +text);
				
			}
			count++;
		}
		
		
	

	}
	}
