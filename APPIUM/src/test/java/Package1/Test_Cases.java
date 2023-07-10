package Package1;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Pages.Phone_Number;
import Pages.Select_Language;
import Utils.Helper;
import io.appium.java_client.MobileBy;

public class Test_Cases extends Phone_Number 
{
	Select_Language select_Language = new Select_Language();
	Phone_Number number = new Phone_Number();
	
 	@Test
	public void test() throws MalformedURLException 
	{
 		cap();
 		select_Language.language();
// 		number.select();
//		System.out.println("App Launched");
//		//driver.
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.forbinary.banjararide:id/imageView_arrow"))).click();
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/editText_search")).sendKeys("India");
//		Thread.sleep(2000);
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"India (IN)\")").click();
//		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("7829726846");
//		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
//		Thread.sleep(10000);
//		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
//		Thread.sleep(2000);
//		String Data =driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").getText();
//		System.out.println(Data);
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.AccessibilityId("Open")).click();
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Logout\")")).click();
	}
	
	@AfterSuite
	public void aftersuite()
	{
		
	}
}
