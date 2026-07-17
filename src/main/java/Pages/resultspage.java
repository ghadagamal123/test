package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class resultspage {
    WebDriver driver;
    WebDriverWait wait;
   public By firstresult=By.xpath("(//a[@data-testid='result-title-a'])[1]");
   public  By secondresult=By.xpath("(//a[@data-testid='result-title-a']/span)[4]");





}
