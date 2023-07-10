package PageObjects;

import org.openqa.selenium.By;

public interface Loginpage 
{
	By UserName = By.id("txtUsername");
	By Password = By.id("txtPassword");
	By Submit = By.xpath("//*[@type='submit']");
}
