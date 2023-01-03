package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class blogin
{
	WebDriver wd;
	String URl ="https://demoqa.com/login";
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URl);
	  wd.manage().window().maximize();
  }

  @Test
  public void books() throws InterruptedException 
  {
	JavascriptExecutor js = (JavascriptExecutor)wd;
	js.executeScript("window.scrollBy(0,250)");
	Thread.sleep(3000);
	wd.findElement(By.id("newUser")).click();  
	js.executeScript("window.scrollBy(0,200)");
	wd.findElement(By.id("firstname")).sendKeys("Anoop");
	wd.findElement(By.id("lastname")).sendKeys("Baragi");
	wd.findElement(By.id("userName")).sendKeys("anoop");
	wd.findElement(By.id("password")).sendKeys("abcd@123");
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	wd.findElement(By.xpath("//*[@class='recaptcha-checkbox-spinner']")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
