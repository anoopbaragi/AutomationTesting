package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Wait_Statments;

public class Add_User extends Wait_Statments
{
	JavascriptExecutor js = (JavascriptExecutor)wd;
	@FindBy(id = "selectedEmployee_value")
	WebElement E_Name;

	@FindBy(id = "user_name")
	WebElement User_Name;

	@FindBy(xpath = "//*[@class=\"angucomplete-wrapper\"]/descendant::span[7]")
	WebElement E_Name_DrpDown;

	@FindBy(xpath = "//*[@data-id='essrole']")
	WebElement ESS_Role;

	@FindBy(id = "bs-select-1-1")
	WebElement ESS_Role_Select;

	@FindBy(xpath = "//*[@data-id='supervisorrole']")
	WebElement Supervisor_Role;

	@FindBy(id = "bs-select-2-2")
	WebElement Supervisor_Role_Selected;

	@FindBy(xpath = "//*[@data-id='adminrole']")
	WebElement Admin_Role;

	@FindBy(id = "bs-select-3-7")
	WebElement Admin_Role_Selected;

	@FindBy(id = "password")
	WebElement New_Password;

	@FindBy(id = "confirmpassword")
	WebElement Confirm_Password;

	@FindBy(xpath = "//*[@class='modal-content ']")
	WebElement Element;

	@FindBy(id = "modal-save-button")
	WebElement  Save;

	@FindBy(xpath = "//*[text()='Log Out']")
	WebElement  Logout;

	@FindBy(xpath = "//*[@class='name']")
	WebElement  Data;

	public Add_User() 
	{
		super();
		PageFactory.initElements(wd,this);
	}

	public void User_Details() throws InterruptedException
	{
		I_Wait();
		E_Name.sendKeys("A");
		Sleep();
		Expected_Data = E_Name_DrpDown.getText();
		E_Name_DrpDown.click();
		User_Name.sendKeys(properties.getProperty("un_1"));
		ESS_Role.click();
		ESS_Role_Select.click();
		Supervisor_Role.click();
		Supervisor_Role_Selected.click();
		Admin_Role.click();
		Admin_Role_Selected.click();
		js.executeScript("document.getElementById('status_0').click()");
		js.executeScript("document.getElementById('status_1').click()");
		New_Password.sendKeys(properties.getProperty("new_password"));
		Confirm_Password.sendKeys(properties.getProperty("new_password"));
		WebElement webElement = Element;
		js.executeScript("arguments[0].scrollIntoView(true);",webElement);
		Save.click();
	
	}
	public void Fetch_Details()
	{
		Actual_Data = Data.getText();
	}
}
