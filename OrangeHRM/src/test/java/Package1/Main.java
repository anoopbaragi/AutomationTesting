package Package1;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Main 
{
	WebDriver	wd;
	String Main_URL = "https://mysuru-trials79.orangehrmlive.com/auth/login"; 
	String  User_Name = "Baragi1";
	String User_Name_1;

  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(Main_URL);
	  wd.manage().window().maximize();
  }
  @Test(priority = 1)
  public void Login_Admin() 
  {
	  wd.findElement(By.id("txtUsername")).sendKeys("Admin");
	  wd.findElement(By.id("txtPassword")).sendKeys("RBHh7spC@8");
	  wd.findElement(By.xpath("//*[@type='submit']")).click(); 
  }
  @Test(priority = 2)
  public void Click_HRA_AddUsers() throws InterruptedException
  {
	  wd.findElement(By.linkText("HR Administration")).click();
	  WebDriverWait wait = new WebDriverWait(wd, 25);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='ohrm_edit']")));
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@class='btn-floating btn-large waves-effect waves-light']")).click();
	  Thread.sleep(2000);
  }
  @Test(priority = 3)
  public void AddUsers() throws InterruptedException, AWTException
  {
	  Robot rb = new Robot();
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  wd.findElement(By.id("selectedEmployee_value")).sendKeys("A");
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  wd.findElement(By.id("user_name")).sendKeys("Baragi1");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@data-id='essrole']")).click();
	  Thread.sleep(2000);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@data-id='supervisorrole']")).click();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@data-id='adminrole']")).click();
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('status_0').click()");
	  Thread.sleep(2000);
	  js.executeScript("document.getElementById('status_1').click()");
	  Thread.sleep(2000);
	  wd.findElement(By.id("password")).sendKeys("Abcd@1234");
	  Thread.sleep(2000);
	  wd.findElement(By.id("confirmpassword")).sendKeys("Abcd@1234");
	  Thread.sleep(2000);
	  WebElement we = wd.findElement(By.xpath("//*[@class='modal-content ']"));
	  js.executeScript("arguments[0].scrollIntoView(true);", we);
	  Thread.sleep(2000);
	  wd.findElement(By.id("modal-save-button")).click();
  }
  @Test(priority = 4)
  public void Logout()
  {
	  wd.findElement(By.xpath("//*[text()='Log Out']")).click();
  }
  
  @Test(priority = 5)
  public void User_Login() throws InterruptedException
  {
	  wd.findElement(By.id("txtUsername")).sendKeys("Baragi");
	  wd.findElement(By.id("txtPassword")).sendKeys("Abcd@1234");
	  wd.findElement(By.xpath("//*[@type='submit']")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[text()='Log Out']")).click();
	  
  }
  @Test(priority = 6)
  public void Compare_The_User_Name()
  {
	  User_Name_1 = wd.findElement(By.xpath("//*[@class='name']")).getText();
	  System.out.println(User_Name_1);
	  assertEquals(User_Name_1, User_Name);
  }
  @AfterTest
  public void afterTest() 
  {
//	  wd.close();
  }

}
