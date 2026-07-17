package tests;

import Engine.BotActions;
import Pages.duckduckpage;
import Pages.resultspage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DuckduckTest extends TestCase {
    duckduckpage duckduckpage;
    BotActions bot ;
    resultspage resultspage;
    @Test
    public void ValidateThatTitleIsGoogle(){
        duckduckpage.Navigate();
        bot.AssertTitle("Google");

    }

  @Test
    public void ValidateFirstResult(){
        duckduckpage.InsertValue("Selenium WebDriver");
        bot.AsserURlEqual(resultspage.firstresult,"https://www.selenium.dev/documentation/webdriver/");
  }

  @Test
    public void ValidateSecondResultLink(){
        duckduckpage.InsertValue("Cucumber IO");
        bot.AssertURLcontains(resultspage.secondresult,"https://www.linkedin.com");

  }


}
