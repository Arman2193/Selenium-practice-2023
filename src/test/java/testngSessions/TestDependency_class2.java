package testngSessions;

import org.testng.annotations.Test;

public class TestDependency_class2 {

	// One test case/method is dependent on the another test case/method
	
	// that means without the dependsOnMethods- need to be executed first for the current test method for its execution
	
	//Below searchTest will execute first
	
	// But its not recommended to create dependency in the parallel execution
	// Hence the test cases should be independent
	// So - we need to arrange it accordingly - in the next class CRUDOperation_class2
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		
		// Because of the below failure the below dependent methods will get skipped
	 // int i =9/0;

	}

	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("addToCart");
		 int i =9/0;

	}

	@Test(dependsOnMethods = "addToCart")
	public void makePayment() {
		System.out.println("makePayment");

	}
}
