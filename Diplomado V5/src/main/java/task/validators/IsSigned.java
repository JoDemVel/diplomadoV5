package task.validators;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoggedPage;

public class IsSigned {
    public static boolean isSigned(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, LoggedPage.logout);
    }
}
