package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGVerification {
	
	@Test
	public void verifyloginpage()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com");
		String expectedtitle="qspiders";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);//Assertion Error
		System.out.println("jspider");
	}
	@Test(dependsOnMethods = "verifyloginpage")
	public void anurag()
	{
		System.out.println("anurag");
	}

}
