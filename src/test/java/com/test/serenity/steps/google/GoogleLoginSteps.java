package com.test.serenity.steps.google;

import com.test.serenity.google.GoogleLoginPage;
import com.test.serenity.steps.GeneralSteps;

import net.thucydides.core.annotations.Step;

public class GoogleLoginSteps extends GeneralSteps {

    GoogleLoginPage googleLoginPage;

    @Step
    public void enterEmail(String email) {
        googleLoginPage.getEmailField().sendKeys(email);
    }

    @Step
    public void enterPassword(String password) {
        googleLoginPage.getPasswordField().sendKeys(password);
    }

    @Step
    public void clickNextEmailButton() {
        clickOnElement(googleLoginPage.getNextEmailButton());
    }

    @Step
    public void clickNextPasswordButton() {
        clickOnElement(googleLoginPage.getNextPasswordlButton());
    }

}
