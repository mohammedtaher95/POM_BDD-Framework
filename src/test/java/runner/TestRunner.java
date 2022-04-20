package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features = "src/test/java/features", glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-  report.json"})
public class TestRunner extends TestBase {
}
