package Pages;

import Configarations.Config;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Select_Language extends Config
{	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\\\"ENGLISH\\\"))")
    protected AndroidElement select_lang;	
	
	public void language()
	{
		select_lang.click();
	}
}
