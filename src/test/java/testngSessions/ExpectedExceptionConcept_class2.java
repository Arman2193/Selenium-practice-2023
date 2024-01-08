package testngSessions;

import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class ExpectedExceptionConcept_class2 {

	// We can directly write the test method, without before and after annotations as well.
	
	// For expected exceptions we can mention the exceptions in bracket as below in the test annotations.
	// Also we can add particular exceptions as below or just "exceptions " as below
	//@Test(expectedExceptions = ArithmeticException.class)
	//@Test(expectedExceptions = Exception.class)
	
	//************ We can use to fool the client as well where we exceptions will not come in the demo.
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		
		System.out.println("Login test");
		int i=9/0;
		
	}
}
