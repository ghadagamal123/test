package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DuckduckTest extends BaseTest {
    @Test
    public void task1gettitle(){
        String title= duckduckpage.getTtitle();
        Assert.assertEquals(title , "google");
    }

    @Test
    public void task2checkiflogoexsits(){
        Assert.assertTrue(duckduckpage.logoisdisplayed());
    }

  @Test
    public void task3getforthtext(){
     duckduckpage.inserttextinsearchbox();
     duckduckpage.clickfirstspan();
     Assert.assertEquals(resultspage.geturlforfirstresult(),"https://www.selenium.dev/documentation/webdriver/");
  }

  @Test
    public void task4(){
        duckduckpage.inserttestng();
        Assert.assertEquals(duckduckpage.gettext4thresult(),"TestNG Tutorial");

  }

  @Test
    public void task5(){
        duckduckpage.insertcucumebr();
        duckduckpage.clicksecondspan();
        Assert.assertTrue(resultspage.geturlforsecondresult().contains("https://www.linkedin.com"));
  }



}
