package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.Helper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class Phone_Number extends Helper
{
	Phone_Number phnumber;
	@FindBy(id = "com.forbinary.banjararide:id/imageView_arrow")
	public WebElement Country_Code;
	
	
	public void select()
	{
//		Wait_Until_Element_Visible(Country_Code);
		Country_Code.click();
	}
}
