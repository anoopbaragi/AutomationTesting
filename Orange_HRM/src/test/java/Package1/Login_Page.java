package Package1;

import org.openqa.selenium.By;


public class Login_Page extends Configaration
{
  public void Login() 
  {
	wd.findElement(By.id("txtUsername")).sendKeys("Admin");
	wd.findElement(By.id("txtPassword")).sendKeys("RBHh7spC@8");
	wd.findElement(By.xpath("//*[@type='submit']")).click();	  
  }
  public void Login_1()
  {
	 wd.findElement(By.id("txtUsername")).sendKeys("Baragi");
	 wd.findElement(By.id("txtPassword")).sendKeys("Abcd@1234");
	 wd.findElement(By.xpath("//*[@type='submit']")).click();
  }
}
