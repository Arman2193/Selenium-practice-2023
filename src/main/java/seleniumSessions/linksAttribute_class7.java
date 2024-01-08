package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksAttribute_class7 {
	
	// Web scraping - Pulling the all the links and text from the web page ( interview  question)
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
	
		driver.get("https://www.amazon.com");
		//driver.findElements(By.tagName("a"));
	
		By links=By.tagName("a");
		By images = By.tagName("img"); 
		
		// Link and text
		
//		List<WebElement>Linkslist= getElements(links);
//		System.out.println("Total links" + Linkslist.size());
//		
//		for (WebElement e : Linkslist) {
//			
//			String hrefVal= e.getAttribute("href");
//			String linkText= e.getText();
//			System.out.println(hrefVal +" ----> " + linkText);
//		}
//		
		
		// image list 
		// we can create a generic utlility for the below 
//		List<WebElement> imagesList =getElements(images);
//		System.out.println("total images " + imagesList);
//		
//		for(WebElement e : imagesList) {
//			
//			String srcVal=e.getAttribute("src");
//			System.out.println(srcVal);
//		}
		
		getElementAtrributes(images, "src");
		getElementAtrributes(links, "href");
		
	}
	
	public static void getElementAtrributes(By locator , String AttrName) {
		
		List<WebElement> eleList= getElements(locator);
		for (WebElement e: eleList) {
			
			String attrVal=e.getAttribute(AttrName);
			System.out.println(attrVal);
			
			
		}
	}
	
	public static List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
		
	}

}
