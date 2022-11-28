package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:/EclipseNewWorkspace/CucumberJava/Features/customers.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:D:/EclipseNewWorkspace/CucumberJava/target/HTmlReport"})
public class testRunner {

}
