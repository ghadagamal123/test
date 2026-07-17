package Engine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class BotActions {
    Wait<WebDriver> wait;

    public BotActions(Wait<WebDriver> wait) {
        this.wait=wait;
    }

    public void Natigate(String url){
        wait.until(d -> {
            d.navigate().to(url);
            return true ;
        });

    }

    public void  AssertTitle(String Title){
        wait.until(d -> {
            Assert.assertEquals(Title, d.getTitle());
            return true ;
        });
    }


    public void  InsertText(By locator,String text){
        wait.until(d -> {
            d.findElement(locator).sendKeys(text+ Keys.ENTER);
            return true ;
        });
    }


    public void  AssertFirstResultURl(By locator){
        wait.until(d -> {
            Assert.assertEquals(d.findElement(locator).getAttribute("href"), "https://www.selenium.dev/documentation/webdriver/");
            return true ;
        });
    }

    public void  AssertSecondResultURl(By locator){
        wait.until(d -> {
            Assert.assertTrue(d.findElement(locator).getAttribute("href").contains("https://www.linkedin.com"));
            return true ;
        });
    }

    public void  ClickcheckBoxoption(By locator){
        wait.until(d -> {
           d.findElement(locator).click();
            return true ;
        });
    }

    public void  AssertCheckboxOptionIsChecked(By locator){
        wait.until(d -> {
            Assert.assertTrue(d.findElement(locator).isSelected());
            return true ;
        });
    }

   public void AssetURLEqual(String expected,String actual){
       wait.until(d -> {
          Assert.assertEquals(expected, actual);
           return true ;
       });
   }

    public void AssetLogoIsDisplayed(By locator){
        wait.until(d -> {
            Assert.assertTrue(d.findElement(locator).isDisplayed());
            return true ;
        });
    }

    public void close(){
        wait.until(d -> {
            d.close();
            return true ;
        });
    }

    public void SelectFile(By locator,String absolutePath){
        wait.until(d -> {
            d.findElement(locator).sendKeys(absolutePath);;
            return true ;
        });
    }

    public void ClickUpload(By locator){
        wait.until(d -> {
            d.findElement(locator).click();
            return true ;
        });
    }

    public void DragandDrop(By Sourcelocator,By taregtLocator){

        wait.until(d -> {
            WebElement sourceElement = d.findElement(Sourcelocator);
            WebElement targetElement = d.findElement(taregtLocator);
            Actions actions = new Actions(d);
            actions.dragAndDrop(sourceElement, targetElement).perform();
            return true ;
        });

    }


    public void AsserTextEqual(By locator,String text){
        wait.until(d -> {
            Assert.assertEquals(d.findElement(locator).getText(),text);
            return true ;
        });

    }
}

