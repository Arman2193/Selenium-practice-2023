package seleniumSessions;

public class WaitInSelenium_class22 {

	public static void main(String[] args) {
		
		// script - app
		
		//script - if the app is slow,fast,very slow at that time we need the use of waits
		
		// Concept is also called 'Synchronization' of the script and app
		
		// Types of wait -
		// 1. Static wait : thread.sleep(5000) - will pause for 5 seconds
		// 2. dynamic wait: 10 secs -- > if its done in 3 sec -- > 8 secs will be ignored.
		
		
		// Dynamic wait : Selenium provides 2 types
		// 1. Implicitly wait -global wait -Will wait for all the elements
		
		// 2. Explicit wait - will wait for only a specific element and it supports non web elements as well
								//i. WebdriverWait   
								//ii.FluentWait
		
		 // Please note:
		 // WebdriverWait(class) -> extends - >FluentWait(class) -> implements -> Wait(Interface) has -> until() Method
									//until(){} // comes from fluent wait
									//other methods{}
			// child of FluentWait is  WebdriverWait
		
		
		//   Explicit wait- has polling and interval time

	}

}
