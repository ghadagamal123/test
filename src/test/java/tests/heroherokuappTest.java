package tests;

import Engine.BotActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.herokuapp;

import java.util.List;

public class heroherokuappTest extends TestCase  {
    herokuapp herokuapp;
    BotActions bot;
    @Test
    public void ValidateOtion1IsSelected() {
       herokuapp = new herokuapp(bot);
       herokuapp.selectcheckbox();
       bot.AssertCheckboxOptionIsChecked(herokuapp.checkboxoption1);

    }

    @Test
    public void ValidateOtion2IsSelected() {
        bot.AssertCheckboxOptionIsChecked(herokuapp.checkboxoption2);
    }

}
