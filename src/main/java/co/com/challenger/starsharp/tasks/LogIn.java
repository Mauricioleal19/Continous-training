package co.com.challenger.starsharp.tasks;


import co.com.challenger.starsharp.userinterface.LogInPage;
import co.com.challenger.starsharp.utils.EnvironmentConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.challenger.starsharp.userinterface.LogInPage.*;

public class LogIn implements Task {


    public static LogIn withCredentials() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Clear.field(INPUT_USERNAME),
                Click.on(INPUT_USERNAME),
                Enter.theValue(EnvironmentConstants.USERNAME).into(INPUT_USERNAME),
                Clear.field(INPUT_PASSWORD),
                Click.on(INPUT_PASSWORD),
                Enter.theValue(EnvironmentConstants.PASSWORD).into(INPUT_PASSWORD),
                Click.on(SIGN_IN_BUTTON)

        );


    }
}
