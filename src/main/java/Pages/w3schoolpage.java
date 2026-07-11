package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class w3schoolpage {
    WebDriver driver;
    WebDriverWait wait;
    By country= By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr[4]/td[3]");
    public w3schoolpage(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public String getcountryvalue(){
        WebElement countryelement=wait.until(ExpectedConditions.visibilityOfElementLocated(country));
        return countryelement.getText();
    }
}
