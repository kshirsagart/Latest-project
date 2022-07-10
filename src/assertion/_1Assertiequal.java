package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class _1Assertiequal {
	
	//hardAssertion
	@Test
	public void zerodha() {
		String actual="Zera";
		String expected="Zerodha";
		Assert.assertEquals(actual, expected);
		Reporter.log("Test case failed", true);
	}
		
		@Test
		public void zerodha1() {
			String actual="Zerodha1";
			String expected="Zerodha1";
			Assert.assertEquals(actual, expected);
			Reporter.log("Test case pass", true);
			
		
	
		
		
	}
	

}
