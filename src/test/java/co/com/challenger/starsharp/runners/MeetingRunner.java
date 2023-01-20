package co.com.challenger.starsharp.runners;

import co.com.challenger.starsharp.utils.BeforeSuite;
import co.com.challenger.starsharp.utils.CustomRunner;
import co.com.challenger.starsharp.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/starsharp.feature",
        tags = "@CreateMeeting",
        glue = "co.com.challenger.starsharp.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class MeetingRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/starsharp.feature");
    }
}
