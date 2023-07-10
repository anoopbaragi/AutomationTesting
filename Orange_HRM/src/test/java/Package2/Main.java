package Package2;

import java.awt.AWTException;

import org.testng.annotations.Test;
import Package1.*;

public class Main extends Configaration
{
  @Test
  public void Test_Case1() throws AWTException, InterruptedException
  {
	  Login_Page lg = new Login_Page();
	  Click_HRA_AddUsers add = new Click_HRA_AddUsers();
	  User_Details ud = new User_Details();
	  Logout lgout = new Logout();
	  GetText gt = new GetText();
	  Compare cmp = new Compare();
	  beforeTest();
	  lg.Login();
	  add.HRA_Add_Users();
	  ud.Add_User();
	  lgout.Log_out();
	  lg.Login_1();
	  gt.Get_Text();
	  lgout.Log_out();
	  afterTest();
	  cmp.Compare_Usernames();
  }
}
