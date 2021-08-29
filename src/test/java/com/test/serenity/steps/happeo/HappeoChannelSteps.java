package com.test.serenity.steps.happeo;

import com.test.serenity.happeo.HappeoChannelPage;
import com.test.serenity.steps.GeneralSteps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import net.thucydides.core.annotations.Step;

public class HappeoChannelSteps extends GeneralSteps{

    HappeoChannelPage channelPage;

    @Step
    public void openRandomPost() {
        waitForElement(channelPage.getPostInput());
        clickRandomElementFromList(channelPage.getPosts());
        clickElementAndWaitForPage(channelPage.getViewPostButton(), "discussion");
    }

    @Step
    public void writePost() {
        fillPostForm("new test post");
        fillModal();
        submitPost();
    }

    @Step
    public void fillPostForm(String postBody) {
        clickOnElement(channelPage.getPostInput());
        ((JavascriptExecutor)getDriver())
            .executeScript("document.getElementsByClassName(\"fr-element fr-view\")[0].innerHTML=\"\"");
        channelPage.getPostInput().typeAndEnter(postBody);
        clickOnElement(channelPage.getShareOptionsButton());
        clickOnElement(channelPage.getShareAsAnnouncementButton());

    }

    @Step
    public void fillModal() {
        clickOnElement(channelPage.getModalDropdown());
        clickOnElement(channelPage.getChooseCustomdateOption());
        clickOnElement(channelPage.getModalDateInput());
        clickOnElement(channelPage.getModalDateInput());
        clickOnElement(channelPage.getDate());
    }

    @Step
    public void submitPost() {
        clickOnElement(channelPage.getShareButton());
        clickOnElement(channelPage.getShareButton());
    }

    @Step
    public void checkThatPostIsPresent(){
        String text = channelPage.getPostDates().get(0).waitUntilPresent().getText();
        Assert.assertEquals("just now", text);
    }
}
