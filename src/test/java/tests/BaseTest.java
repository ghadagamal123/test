package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.duckduckpage;
import pages.resultspage;

public class BaseTest {
    public WebDriver driver;
    WebDriver firefoxdriver;
    public duckduckpage duckduckpage ;
    public resultspage resultspage;


    @BeforeTest
    public void setup(){
       driver = new ChromeDriver();
      // firefoxdriver = new FirefoxDriver();

            driver.get("https://www.duckduckgo.com/");

        //firefoxdriver.get("https://www.duckduckgo.com/");


        duckduckpage =new duckduckpage(driver);
       resultspage = new resultspage(driver);


        }
        @AfterTest
        public void teardown(){
        driver.quit();
        }
    }

