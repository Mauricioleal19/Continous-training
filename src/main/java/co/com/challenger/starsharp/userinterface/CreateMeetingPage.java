package co.com.challenger.starsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMeetingPage extends PageObject {
    public static final Target MEETING_MODULE = Target.the("Select meeting module")
            .located(By.xpath("(//span[contains(.,'Meeting')])[1]"));
    public static final Target MEETINGS_SUBMODULE = Target.the("Select meetings submodule")
            .located(By.xpath("//span[contains(.,'Meetings')]"));
    public static final Target NEW_MEETING_BUTTON = Target.the("Create a new meeting")
            .located(By.xpath("//span[contains(.,'New Meeting')]"));
    public static final Target MEETING_NAME = Target.the("Enter meeting name")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target MEETING_TYPE = Target.the("Select meeting type")
            .located(By.id("select2-chosen-6"));
    public static final Target STAR_DATE = Target.the("Select start date")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));

    public static final Target STAR_HOUR = Target.the("Select start hour")
            .located(By.xpath("//select[contains(@aria-invalid,'false')]"));

    public static final Target END_DATE = Target.the("Select end date")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));

    public static final Target END_HOUR = Target.the("Select end hour")
            .located(By.xpath("(//select[contains(@aria-invalid,'false')])[2]"));
    public static final Target NUMBER_MEETING = Target.the("Enter number meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target SELECT_LOCATION = Target.the("Select location")
            .located(By.id("select2-chosen-7"));
    public static final Target SELECT_UNIT = Target.the("Select Unit")
            .located(By.id("select2-chosen-8"));
    public static final Target SELECT_ORGANIZED_BY = Target.the("Select organized by")
            .located(By.id("select2-chosen-9"));
    public static final Target SELECT_REPORTER = Target.the("Select reporter")
            .located(By.id("select2-chosen-10"));
    public static final Target SELECT_ATTENDEE = Target.the("Select reporter")
            .located(By.id("select2-chosen-12"));
    public static final Target SAVE_BUTTON = Target.the("Button save")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'Save')]"));

}
