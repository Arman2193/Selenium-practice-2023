package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling_class22 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		// Below xpath element is not working- hence need to investigate
		WebElement shopParentEle = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']"));
		
//		//moves to the mouse to the above element 
//		Actions act = new Actions(driver);
//		act.moveToElement(shopParentEle).build().perform();
//		Thread.sleep(2000);
		
		//moves to the mouse to the below element 
//		WebElement L2ele=driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(L2ele).build().perform();
//		Thread.sleep(2000);
//		//moves to the mouse to the below element 
//		WebElement L3ele=driver.findElement(By.linkText("Tea"));
//		act.moveToElement(L3ele).build().perform();
//		Thread.sleep(2000);
//		
//		//clicks on the element
//		WebElement L4ele=driver.findElement(By.linkText("Tea Bags" ));
//		L4ele.click();
		
		// Imp -******
		// When we move the mouse cursor to the menu , and it disappears when we try to inspect the web element
		// we need to go to the source next to console option, select the option we want to inspect and then press f8
		// and then go back to the console and inspect the element.
		
		By L1Cat = By.cssSelector("a.meganav-shop");
		// one combination
		//selectProductLevel4Handling(L1Cat,"Beverages", "Tea", "Tea Bags");
		
		// second combination
		selectProductLevel4Handling(L1Cat,"Snacks & Branded Foods", "Snacks & Namkeen", "Chips & Corn Snacks");
	
	}

	// Creating a generic method for the above menu to
	public static void selectProductLevel4Handling(By l1ByLocator,String l2, String l3, String l4) throws InterruptedException {
		
	
		{
			
			WebElement shopParentEle = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']"));

			Actions act = new Actions(driver);
			act.moveToElement(shopParentEle).build().perform();
			Thread.sleep(2000);

			WebElement L2Ele = driver.findElement(By.linkText(l2));
			act.moveToElement(L2Ele).build().perform();
			Thread.sleep(2000);

			WebElement L3Ele = driver.findElement(By.linkText(l3));
			act.moveToElement(L3Ele).build().perform();
			Thread.sleep(2000);

			WebElement L4Ele = driver.findElement(By.linkText(l4));
			L4Ele.click();
		}
			
			
			
		}
	}

