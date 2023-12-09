package abilities.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn().the(TheInternetHomePage.class));
    }

    public static NavigateTo The_Internet_Page(){
        return instrumented(NavigateTo.class);
    }
}
