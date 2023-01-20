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
    public static final Target TITTLE_NEW_MEETING = Target.the("tittle new meeting")
            .located(By.xpath("//div[@class='panel-titlebar-text'][contains(.,'New Meeting')]"));

    public static final Target MEETING_NAME = Target.the("Enter meeting name")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target MEETING_TYPE = Target.the("Select meeting type")
            .located(By.id("select2-chosen-6"));

    public static final Target SELECT_MEETING_TYPE = Target.the("Select meeting type")
            .located(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']//*[contains(text(),'Customer')]"));
    public static final Target NUMBER_MEETING = Target.the("Enter number meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target STAR_DATE = Target.the("Select start date")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));

    public static final Target STAR_HOUR = Target.the("Select start hour")
            .located(By.xpath("//div[@class='field StartDate col-sm-6']//select"));

    public static final Target END_DATE = Target.the("Select end date")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));

    public static final Target END_HOUR = Target.the("Select end hour")
            .located(By.xpath("//div[@class='field EndDate col-sm-6']//select"));

    public static final Target SELECT_LOCATION = Target.the("Select location")
            .located(By.id("select2-chosen-7"));
    public static final Target SELECT_LOCATION_ON_SITE = Target.the("Select location on site")
            .located(By.xpath("//ul[@class='select2-results']//*[contains(text(),'On Site')]"));

    public static final Target SELECT_UNIT = Target.the("Select Unit")
            .located(By.id("select2-chosen-8"));
    public static final Target SELECT_UNIT_CREATED = Target.the("Select Unit created")
            .located(By.xpath("//ul[@class='select2-results']//*[contains(text(),'Administration » Businessunit')]"));

    public static final Target SELECT_ORGANIZED_BY = Target.the("Select organized by")
            .located(By.id("select2-chosen-9"));
    public static final Target SELECT_ORGANIZED_NAME = Target.the("Select organized name")
            .located(By.xpath("//ul[@class='select2-results']//*[contains(text(),'Adam Edwards')]"));

    public static final Target SELECT_REPORTER = Target.the("Select reporter")
            .located(By.id("select2-chosen-10"));
    public static final Target SELECT_REPORTER_NAME = Target.the("Select reporter name")
            .located(By.xpath("//ul[@class='select2-results']//*[contains(text(),'Alexander Russell')]"));
    public static final Target SELECT_ATTENDEE = Target.the("Select attendee list")
            .located(By.id("select2-chosen-12"));
    public static final Target SELECT_ATTENDEE_NAME = Target.the("Select attendee list name")
            .located(By.xpath("//ul[@class='select2-results']//*[contains(text(),'Alexis Lopez')]"));

    public static final Target SAVE_BUTTON = Target.the("Button save")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'Save')]"));
    public static final Target TITTLE_MEETING = Target.the("Tittle meeting")
            .located(By.xpath("//div[@class='title-text'][contains(.,'Meetings')]"));

    public static final Target VALIDATE_NAME = Target.the("Validate name")
            .located(By.xpath("//div[@class='grid-canvas']//*[contains(text(),'meeting created')]"));

}
