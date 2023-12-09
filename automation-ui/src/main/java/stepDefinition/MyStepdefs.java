package stepDefinition;

import abilities.taks.AddElementAction;
import abilities.taks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class MyStepdefs {

    @Given("the user enter to Ethernet page")
    public void theUserEnterToEthernetPage(){

    }

    @When("the user (.*) add an element")
    public void theUserSelectsTheAddRemoveOption(String user){
        OnStage.theActorCalled(user)
                .attemptsTo(NavigateTo.The_Internet_Page(),
                        AddElementAction.addElementAction());
    }

    @And("the user clicks on add option")
    public void theUserClicksOnAddOption(){

    }

    @Then("the remove button is visible")
    public void theRemoveButtonIsVisiable(){

    }

}
