package ui;

import actions.Selectors;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI extends PageObject {
    public static final Target addRemove = Selectors.byXpath("//a[.='Add/Remove Elements']","AddRemove option");
}
