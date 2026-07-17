package Pages;

import Engine.BotActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class w3schoolpage {

    public By country= By.xpath("//*[text()='Ernst Handel']/following-sibling::td[2]");
    BotActions bot;
    public w3schoolpage(BotActions bot) {
        this.bot=bot;

    }

    public void navigateToW3SchoolPage() {
        bot.Natigate("https://www.w3schools.com/html/html_tables.asp");
    }

}
