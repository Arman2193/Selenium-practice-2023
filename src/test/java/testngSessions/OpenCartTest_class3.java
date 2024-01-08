package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest_class3 extends BaseTest_class3 {
	
	
	
		// We dont need to write the if-else conditions , we have assert in testng as
		// below for validations
		
	
		
		// We should always create independent test cases as below 
		
		@Test(priority = 1)
		public void titleTest() {
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
			String title = driver.getTitle();
			System.out.println("page title :" + title);
			Assert.assertEquals(title,
					"Your Store");

		}

		@Test(priority = 2)
		public void searchExistTest() {

			boolean flag = driver.findElement(By.name("search")).isDisplayed();
			Assert.assertTrue(flag);

		}
		
		
		

		


}
