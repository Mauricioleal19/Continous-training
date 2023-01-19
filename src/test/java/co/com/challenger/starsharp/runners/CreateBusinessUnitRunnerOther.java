package co.com.challenger.starsharp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/starsharp.feature",
        tags = "@CreateBusinessUnit",
        glue = "co.com.challenger.starsharp.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreateBusinessUnitRunnerOther {

}
