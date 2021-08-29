package com.test.serenity.steps.happeo;

import java.util.List;

import com.test.serenity.happeo.HappeoPagesPage;
import com.test.serenity.steps.GeneralSteps;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class HappeoPagesSteps extends GeneralSteps{

    HappeoPagesPage pagesPage;

    @Step
    public void searchForPage(String pageName) {
        pagesPage.getSearchForPages().waitUntilPresent().sendKeys(pageName);
        waitForElement(pagesPage.getFirstSearchedPage());
    }

    @Step
    public void openSearchedPage() {
        clickElementAndWaitForPage(pagesPage.getFirstSearchedPage(), "pages");
    }

    @Step
    public void clickEditbutton() {
        clickOnElement(pagesPage.getEditButton());
    }

    @Step
    public void clickManagePage() {
        clickOnElement(pagesPage.getManagePage());
    }

    @Step
    public void clickThreeDotsForFirstPage() {
        pagesPage.getAllPagesFromRightSite().get(0).waitUntilPresent()
            .findElement(By.cssSelector("universe-dropdown")).click();
        pagesPage.getRightDotsMenu().waitUntilPresent()
            .findElement(By.cssSelector("[icon=\"add-circle\"")).click();
    }

    @Step
    public void putNameForNewPage(String pageName) {
        pagesPage.getPageNameField().waitUntilPresent().sendKeys(pageName);
    }

    @Step
    public void clickCreateButton(){
        clickOnElement(pagesPage.getCreatePageButton());
    }

    @Step
    public void checkThatPageIsPresent(String expectedPageName) {
        pagesPage.getLoader().waitUntilNotVisible();
        clickOnElement(pagesPage.getManagePage().waitUntilClickable());
        Boolean isPresent = false;
        List<WebElementFacade> list = pagesPage.getAllPagesRightSideTitles();
        for (WebElementFacade element : list) {
            if (element.getText().equals(expectedPageName)) {
                isPresent = true;
            }
        }
        Assert
            .assertTrue("The page with name " + expectedPageName + " was not created", isPresent);
    }
    
}
