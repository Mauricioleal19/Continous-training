package co.com.challenger.starsharp.tasks;

import co.com.challenger.starsharp.interactions.DateMeeting;
import co.com.challenger.starsharp.interactions.RandomNumber;
import co.com.challenger.starsharp.model.createmeeting.CreateMeetingModel;
import co.com.challenger.starsharp.questions.IsDifferentMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static co.com.challenger.starsharp.userinterface.CreateMeetingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

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

       Date today = new Date();
        DateMeeting dateMeeting = new DateMeeting();
        RandomNumber number = new RandomNumber();
        String numberMeeting =String.valueOf(number.name());

        dateMeeting.dateToday();
        System.out.println("today"+dateMeeting.dateToday());


        dateMeeting.nextDay(today);
        System.out.println("Tomorrow"+dateMeeting.nextDay(today));
        System.out.println(today);
        actor.attemptsTo(
                WaitUntil.the(MEETING_MODULE, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(MEETING_MODULE),
                Click.on(MEETINGS_SUBMODULE),
                WaitUntil.the(NEW_MEETING_BUTTON, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEW_MEETING_BUTTON),
                Check.whether(IsDifferentMessage.value(TITTLE_NEW_MEETING,"New Meeting")).andIfSo(
                        Enter.theValue(createMeetingModel.getMeetingName()).into(MEETING_NAME),
                        Click.on(MEETING_TYPE),
                        Click.on(SELECT_MEETING_TYPE),
                        Enter.theValue(numberMeeting).into(NUMBER_MEETING),
                        Clear.field(STAR_DATE),
                        Click.on(STAR_DATE),
                        SendKeys.of(dateMeeting.dateToday()).into(STAR_DATE),
                        Clear.field(END_DATE),
                        Click.on(END_DATE),
                        SendKeys.of(dateMeeting.nextDay(today)).into(END_DATE),
                        Click.on(STAR_HOUR),
                        SelectFromOptions.byValue("00:00").from(STAR_HOUR),
                        Click.on(END_HOUR),
                        WaitUntil.the(END_HOUR, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                        SelectFromOptions.byValue("01:00").from(END_HOUR),
                        Click.on(SELECT_LOCATION),
                        Click.on(SELECT_LOCATION_ON_SITE),
                        Click.on(SELECT_UNIT),
                        Click.on(SELECT_UNIT_CREATED),
                        Click.on(SELECT_ORGANIZED_BY),
                        Click.on(SELECT_ORGANIZED_NAME),
                        Click.on(SELECT_REPORTER),
                        Click.on(SELECT_REPORTER_NAME),
                        Click.on(SELECT_ATTENDEE),
                        Click.on(SELECT_ATTENDEE_NAME),
                        Click.on(SAVE_BUTTON)
                ),

                WaitUntil.the(TITTLE_MEETING, isCurrentlyVisible()).forNoMoreThan(10).seconds()



        );

    }
}
