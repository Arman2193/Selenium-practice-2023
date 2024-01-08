package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest_class1 extends BaseTest_class3 {

	

	// We dont need to write the if-else conditions , we have assert in testng as
	// below for validations
	
	
	
	
	
	// We should always create independent test cases as below 
	
	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title,
				"Amazon.com. Spend less. Smile more.");

	}

	@Test(priority = 2)
	public void searchExistTest() {

		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);

	}
	
	@Test(priority = 3)
	public void isHelpTest() {
		
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);

	}
	

	

}
