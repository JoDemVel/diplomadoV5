package ui;

import actions.Selectors;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddRemoveUI extends PageObject {
    public static final Target add = Selectors.byXpath("//button[.='Add Element']", "Add button");
    public static final Target remove = Selectors.byXpath("//button[@class='added-manually']", "Remove button");
}
