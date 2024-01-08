package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;


public class JavaScriptExecutorConcept_class20 {

	public static void main(String[] args) throws InterruptedException {
	
		
		// Java script executor will help us to execute java script based elements
		// Java script executor is a interface
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//       JavascriptExecutor js=(JavascriptExecutor) driver;
//       
//      String title= js.executeScript("return document.title").toString();
//      
//      System.out.println(title);
//      
//      //generating alert
//
//      js.executeScript("alert('hi this is alert ');");
//      
		
      JavaScriptUtil_class20 jsUtil= new JavaScriptUtil_class20(driver);
       
      String title= jsUtil.getTitleByJS();
       System.out.println(title);
       
	// alert
     //  jsUtil.generateAlert("This is my js alert");
    // confirm pop up
     //  jsUtil.generateConfirmPopUp("are you sure ?");
       
    // refresh browser
     //  jsUtil.refreshBrowserByJS();
       
      // inner text of the web page 
//  String pageText=   jsUtil.getPageInnerText();  
//  
//  System.out.println(pageText);
//  if(pageText.contains("Deal Pipeline")) System.out.println(true);
//  if(pageText.contains("UNLIMITED CAMPAINGNS")) System.out.println(true);
  
  // draw border -will create a border on the part of the webpage
       
      WebElement form= driver.findElement(By.id("nav-search-bar-form"));
      //jsUtil.drawBorder(form);
       
       
  // flash - dont bother how the flash method is working just use the method from js util package  	
      
  //    jsUtil.flash(form);
    //  form.sendKeys("arman.baig");
      
      // Scroll
      
      jsUtil.scrollPageDown();
      Thread.sleep(2000);
      
      
       

	}

}
