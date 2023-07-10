package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configaration.Config;

public class Login  extends Config
{
	@FindBy(id = "txtUsername")
	WebElement User_Name;

	@FindBy(id = "txtPassword")
	WebElement Password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement Submit;
	
	public Login()
	{
		PageFactory.initElements(wd, this);
	}
	
	public void Login_Page(String UserName,String password)
	{
		User_Name.sendKeys(UserName);
		Password.sendKeys(password);
		Submit.click();
	}
	public String Page_Title()
	{
		Get_Title = wd.getTitle();
		System.out.println(Get_Title);
		return Get_Title;
	}

}