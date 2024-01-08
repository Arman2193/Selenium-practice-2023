package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest_class2 {

	public WebDriver driver;

	public boolean doLogin(String userName, String password) {

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		if (errorMsg.contains("No match for E-Mail Address and/or Password")) {
			return true;

		}
		return false;
	}

	// So the below is one set of negative test case/annotations we create , but
	// imagine we need to create multiple test data
	// we would need to create multiple annotations test method for just login
	// feature -negative and positive both
	// Hence we need to use data providers to supply different set of data.

	// We would need to use 2d object array -as it will hold aplha numeric data
	// Object [row][col]- it will pass in this manner

	@DataProvider
	public Object[][] getLoginNegativeData() {

		return new Object[][] { { "dsf.gmail.com", "2ssafweq" }, { "asfsfaf.gmail.com", "387sgsd" },
				{ "erwwrw.gmail", "89798sdfsf" }, { " ", "ljeflslf" }, { "dsfmsdf", " " },

		};

	}

	// Below concept is called the data driven approach- also parameterization of
	// test cases

	@Test(dataProvider = "getLoginNegativeData") // we need to map the data provider method name- and data will be
													// supplied one by one
	public void loginTest(String userName, String password) {

		boolean flag = doLogin(userName, password);

		Assert.assertTrue(flag);
	}
	
	// Create a method as above doLogin - for the below 
	
	@DataProvider
	public Object[][] getRegTestData() {

		return new Object[][] {

				{ "Arman", "Baig", "arman@gmail.com", "8764563728", "Arman123" },
				{ "AMAN", "lal", "arman@gmail.com", "8764563729", "Aman123" },
				{ "asd", "Baig", "asd@gmail.com", "8764563727", "Asd123" }, };
	}

	@Test(dataProvider = "getRegTestData")
	public void registerTest(String fn,String ln,String email,String phone, String password) {
			
		System.out.println("fn + ln + email + phone + password");
		
	}

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@AfterTest
	public void tearDown() {

		// driver.quit();

	}
}
