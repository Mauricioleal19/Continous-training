package co.com.challenger.starsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LogInPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Enter username")
            .located(By.id("LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Enter password")
            .located(By.id("LoginPanel0_Password"));
    public static final Target SIGN_IN_BUTTON = Target.the("Select sign in button")
            .located(By.id("LoginPanel0_LoginButton"));


}
