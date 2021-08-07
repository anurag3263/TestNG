package testing;

import org.testng.annotations.Test;

public class InvocationCount {   // use to execute method desired time 
	                                          // by default invocation count is 1
	                                          // if count is <=0 the the method will not execute
	
	@Test(invocationCount = 0)
	public void seatle()
	{
		System.out.println("seatle");
	}
	
	@Test(invocationCount = 2)
	public void mumbai()
	{
		System.out.println("Mumbai");
	}
	
	@Test(invocationCount = 4)
	public void noida()
	{
		System.out.println("Noida");
	}
	
	@Test(invocationCount = 3)
	public void boston()
	{
		System.out.println("Boston");
	}

}
