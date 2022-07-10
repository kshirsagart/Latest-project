package demo1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _6Test {

	 @Test(invocationCount=3)
		public void a() {
	   	       
					Reporter.log("a", true);
	    }
	    
	    
		   @BeforeTest
				public void m() {
	              
					Reporter.log("m", true);
										
			
		}
		   @Test
			public void z() {
	         
				Reporter.log("z", true);
				
		   }
				 @AfterTest 
					public void p() {
			          
						Reporter.log("p", true);
		
									

		   }
	}



