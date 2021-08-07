package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateNewCustomerPage {
	 
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerbutton;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancelbutton;
	
	@FindBy(id="customerLightBoxCloseButton")
	private WebElement closebutton;
	
	
	public ActitimeCreateNewCustomerPage(WebDriver driver )     //Initializing
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernameMethod()       // Utilization
	{
		entercustomernameTextfield.sendKeys("anurag");
	}
	
	public void createcustomerMthod()
	{
		createcustomerbutton.click();
	}
	public void cancelMethod() 
	{
		cancelbutton.click();
	}
	public void closeMethod()
	{
		closebutton.click();
	}
	
	//public void alertacceptMethod(WebDriver driver) // this also correct
	public void alertacceptMethod()
	{
     Alert alt= driver.switchTo().alert();
     alt.accept();
     
	}
	public void alertdismissMethod()
	{
		Alert alt1=driver.switchTo().alert();
		alt1.dismiss();
	}
}
