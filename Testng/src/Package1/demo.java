package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class demo 
{
	WebDriver	wd;
	@BeforeTest
	  public void beforeTest() 
	  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\New folder\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
	  }
	@Test(priority = 1)
	  public void login() throws InterruptedException 
	{
			Thread.sleep(2000);
		  	wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
			//wd.findElement(By.name("username")).sendKeys("admin");
			//wd.findElement(By.name("password")).sendKeys("admin123");
		  	wd.findElement(By.xpath("//*[@name=\'password']")).sendKeys("admin123");
			wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	  }
	@Test(priority = 2)
		public void	details() throws InterruptedException
		{
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			wd.findElement(By.xpath("//*[text()='Logout']")).click();
		}
		
  

  @AfterTest
  public void afterTest()
  {
	  wd.close();
  }

}
