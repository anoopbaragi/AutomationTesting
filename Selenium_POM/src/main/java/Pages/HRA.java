package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Wait_Statments;

public class HRA extends Wait_Statments
{
	public HRA()
	{
		super();
		PageFactory.initElements(wd, this);
	}

	@FindBy(linkText = "HR Administration")
	WebElement HR_Admin;
	
	@FindBy(xpath = "//*[text()='ohrm_edit']")
	WebElement Edit_Icon;
	
	By Edit_icon = By.xpath("//*[text()='ohrm_edit']");
	
	@FindBy(xpath = "//*[@class='btn-floating btn-large waves-effect waves-light']")
	WebElement Add_User;
	
	public void Select_HRA()
	{
		HR_Admin.click();
		WaitForElement(Edit_icon);
		Add_User.click();
	}
}
