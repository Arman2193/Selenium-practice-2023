package testngSessions;

import org.testng.annotations.Test;

// Below test methods will run according to the priority
// if we mention same priority for multiple test methods -then it will pick in alphabetic order
// We can give 0 priority as well -it will be picked first
// We can give negative priority as well(-1) it will be picked before 0 as well 

// If there is priority test cases and non priority test methods - then the non priority will execute first in alphabetic order and then priority ones will execute


public class PriorityTest_class2 {
	
	@Test(priority = 5)
	public void a_test() {
		System.out.println("a_test");
	}
	
	@Test(priority = 3)
	public void b_test() {
		System.out.println("b_test");
	}
	
	@Test(priority = 2)
	public void c_test() {
		System.out.println("c_test");
	}
	
	@Test(priority = 1)
	public void d_test() {
		System.out.println("d_test");
	}

	@Test(priority = 4)
	public void e_test() {
		System.out.println("e_test");
	}
}
