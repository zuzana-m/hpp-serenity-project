package com.test.serenity.stepDefinitions.happeo;

import com.test.serenity.steps.happeo.HappeoHomeSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HappeoHomeStepDefinitions {

    @Steps
    HappeoHomeSteps happeoHomeSteps;

    @When("I click channels menu button")
    public void iClickChannelsMenuButton() {
        happeoHomeSteps.openChannelMenu();
    }

    @And("I search for channel")
    public void iSearchForChannel() {
        happeoHomeSteps.searchForChannel();
    }

    @When("I open pages in menu")
    public void iOpenPagesInMenu() {
        happeoHomeSteps.openPages();
    }

}
