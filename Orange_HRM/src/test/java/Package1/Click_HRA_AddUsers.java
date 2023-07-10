package Package1;

import org.openqa.selenium.By;

import Package3.Helper;

public class Click_HRA_AddUsers extends Configaration
{
	public void HRA_Add_Users()
	{
		Helper hlp = new Helper();
		wd.findElement(By.linkText("HR Administration")).click();
		hlp.Wait();
		wd.findElement(By.xpath("//*[@class='btn-floating btn-large waves-effect waves-light']")).click();
		hlp.I_Wait();
	}
}
