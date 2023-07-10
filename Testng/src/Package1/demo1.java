package Package1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	WebDriver	wd;
	@Test
	public void test() throws InterruptedException 
	{
//		fail("Not yet implemented");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\New folder\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		Thread.sleep(3000);
	  	wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
		//wd.findElement(By.name("username")).sendKeys("admin");
		//wd.findElement(By.name("password")).sendKeys("admin123");
	  	wd.findElement(By.xpath("//*[@name=\'password']")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		wd.findElement(By.xpath("//*[text()='Logout']")).click();
		wd.close();
	}

}

