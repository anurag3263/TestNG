package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {

	@FindBy(xpath="(//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplansLink;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timetrackLink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calenderLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoactitiplansMethod()
	{
		switchtoactiplansLink.click();
	}
	
	public void timetrackMethod()
	{
		timetrackLink.click();
	}
	
	public void tasksMethod()
	{
		taskLink.click();
	}
	
	public void reportsMethod()
	{
		reportsLink.click();
	}
	
	public void usersMethod()
	{
		usersLink.click();
	}
	
	public void calendersMethod()
	{
		calenderLink.click();
	}
	
	public void settingsMethod()
	{
		settingsLink.click();
	}
	
	public void integrationsMethod()
	{
		integrationsLink.click();
	}
	
	public void helpandsupportMethod()
	{
		helpandsupportLink.click();
	}
	
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		logoutLink.click();
	}
	
}



