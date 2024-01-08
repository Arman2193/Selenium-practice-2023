package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest_class1 {

	// So we keep the below points while adding the test cases manually
	// Similarly we need follow the below hierarchy to create test cases in testng

	// 1. Global pre conditions
	// 2. pre conditions
	// 3. test cases --> test steps --> actual vs expected result -->Assertions
	// 4. post steps
	// 5. post global steps

	// there are various annotations to use for the above steps

	// So "Before" is used for pre conditions
	
	
	// Below are the execution preference after we run
//	BS -- startDBConnection 
//	BT -- createUser 
//	BC -- launchBrowser
	
//	BM --- loginToApp 
//	homePageSearchTest  ---test1
//	AM-- logout
	
//	BM --- loginToApp 
//	homePageTitleTest   ---test2
//	AM-- logout
	
	
//	BM --- loginToApp 
//	homePageURLTest		---test3
//	AM-- logout
	
//	AC-- closeBrowser
//	AT-- deleteUser
//  AS-- logout
	
	
	
	
	
	
	
	
	
	
	// Preference 1 
	@BeforeSuite
	public void startDBConnection() {

		System.out.println("BS -- startDBConnection ");

	}
	
	// Preference 2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- createUser ");

	}

	// Preference 3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");

	}
	// Preference 4 ,Preference 7, Preference 10
	 
	// 	@BeforeMethod-  Will be executing before each and every test method ,So below 3 methods -it will execute 3 times
	// @Test - it will execute the test methods in alphabetical order
	
	// So
	
	@BeforeMethod
	public void loginToApp() {

		System.out.println("BM --- loginToApp ");
	}

	// In between the before and after conditions -we would keep the test
	

	//Preference 11
	@Test

	public void homePageTitleTest() {

		System.out.println("homePageTitleTest");

	}

	//Preference 8
	@Test
	public void homePageURLTest() {

		System.out.println("homePageURLTest");

	}
	
	//Preference 5
	@Test
	public void homePageSearchTest() {

		System.out.println("homePageSearchTest");

	}
	
	
	// "After" will be used for post conditions
	// Will be executing after each and every test method
	
	// Preference 6 ,Preference 9,Preference 12
	@AfterMethod
	public void logout() {

		System.out.println("AM-- logout");

	}
    // Preference 13
	@AfterClass
	public void closeBrowser() {

		System.out.println("AC-- closeBrowser");

	}
	//Preference 14
	@AfterTest
	public void deleteUser() {

		System.out.println("AT-- deleteUser");

	}
	// Preference 15
	@AfterSuite
	public void disconnectWithDB() {

		System.out.println("AS-- logout");

	}

}
