package com.test.serenity.happeo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HappeoHomePage extends PageObject {

    @FindBy(id = "nav-channels-button")
    private WebElementFacade channelsMenuButton;

    @FindBy(id = "nav-channels-search")
    private WebElementFacade channelSearchField;

    @FindBy(css = "[data-position=\"0\"]")
    private WebElementFacade searchResult;

    @FindBy(id = "nav-pages-button")
    private WebElementFacade pagesMenu;

    public HappeoHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getPagesMenu() {
        return pagesMenu;
    }

    public WebElementFacade getChannelsMenuButton() {
        return channelsMenuButton;
    }

    public WebElementFacade getChannelSearchField() {
        return channelSearchField;
    }

    public WebElementFacade getSearchResult() {
        return searchResult;
    }

}
