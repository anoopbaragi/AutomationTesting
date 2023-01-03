package Package2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report 
{
	ExtentReports extent;
	ExtentTest logger;
	WebDriver wd;
  @BeforeTest
  public void beforeTest()
  {
	  extent = new ExtentReports(System.getProperty("user.dir")+ "/test-output/anoop.html",true);
	  extent.loadConfig(new File(System.getProperty("user.dir")+ "src\\test\\java\\extent-config.xml"));
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
  }
	@Test
  public void ohrm() throws InterruptedException
  {
	  logger = extent.startTest("Demo");
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  logger.log(LogStatus.PASS, "web page has opened");
		Thread.sleep(3000);//in the report we will have a record of the steps performed
		
		String title=wd.getTitle();
		logger.log(LogStatus.PASS, "title");
		Thread.sleep(3000);
		
		Assert.assertEquals("demo", "demo");
		logger.log(LogStatus.PASS, "Assert passed");
		Thread.sleep(3000);
		
		wd.findElement(By.name("username")).sendKeys("Admin");
		logger.log(LogStatus.PASS, "username Entered");
		Thread.sleep(3000);
		
		wd.findElement(By.name("password")).sendKeys("admin12g3");
		logger.log(LogStatus.PASS, "username Entered");
		Thread.sleep(3000);
		
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		logger.log(LogStatus.PASS, "login successfully");
		Thread.sleep(3000);
  }
	
	@AfterTest
	public void afterTest()
	{
		extent.endTest(logger);// end the logger functions
		extent.flush();//it will push the all logger data on html report
		extent.close();// it will give end to the reports
	}
}
