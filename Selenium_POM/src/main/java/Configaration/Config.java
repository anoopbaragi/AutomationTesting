package Configaration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config 
{
	public static WebDriver wd;
	public static Properties properties;
	public String Get_Title;
    protected static String  Expected_Data;
    protected static  String Actual_Data;
	
	public Config()
	{
		properties = new Properties();
		try 
		{
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/properties/Details.properties");
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
	public static WebDriver initialization()
	{
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get(properties.getProperty("URL"));
		return wd;
	}
	
	public void CloseTheBrowser()
	{
		wd.close();
	}
}