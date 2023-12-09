package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import actions.SelectInDrop;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.SingUpFields;

public class SingUp {
    public static void as(WebDriver webDriver, String fullName, String email, String password){
        Click.on(webDriver, HomePageUI.signUPFree);
        Enter.text(webDriver, SingUpFields.fullName, fullName);
        Enter.text(webDriver, SingUpFields.email, email);
        Enter.text(webDriver, SingUpFields.password, password);
        SelectInDrop.on(webDriver, SingUpFields.timeZone, SingUpFields.timeZoneLaPazValue);
        Click.on(webDriver, SingUpFields.checkBox);
        Click.on(webDriver, SingUpFields.signUpButtom);
    }
}
