package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class New
{
	WebDriver wd;
	
  @Test
  public void f() 
  {
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get("https://www.google.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
