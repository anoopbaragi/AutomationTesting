package Package1;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageEvents.Login;

public class TestCases extends BaseTest
{
	Login lg = new Login();
  @Test
  public void Test_Case1() 
  {
	  lg.beforesuite();
	  lg.Login_Page();
  }
}
