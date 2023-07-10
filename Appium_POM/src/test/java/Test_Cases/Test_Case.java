package Test_Cases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configaration.DesireCapabilities;
import Pages.Language_Mobilenumber;

public class Test_Case extends DesireCapabilities
{
	Language_Mobilenumber language_Mobilenumber;
	
	public Test_Case()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws MalformedURLException
	{
		initialization();
		language_Mobilenumber = new Language_Mobilenumber();
	}
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("banjararide opened");
		language_Mobilenumber.Select_Lang();
	}
}
