package com.test.serenity.stepDefinitions.google;

import com.test.serenity.steps.google.GoogleLoginSteps;
import com.test.serenity.steps.happeo.LoginSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;

public class GoogleLoginStepDefinitions {

    private EnvironmentVariables environmentVariables;

    @Steps
    GoogleLoginSteps googleSearchSteps;

    @Steps
    LoginSteps happeoLoginSteps;

    @Then("I enter email")
    public void iEnterEmail() {
        googleSearchSteps.enterEmail("interview-zuzana@apps.fi");
    }

    @And("I enter password")
    public void iEnterPassword() {
        googleSearchSteps.enterPassword("hM<HZS98");
    }

    @And("I click email next button")
    public void iClickEmailNextButton() {
        googleSearchSteps.clickNextEmailButton();
    }

    @And("I click password next button")
    public void iClickPasswordNextButton() { googleSearchSteps.clickNextPasswordButton();}

    @Then("I enter email {string}")
    public void iEnterEmail(String email) {
        googleSearchSteps.enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        googleSearchSteps.enterPassword(password);
    }

    @And("I sign in")
    public void iSignIn() {
        String email = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("user.email");

        String pass = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("user.pass");
        happeoLoginSteps.clickOnSignInButton();
        googleSearchSteps.enterEmail(email);
        googleSearchSteps.clickNextEmailButton();
        googleSearchSteps.enterPassword(pass);
        googleSearchSteps.clickNextPasswordButton();
    }

}
