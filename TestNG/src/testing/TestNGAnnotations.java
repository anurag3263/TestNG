package testing;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
  @Test
  public void boston()
  {
	  Reporter.log("Boston", true);
  }
  @Test
 public void philadelphia()
  {
	  Reporter.log("Philadelphia",true);
  }
  @Test 
  public void seatle()
  {
	  Reporter.log("Seatle",true);
  }
  @BeforeClass 
  public void  losangeles()
  {
	  Reporter.log("losangeles",true);
  }
  @BeforeMethod
  public void sandiego()
  {
	  Reporter.log("Sandiego",true);
  }
  @BeforeSuite
  public void sanfansisco()
  {
	  Reporter.log("Sanfansisco",true);
  }
  @BeforeTest
  public void california()
  {
	  Reporter.log("California",true);
  }
  @AfterSuite
  public void chicago()
  {
	  Reporter.log("Chicago",true);
  }
  @AfterTest
  public void newyork()
  {
	  Reporter.log("Newyork",true);
  }
  @AfterMethod
  public void austin()
  {
	  Reporter.log("Austin",true);
  }
  @AfterClass
  public void sanjose()
  {
	  Reporter.log("Sanjose",true);
  }
  
}
