package Package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Package1.*;

public class Helper extends Configaration
{
	public void Wait()
	{
		WebDriverWait wait = new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='ohrm_edit']")));
	}
	public void I_Wait() 
	{
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void Sleep() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
