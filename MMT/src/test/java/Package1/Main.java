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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Main 
{
	WebDriver wd;
	String URl ="https://www.makemytrip.com/";
	String URl1="https://holidayz.makemytrip.com/holidays/india/package?id=54737&listingClassId=606&pkgType=FIT&fromCity=Bangalore&defaultPageForOnlineBookableFIT=true&affiliate=MMT&room=2%2C0%2C0%2C0%2C%2C%2C&searchDate=2023-03-18&glp=true&depDate=2023-03-24";
	
	 @BeforeTest
	  public void beforeTest() 
	 {
		 WebDriverManager.chromedriver().setup();
		 wd = new ChromeDriver();
		 wd.get(URl);
		 wd.manage().window().maximize();
	 }

  @Test
  public void main() throws InterruptedException 
  {
	  wd.findElement(By.xpath("//li[@class='menu_Holidays removeItemMargin']")).click();
	  Thread.sleep(3000);
	  Actions act = new Actions(wd);
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  /*WebElement we = wd.findElement(By.id("fromCity"));
	  act.click(we).perform();
	  Thread.sleep(3000);
	  act.sendKeys("Bang").perform();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='font14 blackText appendBottom6 autoSuggestValue']")).click();*/
	  Thread.sleep(3000);
	  WebElement we = wd.findElement(By.id("toCity"));
	  act.click(we).perform();
	  act.sendKeys("sing").perform();
	  Thread.sleep(3000);
	 // wd.findElement(By.xpath("//*[@class='dest-city-name']/[0]")).click();
	  js.executeScript("document.getElementsByClassName('dest-city-name')[0].click()");
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//div[@aria-label='Sat Mar 25 2023']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='applyBtn']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='action']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.id("search_button")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.className("skipBtn")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,2500)");
	  Thread.sleep(5000);
	  //WebElement we1 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]"));
	  //act.click(we1).perform();
	  }
  @Test(dependsOnMethods = "main")
  public void main1() throws InterruptedException
  {
	  wd.get(URl1);
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Actions act = new Actions(wd);
	  Thread.sleep(5000);
	  wd.findElement(By.className("skipBtn")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,1200)");
	  Thread.sleep(3000);
	  //wd.findElement(By.xpath("(//*[@id='change'])[3]")).click();
	  //js.executeScript("document.getElementsByClassName('hotel-row-btns')[0].click()");
	  wd.findElement(By.xpath("//div[@class='dayplan-wrapper']//div[4]//div[1]//div[1]//div[1]//div[1]//span[1]")).click();
	  Thread.sleep(3000);
	  WebDriverWait wait = new WebDriverWait(wd,35);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='modalpopup']//span[@class='close']")));
	  Thread.sleep(2000);
	  WebElement we1 = wd.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[7]/span[1]"));
	  act.moveToElement(we1);
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,1200)");
	  Thread.sleep(3000);
	  act.click(we1).perform();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//p[@class='updatePackageBtnText font10']")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-1200)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('chooseAndAddBtn').click()");
	  WebDriverWait wait1 = new WebDriverWait(wd,35);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='modalpopup']//span[@class='close']")));
	  Thread.sleep(2000);
	  WebElement we2 = wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[3]/span[1]"));
	  act.moveToElement(we2);
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,1300)");
	  Thread.sleep(3000);
	  act.click(we2).perform();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//p[contains(@class,'updatePackageBtnText font10 btn btn-primary btn-sm')]")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-1300)");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('appendRight3')[3].click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('appendRight3')[4].click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('appendRight3')[5].click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('appendRight3')[6].click()");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementsByClassName('appendRight3')[2].click()");
  }
  @AfterTest
  public void afterTest() throws InterruptedException
  {
	  Thread.sleep(3000);
	  wd.close();
  }
}
