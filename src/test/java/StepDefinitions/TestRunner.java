package StepDefinitions;

import org.junit.runner.RunWith;  
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/SimpleLogin.feature",
glue={"StepDefinitions"},
monochrome=true,

plugin = {"pretty","junit:target/JUnitReports/report.xml",
		           "html:target/HtmlReports"}
) 

public class TestRunner {
//plugin = {"pretty","html:target/HtmlReports"},
//plugin = {"pretty","json:target/JSONReports/report.json"}	
}
