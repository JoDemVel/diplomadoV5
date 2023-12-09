package task.tasking;

import actions.Click;
import actions.Enter;
import actions.SelectInDrop;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginFields;
import ui.SingUpFields;

public class Login {
    public static void as(WebDriver webDriver, String email, String password){
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginFields.email, email);
        Enter.text(webDriver, LoginFields.password, password);
        Click.on(webDriver, LoginFields.checkRememberMe);
        Click.on(webDriver, LoginFields.bottomLogin);
    }
}
