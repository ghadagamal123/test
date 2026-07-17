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
        duckduckpage.InsertValue();
        bot.AssertFirstResultURl(resultspage.firstresult);
  }

  @Test
    public void ValidateSecondResultLink(){
        duckduckpage.InsertValue2();
        bot.AssertSecondResultURl(resultspage.secondresult);

  }


}
