package co.com.challenger.starsharp.tasks;

import co.com.challenger.starsharp.interactions.RandomName;
import co.com.challenger.starsharp.model.createbusinessunits.BusinessUnitModel;
import co.com.challenger.starsharp.model.createbusinessunits.SetBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.challenger.starsharp.userinterface.CreateBusinessUnitPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class EnterBusinessUnit implements Task {
    BusinessUnitModel businessUnitModel;

    public EnterBusinessUnit(BusinessUnitModel businessUnitModel) {
        this.businessUnitModel = businessUnitModel;
    }

    public static EnterBusinessUnit withName(BusinessUnitModel setBusinessUnit) {
        return Tasks.instrumented(EnterBusinessUnit.class, setBusinessUnit);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        RandomName name = new RandomName();
        String nameBusinessUnit = name.name();
        actor.attemptsTo(
                WaitUntil.the(ORGANIZATION, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(ORGANIZATION),
                Click.on(BUSINESS_UNITS),
                WaitUntil.the(BUTTON_NEW_BUSINESS_UNIT, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_NEW_BUSINESS_UNIT),
                Click.on(ENTER_NAME_BUSINESS_UNIT),
                Enter.theValue(businessUnitModel.getNameBusinessunit()).into(ENTER_NAME_BUSINESS_UNIT),
                Click.on(SELECT_PARENT_UNIT),
                Click.on(SELECT_OPTION),
                Click.on(BUTTON_SAVE_BUSINESS_UNIT),
                Enter.theValue(businessUnitModel.getNameBusinessunit()).into(FIELD_SEARCH),
                WaitUntil.the(FIELD_SEARCH, isCurrentlyVisible()).forNoMoreThan(10).seconds()
        );

    }
}