package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasksPage
{
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectLink;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newtasksLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod()
	{
		addnewButton.click();
	}
	
	public void newcustomerMethod()
	{
		newcustomerLink.click();
	}
	
	public void newprojectMethod()
	{
		newprojectLink.click();
	}
	
	public void newtasksMethod()
	{
		newtasksLink.click();
	}
}