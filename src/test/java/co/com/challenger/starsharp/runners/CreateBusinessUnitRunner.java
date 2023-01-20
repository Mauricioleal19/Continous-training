package co.com.challenger.starsharp.runners;

import co.com.challenger.starsharp.utils.BeforeSuite;
import co.com.challenger.starsharp.utils.CustomRunner;
import co.com.challenger.starsharp.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/starsharp.feature",
        tags = "@CreateBusinessUnit",
        glue = "co.com.challenger.starsharp.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CreateBusinessUnitRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/starsharp.feature");
    }
}
