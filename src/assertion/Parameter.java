package assertion;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	@Parameters({"val1","val2"})
	public void sum(int a, int b) {
		int c=a+b;
		Reporter.log("sum"+" "+c , true);
	}

}
