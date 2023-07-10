package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest
{
	WebDriver wd;
	String URl ="https://www.makemytrip.com/";
	
	@BeforeTest
	  public void beforeTest() 
	{
		WebDriverManager.chromiumdriver().setup();
		wd = new ChromeDriver();
		wd.get(URl);
		wd.manage().window().maximize();
	}
  @Test(enabled = false)
  public void f() throws InterruptedException 
  {
	  wd.findElement(By.xpath("//li[@class='menu_Holidays removeItemMargin']")).click();
	  Thread.sleep(3000);
		Actions act = new Actions(wd);
		JavascriptExecutor js = (JavascriptExecutor)wd;
	 /* WebElement we = wd.findElement(By.id("fromCity"));
	  act.click(we).perform();
	  Thread.sleep(3000);
	  act.sendKeys("Bang").perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='font14 blackText appendBottom6 autoSuggestValue']")).click();
	//test.log(Status.PASS, "from city selected");*/
	  Thread.sleep(3000);
	  WebElement we1 = wd.findElement(By.id("toCity"));
	  act.click(we1).perform();
	  act.sendKeys("sing").perform();
	  Thread.sleep(3000);
	 // wd.findElement(By.xpath("//*[@class='dest-city-name']/[0]")).click();
	  js.executeScript("document.getElementsByClassName('dest-city-name')[0].click()");
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//div[@aria-label='Sat Mar 18 2023']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='applyBtn']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='action']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.id("search_button")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='skipBtn']")).click();
	  //js.executeScript("window.scrollTo(0,1000)");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
	  wd.findElement(By.xpath("//*[@id=\"modalpopup\"]/div/span")).click();
	  js.executeScript("window.scrollTo(0,600)");
	  wd.findElement(By.xpath("//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[7]/span[1]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//p[contains(text(),'Update Package')]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='chooseAndAddBtn'][1]")).click();
	  js.executeScript("window.scrollTo(0,800)");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[3]/span[1]")).click();
	  wd.findElement(By.xpath("//p[contains(text(),'Update Package')]")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
