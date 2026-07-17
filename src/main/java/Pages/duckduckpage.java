package Pages;

import Engine.BotActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class duckduckpage {
    BotActions bot;
    public By logo= By.xpath("//a[@title='Learn about DuckDuckGo']//img)[2]");
    private By searchbox = By.id("searchbox_input");

    public duckduckpage(BotActions bot) {
        this.bot=bot;
    }

    public void Navigate() {
        bot.Natigate("https://duckduckgo.com/");
    }

    public void InsertValue(String string){
    bot.InsertText(searchbox,string);
    }


}
