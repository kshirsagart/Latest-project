package demo1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _Class {

	
		 @Test(invocationCount=3)
			public void a() {
		   	       
						Reporter.log("a", true);
		    }
		    
		    
			   @BeforeTest
					public void m() {
		              
						Reporter.log("m", true);
											
				
			}
			   @BeforeClass
				public void z() {
		         
					Reporter.log("z", true);
					
			   }
					 @AfterTest 
						public void p() {
				          
							Reporter.log("p", true);
					 }	
							 @AfterClass 
								public void k() {
						          
									Reporter.log("k", true);
			
			
										

			   }
		





	}


