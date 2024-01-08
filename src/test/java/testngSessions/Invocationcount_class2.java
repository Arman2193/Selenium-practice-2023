package testngSessions;

import org.testng.annotations.Test;

public class Invocationcount_class2 {

	// Invocation count is running the same test case number of times
	// We can use the below scenario for searching a same product back to back in an e-commerce web site
	
	@Test(invocationCount = 10)
	public void createUser() {
		System.out.println("createUser");
	}
}
