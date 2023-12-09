package abilities.taks;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("page:home.page")
public class TheInternetHomePage extends PageObject {
    @Managed(uniqueSession = true)
    private WebDriver _driver = null;
}
