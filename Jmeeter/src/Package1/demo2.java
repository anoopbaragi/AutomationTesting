package Package1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo2 
{
	@Test
	public void bt()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();
			wd.get("https://google.co.in");
			System.out.println(wd.getTitle());
		}

}
