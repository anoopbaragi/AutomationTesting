package Pages;

import org.openqa.selenium.support.PageFactory;

import Utils.Wait_Statments;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class Language_Mobilenumber extends Wait_Statments
{
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")
	MobileElement Signin;
	
	public Language_Mobilenumber()
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	public void Select_Lang()
	{
		Signin.click();
	}
}
