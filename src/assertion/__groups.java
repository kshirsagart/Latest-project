package assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class __groups {

	@Test(groups="smoke")
	public void m4() {
		Reporter.log("m4", true);
	}
     
	@Test(groups="regression")
	public void m5() {
		Reporter.log("m5", true);
	}

}
