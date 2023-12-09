package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Click {
    public static Performable on (Target target){
        WaitUntil.the(target, isCurrentlyVisible()).forNoMoreThan(5).seconds();
        return net.serenitybdd.screenplay.actions.Click.on(target);
    }

    public static Performable doubleClick(Target target) {
        WaitUntil.the(target, isCurrentlyVisible()).forNoMoreThan(5).seconds();
        return net.serenitybdd.screenplay.actions.Click.on(target);
    }
}
