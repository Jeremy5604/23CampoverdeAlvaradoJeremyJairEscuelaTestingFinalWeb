package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cart.feature",
        glue = "stepdefinitions",
        tags = "@HappyPath or @UnhappyPath",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CartRunner {
}

