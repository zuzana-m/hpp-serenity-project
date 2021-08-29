package com.test.serenity.stepDefinitions.happeo;

import com.test.serenity.steps.happeo.HappeoChannelSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HappeoChannelStepDefinitions {

    @Steps
    HappeoChannelSteps channelSteps;

    @And("I open random post")
    public void openRandomPost() {
        channelSteps.openRandomPost();
    }

    @And("I create post")
    public void iCreatePost() {
        channelSteps.writePost();
    }

    @Then("I see new post")
    public void iSeePost() {
        channelSteps.checkThatPostIsPresent();
    }

}
