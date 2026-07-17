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
    //private By firstspan =By.xpath("//*[@id=\"searchbox-suggestions\"]/div/div/div[1]");
    //private By forthspan = By.xpath("(//*[@id=\"searchbox-suggestions\"]/div/div/div[4])");
    //private By secondspan = By.xpath("(//*[@id=\"searchbox-suggestions\"]/div/div/div[2])");

    public duckduckpage(BotActions bot) {
        this.bot = bot;
    }

    public void Navigate() {
        bot.Natigate("https://duckduckgo.com/");
    }

    public void InsertValue(){
    bot.InsertSeleniumWebDriver(searchbox);

    }

    public void InsertValue2(){
        bot.InsertSeleniumWebDriver(searchbox);

    }



}
