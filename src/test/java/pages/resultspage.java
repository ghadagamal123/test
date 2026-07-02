package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class resultspage {
    WebDriver driver;
    WebDriverWait wait;
    By firstresult=By.xpath("//ol[@class='react-results--main']/li[1]/article/div[3]/h2/a");
    By secondresult=By.xpath("//ol[@class='react-results--main']/li[2]/article/div[3]/h2/a");
    public resultspage(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public String geturlforfirstresult()
    {
        WebElement firstresultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(firstresult));
      return firstresultElement.getAttribute("href");
    }

   public String geturlforsecondresult()
   {
       WebElement secondresultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(secondresult));
       return secondresultElement.getAttribute("href");
   }


}
