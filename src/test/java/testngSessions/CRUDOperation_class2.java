package testngSessions;

import org.testng.annotations.Test;

// below is the best practice to remove the dependency concept of the test cases on each other
// So we should not create the dependency on the test cases.

// We need to use the below logic to overcome the dependency.

// in api testing as well the below logic can be used

public class CRUDOperation_class2 {

	public void createUser() {

	}

	public void getUser(int userId) {
		System.out.println("get userid:"+userId);
	}

	public void updateUser(int userId) {

	}

	public void deleteUser(int userId) {

	}

	@Test
	public void createUserTest() {

		createUser();
	}

	@Test
	public void getUserTest() {

		createUser(); // post
		getUser(123);    // get

	}

	@Test
	public void updateUserTest() {

		createUser(); // post
		getUser(123);	  // get	
		updateUser(123); // put
		getUser(123);    // get            // will try to get the user details after updating
	}

	@Test
	public void deleteUserTest() {

		createUser(); 		// post
		getUser(123);	   		// get
		deleteUser(123);	//delete
		getUser(123); 			//get			// will try to get the user details after deleting
	}
	
	// For eg -we keep the user id as hard coded as below it will not be feasible 
	@Test
	public void getUserTesting() {
		
		int userId= 123; // hard coded userid
		// so below environments might have different user id . hence its not feasible
		// QA-->stage-->dev-->UAT-->prod
		
		getUser(userId);
		
		
	}
	
	
	
	

}
