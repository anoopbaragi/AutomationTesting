package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Wait_Statments;

public class Logout extends Wait_Statments
{
	@FindBy(xpath = "//*[text()='Log Out']")
	WebElement Logout;
	
	public Logout()
	{
		super();
		PageFactory.initElements(wd, this);
	}
	
	
	public void Logout_account() throws InterruptedException
	{
		Sleep();
		Logout.click();
	}
}
