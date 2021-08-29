package com.test.serenity.steps.happeo;

import com.test.serenity.happeo.HappeoLoginPage;
import com.test.serenity.steps.GeneralSteps;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends GeneralSteps {

  HappeoLoginPage loginPage;

  @Step
  public void openHappeoLoginPage() {
    loginPage.open();
  }

  @Step
  public void clickOnSignInButton() {
    clickOnElement(loginPage.getGoogleSigninButton());
  }
}
