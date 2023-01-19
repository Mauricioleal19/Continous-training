package co.com.challenger.starsharp.questions;

import co.com.challenger.starsharp.model.validations.ValidationModel;
import co.com.challenger.starsharp.userinterface.CreateBusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnwer implements Question<Boolean> {
    ValidationModel validationModel;

    public TheAnwer(ValidationModel validationModel) {
        this.validationModel = validationModel;
    }

    public static TheAnwer nameBusinessUnit(ValidationModel validationModel) {
        return new TheAnwer(validationModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String map = Text.of(CreateBusinessUnitPage.BUSINESS_UNIT_SAVED).viewedBy(actor).asString();
        return validationModel.getVerification().equals(map);
    }
}
