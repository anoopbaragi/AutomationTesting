package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class web 
{
	WebDriver wd;
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get("https://www.google.com");
  }
  
  @Test
  public void f() 
  {
  }

  @AfterTest
  public void afterTest() {
  }

}
