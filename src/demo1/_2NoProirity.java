package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2NoProirity {
	

	@Test
	public void k() {
		System.out.println("k");
		Reporter.log("mathod 1", true);
		
		//default proirity is zero....
		//when we dont set the prority the the excution is depends on dictionary

	}
	

     @Test 
	public void a() {
    	       System.out.println("a");
				Reporter.log("mathod 2", true);
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
}