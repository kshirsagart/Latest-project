package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _4Enabled {
        
	//when we want to ignoring test case execution then we use enable false

    @Test(priority=3,enabled=false)
	public void a() {
   	      
				Reporter.log("mathod a", true);
    }
    
    
	   @Test (priority=0,enabled=true)
			public void m() {
              
				Reporter.log("mathod m", true);
									
		
	}
	   @Test (priority=2,enabled=true)
		public void z() {
        
			Reporter.log("mathod z", true);
			
	   }
			 @Test (priority=2,enabled=false)
				public void p() {
		          
					Reporter.log("mathod p", true);
	
								

	   }
}





	
		

		
		
