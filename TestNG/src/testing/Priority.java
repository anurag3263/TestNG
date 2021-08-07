package testing;

import org.testng.annotations.Test;

public class Priority {    // priority used to execute classes in required order
	
	@Test(priority = 10)                 
	public void seatle()
	{
		System.out.println("Seatle");
	}
                    //by default priority will 0  and will execute first if u didn't assign priority to 2  then it will execute in 
	               // in alphabetical order
	@Test (priority = -4)
	public void philadelphia()
	{
		System.out.println("Philadelphia");
	}
	
	@Test   (priority = 2)              
	public void boston()
	{
		System.out.println("Boston");
	}
	
	@Test
	public void noida()
	{
		System.out.println("Noida");
	}

}
