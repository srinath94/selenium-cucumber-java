package CucumberRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinition", "Support"},
        plugin = {
                "pretty",
                "html:target/CucumberHTMLReports/cucumber.html"},
        monochrome = true,
        publish=true
)
public class ElementRunner {

}
