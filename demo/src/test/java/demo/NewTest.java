package demo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromiumdriver().setup();
  }

  @AfterTest
  public void afterTest() {
  }

}
