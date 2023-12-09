package abilities.taks;

import actions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.AddRemoveUI.add;
import static ui.HomePageUI.addRemove;

public class AddElementAction implements Task {

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(addRemove),
                Click.on(add)
        );
    }

    public static AddElementAction addElementAction(){
        return instrumented(AddElementAction.class);
    }
}
