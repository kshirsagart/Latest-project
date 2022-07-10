package demo1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _8Method {

	 @Test
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
						   @BeforeMethod
							public void f() {
					         
								Reporter.log("f", true);
								
						   }
								 @AfterMethod 
									public void j() {
							          
										Reporter.log("j", true);
								 }
										@AfterClass
										public void g() {
								          
											Reporter.log("g", true);			
		
				    					

		   }
	




}
