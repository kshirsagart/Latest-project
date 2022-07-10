package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _3Setproirity {
	
	//when we set priority the execution will depends on the prority
	//only works in console

	@Test(priority=-3)
	public void k() {
		System.out.println("k");
		Reporter.log("mathod 1", true);
		
		//default proirity is zero....
		//when we set the priority then the exection will depends on proirity
		//+ve priority
		//-ve priority
		//0 priorty
		//duplicate prioroty

	}
	

     @Test(priority=3)
	public void a() {
    	       System.out.println("a");
				Reporter.log("mathod 2", true);
     }
     
     
	   @Test (priority=0)
			public void m() {
               System.out.println("m");
				Reporter.log("mathod 3", true);
									
		
	}
	   @Test (priority=2)
		public void z() {
          System.out.println("z");
			Reporter.log("mathod 4", true);
			
	   }
			 @Test (priority=2)
				public void p() {
		          System.out.println("p");
					Reporter.log("mathod 5", true);
	
								

	   }
}


