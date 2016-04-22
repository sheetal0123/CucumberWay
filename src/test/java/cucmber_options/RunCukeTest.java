package cucmber_options;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)    
@CucumberOptions(
		
		features = "src/test/java/features", 
 glue = "step_defination", 
 monochrome = true, dryRun = false,
		plugin = {
				 "pretty", "html:target/htmlreport1"
				// "pretty","json:target/jsonreport/report.json"
				//"pretty","json:target/jsonreport/report.json"
				
				
				,
		}
		)


public class RunCukeTest {

}


// "pretty", "html:target/htmlreport"
// "pretty","json:target/jsonreport/report.json"
// "pretty","junit:target/junitreport/jreport.xml",