package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest_class3 extends BaseTest_class3{
	
	
	// We would need to have run all the test methods at once in a bundle
	// Hence there's one concept in testng for running all the test class at once
	// We have runner file -in which we can bundle all of the class and run them
	

		// We dont need to write the if-else conditions , we have assert in testng as
		// below for validations
		
		
		
		
		
		// We should always create independent test cases as below 
		
		@Test(priority = 1)
		public void titleTest() {
			driver.get("https://www.google.com");
			String title = driver.getTitle();
			System.out.println("page title :" + title);
			Assert.assertEquals(title,"Google");

		}

		@Test(priority = 2)
		public void searchExistTest() {

			boolean flag = driver.findElement(By.name("q")).isDisplayed();
			Assert.assertTrue(flag);

		}
		
	
		

		
	

}
