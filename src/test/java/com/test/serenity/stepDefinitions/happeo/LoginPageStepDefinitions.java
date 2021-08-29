package com.test.serenity.stepDefinitions.happeo;

import com.test.serenity.steps.happeo.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginPageStepDefinitions {

    @Steps
    LoginSteps happeoLoginSteps;

    @Given("I open happeo login page")
    public void iOpenHappeoLoginPage() {
        happeoLoginSteps.openHappeoLoginPage();
    }

    @When("I click on google sign in button")
    public void iClickOnGoogleSignInButton() {
        happeoLoginSteps.clickOnSignInButton();
    }
}
