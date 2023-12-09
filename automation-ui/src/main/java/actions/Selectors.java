package actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Selectors {
    public static Target byID (String locator, String name){
        return Target.the(name).located(By.id(locator));
    }

    public static Target byXpath(String locator, String name) {
        return Target.the(name).located(By.xpath(locator));
    }

    public static Target byCss(String locator, String name) {
        return Target.the(name).located(By.cssSelector(locator));
    }
}
