package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},glue = {"definition"})
public class Test_Runner extends AbstractTestNGCucumberTests
{
	
}
