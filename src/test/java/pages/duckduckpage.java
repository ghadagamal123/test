package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class duckduckpage {
    private WebDriver driver;
    private WebDriver firefoxdriver;
    private WebDriverWait wait;
    private By logo= By.xpath("//*[@id=\"__next\"]/div/div/main/article/div[1]/div[1]/div[2]/div/header/div");
    private By searchbox = By.id("searchbox_input");
    private By firstspan =By.xpath("//*[@id=\"searchbox-suggestions\"]/div/div/div[1]");
    private By forthspan = By.xpath("(//*[@id=\"searchbox-suggestions\"]/div/div/div[4])");
    private By secondspan = By.xpath("(//*[@id=\"searchbox-suggestions\"]/div/div/div[2])");

    public duckduckpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public String getTtitle() {
        String Title = driver.getTitle();
        return Title;
    }

    public Boolean logoisdisplayed(){
        WebElement logoElement =wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
     return logoElement.isDisplayed();
    }

    public void inserttextinsearchbox(){
        WebElement searchboxElement =wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
        searchboxElement.sendKeys("selenium webdriver");
    }

    public resultspage clickfirstresult(){
        WebElement firstspanElement = wait.until(ExpectedConditions.elementToBeClickable(firstspan));
        firstspanElement.click();
        return new resultspage(driver);
    }

    public void inserttestng(){
        WebElement searchboxElement =wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
        searchboxElement.sendKeys("TestNG");
    }

   public String gettext4thresult(){
       WebElement forthspanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(forthspan));
       return forthspanElement.getText();
   }

   public resultspage clickfirstspan(){
       WebElement firstspanElement = wait.until(ExpectedConditions.elementToBeClickable(firstspan));
       firstspanElement.click();
       return new resultspage(driver);
   }

    public void insertcucumebr() {
        WebElement searchboxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchbox));
        searchboxElement.sendKeys("Cucumber IO");


    }
    public resultspage clicksecondspan(){
        WebElement secondspanElement = wait.until(ExpectedConditions.elementToBeClickable(secondspan));
        secondspanElement.click();
        return new resultspage(driver);
    }
}
