package TestRunner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeature"},
		glue= {"Steps"},
		dryRun=true
		)
public class RunnerTest extends AbstractTestNGCucumberTests{


}
