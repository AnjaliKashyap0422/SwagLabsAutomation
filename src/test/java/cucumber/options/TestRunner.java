package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue={"stepDefination","utilitiesofPro"},tags= "@Reg2",
plugin= "json:target/jsonReports/testreport.json")
public class TestRunner {

}
