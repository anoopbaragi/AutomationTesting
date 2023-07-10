package Utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configaration.DesireCapabilities;
import io.appium.java_client.MobileBy;

public class Wait_Statments extends DesireCapabilities
{
	public void WaitForElement(MobileBy AndroidBy )
	{
		WebDriverWait wait = new WebDriverWait(androidDriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AndroidBy));
	}
}
