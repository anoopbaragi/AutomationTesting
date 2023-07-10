package Package1;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Package3.Helper;

public class User_Details extends Configaration
{
	public void Add_User() throws AWTException, InterruptedException
	{
		  Helper hlp = new Helper();
		  GetText gt = new GetText();
		  Robot rb = new Robot();
		  JavascriptExecutor js = (JavascriptExecutor)wd;
		  wd.findElement(By.id("selectedEmployee_value")).sendKeys("A");
		  hlp.Sleep();
//		  rb.keyPress(MenuKeyEvent.VK_DOWN);
//		  rb.keyPress(MenuKeyEvent.VK_DOWN);
//		  rb.keyPress(MenuKeyEvent.VK_DOWN);
//		  rb.keyPress(MenuKeyEvent.VK_ENTER);
		  gt.Expected_Data();
		  wd.findElement(By.xpath("//*[@class=\"angucomplete-wrapper\"]/descendant::span[7]")).click();
		  wd.findElement(By.id("user_name")).sendKeys("Baragi");
		  wd.findElement(By.xpath("//*[@data-id='essrole']")).click();
		  rb.keyPress(MenuKeyEvent.VK_ENTER);
		  wd.findElement(By.xpath("//*[@data-id='supervisorrole']")).click();
		  rb.keyPress(MenuKeyEvent.VK_DOWN);
		  rb.keyPress(MenuKeyEvent.VK_ENTER);
		  wd.findElement(By.xpath("//*[@data-id='adminrole']")).click();
		  rb.keyPress(MenuKeyEvent.VK_DOWN);
		  rb.keyPress(MenuKeyEvent.VK_DOWN);
		  rb.keyPress(MenuKeyEvent.VK_DOWN);
		  rb.keyPress(MenuKeyEvent.VK_ENTER);
		  js.executeScript("document.getElementById('status_0').click()");
		  js.executeScript("document.getElementById('status_1').click()");
		  wd.findElement(By.id("password")).sendKeys("Abcd@1234");
		  wd.findElement(By.id("confirmpassword")).sendKeys("Abcd@1234");
		  WebElement we = wd.findElement(By.xpath("//*[@class='modal-content ']"));
		  js.executeScript("arguments[0].scrollIntoView(true);", we);
		  wd.findElement(By.id("modal-save-button")).click();
	}
}
