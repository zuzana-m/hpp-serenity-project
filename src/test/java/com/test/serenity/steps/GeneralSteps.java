package com.test.serenity.steps;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.core.pages.WebElementFacade;

public class GeneralSteps extends UIInteractionSteps{

    public void clickRandomElementFromList(List<WebElementFacade> elements) {
        int rnd = new Random().nextInt(elements.size());
        clickOnElement(elements.get(rnd));
    }

    public void clickOnElement(WebElementFacade element) {
        element(element).waitUntilVisible();
        element(element).waitUntilClickable();
        element.click();
    }
    
    public void clickElementAndWaitForPage(WebElementFacade elementToClick, String page) {
        clickOnElement(elementToClick);
        waitForCondition().until(
                ExpectedConditions.urlContains(page));
    }

    public void clickAndWaitFor(WebElementFacade elementToClick, WebElementFacade elementToWait) {
        clickOnElement(elementToClick);
        waitForCondition().until(
                ExpectedConditions.visibilityOf(elementToWait));
    }

    public void waitForElement(WebElementFacade elementToWait) {
        waitForCondition().until(ExpectedConditions.visibilityOf(elementToWait));
    }
}
