package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	public static WebDriver wd;
    public String Main_URL="https://mysuru-trials79.orangehrmlive.com/auth/login";

    @BeforeSuite
    public void beforesuite()
    {
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.get(Main_URL);
        wd.manage().window().maximize();
    }
    
    @AfterSuite
    public void aftersuite()
    {
//    	wd.close();
}
}
