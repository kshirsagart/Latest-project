package assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _8groups {
	
	@Test(groups="smoke")
	public void m1() {
		Reporter.log("m1", true);
	}
     
	@Test(groups="regression")
	public void m2() {
		Reporter.log("m2", true);
	}

	@Test(groups="smoke")
	public void m3() {
		Reporter.log("m3", true);
	}

}
