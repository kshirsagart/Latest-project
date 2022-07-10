package assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _9parallel {

	@Test
	public void m3() {
		Reporter.log("m3", true);
	}
     
	@Test
	public void m2() {
		Reporter.log("m2", true);
	}

	@Test
	public void m1() {
		Reporter.log("m1", true);
	}

}
