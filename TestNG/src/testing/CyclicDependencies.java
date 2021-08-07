package testing;


import org.testng.annotations.Test;

public class CyclicDependencies {
	@Test
	public void login()
	{
		
		System.out.println("Login");
	}
	                                                                               //The following methods have cyclic dependencies
	@Test(dependsOnMethods = {"login","deletework"})  //will throw exception cyclic dependencies
	public void creatework()
	{
		
		System.out.println("Creatework");
	}
	
	@Test(dependsOnMethods = {"login","creatework"})
	public void deletework()
	{
		System.out.println("deletework");
	}


}
