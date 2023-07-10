package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Pages.*;
import Configaration.Config;
public class Test_Cases extends Config
{
	Login login;
	HRA hra;
	Add_User add_User;
	Logout logout;

	public Test_Cases()
	{
		super();
	}
	@BeforeSuite
	public void setup() 
	{
		initialization();
		login = new Login();
		hra = new HRA();
		add_User = new Add_User();
		logout = new Logout();
	}
	@Test
	public void Test_Case() throws InterruptedException
	{
		login.Login_Page(properties.getProperty("un"), properties.getProperty("pass"));
		login.Page_Title();
		Assert.assertEquals(login.Get_Title, properties.getProperty("Expected_Title"));
		hra.Select_HRA();
		add_User.User_Details();
		logout.Logout_account();
		login.Login_Page(properties.getProperty("un_1"), properties.getProperty("new_password"));
		add_User.Fetch_Details();
		logout.Logout_account();
		Assert.assertEquals(Actual_Data, Expected_Data);
//		System.out.println(Actual_Data);
//		System.out.println(Expected_Data);
	}
	@AfterSuite
	public void TearDown()
	{
		CloseTheBrowser();
	}
}