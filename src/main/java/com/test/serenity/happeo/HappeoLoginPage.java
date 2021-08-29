package com.test.serenity.happeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HappeoLoginPage extends PageObject {

  @FindBy(id = "signin-btn")
  private WebElementFacade googleSigninButton;

  public HappeoLoginPage(WebDriver driver) {
    super(driver);
  }

  public WebElementFacade getGoogleSigninButton() {
    return googleSigninButton;
  }

}
