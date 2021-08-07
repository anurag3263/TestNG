package testing;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependsOnMethod {
	
	@Test
	public void login()
	{
		
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "login")
	public void creatework()
	{
		Assert.fail();     // use to fail purposely any method
		System.out.println("Creatework");
	}
	
	@Test(dependsOnMethods = {"login","creatework"})
	public void deletework()
	{
		System.out.println("deletework");
	}

}
