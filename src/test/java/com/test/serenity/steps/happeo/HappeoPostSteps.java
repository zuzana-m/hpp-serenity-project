package com.test.serenity.steps.happeo;

import com.test.serenity.happeo.HappeoPostPage;
import com.test.serenity.steps.GeneralSteps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class HappeoPostSteps extends GeneralSteps{

    private HappeoPostPage postPage;

    @Step
    public void clickRandomReaction() {
        clickOnElement(postPage.getLikeButton());
        clickRandomElementFromList(postPage.getReactionButtons());
    }

    @Step
    public void checkThatReactionIconIsVisible() {
        Assert.assertTrue(postPage.getReactionsSummary().waitUntilPresent().isVisible());
    }

}
