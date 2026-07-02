package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class herokuapp {
    private WebDriver driver;
    private WebDriver firefoxdriver;
    private WebDriverWait wait;
    By checkboxoption = By.xpath("//form[@id=\"checkboxes\"]/input[@type=\"checkbox\"][1]");
    By check =By.xpath("//form[@id=\"checkboxes\"]/input[@type=\"checkbox\"]");
    public herokuapp(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
   public void selectcheckbox(){
       WebElement checkboxelement =wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxoption ));
       checkboxelement.click();
   }
   public List<WebElement> getcheckboxes(){
       List<WebElement> checkboxes = wait.until(
               ExpectedConditions.visibilityOfAllElementsLocatedBy(check)
       );

       return checkboxes;
   }
}
