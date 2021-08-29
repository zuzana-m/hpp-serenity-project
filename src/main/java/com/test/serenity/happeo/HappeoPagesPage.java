package com.test.serenity.happeo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HappeoPagesPage extends PageObject{
    
    @FindBy(css = "[page=\"page\"]")
    private List<WebElementFacade> allPagesRightSite;

    @FindBy(css = "[page=\"page\"] .move-page--item--name")
    private List<WebElementFacade> allPagesRightSideTitles;


    @FindBy(id = "universe-dropdown--list")
    private WebElementFacade rightDotsMenu;

    @FindBy(id = "newPageModalInput")
    private WebElementFacade pageNameField;

    @FindBy(css = "[type=\"submit\"]")
    private WebElementFacade createPageSubmitButton;

    @FindBy(id = "nav-pages-search")
    private WebElementFacade searchForPages;

    @FindBy(css = "[data-position=\"0\"]")
    private WebElementFacade firstSearchedPage;

    @FindBy(css = "[data-tip=\"Edit Page\"")
    private WebElementFacade editButton;

    @FindBy(css = ".page-settings__actions-list li")
    private WebElementFacade managePage;


    @FindBy(css = "div.loader")
    private WebElementFacade loader;

    public HappeoPagesPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getFirstSearchedPage() {
        return firstSearchedPage;
    }

    public WebElementFacade getSearchForPages() {
        return searchForPages;
    }

    public WebElementFacade getEditButton() {
        return editButton;
    }

    public WebElementFacade getManagePage() {
        return managePage;
    }

    public List<WebElementFacade> getAllPagesFromRightSite() {
        return allPagesRightSite;
    }

    public WebElementFacade getRightDotsMenu() {
        return rightDotsMenu;
    }

    public WebElementFacade getPageNameField() {
        return pageNameField;
    }

    public WebElementFacade getCreatePageButton() {
    return createPageSubmitButton;
    }

    public List<WebElementFacade> getAllPagesRightSideTitles() {
        return allPagesRightSideTitles;
    }

    public WebElementFacade getLoader() {
        return loader;
    }
}
