package com.test.serenity.stepDefinitions.happeo;

import com.test.serenity.steps.happeo.HappeoPostSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HappeoPostStepDefinitions {

    @Steps
    HappeoPostSteps postSteps;

    @And("I add random reaction")
    public void iAddReaction() {
        postSteps.clickRandomReaction();
    }

    @Then("I see reaction on post")
    public void iSeeReaction() {
        postSteps.checkThatReactionIconIsVisible();
    }

}
