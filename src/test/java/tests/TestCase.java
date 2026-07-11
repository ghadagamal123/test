package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Pages.duckduckpage;
import Pages.resultspage;

public abstract class TestCase {
    public WebDriver driver;
    WebDriver firefoxdriver;
    public duckduckpage duckduckpage ;
    public resultspage resultspage;


    @BeforeMethod
    public void setup(){
       driver = new ChromeDriver();


        }
        @AfterMethod
        public void teardown(){
        driver.quit();
        }
    }

