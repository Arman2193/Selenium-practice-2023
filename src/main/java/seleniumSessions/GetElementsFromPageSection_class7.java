package seleniumSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection_class7 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//
//		List<WebElement> panelLinksList = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//
//		System.out.println(panelLinksList.size());
//
//		for (WebElement e : panelLinksList) {
//
//			String text = e.getText();
//			System.out.println(text);
//
//		}
		
			By rightPanelLinks= By.xpath("\"//aside[@id='column-right']//a");
			List<String> rightElesList= getElementsTextList(rightPanelLinks);
			System.out.println(rightElesList.contains("Login"));
			
	}

	public static List<String> getElementsTextList(By locator) {
		
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList) {
			String text= e.getText();
			eleTextList.add(text);
			
	
		}
		
		return eleTextList;
	}
	
	
	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}
	
	
}
