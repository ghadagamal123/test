package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.w3schoolpage;

public class w3schoolsTest extends BaseTest {

    @Override
    @BeforeMethod
    public void setup() {
        // 1. Still call the driver setup if you have a separate init method,
        // or recreate the initialization manually to overwrite behavior:
        driver = new ChromeDriver();

        // 2. Overwrite the navigation completely here
        driver.get("https://www.w3schools.com/html/html_tables.asp");
    }

    @Test
    public void testCustomNavigation() {
    w3schoolpage w3schoolpage = new w3schoolpage(driver);
        String countryValue = w3schoolpage.getcountryvalue();
        System.out.println("Country Value: " + countryValue);
        Assert.assertTrue(countryValue.equals("Austria"));

    }

}
