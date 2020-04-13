package cucmber_options;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)    
@CucumberOptions(
		features = "src/test/java/features", 
		glue = "step_defination", 
		tags = "hooks",
		monochrome = false, 
		dryRun = false,
		strict = false,
		plugin = {
				"pretty", "html:target/htmlreport"
				// "pretty","json:target/jsonreport/report.json"
				//"pretty","json:target/jsonreport/report.json"
				,
		}
		
)


public class RunCukeTest {

}



/*
 
features = path to feature
glue = path to glue code
monochrome = true | make console output readable 
tags = which tags to run
dryRun = true | skip the execution of glue code
strict = true | will fail execution if there are undefined or pending steps
snippets = SnippetType.CAMELCASE or SnippetType.UNDERSCORE    |  auto generated step will be in camelCase or under_score format


tags = {"@one"},
plugin = {"progress"}
plugin = {"usage"}
plugin = {"rerun"}


*/
