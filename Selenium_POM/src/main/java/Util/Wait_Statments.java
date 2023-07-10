package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configaration.Config;

public class Wait_Statments extends Config
{
	public void WaitForElement(By FindBy)
	{
		WebDriverWait wait = new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
	}
	public void I_Wait() 
	{
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void Sleep() throws InterruptedException
	{
		Thread.sleep(2000);
	}
}
