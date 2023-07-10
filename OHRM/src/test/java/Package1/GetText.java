package Package1;

import org.openqa.selenium.By;

public class GetText extends Configaration
{
	public void Get_Text()
	{
		User_Name_1 =wd.findElement(By.xpath("//*[@class='name']")).getText();
		System.out.println("Actual DATA : " + User_Name_1);
	}
	public void Expected_Data()
	{
		User_Name = wd.findElement(By.xpath("//*[@class=\"angucomplete-wrapper\"]/descendant::span[7]")).getText();
		System.out.println("Expected DATA : " + User_Name);
	}
}
