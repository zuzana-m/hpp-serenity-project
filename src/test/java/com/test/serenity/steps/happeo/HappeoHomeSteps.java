package com.test.serenity.steps.happeo;

import com.test.serenity.happeo.HappeoHomePage;
import com.test.serenity.steps.GeneralSteps;

import net.thucydides.core.annotations.Step;

public class HappeoHomeSteps  extends GeneralSteps  {

    HappeoHomePage homePage;

    @Step
    public void openChannelMenu() {
        clickANdWaitFor(homePage.getChannelsMenuButton(), homePage.getChannelSearchField());
    }

    @Step
    public void searchForChannel() {
        homePage.getChannelSearchField().waitUntilPresent().sendKeys("Interview Channel");
        clickElementAndWaitForPage(homePage.getSearchResult(), "channels");
    }

    @Step
    public void openPages() {
        clickOnElement(homePage.getPagesMenu());
    }
}
    
