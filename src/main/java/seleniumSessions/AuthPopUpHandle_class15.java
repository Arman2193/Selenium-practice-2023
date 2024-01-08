package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle_class15 {

	// in auth pop up there are two text fields appear , in java script only one
	// field appears which is a confirmation pop up

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// We need to enter the username and password in the url itself as below for
		// auth pop up
		// Make sure the url and doesnt have @ in it , it should be simple

		// or we can store it in string and pass it in the url as below

		String username = "admin";
		String password = "admin";

		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
