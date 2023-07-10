package Package1;

import org.openqa.selenium.By;

import Package3.Helper;

public class Logout extends Login_Page
{
	public void Log_out() throws InterruptedException
	{
		Helper hlp = new Helper();
		hlp.Sleep();
		wd.findElement(By.xpath("//*[text()='Log Out']")).click();
	}
}
