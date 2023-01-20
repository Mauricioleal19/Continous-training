package co.com.challenger.starsharp.tasks;

import co.com.challenger.starsharp.model.createmeeting.CreateMeetingModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CreateMeeting implements Task {
    CreateMeetingModel createMeetingModel;

    public CreateMeeting(CreateMeetingModel createMeetingModel) {
        this.createMeetingModel = createMeetingModel;
    }

    public static CreateMeeting withCharacteristics(CreateMeetingModel createMeetingModel) {
        return Tasks.instrumented(CreateMeeting.class,createMeetingModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );

    }
}
