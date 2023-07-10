package Package1;


import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Configaration
{
	public  WebDriver	wd;
	String Main_URL = "https://mysuru-trials79.orangehrmlive.com/auth/login";
	String  User_Name;
	String User_Name_1;
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(Main_URL);
	  wd.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  wd.close();
  }

}
