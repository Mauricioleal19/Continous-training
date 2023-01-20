package co.com.challenger.starsharp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/starsharp.feature",
        tags = "@CreateMeeting",
        glue = "co.com.challenger.starsharp.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class MeetingRunner {

}
