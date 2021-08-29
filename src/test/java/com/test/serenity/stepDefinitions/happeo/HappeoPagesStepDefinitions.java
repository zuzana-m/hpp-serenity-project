package com.test.serenity.stepDefinitions.happeo;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.test.serenity.steps.happeo.HappeoPagesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class HappeoPagesStepDefinitions {

    @Steps
    HappeoPagesSteps pagesSteps;

    @And("I click first found page")
    public void iClickFirstFoundPage() {
        pagesSteps.openSearchedPage();
    }

    @And("I click edit button")
    public void iClickEditButton() {
        pagesSteps.clickEditbutton();
    }

    @And("I click manage button")
    public void iClickManageButton() {
        pagesSteps.clickManagePage();
    }

    @And("I click three dots button")
    public void iClickThreeDotsButton() {
        pagesSteps.clickThreeDotsForFirstPage();
    }

    @And("I click create new page button")
    public void iClickCreateNewPageButton() {
        pagesSteps.clickCreateButton();
    }

    @And("I search for page {string}")
    public void iSearchForPage(String pageName) {
        pagesSteps.searchForPage(pageName);
    }

    @And("I put {string} for new page")
    public void iPutForNewPage(String pageName) {
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        pageName = pageName + timeStamp;
        Serenity.setSessionVariable("pageName").to(pageName);
        pagesSteps.putNameForNewPage(pageName);
    }

    @Then("I see new page")
    public void iSeeNewPage() {
        String text = Serenity.sessionVariableCalled("pageName");
        pagesSteps.checkThatPageIsPresent(text);
    }
}
