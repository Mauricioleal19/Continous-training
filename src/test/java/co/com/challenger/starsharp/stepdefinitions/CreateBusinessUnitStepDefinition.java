package co.com.challenger.starsharp.stepdefinitions;

import co.com.challenger.starsharp.model.createbusinessunits.SetBusinessUnit;
import co.com.challenger.starsharp.model.createmeeting.SetCreateMeeting;
import co.com.challenger.starsharp.model.validations.SetValidation;
import co.com.challenger.starsharp.questions.TheAnswerIsMeetingName;
import co.com.challenger.starsharp.questions.TheAnwerNameBusinessUnit;
import co.com.challenger.starsharp.tasks.CreateMeeting;
import co.com.challenger.starsharp.tasks.EnterBusinessUnit;
import co.com.challenger.starsharp.tasks.LogIn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.challenger.starsharp.utils.EnvironmentConstants.*;

public class CreateBusinessUnitStepDefinition {

    SetBusinessUnit setBusinessUnit = new SetBusinessUnit();
    SetCreateMeeting setCreateMeeting = new SetCreateMeeting();
    SetValidation setValidation = new SetValidation();

    @Before
    public void initialConfiguration(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(CLIENT).wasAbleTo(
                Open.url(URL)
        );
    }
    @Given("I want to log in to the StarSharp platform")
    public void iWantToLogInToTheStarSharpPlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogIn.withCredentials()
        );
    }
    @When("i enter information to create a business unit")
    public void iEnterInformationToCreateABusinessUnit(DataTable dataTable) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterBusinessUnit.withName(setBusinessUnit.setData(dataTable).get(0))
        );

    }
    @Then("i should see the name of the business unit in the table")
    public void iShouldSeeTheNameOfTheBusinessUnitInTheTable(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                TheAnwerNameBusinessUnit.with(setValidation.setData(dataTable).get(0))
        ));

    }
    @When("i enter information to create a meeting")
    public void iEnterInformationToCreateAMeeting(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateMeeting.withCharacteristics(setCreateMeeting.setData(dataTable).get(0))
        );

    }

    @Then("i should see the meeting created")
    public void iShouldSeeTheMeetingCreated(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                TheAnswerIsMeetingName.with(setValidation.setData(dataTable).get(0))
        ));

    }

}
