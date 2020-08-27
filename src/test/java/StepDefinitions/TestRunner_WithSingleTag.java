package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithTags/Tags.feature",
glue={"StepDefinitions"},

//tags= {"(@smoke or @important"}
//tags= {"@important"}
//tags= {"(@smoke and @regression) or @important"}

tags= {"@mustRun"}


) 

public class TestRunner_WithSingleTag {

}
