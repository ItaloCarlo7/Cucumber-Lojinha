package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@loginEsquema",
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"json:target/reports/CucumberReports.json", "pretty"}
)
public class RunnerTest {



}
