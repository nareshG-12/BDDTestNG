package cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin=	{"pretty",
			"html:target/cucumber-reports/cucumber.html",
			"json:target/cucumber-reports/cucumber.json"
			
		},
	features= {"resource/cucumber/features"},
	glue= {"cucumber.Runner.StepsDefinitions"}
		
		)



public class TestRunner  extends AbstractTestNGCucumberTests{
	
	

}
