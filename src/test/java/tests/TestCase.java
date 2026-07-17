package tests;

import Engine.BotActions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Pages.duckduckpage;
import Pages.resultspage;

import java.time.Duration;

public abstract class TestCase {
    Wait<WebDriver> wait;
    BotActions bot ;
    @BeforeMethod
    public void setup(){
       WebDriver driver = new ChromeDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        bot=new BotActions(wait);


        }
        @AfterMethod
        public void teardown(){
        bot.close();
        }
    }

