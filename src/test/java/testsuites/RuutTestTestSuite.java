package testsuites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ="src/test/resources/features/RuutTest.feature",
        glue = "src/test/java/steps",
        dryRun = true
)
public class RuutTestTestSuite {
}
