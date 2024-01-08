package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept_class13 {

	// //*[@class and @id] - * will check in the entire html dom
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		List<WebElement> secList = driver
//				.findElements(By.xpath("//h5[text()='Information']/following-sibling ::ul//a"));
//		System.out.println(secList);
//
//		for (WebElement e : secList) {
//
//			System.out.println(e.getText());
//		}
		
		
		List<String> infoList= getFooterSectionList("Information");
		System.out.println(infoList);
		List<String> accList= getFooterSectionList("My Account");
		System.out.println(accList);
	}
	

	public static List<String> getFooterSectionList(String sectionName) {

		List<WebElement> secList = driver
				.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling ::ul//a"));
		System.out.println(secList.size());
		List<String> secVaList= new ArrayList<String>();
		for (WebElement e : secList) {

			String text= e.getText();
			secVaList.add(text);
		}	
		return secVaList ;
	}
}
