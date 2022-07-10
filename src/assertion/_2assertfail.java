package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2assertfail {
	
	@Test
	public void zerodha() {
		String actual="koshika";
		String expected="koshika";
		Assert.assertEquals(actual, expected);
		Reporter.log("Test case pass", true);
	}
	
	@Test
	public void login(){
		System.out.println("Hello java");
		Reporter.log("Test case fail", true);
		Assert.fail();
		Reporter.log("fail", true);
	}

}
