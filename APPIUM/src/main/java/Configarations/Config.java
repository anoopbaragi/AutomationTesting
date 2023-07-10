package Configarations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Config 
{
	DesiredCapabilities dc = new DesiredCapabilities();
	protected static AndroidDriver<WebElement>  androidDriver;
	
	protected void cap() throws MalformedURLException
	{
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.forbinary.banjararide");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
		androidDriver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
 }
