package com.test.serenity.happeo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;


public class HappeoChannelPage extends PageObject{

    @FindBy(css = "[id*=post] button[aria-label=\"Post actions menu\"]")
    private List<WebElementFacade> posts;

    @FindBy(css = "[data-tracker=\"View post\"]")
    private WebElementFacade viewPostButton;

    @FindBy(css = ".fr-box .fr-view")
    private WebElementFacade postInput;

    @FindBy(css = "[data-tracker=\"Share options\"]")
    private WebElementFacade shareOptionsButton;

    @FindBy(css = "[data-tracker=\"Publish\"]")
    private WebElementFacade shareAsAnnouncementButton;

    @FindBy(css = ".dropdown__value-container")
    private WebElementFacade modalDropdown;

    @FindBy(css = ".DayPickerInput input")
    private WebElementFacade modalDateInput;

    @FindBy(css = ".ReactModal__Overlay button")
    private List<WebElementFacade> modalButtons;

    @FindBy(css = "#react-select-2-option-4")
    private WebElementFacade chooseCustomDateOption;

    @FindBy(css = "[aria-label=\"Mon 30 Aug 2021\"]")
    private WebElementFacade date;

    @FindBy(css = "[id*=post] > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(2)")
    private List<WebElementFacade> postDates;

    public HappeoChannelPage(WebDriver driver) {
        super(driver);
    }
    
    public List<WebElementFacade> getPosts() {
        return posts;
    }

    public WebElementFacade getViewPostButton() {
        return viewPostButton;
    }

    public WebElementFacade getPostInput() {
        return postInput;
    }

    public WebElementFacade getShareOptionsButton(){
        return shareOptionsButton;
    }

    public WebElementFacade getShareAsAnnouncementButton(){
        return shareAsAnnouncementButton;
    }


    public WebElementFacade getModalDropdown(){
        return modalDropdown;
    }


    public WebElementFacade getShareButton() {
        return modalButtons.get(1);
    }

    public WebElementFacade getModalDateInput() {
        return modalDateInput;
    }


    public WebElementFacade getChooseCustomdateOption() {
        return chooseCustomDateOption;
    }

    public WebElementFacade getDate() {
        return date;
    }

    public List<WebElementFacade> getPostDates() {
        return postDates;
    }
}
