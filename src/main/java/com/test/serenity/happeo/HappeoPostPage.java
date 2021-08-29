package com.test.serenity.happeo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HappeoPostPage extends PageObject {

  @FindBy(css = "[data-tracker=\"like\"]")
  private WebElementFacade likeButton;

  @FindBy(css = "[data-tracker=\"reactions-tooltip\"] a")
  private List<WebElementFacade> reactionButtons;

  @FindBy(css = "[data-tracker=\"reactions-summary\"]")
  private WebElementFacade reactionsSummary;

  public HappeoPostPage(WebDriver driver) {
    super(driver);
  }

  public WebElementFacade getLikeButton() {
    return likeButton;
  }

  public List<WebElementFacade> getReactionButtons() {
    return reactionButtons;
  }

  public WebElementFacade getReactionsSummary() {
    return reactionsSummary;
  }

}
