package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _1Excecution {

	@Test
	public void login() {
		System.out.println("Hello java");
		//syso method will display the result only in console
		Reporter.log("mathod 1", true);
		//reporter method gives a result in email report as well as console when boolean expression is true
	}
	

     @Test 
	public void logout() {
		System.out.println("Hello c++");
		//syso method will give the result only in console
		Reporter.log("mathod 2", false);
		//reporter method gives a result only  in email report ..
	}
		

	

}
