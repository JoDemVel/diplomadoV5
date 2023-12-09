package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterValue {
    public static Performable text (String value, Target target){
        return Enter.theValue(value).into(target);
    }

}
