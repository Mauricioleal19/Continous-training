package co.com.challenger.starsharp.questions;

import co.com.challenger.starsharp.model.validations.ValidationModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.challenger.starsharp.userinterface.CreateMeetingPage.VALIDATE_NAME;

public class TheAnswerIsMeetingName implements Question<Boolean> {
    ValidationModel validationModel;

    public TheAnswerIsMeetingName(ValidationModel validationModel) {
        this.validationModel = validationModel;
    }

    public static TheAnswerIsMeetingName with(ValidationModel validationModel) {
        return new TheAnswerIsMeetingName(validationModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String map = Text.of(VALIDATE_NAME).viewedBy(actor).asString();
        String feature = validationModel.getVerificationCreateMeeting();
        return map.equals(feature);
    }
}
