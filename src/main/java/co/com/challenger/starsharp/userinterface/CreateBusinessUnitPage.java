package co.com.challenger.starsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class CreateBusinessUnitPage extends PageObject {

    public static final Target ORGANIZATION = Target.the("Deploy organization module")
            .located(By.xpath("//span[contains(.,'Organization')]"));
    public static final Target BUSINESS_UNITS = Target.the("Select business units module")
            .located(By.xpath("//span[contains(.,'Business Units')]"));
    public static final Target BUTTON_NEW_BUSINESS_UNIT = Target.the("Add a new business unit")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'New Business Unit')]"));
    public static final Target ENTER_NAME_BUSINESS_UNIT = Target.the("Enter name business unit")
            .located(By.xpath("//input[contains(@id,'Name')]"));
    public static final Target SELECT_PARENT_UNIT = Target.the("Select parent unit")
            .located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));
    public static final Target SELECT_OPTION = Target.the("Select parent unit OPTION")
            .located(By.xpath("//ul[@class='select2-results']//*[contains(text(),'Administration')]"));
    public static final Target BUTTON_SAVE_BUSINESS_UNIT = Target.the("Save business unit")
            .located(By.xpath("//span[@class='button-inner'][contains(.,'Save')]"));
    public static final Target TITTLE_BUSINESS_UNIT = Target.the("Tittle business unit")
            .located(By.xpath("//div[@class='title-text'][contains(.,'Business Units')]"));

    public static final Target FIELD_SEARCH = Target.the("Search Business Unit Created")
            .located(By.xpath("//input[contains(@title,'enter the text to search for...')]"));

    public static final Target BUSINESS_UNIT_SAVED = Target.the("Business unit saved")
            .located(By.xpath("//div[@class='slick-cell l1 r1']//*[contains(text(),'Businessunit')]"));




}

