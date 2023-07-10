package Configaration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class DesireCapabilities 
{
	public static Properties properties;
	public static AndroidDriver<WebElement> androidDriver;
	
	public DesireCapabilities()
	{
		properties = new Properties();
		try 
		{
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/Data/Details.properties");
			properties.load(inputStream);
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initialization() throws MalformedURLException
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("Device_Name"));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("Platform_Name"));
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getProperty("Package"));
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, properties.getProperty("Activity"));
		androidDriver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
	}
}
