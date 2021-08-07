package testing;

import org.testng.annotations.Test;

public class MultipleTestingMethod {  // will execute in alphabetical order
	
	@Test
	public void seatle()
	{
		System.out.println("Seatle");
	}
	
	@Test
	public void philadelphia()
	{
		System.out.println("Philadelphia");
	}
	
	@Test
	public void boston()
	{
		System.out.println("Boston");
	}

}
