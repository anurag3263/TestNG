package testing;

import org.testng.annotations.Test;

public class PriorityInvocationCount {
   
	@Test (priority = -4, invocationCount = 2)
	public void philadelphia()
	{
		System.out.println("Philadelphia");
	}
	
	@Test   (priority = 2, invocationCount = 1)              
	public void boston()
	{
		System.out.println("Boston");
	}
	
	@Test(invocationCount = 3)
	public void noida()
	{
		System.out.println("Noida");
	}

}


