package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
   public WebDriver driver;

	@Test
	public void verifyloginpage()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://demo.actitime.com");
		String expectedtitle="qspiders";
		String actualtitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);//Assertion Error
		
		System.out.println("jspider");
		s.assertAll();
		System.out.println("pyspider");
}
	@Test
	public void anurag()
	{
		System.out.println("anurag");
	}
}