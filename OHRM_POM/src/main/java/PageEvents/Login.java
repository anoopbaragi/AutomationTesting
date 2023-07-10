package PageEvents;


import Base.BaseTest;
import PageObjects.Loginpage;

public class Login extends BaseTest implements Loginpage
{
	public void Login_Page()
	{
		wd.findElement(UserName).sendKeys("Admin");
        wd.findElement(Password).sendKeys("RBHh7spC@8");
        wd.findElement(Submit).click();
	}
}
