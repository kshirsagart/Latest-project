package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _5Invocationcount {

	//when we want to execute same test case multiple times then we use invocation count..
	//console as well as email able report
	  @Test(invocationCount=3)
		public void a() {
	   	       System.out.println("a");
					Reporter.log("mathod 1", true);
	    }
	    
	    
		   @Test 
				public void m() {
	              System.out.println("m");
					Reporter.log("mathod 3", true);
										
			
		}
		   @Test 
			public void z() {
	         System.out.println("z");
				Reporter.log("mathod 4", true);
				
		   }
				 @Test 
					public void p() {
			          System.out.println("p");
						Reporter.log("mathod 5", true);
		
									

		   }
	}

