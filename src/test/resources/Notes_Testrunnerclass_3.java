
public class Notes_Testrunnerclass_3 {

	// We need to create a runner class -an xml file in which we would need to
	// define the test class that we need to execute
	// And you would need to create test blocks for each test method and then run
	// the xml file
	// It will run all the test methods one by one and give the results.

	// *****************************************************************************

	// Verbose logs: if we need the information releated to tests that we run -we
	// need to keep the verbose as 3 or 4
	// then will start getting the details of the tests that we run.

	// *****************************************************************************

	// TestNG parameterization : We can also pass some values through the xml files
	// as well
	// We need to use @parameters annotations in the base test class

	// We can also pass diffrent parameters -eg we want execute all the test methods
	// in different browsers

	// *****************************************************************************

	// Please note -we need to use TestNG parameterization in xml file -while we
	// want to give enviornmental parameters eg- url,username, password,database
	// info etc -these are environment specific data

	// While using the data -eg registration details and all we use the dataprovider
	// annotations

	// *****************************************************************************

	// We can also use parallel execution using the runner xml file , using the
	// thread counts
	// earlier it was opening the browser one by one , after using the thread counts
	// - browser will open paralely at the same time - it will take less time 
	
	// We can create seaprate xml files -where we can run the separate browsers
	
	
	// If we need to run the failed test cases- then we have a xml file created after we run the tests in the test-output folder - testing-failed.xml
	
	

}
