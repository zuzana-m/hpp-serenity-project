package com.test.serenity.google;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleLoginPage extends PageObject {

    @FindBy(id = "identifierId")
    private WebElementFacade emailField;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElementFacade passwordField;

    @FindBy(id = "identifierNext")
    private WebElementFacade nextEmailButton;

    @FindBy(id = "passwordNext")
    private WebElementFacade nextPasswordlButton;

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getNextEmailButton() {
        return nextEmailButton;
    }

    public WebElementFacade getNextPasswordlButton() {
        return nextPasswordlButton;
    }

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }
}
