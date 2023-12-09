package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoggedPage;
import ui.LoginFields;
import ui.SingUpFields;

public class Logout {
    public static void as(WebDriver webDriver, String email, String password){
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginFields.email, email);
        Enter.text(webDriver, LoginFields.password, password);
        Click.on(webDriver, LoginFields.checkRememberMe);
        Click.on(webDriver, LoginFields.bottomLogin);
        Click.on(webDriver, LoggedPage.logout);
    }
}
