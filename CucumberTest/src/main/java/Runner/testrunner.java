package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ahsan\\eclipse-workspace\\CucumberTest\\src\\main\\java\\features\\Feature.feature",
		glue= {"StepDefinitions"}
//		dryRun= true
)
public class testrunner {

}
