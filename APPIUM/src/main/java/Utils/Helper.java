package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Select_Language;

public class Helper extends Select_Language
{
	public void Wait_Until_Element_Visible(By FindBy)
	{
		WebDriverWait wait = new WebDriverWait(androidDriver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FindBy));
				
	}
}
