package Pages;

import Engine.BotActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class herokuapp {
    BotActions bot;
    public By checkboxoption1 = By.xpath("(//input)[1]");
    public By checkboxoption2 =By.xpath("\"(//input)[2]\"");

    public herokuapp(BotActions bot) {
        this.bot = bot;
    }
   public void selectcheckbox(){
       bot.ClickcheckBoxoption(checkboxoption1);
   }

}
